package com.arm.mbed.cloud.sdk;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiUtils;
import com.arm.mbed.cloud.sdk.common.CallLogLevel;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.testserver.Engine;
import com.arm.mbed.cloud.sdk.testserver.Logger;
import com.arm.mbed.cloud.sdk.testserver.cache.InstanceCache;
import com.arm.mbed.cloud.sdk.testserver.cache.MissingInstanceException;
import com.arm.mbed.cloud.sdk.testserver.cache.ServerCacheException;
import com.arm.mbed.cloud.sdk.testserver.internal.model.APIMethodResult;
import com.arm.mbed.cloud.sdk.testserver.internal.model.ModuleInstance;
import com.arm.mbed.cloud.sdk.testserver.internal.model.UnknownAPIException;
import com.arm.mbed.cloud.sdk.testserver.model.ApiResult;
import com.arm.mbed.cloud.sdk.testserver.model.ErrorMessage;
import com.arm.mbed.cloud.sdk.testserver.model.Instance;
import com.arm.mbed.cloud.sdk.testserver.model.InstanceConfiguration;
import com.arm.mbed.cloud.sdk.testserver.model.SdkApiParameters;
import com.arm.mbed.cloud.sdk.testutils.APICallException;
import com.arm.mbed.cloud.sdk.testutils.Serializer;

import io.netty.handler.codec.http.QueryStringDecoder;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

@Preamble(description = "Test system server part in charge of carrying out a mapping of the APIs present in the SDK and invoking them when requested by the client")
public class TestServer {

    private static final String TEST_ARGS_KEY = "args";
    private static final String CONTENT_TYPE_HEADER = "content-type";
    private static final String APPLICATION_JSON = "application/json";
    private static final String ENVVAR_MBED_CLOUD_HOST = "MBED_CLOUD_HOST";
    private static final String ENVVAR_MBED_CLOUD_API_KEY = "MBED_CLOUD_API_KEY";
    private static final String ENVVAR_HTTP_LOG_LEVEL = "HTTP_LOG_LEVEL";
    private static final String PARAM_METHOD = "method";
    private static final String PARAM_MODULE = "module";
    private static final String PARAM_INSTANCE = "instance";

    private final int port = 5000;
    private HttpServer server;
    private Router router;
    private Engine engine;
    private Logger logger = new Logger();

    private ConnectionOptions defaultConnectionConfiguration;

    private interface ServerAction {
        Object execute() throws Exception;
    }

    public void start() {
        if (server == null) {
            Vertx vertx = Vertx
                    .vertx(new VertxOptions().setWorkerPoolSize(40).setBlockedThreadCheckInterval(1000L * 60L * 10L)
                            .setMaxWorkerExecuteTime(1000L * 1000L * 1000L * 60L * 10L));
            HttpServerOptions options = new HttpServerOptions();
            options.setMaxInitialLineLength(HttpServerOptions.DEFAULT_MAX_INITIAL_LINE_LENGTH * 2);
            server = vertx.createHttpServer(options);
            router = Router.router(vertx);
            engine = new Engine(logger, new InstanceCache(vertx));
        }
        retrieveConfig();
        // Route registration
        router.route().handler(BodyHandler.create());
        defineInitialisationRoute();
        definePingRoute();
        defineResetRoute();
        defineShutdownRoute();
        defineListModulesRoute();
        defineListModuleInstancesRoute();
        defineCreateModuleInstanceRoute();
        defineListInstancesRoute();
        defineGetInstanceRoute();
        defineDeleteInstanceRoute();
        defineListInstanceMethodsRoute();
        defineRunInstanceMethodRoute();
        defineModuleMethodTestRoute();
        logWelcomeMessage();
        try {
            engine.initialise();
        } catch (ServerCacheException e) {
            e.printStackTrace();
        }
        logger.logInfo("Java SDK test server listening to port " + String.valueOf(port) + "...");
        server.requestHandler(router::accept).listen(port);

    }

    // TODO remove when not used anymore
    private void defineInitialisationRoute() {
        Route route = router.route(HttpMethod.GET, "/_init").produces(APPLICATION_JSON);
        route.handler(routingContext -> {
            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return null;
                }
            }, false);
        });
    }

    private void definePingRoute() {
        Route route = router.route(HttpMethod.GET, "/ping").produces(APPLICATION_JSON);
        route.handler(routingContext -> {
            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.ping();
                }
            }, false);
        });
    }

    private void defineResetRoute() {
        Route route = router.route(HttpMethod.POST, "/reset").produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            execute(205, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    engine.reset();
                    return null;
                }
            }, false);
        });
    }

    private void defineShutdownRoute() {
        Route route = router.route(HttpMethod.POST, "/shutdown").produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            execute(202, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    engine.shutdown();
                    return null;
                }
            }, false);
            System.exit(0);
        });
    }

    private void defineListModulesRoute() {
        Route route = router.route(HttpMethod.GET, "/modules").produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.listModules().stream().map(m -> ApiUtils.convertCamelToSnake(m))
                            .collect(Collectors.toList());
                }
            }, false);
        });
    }

    private void defineListModuleInstancesRoute() {
        Route route = router.route(HttpMethod.GET, "/modules/:" + PARAM_MODULE + "/instances")
                .produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            String moduleId = routingContext.request().getParam(PARAM_MODULE);

            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.listModuleInstances(moduleId).stream().map(m -> m.toInstance())
                            .collect(Collectors.toList());
                }
            }, false);
        });
    }

    private void defineCreateModuleInstanceRoute() {
        Route route = router.route(HttpMethod.POST, "/modules/:" + PARAM_MODULE + "/instances")
                .produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            String moduleId = routingContext.request().getParam(PARAM_MODULE);

            ConnectionOptions opts = retrieveConnectionOptions(routingContext.getBodyAsString());

            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.createInstance(moduleId, opts).toInstance();
                }
            }, false);
        });
    }

    private void defineListInstancesRoute() {
        Route route = router.route(HttpMethod.GET, "/instances").produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {

            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.listAllModuleInstances().stream().map(m -> m.toInstance())
                            .collect(Collectors.toList());
                }
            }, false);
        });
    }

    private void defineGetInstanceRoute() {
        Route route = router.route(HttpMethod.GET, "/instances/:" + PARAM_INSTANCE).produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            String instanceId = routingContext.request().getParam(PARAM_INSTANCE);
            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.fetchInstance(instanceId).toInstance();
                }
            }, false);
        });
    }

    private void defineDeleteInstanceRoute() {
        Route route = router.route(HttpMethod.DELETE, "/instances/:" + PARAM_INSTANCE).produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            String instanceId = fetchInstanceId(routingContext.request().getParam(PARAM_INSTANCE));
            execute(200, routingContext, new ServerAction() {

                @SuppressWarnings("boxing")
                @Override
                public Object execute() throws Exception {
                    return engine.deleteInstance(instanceId);
                }
            }, false);
        });
    }

    private void defineListInstanceMethodsRoute() {
        Route route = router.route(HttpMethod.GET, "/instances/:" + PARAM_INSTANCE + "/methods")
                .produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            String instanceId = routingContext.request().getParam(PARAM_INSTANCE);
            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    return engine.listInstanceMethods(instanceId).stream().map(m -> m.toSdkApi())
                            .collect(Collectors.toList());
                }
            }, false);
        });
    }

    private void defineRunInstanceMethodRoute() {
        Route route = router.route(HttpMethod.POST, "/instances/:" + PARAM_INSTANCE + "/methods/:" + PARAM_METHOD)
                .produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {
            HttpServerRequest request = routingContext.request();
            String instanceId = request.getParam(PARAM_INSTANCE);
            String methodId = request.getParam(PARAM_METHOD);
            Map<String, Object> methodArgs = fetchMethodArgs(routingContext.getBodyAsString());
            execute(200, routingContext, new ServerAction() {

                @Override
                public Object execute() throws Exception {
                    logger.logInfo("TEST http://localhost:" + String.valueOf(port) + request.uri() + " AT "
                            + new Date().toString());
                    APIMethodResult result = engine.callAPIOnInstance(instanceId, methodId, methodArgs);
                    if (!result.wasExceptionRaised()) {
                        return result.getResult();
                    }
                    logger.logDebug("RESULT error happened: " + result.getMetadata());
                    throw new APICallException(result);
                }
            }, true);
        });
    }

    // TODO Remove when not needed anymore
    @SuppressWarnings("boxing")
    private void defineModuleMethodTestRoute() {
        Route route = router.route(HttpMethod.GET, "/:" + PARAM_MODULE + "/:" + PARAM_METHOD + "*")
                .produces(APPLICATION_JSON);
        route.blockingHandler(routingContext -> {

            HttpServerRequest request = routingContext.request();
            String module = request.getParam(PARAM_MODULE);
            String method = request.getParam(PARAM_METHOD);

            Map<String, Object> params = retrieveQueryParameters(request);
            logger.logInfo(
                    "TEST http://localhost:" + String.valueOf(port) + request.uri() + " AT " + new Date().toString());
            ModuleInstance instance = null;
            try {
                instance = engine.createInstance(module, defaultConnectionConfiguration);
                APIMethodResult result = engine.callAPIOnInstance(instance.getId(), method, params);
                if (!result.wasExceptionRaised()) {
                    String resultJson = Serializer.convertLegacyResultToJson(result.getResult());
                    logger.logDebug("RESULT: " + String.valueOf(resultJson));
                    engine.deleteInstance(instance.getId());
                    respond(200, routingContext, resultJson);
                } else {
                    engine.deleteInstance(instance.getId());
                    logger.logDebug("RESULT error happened: " + result.getMetadata());
                    if (result.getMetadata() == null) {
                        sendError(setResponse(500, routingContext), null,
                                (result.getException().getMessage() == null)
                                        ? "Exception of type " + result.getException() + " was raised"
                                        : result.getException().getMessage());
                    } else {
                        sendError(setResponse(500, routingContext), result.getMetadata().getStatusCode(),
                                "An error occurred during call. Call metadata: " + result.getMetadata().toString());
                    }
                }

            } catch (UnknownAPIException | APICallException | ServerCacheException e) {
                if (instance != null) {
                    try {
                        engine.deleteInstance(instance.getId());
                    } catch (ServerCacheException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                sendError(setResponse(500, routingContext), null,
                        (e.getMessage() == null) ? "Exception of type " + e + " was raised" : e.getMessage());
            }
        });
    }

    /**
     * Safeguard in case a user specifies the whole instance description in the request rather than just setting the
     * instance id.
     * 
     * @param instanceIdAsString
     *            string that should be the instance id but may be corrupted.
     * @return the instance id
     */
    private String fetchInstanceId(String instanceIdAsString) {
        try {
            Instance instance = Serializer.convertStringToObject(instanceIdAsString, Instance.class);
            instanceIdAsString = instance.getId();
        } catch (Exception e) {
            // Nothing to do
        }
        return instanceIdAsString;
    }

    private Map<String, Object> fetchMethodArgs(String bodyAsString) {

        if (bodyAsString == null || bodyAsString.isEmpty()) {
            return new LinkedHashMap<>();
        }
        return new JsonObject(bodyAsString).mapTo(SdkApiParameters.class);
    }

    private ConnectionOptions retrieveConnectionOptions(String bodyAsString) {
        if (bodyAsString == null || bodyAsString.isEmpty()) {
            logger.logWarn(
                    "The test server did not receive any connection configuration. Defaulting to test server configuration.");
            return defaultConnectionConfiguration;
        }
        InstanceConfiguration conf = null;
        try {
            conf = Serializer.convertStringToObject(bodyAsString, InstanceConfiguration.class);
        } catch (Exception e) {
            logger.logWarn("The test server could not interpret instance configuration properly: [" + bodyAsString
                    + "]. Defaulting to test server configuration.");
            return defaultConnectionConfiguration;
        }
        ConnectionOptions opts = new ConnectionOptions(conf.getApiKey(), conf.getHost());
        if (opts.isApiKeyEmpty()) {
            logger.logWarn("The test server could not find the API key configuration in the request: [" + bodyAsString
                    + "]. Defaulting to test server configuration.");
            return defaultConnectionConfiguration;
        }
        opts.setAutostartDaemon(
                TranslationUtils.toBool(conf.isAutostartDaemon(), defaultConnectionConfiguration.isAutostartDaemon()));
        opts.setClientLogLevel(defaultConnectionConfiguration.getClientLogLevel());
        opts.setRequestTimeout(defaultConnectionConfiguration.getRequestTimeout());
        return opts;
    }

    private void execute(int successfulStatusCode, RoutingContext ctx, ServerAction action, boolean enclosePayload) {
        try {
            Object result = action.execute();
            result(successfulStatusCode, ctx, result, enclosePayload);
        } catch (UnknownAPIException | MissingInstanceException e) {
            ErrorMessage message = generateErrorMessage(e);
            error(404, ctx, message);
        } catch (Exception e) {
            ErrorMessage message = generateErrorMessage(e);
            error(500, ctx, message);
        }
    }

    private ErrorMessage generateErrorMessage(Exception e) {
        ErrorMessage message = new ErrorMessage();
        message.setMessage(e.getMessage());
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        message.setTraceback(sw.toString());
        return message;
    }

    private void error(int statusCode, RoutingContext routingContext, ErrorMessage message) {
        logger.logWarn(String.valueOf(statusCode) + ": " + message);
        JsonObject messageObj = (message == null) ? new JsonObject() : JsonObject.mapFrom(message);
        respond(statusCode, routingContext, messageObj.encode());
    }

    private void result(int statusCode, RoutingContext routingContext, Object result, boolean enclosePayload) {
        Object resultObj = Serializer.convertResultToJsonObject(result, true);
        if (enclosePayload) {
            ApiResult apiResult = new ApiResult();
            apiResult.setPayload(resultObj);
            resultObj = Serializer.convertResultToJsonObject(apiResult, true);
        }
        final String resultJson = Serializer.convertJsonResultToJsonString(resultObj);
        logger.logInfo("RESULT: " + String.valueOf(resultJson));
        respond(statusCode, routingContext, resultJson);
    }

    private void respond(int statusCode, RoutingContext routingContext, String response) {
        HttpServerResponse httpResponse = setResponse(statusCode, routingContext);
        if (response == null) {
            httpResponse.end();
        } else {
            httpResponse.end(response);
        }
    }

    private HttpServerResponse setResponse(int statusCode, RoutingContext routingContext) {
        return routingContext.response().putHeader(CONTENT_TYPE_HEADER, APPLICATION_JSON).setStatusCode(statusCode);
    }

    private void retrieveConfig() {
        defaultConnectionConfiguration = new ConnectionOptions(System.getenv(ENVVAR_MBED_CLOUD_API_KEY),
                System.getenv(ENVVAR_MBED_CLOUD_HOST));
        defaultConnectionConfiguration.setClientLogLevel(CallLogLevel.getLevel(System.getenv(ENVVAR_HTTP_LOG_LEVEL)));
        // logger.logInfo("Default config:");
        // logger.logInfo(JsonObject.mapFrom(defaultConnectionConfiguration).encodePrettily());
    }

    public void logWelcomeMessage() {
        logger.logInfo("");
        logger.logInfo("██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗");
        logger.logInfo("╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝");
        logger.logInfo("                                                                                       ");
        logger.logInfo("                 ██╗ █████╗ ██╗   ██╗ █████╗     ███████╗██████╗ ██╗  ██╗              ");
        logger.logInfo("                 ██║██╔══██╗██║   ██║██╔══██╗    ██╔════╝██╔══██╗██║ ██╔╝              ");
        logger.logInfo("                 ██║███████║██║   ██║███████║    ███████╗██║  ██║█████╔╝               ");
        logger.logInfo("            ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║    ╚════██║██║  ██║██╔═██╗               ");
        logger.logInfo("            ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║    ███████║██████╔╝██║  ██╗              ");
        logger.logInfo("             ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚══════╝╚═════╝ ╚═╝  ╚═╝              ");
        logger.logInfo("                                                                                       ");
        logger.logInfo("████████╗███████╗███████╗████████╗    ███████╗███████╗██████╗ ██╗   ██╗███████╗██████╗ ");
        logger.logInfo("╚══██╔══╝██╔════╝██╔════╝╚══██╔══╝    ██╔════╝██╔════╝██╔══██╗██║   ██║██╔════╝██╔══██╗");
        logger.logInfo("   ██║   █████╗  ███████╗   ██║       ███████╗█████╗  ██████╔╝██║   ██║█████╗  ██████╔╝");
        logger.logInfo("   ██║   ██╔══╝  ╚════██║   ██║       ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██╔══╝  ██╔══██╗");
        logger.logInfo("   ██║   ███████╗███████║   ██║       ███████║███████╗██║  ██║ ╚████╔╝ ███████╗██║  ██║");
        logger.logInfo("   ╚═╝   ╚══════╝╚══════╝   ╚═╝       ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═╝");
        logger.logInfo("");
        logger.logInfo("");
        logger.logInfo("");
        logger.logInfo("██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗██╗");
        logger.logInfo("╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝");
    }

    public static void main(String[] args) {
        TestServer server = new TestServer();
        server.start();
    }

    // TODO Remove when not needed anymore
    private Map<String, Object> retrieveQueryParameters(HttpServerRequest request) {
        MultiMap map = request.params();
        Map<String, Object> params = new LinkedHashMap<>();
        for (Entry<String, String> element : map.entries()) {
            if (!element.getKey().equalsIgnoreCase(PARAM_MODULE) && !element.getKey().equalsIgnoreCase(PARAM_METHOD)) {
                if (element.getKey().equalsIgnoreCase(TEST_ARGS_KEY)) {
                    QueryStringDecoder queryStringDecoder = new QueryStringDecoder("/?" + element.getValue());
                    Map<String, List<String>> prms = queryStringDecoder.parameters();
                    if (!prms.isEmpty()) {
                        for (Map.Entry<String, List<String>> entry : prms.entrySet()) {
                            if (entry.getValue() == null || entry.getValue().isEmpty()) {
                                logger.logWarn("Argument [" + String.valueOf(entry.getKey())
                                        + "] has no value. It will be ignored");
                            } else if (entry.getValue().size() > 1) {
                                logger.logWarn("Argument [" + String.valueOf(entry.getKey())
                                        + "] has more than one value " + String.valueOf(entry.getValue())
                                        + ". Only the first one will be considered i.e. "
                                        + String.valueOf(entry.getValue().get(0)));
                            } else {
                                params.put(entry.getKey(), Serializer.deserialiseString(entry.getValue().get(0)));
                            }
                        }
                    }
                } else {
                    params.put(element.getKey(), Serializer.deserialiseString(element.getValue()));
                }
            }
        }
        return params;
    }

    private void sendError(HttpServerResponse res, Integer errorCode, String errorMessage) {
        @SuppressWarnings("boxing")
        int statusCode = (errorCode == null) ? 500 : errorCode;
        JsonObject responseMessage = new JsonObject();
        responseMessage.put("message", errorMessage);
        logger.logInfo(String.valueOf(statusCode) + ": " + String.valueOf(errorMessage));
        res.setStatusCode(statusCode).putHeader(CONTENT_TYPE_HEADER, APPLICATION_JSON).end(responseMessage.encode());
    }

}

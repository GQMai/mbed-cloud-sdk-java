package com.arm.mbed.cloud.sdk.common.dao;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.concurrent.atomic.AtomicReference;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ApiMetadata;
import com.arm.mbed.cloud.sdk.common.ApiUtils;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.SdkLogger;

/**
 *
 * Abstract definition of a Cloud Data Access Object.
 *
 */
@Preamble(description = "Abstract Cloud DAO")
@Internal
public abstract class AbstractCloudDao implements CloudDao {
    public static final String METHOD_INSTANTIATE_MODULE = "instantiateModule";
    public static final String METHOD_GETTER_MODULE = "getModuleOrThrow";
    private static final String PARAMETER_CLIENT = "client";
    private static final String PARAMETER_CONTEXT = "context";
    protected final AtomicReference<SdkContext> module;

    /**
     * Constructor.
     */
    public AbstractCloudDao() {
        module = new AtomicReference<>();
        try {
            configure(ConnectionOptions.newConfiguration(), false);
        } catch (@SuppressWarnings("unused") MbedCloudException exception) {
            // Nothing to do
        }
    }

    /**
     * Constructor.
     * 
     * @param options
     *            options to use.
     */
    public AbstractCloudDao(ConnectionOptions options) {
        this();
        try {
            configure(options);
        } catch (@SuppressWarnings("unused") MbedCloudException exception) {
            // Nothing to do
        }
    }

    /**
     * Constructor.
     * 
     * @param client
     *            client to use.
     */
    public AbstractCloudDao(ApiClientWrapper client) {
        this();
        try {
            configure(client);
        } catch (@SuppressWarnings("unused") MbedCloudException exception) {
            // Nothing to do
        }
    }

    /**
     * Constructor.
     * 
     * @param sdkContext
     *            SDK context.
     */
    public AbstractCloudDao(SdkContext sdkContext) {
        this();
        try {
            configure(sdkContext);
        } catch (@SuppressWarnings("unused") MbedCloudException exception) {
            // Nothing to do
        }
    }

    @Override
    public void configure() throws MbedCloudException {
        configure(ConnectionOptions.newConfiguration());
    }

    @Override
    public void configure(@Nullable ConnectionOptions options) throws MbedCloudException {
        configure(options, true);
    }

    private void configure(ConnectionOptions options, boolean throwExceptionIfInvalid) throws MbedCloudException {
        final ConnectionOptions configuration = options == null ? ConnectionOptions.newConfiguration() : options;
        if (!configuration.isValid() && throwExceptionIfInvalid) {
            throw new MbedCloudException(new InvalidParameterException("The connection options set are invalid: "
                                                                       + configuration));
        }
        module.getAndSet(instantiateModule(options));
    }

    @Override
    public void configure(@NonNull ApiClientWrapper client) throws MbedCloudException {
        ApiUtils.checkNotNull(SdkLogger.getLogger(), client, PARAMETER_CLIENT);
        module.getAndSet(instantiateModule(client));
    }

    @Override
    public void configure(@NonNull SdkContext sdkContext) throws MbedCloudException {
        ApiUtils.checkNotNull(SdkLogger.getLogger(), sdkContext, PARAMETER_CONTEXT);
        module.getAndSet(instantiateModule(sdkContext));
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends CloudDao> T configureAndGet(@Nullable ConnectionOptions options) throws MbedCloudException {
        configure(options);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends CloudDao> T configureAndGet(@NonNull ApiClientWrapper client) throws MbedCloudException {
        configure(client);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends CloudDao> T configureAndGet(@NonNull SdkContext context) throws MbedCloudException {
        configure(context);
        return (T) this;
    }

    @SuppressWarnings("resource")
    @Override
    public DaoProvider getDaoProvider() {
        final SdkContext module = getModule();
        return module == null ? DaoProvider.newGlobalProvider() : new DaoProvider(module);
    }

    @Override
    public SdkContext getContext() throws MbedCloudException {
        return getModule();
    }

    @Override
    public ApiMetadata getLastApiMetadata() throws MbedCloudException {
        return getModuleOrThrow().getLastApiMetadata();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModule() == null) ? 0 : getModule().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractCloudDao other = (AbstractCloudDao) obj;
        if (getModule() == null) {
            if (other.getModule() != null) {
                return false;
            }
        } else if (!getModule().equals(other.getModule())) {
            return false;
        }
        return true;
    }

    @Override
    public void close() throws IOException {
        final SdkContext context = getModule();
        if (context != null) {
            context.close();
        }
    }

    private SdkContext getModule() {
        return module.get();
    }

    protected SdkContext getModuleOrThrow() throws MbedCloudException {
        final SdkContext context = getModule();
        if (context == null) {
            throw new MbedCloudException("The DAO is not configured properly");
        }
        return context;
    }

    protected abstract SdkContext instantiateModule(ConnectionOptions options);

    protected abstract SdkContext instantiateModule(ApiClientWrapper client);

    protected abstract SdkContext instantiateModule(SdkContext context);

    @Override
    public abstract CloudDao clone();
}

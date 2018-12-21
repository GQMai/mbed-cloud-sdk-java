package com.arm.pelion.sdk.foundation.generator.translator;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import com.arm.mbed.cloud.sdk.common.ApiUtils;
import com.arm.pelion.sdk.foundation.generator.input.Method;
import com.arm.pelion.sdk.foundation.generator.lowlevelapis.LowLevelAPIMethod;
import com.arm.pelion.sdk.foundation.generator.lowlevelapis.LowLevelAPIMethodArgument;
import com.arm.pelion.sdk.foundation.generator.model.MethodAction;
import com.arm.pelion.sdk.foundation.generator.model.Model;
import com.arm.pelion.sdk.foundation.generator.model.ModelModule.CloudCall;
import com.arm.pelion.sdk.foundation.generator.model.Parameter;
import com.arm.pelion.sdk.foundation.generator.model.Renames;
import com.arm.pelion.sdk.foundation.generator.model.TypeFactory;
import com.arm.pelion.sdk.foundation.generator.model.TypeParameter;
import com.arm.pelion.sdk.foundation.generator.util.FoundationGeneratorException;
import com.arm.pelion.sdk.foundation.generator.util.Utils;

public class MethodTranslator {
    public static MethodAction determineMethodAction(Method m) {
        if (m == null) {
            return null;
        }
        if (m.isListMethod()) {
            return MethodAction.LIST;
        }
        if (m.isCreateMethod()) {
            return MethodAction.CREATE;
        }
        if (m.isDeleteMethod()) {
            return MethodAction.DELETE;
        }
        if (m.isReadMethod()) {
            return MethodAction.READ;
        }
        if (m.isUpdateMethod()) {
            return MethodAction.UPDATE;
        }
        return MethodAction.OTHER;
    }

    public static String generateMethodName(Model currentMode, Method m) {
        return generateMethodName(determineMethodAction(m), currentMode, m.getKey());
    }

    private static String generateMethodName(MethodAction action, Model currentModel, String name) {
        switch (action) {
            case CREATE:
            case DELETE:
            case LIST:
            case READ:
            case UPDATE:
                return ApiUtils.convertSnakeToCamel(ApiUtils.convertCamelToSnake(name) + "_"
                                                    + ApiUtils.convertCamelToSnake(currentModel.getName()
                                                                                   + (action.equals(MethodAction.LIST) ? "s"
                                                                                                                       : "")),
                                                    false);

            case OTHER:
            default:
                return ApiUtils.convertSnakeToCamel(ApiUtils.convertCamelToSnake(name), false);
        }

    }

    private static String generateMethodLongDescription(String description) {
        // TODO do some processing if needed
        return description;
    }

    @SuppressWarnings("incomplete-switch")
    private static String generateMethodDescription(MethodAction action, Model currentModel, String summary,
                                                    String methodName, boolean hasFilters) {
        if (action == MethodAction.OTHER) {
            if (summary != null) {
                return summary;
            }
            String description = ApiUtils.convertCamelToSnake(methodName).replaceAll("_", " ");
            if (description != null && !description.isEmpty()) {
                description = description.substring(0, 1).toUpperCase(Locale.UK) + description.substring(1);
            }
            return description + ".";
        }
        StringBuilder build = new StringBuilder();
        if (action == MethodAction.LIST) {
            build.append("Lists").append(" ").append(Utils.generateDocumentationString(currentModel.getName(), true));
            if (hasFilters) {
                build.append(" matching filter options");
            }
        } else {
            switch (action) {
                case CREATE:
                    build.append("Adds");
                    break;
                case DELETE:
                    build.append("Deletes");
                    break;
                case READ:
                    build.append("Gets");
                    break;
                case UPDATE:
                    build.append("Modifies");
                    break;
            }
            build.append(" ");
            build.append(Utils.generateDocumentationString(currentModel.getName()));
        }
        build.append(".");
        return build.toString();
    }

    public static TypeParameter
           translateParameterType(final LowLevelAPIMethodArgument argument) throws FoundationGeneratorException {
        TypeParameter returnType;
        try {
            returnType = TypeFactory.getCorrespondingType(argument.determineClass(),
                                                          TypeFactory.getCorrespondingType(argument.determineContentClass()));
        } catch (ClassNotFoundException exception) {
            throw new FoundationGeneratorException("Could not determine low level API parameter type ", exception);
        }
        return returnType;
    }

    public static com.arm.pelion.sdk.foundation.generator.model.Method
           translateMethod(LowLevelAPIMethod lowLevelMethod) throws FoundationGeneratorException {
        if (lowLevelMethod == null) {
            return null;
        }
        try {
            com.arm.pelion.sdk.foundation.generator.model.Method method = new com.arm.pelion.sdk.foundation.generator.model.Method(lowLevelMethod.fetchMethod(),
                                                                                                                                   null,
                                                                                                                                   null,
                                                                                                                                   false,
                                                                                                                                   false);
            if (lowLevelMethod.hasArguments()) {
                for (final LowLevelAPIMethodArgument param : lowLevelMethod.getArguments()) {
                    method.addParameter(new Parameter(param.getName(), null, null, translateParameterType(param),
                                                      null));
                }
            }
            method.setReturnType(translateParameterType(lowLevelMethod.getReturnArgument()));
            return method;
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException exception) {
            throw new FoundationGeneratorException("Could not find corresponding low level API " + lowLevelMethod,
                                                   exception);
        }
    }

    public static List<Parameter> translateParameters(Method m, String packageName, String group,
                                                      boolean onlyExternal) {
        if (m == null) {
            return null;
        }
        return m.getParameters().stream().filter(f -> onlyExternal ? f.isExternal() : true).map(f -> {
            try {
                return FieldTranslator.translateToParameter(f, packageName, group);
            } catch (FoundationGeneratorException exception) {
                // Nothing to do
                exception.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
    }

    public static CloudCall translate(Method m, LowLevelAPIMethod method,
                                      Model currentModel) throws FoundationGeneratorException {
        final MethodAction action = determineMethodAction(m);
        final Renames parameterRenames = new Renames();
        m.getParameters().forEach(f -> parameterRenames.addEntry(f.getProcessedFrom(), f.getProcessedTo()));
        return new CloudCall(action, generateMethodName(action, currentModel, m.getKey()),
                             generateMethodDescription(action, currentModel, m.getSummary(), m.getKey(),
                                                       m.hasPaginatedResponse()),
                             generateMethodLongDescription(m.getDescription()), currentModel, m.isCustomCode(),
                             m.hasPaginatedResponse(),
                             translateParameters(m, currentModel.getPackageName(), currentModel.getGroup(), true),
                             translateParameters(m, currentModel.getPackageName(), currentModel.getGroup(), false),
                             parameterRenames, translateMethod(method), method.getModuleClazz());
    }

}

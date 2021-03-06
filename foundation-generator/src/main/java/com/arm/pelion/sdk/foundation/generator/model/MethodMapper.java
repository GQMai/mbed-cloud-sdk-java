package com.arm.pelion.sdk.foundation.generator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.arm.mbed.cloud.sdk.common.ApiUtils;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.adapters.DataFileAdapter;
import com.arm.pelion.sdk.foundation.generator.model.ValueGenerator.Values;
import com.arm.pelion.sdk.foundation.generator.util.TranslationException;
import com.arm.pelion.sdk.foundation.generator.util.Utils;
import com.squareup.javapoet.CodeBlock;

public class MethodMapper extends Method {

    private static final String UNKNOWN = "Unknown";
    protected static final String PARAMETER_NAME = "toBeMapped";

    protected boolean isFromModel;
    protected final Model fromTo;
    protected final Model currentModel;
    protected final Renames renames;
    private final ModelAdapterFetcher fetcher;
    private final MethodAction action;

    public MethodMapper(String name, MethodAction action, boolean isAccessible, Model currentModel, Model fromTo,
                        boolean isFromModel, Renames renames, ModelAdapterFetcher fetcher) {
        super(false, name, generateDescription(currentModel, fromTo, isFromModel), null, true, isAccessible, false,
              false, false, true, false, false);
        setReturn(currentModel, fromTo, isFromModel);
        defineParameter(currentModel, fromTo, isFromModel);
        initialiseCodeBuilder();
        this.isFromModel = isFromModel;
        this.fromTo = fromTo;
        this.currentModel = currentModel;
        this.renames = renames;
        this.fetcher = fetcher;
        this.action = action;
    }

    protected void setReturn(Model currentModel, Model fromTo, boolean isFromModel) {
        setReturnType(isFromModel ? fromTo == null ? null : fromTo.toType()
                                  : currentModel == null ? null : currentModel.toType());
        setReturnDescription("mapped " + (isFromModel ? generateModelDescription(fromTo)
                                                      : generateModelDescription(currentModel)));
    }

    protected void defineParameter(Model currentModel, Model fromTo, boolean isFromModel) {
        if (currentModel == null || fromTo == null) {
            return;
        }
        addParameter(isFromModel ? currentModel.toParameter(PARAMETER_NAME) : fromTo.toParameter(PARAMETER_NAME));
    }

    private static String generateDescription(Model currentModel, Model fromTo, boolean isFromModel) {
        final String modelname = generateModelDescription(currentModel);
        final String otherName = generateModelDescription(fromTo);
        final String from = isFromModel ? modelname : otherName;
        final String to = isFromModel ? otherName : modelname;
        return "Maps " + from + " into " + to + ".";
    }

    protected static String generateModelDescription(Model currentModel) {
        return currentModel == null ? UNKNOWN : Utils.generateDocumentationString(currentModel.getName());
    }

    @Override
    protected void translateCode() throws TranslationException {
        code.beginControlFlow("if($L == null)", PARAMETER_NAME);
        code.addStatement("return null");
        code.endControlFlow();
        final String variableName = ApiUtils.convertSnakeToCamel(ApiUtils.convertCamelToSnake(isFromModel ? fromTo.getName()
                                                                                                          : currentModel.getName()),
                                                                 false);
        generateCode(code, isFromModel ? currentModel : fromTo, isFromModel ? fromTo : currentModel, !isFromModel,
                     variableName, PARAMETER_NAME, renames, name, action, fetcher);
    }

    private static void generateCode(CodeBlock.Builder code, Model from, Model to, boolean isFromLowLevel,
                                     String variableName, String fromVariableName, Renames renames, String mapFunction,
                                     MethodAction action, ModelAdapterFetcher fetcher) throws TranslationException {
        StringBuilder statementString = new StringBuilder("final $T $L = new $T(");
        final TypeParameter fromType = from.toType();
        final TypeParameter toType = to.toType();
        fromType.translate();
        toType.translate();
        final List<Object> values = new ArrayList<>(Arrays.asList(toType.hasClass() ? toType.getClazz()
                                                                                    : toType.getTypeName(),
                                                                  variableName,
                                                                  toType.hasClass() ? toType.getClazz()
                                                                                    : toType.getTypeName()));
        List<Field> settableFields = null;
        boolean toIsLowLevelModel = toType.isLowLevelModel();
        if (!toIsLowLevelModel && to.hasReadOnlyFields()) {
            final AbstractMethodConstructor constructor = (AbstractMethodConstructor) (to.hasConstructor(MethodConstructorReadOnly.IDENTIFIER) ? to.fetchMethod((MethodConstructorReadOnly.IDENTIFIER))
                                                                                                                                               : to.fetchMethod((MethodConstructorAllFields.IDENTIFIER)));
            if (constructor != null) {
                settableFields = to.hasConstructor(MethodConstructorReadOnly.IDENTIFIER) ? constructor.getSettableFieldList()
                                                                                         : new ArrayList<>();
                final List<Field> constructorFields = constructor.getFieldList();
                boolean start = true;
                for (Field f : constructorFields) {
                    if (start) {
                        start = false;
                    } else {
                        statementString.append(",");
                    }
                    final TypeParameter fType = f.getType();
                    final String toFieldName = f.getName();
                    final String fromFieldName = renames.containsMappingFor(toFieldName) ? renames.getRenamedField(toFieldName)
                                                                                         : toFieldName;
                    final Field fromField = from.fetchField(fromFieldName);
                    if (fromField == null) {
                        recordThatFieldWasNotFound(code, fromType, toType, toFieldName);
                        final Values defaultValue = new Values();
                        ValueGenerator.getJavaDefaultValue(fType, f.getDefaultValue(), defaultValue);
                        statementString.append(String.join("", defaultValue.getFormats()));
                        values.addAll(defaultValue.getValues());
                    } else {
                        final TypeParameter fromFieldType = fromField.getType();
                        fType.translate();
                        fromFieldType.translate();
                        final String getterName = MethodGetter.getCorrespondingGetterMethodName(fromField.getName(),
                                                                                                fType.isBoolean(),
                                                                                                isFromLowLevel);
                        if (needsTranslation(fromFieldType, fType)) {
                            if (!doesTypeNeedTranslation(fType)) {
                                if (fromFieldType.isPrimitive()) {
                                    statementString.append("$T.valueOf($L.$L())");
                                    values.add(getWrapperEquivalent(fromFieldType));
                                } else {
                                    statementString.append("$L.$L()");
                                }
                                values.addAll(Arrays.asList(fromVariableName, getterName));
                            } else if (fType.isFormPart()) {
                                statementString.append("$T.$L($L.$L())");
                                values.addAll(Arrays.asList(DataFileAdapter.class, DataFileAdapter.METHOD_REVERSE_MAP,
                                                            fromVariableName, getterName));
                            } else if (f.hasDefaultValue()) {
                                statementString.append("$T.$L($L.$L(),$L)");
                                values.addAll(Arrays.asList(TranslationUtils.class,
                                                            getTranslationMethod(fType, fromFieldType),
                                                            fromVariableName, getterName, f.getDefaultValue()));
                            } else {
                                statementString.append("$T.$L($L.$L())");
                                values.addAll(Arrays.asList(TranslationUtils.class,
                                                            getTranslationMethod(fType, fromFieldType),
                                                            fromVariableName, getterName));
                            }
                        } else if (fType.isEnum()) {
                            statementString.append("$L($L.$L())");
                            values.addAll(Arrays.asList(MethodMapperEnum.generateName(toIsLowLevelModel ? fromField : f,
                                                                                      toIsLowLevelModel ? f : fromField,
                                                                                      toIsLowLevelModel),
                                                        fromVariableName, getterName));
                        } else if (TypeUtils.checkIfCollectionOfModel(fType)) {
                            final TypeParameter modelAdapterType = fetcher.fetchForCollection((TypeCompose) fromFieldType,
                                                                                              (TypeCompose) fType,
                                                                                              action)
                                                                          .toType();
                            modelAdapterType.translate();
                            // TODO do what is needed for hashtable
                            if (fType.isList()) {
                                String mapListMethodName = null;
                                switch (action) {
                                    case CREATE:
                                        mapListMethodName = ModelAdapter.FUNCTION_NAME_MAP_SIMPLE_LIST_ADD;
                                        break;
                                    case UPDATE:
                                        mapListMethodName = ModelAdapter.FUNCTION_NAME_MAP_SIMPLE_LIST_UPDATE;
                                        break;
                                    default:
                                        mapListMethodName = ModelAdapter.FUNCTION_NAME_MAP_SIMPLE_LIST;
                                        break;

                                }
                                statementString.append("$T.$L($L.$L())");
                                values.addAll(Arrays.asList(modelAdapterType.hasClass() ? modelAdapterType.getClazz()
                                                                                        : modelAdapterType.getTypeName(),
                                                            mapListMethodName, fromVariableName, getterName));
                            }

                        } else if (TypeUtils.checkIfModel(fType)) {
                            final TypeParameter modelAdapterType = fetcher.fetch(fromFieldType, fType, action).toType();
                            modelAdapterType.translate();
                            statementString.append("$T.$L($L.$L())");
                            values.addAll(Arrays.asList(modelAdapterType.hasClass() ? modelAdapterType.getClazz()
                                                                                    : modelAdapterType.getTypeName(),
                                                        mapFunction, fromVariableName, getterName));
                        } else {
                            statementString.append("$L.$L()");
                            values.addAll(Arrays.asList(fromVariableName, getterName));
                        }

                    }
                }
            }
        }
        statementString.append(")");
        code.addStatement(statementString.toString(), values.toArray());
        if (settableFields == null) {
            if (!toIsLowLevelModel) {
                final MethodConstructorAllFields constructor = (MethodConstructorAllFields) to.fetchMethod((MethodConstructorAllFields.IDENTIFIER));
                settableFields = constructor == null ? new ArrayList<>() : constructor.getAllFields();
            } else {
                settableFields = to.getSettableFields();
            }
        }
        // Not using stream so that exception is thrown
        for (Field f : settableFields) {
            final TypeParameter fType = f.getType();
            final String toFieldName = f.getName();
            final String fromFieldName = renames.containsMappingFor(toFieldName) ? renames.getRenamedField(toFieldName)
                                                                                 : toFieldName;
            final Field fromField = from.fetchField(fromFieldName);
            final TypeParameter fromFieldType = fromField == null ? null : fromField.getType();
            if (fromFieldType == null) {
                recordThatFieldWasNotFound(code, fromType, toType, toFieldName);
            } else {
                final String setterName = MethodSetter.getCorrespondingSetterMethodName(toFieldName);
                final String getterName = MethodGetter.getCorrespondingGetterMethodName(fromField.getName(),
                                                                                        fType.isBoolean(),
                                                                                        isFromLowLevel);
                if (needsTranslation(fromFieldType, fType)) {
                    if (!doesTypeNeedTranslation(fType)) {
                        if (fromFieldType.isPrimitive()) {
                            code.addStatement("$L.$L($T.valueOf($L.$L()))", variableName, setterName,
                                              getWrapperEquivalent(fromFieldType), fromVariableName, getterName);
                        } else {
                            code.addStatement("$L.$L($L.$L())", variableName, setterName, fromVariableName, getterName);
                        }
                    } else if (fType.isFormPart()) {
                        code.addStatement("$L.$L($T.$L($L.$L()))", variableName, setterName, DataFileAdapter.class,
                                          DataFileAdapter.METHOD_REVERSE_MAP, fromVariableName, getterName);
                    } else if (f.hasDefaultValue()) {
                        code.addStatement("$L.$L($T.$L($L.$L(),$L))", variableName, setterName, TranslationUtils.class,
                                          getTranslationMethod(fType, fromFieldType), fromVariableName, getterName,
                                          f.getDefaultValue());
                    } else {
                        code.addStatement("$L.$L($T.$L($L.$L()))", variableName, setterName, TranslationUtils.class,
                                          getTranslationMethod(fType, fromFieldType), fromVariableName, getterName);
                    }
                } else if (fType.isEnum()) {
                    code.addStatement("$L.$L($L($L.$L()))", variableName, setterName,
                                      MethodMapperEnum.generateName(toIsLowLevelModel ? fromField : f,
                                                                    toIsLowLevelModel ? f : fromField,
                                                                    toIsLowLevelModel),
                                      fromVariableName, getterName);
                } else if (TypeUtils.checkIfCollectionOfModel(fType)) {
                    final TypeParameter modelAdapterType = fetcher.fetchForCollection((TypeCompose) fromFieldType,
                                                                                      (TypeCompose) fType, action)
                                                                  .toType();
                    modelAdapterType.translate();
                    // TODO do what is needed for hashtable
                    if (fType.isList()) {
                        String mapListMethodName = null;
                        switch (action) {
                            case CREATE:
                                mapListMethodName = ModelAdapter.FUNCTION_NAME_MAP_SIMPLE_LIST_ADD;
                                break;
                            case UPDATE:
                                mapListMethodName = ModelAdapter.FUNCTION_NAME_MAP_SIMPLE_LIST_UPDATE;
                                break;
                            default:
                                mapListMethodName = ModelAdapter.FUNCTION_NAME_MAP_SIMPLE_LIST;
                                break;

                        }
                        code.addStatement("$L.$L($T.$L($L.$L()))", variableName, setterName,
                                          modelAdapterType.hasClass() ? modelAdapterType.getClazz()
                                                                      : modelAdapterType.getTypeName(),
                                          mapListMethodName, fromVariableName, getterName);
                    }
                } else if (TypeUtils.checkIfModel(fType)) {
                    final ModelAdapter adapter = fetcher.fetch(fromFieldType, fType, action);
                    if (adapter != null) {
                        final TypeParameter modelAdapterType = adapter.toType();
                        modelAdapterType.translate();
                        code.addStatement("$L.$L($T.$L($L.$L()))", variableName, setterName,
                                          modelAdapterType.hasClass() ? modelAdapterType.getClazz()
                                                                      : modelAdapterType.getTypeName(),
                                          mapFunction, fromVariableName, getterName);
                    } else {
                        recordThatAdapterWasNotFound(code, fromFieldType, fType, toFieldName);
                    }
                } else {
                    code.addStatement("$L.$L($L.$L())", variableName, setterName, fromVariableName, getterName);
                }
            }

        }
        code.addStatement("return $L", variableName);
    }

    private static void recordThatFieldWasNotFound(CodeBlock.Builder code, final TypeParameter fromType,
                                                   final TypeParameter toType, final String toFieldName) {
        code.add("//No field equivalent to $L in $T was found in $T" + System.lineSeparator(), toFieldName,
                 toType.hasClass() ? toType.getClazz() : toType.getTypeName(),
                 fromType.hasClass() ? fromType.getClazz() : fromType.getTypeName());
    }

    private static void recordThatAdapterWasNotFound(CodeBlock.Builder code, final TypeParameter fromType,
                                                     final TypeParameter toType, final String toFieldName) {
        code.add("//No adapter method was found in order to perform a translation from $T to $T for field: $L"
                 + System.lineSeparator(), fromType.hasClass() ? fromType.getClazz() : fromType.getTypeName(),
                 toType.hasClass() ? toType.getClazz() : toType.getTypeName(), toFieldName);
    }

    public static Class<?> getWrapperEquivalent(TypeParameter parameterType) {
        if (!parameterType.isPrimitive()) {
            return null;
        }
        if (parameterType.isBoolean()) {
            return Boolean.class;
        }
        // must be a number
        if (parameterType.isDecimal()) {
            return BigDecimal.class;
        } else if (parameterType.isInteger()) {
            return Integer.class;
        }
        return Long.class;
    }

    public static String getTranslationMethod(TypeParameter fType,
                                              TypeParameter fromFieldType) throws TranslationException {
        if (fType == null || fromFieldType == null) {
            throw new TranslationException("Could not find an appropriate translation method in "
                                           + TranslationUtils.class.getName() + " for conversion from " + fromFieldType
                                           + " to " + fType,
                                           new IllegalArgumentException("One of the types is undefined"));
        }
        if (fType.isDate()) {
            if (fromFieldType.isJodaDate() || fromFieldType.isJodaTime() || fromFieldType.isCalendar()
                || fromFieldType.isNumber()) {
                return TranslationUtils.METHOD_CONVERT_OTHER_TO_DATE;
            }
            if (fromFieldType.isString()) {
                return TranslationUtils.METHOD_CONVERT_STRING_TO_DATE;
            }
        }
        if (fType.isJodaDate()) {
            if (fromFieldType.isDate()) {
                return TranslationUtils.METHOD_CONVERT_DATE_TO_LOCALDATE;
            }
        }
        if (fType.isJodaTime()) {
            if (fromFieldType.isDate()) {
                return TranslationUtils.METHOD_CONVERT_DATE_TO_DATETIME;
            }
        }
        if (fType.isUrl()) {
            if (fromFieldType.isString()) {
                return TranslationUtils.METHOD_CONVERT_STRING_TO_URL;
            }
        }
        if (fType.isDataFile()) {
            if (fromFieldType.isFile() || fromFieldType.isString()) {
                return TranslationUtils.METHOD_CONVERT_TO_DATA_FILE;
            }
        }
        if (fType.isBoolean()) {
            if (fromFieldType.isBoolean() || fromFieldType.isString()) {
                return TranslationUtils.METHOD_CONVERT_BOOL_TO_BOOL;
            }
        }
        if (fType.isNumber()) {
            if (fromFieldType.isNumber() || fromFieldType.isString()) {
                return fType.isInteger() ? TranslationUtils.METHOD_CONVERT_NUMBER_TO_INT
                                         : TranslationUtils.METHOD_CONVERT_NUMBER_TO_LONG;
                // TODO handle floating point numbers if needed
            }
        }
        if (fType.isString() && !fromFieldType.isString()) {
            return fromFieldType.isDate() ? TranslationUtils.METHOD_CONVERT_DATE_TO_STRING
                                          : TranslationUtils.METHOD_CONVERT_ANY_TO_STRING;
        }
        if (fType.isBase64()) {
            return TranslationUtils.METHOD_CONVERT_ANY_TO_BASE64;
        }
        if (fType.isBinary()) {
            return TranslationUtils.METHOD_CONVERT_ANY_TO_BYTE_ARRAY;
        }

        throw new TranslationException("Could not find an appropriate translation method in "
                                       + TranslationUtils.class.getName() + " for conversion from " + fromFieldType
                                       + " to " + fType);
    }

    public static boolean needsTranslation(TypeParameter from, TypeParameter to) {
        if (TypeUtils.areSame(from, to)) {
            return false;
        }
        return doesTypeNeedTranslation(from) || doesTypeNeedTranslation(to);
    }

    public static boolean doesTypeNeedTranslation(TypeParameter type) {
        return type.isDate() || isLowLevelType(type) || type.isPrimitive() || type.isUrl() || type.isFile()
               || type.isString();
    }

    public static boolean isLowLevelType(TypeParameter type) {
        return type.isJodaDate() || type.isJodaTime() || type.isFormPart();
    }

}

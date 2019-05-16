package com.arm.pelion.sdk.foundation.generator.model;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractMethodConstructorWithFieldParameters extends AbstractMethodConstructor {

    protected List<Field> fields;

    public AbstractMethodConstructorWithFieldParameters(String constructorDescription, Model currentModel,
                                                        Model parentModel, String description, String longDescription,
                                                        boolean isInternal) {
        super(constructorDescription, currentModel, parentModel, description, longDescription, isInternal);
    }

    protected abstract void setFields();

    protected void setFields(List<Field> fieldParameters) {
        fields = fieldParameters;
        setNecessary(fields != null && !fields.isEmpty());
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.pelion.sdk.foundation.generator.model.AbstractMethodConstructor#getSignature()
     */
    @Override
    public List<String> getSignature() {
        return fields.stream().map(f -> f.getType().getShortName()).collect(Collectors.toList());
    }

    @Override
    protected void addConstructorParameters() {
        setFields();
        fields.forEach(f -> addParameter(f.toParameter()));
    }

    @Override
    protected void addStaticAnalysisAnnotations() {
        if (fields != null && fields.size() > StaticAnalysisUtils.FIELD_LIMIT_FOR_IGNORING_WARNINGS) {
            annotationRegistry.ignoreCyclomaticComplexity();
        }
        super.addStaticAnalysisAnnotations();
    }

}

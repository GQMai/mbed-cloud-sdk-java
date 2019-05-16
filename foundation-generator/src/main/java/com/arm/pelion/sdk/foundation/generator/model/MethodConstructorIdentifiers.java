package com.arm.pelion.sdk.foundation.generator.model;

import java.util.List;

public class MethodConstructorIdentifiers extends AbstractMethodConstructorWithFieldParameters {

    private static final String CONSTRUCTOR_DESCRIPTION = "Constructor based on object identifier.";

    public MethodConstructorIdentifiers(Model currentModel, Model parentModel) {
        super(CONSTRUCTOR_DESCRIPTION, currentModel, parentModel, null, null, false);
    }

    @Override
    protected void translateCode() {
        code.addStatement("this()");
        fields.forEach(f -> code.addStatement(new MethodSetter(f).getName() + "(" + f.toParameter().getName() + ")"));
    }

    @Override
    protected void setFields() {
        setFields(getFieldList());
    }

    @Override
    public List<Field> getFieldList() {
        return this.getFieldList(false, false, false, true, false);
    }
}

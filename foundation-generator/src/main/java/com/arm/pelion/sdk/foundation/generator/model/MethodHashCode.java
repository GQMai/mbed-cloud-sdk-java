package com.arm.pelion.sdk.foundation.generator.model;

import com.squareup.javapoet.CodeBlock;

public class MethodHashCode extends AbstractMethodBasedOnModel {

    public static final String IDENTIFIER = "hashCode";

    public MethodHashCode(Model currentModel, Model parentModel) {
        super(currentModel, parentModel, false, IDENTIFIER,
              "Calculates the hash code of this instance based on field values", "@see java.lang.Object#hashCode()",
              false, true, false, false, currentModel == null ? false : currentModel.needsFieldCustomisation(), false,
              false, true);
        setReturnType(new ParameterType(int.class));
        setReturnDescription("hash code");
        setCode(CodeBlock.builder());
        shouldTest(true);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.pelion.sdk.foundation.generator.model.Method#translateCode()
     */
    @Override
    protected void translateCode() {
        super.translateCode();
        code.addStatement("final int prime = 31");
        if (hasParentModel() || (hasCurrentModel() && currentModel.hasParent())) {
            code.addStatement("int result = super.hashCode()");
        } else {
            code.addStatement("int result = 1");
        }
        if (hasCurrentModel() && currentModel.hasMethods()) {
            currentModel.getFieldList().stream().filter(f -> !f.needsCustomCode())
                        .forEach(f -> code.addStatement("result = prime * result + (($L == null) ? 0 : $L.hashCode())",
                                                        f.getName(), f.getName()));
        }
        code.addStatement("return result");
    }

}

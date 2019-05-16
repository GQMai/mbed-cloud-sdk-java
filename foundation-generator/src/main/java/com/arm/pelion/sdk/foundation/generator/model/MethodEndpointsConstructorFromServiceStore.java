package com.arm.pelion.sdk.foundation.generator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.arm.mbed.cloud.sdk.common.AbstractEndpoints;
import com.arm.mbed.cloud.sdk.common.ServiceRegistry;

public class MethodEndpointsConstructorFromServiceStore extends AbstractMethodConstructor {
    private static final String PARAM_SERVICE_STORE = "services";
    protected List<Field> fields;

    public MethodEndpointsConstructorFromServiceStore(Model currentModel, Model parentModel) {
        super(null, currentModel, parentModel, null, null, false);
    }

    @Override
    protected void translateCode() {
        code.addStatement("super($L)", PARAM_SERVICE_STORE);
        currentModel.getFieldList().stream().filter(f -> !f.isStatic() || !f.isReadOnly())
                    .forEach(f -> code.addStatement("this.$L = $L($T.class)", f.getName(),
                                                    AbstractEndpoints.METHOD_INITIALISE_SERVICE,
                                                    f.getType().hasClazz() ? f.getType().getClazz()
                                                                           : f.getType().getTypeName()));

    }

    @Override
    public List<String> getSignature() {
        return Arrays.asList(ServiceRegistry.class.getSimpleName());
    }

    @Override
    protected void addConstructorParameters() {
        addParameter(new Parameter(PARAM_SERVICE_STORE, "created services {@link ServiceRegistry}.", null,
                                   TypeFactory.getCorrespondingType(ServiceRegistry.class), null, null));
    }

    @Override
    public List<Field> getFieldList() {
        return new ArrayList<>();
    }
}

package com.arm.mbed.cloud.sdk.connect.adapters;

import java.util.List;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.GenericAdapter.Mapper;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.connect.model.Resource;

@Preamble(description = "Adapter for resource model")
public class ResourceAdapter {

    public static Resource map(String deviceId, com.arm.mbed.cloud.sdk.internal.model.Resource apiResource) {
        if (apiResource == null || deviceId == null || deviceId.isEmpty()) {
            return null;
        }
        Resource resource = new Resource();
        resource.setContentType(apiResource.getType());
        resource.setObservable(TranslationUtils.toBool(apiResource.getObs(), false));
        resource.setType(apiResource.getRt());
        resource.setPath(apiResource.getUri());
        resource.setDeviceId(deviceId);
        return resource;
    }

    public static Mapper<com.arm.mbed.cloud.sdk.internal.model.Resource, Resource> getMapper(String deviceId) {
        final String immutableDeviceId = deviceId;
        return new Mapper<com.arm.mbed.cloud.sdk.internal.model.Resource, Resource>() {

            @Override
            public Resource map(com.arm.mbed.cloud.sdk.internal.model.Resource toBeMapped) {
                return ResourceAdapter.map(immutableDeviceId, toBeMapped);
            }
        };
    }

    public static List<Resource> mapList(String deviceId, List<com.arm.mbed.cloud.sdk.internal.model.Resource> list) {
        return GenericAdapter.mapList(list, getMapper(deviceId));
    }

    public static Mapper<List<com.arm.mbed.cloud.sdk.internal.model.Resource>, List<Resource>> getListMapper(
            String deviceId) {
        final String immutableDeviceId = deviceId;
        return new Mapper<List<com.arm.mbed.cloud.sdk.internal.model.Resource>, List<Resource>>() {

            @Override
            public List<Resource> map(List<com.arm.mbed.cloud.sdk.internal.model.Resource> toBeMapped) {
                return ResourceAdapter.mapList(immutableDeviceId, toBeMapped);
            }

        };
    }

}

package com.arm.mbed.cloud.sdk.connect.adapters;

import java.util.List;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.GenericAdapter.Mapper;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.connect.model.Resource;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ResourcesData;

@Preamble(description = "Adapter for resource model")
public final class ResourceAdapter {

    private ResourceAdapter() {
        super();
    }

    /**
     * Maps a resource.
     *
     * @param resourceData
     *            resource data.
     * @param deviceId
     *            device id of the device containing the resource
     * @return mapped resource
     */
    public static Resource map(ResourcesData resourceData, String deviceId) {
        if (resourceData == null) {
            return null;
        }
        return new Resource(deviceId, resourceData.getPath(), resourceData.getRt(), resourceData.getCt(),
                            TranslationUtils.toBool(resourceData.isObs(), false), resourceData.getIf());
    }

    /**
     * Maps a resource.
     *
     * @param deviceId
     *            device id of the device containing the resource
     * @param apiResource
     *            resource to map
     * @return mapped resource
     */
    public static Resource map(String deviceId,
                               com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource apiResource) {
        if (apiResource == null || deviceId == null || deviceId.isEmpty()) {
            return null;
        }
        return new Resource(deviceId, apiResource.getUri(), apiResource.getRt(), apiResource.getType(),
                            TranslationUtils.toBool(apiResource.isObs(), false), null);
    }

    /**
     * Gets a mapper.
     *
     * @param deviceId
     *            device id of the device containing the resource
     * @return a mapper for this device.
     */
    public static Mapper<ResourcesData, Resource> getResourceDataMapper(String deviceId) {
        final String immutableDeviceId = deviceId;
        return new Mapper<ResourcesData, Resource>() {

            @Override
            public Resource map(ResourcesData toBeMapped) {
                return ResourceAdapter.map(toBeMapped, immutableDeviceId);
            }
        };
    }

    /**
     * Maps a list of resources.
     *
     * @param deviceId
     *            device id of the device containing the resources
     * @param list
     *            resource data
     * @return list of resources
     */
    public static List<Resource> mapResourceDataList(String deviceId, List<ResourcesData> list) {
        return GenericAdapter.mapList(list, getResourceDataMapper(deviceId));
    }

    /**
     * Gets a mapper.
     *
     * @param deviceId
     *            device id of the device containing the resource
     * @return a mapper for this device.
     */
    public static Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource, Resource>
           getMapper(String deviceId) {
        final String immutableDeviceId = deviceId;
        return new Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource, Resource>() {

            @Override
            public Resource map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource toBeMapped) {
                return ResourceAdapter.map(immutableDeviceId, toBeMapped);
            }
        };
    }

    /**
     * Maps a list of resources.
     *
     * @param deviceId
     *            device id of the device containing the resources
     * @param list
     *            resource page
     * @return list of resources
     */
    public static List<Resource>
           mapList(String deviceId,
                   List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource> list) {
        return GenericAdapter.mapList(list, getMapper(deviceId));
    }

    /**
     * Gets list mapper.
     *
     * @param deviceId
     *            device id of the device containing the resources
     * @return a list mapper
     */
    public static
           Mapper<List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource>, List<Resource>>
           getListMapper(String deviceId) {
        final String immutableDeviceId = deviceId;
        return new Mapper<List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource>,
                          List<Resource>>() {

            @Override
            public List<Resource>
                   map(List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Resource> toBeMapped) {
                return ResourceAdapter.mapList(immutableDeviceId, toBeMapped);
            }

        };
    }

}

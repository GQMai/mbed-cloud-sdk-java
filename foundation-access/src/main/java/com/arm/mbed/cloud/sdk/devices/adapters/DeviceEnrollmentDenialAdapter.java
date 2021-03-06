// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentDenial;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BlackListedDeviceData;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DenialAttemptsResponse;
import java.util.List;

/**
 * Adapter for device enrollment denials.
 */
@Preamble(description = "Adapter for device enrollment denials.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class DeviceEnrollmentDenialAdapter {
    /**
     * Constructor.
     */
    private DeviceEnrollmentDenialAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a denial attempts response into a device enrollment denial.
     * 
     * @param toBeMapped
     *            a denial attempts response.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<DeviceEnrollmentDenial> mapList(DenialAttemptsResponse toBeMapped) {
        final DenialAttemptsResponse finalList = toBeMapped;
        final GenericAdapter.RespList<BlackListedDeviceData> respList = new GenericAdapter.RespList<BlackListedDeviceData>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<BlackListedDeviceData> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, DeviceEnrollmentDenialAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<DenialAttemptsResponse, ListResponse<DeviceEnrollmentDenial>> getListMapper() {
        return new GenericAdapter.Mapper<DenialAttemptsResponse, ListResponse<DeviceEnrollmentDenial>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<DeviceEnrollmentDenial> map(DenialAttemptsResponse toBeMapped) {
                return DeviceEnrollmentDenialAdapter.mapList(toBeMapped);
            }
        };
    }

    /**
     * Maps a black listed device data into a device enrollment denial.
     * 
     * @param toBeMapped
     *            a black listed device data.
     * @return mapped a device enrollment denial
     */
    @Internal
    public static DeviceEnrollmentDenial map(BlackListedDeviceData toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final DeviceEnrollmentDenial deviceEnrollmentDenial = new DeviceEnrollmentDenial(toBeMapped.getAccountId(),
                                                                                         TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                                         toBeMapped.getEndpointName(),
                                                                                         toBeMapped.getTrustedCertificateId());
        deviceEnrollmentDenial.setId(toBeMapped.getId());
        return deviceEnrollmentDenial;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<BlackListedDeviceData, DeviceEnrollmentDenial> getMapper() {
        return new GenericAdapter.Mapper<BlackListedDeviceData, DeviceEnrollmentDenial>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public DeviceEnrollmentDenial map(BlackListedDeviceData toBeMapped) {
                return DeviceEnrollmentDenialAdapter.map(toBeMapped);
            }
        };
    }
}

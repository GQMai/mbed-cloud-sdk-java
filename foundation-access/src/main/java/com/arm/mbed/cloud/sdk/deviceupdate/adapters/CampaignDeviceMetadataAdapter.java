// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignDeviceMetadata;
import com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignDeviceMetadataDeploymentState;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadataPage;
import java.util.List;

/**
 * Adapter for campaign device metadata.
 */
@Preamble(description = "Adapter for campaign device metadata.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class CampaignDeviceMetadataAdapter {
    /**
     * Constructor.
     */
    private CampaignDeviceMetadataAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a campaign device metadata into a campaign device metadata.
     * 
     * @param toBeMapped
     *            a campaign device metadata.
     * @return mapped a campaign device metadata
     */
    @Internal
    public static CampaignDeviceMetadata
           map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final CampaignDeviceMetadata campaignDeviceMetadata = new CampaignDeviceMetadata(TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                                         translateToCampaignDeviceMetadataDeploymentState(toBeMapped.getDeploymentState()),
                                                                                         toBeMapped.getDescription(),
                                                                                         toBeMapped.getDeviceId(),
                                                                                         toBeMapped.getMechanism(),
                                                                                         toBeMapped.getMechanismUrl(),
                                                                                         toBeMapped.getName(),
                                                                                         TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
        campaignDeviceMetadata.setCampaignId(toBeMapped.getCampaign());
        campaignDeviceMetadata.setId(toBeMapped.getId());
        return campaignDeviceMetadata;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static
           GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata,
                                 CampaignDeviceMetadata>
           getMapper() {
        return new GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata,
                                         CampaignDeviceMetadata>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public CampaignDeviceMetadata
                   map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata toBeMapped) {
                return CampaignDeviceMetadataAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a campaign device metadata page into a campaign device metadata.
     * 
     * @param toBeMapped
     *            a campaign device metadata page.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<CampaignDeviceMetadata> mapList(CampaignDeviceMetadataPage toBeMapped) {
        final CampaignDeviceMetadataPage finalList = toBeMapped;
        final GenericAdapter.RespList<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata> respList = new GenericAdapter.RespList<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata>() {
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
            public List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata>
                   getData() {
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
        return GenericAdapter.mapList(respList, CampaignDeviceMetadataAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<CampaignDeviceMetadataPage, ListResponse<CampaignDeviceMetadata>>
           getListMapper() {
        return new GenericAdapter.Mapper<CampaignDeviceMetadataPage, ListResponse<CampaignDeviceMetadata>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<CampaignDeviceMetadata> map(CampaignDeviceMetadataPage toBeMapped) {
                return CampaignDeviceMetadataAdapter.mapList(toBeMapped);
            }
        };
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a deployment state enum.
     * @return mapped enum value
     */
    @Internal
    protected static CampaignDeviceMetadataDeploymentState
              translateToCampaignDeviceMetadataDeploymentState(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.CampaignDeviceMetadata.DeploymentStateEnum toBeMapped) {
        if (toBeMapped == null) {
            return CampaignDeviceMetadataDeploymentState.getUnknownEnum();
        }
        switch (toBeMapped) {
            case PENDING:
                return CampaignDeviceMetadataDeploymentState.PENDING;
            case UPDATED_CONNECTOR_CHANNEL:
                return CampaignDeviceMetadataDeploymentState.UPDATED_CONNECTOR_CHANNEL;
            case FAILED_CONNECTOR_CHANNEL_UPDATE:
                return CampaignDeviceMetadataDeploymentState.FAILED_CONNECTOR_CHANNEL_UPDATE;
            case DEPLOYED:
                return CampaignDeviceMetadataDeploymentState.DEPLOYED;
            case MANIFESTREMOVED:
                return CampaignDeviceMetadataDeploymentState.MANIFESTREMOVED;
            case DEREGISTERED:
                return CampaignDeviceMetadataDeploymentState.DEREGISTERED;
            default:
                return CampaignDeviceMetadataDeploymentState.getUnknownEnum();
        }
    }
}

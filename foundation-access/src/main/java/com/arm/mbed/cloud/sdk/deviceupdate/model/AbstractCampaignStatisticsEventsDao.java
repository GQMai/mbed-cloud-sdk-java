// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [CampaignStatisticsEventsDao]
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.DeviceUpdate;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;

/**
 * Data Access Object (DAO) for campaign statistics events.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for campaign statistics events.")
public abstract class AbstractCampaignStatisticsEventsDao extends AbstractModelDao<CampaignStatisticsEvents>
                                                          implements ReadDao<CampaignStatisticsEvents> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractCampaignStatisticsEventsDao() throws MbedCloudException {
        super();
    }

    /**
     * Constructor.
     * 
     * @param client
     *            an api client wrapper.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractCampaignStatisticsEventsDao(ApiClientWrapper client) throws MbedCloudException {
        super(client);
    }

    /**
     * Constructor.
     * 
     * @param options
     *            a connection options.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractCampaignStatisticsEventsDao(ConnectionOptions options) throws MbedCloudException {
        super(options);
    }

    /**
     * Constructor.
     * 
     * @param sdkContext
     *            an sdk context.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractCampaignStatisticsEventsDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected CampaignStatisticsEvents instantiateModel() {
        return new CampaignStatisticsEvents();
    }

    /**
     * Instantiates modules.
     * 
     * @param client
     *            an api client wrapper.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ApiClientWrapper client) {
        return new DeviceUpdate(client);
    }

    /**
     * Instantiates modules.
     * 
     * @param options
     *            a connection options.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ConnectionOptions options) {
        return new DeviceUpdate(options);
    }

    /**
     * Instantiates modules.
     * 
     * @param context
     *            an sdk context.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(SdkContext context) {
        return new DeviceUpdate(context);
    }

    /**
     * Gets a campaign statistics events.
     *
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEventsDao#read(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEvents)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public CampaignStatisticsEvents read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a campaign statistics events.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.DeviceUpdate#readCampaignStatisticsEvents(com.arm.mbed.cloud.sdk.deviceupdate.model.CampaignStatisticsEvents)}
     * 
     * @param campaignStatisticsEvents
     *            a campaign statistics events.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CampaignStatisticsEvents
           read(@NonNull CampaignStatisticsEvents campaignStatisticsEvents) throws MbedCloudException {
        return setAndGetModel(((DeviceUpdate) getModuleOrThrow()).readCampaignStatisticsEvents(campaignStatisticsEvents));
    }

    /**
     * Gets a campaign statistics events.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.DeviceUpdate#readCampaignStatisticsEvents(String, String, String)}
     * 
     * @param campaignId
     *            ID of the associated campaign.
     * @param summaryStatusId
     *            a string
     * @param id
     *            a string
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CampaignStatisticsEvents read(@NonNull String campaignId, @NonNull String summaryStatusId,
                                         @NonNull String id) throws MbedCloudException {
        return setAndGetModel(((DeviceUpdate) getModuleOrThrow()).readCampaignStatisticsEvents(campaignId,
                                                                                               summaryStatusId, id));
    }
}

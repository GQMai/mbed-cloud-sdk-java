// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.Devices;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelListDao;
import com.arm.mbed.cloud.sdk.common.dao.ModelListDao;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;

/**
 * Data Access Object (DAO) for listing devices.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing devices.")
public class DeviceListDao extends AbstractModelListDao<Device, DeviceListOptions>
                           implements ModelListDao<Device, DeviceListOptions> {
    /**
     * Constructor.
     */
    public DeviceListDao() throws MbedCloudException {
        super();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public DeviceListDao clone() {
        try {
            return new DeviceListDao().configureAndGet(getModule() == null ? null : getModule().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a device dao.
     * 
     * @return a device dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public DeviceDao getCorrespondingModelDao() throws MbedCloudException {
        return new DeviceDao().configureAndGet(getModule());
    }

    /**
     * a device dao class.
     * 
     * @return a device dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<DeviceDao> getCorrespondingModelDaoDefinition() {
        return DeviceDao.class;
    }

    /**
     * a device list options.
     * 
     * @return a device list options
     */
    @Override
    @Internal
    protected DeviceListOptions instantiateListOptions() {
        return new DeviceListOptions();
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
        return new Devices(client);
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
        return new Devices(options);
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
        return new Devices(context);
    }

    /**
     * Lists devices matching filter options.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#listDevices(DeviceListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of devices
     */
    @Override
    protected ListResponse<Device> requestOnePage(DeviceListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Devices) getModule()).listDevices(options);
    }
}

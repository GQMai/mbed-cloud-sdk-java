// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [DeviceEnrollmentDenialDao]
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.Devices;
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
 * Data Access Object (DAO) for device enrollment denials.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for device enrollment denials.")
public abstract class AbstractDeviceEnrollmentDenialDao extends AbstractModelDao<DeviceEnrollmentDenial>
                                                        implements ReadDao<DeviceEnrollmentDenial> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractDeviceEnrollmentDenialDao() throws MbedCloudException {
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
    public AbstractDeviceEnrollmentDenialDao(ApiClientWrapper client) throws MbedCloudException {
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
    public AbstractDeviceEnrollmentDenialDao(ConnectionOptions options) throws MbedCloudException {
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
    public AbstractDeviceEnrollmentDenialDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected DeviceEnrollmentDenial instantiateModel() {
        return new DeviceEnrollmentDenial();
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
     * Gets a device enrollment denial.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#readDeviceEnrollmentDenial(String, com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentDenial)}
     * 
     * @param deviceEnrollmentDenialId
     *            id of the recorded failed bootstrap attempt. id of the recorded failed bootstrap attempt
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DeviceEnrollmentDenial read(@NonNull String deviceEnrollmentDenialId) throws MbedCloudException {
        return setAndGetModel(((Devices) getModuleOrThrow()).readDeviceEnrollmentDenial(deviceEnrollmentDenialId,
                                                                                        getModel()));
        return getModel();
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;
import com.arm.mbed.cloud.sdk.security.model.CertificateEnrollment;

/**
 * Data Access Object (DAO) for devices.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for devices.")
public class DeviceDao extends AbstractModelDao<Device> implements CrudDao<Device> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceDao() throws MbedCloudException {
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
    @SuppressWarnings({ "unused", "resource" })
    public DeviceDao clone() {
        try {
            return new DeviceDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#createDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @return an added device
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Device create() throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).createDevice(getModel()));
        return getModel();
    }

    /**
     * Adds a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#createDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @param device
     *            a device.
     * @return an added device
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Device create(@NonNull Device device) throws MbedCloudException {
        setModel(device);
        return create();
    }

    /**
     * Deletes a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Devices) getModuleOrThrow()).deleteDevice(getModel());
    }

    /**
     * Deletes a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @param device
     *            a device.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull Device device) throws MbedCloudException {
        setModel(device);
        delete();
    }

    /**
     * Deletes a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#deleteDevice(String)}
     * 
     * @param id
     *            null
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Devices) getModuleOrThrow()).deleteDevice(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected Device instantiateModel() {
        return new Device();
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
     * Gets a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#readDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Device read() throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).readDevice(getModel()));
        return getModel();
    }

    /**
     * Gets a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#readDevice(String)}
     * 
     * @param id
     *            The ID of the device. The device ID is used across all Device Management APIs.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Device read(@NonNull String id) throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).readDevice(id));
        return getModel();
    }

    /**
     * Request certificate renewal.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#renewCertificate(String, com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @param certificateName
     *            The certificate name.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CertificateEnrollment renewCertificate(@NonNull String certificateName) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).renewCertificate(certificateName, getModel());
    }

    /**
     * Request certificate renewal.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#renewCertificate(String, String)}
     * 
     * @param certificateName
     *            The certificate name.
     * @param id
     *            The ID of the certificate enrollment.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CertificateEnrollment renewCertificate(@NonNull String certificateName,
                                                  @NonNull String id) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).renewCertificate(certificateName, id);
    }

    /**
     * Modifies a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#updateDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Device update() throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).updateDevice(getModel()));
        return getModel();
    }

    /**
     * Modifies a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#updateDevice(com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @param device
     *            a device.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Device update(@NonNull Device device) throws MbedCloudException {
        setModel(device);
        return update();
    }

    /**
     * Modifies a device.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#updateDevice(String, com.arm.mbed.cloud.sdk.devices.model.Device)}
     * 
     * @param id
     *            The ID of the device. The device ID is used across all Device Management APIs.
     * @return an updated device
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public Device update(@NonNull String id) throws MbedCloudException {
        setModel(((Devices) getModuleOrThrow()).updateDevice(id, getModel()));
        return getModel();
    }
}

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
    public DeviceDao clone() {
        try {
            return new DeviceDao().configureAndGet(module == null ? null : module.clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#createDevice(Device)}
     */
    @Override
    public void create() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).createDevice(getModel()));
    }

    /**
     * Adds a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#createDevice(Device)}
     * 
     * @param device
     *            a device.
     */
    @Override
    public void create(@NonNull Device device) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(device);
        create();
    }

    /**
     * Deletes a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#deleteDevice(Device)}
     */
    @Override
    public void delete() throws MbedCloudException {
        checkDaoConfiguration();
        ((Devices) module).deleteDevice(getModel());
    }

    /**
     * Deletes a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#deleteDevice(Device)}
     * 
     * @param device
     *            a device.
     */
    @Override
    public void delete(@NonNull Device device) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(device);
        delete();
    }

    /**
     * Deletes a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#deleteDevice(String)}
     * 
     * @param id
     *            null
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Devices) module).deleteDevice(id);
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
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#getDevice(Device)}
     */
    @Override
    public void read() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).getDevice(getModel()));
    }

    /**
     * Gets a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#getDevice(String)}
     * 
     * @param id
     *            The ID of the device. The device ID is used across all Device Management APIs.
     */
    @Override
    public void read(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).getDevice(id));
    }

    /**
     * Request certificate renewal.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#renewCertificate(String,Device)}
     * 
     * @param certificateName
     *            The certificate name.
     * @return something
     */
    public CertificateEnrollment renewCertificate(@NonNull String certificateName) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Devices) module).renewCertificate(certificateName, getModel());
    }

    /**
     * Request certificate renewal.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#renewCertificate(String,String)}
     * 
     * @param certificateName
     *            The certificate name.
     * @param id
     *            The ID of the certificate enrollment.
     * @return something
     */
    public CertificateEnrollment renewCertificate(@NonNull String certificateName,
                                                  @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Devices) module).renewCertificate(certificateName, id);
    }

    /**
     * Modifies a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#updateDevice(Device)}
     */
    @Override
    public void update() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).updateDevice(getModel()));
    }

    /**
     * Modifies a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#updateDevice(Device)}
     * 
     * @param device
     *            a device.
     */
    @Override
    public void update(@NonNull Device device) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(device);
        update();
    }

    /**
     * Modifies a device.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.devices.model.Device#updateDevice(String,Device)}
     * 
     * @param id
     *            The ID of the device. The device ID is used across all Device Management APIs.
     */
    public void update(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Devices) module).updateDevice(id, getModel()));
    }
}

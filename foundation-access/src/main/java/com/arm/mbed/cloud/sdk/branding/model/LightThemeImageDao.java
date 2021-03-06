// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Wed Jan 06 17:07:38 CST 2021. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.annotations.NotImplemented;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.SdkContext;

/**
 * Data Access Object (DAO) for light theme images.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for light theme images.")
public class LightThemeImageDao extends AbstractLightThemeImageDao {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public LightThemeImageDao() throws MbedCloudException {
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
    public LightThemeImageDao(ApiClientWrapper client) throws MbedCloudException {
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
    public LightThemeImageDao(ConnectionOptions options) throws MbedCloudException {
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
    public LightThemeImageDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Clones this instance.
     * 
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    @SuppressWarnings({ "resource", "unused" })
    public LightThemeImageDao clone() {
        try {
            return new LightThemeImageDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                       : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Executes delete.
     *
     * @param id
     *            a string.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     * @throws java.lang.UnsupportedOperationException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public void delete(String id) throws MbedCloudException, UnsupportedOperationException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes read.
     *
     * @param id
     *            a string.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     * @throws java.lang.UnsupportedOperationException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public LightThemeImage read(String id) throws MbedCloudException, UnsupportedOperationException,
                                           NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes update.
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public LightThemeImage update() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes update.
     * 
     * @param modelToUpdate
     *            an sdk model.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public LightThemeImage update(LightThemeImage modelToUpdate) throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }
}

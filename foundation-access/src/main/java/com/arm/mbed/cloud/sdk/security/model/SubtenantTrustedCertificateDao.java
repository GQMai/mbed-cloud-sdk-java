// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Apr 05 10:55:58 BST 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.NotImplemented;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.SdkContext;

/**
 * Data Access Object (DAO) for subtenant trusted certificates.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant trusted certificates.")
public class SubtenantTrustedCertificateDao extends AbstractSubtenantTrustedCertificateDao {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantTrustedCertificateDao() throws MbedCloudException {
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
    public SubtenantTrustedCertificateDao(ApiClientWrapper client) throws MbedCloudException {
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
    public SubtenantTrustedCertificateDao(ConnectionOptions options) throws MbedCloudException {
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
    public SubtenantTrustedCertificateDao(SdkContext sdkContext) throws MbedCloudException {
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
    public SubtenantTrustedCertificateDao clone() {
        try {
            return new SubtenantTrustedCertificateDao().configureAndGet(getModuleOrThrow() == null ? null
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
    public SubtenantTrustedCertificate read(String id) throws MbedCloudException, UnsupportedOperationException,
                                                       NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }
}
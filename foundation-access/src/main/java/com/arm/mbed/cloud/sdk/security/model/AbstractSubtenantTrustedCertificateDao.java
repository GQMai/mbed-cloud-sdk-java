// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantTrustedCertificateDao]
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.Security;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;

/**
 * Data Access Object (DAO) for subtenant trusted certificates.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant trusted certificates.")
public abstract class AbstractSubtenantTrustedCertificateDao extends AbstractModelDao<SubtenantTrustedCertificate>
                                                             implements CrudDao<SubtenantTrustedCertificate> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractSubtenantTrustedCertificateDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantTrustedCertificate create() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).createSubtenantTrustedCertificate(getModel()));
        return getModel();
    }

    /**
     * Adds a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantTrustedCertificate
           create(@NonNull SubtenantTrustedCertificate subtenantTrustedCertificate) throws MbedCloudException {
        setModel(subtenantTrustedCertificate);
        return create();
    }

    /**
     * Adds a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#createSubtenantTrustedCertificate(String, com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @param accountId
     *            The ID of the account.
     * @return an added subtenant trusted certificate
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantTrustedCertificate create(@NonNull String accountId) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).createSubtenantTrustedCertificate(accountId, getModel()));
        return getModel();
    }

    /**
     * Deletes a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#deleteSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteSubtenantTrustedCertificate(getModel());
    }

    /**
     * Deletes a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#deleteSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull SubtenantTrustedCertificate subtenantTrustedCertificate) throws MbedCloudException {
        setModel(subtenantTrustedCertificate);
        delete();
    }

    /**
     * Deletes a subtenant trusted certificate.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#deleteSubtenantTrustedCertificate(String, String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the trusted certificate to be deleted.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void delete(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        ((Security) getModuleOrThrow()).deleteSubtenantTrustedCertificate(accountId, id);
    }

    /**
     * Fetch an existing developer certificate to connect to the bootstrap server.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#getDeveloperCertificateInfo(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeveloperCertificate getDeveloperCertificateInfo() throws MbedCloudException {
        return ((Security) getModuleOrThrow()).getDeveloperCertificateInfo(getModel());
    }

    /**
     * Fetch an existing developer certificate to connect to the bootstrap server.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#getDeveloperCertificateInfo(String)}
     * 
     * @param id
     *            mUUID that uniquely identifies the developer certificate.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeveloperCertificate getDeveloperCertificateInfo(@NonNull String id) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).getDeveloperCertificateInfo(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected SubtenantTrustedCertificate instantiateModel() {
        return new SubtenantTrustedCertificate();
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
        return new Security(client);
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
        return new Security(options);
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
        return new Security(context);
    }

    /**
     * Gets a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#readSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantTrustedCertificate read() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).readSubtenantTrustedCertificate(getModel()));
        return getModel();
    }

    /**
     * Gets a subtenant trusted certificate.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#readSubtenantTrustedCertificate(String, String)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            Entity ID.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantTrustedCertificate read(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).readSubtenantTrustedCertificate(accountId, id));
        return getModel();
    }

    /**
     * Modifies a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantTrustedCertificate update() throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).updateSubtenantTrustedCertificate(getModel()));
        return getModel();
    }

    /**
     * Modifies a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateSubtenantTrustedCertificate(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public SubtenantTrustedCertificate
           update(@NonNull SubtenantTrustedCertificate subtenantTrustedCertificate) throws MbedCloudException {
        setModel(subtenantTrustedCertificate);
        return update();
    }

    /**
     * Modifies a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#updateSubtenantTrustedCertificate(String, String, com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            Entity ID.
     * @return an updated subtenant trusted certificate
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public SubtenantTrustedCertificate update(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        setModel(((Security) getModuleOrThrow()).updateSubtenantTrustedCertificate(accountId, id, getModel()));
        return getModel();
    }
}

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
     */
    public AbstractSubtenantTrustedCertificateDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#createSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     */
    @Override
    public void create() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).createSubtenantTrustedCertificate(getModel()));
    }

    /**
     * Adds a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#createSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     */
    @Override
    public void create(@NonNull SubtenantTrustedCertificate subtenantTrustedCertificate) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(subtenantTrustedCertificate);
        create();
    }

    /**
     * Adds a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#createSubtenantTrustedCertificate(String,SubtenantTrustedCertificate)}
     * 
     * @param accountId
     *            The ID of the account.
     */
    public void create(@NonNull String accountId) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).createSubtenantTrustedCertificate(accountId, getModel()));
    }

    /**
     * Deletes a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#deleteSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     */
    @Override
    public void delete() throws MbedCloudException {
        checkDaoConfiguration();
        ((Security) module).deleteSubtenantTrustedCertificate(getModel());
    }

    /**
     * Deletes a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#deleteSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     */
    @Override
    public void delete(@NonNull SubtenantTrustedCertificate subtenantTrustedCertificate) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(subtenantTrustedCertificate);
        delete();
    }

    /**
     * Deletes a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#deleteSubtenantTrustedCertificate(String,String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the trusted certificate to be deleted.
     */
    public void delete(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Security) module).deleteSubtenantTrustedCertificate(accountId, id);
    }

    /**
     * Fetch an existing developer certificate to connect to the bootstrap server.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#getDeveloperCertificateInfo(SubtenantTrustedCertificate)}
     * 
     * @return something
     */
    public DeveloperCertificate getDeveloperCertificateInfo() throws MbedCloudException {
        checkDaoConfiguration();
        return ((Security) module).getDeveloperCertificateInfo(getModel());
    }

    /**
     * Fetch an existing developer certificate to connect to the bootstrap server.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#getDeveloperCertificateInfo(String)}
     * 
     * @param id
     *            mUUID that uniquely identifies the developer certificate.
     * @return something
     */
    public DeveloperCertificate getDeveloperCertificateInfo(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Security) module).getDeveloperCertificateInfo(id);
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
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#getSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     */
    @Override
    public void read() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).getSubtenantTrustedCertificate(getModel()));
    }

    /**
     * Gets a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#getSubtenantTrustedCertificate(String,String)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            Entity ID.
     */
    public void read(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).getSubtenantTrustedCertificate(accountId, id));
    }

    /**
     * Modifies a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#updateSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     */
    @Override
    public void update() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).updateSubtenantTrustedCertificate(getModel()));
    }

    /**
     * Modifies a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#updateSubtenantTrustedCertificate(SubtenantTrustedCertificate)}
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     */
    @Override
    public void update(@NonNull SubtenantTrustedCertificate subtenantTrustedCertificate) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(subtenantTrustedCertificate);
        update();
    }

    /**
     * Modifies a subtenant trusted certificate.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate#updateSubtenantTrustedCertificate(String,String,SubtenantTrustedCertificate)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            Entity ID.
     */
    public void update(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).updateSubtenantTrustedCertificate(accountId, id, getModel()));
    }
}

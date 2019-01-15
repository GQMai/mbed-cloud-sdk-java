// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
 * Data Access Object (DAO) for certificate issuer configs.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for certificate issuer configs.")
public class CertificateIssuerConfigDao extends AbstractModelDao<CertificateIssuerConfig>
                                        implements CrudDao<CertificateIssuerConfig> {
    /**
     * Constructor.
     */
    public CertificateIssuerConfigDao() throws MbedCloudException {
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
    public CertificateIssuerConfigDao clone() {
        try {
            return new CertificateIssuerConfigDao().configureAndGet(module == null ? null : module.clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#createCertificateIssuerConfig(CertificateIssuerConfig)}
     */
    @Override
    public void create() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).createCertificateIssuerConfig(getModel()));
    }

    /**
     * Adds a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#createCertificateIssuerConfig(CertificateIssuerConfig)}
     * 
     * @param createCertificateIssuerConfig
     *            a certificate issuer config.
     */
    @Override
    public void create(@NonNull CertificateIssuerConfig createCertificateIssuerConfig) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(createCertificateIssuerConfig);
        create();
    }

    /**
     * Deletes a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#deleteCertificateIssuerConfig(CertificateIssuerConfig)}
     */
    @Override
    public void delete() throws MbedCloudException {
        checkDaoConfiguration();
        ((Security) module).deleteCertificateIssuerConfig(getModel());
    }

    /**
     * Deletes a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#deleteCertificateIssuerConfig(CertificateIssuerConfig)}
     * 
     * @param certificateIssuerConfig
     *            a certificate issuer config.
     */
    @Override
    public void delete(@NonNull CertificateIssuerConfig certificateIssuerConfig) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(certificateIssuerConfig);
        delete();
    }

    /**
     * Deletes a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#deleteCertificateIssuerConfig(String)}
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     * 
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        ((Security) module).deleteCertificateIssuerConfig(id);
    }

    /**
     * Get certificate issuer configuration.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#getDefault()}
     */
    public void getDefault() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).getDefault());
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected CertificateIssuerConfig instantiateModel() {
        return new CertificateIssuerConfig();
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
     * Gets a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#getCertificateIssuerConfig(CertificateIssuerConfig)}
     */
    @Override
    public void read() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).getCertificateIssuerConfig(getModel()));
    }

    /**
     * Gets a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#getCertificateIssuerConfig(String)}
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     * 
     */
    @Override
    public void read(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).getCertificateIssuerConfig(id));
    }

    /**
     * Modifies a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#updateCertificateIssuerConfig(CertificateIssuerConfig)}
     */
    @Override
    public void update() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).updateCertificateIssuerConfig(getModel()));
    }

    /**
     * Modifies a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#updateCertificateIssuerConfig(CertificateIssuerConfig)}
     * 
     * @param certificateIssuerConfig
     *            a certificate issuer config.
     */
    @Override
    public void update(@NonNull CertificateIssuerConfig certificateIssuerConfig) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(certificateIssuerConfig);
        update();
    }

    /**
     * Modifies a certificate issuer config.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfig#updateCertificateIssuerConfig(CertificateIssuerConfig,String)}
     * 
     * @param id
     *            The ID of the certificate issuer configuration.
     * 
     */
    public void update(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Security) module).updateCertificateIssuerConfig(getModel(), id));
    }
}

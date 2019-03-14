// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
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
 * Data Access Object (DAO) for listing api keys.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing api keys.")
public class ApiKeyListDao extends AbstractModelListDao<ApiKey, ApiKeyListOptions>
                           implements ModelListDao<ApiKey, ApiKeyListOptions> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public ApiKeyListDao() throws MbedCloudException {
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
    public ApiKeyListDao clone() {
        try {
            return new ApiKeyListDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * an api key dao.
     * 
     * @return an api key dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public ApiKeyDao getCorrespondingModelDao() throws MbedCloudException {
        return new ApiKeyDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * an api key dao class.
     * 
     * @return an api key dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<ApiKeyDao> getCorrespondingModelDaoDefinition() {
        return ApiKeyDao.class;
    }

    /**
     * an api key list options.
     * 
     * @return an api key list options
     */
    @Override
    @Internal
    protected ApiKeyListOptions instantiateListOptions() {
        return new ApiKeyListOptions();
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
        return new Accounts(client);
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
        return new Accounts(options);
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
        return new Accounts(context);
    }

    /**
     * Lists api keys matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Accounts#listApiKeys(com.arm.mbed.cloud.sdk.accounts.model.ApiKeyListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of api keys
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    protected ListResponse<ApiKey> requestOnePage(ApiKeyListOptions options) throws MbedCloudException {
        return ((Accounts) getModuleOrThrow()).listApiKeys(options);
    }
}

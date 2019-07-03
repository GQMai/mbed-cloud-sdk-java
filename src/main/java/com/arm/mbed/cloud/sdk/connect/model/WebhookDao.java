// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.connect.model;

import com.arm.mbed.cloud.sdk.Connect;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.DeleteDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import com.arm.mbed.cloud.sdk.common.dao.UpdateDao;

/**
 * Data Access Object (DAO) for webhooks.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for webhooks.")
public class WebhookDao extends AbstractModelDao<Webhook>
                        implements ReadDao<Webhook>, UpdateDao<Webhook>, DeleteDao<Webhook> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public WebhookDao() throws MbedCloudException {
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
    public WebhookDao(ApiClientWrapper client) throws MbedCloudException {
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
    public WebhookDao(ConnectionOptions options) throws MbedCloudException {
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
    public WebhookDao(SdkContext sdkContext) throws MbedCloudException {
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
    public WebhookDao clone() {
        try {
            return new WebhookDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Deletes the webhook.
     *
     * <p>
     * Note: uses internal data model
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Connect) getModuleOrThrow()).deleteWebhook();
    }

    @Override
    public void delete(String id) throws MbedCloudException, UnsupportedOperationException {
        throw new NotImplementedException();
    }

    @Override
    public void delete(Webhook modelToDelete) throws MbedCloudException, UnsupportedOperationException {
        throw new NotImplementedException();
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected Webhook instantiateModel() {
        return new Webhook();
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
        return new Connect(client == null ? null : client.getConnectionOptions());
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
        return new Connect(options);
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
        return context;
    }

    /**
     * Gets the webhook.
     *
     * <p>
     * Note: uses internal data model
     * 
     * @return the webhook set up.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Webhook read() throws MbedCloudException {
        return setAndGetModel(((Connect) getModuleOrThrow()).getWebhook());
    }

    @Override
    public Webhook read(String id) throws MbedCloudException, UnsupportedOperationException {
        throw new NotImplementedException();
    }

    /**
     * Modifies the webhook.
     *
     * <p>
     * Note: uses internal data model
     * 
     * @return the updated webhook.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Webhook update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies the webhook.
     *
     * @param webhook
     *            the webhook.
     * @return the updated webhook.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public Webhook update(@NonNull Webhook webhook) throws MbedCloudException {
        ((Connect) getModuleOrThrow()).updateWebhook(webhook);
        return setAndGetModel(webhook);
    }

}

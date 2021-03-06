// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [LightThemeColorDao]
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.Branding;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.DeleteDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import com.arm.mbed.cloud.sdk.common.dao.UpdateDao;

/**
 * Data Access Object (DAO) for light theme colors.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for light theme colors.")
public abstract class AbstractLightThemeColorDao extends AbstractModelDao<LightThemeColor>
                                                 implements UpdateDao<LightThemeColor>, DeleteDao<LightThemeColor>,
                                                 ReadDao<LightThemeColor> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractLightThemeColorDao() throws MbedCloudException {
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
    public AbstractLightThemeColorDao(ApiClientWrapper client) throws MbedCloudException {
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
    public AbstractLightThemeColorDao(ConnectionOptions options) throws MbedCloudException {
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
    public AbstractLightThemeColorDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Deletes a light theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.LightThemeColorDao#delete(com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        delete(getModel());
    }

    /**
     * Deletes a light theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#deleteLightThemeColor(com.arm.mbed.cloud.sdk.branding.model.LightThemeColorReference)}
     * 
     * @param reference
     *            The name of the branding color.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void delete(@NonNull LightThemeColorReference reference) throws MbedCloudException {
        ((Branding) getModuleOrThrow()).deleteLightThemeColor(reference);
    }

    /**
     * Deletes a light theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#deleteLightThemeColor(com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @param lightThemeColor
     *            a light theme color.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull LightThemeColor lightThemeColor) throws MbedCloudException {
        ((Branding) getModuleOrThrow()).deleteLightThemeColor(lightThemeColor);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected LightThemeColor instantiateModel() {
        return new LightThemeColor();
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
        return new Branding(client);
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
        return new Branding(options);
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
        return new Branding(context);
    }

    /**
     * Gets a light theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.LightThemeColorDao#read(com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public LightThemeColor read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a light theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#readLightThemeColor(com.arm.mbed.cloud.sdk.branding.model.LightThemeColorReference)}
     * 
     * @param reference
     *            Color name.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public LightThemeColor read(@NonNull LightThemeColorReference reference) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).readLightThemeColor(reference));
    }

    /**
     * Gets a light theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#readLightThemeColor(com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @param lightThemeColor
     *            a light theme color.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public LightThemeColor read(@NonNull LightThemeColor lightThemeColor) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).readLightThemeColor(lightThemeColor));
    }

    /**
     * Modifies a light theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.LightThemeColorDao#update(com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public LightThemeColor update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies a light theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.LightThemeColorDao#update(com.arm.mbed.cloud.sdk.branding.model.LightThemeColorReference, com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @param reference
     *            Color name.
     * @return an updated light theme color
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public LightThemeColor update(@NonNull LightThemeColorReference reference) throws MbedCloudException {
        return update(reference, getModel());
    }

    /**
     * Modifies a light theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#updateLightThemeColor(com.arm.mbed.cloud.sdk.branding.model.LightThemeColorReference, com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @param reference
     *            Color name.
     * @param lightThemeColor
     *            a light theme color.
     * @return an updated light theme color
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public LightThemeColor update(@NonNull LightThemeColorReference reference,
                                  @NonNull LightThemeColor lightThemeColor) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).updateLightThemeColor(reference, lightThemeColor));
    }

    /**
     * Modifies a light theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#updateLightThemeColor(com.arm.mbed.cloud.sdk.branding.model.LightThemeColor)}
     * 
     * @param lightThemeColor
     *            a light theme color.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public LightThemeColor update(@NonNull LightThemeColor lightThemeColor) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).updateLightThemeColor(lightThemeColor));
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [DarkThemeColorDao]
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
 * Data Access Object (DAO) for dark theme colors.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for dark theme colors.")
public abstract class AbstractDarkThemeColorDao extends AbstractModelDao<DarkThemeColor>
                                                implements UpdateDao<DarkThemeColor>, DeleteDao<DarkThemeColor>,
                                                ReadDao<DarkThemeColor> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public AbstractDarkThemeColorDao() throws MbedCloudException {
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
    public AbstractDarkThemeColorDao(ApiClientWrapper client) throws MbedCloudException {
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
    public AbstractDarkThemeColorDao(ConnectionOptions options) throws MbedCloudException {
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
    public AbstractDarkThemeColorDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Deletes a dark theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorDao#delete(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete() throws MbedCloudException {
        delete(getModel());
    }

    /**
     * Deletes a dark theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#deleteDarkThemeColor(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorReference)}
     * 
     * @param reference
     *            The name of the branding color.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public void delete(@NonNull DarkThemeColorReference reference) throws MbedCloudException {
        ((Branding) getModuleOrThrow()).deleteDarkThemeColor(reference);
    }

    /**
     * Deletes a dark theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#deleteDarkThemeColor(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @param darkThemeColor
     *            a dark theme color.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public void delete(@NonNull DarkThemeColor darkThemeColor) throws MbedCloudException {
        ((Branding) getModuleOrThrow()).deleteDarkThemeColor(darkThemeColor);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected DarkThemeColor instantiateModel() {
        return new DarkThemeColor();
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
     * Gets a dark theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorDao#read(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DarkThemeColor read() throws MbedCloudException {
        return read(getModel());
    }

    /**
     * Gets a dark theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#readDarkThemeColor(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorReference)}
     * 
     * @param reference
     *            Color name.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DarkThemeColor read(@NonNull DarkThemeColorReference reference) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).readDarkThemeColor(reference));
    }

    /**
     * Gets a dark theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#readDarkThemeColor(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @param darkThemeColor
     *            a dark theme color.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DarkThemeColor read(@NonNull DarkThemeColor darkThemeColor) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).readDarkThemeColor(darkThemeColor));
    }

    /**
     * Modifies a dark theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorDao#update(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DarkThemeColor update() throws MbedCloudException {
        return update(getModel());
    }

    /**
     * Modifies a dark theme color.
     * 
     * <p>
     * Note: uses internal data model
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorDao#update(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorReference, com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @param reference
     *            Color name.
     * @return an updated dark theme color
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DarkThemeColor update(@NonNull DarkThemeColorReference reference) throws MbedCloudException {
        return update(reference, getModel());
    }

    /**
     * Modifies a dark theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#updateDarkThemeColor(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorReference, com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @param reference
     *            Color name.
     * @param darkThemeColor
     *            a dark theme color.
     * @return an updated dark theme color
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DarkThemeColor update(@NonNull DarkThemeColorReference reference,
                                 @NonNull DarkThemeColor darkThemeColor) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).updateDarkThemeColor(reference, darkThemeColor));
    }

    /**
     * Modifies a dark theme color.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Branding#updateDarkThemeColor(com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor)}
     * 
     * @param darkThemeColor
     *            a dark theme color.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    public DarkThemeColor update(@NonNull DarkThemeColor darkThemeColor) throws MbedCloudException {
        return setAndGetModel(((Branding) getModuleOrThrow()).updateDarkThemeColor(darkThemeColor));
    }
}

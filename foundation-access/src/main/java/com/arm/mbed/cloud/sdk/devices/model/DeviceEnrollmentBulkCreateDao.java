// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Jan 11 01:52:39 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.devices.model;

import java.io.File;
import java.net.URL;

import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.FileDownload;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;

/**
 * Data Access Object (DAO) for device enrollment bulk creates.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for device enrollment bulk creates.")
public class DeviceEnrollmentBulkCreateDao extends AbstractDeviceEnrollmentBulkCreateDao {
    /**
     * Constructor.
     */
    public DeviceEnrollmentBulkCreateDao() throws MbedCloudException {
        super();
    }

    /**
     * Download the error report file for the created the bulk enrollment.
     * <p>
     * This method will download the CSV file containing detailed information on status of the bulk enrollment.
     * 
     * @param destination
     *            Destination file. If null, a temporary file will be created.
     * @throws MbedCloudException
     *             if an error happens during the process
     */
    @NonNull
    public FileDownload downloadErrorsReportFile(@Nullable File destination) throws MbedCloudException {
        final URL source = TranslationUtils.toUrl(getModel().getErrorsReportFile());
        return Utils.downloadFile(destination, source, getModuleOrThrow().getClient());
    }

    /**
     * Download the error report file for the created the bulk enrollment.
     * <p>
     * This method will download the CSV file containing detailed information on status of the bulk enrollment.
     * 
     * @param filePath
     *            path of the destination directory or full path to the file. If null, a temporary file will be created.
     * @throws MbedCloudException
     *             if an error happens during the process
     */
    @NonNull
    public FileDownload downloadErrorsReportFile(@Nullable String filePath) throws MbedCloudException {
        final URL source = TranslationUtils.toUrl(getModel().getErrorsReportFile());
        return Utils.downloadFile(filePath == null ? null : new File(filePath), source, getModuleOrThrow().getClient());
    }

    /**
     * Download the full report file for the created of the bulk enrollment.
     * <p>
     * This method will download the CSV file containing detailed information on status of the bulk enrollment.
     * 
     * @param destination
     *            Destination file. If null, a temporary file will be created.
     * @throws MbedCloudException
     *             if an error happens during the process
     */
    public FileDownload downloadFullReportFile(File destination) throws MbedCloudException {
        final URL source = TranslationUtils.toUrl(getModel().getFullReportFile());
        return Utils.downloadFile(destination, source, getModuleOrThrow().getClient());
    }

    /**
     * Download the full report file for the created of the bulk enrollment.
     * <p>
     * This method will download the CSV file containing detailed information on status of the bulk enrollment.
     * 
     * @param filePath
     *            path of the destination directory or full path to the file. If null, a temporary file will be created.
     * @throws MbedCloudException
     *             if an error happens during the process
     */
    public FileDownload downloadFullReportFile(String filePath) throws MbedCloudException {
        final URL source = TranslationUtils.toUrl(getModel().getFullReportFile());
        return Utils.downloadFile(filePath == null ? null : new File(filePath), source, getModuleOrThrow().getClient());
    }

    /**
     * Executes create.
     * 
     * @param modelToCreate
     *            an sdk model.
     */
    @Override
    public DeviceEnrollmentBulkCreate create(DeviceEnrollmentBulkCreate modelToCreate) throws MbedCloudException,
                                                                                       NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes create.
     */
    @Override
    public DeviceEnrollmentBulkCreate create() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @SuppressWarnings("resource")
    @Override
    public DeviceEnrollmentBulkCreateDao clone() {
        try {
            return new DeviceEnrollmentBulkCreateDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                                  : getModuleOrThrow().clone());
        } catch (@SuppressWarnings("unused") MbedCloudException exception) {
            return null;
        }
    }
}

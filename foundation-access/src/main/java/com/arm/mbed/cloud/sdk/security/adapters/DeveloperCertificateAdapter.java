// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DeveloperCertificateRequestData;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DeveloperCertificateResponseData;
import com.arm.mbed.cloud.sdk.security.model.DeveloperCertificate;

/**
 * Adapter for developer certificates.
 */
@Preamble(description = "Adapter for developer certificates.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class DeveloperCertificateAdapter {
    /**
     * Constructor.
     */
    private DeveloperCertificateAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a developer certificate response data into a developer certificate.
     * 
     * @param toBeMapped
     *            a developer certificate response data.
     * @return mapped a developer certificate
     */
    @Internal
    public static DeveloperCertificate map(DeveloperCertificateResponseData toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final DeveloperCertificate developerCertificate = new DeveloperCertificate(toBeMapped.getAccountId(),
                                                                                   toBeMapped.getDeveloperCertificate(),
                                                                                   TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                                   toBeMapped.getDeveloperPrivateKey(),
                                                                                   toBeMapped.getSecurityFileContent());
        developerCertificate.setDescription(toBeMapped.getDescription());
        developerCertificate.setId(toBeMapped.getId());
        developerCertificate.setName(toBeMapped.getName());
        return developerCertificate;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<DeveloperCertificateResponseData, DeveloperCertificate> getMapper() {
        return new GenericAdapter.Mapper<DeveloperCertificateResponseData, DeveloperCertificate>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public DeveloperCertificate map(DeveloperCertificateResponseData toBeMapped) {
                return DeveloperCertificateAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a developer certificate into a developer certificate request data.
     * 
     * @param toBeMapped
     *            a developer certificate.
     * @return mapped a developer certificate request data
     */
    @Internal
    public static DeveloperCertificateRequestData reverseMapAddRequest(DeveloperCertificate toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final DeveloperCertificateRequestData developerCertificateRequestData = new DeveloperCertificateRequestData();
        developerCertificateRequestData.setDescription(toBeMapped.getDescription());
        developerCertificateRequestData.setName(toBeMapped.getName());
        return developerCertificateRequestData;
    }
}

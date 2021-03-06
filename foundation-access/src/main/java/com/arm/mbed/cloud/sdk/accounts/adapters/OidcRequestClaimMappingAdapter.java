// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.OidcRequestClaimMapping;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.OIDCClaimMapping;

/**
 * Adapter for oidc request claim mappings.
 */
@Preamble(description = "Adapter for oidc request claim mappings.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class OidcRequestClaimMappingAdapter {
    /**
     * Constructor.
     */
    private OidcRequestClaimMappingAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps an oidc request claim mapping into an o i d c claim mapping.
     * 
     * @param toBeMapped
     *            an oidc request claim mapping.
     * @return mapped an o i d c claim mapping
     */
    @Internal
    public static OIDCClaimMapping reverseMapAddRequest(OidcRequestClaimMapping toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final OIDCClaimMapping oidcClaimMapping = new OIDCClaimMapping();
        oidcClaimMapping.setEmail(toBeMapped.getEmail());
        oidcClaimMapping.setEmailVerified(toBeMapped.getEmailVerified());
        oidcClaimMapping.setFamilyName(toBeMapped.getFamilyName());
        oidcClaimMapping.setGivenName(toBeMapped.getGivenName());
        oidcClaimMapping.setName(toBeMapped.getName());
        oidcClaimMapping.setPhoneNumber(toBeMapped.getPhoneNumber());
        oidcClaimMapping.setSub(toBeMapped.getSub());
        oidcClaimMapping.setUpdatedAt(toBeMapped.getUpdatedAt());
        oidcClaimMapping.setUpdatedAtPattern(toBeMapped.getUpdatedAtPattern());
        return oidcClaimMapping;
    }

    /**
     * Maps an o i d c claim mapping into an oidc request claim mapping.
     * 
     * @param toBeMapped
     *            an o i d c claim mapping.
     * @return mapped an oidc request claim mapping
     */
    @Internal
    public static OidcRequestClaimMapping map(OIDCClaimMapping toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final OidcRequestClaimMapping oidcRequestClaimMapping = new OidcRequestClaimMapping(toBeMapped.getEmail(),
                                                                                            toBeMapped.getEmailVerified(),
                                                                                            toBeMapped.getFamilyName(),
                                                                                            toBeMapped.getGivenName(),
                                                                                            toBeMapped.getName(),
                                                                                            toBeMapped.getPhoneNumber(),
                                                                                            toBeMapped.getSub(),
                                                                                            toBeMapped.getUpdatedAt(),
                                                                                            toBeMapped.getUpdatedAtPattern());
        return oidcRequestClaimMapping;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<OIDCClaimMapping, OidcRequestClaimMapping> getMapper() {
        return new GenericAdapter.Mapper<OIDCClaimMapping, OidcRequestClaimMapping>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public OidcRequestClaimMapping map(OIDCClaimMapping toBeMapped) {
                return OidcRequestClaimMappingAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps an oidc request claim mapping into an o i d c claim mapping.
     * 
     * @param toBeMapped
     *            an oidc request claim mapping.
     * @return mapped an o i d c claim mapping
     */
    @Internal
    public static OIDCClaimMapping reverseMapUpdateRequest(OidcRequestClaimMapping toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final OIDCClaimMapping oidcClaimMapping = new OIDCClaimMapping();
        oidcClaimMapping.setEmail(toBeMapped.getEmail());
        oidcClaimMapping.setEmailVerified(toBeMapped.getEmailVerified());
        oidcClaimMapping.setFamilyName(toBeMapped.getFamilyName());
        oidcClaimMapping.setGivenName(toBeMapped.getGivenName());
        oidcClaimMapping.setName(toBeMapped.getName());
        oidcClaimMapping.setPhoneNumber(toBeMapped.getPhoneNumber());
        oidcClaimMapping.setSub(toBeMapped.getSub());
        oidcClaimMapping.setUpdatedAt(toBeMapped.getUpdatedAt());
        oidcClaimMapping.setUpdatedAtPattern(toBeMapped.getUpdatedAtPattern());
        return oidcClaimMapping;
    }
}

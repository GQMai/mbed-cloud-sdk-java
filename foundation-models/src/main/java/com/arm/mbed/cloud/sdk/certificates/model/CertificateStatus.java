package com.arm.mbed.cloud.sdk.certificates.model;

import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

@Preamble(description = "Certificate status")
public enum CertificateStatus implements SdkEnum {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);
    private final String value;

    /**
     * Constructor.
     * 
     * @param value
     *            string representation.
     */
    private CertificateStatus(String string) {
        this.value = string;
    }

    /**
     * States whether it is the default value.
     * 
     * @see SdkEnum#isDefault()
     */
    @Override
    public boolean isDefault() {
        return this == getDefault();
    }

    /**
     * States whether the value is unknown and an error happened during parsing.
     * 
     * @see SdkEnum#isUnknownValue()
     */
    @Override
    public boolean isUnknownValue() {
        return this == getUnknownEnum();
    }

    /**
     * Gets default certificate status.
     * 
     * @return default status.
     */
    public static CertificateStatus getDefault() {
        return INACTIVE;
    }

    /**
     * Gets Unknown state value.
     * 
     * @return unknown state.
     */
    public static CertificateStatus getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets the certificate status from its string representation.
     * 
     * @param string
     *            string describing the certificate status.
     * @return corresponding certificate status. If not found, default status is returned.
     */
    public static CertificateStatus getStatus(@Nullable String string) {
        if (string == null) {
            return getDefault();
        }
        final String trimmedString = string.trim();
        for (final CertificateStatus status : values()) {
            if (status.toString().equalsIgnoreCase(trimmedString)) {
                return status;
            }
        }
        return getDefault();
    }

    /**
     * Gets string representation.
     * 
     * @see SdkEnum#getString()
     */
    @Override
    public String getString() {
        return value;
    }

    /**
     * Gets string representation.
     * 
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return getString();
    }

    /**
     * Merges two statuses.
     * 
     * @see SdkEnum#merge(SdkEnum, SdkEnum)
     */
    @Override
    public <T extends SdkEnum> T merge(T obj1, T obj2) {
        if (obj1 == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj1;
        }
        if (obj1.isDefault()) {
            return obj2;
        }
        if (obj2.isDefault()) {
            return obj1;
        }
        return obj2;
    }
}

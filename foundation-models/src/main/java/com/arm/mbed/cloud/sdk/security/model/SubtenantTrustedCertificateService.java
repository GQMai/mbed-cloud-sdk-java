// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

/**
 * Subtenant trusted certificate service.
 */
@Preamble(description = "Subtenant trusted certificate service.")
public enum SubtenantTrustedCertificateService implements SdkEnum {
    BOOTSTRAP("bootstrap"),

    LWM2M("lwm2m"),

    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -132722459919212L;

    /**
     * string representation.
     */
    @Internal
    @Required
    @DefaultValue("BOOTSTRAP")
    private final String string;

    /**
     * Internal constructor.
     * 
     * @param string
     *            string representation.
     */
    @Internal
    SubtenantTrustedCertificateService(@DefaultValue("BOOTSTRAP") String string) {
        this.string = string;
    }

    /**
     * Gets string representation.
     * 
     * @return string
     */
    @Override
    @Internal
    public String getString() {
        return string;
    }

    /**
     * toString.
     *
     * <p>
     * 
     * @see java.lang.Enum#toString()
     * @return the string representation of this value
     */
    @Override
    public String toString() {
        return getString();
    }

    /**
     * States whether it is the default value.
     *
     * <p>
     * 
     * @see SdkEnum#isDefault()
     * @return true if this is the default value; false otherwise
     */
    @Override
    public boolean isDefault() {
        return this == getDefault();
    }

    /**
     * States whether the value is unknown and an error happened during parsing.
     *
     * <p>
     * 
     * @see SdkEnum#isUnknownValue()
     * @return true if this is an unknown value; false otherwise
     */
    @Override
    public boolean isUnknownValue() {
        return this == getUnknownEnum();
    }

    /**
     * Gets default subtenant trusted certificate service.
     * 
     * @return default subtenant trusted certificate service
     */
    public static SubtenantTrustedCertificateService getDefault() {
        return BOOTSTRAP;
    }

    /**
     * Gets unknown subtenant trusted certificate service value.
     * 
     * @return unknown subtenant trusted certificate service
     */
    public static SubtenantTrustedCertificateService getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets subtenant trusted certificate service from its string representation.
     * 
     * @param value
     *            string.
     * @return corresponding subtenant trusted certificate service or default subtenant trusted certificate service if
     *         not recognised.
     */
    public static SubtenantTrustedCertificateService getValue(String value) {
        if (value == null) {
            return getDefault();
        }
        final String trimmedValue = value.trim();
        for (final SubtenantTrustedCertificateService option : values()) {
            if (option.getString().equalsIgnoreCase(trimmedValue)) {
                return option;
            }
        }
        return getDefault();
    }

    /**
     * Merges two states.
     *
     * <p>
     * 
     * @see SdkEnum#merge(SdkEnum, SdkEnum)
     * @param <T>
     *            type of an sdk enum
     * @param obj1
     *            a subtenant trusted certificate service.
     * @param obj2
     *            a subtenant trusted certificate service.
     * @return the merged enumerator
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

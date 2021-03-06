// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkEnum;

/**
 * Campaign device metadata deployment state.
 */
@Preamble(description = "Campaign device metadata deployment state.")
public enum CampaignDeviceMetadataDeploymentState implements SdkEnum {
    DEPLOYED("deployed"),

    DEREGISTERED("deregistered"),

    FAILED_CONNECTOR_CHANNEL_UPDATE("failed_connector_channel_update"),

    MANIFESTREMOVED("manifestremoved"),

    PENDING("pending"),

    UPDATED_CONNECTOR_CHANNEL("updated_connector_channel"),

    UNKNOWN_ENUM(SDK_UNKNOWN_ENUM_VALUE);

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 1719512310311316L;

    /**
     * string representation.
     */
    @Internal
    @Required
    @DefaultValue("DEPLOYED")
    private final String string;

    /**
     * Internal constructor.
     * 
     * @param string
     *            string representation.
     */
    @Internal
    CampaignDeviceMetadataDeploymentState(@DefaultValue("DEPLOYED") String string) {
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
     * Gets default campaign device metadata deployment state.
     * 
     * @return default campaign device metadata deployment state
     */
    public static CampaignDeviceMetadataDeploymentState getDefault() {
        return DEPLOYED;
    }

    /**
     * Gets unknown campaign device metadata deployment state value.
     * 
     * @return unknown campaign device metadata deployment state
     */
    public static CampaignDeviceMetadataDeploymentState getUnknownEnum() {
        return UNKNOWN_ENUM;
    }

    /**
     * Gets campaign device metadata deployment state from its string representation.
     * 
     * @param value
     *            string.
     * @return corresponding campaign device metadata deployment state or default campaign device metadata deployment
     *         state if not recognised.
     */
    public static CampaignDeviceMetadataDeploymentState getValue(String value) {
        if (value == null) {
            return getDefault();
        }
        final String trimmedValue = value.trim();
        for (final CampaignDeviceMetadataDeploymentState option : values()) {
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
     *            a campaign device metadata deployment state.
     * @param obj2
     *            a campaign device metadata deployment state.
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

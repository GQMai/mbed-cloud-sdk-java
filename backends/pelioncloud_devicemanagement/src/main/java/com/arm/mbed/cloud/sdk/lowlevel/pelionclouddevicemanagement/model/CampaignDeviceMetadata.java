/*
 * Pelion Device Management API
 * Pelion Device Management API build from the publicly defined API definitions.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * CampaignDeviceMetadata
 */

public class CampaignDeviceMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("campaign")
    private String campaign = null;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    /**
     * The state of the update campaign on the device.
     */
    @JsonAdapter(DeploymentStateEnum.Adapter.class)
    public enum DeploymentStateEnum {
        PENDING("pending"),

        UPDATED_CONNECTOR_CHANNEL("updated_connector_channel"),

        FAILED_CONNECTOR_CHANNEL_UPDATE("failed_connector_channel_update"),

        DEPLOYED("deployed"),

        MANIFESTREMOVED("manifestremoved"),

        DEREGISTERED("deregistered");

        private String value;

        DeploymentStateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DeploymentStateEnum fromValue(String text) {
            for (DeploymentStateEnum b : DeploymentStateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<DeploymentStateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DeploymentStateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DeploymentStateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DeploymentStateEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("deployment_state")
    private DeploymentStateEnum deploymentState = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("device_id")
    private String deviceId = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("mechanism")
    private String mechanism = null;

    @SerializedName("mechanism_url")
    private String mechanismUrl = null;

    @SerializedName("name")
    private String name = "default_object_name";

    @SerializedName("object")
    private String object = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public CampaignDeviceMetadata campaign(String campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * The device&#39;s campaign ID.
     * 
     * @return campaign
     **/
    @ApiModelProperty(example = "015bf72fccda00000000000100100280", value = "The device's campaign ID.")
    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public CampaignDeviceMetadata createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the entity was created.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was created.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CampaignDeviceMetadata deploymentState(DeploymentStateEnum deploymentState) {
        this.deploymentState = deploymentState;
        return this;
    }

    /**
     * The state of the update campaign on the device.
     * 
     * @return deploymentState
     **/
    @ApiModelProperty(value = "The state of the update campaign on the device.")
    public DeploymentStateEnum getDeploymentState() {
        return deploymentState;
    }

    public void setDeploymentState(DeploymentStateEnum deploymentState) {
        this.deploymentState = deploymentState;
    }

    public CampaignDeviceMetadata description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "a description", value = "Description.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CampaignDeviceMetadata deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * The device ID.
     * 
     * @return deviceId
     **/
    @ApiModelProperty(example = "015c2fec9bba0000000000010010036f", value = "The device ID.")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CampaignDeviceMetadata etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * API resource entity version.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:58.753425Z", value = "API resource entity version.")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public CampaignDeviceMetadata id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The metadata record ID.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "015c3029f6f7000000000001001000c3", value = "The metadata record ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CampaignDeviceMetadata mechanism(String mechanism) {
        this.mechanism = mechanism;
        return this;
    }

    /**
     * How the firmware is delivered (connector or direct).
     * 
     * @return mechanism
     **/
    @ApiModelProperty(example = "connector", value = "How the firmware is delivered (connector or direct).")
    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public CampaignDeviceMetadata mechanismUrl(String mechanismUrl) {
        this.mechanismUrl = mechanismUrl;
        return this;
    }

    /**
     * The Device Management Connect URL.
     * 
     * @return mechanismUrl
     **/
    @ApiModelProperty(value = "The Device Management Connect URL.")
    public String getMechanismUrl() {
        return mechanismUrl;
    }

    public void setMechanismUrl(String mechanismUrl) {
        this.mechanismUrl = mechanismUrl;
    }

    public CampaignDeviceMetadata name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The record name.
     * 
     * @return name
     **/
    @ApiModelProperty(value = "The record name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CampaignDeviceMetadata object(String object) {
        this.object = object;
        return this;
    }

    /**
     * The entity name: always &#39;update-campaign-device-metadata&#39;.
     * 
     * @return object
     **/
    @ApiModelProperty(value = "The entity name: always 'update-campaign-device-metadata'.")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public CampaignDeviceMetadata updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the entity was updated.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was updated.")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignDeviceMetadata campaignDeviceMetadata = (CampaignDeviceMetadata) o;
        return Objects.equals(this.campaign, campaignDeviceMetadata.campaign)
               && Objects.equals(this.createdAt, campaignDeviceMetadata.createdAt)
               && Objects.equals(this.deploymentState, campaignDeviceMetadata.deploymentState)
               && Objects.equals(this.description, campaignDeviceMetadata.description)
               && Objects.equals(this.deviceId, campaignDeviceMetadata.deviceId)
               && Objects.equals(this.etag, campaignDeviceMetadata.etag)
               && Objects.equals(this.id, campaignDeviceMetadata.id)
               && Objects.equals(this.mechanism, campaignDeviceMetadata.mechanism)
               && Objects.equals(this.mechanismUrl, campaignDeviceMetadata.mechanismUrl)
               && Objects.equals(this.name, campaignDeviceMetadata.name)
               && Objects.equals(this.object, campaignDeviceMetadata.object)
               && Objects.equals(this.updatedAt, campaignDeviceMetadata.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaign, createdAt, deploymentState, description, deviceId, etag, id, mechanism,
                            mechanismUrl, name, object, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignDeviceMetadata {\n");

        sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
        sb.append("    mechanismUrl: ").append(toIndentedString(mechanismUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

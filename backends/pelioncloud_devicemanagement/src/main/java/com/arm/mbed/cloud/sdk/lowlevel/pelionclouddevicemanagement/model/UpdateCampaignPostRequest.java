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
import java.math.BigDecimal;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * UpdateCampaignPostRequest
 */

public class UpdateCampaignPostRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("approval_required")
    private Boolean approvalRequired = false;

    @SerializedName("autostop")
    private Boolean autostop = true;

    @SerializedName("autostop_success_percent")
    private BigDecimal autostopSuccessPercent = null;

    /**
     * How the campaign adds devices. A &#x60;one-shot&#x60; campaign does not add new devices after it has started. A
     * &#x60;continuous&#x60; campaign means that devices may be added to the campaign after it has started. The default
     * is &#x60;one-shot&#x60;.
     */
    @JsonAdapter(CampaignStrategyEnum.Adapter.class)
    public enum CampaignStrategyEnum {
        ONE_SHOT("one-shot"),

        CONTINUOUS("continuous");

        private String value;

        CampaignStrategyEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CampaignStrategyEnum fromValue(String text) {
            for (CampaignStrategyEnum b : CampaignStrategyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CampaignStrategyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CampaignStrategyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CampaignStrategyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CampaignStrategyEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("campaign_strategy")
    private CampaignStrategyEnum campaignStrategy = CampaignStrategyEnum.ONE_SHOT;

    @SerializedName("description")
    private String description = null;

    @SerializedName("device_filter")
    private String deviceFilter = null;

    @SerializedName("name")
    private String name = "default_object_name";

    @SerializedName("root_manifest_id")
    private String rootManifestId = null;

    /**
     * DEPRECATED: The state of the campaign (use phase instead)
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        DRAFT("draft"),

        SCHEDULED("scheduled");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("state")
    private StateEnum state = null;

    @SerializedName("when")
    private DateTime when = null;

    public UpdateCampaignPostRequest approvalRequired(Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
        return this;
    }

    /**
     * Get approvalRequired
     * 
     * @return approvalRequired
     **/
    @ApiModelProperty(value = "")
    public Boolean isApprovalRequired() {
        return approvalRequired;
    }

    public void setApprovalRequired(Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
    }

    public UpdateCampaignPostRequest autostop(Boolean autostop) {
        this.autostop = autostop;
        return this;
    }

    /**
     * Get autostop
     * 
     * @return autostop
     **/
    @ApiModelProperty(value = "")
    public Boolean isAutostop() {
        return autostop;
    }

    public void setAutostop(Boolean autostop) {
        this.autostop = autostop;
    }

    public UpdateCampaignPostRequest autostopSuccessPercent(BigDecimal autostopSuccessPercent) {
        this.autostopSuccessPercent = autostopSuccessPercent;
        return this;
    }

    /**
     * Get autostopSuccessPercent
     * 
     * @return autostopSuccessPercent
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAutostopSuccessPercent() {
        return autostopSuccessPercent;
    }

    public void setAutostopSuccessPercent(BigDecimal autostopSuccessPercent) {
        this.autostopSuccessPercent = autostopSuccessPercent;
    }

    public UpdateCampaignPostRequest campaignStrategy(CampaignStrategyEnum campaignStrategy) {
        this.campaignStrategy = campaignStrategy;
        return this;
    }

    /**
     * How the campaign adds devices. A &#x60;one-shot&#x60; campaign does not add new devices after it has started. A
     * &#x60;continuous&#x60; campaign means that devices may be added to the campaign after it has started. The default
     * is &#x60;one-shot&#x60;.
     * 
     * @return campaignStrategy
     **/
    @ApiModelProperty(value = "How the campaign adds devices. A `one-shot` campaign does not add new devices after it has started. A `continuous` campaign means that devices may be added to the campaign after it has started. The default is `one-shot`.")
    public CampaignStrategyEnum getCampaignStrategy() {
        return campaignStrategy;
    }

    public void setCampaignStrategy(CampaignStrategyEnum campaignStrategy) {
        this.campaignStrategy = campaignStrategy;
    }

    public UpdateCampaignPostRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * An optional description of the campaign.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "a description", value = "An optional description of the campaign.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCampaignPostRequest deviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
        return this;
    }

    /**
     * The filter for the devices the campaign targets. Refer to this using the filter ID.
     * 
     * @return deviceFilter
     **/
    @ApiModelProperty(example = "state__eq=registered", required = true,
                      value = "The filter for the devices the campaign targets. Refer to this using the filter ID.")
    public String getDeviceFilter() {
        return deviceFilter;
    }

    public void setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
    }

    public UpdateCampaignPostRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name for this campaign.
     * 
     * @return name
     **/
    @ApiModelProperty(value = "The name for this campaign.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCampaignPostRequest rootManifestId(String rootManifestId) {
        this.rootManifestId = rootManifestId;
        return this;
    }

    /**
     * Get rootManifestId
     * 
     * @return rootManifestId
     **/
    @ApiModelProperty(example = "016e83b46477000000000001001001f3", value = "")
    public String getRootManifestId() {
        return rootManifestId;
    }

    public void setRootManifestId(String rootManifestId) {
        this.rootManifestId = rootManifestId;
    }

    public UpdateCampaignPostRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * DEPRECATED: The state of the campaign (use phase instead)
     * 
     * @return state
     **/
    @ApiModelProperty(value = "DEPRECATED: The state of the campaign (use phase instead)")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public UpdateCampaignPostRequest when(DateTime when) {
        this.when = when;
        return this;
    }

    /**
     * The scheduled start time for the update campaign. Not in use.
     * 
     * @return when
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z",
                      value = "The scheduled start time for the update campaign. Not in use.")
    public DateTime getWhen() {
        return when;
    }

    public void setWhen(DateTime when) {
        this.when = when;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCampaignPostRequest updateCampaignPostRequest = (UpdateCampaignPostRequest) o;
        return Objects.equals(this.approvalRequired, updateCampaignPostRequest.approvalRequired)
               && Objects.equals(this.autostop, updateCampaignPostRequest.autostop)
               && Objects.equals(this.autostopSuccessPercent, updateCampaignPostRequest.autostopSuccessPercent)
               && Objects.equals(this.campaignStrategy, updateCampaignPostRequest.campaignStrategy)
               && Objects.equals(this.description, updateCampaignPostRequest.description)
               && Objects.equals(this.deviceFilter, updateCampaignPostRequest.deviceFilter)
               && Objects.equals(this.name, updateCampaignPostRequest.name)
               && Objects.equals(this.rootManifestId, updateCampaignPostRequest.rootManifestId)
               && Objects.equals(this.state, updateCampaignPostRequest.state)
               && Objects.equals(this.when, updateCampaignPostRequest.when);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalRequired, autostop, autostopSuccessPercent, campaignStrategy, description,
                            deviceFilter, name, rootManifestId, state, when);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCampaignPostRequest {\n");

        sb.append("    approvalRequired: ").append(toIndentedString(approvalRequired)).append("\n");
        sb.append("    autostop: ").append(toIndentedString(autostop)).append("\n");
        sb.append("    autostopSuccessPercent: ").append(toIndentedString(autostopSuccessPercent)).append("\n");
        sb.append("    campaignStrategy: ").append(toIndentedString(campaignStrategy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceFilter: ").append(toIndentedString(deviceFilter)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rootManifestId: ").append(toIndentedString(rootManifestId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

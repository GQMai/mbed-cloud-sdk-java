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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * The number of messages from the device to Device Management.
 */
@ApiModel(description = "The number of messages from the device to Device Management.")

public class DeviceToPelionMessagesCounter implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("bootstrap_requests")
    private Integer bootstrapRequests = null;

    @SerializedName("est_requests")
    private Integer estRequests = null;

    @SerializedName("observations")
    private Integer observations = null;

    @SerializedName("proxy_responses")
    private Integer proxyResponses = null;

    @SerializedName("registration_deletes")
    private Integer registrationDeletes = null;

    @SerializedName("registration_updates")
    private Integer registrationUpdates = null;

    @SerializedName("registrations")
    private Integer registrations = null;

    @SerializedName("total_count")
    private Long totalCount = null;

    public DeviceToPelionMessagesCounter bootstrapRequests(Integer bootstrapRequests) {
        this.bootstrapRequests = bootstrapRequests;
        return this;
    }

    /**
     * Get bootstrapRequests
     * 
     * @return bootstrapRequests
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getBootstrapRequests() {
        return bootstrapRequests;
    }

    public void setBootstrapRequests(Integer bootstrapRequests) {
        this.bootstrapRequests = bootstrapRequests;
    }

    public DeviceToPelionMessagesCounter estRequests(Integer estRequests) {
        this.estRequests = estRequests;
        return this;
    }

    /**
     * Get estRequests
     * 
     * @return estRequests
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getEstRequests() {
        return estRequests;
    }

    public void setEstRequests(Integer estRequests) {
        this.estRequests = estRequests;
    }

    public DeviceToPelionMessagesCounter observations(Integer observations) {
        this.observations = observations;
        return this;
    }

    /**
     * Get observations
     * 
     * @return observations
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getObservations() {
        return observations;
    }

    public void setObservations(Integer observations) {
        this.observations = observations;
    }

    public DeviceToPelionMessagesCounter proxyResponses(Integer proxyResponses) {
        this.proxyResponses = proxyResponses;
        return this;
    }

    /**
     * Get proxyResponses
     * 
     * @return proxyResponses
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getProxyResponses() {
        return proxyResponses;
    }

    public void setProxyResponses(Integer proxyResponses) {
        this.proxyResponses = proxyResponses;
    }

    public DeviceToPelionMessagesCounter registrationDeletes(Integer registrationDeletes) {
        this.registrationDeletes = registrationDeletes;
        return this;
    }

    /**
     * Get registrationDeletes
     * 
     * @return registrationDeletes
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getRegistrationDeletes() {
        return registrationDeletes;
    }

    public void setRegistrationDeletes(Integer registrationDeletes) {
        this.registrationDeletes = registrationDeletes;
    }

    public DeviceToPelionMessagesCounter registrationUpdates(Integer registrationUpdates) {
        this.registrationUpdates = registrationUpdates;
        return this;
    }

    /**
     * Get registrationUpdates
     * 
     * @return registrationUpdates
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getRegistrationUpdates() {
        return registrationUpdates;
    }

    public void setRegistrationUpdates(Integer registrationUpdates) {
        this.registrationUpdates = registrationUpdates;
    }

    public DeviceToPelionMessagesCounter registrations(Integer registrations) {
        this.registrations = registrations;
        return this;
    }

    /**
     * Get registrations
     * 
     * @return registrations
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Integer registrations) {
        this.registrations = registrations;
    }

    public DeviceToPelionMessagesCounter totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The number of all inbound requests from devices to Device Management. minimum: 0
     * 
     * @return totalCount
     **/
    @ApiModelProperty(required = true, value = "The number of all inbound requests from devices to Device Management.")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceToPelionMessagesCounter deviceToPelionMessagesCounter = (DeviceToPelionMessagesCounter) o;
        return Objects.equals(this.bootstrapRequests, deviceToPelionMessagesCounter.bootstrapRequests)
               && Objects.equals(this.estRequests, deviceToPelionMessagesCounter.estRequests)
               && Objects.equals(this.observations, deviceToPelionMessagesCounter.observations)
               && Objects.equals(this.proxyResponses, deviceToPelionMessagesCounter.proxyResponses)
               && Objects.equals(this.registrationDeletes, deviceToPelionMessagesCounter.registrationDeletes)
               && Objects.equals(this.registrationUpdates, deviceToPelionMessagesCounter.registrationUpdates)
               && Objects.equals(this.registrations, deviceToPelionMessagesCounter.registrations)
               && Objects.equals(this.totalCount, deviceToPelionMessagesCounter.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bootstrapRequests, estRequests, observations, proxyResponses, registrationDeletes,
                            registrationUpdates, registrations, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceToPelionMessagesCounter {\n");

        sb.append("    bootstrapRequests: ").append(toIndentedString(bootstrapRequests)).append("\n");
        sb.append("    estRequests: ").append(toIndentedString(estRequests)).append("\n");
        sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
        sb.append("    proxyResponses: ").append(toIndentedString(proxyResponses)).append("\n");
        sb.append("    registrationDeletes: ").append(toIndentedString(registrationDeletes)).append("\n");
        sb.append("    registrationUpdates: ").append(toIndentedString(registrationUpdates)).append("\n");
        sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
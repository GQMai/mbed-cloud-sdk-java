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
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * AsyncIDResponse
 */

public class AsyncIDResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("ct")
    private String ct = null;

    @SerializedName("error")
    private String error = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("max-age")
    private String maxAge = null;

    @SerializedName("payload")
    private String payload = null;

    @SerializedName("status")
    private Integer status = null;

    public AsyncIDResponse ct(String ct) {
        this.ct = ct;
        return this;
    }

    /**
     * The content type.
     * 
     * @return ct
     **/
    @ApiModelProperty(example = "text/plain", value = "The content type.")
    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public AsyncIDResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
     * An optional error message describing the error. Please refer to status listing above.
     * 
     * @return error
     **/
    @ApiModelProperty(example = "TIMEOUT",
                      value = "An optional error message describing the error. Please refer to status listing above. ")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public AsyncIDResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique ID of the asynchronous response.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "9e3c96b8-c4d7-496a-ab90-cc732b9b560e",
                      value = "The unique ID of the asynchronous response.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AsyncIDResponse maxAge(String maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Determines how long this value stays valid in the cache, in seconds. 0 means that the value is not stored in the
     * cache.
     * 
     * @return maxAge
     **/
    @ApiModelProperty(example = "60",
                      value = "Determines how long this value stays valid in the cache, in seconds. 0 means that the value is not stored in the cache.")
    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public AsyncIDResponse payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Requested data, base64 encoded.
     * 
     * @return payload
     **/
    @ApiModelProperty(example = "My4zMQ==", value = "Requested data, base64 encoded.")
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public AsyncIDResponse status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * States whether sending a command to the device succeeded or failed.&lt;br/&gt; |Code|Description| |-|-| |**200**|
     * Operation succeeded. The playload contains result of the operation from the device. | |**404**| Endpoint does not
     * have requested resource. | |**412**| Precondition failed and operation was not executed. Device responded with
     * 4.12 CoAP response code.| |**413**| Request entity is too large and could not be delivered to the device. |
     * |**415**| Endpoint does not support media type. | |**429**| Expired request was removed from queue
     * (REQUEST_EXPIRED), device requested deregistration (DEVICE_REMOVED_REGISTRATION), or device was suspended
     * (DEVICE_BLOCKED). | |**502**| Request to the device failed and retry count exceeded. Last retry failed to
     * establish TCP or TLS connection to endpoint. | |**503**| Request to the device failed and retry count exceeded.
     * Last retry failed because endpoint is currently unavailable (NOT_CONNECTED). | |**504**| Request to the device
     * failed and retry count exceeded. Last retry failed, as device did not respond in the time of protocol-specific
     * retransmission logic (TIMEOUT). | &lt;br/&gt;
     * 
     * @return status
     **/
    @ApiModelProperty(example = "200",
                      value = " States whether sending a command to the device succeeded or failed.<br/> |Code|Description| |-|-| |**200**| Operation succeeded. The playload contains result of the operation from the device. | |**404**| Endpoint does not have requested resource. | |**412**| Precondition failed and operation was not executed. Device responded with 4.12 CoAP response code.| |**413**| Request entity is too large and could not be delivered to the device. | |**415**| Endpoint does not support media type. | |**429**| Expired request was removed from queue (REQUEST_EXPIRED), device requested deregistration (DEVICE_REMOVED_REGISTRATION), or device was suspended (DEVICE_BLOCKED). | |**502**| Request to the device failed and retry count exceeded. Last retry failed to establish TCP or TLS connection to endpoint. | |**503**| Request to the device failed and retry count exceeded. Last retry failed because endpoint is currently unavailable (NOT_CONNECTED). | |**504**| Request to the device failed and retry count exceeded. Last retry failed, as device did not respond in the time of protocol-specific retransmission logic (TIMEOUT). | <br/> ")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AsyncIDResponse asyncIDResponse = (AsyncIDResponse) o;
        return Objects.equals(this.ct, asyncIDResponse.ct) && Objects.equals(this.error, asyncIDResponse.error)
               && Objects.equals(this.id, asyncIDResponse.id) && Objects.equals(this.maxAge, asyncIDResponse.maxAge)
               && Objects.equals(this.payload, asyncIDResponse.payload)
               && Objects.equals(this.status, asyncIDResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ct, error, id, maxAge, payload, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncIDResponse {\n");

        sb.append("    ct: ").append(toIndentedString(ct)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

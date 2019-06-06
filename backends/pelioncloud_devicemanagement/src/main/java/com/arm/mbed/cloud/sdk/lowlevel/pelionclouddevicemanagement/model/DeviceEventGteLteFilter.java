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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceEventGteLteFilter
 */

public class DeviceEventGteLteFilter implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("date_time")
    private DateTime dateTime = null;

    public DeviceEventGteLteFilter dateTime(DateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get dateTime
     * 
     * @return dateTime
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceEventGteLteFilter deviceEventGteLteFilter = (DeviceEventGteLteFilter) o;
        return Objects.equals(this.dateTime, deviceEventGteLteFilter.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceEventGteLteFilter {\n");

        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

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
 * BusinessModelHistory
 */

public class BusinessModelHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("business_model")
    private BusinessModel businessModel = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public BusinessModelHistory businessModel(BusinessModel businessModel) {
        this.businessModel = businessModel;
        return this;
    }

    /**
     * Get businessModel
     * 
     * @return businessModel
     **/
    @ApiModelProperty(value = "")
    public BusinessModel getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(BusinessModel businessModel) {
        this.businessModel = businessModel;
    }

    public BusinessModelHistory updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Last update UTC time RFC3339.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2018-02-14T15:24:14Z", value = "Last update UTC time RFC3339.")
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
        BusinessModelHistory businessModelHistory = (BusinessModelHistory) o;
        return Objects.equals(this.businessModel, businessModelHistory.businessModel)
               && Objects.equals(this.updatedAt, businessModelHistory.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessModel, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessModelHistory {\n");

        sb.append("    businessModel: ").append(toIndentedString(businessModel)).append("\n");
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

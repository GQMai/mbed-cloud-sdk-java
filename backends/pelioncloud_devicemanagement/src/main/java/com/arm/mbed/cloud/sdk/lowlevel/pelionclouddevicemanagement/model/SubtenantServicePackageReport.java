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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * SubtenantServicePackageReport
 */

public class SubtenantServicePackageReport implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("quota_usage")
    private List<QuotaUsageReport> quotaUsage = new ArrayList<QuotaUsageReport>();

    public SubtenantServicePackageReport quotaUsage(List<QuotaUsageReport> quotaUsage) {
        this.quotaUsage = quotaUsage;
        return this;
    }

    public SubtenantServicePackageReport addQuotaUsageItem(QuotaUsageReport quotaUsageItem) {
        this.quotaUsage.add(quotaUsageItem);
        return this;
    }

    /**
     * Get quotaUsage
     * 
     * @return quotaUsage
     **/
    @ApiModelProperty(required = true, value = "")
    public List<QuotaUsageReport> getQuotaUsage() {
        return quotaUsage;
    }

    public void setQuotaUsage(List<QuotaUsageReport> quotaUsage) {
        this.quotaUsage = quotaUsage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubtenantServicePackageReport subtenantServicePackageReport = (SubtenantServicePackageReport) o;
        return Objects.equals(this.quotaUsage, subtenantServicePackageReport.quotaUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtenantServicePackageReport {\n");

        sb.append("    quotaUsage: ").append(toIndentedString(quotaUsage)).append("\n");
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

/*
 * Billing API
 * Billing API allows users to retrieve billing reports and service package details.
 *
 * OpenAPI spec version: 1.4.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.billing.model.AggregatedQuotaUsageReport;
import com.arm.mbed.cloud.sdk.internal.billing.model.QuotaUsageReport;
import com.arm.mbed.cloud.sdk.internal.billing.model.ServicePackageMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Account&#39;s current service package data included in reporting.
 */
@ApiModel(description = "Account's current service package data included in reporting.")

public class ServicePackageReport implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("aggregated_quota_usage")
  private List<AggregatedQuotaUsageReport> aggregatedQuotaUsage = new ArrayList<AggregatedQuotaUsageReport>();

  @SerializedName("metadata")
  private ServicePackageMetadata metadata = null;

  @SerializedName("quota_usage")
  private List<QuotaUsageReport> quotaUsage = new ArrayList<QuotaUsageReport>();

  public ServicePackageReport aggregatedQuotaUsage(List<AggregatedQuotaUsageReport> aggregatedQuotaUsage) {
    this.aggregatedQuotaUsage = aggregatedQuotaUsage;
    return this;
  }

  public ServicePackageReport addAggregatedQuotaUsageItem(AggregatedQuotaUsageReport aggregatedQuotaUsageItem) {
    this.aggregatedQuotaUsage.add(aggregatedQuotaUsageItem);
    return this;
  }

   /**
   * Get aggregatedQuotaUsage
   * @return aggregatedQuotaUsage
  **/
  @ApiModelProperty(required = true, value = "")
  public List<AggregatedQuotaUsageReport> getAggregatedQuotaUsage() {
    return aggregatedQuotaUsage;
  }

  public void setAggregatedQuotaUsage(List<AggregatedQuotaUsageReport> aggregatedQuotaUsage) {
    this.aggregatedQuotaUsage = aggregatedQuotaUsage;
  }

  public ServicePackageReport metadata(ServicePackageMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public ServicePackageMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ServicePackageMetadata metadata) {
    this.metadata = metadata;
  }

  public ServicePackageReport quotaUsage(List<QuotaUsageReport> quotaUsage) {
    this.quotaUsage = quotaUsage;
    return this;
  }

  public ServicePackageReport addQuotaUsageItem(QuotaUsageReport quotaUsageItem) {
    this.quotaUsage.add(quotaUsageItem);
    return this;
  }

   /**
   * Get quotaUsage
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
    ServicePackageReport servicePackageReport = (ServicePackageReport) o;
    return Objects.equals(this.aggregatedQuotaUsage, servicePackageReport.aggregatedQuotaUsage) &&
        Objects.equals(this.metadata, servicePackageReport.metadata) &&
        Objects.equals(this.quotaUsage, servicePackageReport.quotaUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedQuotaUsage, metadata, quotaUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePackageReport {\n");
    
    sb.append("    aggregatedQuotaUsage: ").append(toIndentedString(aggregatedQuotaUsage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    quotaUsage: ").append(toIndentedString(quotaUsage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * The response includes the URL to download the raw billing data.
 */
@ApiModel(description = "The response includes the URL to download the raw billing data.")

public class BillingReportRawDataResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("url")
  private String url = null;

  public BillingReportRawDataResponse filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The filename of the raw billing data file to be downloaded. It contains the file extensions.
   * @return filename
  **/
  @ApiModelProperty(required = true, value = "The filename of the raw billing data file to be downloaded. It contains the file extensions.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public BillingReportRawDataResponse object(String object) {
    this.object = object;
    return this;
  }

   /**
   * API Resource name.
   * @return object
  **/
  @ApiModelProperty(required = true, value = "API Resource name.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public BillingReportRawDataResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to download the raw billing data.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL to download the raw billing data.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingReportRawDataResponse billingReportRawDataResponse = (BillingReportRawDataResponse) o;
    return Objects.equals(this.filename, billingReportRawDataResponse.filename) &&
        Objects.equals(this.object, billingReportRawDataResponse.object) &&
        Objects.equals(this.url, billingReportRawDataResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, object, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingReportRawDataResponse {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


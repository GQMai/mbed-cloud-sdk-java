/*
 * Connect API
 * mbed Cloud Connect API allows web applications to communicate with devices. You can subscribe to device resources and read/write values to them. mbed Cloud Connect makes connectivity to devices easy by queuing requests and caching resource values.
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.mds.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Webhook
 */

public class Webhook implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("url")
  private String url = null;

  @SerializedName("headers")
  private Object headers = null;

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to which the notifications are sent. We recommend that you serve this URL over HTTPS.
   * @return url
  **/
  @ApiModelProperty(example = "null", required = true, value = "The URL to which the notifications are sent. We recommend that you serve this URL over HTTPS.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook headers(Object headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Headers (key/value) that are sent with the notification. Optional.
   * @return headers
  **/
  @ApiModelProperty(example = "null", value = "Headers (key/value) that are sent with the notification. Optional.")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.headers, webhook.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

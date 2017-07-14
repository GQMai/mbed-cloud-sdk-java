/*
 * Device Directory API
 * This is the API Documentation for the mbed device directory update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.model.DeviceEventData;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * DeviceEventPage
 */

public class DeviceEventPage implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("object")
  private String object = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("after")
  private String after = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("data")
  private List<DeviceEventData> data = new ArrayList<DeviceEventData>();

  @SerializedName("order")
  private String order = null;

  public DeviceEventPage object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DeviceEventPage hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public DeviceEventPage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public DeviceEventPage after(String after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public DeviceEventPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public DeviceEventPage data(List<DeviceEventData> data) {
    this.data = data;
    return this;
  }

  public DeviceEventPage addDataItem(DeviceEventData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DeviceEventData> getData() {
    return data;
  }

  public void setData(List<DeviceEventData> data) {
    this.data = data;
  }

  public DeviceEventPage order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEventPage deviceEventPage = (DeviceEventPage) o;
    return Objects.equals(this.object, deviceEventPage.object) &&
        Objects.equals(this.hasMore, deviceEventPage.hasMore) &&
        Objects.equals(this.totalCount, deviceEventPage.totalCount) &&
        Objects.equals(this.after, deviceEventPage.after) &&
        Objects.equals(this.limit, deviceEventPage.limit) &&
        Objects.equals(this.data, deviceEventPage.data) &&
        Objects.equals(this.order, deviceEventPage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, hasMore, totalCount, after, limit, data, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEventPage {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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


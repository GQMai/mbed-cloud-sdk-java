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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Quota history of the service package.
 */
@ApiModel(description = "Quota history of the service package.")

public class ServicePackageQuotaHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("after")
    private String after = null;

    @SerializedName("data")
    private List<ServicePackageQuotaHistoryItem> data = new ArrayList<ServicePackageQuotaHistoryItem>();

    @SerializedName("has_more")
    private Boolean hasMore = null;

    @SerializedName("limit")
    private Integer limit = null;

    /**
     * Always set to &#x60;service-package-quota-history&#x60;.
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        HISTORY("service-package-quota-history");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ObjectEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ObjectEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ObjectEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("object")
    private ObjectEnum object = null;

    @SerializedName("order")
    private String order = null;

    @SerializedName("total_count")
    private Integer totalCount = null;

    public ServicePackageQuotaHistoryResponse after(String after) {
        this.after = after;
        return this;
    }

    /**
     * ID after which to fetch quota history.
     * 
     * @return after
     **/
    @ApiModelProperty(value = "ID after which to fetch quota history.")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public ServicePackageQuotaHistoryResponse data(List<ServicePackageQuotaHistoryItem> data) {
        this.data = data;
        return this;
    }

    public ServicePackageQuotaHistoryResponse addDataItem(ServicePackageQuotaHistoryItem dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * List of history items. Empty list if no entries are available.
     * 
     * @return data
     **/
    @ApiModelProperty(required = true, value = "List of history items. Empty list if no entries are available.")
    public List<ServicePackageQuotaHistoryItem> getData() {
        return data;
    }

    public void setData(List<ServicePackageQuotaHistoryItem> data) {
        this.data = data;
    }

    public ServicePackageQuotaHistoryResponse hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * If there is next available quota history paged response to fetch.
     * 
     * @return hasMore
     **/
    @ApiModelProperty(required = true, value = "If there is next available quota history paged response to fetch.")
    public Boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ServicePackageQuotaHistoryResponse limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Maximum number of quota history entries in one paged response. minimum: 2 maximum: 1000
     * 
     * @return limit
     **/
    @ApiModelProperty(required = true, value = "Maximum number of quota history entries in one paged response.")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ServicePackageQuotaHistoryResponse object(ObjectEnum object) {
        this.object = object;
        return this;
    }

    /**
     * Always set to &#x60;service-package-quota-history&#x60;.
     * 
     * @return object
     **/
    @ApiModelProperty(required = true, value = "Always set to `service-package-quota-history`.")
    public ObjectEnum getObject() {
        return object;
    }

    public void setObject(ObjectEnum object) {
        this.object = object;
    }

    public ServicePackageQuotaHistoryResponse order(String order) {
        this.order = order;
        return this;
    }

    /**
     * History item record order based on creation time.
     * 
     * @return order
     **/
    @ApiModelProperty(required = true, value = "History item record order based on creation time.")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ServicePackageQuotaHistoryResponse totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Sum of all quota history entries that should be returned. minimum: 0
     * 
     * @return totalCount
     **/
    @ApiModelProperty(required = true, value = "Sum of all quota history entries that should be returned.")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
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
        ServicePackageQuotaHistoryResponse servicePackageQuotaHistoryResponse = (ServicePackageQuotaHistoryResponse) o;
        return Objects.equals(this.after, servicePackageQuotaHistoryResponse.after)
               && Objects.equals(this.data, servicePackageQuotaHistoryResponse.data)
               && Objects.equals(this.hasMore, servicePackageQuotaHistoryResponse.hasMore)
               && Objects.equals(this.limit, servicePackageQuotaHistoryResponse.limit)
               && Objects.equals(this.object, servicePackageQuotaHistoryResponse.object)
               && Objects.equals(this.order, servicePackageQuotaHistoryResponse.order)
               && Objects.equals(this.totalCount, servicePackageQuotaHistoryResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePackageQuotaHistoryResponse {\n");

        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

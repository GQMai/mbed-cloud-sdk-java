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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CertificateEnrollmentListResponse
 */

public class CertificateEnrollmentListResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("after")
    private String after = null;

    @SerializedName("data")
    private List<CertificateEnrollment> data = null;

    @SerializedName("has_more")
    private Boolean hasMore = null;

    @SerializedName("limit")
    private Integer limit = null;

    /**
     * Describes the type of objects in the list.
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        LIST("list");

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

    /**
     * Record order based on creation time. Acceptable values: ASC, DESC. Default: ASC.
     */
    @JsonAdapter(OrderEnum.Adapter.class)
    public enum OrderEnum {
        ASC("ASC"),

        DESC("DESC");

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrderEnum fromValue(String text) {
            for (OrderEnum b : OrderEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OrderEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("order")
    private OrderEnum order = null;

    @SerializedName("total_count")
    private Integer totalCount = null;

    public CertificateEnrollmentListResponse after(String after) {
        this.after = after;
        return this;
    }

    /**
     * The entity ID to fetch after the given one.
     * 
     * @return after
     **/
    @ApiModelProperty(example = "01625daa23230a580a0100bd00000000",
                      value = "The entity ID to fetch after the given one.")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public CertificateEnrollmentListResponse data(List<CertificateEnrollment> data) {
        this.data = data;
        return this;
    }

    public CertificateEnrollmentListResponse addDataItem(CertificateEnrollment dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<CertificateEnrollment>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * List of certificate enrollments.
     * 
     * @return data
     **/
    @ApiModelProperty(value = "List of certificate enrollments.")
    public List<CertificateEnrollment> getData() {
        return data;
    }

    public void setData(List<CertificateEnrollment> data) {
        this.data = data;
    }

    public CertificateEnrollmentListResponse hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Flag indicating whether there are more results.
     * 
     * @return hasMore
     **/
    @ApiModelProperty(value = "Flag indicating whether there are more results.")
    public Boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public CertificateEnrollmentListResponse limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * The number of results to return.
     * 
     * @return limit
     **/
    @ApiModelProperty(value = "The number of results to return.")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public CertificateEnrollmentListResponse object(ObjectEnum object) {
        this.object = object;
        return this;
    }

    /**
     * Describes the type of objects in the list.
     * 
     * @return object
     **/
    @ApiModelProperty(value = "Describes the type of objects in the list.")
    public ObjectEnum getObject() {
        return object;
    }

    public void setObject(ObjectEnum object) {
        this.object = object;
    }

    public CertificateEnrollmentListResponse order(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * Record order based on creation time. Acceptable values: ASC, DESC. Default: ASC.
     * 
     * @return order
     **/
    @ApiModelProperty(value = "Record order based on creation time. Acceptable values: ASC, DESC. Default: ASC.")
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public CertificateEnrollmentListResponse totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The total number of records.
     * 
     * @return totalCount
     **/
    @ApiModelProperty(value = "The total number of records.")
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
        CertificateEnrollmentListResponse certificateEnrollmentListResponse = (CertificateEnrollmentListResponse) o;
        return Objects.equals(this.after, certificateEnrollmentListResponse.after)
               && Objects.equals(this.data, certificateEnrollmentListResponse.data)
               && Objects.equals(this.hasMore, certificateEnrollmentListResponse.hasMore)
               && Objects.equals(this.limit, certificateEnrollmentListResponse.limit)
               && Objects.equals(this.object, certificateEnrollmentListResponse.object)
               && Objects.equals(this.order, certificateEnrollmentListResponse.order)
               && Objects.equals(this.totalCount, certificateEnrollmentListResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateEnrollmentListResponse {\n");

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

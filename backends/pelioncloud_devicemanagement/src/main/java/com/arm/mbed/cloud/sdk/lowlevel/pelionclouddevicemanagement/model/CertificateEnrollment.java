/*
 * Mbed Cloud API
 * The full Mbed Cloud API
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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * CertificateEnrollment
 */

public class CertificateEnrollment implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("certificate_name")
    private String certificateName = null;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("device_id")
    private String deviceId = null;

    /**
     * The result of certificate enrollment request.
     */
    @JsonAdapter(EnrollResultEnum.Adapter.class)
    public enum EnrollResultEnum {
        SUCCESS("success"),

        FAILURE("failure");

        private String value;

        EnrollResultEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EnrollResultEnum fromValue(String text) {
            for (EnrollResultEnum b : EnrollResultEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<EnrollResultEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EnrollResultEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EnrollResultEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EnrollResultEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("enroll_result")
    private EnrollResultEnum enrollResult = null;

    @SerializedName("enroll_result_detail")
    private String enrollResultDetail = null;

    /**
     * The status of certificate enrollment request.
     */
    @JsonAdapter(EnrollStatusEnum.Adapter.class)
    public enum EnrollStatusEnum {
        NEW("new"),

        COMPLETED("completed");

        private String value;

        EnrollStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EnrollStatusEnum fromValue(String text) {
            for (EnrollStatusEnum b : EnrollStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<EnrollStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EnrollStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EnrollStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EnrollStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("enroll_status")
    private EnrollStatusEnum enrollStatus = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("id")
    private String id = null;

    /**
     * Gets or Sets object
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        ENROLLMENT("certificate-enrollment");

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

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public CertificateEnrollment certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * The certificate name.
     * 
     * @return certificateName
     **/
    @ApiModelProperty(example = "customer.dlms", required = true, value = "The certificate name.")
    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public CertificateEnrollment createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Creation UTC time RFC3339.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-01-01T00:00:00Z", required = true, value = "Creation UTC time RFC3339.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CertificateEnrollment deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * The device ID.
     * 
     * @return deviceId
     **/
    @ApiModelProperty(example = "01625daa23230a580a0100bd00000000", required = true, value = "The device ID.")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CertificateEnrollment enrollResult(EnrollResultEnum enrollResult) {
        this.enrollResult = enrollResult;
        return this;
    }

    /**
     * The result of certificate enrollment request.
     * 
     * @return enrollResult
     **/
    @ApiModelProperty(example = "success", value = "The result of certificate enrollment request.")
    public EnrollResultEnum getEnrollResult() {
        return enrollResult;
    }

    public void setEnrollResult(EnrollResultEnum enrollResult) {
        this.enrollResult = enrollResult;
    }

    public CertificateEnrollment enrollResultDetail(String enrollResultDetail) {
        this.enrollResultDetail = enrollResultDetail;
        return this;
    }

    /**
     * Additional information in case of failure.
     * 
     * @return enrollResultDetail
     **/
    @ApiModelProperty(example = "The device is currently processing too many certificate renewals.",
                      value = "Additional information in case of failure.")
    public String getEnrollResultDetail() {
        return enrollResultDetail;
    }

    public void setEnrollResultDetail(String enrollResultDetail) {
        this.enrollResultDetail = enrollResultDetail;
    }

    public CertificateEnrollment enrollStatus(EnrollStatusEnum enrollStatus) {
        this.enrollStatus = enrollStatus;
        return this;
    }

    /**
     * The status of certificate enrollment request.
     * 
     * @return enrollStatus
     **/
    @ApiModelProperty(value = "The status of certificate enrollment request.")
    public EnrollStatusEnum getEnrollStatus() {
        return enrollStatus;
    }

    public void setEnrollStatus(EnrollStatusEnum enrollStatus) {
        this.enrollStatus = enrollStatus;
    }

    public CertificateEnrollment etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Entity instance signature.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "1", required = true, value = "Entity instance signature.")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public CertificateEnrollment id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The certificate enrollment ID.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "01612df56f3b0a580a010fc700000000", required = true,
                      value = "The certificate enrollment ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificateEnrollment object(ObjectEnum object) {
        this.object = object;
        return this;
    }

    /**
     * Get object
     * 
     * @return object
     **/
    @ApiModelProperty(value = "")
    public ObjectEnum getObject() {
        return object;
    }

    public void setObject(ObjectEnum object) {
        this.object = object;
    }

    public CertificateEnrollment updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Update UTC time RFC3339.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2017-01-01T00:00:00Z", value = "Update UTC time RFC3339.")
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
        CertificateEnrollment certificateEnrollment = (CertificateEnrollment) o;
        return Objects.equals(this.certificateName, certificateEnrollment.certificateName)
               && Objects.equals(this.createdAt, certificateEnrollment.createdAt)
               && Objects.equals(this.deviceId, certificateEnrollment.deviceId)
               && Objects.equals(this.enrollResult, certificateEnrollment.enrollResult)
               && Objects.equals(this.enrollResultDetail, certificateEnrollment.enrollResultDetail)
               && Objects.equals(this.enrollStatus, certificateEnrollment.enrollStatus)
               && Objects.equals(this.etag, certificateEnrollment.etag)
               && Objects.equals(this.id, certificateEnrollment.id)
               && Objects.equals(this.object, certificateEnrollment.object)
               && Objects.equals(this.updatedAt, certificateEnrollment.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateName, createdAt, deviceId, enrollResult, enrollResultDetail, enrollStatus, etag,
                            id, object, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateEnrollment {\n");

        sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    enrollResult: ").append(toIndentedString(enrollResult)).append("\n");
        sb.append("    enrollResultDetail: ").append(toIndentedString(enrollResultDetail)).append("\n");
        sb.append("    enrollStatus: ").append(toIndentedString(enrollStatus)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

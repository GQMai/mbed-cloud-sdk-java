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
import java.util.UUID;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * FirmwareManifest
 */

public class FirmwareManifest implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("datafile")
    private String datafile = null;

    @SerializedName("datafile_size")
    private Long datafileSize = null;

    @SerializedName("delivered_payload_digest")
    private String deliveredPayloadDigest = null;

    @SerializedName("delivered_payload_size")
    private Long deliveredPayloadSize = null;

    /**
     * Type of the payload to deliver to the device (full or delta image).
     */
    @JsonAdapter(DeliveredPayloadTypeEnum.Adapter.class)
    public enum DeliveredPayloadTypeEnum {
        FULL("full"),

        DELTA("delta");

        private String value;

        DeliveredPayloadTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DeliveredPayloadTypeEnum fromValue(String text) {
            for (DeliveredPayloadTypeEnum b : DeliveredPayloadTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<DeliveredPayloadTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter,
                              final DeliveredPayloadTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DeliveredPayloadTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DeliveredPayloadTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("delivered_payload_type")
    private DeliveredPayloadTypeEnum deliveredPayloadType = null;

    @SerializedName("delivered_payload_url")
    private String deliveredPayloadUrl = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("device_class")
    private UUID deviceClass = null;

    @SerializedName("device_vendor")
    private UUID deviceVendor = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("key_table")
    private String keyTable = null;

    /**
     * Version of the manifest schema (1 or 3).
     */
    @JsonAdapter(ManifestSchemaVersionEnum.Adapter.class)
    public enum ManifestSchemaVersionEnum {
        _1("1"),

        _3("3");

        private String value;

        ManifestSchemaVersionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ManifestSchemaVersionEnum fromValue(String text) {
            for (ManifestSchemaVersionEnum b : ManifestSchemaVersionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ManifestSchemaVersionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter,
                              final ManifestSchemaVersionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ManifestSchemaVersionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ManifestSchemaVersionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("manifest_schema_version")
    private ManifestSchemaVersionEnum manifestSchemaVersion = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("parsed_raw_manifest")
    private Object parsedRawManifest = null;

    @SerializedName("precursor_payload_digest")
    private String precursorPayloadDigest = null;

    @SerializedName("timestamp")
    private DateTime timestamp = null;

    @SerializedName("update_priority")
    private Long updatePriority = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public FirmwareManifest createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the entity was created.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was created.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public FirmwareManifest datafile(String datafile) {
        this.datafile = datafile;
        return this;
    }

    /**
     * The URL of the ASN.1 DER-encoded firmware manifest binary.
     * 
     * @return datafile
     **/
    @ApiModelProperty(example = "http://bucket.com/mymanifest.manifest",
                      value = "The URL of the ASN.1 DER-encoded firmware manifest binary.")
    public String getDatafile() {
        return datafile;
    }

    public void setDatafile(String datafile) {
        this.datafile = datafile;
    }

    public FirmwareManifest datafileSize(Long datafileSize) {
        this.datafileSize = datafileSize;
        return this;
    }

    /**
     * The size of the firmware manifest in bytes.
     * 
     * @return datafileSize
     **/
    @ApiModelProperty(value = "The size of the firmware manifest in bytes.")
    public Long getDatafileSize() {
        return datafileSize;
    }

    public void setDatafileSize(Long datafileSize) {
        this.datafileSize = datafileSize;
    }

    public FirmwareManifest deliveredPayloadDigest(String deliveredPayloadDigest) {
        this.deliveredPayloadDigest = deliveredPayloadDigest;
        return this;
    }

    /**
     * Digest (SHA256, hex-encoded) of the payload to deliver to the device.
     * 
     * @return deliveredPayloadDigest
     **/
    @ApiModelProperty(example = "c520fc771c0482ad39e983d27cf725a7c724fe58c616129a34a420d1941068bc",
                      value = "Digest (SHA256, hex-encoded) of the payload to deliver to the device.")
    public String getDeliveredPayloadDigest() {
        return deliveredPayloadDigest;
    }

    public void setDeliveredPayloadDigest(String deliveredPayloadDigest) {
        this.deliveredPayloadDigest = deliveredPayloadDigest;
    }

    public FirmwareManifest deliveredPayloadSize(Long deliveredPayloadSize) {
        this.deliveredPayloadSize = deliveredPayloadSize;
        return this;
    }

    /**
     * The size in bytes of the payload to deliver to the device.
     * 
     * @return deliveredPayloadSize
     **/
    @ApiModelProperty(value = "The size in bytes of the payload to deliver to the device.")
    public Long getDeliveredPayloadSize() {
        return deliveredPayloadSize;
    }

    public void setDeliveredPayloadSize(Long deliveredPayloadSize) {
        this.deliveredPayloadSize = deliveredPayloadSize;
    }

    public FirmwareManifest deliveredPayloadType(DeliveredPayloadTypeEnum deliveredPayloadType) {
        this.deliveredPayloadType = deliveredPayloadType;
        return this;
    }

    /**
     * Type of the payload to deliver to the device (full or delta image).
     * 
     * @return deliveredPayloadType
     **/
    @ApiModelProperty(value = "Type of the payload to deliver to the device (full or delta image).")
    public DeliveredPayloadTypeEnum getDeliveredPayloadType() {
        return deliveredPayloadType;
    }

    public void setDeliveredPayloadType(DeliveredPayloadTypeEnum deliveredPayloadType) {
        this.deliveredPayloadType = deliveredPayloadType;
    }

    public FirmwareManifest deliveredPayloadUrl(String deliveredPayloadUrl) {
        this.deliveredPayloadUrl = deliveredPayloadUrl;
        return this;
    }

    /**
     * The URL of the payload to deliver to the device.
     * 
     * @return deliveredPayloadUrl
     **/
    @ApiModelProperty(example = "http://bucket.com/myimage.elf",
                      value = "The URL of the payload to deliver to the device.")
    public String getDeliveredPayloadUrl() {
        return deliveredPayloadUrl;
    }

    public void setDeliveredPayloadUrl(String deliveredPayloadUrl) {
        this.deliveredPayloadUrl = deliveredPayloadUrl;
    }

    public FirmwareManifest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the firmware manifest.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "", value = "The description of the firmware manifest.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FirmwareManifest deviceClass(UUID deviceClass) {
        this.deviceClass = deviceClass;
        return this;
    }

    /**
     * The device class ID.
     * 
     * @return deviceClass
     **/
    @ApiModelProperty(example = "42c4d8de-704d-546e-b9d3-1ce1eb316167", value = "The device class ID.")
    public UUID getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(UUID deviceClass) {
        this.deviceClass = deviceClass;
    }

    public FirmwareManifest deviceVendor(UUID deviceVendor) {
        this.deviceVendor = deviceVendor;
        return this;
    }

    /**
     * The device vendor ID.
     * 
     * @return deviceVendor
     **/
    @ApiModelProperty(example = "5d645eae-c231-5a89-9764-2e655cd94fa8", value = "The device vendor ID.")
    public UUID getDeviceVendor() {
        return deviceVendor;
    }

    public void setDeviceVendor(UUID deviceVendor) {
        this.deviceVendor = deviceVendor;
    }

    public FirmwareManifest etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * API resource entity version.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:58.753425Z", value = "API resource entity version.")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public FirmwareManifest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The firmware manifest ID.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "12345678901234567890123456789012", value = "The firmware manifest ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirmwareManifest keyTable(String keyTable) {
        this.keyTable = keyTable;
        return this;
    }

    /**
     * The key table of pre-shared keys for devices.
     * 
     * @return keyTable
     **/
    @ApiModelProperty(example = "http://example.com/key-table", value = "The key table of pre-shared keys for devices.")
    public String getKeyTable() {
        return keyTable;
    }

    public void setKeyTable(String keyTable) {
        this.keyTable = keyTable;
    }

    public FirmwareManifest manifestSchemaVersion(ManifestSchemaVersionEnum manifestSchemaVersion) {
        this.manifestSchemaVersion = manifestSchemaVersion;
        return this;
    }

    /**
     * Version of the manifest schema (1 or 3).
     * 
     * @return manifestSchemaVersion
     **/
    @ApiModelProperty(value = "Version of the manifest schema (1 or 3).")
    public ManifestSchemaVersionEnum getManifestSchemaVersion() {
        return manifestSchemaVersion;
    }

    public void setManifestSchemaVersion(ManifestSchemaVersionEnum manifestSchemaVersion) {
        this.manifestSchemaVersion = manifestSchemaVersion;
    }

    public FirmwareManifest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the manifest.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "manifest_name", value = "The name of the manifest.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirmwareManifest object(String object) {
        this.object = object;
        return this;
    }

    /**
     * Entity name: always &#39;firmware-manifest&#39;.
     * 
     * @return object
     **/
    @ApiModelProperty(example = "firmware-manifest", value = "Entity name: always 'firmware-manifest'.")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public FirmwareManifest parsedRawManifest(Object parsedRawManifest) {
        this.parsedRawManifest = parsedRawManifest;
        return this;
    }

    /**
     * Raw manifest in JSON format, parsed from ASN.1 DER encoding. Fields may change. Backwards compatibility is not
     * guaranteed. Recommended for debugging only.
     * 
     * @return parsedRawManifest
     **/
    @ApiModelProperty(value = "Raw manifest in JSON format, parsed from ASN.1 DER encoding. Fields may change. Backwards compatibility is not guaranteed. Recommended for debugging only. ")
    public Object getParsedRawManifest() {
        return parsedRawManifest;
    }

    public void setParsedRawManifest(Object parsedRawManifest) {
        this.parsedRawManifest = parsedRawManifest;
    }

    public FirmwareManifest precursorPayloadDigest(String precursorPayloadDigest) {
        this.precursorPayloadDigest = precursorPayloadDigest;
        return this;
    }

    /**
     * Digest (SHA256, hex-encoded) of the currently installed payload.
     * 
     * @return precursorPayloadDigest
     **/
    @ApiModelProperty(example = "54d640fcd687c9b13420b9be66a265494899002aad1b7370cfb3dbfd7fbec42f",
                      value = "Digest (SHA256, hex-encoded) of the currently installed payload.")
    public String getPrecursorPayloadDigest() {
        return precursorPayloadDigest;
    }

    public void setPrecursorPayloadDigest(String precursorPayloadDigest) {
        this.precursorPayloadDigest = precursorPayloadDigest;
    }

    public FirmwareManifest timestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The firmware manifest version as a timestamp.
     * 
     * @return timestamp
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The firmware manifest version as a timestamp.")
    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public FirmwareManifest updatePriority(Long updatePriority) {
        this.updatePriority = updatePriority;
        return this;
    }

    /**
     * Update priority, passed to the application callback when an update is performed. Allows the application to make
     * application-specific decisions.
     * 
     * @return updatePriority
     **/
    @ApiModelProperty(value = "Update priority, passed to the application callback when an update is performed. Allows the application to make application-specific decisions.")
    public Long getUpdatePriority() {
        return updatePriority;
    }

    public void setUpdatePriority(Long updatePriority) {
        this.updatePriority = updatePriority;
    }

    public FirmwareManifest updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the entity was updated.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "The time the entity was updated.")
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
        FirmwareManifest firmwareManifest = (FirmwareManifest) o;
        return Objects.equals(this.createdAt, firmwareManifest.createdAt)
               && Objects.equals(this.datafile, firmwareManifest.datafile)
               && Objects.equals(this.datafileSize, firmwareManifest.datafileSize)
               && Objects.equals(this.deliveredPayloadDigest, firmwareManifest.deliveredPayloadDigest)
               && Objects.equals(this.deliveredPayloadSize, firmwareManifest.deliveredPayloadSize)
               && Objects.equals(this.deliveredPayloadType, firmwareManifest.deliveredPayloadType)
               && Objects.equals(this.deliveredPayloadUrl, firmwareManifest.deliveredPayloadUrl)
               && Objects.equals(this.description, firmwareManifest.description)
               && Objects.equals(this.deviceClass, firmwareManifest.deviceClass)
               && Objects.equals(this.deviceVendor, firmwareManifest.deviceVendor)
               && Objects.equals(this.etag, firmwareManifest.etag) && Objects.equals(this.id, firmwareManifest.id)
               && Objects.equals(this.keyTable, firmwareManifest.keyTable)
               && Objects.equals(this.manifestSchemaVersion, firmwareManifest.manifestSchemaVersion)
               && Objects.equals(this.name, firmwareManifest.name)
               && Objects.equals(this.object, firmwareManifest.object)
               && Objects.equals(this.parsedRawManifest, firmwareManifest.parsedRawManifest)
               && Objects.equals(this.precursorPayloadDigest, firmwareManifest.precursorPayloadDigest)
               && Objects.equals(this.timestamp, firmwareManifest.timestamp)
               && Objects.equals(this.updatePriority, firmwareManifest.updatePriority)
               && Objects.equals(this.updatedAt, firmwareManifest.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, datafile, datafileSize, deliveredPayloadDigest, deliveredPayloadSize,
                            deliveredPayloadType, deliveredPayloadUrl, description, deviceClass, deviceVendor, etag, id,
                            keyTable, manifestSchemaVersion, name, object, parsedRawManifest, precursorPayloadDigest,
                            timestamp, updatePriority, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirmwareManifest {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    datafile: ").append(toIndentedString(datafile)).append("\n");
        sb.append("    datafileSize: ").append(toIndentedString(datafileSize)).append("\n");
        sb.append("    deliveredPayloadDigest: ").append(toIndentedString(deliveredPayloadDigest)).append("\n");
        sb.append("    deliveredPayloadSize: ").append(toIndentedString(deliveredPayloadSize)).append("\n");
        sb.append("    deliveredPayloadType: ").append(toIndentedString(deliveredPayloadType)).append("\n");
        sb.append("    deliveredPayloadUrl: ").append(toIndentedString(deliveredPayloadUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
        sb.append("    deviceVendor: ").append(toIndentedString(deviceVendor)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keyTable: ").append(toIndentedString(keyTable)).append("\n");
        sb.append("    manifestSchemaVersion: ").append(toIndentedString(manifestSchemaVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    parsedRawManifest: ").append(toIndentedString(parsedRawManifest)).append("\n");
        sb.append("    precursorPayloadDigest: ").append(toIndentedString(precursorPayloadDigest)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    updatePriority: ").append(toIndentedString(updatePriority)).append("\n");
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

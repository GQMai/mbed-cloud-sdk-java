/*
 * Device Directory API
 * This is the API Documentation for the Mbed device directory update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.devicedirectory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceData
 */

public class DeviceData implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("bootstrap_expiration_date")
  private DateTime bootstrapExpirationDate = null;

  @SerializedName("bootstrapped_timestamp")
  private DateTime bootstrappedTimestamp = null;

  @SerializedName("connector_expiration_date")
  private DateTime connectorExpirationDate = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("ca_id")
  private String caId = null;

  @SerializedName("device_class")
  private String deviceClass = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("endpoint_name")
  private String endpointName = null;

  @SerializedName("auto_update")
  private Boolean autoUpdate = null;

  @SerializedName("host_gateway")
  private String hostGateway = null;

  @SerializedName("device_execution_mode")
  private Integer deviceExecutionMode = null;

  /**
   * The ID of the channel used to communicate with the device.
   */
  @JsonAdapter(MechanismEnum.Adapter.class)
  public enum MechanismEnum {
    CONNECTOR("connector"),
    
    DIRECT("direct");

    private String value;

    MechanismEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MechanismEnum fromValue(String text) {
      for (MechanismEnum b : MechanismEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MechanismEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MechanismEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MechanismEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MechanismEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mechanism")
  private MechanismEnum mechanism = null;

  /**
   * The current state of the device.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    UNENROLLED("unenrolled"),
    
    CLOUD_ENROLLING("cloud_enrolling"),
    
    BOOTSTRAPPED("bootstrapped"),
    
    REGISTERED("registered"),
    
    DEREGISTERED("deregistered");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("etag")
  private DateTime etag = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  @SerializedName("firmware_checksum")
  private String firmwareChecksum = null;

  @SerializedName("manifest_timestamp")
  private DateTime manifestTimestamp = null;

  @SerializedName("vendor_id")
  private String vendorId = null;

  @SerializedName("description")
  private String description = null;

  /**
   * DEPRECATED: The state of the device&#39;s deployment.
   */
  @JsonAdapter(DeployedStateEnum.Adapter.class)
  public enum DeployedStateEnum {
    DEVELOPMENT("development"),
    
    PRODUCTION("production");

    private String value;

    DeployedStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeployedStateEnum fromValue(String text) {
      for (DeployedStateEnum b : DeployedStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeployedStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeployedStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeployedStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeployedStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deployed_state")
  private DeployedStateEnum deployedState = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("endpoint_type")
  private String endpointType = null;

  @SerializedName("deployment")
  private String deployment = null;

  @SerializedName("mechanism_url")
  private String mechanismUrl = null;

  @SerializedName("trust_level")
  private Integer trustLevel = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("device_key")
  private String deviceKey = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("manifest")
  private String manifest = null;

  @SerializedName("custom_attributes")
  private Map<String, String> customAttributes = null;

  public DeviceData bootstrapExpirationDate(DateTime bootstrapExpirationDate) {
    this.bootstrapExpirationDate = bootstrapExpirationDate;
    return this;
  }

   /**
   * The expiration date of the certificate used to connect to bootstrap server.
   * @return bootstrapExpirationDate
  **/
  @ApiModelProperty(value = "The expiration date of the certificate used to connect to bootstrap server.")
  public DateTime getBootstrapExpirationDate() {
    return bootstrapExpirationDate;
  }

  public void setBootstrapExpirationDate(DateTime bootstrapExpirationDate) {
    this.bootstrapExpirationDate = bootstrapExpirationDate;
  }

  public DeviceData bootstrappedTimestamp(DateTime bootstrappedTimestamp) {
    this.bootstrappedTimestamp = bootstrappedTimestamp;
    return this;
  }

   /**
   * The timestamp of the device&#39;s most recent bootstrap process.
   * @return bootstrappedTimestamp
  **/
  @ApiModelProperty(value = "The timestamp of the device's most recent bootstrap process.")
  public DateTime getBootstrappedTimestamp() {
    return bootstrappedTimestamp;
  }

  public void setBootstrappedTimestamp(DateTime bootstrappedTimestamp) {
    this.bootstrappedTimestamp = bootstrappedTimestamp;
  }

  public DeviceData connectorExpirationDate(DateTime connectorExpirationDate) {
    this.connectorExpirationDate = connectorExpirationDate;
    return this;
  }

   /**
   * The expiration date of the certificate used to connect to LWM2M server.
   * @return connectorExpirationDate
  **/
  @ApiModelProperty(value = "The expiration date of the certificate used to connect to LWM2M server.")
  public DateTime getConnectorExpirationDate() {
    return connectorExpirationDate;
  }

  public void setConnectorExpirationDate(DateTime connectorExpirationDate) {
    this.connectorExpirationDate = connectorExpirationDate;
  }

  public DeviceData updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time the object was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time the object was updated.")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DeviceData caId(String caId) {
    this.caId = caId;
    return this;
  }

   /**
   * The certificate issuer&#39;s ID.
   * @return caId
  **/
  @ApiModelProperty(value = "The certificate issuer's ID.")
  public String getCaId() {
    return caId;
  }

  public void setCaId(String caId) {
    this.caId = caId;
  }

  public DeviceData deviceClass(String deviceClass) {
    this.deviceClass = deviceClass;
    return this;
  }

   /**
   * An ID representing the model and hardware revision of the device.
   * @return deviceClass
  **/
  @ApiModelProperty(value = "An ID representing the model and hardware revision of the device.")
  public String getDeviceClass() {
    return deviceClass;
  }

  public void setDeviceClass(String deviceClass) {
    this.deviceClass = deviceClass;
  }

  public DeviceData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the device. The device ID is used to manage a device across all Mbed Cloud APIs.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the device. The device ID is used to manage a device across all Mbed Cloud APIs.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeviceData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the associated account.
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the associated account.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DeviceData endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * The endpoint name given to the device.
   * @return endpointName
  **/
  @ApiModelProperty(value = "The endpoint name given to the device.")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public DeviceData autoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * DEPRECATED: Mark this device for automatic firmware update.
   * @return autoUpdate
  **/
  @ApiModelProperty(value = "DEPRECATED: Mark this device for automatic firmware update.")
  public Boolean getAutoUpdate() {
    return autoUpdate;
  }

  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }

  public DeviceData hostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
    return this;
  }

   /**
   * The &#x60;endpoint_name&#x60; of the host gateway, if appropriate.
   * @return hostGateway
  **/
  @ApiModelProperty(value = "The `endpoint_name` of the host gateway, if appropriate.")
  public String getHostGateway() {
    return hostGateway;
  }

  public void setHostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
  }

  public DeviceData deviceExecutionMode(Integer deviceExecutionMode) {
    this.deviceExecutionMode = deviceExecutionMode;
    return this;
  }

   /**
   * The execution mode from the certificate of the device. Permitted values:   - 0 - unspecified execution mode (default)   - 1 - development devices   - 5 - production devices
   * @return deviceExecutionMode
  **/
  @ApiModelProperty(value = "The execution mode from the certificate of the device. Permitted values:   - 0 - unspecified execution mode (default)   - 1 - development devices   - 5 - production devices")
  public Integer getDeviceExecutionMode() {
    return deviceExecutionMode;
  }

  public void setDeviceExecutionMode(Integer deviceExecutionMode) {
    this.deviceExecutionMode = deviceExecutionMode;
  }

  public DeviceData mechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * The ID of the channel used to communicate with the device.
   * @return mechanism
  **/
  @ApiModelProperty(value = "The ID of the channel used to communicate with the device.")
  public MechanismEnum getMechanism() {
    return mechanism;
  }

  public void setMechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
  }

  public DeviceData state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the device.
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the device.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public DeviceData etag(DateTime etag) {
    this.etag = etag;
    return this;
  }

   /**
   * The entity instance signature.
   * @return etag
  **/
  @ApiModelProperty(value = "The entity instance signature.")
  public DateTime getEtag() {
    return etag;
  }

  public void setEtag(DateTime etag) {
    this.etag = etag;
  }

  public DeviceData serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number of the device.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "The serial number of the device.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public DeviceData firmwareChecksum(String firmwareChecksum) {
    this.firmwareChecksum = firmwareChecksum;
    return this;
  }

   /**
   * The SHA256 checksum of the current firmware image.
   * @return firmwareChecksum
  **/
  @ApiModelProperty(value = "The SHA256 checksum of the current firmware image.")
  public String getFirmwareChecksum() {
    return firmwareChecksum;
  }

  public void setFirmwareChecksum(String firmwareChecksum) {
    this.firmwareChecksum = firmwareChecksum;
  }

  public DeviceData manifestTimestamp(DateTime manifestTimestamp) {
    this.manifestTimestamp = manifestTimestamp;
    return this;
  }

   /**
   * The timestamp of the current manifest version.
   * @return manifestTimestamp
  **/
  @ApiModelProperty(value = "The timestamp of the current manifest version.")
  public DateTime getManifestTimestamp() {
    return manifestTimestamp;
  }

  public void setManifestTimestamp(DateTime manifestTimestamp) {
    this.manifestTimestamp = manifestTimestamp;
  }

  public DeviceData vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The device vendor ID.
   * @return vendorId
  **/
  @ApiModelProperty(value = "The device vendor ID.")
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public DeviceData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the device.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the device.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceData deployedState(DeployedStateEnum deployedState) {
    this.deployedState = deployedState;
    return this;
  }

   /**
   * DEPRECATED: The state of the device&#39;s deployment.
   * @return deployedState
  **/
  @ApiModelProperty(value = "DEPRECATED: The state of the device's deployment.")
  public DeployedStateEnum getDeployedState() {
    return deployedState;
  }

  public void setDeployedState(DeployedStateEnum deployedState) {
    this.deployedState = deployedState;
  }

  public DeviceData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity.
   * @return object
  **/
  @ApiModelProperty(value = "The API resource entity.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DeviceData endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * The endpoint type of the device. For example, the device is a gateway.
   * @return endpointType
  **/
  @ApiModelProperty(value = "The endpoint type of the device. For example, the device is a gateway.")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public DeviceData deployment(String deployment) {
    this.deployment = deployment;
    return this;
  }

   /**
   * DEPRECATED: The last deployment used on the device.
   * @return deployment
  **/
  @ApiModelProperty(value = "DEPRECATED: The last deployment used on the device.")
  public String getDeployment() {
    return deployment;
  }

  public void setDeployment(String deployment) {
    this.deployment = deployment;
  }

  public DeviceData mechanismUrl(String mechanismUrl) {
    this.mechanismUrl = mechanismUrl;
    return this;
  }

   /**
   * The address of the connector to use.
   * @return mechanismUrl
  **/
  @ApiModelProperty(value = "The address of the connector to use.")
  public String getMechanismUrl() {
    return mechanismUrl;
  }

  public void setMechanismUrl(String mechanismUrl) {
    this.mechanismUrl = mechanismUrl;
  }

  public DeviceData trustLevel(Integer trustLevel) {
    this.trustLevel = trustLevel;
    return this;
  }

   /**
   * The device trust level.
   * @return trustLevel
  **/
  @ApiModelProperty(value = "The device trust level.")
  public Integer getTrustLevel() {
    return trustLevel;
  }

  public void setTrustLevel(Integer trustLevel) {
    this.trustLevel = trustLevel;
  }

  public DeviceData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the device.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceData deviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
    return this;
  }

   /**
   * The fingerprint of the device certificate.
   * @return deviceKey
  **/
  @ApiModelProperty(value = "The fingerprint of the device certificate.")
  public String getDeviceKey() {
    return deviceKey;
  }

  public void setDeviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
  }

  public DeviceData createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The timestamp of when the device was created in the device directory.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The timestamp of when the device was created in the device directory.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DeviceData manifest(String manifest) {
    this.manifest = manifest;
    return this;
  }

   /**
   * DEPRECATED: The URL for the current device manifest.
   * @return manifest
  **/
  @ApiModelProperty(value = "DEPRECATED: The URL for the current device manifest.")
  public String getManifest() {
    return manifest;
  }

  public void setManifest(String manifest) {
    this.manifest = manifest;
  }

  public DeviceData customAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public DeviceData putCustomAttributesItem(String key, String customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new HashMap<String, String>();
    }
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

   /**
   * Up to five custom key-value attributes.
   * @return customAttributes
  **/
  @ApiModelProperty(value = "Up to five custom key-value attributes.")
  public Map<String, String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceData deviceData = (DeviceData) o;
    return Objects.equals(this.bootstrapExpirationDate, deviceData.bootstrapExpirationDate) &&
        Objects.equals(this.bootstrappedTimestamp, deviceData.bootstrappedTimestamp) &&
        Objects.equals(this.connectorExpirationDate, deviceData.connectorExpirationDate) &&
        Objects.equals(this.updatedAt, deviceData.updatedAt) &&
        Objects.equals(this.caId, deviceData.caId) &&
        Objects.equals(this.deviceClass, deviceData.deviceClass) &&
        Objects.equals(this.id, deviceData.id) &&
        Objects.equals(this.accountId, deviceData.accountId) &&
        Objects.equals(this.endpointName, deviceData.endpointName) &&
        Objects.equals(this.autoUpdate, deviceData.autoUpdate) &&
        Objects.equals(this.hostGateway, deviceData.hostGateway) &&
        Objects.equals(this.deviceExecutionMode, deviceData.deviceExecutionMode) &&
        Objects.equals(this.mechanism, deviceData.mechanism) &&
        Objects.equals(this.state, deviceData.state) &&
        Objects.equals(this.etag, deviceData.etag) &&
        Objects.equals(this.serialNumber, deviceData.serialNumber) &&
        Objects.equals(this.firmwareChecksum, deviceData.firmwareChecksum) &&
        Objects.equals(this.manifestTimestamp, deviceData.manifestTimestamp) &&
        Objects.equals(this.vendorId, deviceData.vendorId) &&
        Objects.equals(this.description, deviceData.description) &&
        Objects.equals(this.deployedState, deviceData.deployedState) &&
        Objects.equals(this.object, deviceData.object) &&
        Objects.equals(this.endpointType, deviceData.endpointType) &&
        Objects.equals(this.deployment, deviceData.deployment) &&
        Objects.equals(this.mechanismUrl, deviceData.mechanismUrl) &&
        Objects.equals(this.trustLevel, deviceData.trustLevel) &&
        Objects.equals(this.name, deviceData.name) &&
        Objects.equals(this.deviceKey, deviceData.deviceKey) &&
        Objects.equals(this.createdAt, deviceData.createdAt) &&
        Objects.equals(this.manifest, deviceData.manifest) &&
        Objects.equals(this.customAttributes, deviceData.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootstrapExpirationDate, bootstrappedTimestamp, connectorExpirationDate, updatedAt, caId, deviceClass, id, accountId, endpointName, autoUpdate, hostGateway, deviceExecutionMode, mechanism, state, etag, serialNumber, firmwareChecksum, manifestTimestamp, vendorId, description, deployedState, object, endpointType, deployment, mechanismUrl, trustLevel, name, deviceKey, createdAt, manifest, customAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceData {\n");
    
    sb.append("    bootstrapExpirationDate: ").append(toIndentedString(bootstrapExpirationDate)).append("\n");
    sb.append("    bootstrappedTimestamp: ").append(toIndentedString(bootstrappedTimestamp)).append("\n");
    sb.append("    connectorExpirationDate: ").append(toIndentedString(connectorExpirationDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
    sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    hostGateway: ").append(toIndentedString(hostGateway)).append("\n");
    sb.append("    deviceExecutionMode: ").append(toIndentedString(deviceExecutionMode)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    firmwareChecksum: ").append(toIndentedString(firmwareChecksum)).append("\n");
    sb.append("    manifestTimestamp: ").append(toIndentedString(manifestTimestamp)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deployedState: ").append(toIndentedString(deployedState)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    mechanismUrl: ").append(toIndentedString(mechanismUrl)).append("\n");
    sb.append("    trustLevel: ").append(toIndentedString(trustLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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


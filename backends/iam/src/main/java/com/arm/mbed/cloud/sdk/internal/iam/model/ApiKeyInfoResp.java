/*
 * Account Management API
 * API for managing accounts, users, creating API keys, uploading trusted certificates
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.iam.model;

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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents an API key in mbed Cloud.
 */
@ApiModel(description = "This object represents an API key in mbed Cloud.")

public class ApiKeyInfoResp implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("creation_time")
  private Long creationTime = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("last_login_time")
  private Long lastLoginTime = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Entity name: always &#39;api-key&#39;
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    KEY("api-key");

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

  @SerializedName("owner")
  private String owner = null;

  /**
   * The status of the API key.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public ApiKeyInfoResp createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2018-02-13T09:35:20Z", value = "Creation UTC time RFC3339.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ApiKeyInfoResp creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The timestamp of the API key creation in the storage, in milliseconds.
   * @return creationTime
  **/
  @ApiModelProperty(example = "1518630727683", value = "The timestamp of the API key creation in the storage, in milliseconds.")
  public Long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  public ApiKeyInfoResp etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(example = "1", required = true, value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public ApiKeyInfoResp groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApiKeyInfoResp addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of group IDs this API key belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "A list of group IDs this API key belongs to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ApiKeyInfoResp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The UUID of the API key.
   * @return id
  **/
  @ApiModelProperty(example = "01619571f7020242ac12000600000000", required = true, value = "The UUID of the API key.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApiKeyInfoResp key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The API key.
   * @return key
  **/
  @ApiModelProperty(example = "ak_1MDE2MTk1NzFmNmU4MDI0MmFjMTIwMDA2MDAwMDAwMDA01619571f7020242ac12000600000000", required = true, value = "The API key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApiKeyInfoResp lastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

   /**
   * The timestamp of the latest API key usage, in milliseconds.
   * @return lastLoginTime
  **/
  @ApiModelProperty(example = "1518630727688", value = "The timestamp of the latest API key usage, in milliseconds.")
  public Long getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public ApiKeyInfoResp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name for the API key.
   * @return name
  **/
  @ApiModelProperty(example = "API key gorgon", required = true, value = "The display name for the API key.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiKeyInfoResp object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always &#39;api-key&#39;
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Entity name: always 'api-key'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public ApiKeyInfoResp owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of this API key, who is the creator by default.
   * @return owner
  **/
  @ApiModelProperty(example = "01619571e2e89242ac12000600000000", value = "The owner of this API key, who is the creator by default.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ApiKeyInfoResp status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the API key.
   * @return status
  **/
  @ApiModelProperty(example = "ACTIVE", value = "The status of the API key.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApiKeyInfoResp updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update UTC time RFC3339.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2018-02-14T15:24:14Z", value = "Last update UTC time RFC3339.")
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
    ApiKeyInfoResp apiKeyInfoResp = (ApiKeyInfoResp) o;
    return Objects.equals(this.createdAt, apiKeyInfoResp.createdAt) &&
        Objects.equals(this.creationTime, apiKeyInfoResp.creationTime) &&
        Objects.equals(this.etag, apiKeyInfoResp.etag) &&
        Objects.equals(this.groups, apiKeyInfoResp.groups) &&
        Objects.equals(this.id, apiKeyInfoResp.id) &&
        Objects.equals(this.key, apiKeyInfoResp.key) &&
        Objects.equals(this.lastLoginTime, apiKeyInfoResp.lastLoginTime) &&
        Objects.equals(this.name, apiKeyInfoResp.name) &&
        Objects.equals(this.object, apiKeyInfoResp.object) &&
        Objects.equals(this.owner, apiKeyInfoResp.owner) &&
        Objects.equals(this.status, apiKeyInfoResp.status) &&
        Objects.equals(this.updatedAt, apiKeyInfoResp.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, creationTime, etag, groups, id, key, lastLoginTime, name, object, owner, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyInfoResp {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


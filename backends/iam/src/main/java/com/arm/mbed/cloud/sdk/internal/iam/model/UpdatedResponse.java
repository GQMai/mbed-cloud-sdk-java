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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * This object represents a response to an update request.
 */
@ApiModel(description = "This object represents a response to an update request.")

public class UpdatedResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("code")
  private Integer code = null;

  /**
   * Entity name: 'user', 'apikey', 'group' or 'account'.
   */
  public enum ObjectEnum {
    @SerializedName("user")
    USER("user"),
    
    @SerializedName("api-key")
    API_KEY("api-key"),
    
    @SerializedName("group")
    GROUP("group"),
    
    @SerializedName("account")
    ACCOUNT("account"),
    
    @SerializedName("account-template")
    ACCOUNT_TEMPLATE("account-template"),
    
    @SerializedName("trusted-cert")
    TRUSTED_CERT("trusted-cert"),
    
    @SerializedName("list")
    LIST("list"),
    
    @SerializedName("error")
    ERROR("error");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("message")
  private String message = null;

  /**
   * Response type: success.
   */
  public enum TypeEnum {
    @SerializedName("success")
    SUCCESS("success"),
    
    @SerializedName("created")
    CREATED("created"),
    
    @SerializedName("accepted")
    ACCEPTED("accepted"),
    
    @SerializedName("permanently_deleted")
    PERMANENTLY_DELETED("permanently_deleted"),
    
    @SerializedName("validation_error")
    VALIDATION_ERROR("validation_error"),
    
    @SerializedName("invalid_token")
    INVALID_TOKEN("invalid_token"),
    
    @SerializedName("access_denied")
    ACCESS_DENIED("access_denied"),
    
    @SerializedName("account_limit_exceeded")
    ACCOUNT_LIMIT_EXCEEDED("account_limit_exceeded"),
    
    @SerializedName("not_found")
    NOT_FOUND("not_found"),
    
    @SerializedName("method_not_supported")
    METHOD_NOT_SUPPORTED("method_not_supported"),
    
    @SerializedName("not_acceptable")
    NOT_ACCEPTABLE("not_acceptable"),
    
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),
    
    @SerializedName("precondition_failed")
    PRECONDITION_FAILED("precondition_failed"),
    
    @SerializedName("unsupported_media_type")
    UNSUPPORTED_MEDIA_TYPE("unsupported_media_type"),
    
    @SerializedName("rate_limit_exceeded")
    RATE_LIMIT_EXCEEDED("rate_limit_exceeded"),
    
    @SerializedName("internal_server_error")
    INTERNAL_SERVER_ERROR("internal_server_error"),
    
    @SerializedName("system_unavailable")
    SYSTEM_UNAVAILABLE("system_unavailable");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("id")
  private String id = null;

  public UpdatedResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Response code.
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "Response code.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public UpdatedResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: 'user', 'apikey', 'group' or 'account'.
   * @return object
  **/
  @ApiModelProperty(example = "null", required = true, value = "Entity name: 'user', 'apikey', 'group' or 'account'.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public UpdatedResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request ID.
   * @return requestId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Request ID.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public UpdatedResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message with detailed info.
   * @return message
  **/
  @ApiModelProperty(example = "null", required = true, value = "A human readable message with detailed info.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UpdatedResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Response type: success.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Response type: success.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UpdatedResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity ID.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Entity ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedResponse updatedResponse = (UpdatedResponse) o;
    return Objects.equals(this.code, updatedResponse.code) &&
        Objects.equals(this.object, updatedResponse.object) &&
        Objects.equals(this.requestId, updatedResponse.requestId) &&
        Objects.equals(this.message, updatedResponse.message) &&
        Objects.equals(this.type, updatedResponse.type) &&
        Objects.equals(this.id, updatedResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, object, requestId, message, type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

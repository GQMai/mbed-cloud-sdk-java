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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents an active user session.
 */
@ApiModel(description = "This object represents an active user session.")

public class ActiveSession implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("login_time")
  private DateTime loginTime = null;

  /**
   * Entity name: always &#39;user-session&#39;
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    SESSION("user-session");

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

  @SerializedName("reference_token")
  private String referenceToken = null;

  @SerializedName("user_agent")
  private String userAgent = null;

  public ActiveSession accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The UUID of the account.
   * @return accountId
  **/
  @ApiModelProperty(example = "01619571e2e90242ac12000600000000", required = true, value = "The UUID of the account.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ActiveSession ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the client.
   * @return ipAddress
  **/
  @ApiModelProperty(example = "127.0.0.1", required = true, value = "IP address of the client.")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public ActiveSession loginTime(DateTime loginTime) {
    this.loginTime = loginTime;
    return this;
  }

   /**
   * The login time of the user.
   * @return loginTime
  **/
  @ApiModelProperty(example = "2018-02-14T17:52:07Z", required = true, value = "The login time of the user.")
  public DateTime getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(DateTime loginTime) {
    this.loginTime = loginTime;
  }

  public ActiveSession object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always &#39;user-session&#39;
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Entity name: always 'user-session'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public ActiveSession referenceToken(String referenceToken) {
    this.referenceToken = referenceToken;
    return this;
  }

   /**
   * The reference token.
   * @return referenceToken
  **/
  @ApiModelProperty(example = "rt_CI6+5hS8p9DrCmkRyS6u4doUdiXr71dX7MqD+g0327hYQthEkYTxMMnCwHyf1rDdk", required = true, value = "The reference token.")
  public String getReferenceToken() {
    return referenceToken;
  }

  public void setReferenceToken(String referenceToken) {
    this.referenceToken = referenceToken;
  }

  public ActiveSession userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User Agent header from the login request.
   * @return userAgent
  **/
  @ApiModelProperty(example = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.1 Safari/537.36", required = true, value = "User Agent header from the login request.")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveSession activeSession = (ActiveSession) o;
    return Objects.equals(this.accountId, activeSession.accountId) &&
        Objects.equals(this.ipAddress, activeSession.ipAddress) &&
        Objects.equals(this.loginTime, activeSession.loginTime) &&
        Objects.equals(this.object, activeSession.object) &&
        Objects.equals(this.referenceToken, activeSession.referenceToken) &&
        Objects.equals(this.userAgent, activeSession.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ipAddress, loginTime, object, referenceToken, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveSession {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    loginTime: ").append(toIndentedString(loginTime)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    referenceToken: ").append(toIndentedString(referenceToken)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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


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
import java.io.Serializable;

/**
 * This object represents a user invitation in requests towards Device Management.
 */
@ApiModel(description = "This object represents a user invitation in requests towards Device Management.")

public class UserInvitationReq implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("email")
  private String email = null;

  @SerializedName("login_profiles")
  private List<String> loginProfiles = null;

  public UserInvitationReq email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address, not longer than 254 characters.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address, not longer than 254 characters.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInvitationReq loginProfiles(List<String> loginProfiles) {
    this.loginProfiles = loginProfiles;
    return this;
  }

  public UserInvitationReq addLoginProfilesItem(String loginProfilesItem) {
    if (this.loginProfiles == null) {
      this.loginProfiles = new ArrayList<String>();
    }
    this.loginProfiles.add(loginProfilesItem);
    return this;
  }

   /**
   * A list of login profiles for the user. Specified as IDs of the identity providers the user should be associated with. The list cannot be empty. A limit of 100 profiles.
   * @return loginProfiles
  **/
  @ApiModelProperty(value = "A list of login profiles for the user. Specified as IDs of the identity providers the user should be associated with. The list cannot be empty. A limit of 100 profiles.")
  public List<String> getLoginProfiles() {
    return loginProfiles;
  }

  public void setLoginProfiles(List<String> loginProfiles) {
    this.loginProfiles = loginProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationReq userInvitationReq = (UserInvitationReq) o;
    return Objects.equals(this.email, userInvitationReq.email) &&
        Objects.equals(this.loginProfiles, userInvitationReq.loginProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, loginProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationReq {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    loginProfiles: ").append(toIndentedString(loginProfiles)).append("\n");
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


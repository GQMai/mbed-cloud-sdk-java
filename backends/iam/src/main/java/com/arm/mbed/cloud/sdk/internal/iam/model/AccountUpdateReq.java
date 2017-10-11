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
import com.arm.mbed.cloud.sdk.internal.iam.model.PasswordPolicy;
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
 * This object represents an account creation request.
 */
@ApiModel(description = "This object represents an account creation request.")

public class AccountUpdateReq implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("address_line2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("address_line1")
  private String addressLine1 = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("idle_timeout")
  private String idleTimeout = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("password_policy")
  private PasswordPolicy passwordPolicy = null;

  @SerializedName("end_market")
  private String endMarket = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("aliases")
  private List<String> aliases = null;

  public AccountUpdateReq addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Postal address line 2, not longer than 100 characters.
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Postal address line 2, not longer than 100 characters.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AccountUpdateReq city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city part of the postal address, not longer than 100 characters. Required for commercial accounts only.
   * @return city
  **/
  @ApiModelProperty(value = "The city part of the postal address, not longer than 100 characters. Required for commercial accounts only.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountUpdateReq addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Postal address line 1, not longer than 100 characters. Required for commercial accounts only.
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Postal address line 1, not longer than 100 characters. Required for commercial accounts only.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AccountUpdateReq displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name for the account, not longer than 100 characters.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name for the account, not longer than 100 characters.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountUpdateReq country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country part of the postal address, not longer than 100 characters. Required for commercial accounts only.
   * @return country
  **/
  @ApiModelProperty(value = "The country part of the postal address, not longer than 100 characters. Required for commercial accounts only.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountUpdateReq company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The name of the company, not longer than 100 characters. Required for commercial accounts only.
   * @return company
  **/
  @ApiModelProperty(value = "The name of the company, not longer than 100 characters. Required for commercial accounts only.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AccountUpdateReq idleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
    return this;
  }

   /**
   * The reference token expiration time in minutes for this account. Between 1 and 120 minutes.
   * @return idleTimeout
  **/
  @ApiModelProperty(value = "The reference token expiration time in minutes for this account. Between 1 and 120 minutes.")
  public String getIdleTimeout() {
    return idleTimeout;
  }

  public void setIdleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
  }

  public AccountUpdateReq state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state part of the postal address, not longer than 100 characters.
   * @return state
  **/
  @ApiModelProperty(value = "The state part of the postal address, not longer than 100 characters.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AccountUpdateReq contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * The name of the contact person for this account, not longer than 100 characters. Required for commercial accounts only.
   * @return contact
  **/
  @ApiModelProperty(value = "The name of the contact person for this account, not longer than 100 characters. Required for commercial accounts only.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public AccountUpdateReq postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code part of the postal address, not longer than 100 characters.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code part of the postal address, not longer than 100 characters.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AccountUpdateReq passwordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * Password policy for this account.
   * @return passwordPolicy
  **/
  @ApiModelProperty(value = "Password policy for this account.")
  public PasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  public AccountUpdateReq endMarket(String endMarket) {
    this.endMarket = endMarket;
    return this;
  }

   /**
   * The end market for this account, not longer than 100 characters.
   * @return endMarket
  **/
  @ApiModelProperty(value = "The end market for this account, not longer than 100 characters.")
  public String getEndMarket() {
    return endMarket;
  }

  public void setEndMarket(String endMarket) {
    this.endMarket = endMarket;
  }

  public AccountUpdateReq phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of a representative of the company, not longer than 100 characters.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number of a representative of the company, not longer than 100 characters.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AccountUpdateReq email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The company email address for this account, not longer than 254 characters. Required for commercial accounts only.
   * @return email
  **/
  @ApiModelProperty(value = "The company email address for this account, not longer than 254 characters. Required for commercial accounts only.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountUpdateReq aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public AccountUpdateReq addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * An array of aliases, not more than 10. An alias is not shorter than 8 and not longer than 100 characters.
   * @return aliases
  **/
  @ApiModelProperty(value = "An array of aliases, not more than 10. An alias is not shorter than 8 and not longer than 100 characters.")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateReq accountUpdateReq = (AccountUpdateReq) o;
    return Objects.equals(this.addressLine2, accountUpdateReq.addressLine2) &&
        Objects.equals(this.city, accountUpdateReq.city) &&
        Objects.equals(this.addressLine1, accountUpdateReq.addressLine1) &&
        Objects.equals(this.displayName, accountUpdateReq.displayName) &&
        Objects.equals(this.country, accountUpdateReq.country) &&
        Objects.equals(this.company, accountUpdateReq.company) &&
        Objects.equals(this.idleTimeout, accountUpdateReq.idleTimeout) &&
        Objects.equals(this.state, accountUpdateReq.state) &&
        Objects.equals(this.contact, accountUpdateReq.contact) &&
        Objects.equals(this.postalCode, accountUpdateReq.postalCode) &&
        Objects.equals(this.passwordPolicy, accountUpdateReq.passwordPolicy) &&
        Objects.equals(this.endMarket, accountUpdateReq.endMarket) &&
        Objects.equals(this.phoneNumber, accountUpdateReq.phoneNumber) &&
        Objects.equals(this.email, accountUpdateReq.email) &&
        Objects.equals(this.aliases, accountUpdateReq.aliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine2, city, addressLine1, displayName, country, company, idleTimeout, state, contact, postalCode, passwordPolicy, endMarket, phoneNumber, email, aliases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateReq {\n");
    
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    endMarket: ").append(toIndentedString(endMarket)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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


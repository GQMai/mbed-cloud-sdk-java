/*
 * billing REST API documentation
 * This document contains the public REST API definitions of the mbed-billing service.
 *
 * OpenAPI spec version: 1.4.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Subtenant account contact information.
 */
@ApiModel(description = "Subtenant account contact information.")

public class SubtenantReportAccountContactInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("address_line1")
  private String addressLine1 = null;

  @SerializedName("address_line2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("customer_subtenant_id")
  private String customerSubtenantId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state")
  private String state = null;

  public SubtenantReportAccountContactInfo addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public SubtenantReportAccountContactInfo addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public SubtenantReportAccountContactInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SubtenantReportAccountContactInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public SubtenantReportAccountContactInfo contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public SubtenantReportAccountContactInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SubtenantReportAccountContactInfo customerSubtenantId(String customerSubtenantId) {
    this.customerSubtenantId = customerSubtenantId;
    return this;
  }

   /**
   * Account subtenant id if it is a subtenant.
   * @return customerSubtenantId
  **/
  @ApiModelProperty(required = true, value = "Account subtenant id if it is a subtenant.")
  public String getCustomerSubtenantId() {
    return customerSubtenantId;
  }

  public void setCustomerSubtenantId(String customerSubtenantId) {
    this.customerSubtenantId = customerSubtenantId;
  }

  public SubtenantReportAccountContactInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SubtenantReportAccountContactInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Account id.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Account id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubtenantReportAccountContactInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public SubtenantReportAccountContactInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public SubtenantReportAccountContactInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtenantReportAccountContactInfo subtenantReportAccountContactInfo = (SubtenantReportAccountContactInfo) o;
    return Objects.equals(this.addressLine1, subtenantReportAccountContactInfo.addressLine1) &&
        Objects.equals(this.addressLine2, subtenantReportAccountContactInfo.addressLine2) &&
        Objects.equals(this.city, subtenantReportAccountContactInfo.city) &&
        Objects.equals(this.company, subtenantReportAccountContactInfo.company) &&
        Objects.equals(this.contact, subtenantReportAccountContactInfo.contact) &&
        Objects.equals(this.country, subtenantReportAccountContactInfo.country) &&
        Objects.equals(this.customerSubtenantId, subtenantReportAccountContactInfo.customerSubtenantId) &&
        Objects.equals(this.email, subtenantReportAccountContactInfo.email) &&
        Objects.equals(this.id, subtenantReportAccountContactInfo.id) &&
        Objects.equals(this.phoneNumber, subtenantReportAccountContactInfo.phoneNumber) &&
        Objects.equals(this.postalCode, subtenantReportAccountContactInfo.postalCode) &&
        Objects.equals(this.state, subtenantReportAccountContactInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, company, contact, country, customerSubtenantId, email, id, phoneNumber, postalCode, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtenantReportAccountContactInfo {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customerSubtenantId: ").append(toIndentedString(customerSubtenantId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

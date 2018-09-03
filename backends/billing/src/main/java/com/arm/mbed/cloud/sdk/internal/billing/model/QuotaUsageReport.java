/*
 * Billing API
 * Billing API allows users to retrieve billing reports and service package details.
 *
 * OpenAPI spec version: 1.4.7
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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Account&#39;s quota usage entry for queried month.
 */
@ApiModel(description = "Account's quota usage entry for queried month.")

public class QuotaUsageReport implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("time")
  private DateTime time = null;

  /**
   * Type of quota usage entry.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RESERVATION("reservation"),
    
    RESERVATION_RELEASE("reservation_release"),
    
    RESERVATION_TERMINATION("reservation_termination"),
    
    PACKAGE_RENEWAL("package_renewal"),
    
    PACKAGE_CREATION("package_creation"),
    
    PACKAGE_TERMINATION("package_termination");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public QuotaUsageReport amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of quota usage entry. Negative if it is quota consumption.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount of quota usage entry. Negative if it is quota consumption.")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public QuotaUsageReport campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Campaign name of quota usage entry. Null if quota usage entry type is not reservation or reservation release.
   * @return campaignName
  **/
  @ApiModelProperty(value = "Campaign name of quota usage entry. Null if quota usage entry type is not reservation or reservation release.")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public QuotaUsageReport time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Added time of quota usage entry in RFC3339 date-time with millisecond accuracy and UTC time zone.
   * @return time
  **/
  @ApiModelProperty(required = true, value = "Added time of quota usage entry in RFC3339 date-time with millisecond accuracy and UTC time zone.")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public QuotaUsageReport type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of quota usage entry.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of quota usage entry.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaUsageReport quotaUsageReport = (QuotaUsageReport) o;
    return Objects.equals(this.amount, quotaUsageReport.amount) &&
        Objects.equals(this.campaignName, quotaUsageReport.campaignName) &&
        Objects.equals(this.time, quotaUsageReport.time) &&
        Objects.equals(this.type, quotaUsageReport.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, campaignName, time, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaUsageReport {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


/*
 * Billing API
 * Billing API allows commercial users to retrieve billing reports and service package details.  **Billing Reports:**  Billing reports for the previous month are generated automatically during the third business day of the current month. The reports will be available usually by 02:00 AM UTC.  **Service package:**  A service package can be created for the commercial accounts with a specific number of firmware updates referred to as the service package quota. A customer can only perform device updates equal to the number of firmware updates linked to an active service package. A customer needs to purchase a new service package or renew an active service package if they have consumed all the quota linked to an active service package.  Aggregator customers share their service package quota with their own subtenant accounts. A subtenant can create campaigns utilizing their parent's service package quota. A subtenant cannot create or manage service packages on their own. The quota usage history is recorded separately between the aggregator and its subtenants.  **Service package events:**  The following service package events are included in the API responses:  **reservation:**  A reservation event refers to the creation of a new update campaign with an estimated number of firmware updates.  **reservation_release:**  A reservation_release event refers to closing an update campaign. The unused quota reserved through the update campaign will be added to the active service package quota at this point.  **reservation_termination:**  A reservation_termination event refers to the termination of an update campaign due to the expiration of an active service package. The unused quota reserved through the update campaign cannot be used anymore as the active service package is expired.  **package_creation:**  A package_creation event refers to the creation of a new service package.  **package_renewal:**  A package_renewal event refers to the renewal of an active service package before it expires.  **package_termination:**  A package_termination event refers to the expiration of an active service package. The unused quota linked to the expired service package cannot be used anymore. 
 *
 * OpenAPI spec version: 1.4.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.billing.model.ServicePackageQuotaHistoryReservation;
import com.arm.mbed.cloud.sdk.internal.billing.model.ServicePackageQuotaHistoryServicePackage;
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
 * Quota history item.
 */
@ApiModel(description = "Quota history item.")

public class ServicePackageQuotaHistoryItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("added")
  private DateTime added = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Type of quota usage entry.
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    RESERVATION("reservation"),
    
    RESERVATION_RELEASE("reservation_release"),
    
    RESERVATION_TERMINATION("reservation_termination"),
    
    PACKAGE_CREATION("package_creation"),
    
    PACKAGE_RENEWAL("package_renewal"),
    
    PACKAGE_TERMINATION("package_termination");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason")
  private ReasonEnum reason = null;

  @SerializedName("reservation")
  private ServicePackageQuotaHistoryReservation reservation = null;

  @SerializedName("service_package")
  private ServicePackageQuotaHistoryServicePackage servicePackage = null;

  public ServicePackageQuotaHistoryItem added(DateTime added) {
    this.added = added;
    return this;
  }

   /**
   * Added time of quota history entry in RFC3339 date-time with millisecond accuracy and UTC time zone.
   * @return added
  **/
  @ApiModelProperty(required = true, value = "Added time of quota history entry in RFC3339 date-time with millisecond accuracy and UTC time zone.")
  public DateTime getAdded() {
    return added;
  }

  public void setAdded(DateTime added) {
    this.added = added;
  }

  public ServicePackageQuotaHistoryItem amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * the amount of quota usage, negative or positive
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "the amount of quota usage, negative or positive")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public ServicePackageQuotaHistoryItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Service package quota history ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Service package quota history ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServicePackageQuotaHistoryItem reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Type of quota usage entry.
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "Type of quota usage entry.")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ServicePackageQuotaHistoryItem reservation(ServicePackageQuotaHistoryReservation reservation) {
    this.reservation = reservation;
    return this;
  }

   /**
   * Reservation details if reason is reservation, reservation_release or reservation_termination.
   * @return reservation
  **/
  @ApiModelProperty(value = "Reservation details if reason is reservation, reservation_release or reservation_termination.")
  public ServicePackageQuotaHistoryReservation getReservation() {
    return reservation;
  }

  public void setReservation(ServicePackageQuotaHistoryReservation reservation) {
    this.reservation = reservation;
  }

  public ServicePackageQuotaHistoryItem servicePackage(ServicePackageQuotaHistoryServicePackage servicePackage) {
    this.servicePackage = servicePackage;
    return this;
  }

   /**
   * Service package details if reason is package_creation, package_renewal or package_termination
   * @return servicePackage
  **/
  @ApiModelProperty(value = "Service package details if reason is package_creation, package_renewal or package_termination")
  public ServicePackageQuotaHistoryServicePackage getServicePackage() {
    return servicePackage;
  }

  public void setServicePackage(ServicePackageQuotaHistoryServicePackage servicePackage) {
    this.servicePackage = servicePackage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePackageQuotaHistoryItem servicePackageQuotaHistoryItem = (ServicePackageQuotaHistoryItem) o;
    return Objects.equals(this.added, servicePackageQuotaHistoryItem.added) &&
        Objects.equals(this.amount, servicePackageQuotaHistoryItem.amount) &&
        Objects.equals(this.id, servicePackageQuotaHistoryItem.id) &&
        Objects.equals(this.reason, servicePackageQuotaHistoryItem.reason) &&
        Objects.equals(this.reservation, servicePackageQuotaHistoryItem.reservation) &&
        Objects.equals(this.servicePackage, servicePackageQuotaHistoryItem.servicePackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, amount, id, reason, reservation, servicePackage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePackageQuotaHistoryItem {\n");
    
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
    sb.append("    servicePackage: ").append(toIndentedString(servicePackage)).append("\n");
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

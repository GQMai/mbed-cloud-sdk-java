/*
 * Mbed Cloud API
 * The full Mbed Cloud API
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

/**
 * CertificateIssuerUpdateRequest
 */

public class CertificateIssuerUpdateRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("description")
    private String description = null;

    @SerializedName("issuer_attributes")
    private Map<String, String> issuerAttributes = null;

    @SerializedName("issuer_credentials")
    private Map<String, String> issuerCredentials = null;

    @SerializedName("name")
    private String name = null;

    public CertificateIssuerUpdateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * General description for the certificate issuer.
     * 
     * @return description
     **/
    @ApiModelProperty(value = "General description for the certificate issuer.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CertificateIssuerUpdateRequest issuerAttributes(Map<String, String> issuerAttributes) {
        this.issuerAttributes = issuerAttributes;
        return this;
    }

    public CertificateIssuerUpdateRequest putIssuerAttributesItem(String key, String issuerAttributesItem) {
        if (this.issuerAttributes == null) {
            this.issuerAttributes = new HashMap<String, String>();
        }
        this.issuerAttributes.put(key, issuerAttributesItem);
        return this;
    }

    /**
     * General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value shall be
     * empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes.
     * 
     * @return issuerAttributes
     **/
    @ApiModelProperty(example = "{}",
                      value = "General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value shall be empty. When the issuer_type is CFSSL_AUTH, see definition of CfsslAttributes. ")
    public Map<String, String> getIssuerAttributes() {
        return issuerAttributes;
    }

    public void setIssuerAttributes(Map<String, String> issuerAttributes) {
        this.issuerAttributes = issuerAttributes;
    }

    public CertificateIssuerUpdateRequest issuerCredentials(Map<String, String> issuerCredentials) {
        this.issuerCredentials = issuerCredentials;
        return this;
    }

    public CertificateIssuerUpdateRequest putIssuerCredentialsItem(String key, String issuerCredentialsItem) {
        if (this.issuerCredentials == null) {
            this.issuerCredentials = new HashMap<String, String>();
        }
        this.issuerCredentials.put(key, issuerCredentialsItem);
        return this;
    }

    /**
     * The credentials required for connecting to the certificate issuer. When the issuer_type is GLOBAL_SIGN, see
     * definition of GlobalSignCredentials. When the issuer_type is CFSSL_AUTH, see definition of CfsslAuthCredentials.
     * 
     * @return issuerCredentials
     **/
    @ApiModelProperty(example = "{}",
                      value = "The credentials required for connecting to the certificate issuer. When the issuer_type is GLOBAL_SIGN, see definition of GlobalSignCredentials. When the issuer_type is CFSSL_AUTH, see definition of CfsslAuthCredentials. ")
    public Map<String, String> getIssuerCredentials() {
        return issuerCredentials;
    }

    public void setIssuerCredentials(Map<String, String> issuerCredentials) {
        this.issuerCredentials = issuerCredentials;
    }

    public CertificateIssuerUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Certificate issuer name.
     * 
     * @return name
     **/
    @ApiModelProperty(value = "Certificate issuer name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateIssuerUpdateRequest certificateIssuerUpdateRequest = (CertificateIssuerUpdateRequest) o;
        return Objects.equals(this.description, certificateIssuerUpdateRequest.description)
               && Objects.equals(this.issuerAttributes, certificateIssuerUpdateRequest.issuerAttributes)
               && Objects.equals(this.issuerCredentials, certificateIssuerUpdateRequest.issuerCredentials)
               && Objects.equals(this.name, certificateIssuerUpdateRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, issuerAttributes, issuerCredentials, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateIssuerUpdateRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    issuerAttributes: ").append(toIndentedString(issuerAttributes)).append("\n");
        sb.append("    issuerCredentials: ").append(toIndentedString(issuerCredentials)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

/**
 * Model for a developer certificate.
 */
@Preamble(description = "Model for a developer certificate.")
@SuppressWarnings({ "PMD.CyclomaticComplexity", "PMD.AvoidDuplicateLiterals" })
public class DeveloperCertificate implements SdkModel {
    /**
     * Mapping needed for encoding or decoding filters.
     * 
     * <p>
     * Filters are used when listing models. See {@link com.arm.mbed.cloud.sdk.common.listing.filtering.Filters}
     */
    @Internal
    public static final Map<String, String> FILTER_MAPPING = generateFilterMapping();

    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -154971195745225L;

    /**
     * Account to which the developer certificate belongs.
     */
    private final String accountId;

    /**
     * PEM-format X.509 developer certificate.
     */
    private final String certificate;

    /**
     * Creation UTC time RFC3339.
     */
    private final Date createdAt;

    /**
     * Description for the developer certificate.
     */
    private String description;

    /**
     * PEM-format developer private key associated with the certificate.
     */
    private final String developerPrivateKey;

    /**
     * ID that uniquely identifies the developer certificate.
     */
    private String id;

    /**
     * Name of the developer certificate.
     */
    @Required
    private String name;

    /**
     * Content of the `security.c` file flashed to the device to provide security credentials.
     */
    private final String securityFileContent;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #DeveloperCertificate()} instead.
     * 
     * @param accountId
     *            Account to which the developer certificate belongs.
     * @param certificate
     *            PEM-format X.509 developer certificate.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param description
     *            Description for the developer certificate.
     * @param developerPrivateKey
     *            PEM-format developer private key associated with the certificate.
     * @param id
     *            ID that uniquely identifies the developer certificate.
     * @param name
     *            Name of the developer certificate.
     * @param securityFileContent
     *            Content of the `security.c` file flashed to the device to provide security credentials.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public DeveloperCertificate(String accountId, String certificate, Date createdAt, String description,
                                String developerPrivateKey, String id, String name, String securityFileContent) {
        super();
        this.accountId = accountId;
        this.certificate = certificate;
        this.createdAt = createdAt;
        this.developerPrivateKey = developerPrivateKey;
        this.securityFileContent = securityFileContent;
        setDescription(description);
        setId(id);
        setName(name);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #DeveloperCertificate()} instead.
     * 
     * @param developerCertificate
     *            a developer certificate.
     */
    @Internal
    public DeveloperCertificate(DeveloperCertificate developerCertificate) {
        this(developerCertificate == null ? (String) null : developerCertificate.accountId,
             developerCertificate == null ? (String) null : developerCertificate.certificate,
             developerCertificate == null ? new Date() : developerCertificate.createdAt,
             developerCertificate == null ? (String) null : developerCertificate.description,
             developerCertificate == null ? (String) null : developerCertificate.developerPrivateKey,
             developerCertificate == null ? (String) null : developerCertificate.id,
             developerCertificate == null ? (String) null : developerCertificate.name,
             developerCertificate == null ? (String) null : developerCertificate.securityFileContent);
    }

    /**
     * Constructor.
     */
    public DeveloperCertificate() {
        this((String) null, (String) null, new Date(), (String) null, (String) null, (String) null, (String) null,
             (String) null);
    }

    /**
     * Constructor.
     * 
     * <p>
     * Constructor based on object identifier.
     * <p>
     * 
     * @param id
     *            ID that uniquely identifies the developer certificate.
     */
    public DeveloperCertificate(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #DeveloperCertificate()} instead.
     * 
     * @param accountId
     *            Account to which the developer certificate belongs.
     * @param certificate
     *            PEM-format X.509 developer certificate.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param developerPrivateKey
     *            PEM-format developer private key associated with the certificate.
     * @param securityFileContent
     *            Content of the `security.c` file flashed to the device to provide security credentials.
     */
    @Internal
    public DeveloperCertificate(String accountId, String certificate, Date createdAt, String developerPrivateKey,
                                String securityFileContent) {
        this(accountId, certificate, createdAt, (String) null, developerPrivateKey, (String) null, (String) null,
             securityFileContent);
    }

    /**
     * Gets account to which the developer certificate belongs.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Gets pem-format x.509 developer certificate.
     * 
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Gets creation utc time rfc3339.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets description for the developer certificate.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description for the developer certificate.
     * 
     * @param description
     *            Description for the developer certificate.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets pem-format developer private key associated with the certificate.
     * 
     * @return developerPrivateKey
     */
    public String getDeveloperPrivateKey() {
        return developerPrivateKey;
    }

    /**
     * Gets id that uniquely identifies the developer certificate.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets id that uniquely identifies the developer certificate.
     * 
     * @param id
     *            ID that uniquely identifies the developer certificate.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets id that uniquely identifies the developer certificate.
     * 
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param developerCertificateId
     *            ID that uniquely identifies the developer certificate.
     */
    @Internal
    public void setDeveloperCertificateId(String developerCertificateId) {
        setId(developerCertificateId);
    }

    /**
     * Gets name of the developer certificate.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of the developer certificate.
     * 
     * @param name
     *            Name of the developer certificate.
     */
    @Required
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks whether name value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isNameValid() {
        return name != null;
    }

    /**
     * Gets content of the `security.c` file flashed to the device to provide security credentials.
     * 
     * @return securityFileContent
     */
    public String getSecurityFileContent() {
        return securityFileContent;
    }

    /**
     * Method generating the mapping needed for encoding or decoding filters.
     * 
     * <p>
     * Filters are used when listing models. See {@link com.arm.mbed.cloud.sdk.common.listing.filtering.Filters}
     * 
     * @return the mapping table
     */
    @Internal
    protected static final Map<String, String> generateFilterMapping() {
        final Map<String, String> filterMapping = new Hashtable<>(1);
        filterMapping.put("certificate", "developer_certificate");
        return filterMapping;
    }

    /**
     * Returns a string representation of the object.
     * 
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "DeveloperCertificate [accountId=" + accountId + ", certificate=" + certificate + ", createdAt="
               + createdAt + ", description=" + description + ", developerPrivateKey=" + developerPrivateKey + ", id="
               + id + ", name=" + name + ", securityFileContent=" + securityFileContent + "]";
    }

    /**
     * Calculates the hash code of this instance based on field values.
     * 
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + ((certificate == null) ? 0 : certificate.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((developerPrivateKey == null) ? 0 : developerPrivateKey.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((securityFileContent == null) ? 0 : securityFileContent.hashCode());
        return result;
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     * 
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof DeveloperCertificate;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    @SuppressWarnings({ "PMD.ExcessiveMethodLength", "PMD.NcssMethodCount" })
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DeveloperCertificate)) {
            return false;
        }
        final DeveloperCertificate other = (DeveloperCertificate) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (accountId == null) {
            if (other.accountId != null) {
                return false;
            }
        } else if (!accountId.equals(other.accountId)) {
            return false;
        }
        if (certificate == null) {
            if (other.certificate != null) {
                return false;
            }
        } else if (!certificate.equals(other.certificate)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (developerPrivateKey == null) {
            if (other.developerPrivateKey != null) {
                return false;
            }
        } else if (!developerPrivateKey.equals(other.developerPrivateKey)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (securityFileContent == null) {
            if (other.securityFileContent != null) {
                return false;
            }
        } else if (!securityFileContent.equals(other.securityFileContent)) {
            return false;
        }
        return true;
    }

    /**
     * Checks whether the model is valid or not.
     * 
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return isNameValid();
    }

    /**
     * Clones this instance.
     * 
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public DeveloperCertificate clone() {
        return new DeveloperCertificate(this);
    }
}

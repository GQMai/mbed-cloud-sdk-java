// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Mon Jan 14 15:44:35 GMT 2019. Feel free to change its contents as you wish.
// TODO The following fields need to be defined:
// - isDeveloperCertificate
package com.arm.mbed.cloud.sdk.security.model;

import java.util.Date;
import java.util.Objects;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;

/**
 * Model for a subtenant trusted certificate.
 */
@Preamble(description = "Model for a subtenant trusted certificate.")
@SuppressWarnings("PMD.CyclomaticComplexity")
public class SubtenantTrustedCertificate extends AbstractSubtenantTrustedCertificate {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 8306879121921220L;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantTrustedCertificate()} instead.
     * 
     * @param isDeveloperCertificate
     *            Whether or not this certificate is a developer certificate.
     * @param accountId
     *            The ID of the account.
     * @param certificate
     *            X509.v3 trusted certificate in PEM format.
     * @param certificateFingerprint
     *            A SHA-256 fingerprint of the certificate.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param description
     *            Human readable description of this certificate.
     * @param deviceExecutionMode
     *            Device execution mode where 1 means a developer certificate.
     * @param enrollmentMode
     *            If true, signature is not required. Default value false.
     * @param id
     *            Entity ID.
     * @param issuer
     *            Issuer of the certificate.
     * @param name
     *            Certificate name.
     * @param ownerId
     *            The ID of the owner.
     * @param service
     *            Service name where the certificate is to be used.
     * @param status
     *            Status of the certificate.
     * @param subject
     *            Subject of the certificate.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     * @param valid
     *            This read-only flag indicates whether the certificate is valid or not.
     * @param validity
     *            Expiration time in UTC formatted as RFC3339.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public SubtenantTrustedCertificate(boolean isDeveloperCertificate, String accountId, String certificate,
                                       String certificateFingerprint, Date createdAt, String description,
                                       int deviceExecutionMode, boolean enrollmentMode, String id, String issuer,
                                       String name, String ownerId, SubtenantTrustedCertificateService service,
                                       SubtenantTrustedCertificateStatus status, String subject, Date updatedAt,
                                       boolean valid, Date validity) {
        super(accountId, certificate, certificateFingerprint, createdAt, description, deviceExecutionMode,
              enrollmentMode, id, issuer, name, ownerId, service, status, subject, updatedAt, valid, validity);
        setIsDeveloperCertificate(isDeveloperCertificate);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantTrustedCertificate()} instead.
     * 
     * @param subtenantTrustedCertificate
     *            a subtenant trusted certificate.
     */
    @Internal
    public SubtenantTrustedCertificate(SubtenantTrustedCertificate subtenantTrustedCertificate) {
        this(subtenantTrustedCertificate != null && subtenantTrustedCertificate.isDeveloperCertificate(),
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.accountId,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.certificate,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.certificateFingerprint,
             subtenantTrustedCertificate == null ? new java.util.Date() : subtenantTrustedCertificate.createdAt,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.description,
             subtenantTrustedCertificate == null ? 0 : subtenantTrustedCertificate.deviceExecutionMode,
             subtenantTrustedCertificate != null && subtenantTrustedCertificate.enrollmentMode,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.id,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.issuer,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.name,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.ownerId,
             subtenantTrustedCertificate == null ? SubtenantTrustedCertificateService.getDefault()
                                                 : subtenantTrustedCertificate.service,
             subtenantTrustedCertificate == null ? SubtenantTrustedCertificateStatus.getDefault()
                                                 : subtenantTrustedCertificate.status,
             subtenantTrustedCertificate == null ? (String) null : subtenantTrustedCertificate.subject,
             subtenantTrustedCertificate == null ? new java.util.Date() : subtenantTrustedCertificate.updatedAt,
             subtenantTrustedCertificate == null ? false : subtenantTrustedCertificate.valid,
             subtenantTrustedCertificate == null ? new java.util.Date() : subtenantTrustedCertificate.validity);
    }

    /**
     * Constructor.
     */
    public SubtenantTrustedCertificate() {
        this(false, (String) null, (String) null, (String) null, new java.util.Date(), (String) null, 0, false,
             (String) null, (String) null, (String) null, (String) null,
             SubtenantTrustedCertificateService.getDefault(), SubtenantTrustedCertificateStatus.getDefault(),
             (String) null, new java.util.Date(), false, new java.util.Date());
    }

    /**
     * Constructor.
     * 
     * @param id
     *            Entity ID.
     */
    public SubtenantTrustedCertificate(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantTrustedCertificate()} instead.
     * 
     * @param certificateFingerprint
     *            A SHA-256 fingerprint of the certificate.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param issuer
     *            Issuer of the certificate.
     * @param ownerId
     *            The ID of the owner.
     * @param subject
     *            Subject of the certificate.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     * @param valid
     *            This read-only flag indicates whether the certificate is valid or not.
     * @param validity
     *            Expiration time in UTC formatted as RFC3339.
     */

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #AbstractSubtenantTrustedCertificate()} instead.
     * 
     * @param certificateFingerprint
     *            A SHA-256 fingerprint of the certificate.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param issuer
     *            Issuer of the certificate.
     * @param ownerId
     *            The ID of the owner.
     * @param subject
     *            Subject of the certificate.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     * 
     * @param validity
     *            Expiration time in UTC formatted as RFC3339.
     */
    @Internal
    public SubtenantTrustedCertificate(String certificateFingerprint, Date createdAt, String issuer, String ownerId,
                                       String subject, Date updatedAt, boolean valid, Date validity) {
        this(false, (String) null, (String) null, certificateFingerprint, createdAt, (String) null, 0, false,
             (String) null, issuer, (String) null, ownerId, SubtenantTrustedCertificateService.getDefault(),
             SubtenantTrustedCertificateStatus.getDefault(), subject, updatedAt, valid, validity);
    }

    /**
     * Constructor.
     * 
     * @param accountId
     *            The ID of the account.
     * @param certificate
     *            X509.v3 trusted certificate in PEM format.
     * @param name
     *            Certificate name.
     * @param service
     *            Service name where the certificate is to be used.
     */
    public SubtenantTrustedCertificate(String accountId, String certificate, String name,
                                       SubtenantTrustedCertificateService service) {
        this(false, accountId, certificate, (String) null, new java.util.Date(), (String) null, 0, false, (String) null,
             (String) null, name, (String) null, service, SubtenantTrustedCertificateStatus.getDefault(), (String) null,
             new java.util.Date(), false, new java.util.Date());
    }

    /**
     * Gets whether or not this certificate is a developer certificate.
     * 
     * @return isDeveloperCertificate
     */
    public boolean isDeveloperCertificate() {
        return getDeviceExecutionMode() == 1;
    }

    /**
     * Sets whether or not this certificate is a developer certificate.
     * 
     * @param isDeveloperCertificate
     *            Whether or not this certificate is a developer certificate.
     */
    public void setIsDeveloperCertificate(boolean isDeveloperCertificate) {
        setDeviceExecutionMode(1);
        setService(SubtenantTrustedCertificateService.BOOTSTRAP);
    }

    /**
     * Calculates the hash code of this instance based on field values.
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
        result = prime * result + ((certificateFingerprint == null) ? 0 : certificateFingerprint.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + Objects.hashCode(deviceExecutionMode);
        result = prime * result + Objects.hashCode(enrollmentMode);
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
        result = prime * result + ((service == null) ? 0 : service.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        result = prime * result + ((validity == null) ? 0 : validity.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
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
        if (!(obj instanceof SubtenantTrustedCertificate)) {
            return false;
        }
        final SubtenantTrustedCertificate other = (SubtenantTrustedCertificate) obj;
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
        if (certificateFingerprint == null) {
            if (other.certificateFingerprint != null) {
                return false;
            }
        } else if (!certificateFingerprint.equals(other.certificateFingerprint)) {
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
        if (deviceExecutionMode != other.deviceExecutionMode) {
            return false;
        }
        if (enrollmentMode != other.enrollmentMode) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (issuer == null) {
            if (other.issuer != null) {
                return false;
            }
        } else if (!issuer.equals(other.issuer)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (ownerId == null) {
            if (other.ownerId != null) {
                return false;
            }
        } else if (!ownerId.equals(other.ownerId)) {
            return false;
        }
        if (service != other.service) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (subject == null) {
            if (other.subject != null) {
                return false;
            }
        } else if (!subject.equals(other.subject)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        if (validity == null) {
            if (other.validity != null) {
                return false;
            }
        } else if (!validity.equals(other.validity)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "SubtenantTrustedCertificate [isDeveloperCertificate=" + isDeveloperCertificate() + ", accountId="
               + accountId + ", certificate=" + certificate + ", certificateFingerprint=" + certificateFingerprint
               + ", createdAt=" + createdAt + ", description=" + description + ", deviceExecutionMode="
               + deviceExecutionMode + ", enrollmentMode=" + enrollmentMode + ", id=" + id + ", issuer=" + issuer
               + ", name=" + name + ", ownerId=" + ownerId + ", service=" + service + ", status=" + status
               + ", subject=" + subject + ", updatedAt=" + updatedAt + ", validity=" + validity + "]";
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public SubtenantTrustedCertificate clone() {
        return new SubtenantTrustedCertificate(this);
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof SubtenantTrustedCertificate;
    }
}

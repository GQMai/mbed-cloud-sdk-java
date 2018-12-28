// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;

/**
 * Model for a server credentials.
 */
@Preamble(description = "Model for a server credentials.")
public class ServerCredentials implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 2078127543195182L;

    /**
     * Creation UTC time RFC3339.
     */
    private Date createdAt;

    /**
     * mUUID that uniquely identifies the entity.
     */
    private String id;

    /**
     * PEM format X.509 server certificate that will be used to validate the server certificate that will be received
     * during the TLS/DTLS handshake.
     */
    private String serverCertificate;

    /**
     * Server URI to which the client needs to connect to.
     */
    private String serverUri;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ServerCredentials()} instead.
     * 
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param id
     *            mUUID that uniquely identifies the entity.
     * @param serverCertificate
     *            PEM format X.509 server certificate that will be used to validate the server certificate that will be
     *            received during the TLS/DTLS handshake.
     * @param serverUri
     *            Server URI to which the client needs to connect to.
     */
    @Internal
    public ServerCredentials(Date createdAt, String id, String serverCertificate, String serverUri) {
        super();
        setCreatedAt(createdAt);
        setId(id);
        setServerCertificate(serverCertificate);
        setServerUri(serverUri);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ServerCredentials()} instead.
     * 
     * @param serverCredentials
     *            a server credentials.
     */
    @Internal
    public ServerCredentials(ServerCredentials serverCredentials) {
        this(serverCredentials == null ? new java.util.Date() : serverCredentials.createdAt,
             serverCredentials == null ? (String) null : serverCredentials.id,
             serverCredentials == null ? (String) null : serverCredentials.serverCertificate,
             serverCredentials == null ? (String) null : serverCredentials.serverUri);
    }

    /**
     * Constructor.
     */
    public ServerCredentials() {
        this(new java.util.Date(), (String) null, (String) null, (String) null);
    }

    /**
     * Constructor.
     * 
     * @param id
     *            mUUID that uniquely identifies the entity.
     */
    public ServerCredentials(String id) {
        this();
        setId(id);
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
     * Sets creation utc time rfc3339.
     * 
     * @param createdAt
     *            Creation UTC time RFC3339.
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets muuid that uniquely identifies the entity.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets muuid that uniquely identifies the entity.
     * 
     * @param id
     *            mUUID that uniquely identifies the entity.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets muuid that uniquely identifies the entity.
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param serverCredentialsId
     *            mUUID that uniquely identifies the entity.
     */
    @Internal
    public void setServerCredentialsId(String serverCredentialsId) {
        setId(serverCredentialsId);
    }

    /**
     * Gets pem format x.509 server certificate that will be used to validate the server certificate that will be
     * received during the tls/dtls handshake.
     * 
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return serverCertificate;
    }

    /**
     * Sets pem format x.509 server certificate that will be used to validate the server certificate that will be
     * received during the tls/dtls handshake.
     * 
     * @param serverCertificate
     *            PEM format X.509 server certificate that will be used to validate the server certificate that will be
     *            received during the TLS/DTLS handshake.
     */
    public void setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
    }

    /**
     * Gets server uri to which the client needs to connect to.
     * 
     * @return serverUri
     */
    public String getServerUri() {
        return serverUri;
    }

    /**
     * Sets server uri to which the client needs to connect to.
     * 
     * @param serverUri
     *            Server URI to which the client needs to connect to.
     */
    public void setServerUri(String serverUri) {
        this.serverUri = serverUri;
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
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((serverCertificate == null) ? 0 : serverCertificate.hashCode());
        result = prime * result + ((serverUri == null) ? 0 : serverUri.hashCode());
        return result;
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
        return other instanceof ServerCredentials;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ServerCredentials)) {
            return false;
        }
        final ServerCredentials other = (ServerCredentials) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (serverCertificate == null) {
            if (other.serverCertificate != null) {
                return false;
            }
        } else if (!serverCertificate.equals(other.serverCertificate)) {
            return false;
        }
        if (serverUri == null) {
            if (other.serverUri != null) {
                return false;
            }
        } else if (!serverUri.equals(other.serverUri)) {
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
        return "ServerCredentials [createdAt=" + createdAt + ", id=" + id + ", serverCertificate=" + serverCertificate
               + ", serverUri=" + serverUri + "]";
    }

    /**
     * Checks whether the model is valid or not.
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return true;
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public ServerCredentials clone() {
        return new ServerCredentials(this);
    }
}

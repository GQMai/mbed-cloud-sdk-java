// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

/**
 * Model for a firmware manifest.
 */
@Preamble(description = "Model for a firmware manifest.")
@SuppressWarnings({ "PMD.CyclomaticComplexity", "PMD.AvoidDuplicateLiterals" })
public class FirmwareManifest implements SdkModel {
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
    private static final long serialVersionUID = -945825015691813L;

    /**
     * The time the object was created.
     */
    private final Date createdAt;

    /**
     * The size of the datafile in bytes.
     */
    private final long datafileSize;

    /**
     * The URL of the firmware manifest binary.
     */
    private final String datafileUrl;

    /**
     * The description of the firmware manifest.
     */
    private String description;

    /**
     * The class of the device.
     */
    private final String deviceClass;

    /**
     * The firmware manifest ID.
     */
    private String id;

    /**
     * The key table of pre-shared keys for devices.
     */
    private final String keyTableUrl;

    /**
     * The name of the object.
     */
    private String name;

    /**
     * The firmware manifest version as a timestamp.
     */
    private final Date timestamp;

    /**
     * The time the object was updated.
     */
    private final Date updatedAt;

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #FirmwareManifest()} instead.
     * 
     * @param createdAt
     *            The time the object was created.
     * @param datafileSize
     *            The size of the datafile in bytes.
     * @param datafileUrl
     *            The URL of the firmware manifest binary.
     * @param description
     *            The description of the firmware manifest.
     * @param deviceClass
     *            The class of the device.
     * @param id
     *            The firmware manifest ID.
     * @param keyTableUrl
     *            The key table of pre-shared keys for devices.
     * @param name
     *            The name of the object.
     * @param timestamp
     *            The firmware manifest version as a timestamp.
     * @param updatedAt
     *            The time the object was updated.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public FirmwareManifest(Date createdAt, long datafileSize, String datafileUrl, String description,
                            String deviceClass, String id, String keyTableUrl, String name, Date timestamp,
                            Date updatedAt) {
        super();
        this.createdAt = createdAt;
        this.datafileSize = datafileSize;
        this.datafileUrl = datafileUrl;
        this.deviceClass = deviceClass;
        this.keyTableUrl = keyTableUrl;
        this.timestamp = timestamp;
        this.updatedAt = updatedAt;
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
     * Note: Should not be used. Use {@link #FirmwareManifest()} instead.
     * 
     * @param firmwareManifest
     *            a firmware manifest.
     */
    @Internal
    public FirmwareManifest(FirmwareManifest firmwareManifest) {
        this(firmwareManifest == null ? new Date() : firmwareManifest.createdAt,
             firmwareManifest == null ? 0 : firmwareManifest.datafileSize,
             firmwareManifest == null ? (String) null : firmwareManifest.datafileUrl,
             firmwareManifest == null ? (String) null : firmwareManifest.description,
             firmwareManifest == null ? (String) null : firmwareManifest.deviceClass,
             firmwareManifest == null ? (String) null : firmwareManifest.id,
             firmwareManifest == null ? (String) null : firmwareManifest.keyTableUrl,
             firmwareManifest == null ? (String) null : firmwareManifest.name,
             firmwareManifest == null ? new Date() : firmwareManifest.timestamp,
             firmwareManifest == null ? new Date() : firmwareManifest.updatedAt);
    }

    /**
     * Constructor.
     */
    public FirmwareManifest() {
        this(new Date(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
             new Date(), new Date());
    }

    /**
     * Constructor.
     *
     * <p>
     * Constructor based on object identifier.
     * <p>
     *
     * @param id
     *            The firmware manifest ID.
     */
    public FirmwareManifest(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #FirmwareManifest()} instead.
     * 
     * @param createdAt
     *            The time the object was created.
     * @param datafileSize
     *            The size of the datafile in bytes.
     * @param datafileUrl
     *            The URL of the firmware manifest binary.
     * @param deviceClass
     *            The class of the device.
     * @param keyTableUrl
     *            The key table of pre-shared keys for devices.
     * @param timestamp
     *            The firmware manifest version as a timestamp.
     * @param updatedAt
     *            The time the object was updated.
     */
    @Internal
    public FirmwareManifest(Date createdAt, long datafileSize, String datafileUrl, String deviceClass,
                            String keyTableUrl, Date timestamp, Date updatedAt) {
        this(createdAt, datafileSize, datafileUrl, (String) null, deviceClass, (String) null, keyTableUrl,
             (String) null, timestamp, updatedAt);
    }

    /**
     * Gets the time the object was created.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets the size of the datafile in bytes.
     * 
     * @return datafileSize
     */
    public long getDatafileSize() {
        return datafileSize;
    }

    /**
     * Gets the url of the firmware manifest binary.
     * 
     * @return datafileUrl
     */
    public String getDatafileUrl() {
        return datafileUrl;
    }

    /**
     * Gets the description of the firmware manifest.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the firmware manifest.
     *
     * <p>
     * Note: the length of the string has to be less than or equal to {@code 2000} to be valid
     * 
     * @param description
     *            The description of the firmware manifest.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Checks whether description value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isDescriptionValid() {
        return (description == null || description.length() <= 2000);
    }

    /**
     * Gets the class of the device.
     * 
     * @return deviceClass
     */
    public String getDeviceClass() {
        return deviceClass;
    }

    /**
     * Gets the firmware manifest id.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the firmware manifest id.
     * 
     * @param id
     *            The firmware manifest ID.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the firmware manifest id.
     *
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param firmwareManifestId
     *            The firmware manifest ID.
     */
    @Internal
    public void setFirmwareManifestId(String firmwareManifestId) {
        setId(firmwareManifestId);
    }

    /**
     * Gets the key table of pre-shared keys for devices.
     * 
     * @return keyTableUrl
     */
    public String getKeyTableUrl() {
        return keyTableUrl;
    }

    /**
     * Gets the name of the object.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the object.
     *
     * <p>
     * Note: the length of the string has to be less than or equal to {@code 128} to be valid
     * 
     * @param name
     *            The name of the object.
     */
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
        return (name == null || name.length() <= 128);
    }

    /**
     * Gets the firmware manifest version as a timestamp.
     * 
     * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Gets the time the object was updated.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
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
        final Map<String, String> filterMapping = new Hashtable<>(2);
        filterMapping.put("datafileUrl", "datafile");
        filterMapping.put("keyTableUrl", "key_table");
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
        return "FirmwareManifest [createdAt=" + createdAt + ", datafileSize=" + datafileSize + ", datafileUrl="
               + datafileUrl + ", description=" + description + ", deviceClass=" + deviceClass + ", id=" + id
               + ", keyTableUrl=" + keyTableUrl + ", name=" + name + ", timestamp=" + timestamp + ", updatedAt="
               + updatedAt + "]";
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
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + Objects.hashCode(Long.valueOf(datafileSize));
        result = prime * result + ((datafileUrl == null) ? 0 : datafileUrl.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((deviceClass == null) ? 0 : deviceClass.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((keyTableUrl == null) ? 0 : keyTableUrl.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
        return other instanceof FirmwareManifest;
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
        if (!(obj instanceof FirmwareManifest)) {
            return false;
        }
        final FirmwareManifest other = (FirmwareManifest) obj;
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
        if (datafileSize != other.datafileSize) {
            return false;
        }
        if (datafileUrl == null) {
            if (other.datafileUrl != null) {
                return false;
            }
        } else if (!datafileUrl.equals(other.datafileUrl)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (deviceClass == null) {
            if (other.deviceClass != null) {
                return false;
            }
        } else if (!deviceClass.equals(other.deviceClass)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (keyTableUrl == null) {
            if (other.keyTableUrl != null) {
                return false;
            }
        } else if (!keyTableUrl.equals(other.keyTableUrl)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (timestamp == null) {
            if (other.timestamp != null) {
                return false;
            }
        } else if (!timestamp.equals(other.timestamp)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
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
        return isDescriptionValid() && isNameValid();
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
    public FirmwareManifest clone() {
        return new FirmwareManifest(this);
    }
}

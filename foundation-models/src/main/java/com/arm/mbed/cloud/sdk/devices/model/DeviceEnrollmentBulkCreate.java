// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.Objects;

/**
 * Model for a device enrollment bulk create.
 */
@Preamble(description = "Model for a device enrollment bulk create.")
public class DeviceEnrollmentBulkCreate implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 6511005054522935L;

    /**
     * ID.
     */
    private String accountId;

    /**
     * The time of completing the bulk creation task.
     */
    private Date completedAt;

    /**
     * The time of receiving the bulk creation task.
     */
    private Date createdAt;

    /**
     * The number of enrollment identities with failed processing.
     */
    private int errorsCount;

    /**
     * value.
     */
    private String errorsReportFile;

    /**
     * value.
     */
    private String fullReportFile;

    /**
     * Bulk ID.
     */
    private String id;

    /**
     * The number of enrollment identities processed until now.
     */
    private int processedCount;

    /**
     * The state of the process is 'new' at the time of creation. If the creation is still in progress, the state is
     * shown as 'processing'. When the request has been fully processed, the state changes to 'completed'.
     */
    @DefaultValue("new")
    private DeviceEnrollmentBulkCreateStatus status;

    /**
     * Total number of enrollment identities found in the input CSV.
     */
    private int totalCount;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #DeviceEnrollmentBulkCreate()} instead.
     * 
     * @param accountId
     *            ID.
     * @param completedAt
     *            The time of completing the bulk creation task.
     * 
     * @param createdAt
     *            The time of receiving the bulk creation task.
     * 
     * @param errorsCount
     *            The number of enrollment identities with failed processing.
     * 
     * @param errorsReportFile
     *            value.
     * @param fullReportFile
     *            value.
     * @param id
     *            Bulk ID.
     * @param processedCount
     *            The number of enrollment identities processed until now.
     * 
     * @param status
     *            The state of the process is 'new' at the time of creation. If the creation is still in progress, the
     *            state is shown as 'processing'. When the request has been fully processed, the state changes to
     *            'completed'.
     * 
     * @param totalCount
     *            Total number of enrollment identities found in the input CSV.
     * 
     */
    @Internal
    public DeviceEnrollmentBulkCreate(String accountId, Date completedAt, Date createdAt, int errorsCount,
                                      String errorsReportFile, String fullReportFile, String id, int processedCount,
                                      @DefaultValue("new") DeviceEnrollmentBulkCreateStatus status, int totalCount) {
        super();
        setAccountId(accountId);
        setCompletedAt(completedAt);
        setCreatedAt(createdAt);
        setErrorsCount(errorsCount);
        setErrorsReportFile(errorsReportFile);
        setFullReportFile(fullReportFile);
        setId(id);
        setProcessedCount(processedCount);
        setStatus(status);
        setTotalCount(totalCount);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #DeviceEnrollmentBulkCreate()} instead.
     * 
     * @param deviceEnrollmentBulkCreate
     *            a device enrollment bulk create.
     */
    @Internal
    public DeviceEnrollmentBulkCreate(DeviceEnrollmentBulkCreate deviceEnrollmentBulkCreate) {
        this(deviceEnrollmentBulkCreate == null ? (String) null : deviceEnrollmentBulkCreate.accountId,
             deviceEnrollmentBulkCreate == null ? new java.util.Date() : deviceEnrollmentBulkCreate.completedAt,
             deviceEnrollmentBulkCreate == null ? new java.util.Date() : deviceEnrollmentBulkCreate.createdAt,
             deviceEnrollmentBulkCreate == null ? 0 : deviceEnrollmentBulkCreate.errorsCount,
             deviceEnrollmentBulkCreate == null ? (String) null : deviceEnrollmentBulkCreate.errorsReportFile,
             deviceEnrollmentBulkCreate == null ? (String) null : deviceEnrollmentBulkCreate.fullReportFile,
             deviceEnrollmentBulkCreate == null ? (String) null : deviceEnrollmentBulkCreate.id,
             deviceEnrollmentBulkCreate == null ? 0 : deviceEnrollmentBulkCreate.processedCount,
             deviceEnrollmentBulkCreate == null ? DeviceEnrollmentBulkCreateStatus.getValue("new")
                                                : deviceEnrollmentBulkCreate.status,
             deviceEnrollmentBulkCreate == null ? 0 : deviceEnrollmentBulkCreate.totalCount);
    }

    /**
     * Constructor.
     */
    public DeviceEnrollmentBulkCreate() {
        this((String) null, new java.util.Date(), new java.util.Date(), 0, (String) null, (String) null, (String) null,
             0, DeviceEnrollmentBulkCreateStatus.getValue("new"), 0);
    }

    /**
     * Constructor.
     * 
     * @param id
     *            Bulk ID.
     */
    public DeviceEnrollmentBulkCreate(String id) {
        this();
        setId(id);
    }

    /**
     * Gets id.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets id.
     * 
     * @param accountId
     *            ID.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the time of completing the bulk creation task.
     * 
     * @return completedAt
     */
    public Date getCompletedAt() {
        return completedAt;
    }

    /**
     * Sets the time of completing the bulk creation task.
     * 
     * @param completedAt
     *            The time of completing the bulk creation task.
     * 
     */
    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Gets the time of receiving the bulk creation task.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the time of receiving the bulk creation task.
     * 
     * @param createdAt
     *            The time of receiving the bulk creation task.
     * 
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the number of enrollment identities with failed processing.
     * 
     * @return errorsCount
     */
    public int getErrorsCount() {
        return errorsCount;
    }

    /**
     * Sets the number of enrollment identities with failed processing.
     * 
     * @param errorsCount
     *            The number of enrollment identities with failed processing.
     * 
     */
    public void setErrorsCount(int errorsCount) {
        this.errorsCount = errorsCount;
    }

    /**
     * Gets value.
     * 
     * @return errorsReportFile
     */
    public String getErrorsReportFile() {
        return errorsReportFile;
    }

    /**
     * Sets value.
     * 
     * @param errorsReportFile
     *            value.
     */
    public void setErrorsReportFile(String errorsReportFile) {
        this.errorsReportFile = errorsReportFile;
    }

    /**
     * Gets value.
     * 
     * @return fullReportFile
     */
    public String getFullReportFile() {
        return fullReportFile;
    }

    /**
     * Sets value.
     * 
     * @param fullReportFile
     *            value.
     */
    public void setFullReportFile(String fullReportFile) {
        this.fullReportFile = fullReportFile;
    }

    /**
     * Gets bulk id.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets bulk id.
     * <p>
     * null
     * <p>
     * Note: the value has to match [^[A-Za-z0-9]{32}] to be valid
     * 
     * @param id
     *            Bulk ID.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets bulk id.
     * <p>
     * Similar to {@link #setId(String)}
     * <p>
     * Note: the value has to match [^[A-Za-z0-9]{32}] to be valid
     * 
     * @param deviceEnrollmentBulkCreateId
     *            Bulk ID.
     */
    @Internal
    public void setDeviceEnrollmentBulkCreateId(String deviceEnrollmentBulkCreateId) {
        setId(deviceEnrollmentBulkCreateId);
    }

    /**
     * Checks whether id value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    public boolean isIdValid() {
        return (id == null || id.matches("^[A-Za-z0-9]{32}"));
    }

    /**
     * Gets the number of enrollment identities processed until now.
     * 
     * @return processedCount
     */
    public int getProcessedCount() {
        return processedCount;
    }

    /**
     * Sets the number of enrollment identities processed until now.
     * 
     * @param processedCount
     *            The number of enrollment identities processed until now.
     * 
     */
    public void setProcessedCount(int processedCount) {
        this.processedCount = processedCount;
    }

    /**
     * Gets the state of the process is 'new' at the time of creation. if the creation is still in progress, the state
     * is shown as 'processing'. when the request has been fully processed, the state changes to 'completed'.
     * 
     * @return status
     */
    public DeviceEnrollmentBulkCreateStatus getStatus() {
        return status;
    }

    /**
     * Sets the state of the process is 'new' at the time of creation. if the creation is still in progress, the state
     * is shown as 'processing'. when the request has been fully processed, the state changes to 'completed'.
     * 
     * @param status
     *            The state of the process is 'new' at the time of creation. If the creation is still in progress, the
     *            state is shown as 'processing'. When the request has been fully processed, the state changes to
     *            'completed'.
     * 
     */
    public void setStatus(@DefaultValue("new") DeviceEnrollmentBulkCreateStatus status) {
        this.status = status;
    }

    /**
     * Gets total number of enrollment identities found in the input csv.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets total number of enrollment identities found in the input csv.
     * 
     * @param totalCount
     *            Total number of enrollment identities found in the input CSV.
     * 
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
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
        result = prime * result + ((completedAt == null) ? 0 : completedAt.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + Objects.hashCode(errorsCount);
        result = prime * result + ((errorsReportFile == null) ? 0 : errorsReportFile.hashCode());
        result = prime * result + ((fullReportFile == null) ? 0 : fullReportFile.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + Objects.hashCode(processedCount);
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + Objects.hashCode(totalCount);
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
        return other instanceof DeviceEnrollmentBulkCreate;
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
        if (!(obj instanceof DeviceEnrollmentBulkCreate)) {
            return false;
        }
        final DeviceEnrollmentBulkCreate other = (DeviceEnrollmentBulkCreate) obj;
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
        if (completedAt == null) {
            if (other.completedAt != null) {
                return false;
            }
        } else if (!completedAt.equals(other.completedAt)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (errorsCount != other.errorsCount) {
            return false;
        }
        if (errorsReportFile == null) {
            if (other.errorsReportFile != null) {
                return false;
            }
        } else if (!errorsReportFile.equals(other.errorsReportFile)) {
            return false;
        }
        if (fullReportFile == null) {
            if (other.fullReportFile != null) {
                return false;
            }
        } else if (!fullReportFile.equals(other.fullReportFile)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (processedCount != other.processedCount) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (totalCount != other.totalCount) {
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
        return "DeviceEnrollmentBulkCreate [accountId=" + accountId + ", completedAt=" + completedAt + ", createdAt="
               + createdAt + ", errorsCount=" + errorsCount + ", errorsReportFile=" + errorsReportFile
               + ", fullReportFile=" + fullReportFile + ", id=" + id + ", processedCount=" + processedCount
               + ", status=" + status + ", totalCount=" + totalCount + "]";
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
        return isIdValid();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public DeviceEnrollmentBulkCreate clone() {
        return new DeviceEnrollmentBulkCreate(this);
    }
}

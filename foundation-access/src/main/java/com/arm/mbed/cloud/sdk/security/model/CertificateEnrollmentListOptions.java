// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.IncludeField;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filter;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filters;
import java.util.Date;
import java.util.List;

/**
 * Options to use when listing certificate enrollments.
 */
@Preamble(description = "Options to use when listing certificate enrollments.")
public class CertificateEnrollmentListOptions extends ListOptions {
    /**
     * Tag for filter by updatedAt.
     */
    public static final String TAG_FILTER_BY_UPDATED_AT = "updatedAt";

    /**
     * Tag for filter by certificateName.
     */
    public static final String TAG_FILTER_BY_CERTIFICATE_NAME = "certificateName";

    /**
     * Tag for filter by deviceId.
     */
    public static final String TAG_FILTER_BY_DEVICE_ID = "deviceId";

    /**
     * Tag for filter by enrollResult.
     */
    public static final String TAG_FILTER_BY_ENROLL_RESULT = "enrollResult";

    /**
     * Tag for filter by createdAt.
     */
    public static final String TAG_FILTER_BY_CREATED_AT = "createdAt";

    /**
     * Tag for filter by enrollStatus.
     */
    public static final String TAG_FILTER_BY_ENROLL_STATUS = "enrollStatus";

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #CertificateEnrollmentListOptions()} instead.
     * 
     * @param pageSize
     *            value.
     * @param maxResults
     *            value.
     * @param order
     *            enumerator value.
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public CertificateEnrollmentListOptions(Integer pageSize, Long maxResults, Order order, String after,
                                            List<IncludeField> include, Filters filter) {
        super();
        this.pageSize = pageSize;
        this.maxResults = maxResults;
        this.order = order;
        this.after = after;
        this.include = include;
        this.filter = filter;
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #CertificateEnrollmentListOptions()} instead.
     * 
     * @param certificateEnrollmentListOptions
     *            a certificate enrollment list options.
     */
    @Internal
    public CertificateEnrollmentListOptions(CertificateEnrollmentListOptions certificateEnrollmentListOptions) {
        this();
        setOptions(certificateEnrollmentListOptions);
    }

    /**
     * Constructor.
     */
    public CertificateEnrollmentListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #CertificateEnrollmentListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public CertificateEnrollmentListOptions(String after, List<IncludeField> include, Filters filter) {
        this(0, 0L, Order.getDefault(), after, include, filter);
    }

    /**
     * Gets all the filters defined on field {@code updatedAt}.
     * 
     * @return All the filters by {@code updatedAt}
     */
    public List<Filter> getUpdatedAtFilters() {
        return fetchFilters(TAG_FILTER_BY_UPDATED_AT);
    }

    /**
     * Sets "a less than" filter by {@code updatedAt}.
     * 
     * @param filterByUpdatedAt
     *            filter value.
     */
    public void setLessThanUpdatedAtFilter(Date filterByUpdatedAt) {
        addLessThanFilter(TAG_FILTER_BY_UPDATED_AT, filterByUpdatedAt);
    }

    /**
     * Sets "a less than" filter by {@code updatedAt}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setLessThanUpdatedAtFilter(java.util.Date)}
     * 
     * @param filterByUpdatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T lessThanUpdatedAt(Date filterByUpdatedAt) {
        setLessThanUpdatedAtFilter(filterByUpdatedAt);
        return (T) this;
    }

    /**
     * Sets "a greater than" filter by {@code updatedAt}.
     * 
     * @param filterByUpdatedAt
     *            filter value.
     */
    public void setGreaterThanUpdatedAtFilter(Date filterByUpdatedAt) {
        addGreaterThanFilter(TAG_FILTER_BY_UPDATED_AT, filterByUpdatedAt);
    }

    /**
     * Sets "a greater than" filter by {@code updatedAt}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setGreaterThanUpdatedAtFilter(java.util.Date)}
     * 
     * @param filterByUpdatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T greaterThanUpdatedAt(Date filterByUpdatedAt) {
        setGreaterThanUpdatedAtFilter(filterByUpdatedAt);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code certificateName}.
     * 
     * @return All the filters by {@code certificateName}
     */
    public List<Filter> getCertificateNameFilters() {
        return fetchFilters(TAG_FILTER_BY_CERTIFICATE_NAME);
    }

    /**
     * Sets "an equal to" filter by {@code certificateName}.
     * 
     * @param filterByCertificateName
     *            filter value.
     */
    public void setEqualToCertificateNameFilter(String filterByCertificateName) {
        addEqualFilter(TAG_FILTER_BY_CERTIFICATE_NAME, filterByCertificateName);
    }

    /**
     * Sets "an equal to" filter by {@code certificateName}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setEqualToCertificateNameFilter(String)}
     * 
     * @param filterByCertificateName
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T equalToCertificateName(String filterByCertificateName) {
        setEqualToCertificateNameFilter(filterByCertificateName);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code deviceId}.
     * 
     * @return All the filters by {@code deviceId}
     */
    public List<Filter> getDeviceIdFilters() {
        return fetchFilters(TAG_FILTER_BY_DEVICE_ID);
    }

    /**
     * Sets "an equal to" filter by {@code deviceId}.
     * 
     * @param filterByDeviceId
     *            filter value.
     */
    public void setEqualToDeviceIdFilter(String filterByDeviceId) {
        addEqualFilter(TAG_FILTER_BY_DEVICE_ID, filterByDeviceId);
    }

    /**
     * Sets "an equal to" filter by {@code deviceId}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setEqualToDeviceIdFilter(String)}
     * 
     * @param filterByDeviceId
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T equalToDeviceId(String filterByDeviceId) {
        setEqualToDeviceIdFilter(filterByDeviceId);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code enrollResult}.
     * 
     * @return All the filters by {@code enrollResult}
     */
    public List<Filter> getEnrollResultFilters() {
        return fetchFilters(TAG_FILTER_BY_ENROLL_RESULT);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollResult}.
     * 
     * @param filterByEnrollResult
     *            filter value.
     */
    public void setNotEqualToEnrollResultFilter(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        addNotEqualFilter(TAG_FILTER_BY_ENROLL_RESULT, filterByEnrollResult);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollResult}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setNotEqualToEnrollResultFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollResult)}
     * 
     * @param filterByEnrollResult
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           notEqualToEnrollResult(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        setNotEqualToEnrollResultFilter(filterByEnrollResult);
        return (T) this;
    }

    /**
     * Sets "an equal to" filter by {@code enrollResult}.
     * 
     * @param filterByEnrollResult
     *            filter value.
     */
    public void setEqualToEnrollResultFilter(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        addEqualFilter(TAG_FILTER_BY_ENROLL_RESULT, filterByEnrollResult);
    }

    /**
     * Sets "an equal to" filter by {@code enrollResult}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setEqualToEnrollResultFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollResult)}
     * 
     * @param filterByEnrollResult
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           equalToEnrollResult(CertificateEnrollmentEnrollResult filterByEnrollResult) {
        setEqualToEnrollResultFilter(filterByEnrollResult);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code createdAt}.
     * 
     * @return All the filters by {@code createdAt}
     */
    public List<Filter> getCreatedAtFilters() {
        return fetchFilters(TAG_FILTER_BY_CREATED_AT);
    }

    /**
     * Sets "a less than" filter by {@code createdAt}.
     * 
     * @param filterByCreatedAt
     *            filter value.
     */
    public void setLessThanCreatedAtFilter(Date filterByCreatedAt) {
        addLessThanFilter(TAG_FILTER_BY_CREATED_AT, filterByCreatedAt);
    }

    /**
     * Sets "a less than" filter by {@code createdAt}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setLessThanCreatedAtFilter(java.util.Date)}
     * 
     * @param filterByCreatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T lessThanCreatedAt(Date filterByCreatedAt) {
        setLessThanCreatedAtFilter(filterByCreatedAt);
        return (T) this;
    }

    /**
     * Sets "a greater than" filter by {@code createdAt}.
     * 
     * @param filterByCreatedAt
     *            filter value.
     */
    public void setGreaterThanCreatedAtFilter(Date filterByCreatedAt) {
        addGreaterThanFilter(TAG_FILTER_BY_CREATED_AT, filterByCreatedAt);
    }

    /**
     * Sets "a greater than" filter by {@code createdAt}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setGreaterThanCreatedAtFilter(java.util.Date)}
     * 
     * @param filterByCreatedAt
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T greaterThanCreatedAt(Date filterByCreatedAt) {
        setGreaterThanCreatedAtFilter(filterByCreatedAt);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code enrollStatus}.
     * 
     * @return All the filters by {@code enrollStatus}
     */
    public List<Filter> getEnrollStatusFilters() {
        return fetchFilters(TAG_FILTER_BY_ENROLL_STATUS);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollStatus}.
     * 
     * @param filterByEnrollStatus
     *            filter value.
     */
    public void setNotEqualToEnrollStatusFilter(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        addNotEqualFilter(TAG_FILTER_BY_ENROLL_STATUS, filterByEnrollStatus);
    }

    /**
     * Sets "a not equal to" filter by {@code enrollStatus}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setNotEqualToEnrollStatusFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollStatus)}
     * 
     * @param filterByEnrollStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        setNotEqualToEnrollStatusFilter(filterByEnrollStatus);
        return (T) this;
    }

    /**
     * Sets "an equal to" filter by {@code enrollStatus}.
     * 
     * @param filterByEnrollStatus
     *            filter value.
     */
    public void setEqualToEnrollStatusFilter(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        addEqualFilter(TAG_FILTER_BY_ENROLL_STATUS, filterByEnrollStatus);
    }

    /**
     * Sets "an equal to" filter by {@code enrollStatus}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentListOptions#setEqualToEnrollStatusFilter(com.arm.mbed.cloud.sdk.security.model.CertificateEnrollmentEnrollStatus)}
     * 
     * @param filterByEnrollStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends CertificateEnrollmentListOptions> T
           equalToEnrollStatus(CertificateEnrollmentEnrollStatus filterByEnrollStatus) {
        setEqualToEnrollStatusFilter(filterByEnrollStatus);
        return (T) this;
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
        return other instanceof CertificateEnrollmentListOptions;
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
        return "CertificateEnrollmentListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults + ", order="
               + order + ", after=" + after + ", include=" + encodeInclude() + ", filter=" + retrieveFilterAsJson()
               + "]";
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public CertificateEnrollmentListOptions clone() {
        final CertificateEnrollmentListOptions opt = new CertificateEnrollmentListOptions();
        opt.setOptions(this);
        return opt;
    }
}

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
import java.util.List;

/**
 * Options to use when listing subtenant trusted certificates.
 * <p>
 * Note:
 * <p>
 * <ul>
 * <li>Filters:
 * <p>
 * The list can be filtered server-side on some of the fields of a subtenant trusted certificate.
 * <p>
 * The following filters are currently supported:
 *
 * <p>
 * <table style="border: 2px solid navy; width:100%; border-collapse:collapse;border-spacing:0" summary="Available
 * filters">
 * <caption>Server-side filters</caption>
 * <tr>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" rowspan="2">Field</th>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" rowspan="2">Tag</th>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" colspan="7">Filters</th>
 * </tr>
 * <tr>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">not equal to</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">equal to</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">greater than</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">less than</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">like</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">in</td>
 * <td style="background-color:#dae8fc;text-align:center;" width="10%">not in</td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">service</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_SERVICE</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">status</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_STATUS</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">name</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_NAME</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">subject</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_SUBJECT</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">issuer</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_ISSUER</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">valid</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_VALID</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">deviceExecutionMode</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_DEVICE_EXECUTION_MODE</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">enrollmentMode</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_ENROLLMENT_MODE</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold"></td>
 * </tr>
 * </table>
 * </li>
 * </ul>
 */
@Preamble(description = "Options to use when listing subtenant trusted certificates.")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class SubtenantTrustedCertificateListOptions extends ListOptions {
    /**
     * Tag for filter by deviceExecutionMode.
     */
    public static final String TAG_FILTER_BY_DEVICE_EXECUTION_MODE = "deviceExecutionMode";

    /**
     * Tag for filter by enrollmentMode.
     */
    public static final String TAG_FILTER_BY_ENROLLMENT_MODE = "enrollmentMode";

    /**
     * Tag for filter by issuer.
     */
    public static final String TAG_FILTER_BY_ISSUER = "issuer";

    /**
     * Tag for filter by name.
     */
    public static final String TAG_FILTER_BY_NAME = "name";

    /**
     * Tag for filter by service.
     */
    public static final String TAG_FILTER_BY_SERVICE = "service";

    /**
     * Tag for filter by status.
     */
    public static final String TAG_FILTER_BY_STATUS = "status";

    /**
     * Tag for filter by subject.
     */
    public static final String TAG_FILTER_BY_SUBJECT = "subject";

    /**
     * Tag for filter by valid.
     */
    public static final String TAG_FILTER_BY_VALID = "valid";

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantTrustedCertificateListOptions()} instead.
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
    public SubtenantTrustedCertificateListOptions(Integer pageSize, Long maxResults, Order order, String after,
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
     *
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantTrustedCertificateListOptions()} instead.
     * 
     * @param subtenantTrustedCertificateListOptions
     *            a subtenant trusted certificate list options.
     */
    @Internal
    public SubtenantTrustedCertificateListOptions(SubtenantTrustedCertificateListOptions subtenantTrustedCertificateListOptions) {
        this();
        setOptions(subtenantTrustedCertificateListOptions);
    }

    /**
     * Constructor.
     */
    public SubtenantTrustedCertificateListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantTrustedCertificateListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public SubtenantTrustedCertificateListOptions(String after, List<IncludeField> include, Filters filter) {
        this((Integer) null, (Long) null, Order.getDefault(), after, include, filter);
    }

    /**
     * Gets all the filters defined on field {@code valid}.
     * 
     * @return All the filters by {@code valid}
     */
    public List<Filter> getValidFilters() {
        return fetchFilters(TAG_FILTER_BY_VALID);
    }

    /**
     * Sets "an equal to" filter by {@code valid}.
     * 
     * @param filterByValid
     *            filter value.
     */
    public void addEqualToValidFilter(boolean filterByValid) {
        addEqualFilter(TAG_FILTER_BY_VALID, Boolean.valueOf(filterByValid));
    }

    /**
     * Sets "an equal to" filter by {@code valid}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addEqualToValidFilter(boolean)}
     * 
     * @param filterByValid
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T equalToValid(boolean filterByValid) {
        addEqualToValidFilter(filterByValid);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code name}.
     * 
     * @return All the filters by {@code name}
     */
    public List<Filter> getNameFilters() {
        return fetchFilters(TAG_FILTER_BY_NAME);
    }

    /**
     * Sets "an equal to" filter by {@code name}.
     * 
     * @param filterByName
     *            filter value.
     */
    public void addEqualToNameFilter(String filterByName) {
        addEqualFilter(TAG_FILTER_BY_NAME, filterByName);
    }

    /**
     * Sets "an equal to" filter by {@code name}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addEqualToNameFilter(String)}
     * 
     * @param filterByName
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T equalToName(String filterByName) {
        addEqualToNameFilter(filterByName);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code status}.
     * 
     * @return All the filters by {@code status}
     */
    public List<Filter> getStatusFilters() {
        return fetchFilters(TAG_FILTER_BY_STATUS);
    }

    /**
     * Sets "an equal to" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addEqualToStatusFilter(SubtenantTrustedCertificateStatus filterByStatus) {
        addEqualFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an equal to" filter by {@code status}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addEqualToStatusFilter(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateStatus)}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T
           equalToStatus(SubtenantTrustedCertificateStatus filterByStatus) {
        addEqualToStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code deviceExecutionMode}.
     * 
     * @return All the filters by {@code deviceExecutionMode}
     */
    public List<Filter> getDeviceExecutionModeFilters() {
        return fetchFilters(TAG_FILTER_BY_DEVICE_EXECUTION_MODE);
    }

    /**
     * Sets "an equal to" filter by {@code deviceExecutionMode}.
     * 
     * @param filterByDeviceExecutionMode
     *            filter value.
     */
    public void addEqualToDeviceExecutionModeFilter(int filterByDeviceExecutionMode) {
        addEqualFilter(TAG_FILTER_BY_DEVICE_EXECUTION_MODE, Integer.valueOf(filterByDeviceExecutionMode));
    }

    /**
     * Sets "an equal to" filter by {@code deviceExecutionMode}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addEqualToDeviceExecutionModeFilter(int)}
     * 
     * @param filterByDeviceExecutionMode
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T
           equalToDeviceExecutionMode(int filterByDeviceExecutionMode) {
        addEqualToDeviceExecutionModeFilter(filterByDeviceExecutionMode);
        return (T) this;
    }

    /**
     * Sets "a not equal to" filter by {@code deviceExecutionMode}.
     * 
     * @param filterByDeviceExecutionMode
     *            filter value.
     */
    public void addNotEqualToDeviceExecutionModeFilter(int filterByDeviceExecutionMode) {
        addNotEqualFilter(TAG_FILTER_BY_DEVICE_EXECUTION_MODE, Integer.valueOf(filterByDeviceExecutionMode));
    }

    /**
     * Sets "a not equal to" filter by {@code deviceExecutionMode}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addNotEqualToDeviceExecutionModeFilter(int)}
     * 
     * @param filterByDeviceExecutionMode
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T
           notEqualToDeviceExecutionMode(int filterByDeviceExecutionMode) {
        addNotEqualToDeviceExecutionModeFilter(filterByDeviceExecutionMode);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code issuer}.
     * 
     * @return All the filters by {@code issuer}
     */
    public List<Filter> getIssuerFilters() {
        return fetchFilters(TAG_FILTER_BY_ISSUER);
    }

    /**
     * Sets "a like" filter by {@code issuer}.
     * 
     * @param filterByIssuer
     *            filter value.
     */
    public void addLikeIssuerFilter(String filterByIssuer) {
        addLikeFilter(TAG_FILTER_BY_ISSUER, filterByIssuer);
    }

    /**
     * Sets "a like" filter by {@code issuer}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addLikeIssuerFilter(String)}
     * 
     * @param filterByIssuer
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T likeIssuer(String filterByIssuer) {
        addLikeIssuerFilter(filterByIssuer);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code service}.
     * 
     * @return All the filters by {@code service}
     */
    public List<Filter> getServiceFilters() {
        return fetchFilters(TAG_FILTER_BY_SERVICE);
    }

    /**
     * Sets "an equal to" filter by {@code service}.
     * 
     * @param filterByService
     *            filter value.
     */
    public void addEqualToServiceFilter(SubtenantTrustedCertificateService filterByService) {
        addEqualFilter(TAG_FILTER_BY_SERVICE, filterByService);
    }

    /**
     * Sets "an equal to" filter by {@code service}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addEqualToServiceFilter(com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateService)}
     * 
     * @param filterByService
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T
           equalToService(SubtenantTrustedCertificateService filterByService) {
        addEqualToServiceFilter(filterByService);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code subject}.
     * 
     * @return All the filters by {@code subject}
     */
    public List<Filter> getSubjectFilters() {
        return fetchFilters(TAG_FILTER_BY_SUBJECT);
    }

    /**
     * Sets "a like" filter by {@code subject}.
     * 
     * @param filterBySubject
     *            filter value.
     */
    public void addLikeSubjectFilter(String filterBySubject) {
        addLikeFilter(TAG_FILTER_BY_SUBJECT, filterBySubject);
    }

    /**
     * Sets "a like" filter by {@code subject}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addLikeSubjectFilter(String)}
     * 
     * @param filterBySubject
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T likeSubject(String filterBySubject) {
        addLikeSubjectFilter(filterBySubject);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code enrollmentMode}.
     * 
     * @return All the filters by {@code enrollmentMode}
     */
    public List<Filter> getEnrollmentModeFilters() {
        return fetchFilters(TAG_FILTER_BY_ENROLLMENT_MODE);
    }

    /**
     * Sets "an equal to" filter by {@code enrollmentMode}.
     * 
     * @param filterByEnrollmentMode
     *            filter value.
     */
    public void addEqualToEnrollmentModeFilter(boolean filterByEnrollmentMode) {
        addEqualFilter(TAG_FILTER_BY_ENROLLMENT_MODE, Boolean.valueOf(filterByEnrollmentMode));
    }

    /**
     * Sets "an equal to" filter by {@code enrollmentMode}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions#addEqualToEnrollmentModeFilter(boolean)}
     * 
     * @param filterByEnrollmentMode
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends SubtenantTrustedCertificateListOptions> T equalToEnrollmentMode(boolean filterByEnrollmentMode) {
        addEqualToEnrollmentModeFilter(filterByEnrollmentMode);
        return (T) this;
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
        return "SubtenantTrustedCertificateListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults
               + ", order=" + order + ", after=" + after + ", include="
               + com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder.encodeInclude(this) + ", filter="
               + retrieveFilterAsJson() + "]";
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
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SubtenantTrustedCertificateListOptions;
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
    public SubtenantTrustedCertificateListOptions clone() {
        final SubtenantTrustedCertificateListOptions opt = new SubtenantTrustedCertificateListOptions();
        opt.setOptions(this);
        return opt;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof SubtenantTrustedCertificateListOptions)) {
            return false;
        }
        final SubtenantTrustedCertificateListOptions other = (SubtenantTrustedCertificateListOptions) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        return true;
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
    @SuppressWarnings("PMD.UselessOverridingMethod")
    public int hashCode() {
        return super.hashCode();
    }
}
// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.IncludeField;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filter;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filters;
import java.util.List;

/**
 * Options to use when listing users.
 * <p>
 * Note:
 * <ul>
 * <li>Filters:
 * <p>
 * The list can be filtered server-side on some of the fields of a user.
 * <p>
 * The following filters are currently supported:
 * <table style="border: 2px solid navy; width:100%; border-collapse:collapse;border-spacing:0" summary="Available
 * filters">
 * <caption>Server-side filters</caption>
 * <tr>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" rowspan="2">Field</th>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" rowspan="2">Tag</th>
 * <th style="background-color:#cbcefb;border-color:inherit;text-align:center" colspan="7">Filters</th>
 * </tr>
 * <tr>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">not equal to</td>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">equal to</td>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">greater than</td>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">less than</td>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">like</td>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">in</td>
 * <td style="background-color:#dae8fc;text-align:center;width:10%;">not in</td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">loginProfiles</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_LOGIN_PROFILES</td>
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
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * <td style="border-color:inherit;text-align:center;font-weight:bold">&bull;</td>
 * </tr>
 * <tr>
 * <td style="border-color:inherit;text-align:left;padding-left:15px;padding-right:15px">email</td>
 * <td style=
 * "border-color:inherit;text-align:left;padding-left:15px;padding-right:15px;font-weight:bold">TAG_FILTER_BY_EMAIL</td>
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
@Preamble(description = "Options to use when listing users.")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class UserListOptions extends ListOptions {
    /**
     * Tag for filter by email.
     */
    public static final String TAG_FILTER_BY_EMAIL = "email";

    /**
     * Tag for filter by loginProfiles.
     */
    public static final String TAG_FILTER_BY_LOGIN_PROFILES = "loginProfiles";

    /**
     * Tag for filter by status.
     */
    public static final String TAG_FILTER_BY_STATUS = "status";

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #UserListOptions()} instead.
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
    public UserListOptions(Integer pageSize, Long maxResults, Order order, String after, List<IncludeField> include,
                           Filters filter) {
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
     * Note: Should not be used. Use {@link #UserListOptions()} instead.
     * 
     * @param userListOptions
     *            a user list options.
     */
    @Internal
    public UserListOptions(UserListOptions userListOptions) {
        this();
        setOptions(userListOptions);
    }

    /**
     * Constructor.
     */
    public UserListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #UserListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public UserListOptions(String after, Filters filter) {
        this((Integer) null, (Long) null, Order.getDefault(), after, (List<IncludeField>) null, filter);
    }

    /**
     * Gets all the filters defined on field {@code loginProfiles}.
     * 
     * @return All the filters by {@code loginProfiles}
     */
    public List<Filter> getLoginProfilesFilters() {
        return fetchFilters(TAG_FILTER_BY_LOGIN_PROFILES);
    }

    /**
     * Sets "an equal to" filter by {@code loginProfiles}.
     * 
     * @param filterByLoginProfiles
     *            filter value.
     */
    public void addEqualToLoginProfilesFilter(List<LoginProfile> filterByLoginProfiles) {
        addEqualFilter(TAG_FILTER_BY_LOGIN_PROFILES, filterByLoginProfiles);
    }

    /**
     * Sets "an equal to" filter by {@code loginProfiles}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addEqualToLoginProfilesFilter(java.util.List)}
     * 
     * @param filterByLoginProfiles
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T equalToLoginProfiles(List<LoginProfile> filterByLoginProfiles) {
        addEqualToLoginProfilesFilter(filterByLoginProfiles);
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
    public void addEqualToStatusFilter(UserStatus filterByStatus) {
        addEqualFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an equal to" filter by {@code status}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addEqualToStatusFilter(com.arm.mbed.cloud.sdk.accounts.model.UserStatus)}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T equalToStatus(UserStatus filterByStatus) {
        addEqualToStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "an in" filter by {@code status}.
     *
     * <p>
     * Note: In this case, the filter is a string corresponding to a list of values separated by a comma
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addInStatusesFilter(String filterByStatus) {
        addInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addInStatusesFilter(List<UserStatus> filterByStatus) {
        addInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addInStatusesFilter(UserStatus... filterByStatus) {
        addInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an in" filter by {@code status}.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addInStatusesFilter(String)}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T inStatuses(String filterByStatus) {
        addInStatusesFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "an in" filter by {@code status}.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addInStatusesFilter(java.util.List)}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T inStatuses(List<UserStatus> filterByStatus) {
        addInStatusesFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "an in" filter by {@code status}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addInStatusesFilter(com.arm.mbed.cloud.sdk.accounts.model.UserStatus[])}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T inStatuses(UserStatus... filterByStatus) {
        addInStatusesFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "a not in" filter by {@code status}.
     *
     * <p>
     * Note: In this case, the filter is a string corresponding to a list of values separated by a comma
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addNotInStatusesFilter(String filterByStatus) {
        addNotInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addNotInStatusesFilter(List<UserStatus> filterByStatus) {
        addNotInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void addNotInStatusesFilter(UserStatus... filterByStatus) {
        addNotInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "a not in" filter by {@code status}.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addNotInStatusesFilter(String)}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T notInStatuses(String filterByStatus) {
        addNotInStatusesFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "a not in" filter by {@code status}.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addNotInStatusesFilter(java.util.List)}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T notInStatuses(List<UserStatus> filterByStatus) {
        addNotInStatusesFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "a not in" filter by {@code status}.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addNotInStatusesFilter(com.arm.mbed.cloud.sdk.accounts.model.UserStatus[])}
     * 
     * @param filterByStatus
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T notInStatuses(UserStatus... filterByStatus) {
        addNotInStatusesFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Gets all the filters defined on field {@code email}.
     * 
     * @return All the filters by {@code email}
     */
    public List<Filter> getEmailFilters() {
        return fetchFilters(TAG_FILTER_BY_EMAIL);
    }

    /**
     * Sets "an equal to" filter by {@code email}.
     * 
     * @param filterByEmail
     *            filter value.
     */
    public void addEqualToEmailFilter(String filterByEmail) {
        addEqualFilter(TAG_FILTER_BY_EMAIL, filterByEmail);
    }

    /**
     * Sets "an equal to" filter by {@code email}.
     *
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.UserListOptions#addEqualToEmailFilter(String)}
     * 
     * @param filterByEmail
     *            filter value.
     * @param <T>
     *            type of a user list options
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends UserListOptions> T equalToEmail(String filterByEmail) {
        addEqualToEmailFilter(filterByEmail);
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
        return "UserListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults + ", order=" + order + ", after="
               + after + ", include=" + com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder.encodeInclude(this)
               + ", filter=" + retrieveFilterAsJson() + "]";
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
        return other instanceof UserListOptions;
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
    public UserListOptions clone() {
        final UserListOptions opt = new UserListOptions();
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
        if (!(obj instanceof UserListOptions)) {
            return false;
        }
        final UserListOptions other = (UserListOptions) obj;
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

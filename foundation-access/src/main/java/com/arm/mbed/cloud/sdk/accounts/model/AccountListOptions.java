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
 * Options to use when listing accounts.
 */
@Preamble(description = "Options to use when listing accounts.")
public class AccountListOptions extends ListOptions {
    /**
     * Tag for filter by tier.
     */
    public static final String TAG_FILTER_BY_TIER = "tier";

    /**
     * Tag for filter by status.
     */
    public static final String TAG_FILTER_BY_STATUS = "status";

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #AccountListOptions()} instead.
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
    public AccountListOptions(Integer pageSize, Long maxResults, Order order, String after, List<IncludeField> include,
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
     * <p>
     * Note: Should not be used. Use {@link #AccountListOptions()} instead.
     * 
     * @param accountListOptions
     *            an account list options.
     */
    @Internal
    public AccountListOptions(AccountListOptions accountListOptions) {
        this();
        setOptions(accountListOptions);
    }

    /**
     * Constructor.
     */
    public AccountListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #AccountListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public AccountListOptions(String after, List<IncludeField> include, Filters filter) {
        this(0, 0L, Order.getDefault(), after, include, filter);
    }

    /**
     * Gets all the filters defined on field {@code tier}.
     * 
     * @return All the filters by {@code tier}
     */
    public List<Filter> getTierFilters() {
        return fetchFilters(TAG_FILTER_BY_TIER);
    }

    /**
     * Sets "an equal to" filter by {@code tier}.
     * 
     * @param filterByTier
     *            filter value.
     */
    public void setEqualToTierFilter(String filterByTier) {
        addEqualFilter(TAG_FILTER_BY_TIER, filterByTier);
    }

    /**
     * Sets "an equal to" filter by {@code tier}.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setEqualToTierFilter(String)}
     * 
     * @param filterByTier
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T equalToTier(String filterByTier) {
        setEqualToTierFilter(filterByTier);
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
    public void setEqualToStatusFilter(AccountStatus filterByStatus) {
        addEqualFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an equal to" filter by {@code status}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setEqualToStatusFilter(com.arm.mbed.cloud.sdk.accounts.model.AccountStatus)}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T equalToStatus(AccountStatus filterByStatus) {
        setEqualToStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "an in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void setInStatusFilter(String filterByStatus) {
        addInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an in" filter by {@code status}.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setInStatusFilter(String)}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T inStatus(String filterByStatus) {
        setInStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "an in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void setInStatusFilter(List<AccountStatus> filterByStatus) {
        addInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an in" filter by {@code status}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setInStatusFilter(java.util.List<com.arm.mbed.cloud.sdk.accounts.model.AccountStatus>)}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T inStatus(List<AccountStatus> filterByStatus) {
        setInStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "an in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void setInStatusFilter(AccountStatus[] filterByStatus) {
        addInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "an in" filter by {@code status}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setInStatusFilter(com.arm.mbed.cloud.sdk.accounts.model.AccountStatus[])}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T inStatus(AccountStatus[] filterByStatus) {
        setInStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void setNotInStatusFilter(String filterByStatus) {
        addNotInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setNotInStatusFilter(String)}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T notInStatus(String filterByStatus) {
        setNotInStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void setNotInStatusFilter(List<AccountStatus> filterByStatus) {
        addNotInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setNotInStatusFilter(java.util.List<com.arm.mbed.cloud.sdk.accounts.model.AccountStatus>)}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T notInStatus(List<AccountStatus> filterByStatus) {
        setNotInStatusFilter(filterByStatus);
        return (T) this;
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * 
     * @param filterByStatus
     *            filter value.
     */
    public void setNotInStatusFilter(AccountStatus[] filterByStatus) {
        addNotInFilter(TAG_FILTER_BY_STATUS, filterByStatus);
    }

    /**
     * Sets "a not in" filter by {@code status}.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.AccountListOptions#setNotInStatusFilter(com.arm.mbed.cloud.sdk.accounts.model.AccountStatus[])}
     * 
     * @param filterByStatus
     *            filter value.
     * @return These list options
     */
    @SuppressWarnings("unchecked")
    public <T extends AccountListOptions> T notInStatus(AccountStatus[] filterByStatus) {
        setNotInStatusFilter(filterByStatus);
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
        return other instanceof AccountListOptions;
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
        return "AccountListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults + ", order=" + order
               + ", after=" + after + ", include=" + encodeInclude() + ", filter=" + retrieveFilterAsJson() + "]";
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public AccountListOptions clone() {
        final AccountListOptions opt = new AccountListOptions();
        opt.setOptions(this);
        return opt;
    }
}

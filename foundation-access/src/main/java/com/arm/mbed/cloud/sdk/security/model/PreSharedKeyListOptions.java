// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.IncludeField;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.filtering.Filters;
import java.util.List;

/**
 * Options to use when listing pre shared keys.
 * <p>
 * Note:
 * <p>
 * <ul>
 * <li>Filters:
 * <p>
 * The list can be filtered server-side on some of the fields of a pre shared key.
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
 * </table>
 * </li>
 * </ul>
 */
@Preamble(description = "Options to use when listing pre shared keys.")
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class PreSharedKeyListOptions extends ListOptions {
    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #PreSharedKeyListOptions()} instead.
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
    public PreSharedKeyListOptions(Integer pageSize, Long maxResults, Order order, String after,
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
     * Note: Should not be used. Use {@link #PreSharedKeyListOptions()} instead.
     * 
     * @param preSharedKeyListOptions
     *            a pre shared key list options.
     */
    @Internal
    public PreSharedKeyListOptions(PreSharedKeyListOptions preSharedKeyListOptions) {
        this();
        setOptions(preSharedKeyListOptions);
    }

    /**
     * Constructor.
     */
    public PreSharedKeyListOptions() {
        super();
        setDefault();
    }

    /**
     * Internal constructor.
     *
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #PreSharedKeyListOptions()} instead.
     * 
     * @param after
     *            value.
     * @param include
     *            value.
     * @param filter
     *            value.
     */
    @Internal
    public PreSharedKeyListOptions(String after, List<IncludeField> include, Filters filter) {
        this((Integer) null, (Long) null, Order.getDefault(), after, include, filter);
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
        return "PreSharedKeyListOptions [pageSize=" + pageSize + ", maxResults=" + maxResults + ", order=" + order
               + ", after=" + after + ", include="
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
        return other instanceof PreSharedKeyListOptions;
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
    public PreSharedKeyListOptions clone() {
        final PreSharedKeyListOptions opt = new PreSharedKeyListOptions();
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
        if (!(obj instanceof PreSharedKeyListOptions)) {
            return false;
        }
        final PreSharedKeyListOptions other = (PreSharedKeyListOptions) obj;
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

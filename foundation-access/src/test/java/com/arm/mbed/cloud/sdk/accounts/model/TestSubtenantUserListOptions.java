// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUserListOptions subtenantuserlistoptions1 = new SubtenantUserListOptions(Integer.valueOf(-125),
                                                                                              Long.valueOf(-44),
                                                                                              Order.getDefault(),
                                                                                              "4885776a-0940-4f36-9da6-8b00e62eb1d5",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions2 = subtenantuserlistoptions1.clone();
            assertNotNull(subtenantuserlistoptions1);
            assertNotNull(subtenantuserlistoptions2);
            assertNotSame(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            SubtenantUserListOptions option = new SubtenantUserListOptions().equalToStatus(SubtenantUserStatus.getDefault())
                                                                            .inStatuses(Arrays.asList(SubtenantUserStatus.getDefault(),
                                                                                                      SubtenantUserStatus.getDefault(),
                                                                                                      SubtenantUserStatus.getDefault(),
                                                                                                      SubtenantUserStatus.getDefault(),
                                                                                                      SubtenantUserStatus.getDefault(),
                                                                                                      SubtenantUserStatus.getDefault(),
                                                                                                      SubtenantUserStatus.getDefault()))
                                                                            .notInStatuses(Arrays.asList(SubtenantUserStatus.getDefault(),
                                                                                                         SubtenantUserStatus.getDefault()))
                                                                            .equalToEmail("db6f4.8fa81@81e4d.me");
            assertTrue(option.hasFilters());
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            assertTrue(option.hasFilters(SubtenantUserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(SubtenantUserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(SubtenantUserStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantUserListOptions.TAG_FILTER_BY_STATUS,
                                                                    SubtenantUserStatus.class, option));
            assertTrue(option.hasFilters(SubtenantUserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(SubtenantUserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(SubtenantUserStatus.getDefault(), SubtenantUserStatus.getDefault(),
                                       SubtenantUserStatus.getDefault(), SubtenantUserStatus.getDefault(),
                                       SubtenantUserStatus.getDefault(), SubtenantUserStatus.getDefault(),
                                       SubtenantUserStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleInFilter(SubtenantUserListOptions.TAG_FILTER_BY_STATUS,
                                                                 List.class, option));
            assertTrue(option.hasFilters(SubtenantUserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(SubtenantUserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.NOT_IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(SubtenantUserStatus.getDefault(), SubtenantUserStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleNotInFilter(SubtenantUserListOptions.TAG_FILTER_BY_STATUS,
                                                                    List.class, option));
            assertTrue(option.hasFilters(SubtenantUserListOptions.TAG_FILTER_BY_EMAIL));
            assertTrue(option.hasFilter(SubtenantUserListOptions.TAG_FILTER_BY_EMAIL, FilterOperator.EQUAL));
            assertNotNull(option.getEmailFilters());
            assertEquals("db6f4.8fa81@81e4d.me",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantUserListOptions.TAG_FILTER_BY_EMAIL,
                                                                    String.class, option));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            SubtenantUserListOptions subtenantuserlistoptions1 = new SubtenantUserListOptions(Integer.valueOf(-54),
                                                                                              Long.valueOf(-106),
                                                                                              Order.getDefault(),
                                                                                              "cbdc4996-1b39-4cdd-b585-d9bfe57d6f71",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions2 = new SubtenantUserListOptions(Integer.valueOf(-54),
                                                                                              Long.valueOf(-106),
                                                                                              Order.getDefault(),
                                                                                              "cbdc4996-1b39-4cdd-b585-d9bfe57d6f71",
                                                                                              null, null);
            assertNotNull(subtenantuserlistoptions1);
            assertNotNull(subtenantuserlistoptions2);
            assertNotSame(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2.hashCode(), subtenantuserlistoptions1.hashCode());
            int hashCode = subtenantuserlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuserlistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUserListOptions subtenantuserlistoptions1 = new SubtenantUserListOptions(Integer.valueOf(-33),
                                                                                              Long.valueOf(-37),
                                                                                              Order.getDefault(),
                                                                                              "ec99d7e1-45f6-4d7a-88b0-cc6505f9dfa6",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions2 = new SubtenantUserListOptions(Integer.valueOf(-33),
                                                                                              Long.valueOf(-37),
                                                                                              Order.getDefault(),
                                                                                              "ec99d7e1-45f6-4d7a-88b0-cc6505f9dfa6",
                                                                                              null, null);
            SubtenantUserListOptions subtenantuserlistoptions3 = new SubtenantUserListOptions(Integer.valueOf(64),
                                                                                              Long.valueOf(-106),
                                                                                              Order.getDefault(),
                                                                                              "1bea9e9d-3d1d-4037-8b22-62eeeffdb3c4",
                                                                                              null, null);
            assertNotNull(subtenantuserlistoptions1);
            assertNotNull(subtenantuserlistoptions2);
            assertNotNull(subtenantuserlistoptions3);
            assertNotSame(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertNotSame(subtenantuserlistoptions3, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions2, subtenantuserlistoptions1);
            assertEquals(subtenantuserlistoptions1, subtenantuserlistoptions2);
            assertEquals(subtenantuserlistoptions1, subtenantuserlistoptions1);
            assertFalse(subtenantuserlistoptions1.equals(null));
            assertNotEquals(subtenantuserlistoptions3, subtenantuserlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

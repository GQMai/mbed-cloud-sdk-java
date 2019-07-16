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
 * Unit tests for Model UserListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(66), Long.valueOf(-3),
                                                                   Order.getDefault(),
                                                                   "28c6c705-cda6-423b-97db-2b0c8e56e55f", null, null);
            UserListOptions userlistoptions2 = userlistoptions1.clone();
            assertNotNull(userlistoptions1);
            assertNotNull(userlistoptions2);
            assertNotSame(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
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
            UserListOptions option = new UserListOptions().equalToStatus(UserStatus.getDefault())
                                                          .inStatuses(Arrays.asList(UserStatus.getDefault()))
                                                          .notInStatuses(Arrays.asList(UserStatus.getDefault(),
                                                                                       UserStatus.getDefault(),
                                                                                       UserStatus.getDefault(),
                                                                                       UserStatus.getDefault()))
                                                          .equalToEmail("d27b9.e3732@7465d.me");
            assertTrue(option.hasFilters());
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(UserStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.TAG_FILTER_BY_STATUS,
                                                                    UserStatus.class, option));
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(UserStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleInFilter(UserListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                 option));
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_STATUS, FilterOperator.NOT_IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(UserStatus.getDefault(), UserStatus.getDefault(), UserStatus.getDefault(),
                                       UserStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleNotInFilter(UserListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                    option));
            assertTrue(option.hasFilters(UserListOptions.TAG_FILTER_BY_EMAIL));
            assertTrue(option.hasFilter(UserListOptions.TAG_FILTER_BY_EMAIL, FilterOperator.EQUAL));
            assertNotNull(option.getEmailFilters());
            assertEquals("d27b9.e3732@7465d.me",
                         ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.TAG_FILTER_BY_EMAIL, String.class,
                                                                    option));
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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(113), Long.valueOf(-99),
                                                                   Order.getDefault(),
                                                                   "ea26ff05-8271-47c2-8359-6389579b2fb6", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(113), Long.valueOf(-99),
                                                                   Order.getDefault(),
                                                                   "ea26ff05-8271-47c2-8359-6389579b2fb6", null, null);
            assertNotNull(userlistoptions1);
            assertNotNull(userlistoptions2);
            assertNotSame(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2.hashCode(), userlistoptions1.hashCode());
            int hashCode = userlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userlistoptions1.hashCode());
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
            UserListOptions userlistoptions1 = new UserListOptions(Integer.valueOf(-81), Long.valueOf(-25),
                                                                   Order.getDefault(),
                                                                   "84f70669-f6cf-4b12-846a-7da66e33c150", null, null);
            UserListOptions userlistoptions2 = new UserListOptions(Integer.valueOf(-81), Long.valueOf(-25),
                                                                   Order.getDefault(),
                                                                   "84f70669-f6cf-4b12-846a-7da66e33c150", null, null);
            UserListOptions userlistoptions3 = new UserListOptions(Integer.valueOf(-53), Long.valueOf(-54),
                                                                   Order.getDefault(),
                                                                   "25482a99-e9d6-44d3-b245-42b48c35a99c", null, null);
            assertNotNull(userlistoptions1);
            assertNotNull(userlistoptions2);
            assertNotNull(userlistoptions3);
            assertNotSame(userlistoptions2, userlistoptions1);
            assertNotSame(userlistoptions3, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions2, userlistoptions1);
            assertEquals(userlistoptions1, userlistoptions2);
            assertEquals(userlistoptions1, userlistoptions1);
            assertFalse(userlistoptions1.equals(null));
            assertNotEquals(userlistoptions3, userlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

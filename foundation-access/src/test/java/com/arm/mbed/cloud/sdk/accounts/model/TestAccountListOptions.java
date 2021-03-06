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
 * Unit tests for Model AccountListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestAccountListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(-11), Long.valueOf(-119),
                                                                            Order.getDefault(),
                                                                            "bb95bb8f-3a44-4268-97f5-e9230611612c",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = accountlistoptions1.clone();
            assertNotNull(accountlistoptions1);
            assertNotNull(accountlistoptions2);
            assertNotSame(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
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
            AccountListOptions option = new AccountListOptions().equalToTier("095ced12-6656-4b66-b8a1-5bfec5a59eb7")
                                                                .equalToStatus(AccountStatus.getDefault())
                                                                .inStatuses(Arrays.asList(AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault()))
                                                                .notInStatuses(Arrays.asList(AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault()))
                                                                .equalToEndMarket("aee9369a-d9a2-4526-9416-e8407ab56cca")
                                                                .likeCountry("f9047272-1ecf-4d38-bf96-bbc0f18630c4");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_TIER));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_TIER, FilterOperator.EQUAL));
            assertNotNull(option.getTierFilters());
            assertEquals("095ced12-6656-4b66-b8a1-5bfec5a59eb7",
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_TIER, String.class,
                                                                    option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(AccountStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_STATUS,
                                                                    AccountStatus.class, option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleInFilter(AccountListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                 option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.NOT_IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleNotInFilter(AccountListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                    option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_END_MARKET));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_END_MARKET, FilterOperator.EQUAL));
            assertNotNull(option.getEndMarketFilters());
            assertEquals("aee9369a-d9a2-4526-9416-e8407ab56cca",
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_END_MARKET,
                                                                    String.class, option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_COUNTRY));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_COUNTRY, FilterOperator.LIKE));
            assertNotNull(option.getCountryFilters());
            assertEquals("f9047272-1ecf-4d38-bf96-bbc0f18630c4",
                         ListOptionsEncoder.encodeSingleLikeFilter(AccountListOptions.TAG_FILTER_BY_COUNTRY,
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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(-57), Long.valueOf(-118),
                                                                            Order.getDefault(),
                                                                            "b0f3935f-8b2b-457d-a9e0-53778010588a",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = new AccountListOptions(Integer.valueOf(-57), Long.valueOf(-118),
                                                                            Order.getDefault(),
                                                                            "b0f3935f-8b2b-457d-a9e0-53778010588a",
                                                                            null, null);
            assertNotNull(accountlistoptions1);
            assertNotNull(accountlistoptions2);
            assertNotSame(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2.hashCode(), accountlistoptions1.hashCode());
            int hashCode = accountlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, accountlistoptions1.hashCode());
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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(-110), Long.valueOf(91),
                                                                            Order.getDefault(),
                                                                            "41cc99c9-c088-49f0-aac1-75c516cb1e4b",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = new AccountListOptions(Integer.valueOf(-110), Long.valueOf(91),
                                                                            Order.getDefault(),
                                                                            "41cc99c9-c088-49f0-aac1-75c516cb1e4b",
                                                                            null, null);
            AccountListOptions accountlistoptions3 = new AccountListOptions(Integer.valueOf(-1), Long.valueOf(52),
                                                                            Order.getDefault(),
                                                                            "bf3bc4a7-a60c-42a7-97c6-d99940f51ff8",
                                                                            null, null);
            assertNotNull(accountlistoptions1);
            assertNotNull(accountlistoptions2);
            assertNotNull(accountlistoptions3);
            assertNotSame(accountlistoptions2, accountlistoptions1);
            assertNotSame(accountlistoptions3, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions1, accountlistoptions2);
            assertEquals(accountlistoptions1, accountlistoptions1);
            assertFalse(accountlistoptions1.equals(null));
            assertNotEquals(accountlistoptions3, accountlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

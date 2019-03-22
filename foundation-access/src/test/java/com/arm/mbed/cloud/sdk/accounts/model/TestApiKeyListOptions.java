// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model ApiKeyListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestApiKeyListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-91), Long.valueOf(-51),
                                                                         Order.getDefault(),
                                                                         "be5092a7-b4af-4246-bb79-2e678ace691e", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = apikeylistoptions1.clone();
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
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
            ApiKeyListOptions option = new ApiKeyListOptions().equalToOwner("c641e968-3cb1-439c-af99-bc2c0628f0bc")
                                                              .equalToKey("0689fb33-652e-46d2-afee-23ad5425e426");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("c641e968-3cb1-439c-af99-bc2c0628f0bc",
                         ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, String.class,
                                                                    option));
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("0689fb33-652e-46d2-afee-23ad5425e426",
                         ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.TAG_FILTER_BY_KEY, String.class,
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(41), Long.valueOf(78),
                                                                         Order.getDefault(),
                                                                         "4c228053-6b25-4793-8cdc-7fce0bf4fa08", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(41), Long.valueOf(78),
                                                                         Order.getDefault(),
                                                                         "4c228053-6b25-4793-8cdc-7fce0bf4fa08", null,
                                                                         null);
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2.hashCode(), apikeylistoptions1.hashCode());
            int hashCode = apikeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikeylistoptions1.hashCode());
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(50), Long.valueOf(60),
                                                                         Order.getDefault(),
                                                                         "f2accf30-fc99-4d54-8283-9e6b0e393245", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(50), Long.valueOf(60),
                                                                         Order.getDefault(),
                                                                         "f2accf30-fc99-4d54-8283-9e6b0e393245", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions3 = new ApiKeyListOptions(Integer.valueOf(81), Long.valueOf(90),
                                                                         Order.getDefault(),
                                                                         "0b70ddd4-dc66-40d5-8e44-0f9ae1ed4e89", null,
                                                                         null);
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotNull(apikeylistoptions3);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertNotSame(apikeylistoptions3, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions1, apikeylistoptions2);
            assertEquals(apikeylistoptions1, apikeylistoptions1);
            assertFalse(apikeylistoptions1.equals(null));
            assertNotEquals(apikeylistoptions3, apikeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
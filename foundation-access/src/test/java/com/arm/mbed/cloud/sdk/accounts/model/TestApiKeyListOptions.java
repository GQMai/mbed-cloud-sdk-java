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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-12), Long.valueOf(-19),
                                                                         Order.getDefault(),
                                                                         "3e2234f4-7763-45d5-9093-b842ff6df16e", null,
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
            ApiKeyListOptions option = new ApiKeyListOptions().equalToOwner("a12ddba9-2f35-46e3-b090-928faaed23bf")
                                                              .equalToKey("d865ee1d-7652-43b3-ad81-4147d55e2f1f");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("a12ddba9-2f35-46e3-b090-928faaed23bf",
                         ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, String.class,
                                                                    option));
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("d865ee1d-7652-43b3-ad81-4147d55e2f1f",
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-40), Long.valueOf(37),
                                                                         Order.getDefault(),
                                                                         "8b9009bd-3d99-4ca0-8f97-dd4acee3878f", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(-40), Long.valueOf(37),
                                                                         Order.getDefault(),
                                                                         "8b9009bd-3d99-4ca0-8f97-dd4acee3878f", null,
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-122), Long.valueOf(-14),
                                                                         Order.getDefault(),
                                                                         "e509c4c5-a44d-434f-9eb6-e5e814d84e5f", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(-122), Long.valueOf(-14),
                                                                         Order.getDefault(),
                                                                         "e509c4c5-a44d-434f-9eb6-e5e814d84e5f", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions3 = new ApiKeyListOptions(Integer.valueOf(-52), Long.valueOf(-48),
                                                                         Order.getDefault(),
                                                                         "a6ef1403-8325-4950-aac6-d718243f0841", null,
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
// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantApiKeyListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantApiKeyListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-73),
                                                                                                    Long.valueOf(-62),
                                                                                                    Order.getDefault(),
                                                                                                    "d7a99e5b-1356-455a-9f53-9d974261a4d7",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = subtenantapikeylistoptions1.clone();
            assertNotNull(subtenantapikeylistoptions1);
            assertNotNull(subtenantapikeylistoptions2);
            assertNotSame(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
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
            SubtenantApiKeyListOptions option = new SubtenantApiKeyListOptions().equalToOwner("e96a1182-7c6c-455e-b26b-658fef29e558")
                                                                                .equalToKey("ee371150-8a8b-448e-8d18-e0d070e5b33d");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("e96a1182-7c6c-455e-b26b-658fef29e558",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER,
                                                                    String.class, option));
            assertTrue(option.hasFilters(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("ee371150-8a8b-448e-8d18-e0d070e5b33d",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY,
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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-95),
                                                                                                    Long.valueOf(122),
                                                                                                    Order.getDefault(),
                                                                                                    "52d5935f-e725-4678-98f2-c35e7e067dfb",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = new SubtenantApiKeyListOptions(Integer.valueOf(-95),
                                                                                                    Long.valueOf(122),
                                                                                                    Order.getDefault(),
                                                                                                    "52d5935f-e725-4678-98f2-c35e7e067dfb",
                                                                                                    null, null);
            assertNotNull(subtenantapikeylistoptions1);
            assertNotNull(subtenantapikeylistoptions2);
            assertNotSame(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2.hashCode(), subtenantapikeylistoptions1.hashCode());
            int hashCode = subtenantapikeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantapikeylistoptions1.hashCode());
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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-74),
                                                                                                    Long.valueOf(99),
                                                                                                    Order.getDefault(),
                                                                                                    "1da12b57-2d4c-4e60-9407-7f073f712926",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = new SubtenantApiKeyListOptions(Integer.valueOf(-74),
                                                                                                    Long.valueOf(99),
                                                                                                    Order.getDefault(),
                                                                                                    "1da12b57-2d4c-4e60-9407-7f073f712926",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions3 = new SubtenantApiKeyListOptions(Integer.valueOf(-61),
                                                                                                    Long.valueOf(98),
                                                                                                    Order.getDefault(),
                                                                                                    "c790525a-6a84-47a2-b068-3fb87e21de90",
                                                                                                    null, null);
            assertNotNull(subtenantapikeylistoptions1);
            assertNotNull(subtenantapikeylistoptions2);
            assertNotNull(subtenantapikeylistoptions3);
            assertNotSame(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertNotSame(subtenantapikeylistoptions3, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions2, subtenantapikeylistoptions1);
            assertEquals(subtenantapikeylistoptions1, subtenantapikeylistoptions2);
            assertEquals(subtenantapikeylistoptions1, subtenantapikeylistoptions1);
            assertFalse(subtenantapikeylistoptions1.equals(null));
            assertNotEquals(subtenantapikeylistoptions3, subtenantapikeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

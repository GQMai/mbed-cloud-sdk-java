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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(-15),
                                                                                                    Long.valueOf(23),
                                                                                                    Order.getDefault(),
                                                                                                    "43101a89-3250-4c16-80b0-889ec0b4817d",
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
            SubtenantApiKeyListOptions option = new SubtenantApiKeyListOptions().equalToOwner("d58386a2-d9b8-479d-8662-e5198964d540")
                                                                                .equalToKey("426f04d3-e624-4b5a-be82-e8ad9390792d");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("d58386a2-d9b8-479d-8662-e5198964d540",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_OWNER,
                                                                    String.class, option));
            assertTrue(option.hasFilters(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(SubtenantApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("426f04d3-e624-4b5a-be82-e8ad9390792d",
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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(114),
                                                                                                    Long.valueOf(8),
                                                                                                    Order.getDefault(),
                                                                                                    "475feffe-e046-42a3-8439-e1a68cce3d96",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = new SubtenantApiKeyListOptions(Integer.valueOf(114),
                                                                                                    Long.valueOf(8),
                                                                                                    Order.getDefault(),
                                                                                                    "475feffe-e046-42a3-8439-e1a68cce3d96",
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
            SubtenantApiKeyListOptions subtenantapikeylistoptions1 = new SubtenantApiKeyListOptions(Integer.valueOf(99),
                                                                                                    Long.valueOf(41),
                                                                                                    Order.getDefault(),
                                                                                                    "0a7a8f2b-8184-4040-9694-3cc0972cadbb",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions2 = new SubtenantApiKeyListOptions(Integer.valueOf(99),
                                                                                                    Long.valueOf(41),
                                                                                                    Order.getDefault(),
                                                                                                    "0a7a8f2b-8184-4040-9694-3cc0972cadbb",
                                                                                                    null, null);
            SubtenantApiKeyListOptions subtenantapikeylistoptions3 = new SubtenantApiKeyListOptions(Integer.valueOf(-61),
                                                                                                    Long.valueOf(79),
                                                                                                    Order.getDefault(),
                                                                                                    "e15ef072-58d1-461f-962f-2ed7a165a773",
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

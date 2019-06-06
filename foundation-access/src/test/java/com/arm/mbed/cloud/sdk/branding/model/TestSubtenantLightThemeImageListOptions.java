// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-124),
                                                                                                                               Long.valueOf(62),
                                                                                                                               Order.getDefault(),
                                                                                                                               "24665c59-d282-46e9-850a-05c9d704d8af",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = subtenantlightthemeimagelistoptions1.clone();
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
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
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-72),
                                                                                                                               Long.valueOf(101),
                                                                                                                               Order.getDefault(),
                                                                                                                               "b6959d65-dfe6-46f0-b456-5f0ad77d7ce2",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-72),
                                                                                                                               Long.valueOf(101),
                                                                                                                               Order.getDefault(),
                                                                                                                               "b6959d65-dfe6-46f0-b456-5f0ad77d7ce2",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2.hashCode(),
                         subtenantlightthemeimagelistoptions1.hashCode());
            int hashCode = subtenantlightthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemeimagelistoptions1.hashCode());
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
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-4),
                                                                                                                               Long.valueOf(58),
                                                                                                                               Order.getDefault(),
                                                                                                                               "d9ded111-d82c-4c56-a067-659aa6d53eb2",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-4),
                                                                                                                               Long.valueOf(58),
                                                                                                                               Order.getDefault(),
                                                                                                                               "d9ded111-d82c-4c56-a067-659aa6d53eb2",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions3 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-18),
                                                                                                                               Long.valueOf(114),
                                                                                                                               Order.getDefault(),
                                                                                                                               "6f9ba5bf-0961-462a-9334-fd270a1984da",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotNull(subtenantlightthemeimagelistoptions3);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertNotSame(subtenantlightthemeimagelistoptions3, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions1, subtenantlightthemeimagelistoptions2);
            assertEquals(subtenantlightthemeimagelistoptions1, subtenantlightthemeimagelistoptions1);
            assertFalse(subtenantlightthemeimagelistoptions1.equals(null));
            assertNotEquals(subtenantlightthemeimagelistoptions3, subtenantlightthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

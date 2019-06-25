// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions1 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-69),
                                                                                                                            Long.valueOf(21),
                                                                                                                            Order.getDefault(),
                                                                                                                            "ce2d3d9f-7317-4373-9a98-2752ad91968f",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions2 = subtenantdarkthemeimagelistoptions1.clone();
            assertNotNull(subtenantdarkthemeimagelistoptions1);
            assertNotNull(subtenantdarkthemeimagelistoptions2);
            assertNotSame(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
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
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions1 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(46),
                                                                                                                            Long.valueOf(50),
                                                                                                                            Order.getDefault(),
                                                                                                                            "e4eab0b3-fd91-460b-adb0-6c7e71af104e",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions2 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(46),
                                                                                                                            Long.valueOf(50),
                                                                                                                            Order.getDefault(),
                                                                                                                            "e4eab0b3-fd91-460b-adb0-6c7e71af104e",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemeimagelistoptions1);
            assertNotNull(subtenantdarkthemeimagelistoptions2);
            assertNotSame(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2.hashCode(),
                         subtenantdarkthemeimagelistoptions1.hashCode());
            int hashCode = subtenantdarkthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemeimagelistoptions1.hashCode());
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
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions1 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-78),
                                                                                                                            Long.valueOf(91),
                                                                                                                            Order.getDefault(),
                                                                                                                            "59e13207-a8c2-4bfc-8294-6e774a59a78f",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions2 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-78),
                                                                                                                            Long.valueOf(91),
                                                                                                                            Order.getDefault(),
                                                                                                                            "59e13207-a8c2-4bfc-8294-6e774a59a78f",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions3 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-121),
                                                                                                                            Long.valueOf(49),
                                                                                                                            Order.getDefault(),
                                                                                                                            "8421933d-9a9b-4de0-8a55-c03ac52819e2",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemeimagelistoptions1);
            assertNotNull(subtenantdarkthemeimagelistoptions2);
            assertNotNull(subtenantdarkthemeimagelistoptions3);
            assertNotSame(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertNotSame(subtenantdarkthemeimagelistoptions3, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions1, subtenantdarkthemeimagelistoptions2);
            assertEquals(subtenantdarkthemeimagelistoptions1, subtenantdarkthemeimagelistoptions1);
            assertFalse(subtenantdarkthemeimagelistoptions1.equals(null));
            assertNotEquals(subtenantdarkthemeimagelistoptions3, subtenantdarkthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions1 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-48),
                                                                                                                            Long.valueOf(-127),
                                                                                                                            Order.getDefault(),
                                                                                                                            "5c396851-4475-48cb-90b9-c70e18b94951",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions2 = subtenantdarkthemecolorlistoptions1.clone();
            assertNotNull(subtenantdarkthemecolorlistoptions1);
            assertNotNull(subtenantdarkthemecolorlistoptions2);
            assertNotSame(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
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
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions1 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-79),
                                                                                                                            Long.valueOf(-80),
                                                                                                                            Order.getDefault(),
                                                                                                                            "5870164a-6f7b-4b03-8067-c6106320e98e",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions2 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-79),
                                                                                                                            Long.valueOf(-80),
                                                                                                                            Order.getDefault(),
                                                                                                                            "5870164a-6f7b-4b03-8067-c6106320e98e",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemecolorlistoptions1);
            assertNotNull(subtenantdarkthemecolorlistoptions2);
            assertNotSame(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2.hashCode(),
                         subtenantdarkthemecolorlistoptions1.hashCode());
            int hashCode = subtenantdarkthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemecolorlistoptions1.hashCode());
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
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions1 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-7),
                                                                                                                            Long.valueOf(68),
                                                                                                                            Order.getDefault(),
                                                                                                                            "6e9f53f4-f0fa-4918-81d6-57cfa2c064d1",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions2 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-7),
                                                                                                                            Long.valueOf(68),
                                                                                                                            Order.getDefault(),
                                                                                                                            "6e9f53f4-f0fa-4918-81d6-57cfa2c064d1",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions3 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-61),
                                                                                                                            Long.valueOf(28),
                                                                                                                            Order.getDefault(),
                                                                                                                            "9ff47050-3411-4d1a-b1e0-a5f0ea4c247d",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemecolorlistoptions1);
            assertNotNull(subtenantdarkthemecolorlistoptions2);
            assertNotNull(subtenantdarkthemecolorlistoptions3);
            assertNotSame(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertNotSame(subtenantdarkthemecolorlistoptions3, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions1, subtenantdarkthemecolorlistoptions2);
            assertEquals(subtenantdarkthemecolorlistoptions1, subtenantdarkthemecolorlistoptions1);
            assertFalse(subtenantdarkthemecolorlistoptions1.equals(null));
            assertNotEquals(subtenantdarkthemecolorlistoptions3, subtenantdarkthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

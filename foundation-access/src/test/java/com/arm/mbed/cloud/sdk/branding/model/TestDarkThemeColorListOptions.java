// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DarkThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDarkThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DarkThemeColorListOptions darkthemecolorlistoptions1 = new DarkThemeColorListOptions(Integer.valueOf(-91),
                                                                                                 Long.valueOf(-36),
                                                                                                 Order.getDefault(),
                                                                                                 "e752c234-0d9a-417a-a2a4-173639d2dcf4",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions2 = darkthemecolorlistoptions1.clone();
            assertNotNull(darkthemecolorlistoptions1);
            assertNotNull(darkthemecolorlistoptions2);
            assertNotSame(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
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
            DarkThemeColorListOptions darkthemecolorlistoptions1 = new DarkThemeColorListOptions(Integer.valueOf(78),
                                                                                                 Long.valueOf(9),
                                                                                                 Order.getDefault(),
                                                                                                 "6de89f92-af0a-402d-a0e9-60d323ac9b3d",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions2 = new DarkThemeColorListOptions(Integer.valueOf(78),
                                                                                                 Long.valueOf(9),
                                                                                                 Order.getDefault(),
                                                                                                 "6de89f92-af0a-402d-a0e9-60d323ac9b3d",
                                                                                                 null, null);
            assertNotNull(darkthemecolorlistoptions1);
            assertNotNull(darkthemecolorlistoptions2);
            assertNotSame(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2.hashCode(), darkthemecolorlistoptions1.hashCode());
            int hashCode = darkthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, darkthemecolorlistoptions1.hashCode());
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
            DarkThemeColorListOptions darkthemecolorlistoptions1 = new DarkThemeColorListOptions(Integer.valueOf(2),
                                                                                                 Long.valueOf(75),
                                                                                                 Order.getDefault(),
                                                                                                 "f3424d41-ee68-433d-8121-f0a8c12d6964",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions2 = new DarkThemeColorListOptions(Integer.valueOf(2),
                                                                                                 Long.valueOf(75),
                                                                                                 Order.getDefault(),
                                                                                                 "f3424d41-ee68-433d-8121-f0a8c12d6964",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions3 = new DarkThemeColorListOptions(Integer.valueOf(-36),
                                                                                                 Long.valueOf(-7),
                                                                                                 Order.getDefault(),
                                                                                                 "4e790c74-9d01-4251-8978-198583d28aab",
                                                                                                 null, null);
            assertNotNull(darkthemecolorlistoptions1);
            assertNotNull(darkthemecolorlistoptions2);
            assertNotNull(darkthemecolorlistoptions3);
            assertNotSame(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertNotSame(darkthemecolorlistoptions3, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions1, darkthemecolorlistoptions2);
            assertEquals(darkthemecolorlistoptions1, darkthemecolorlistoptions1);
            assertFalse(darkthemecolorlistoptions1.equals(null));
            assertNotEquals(darkthemecolorlistoptions3, darkthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

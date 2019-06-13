// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(73),
                                                                                                                               Long.valueOf(-9),
                                                                                                                               Order.getDefault(),
                                                                                                                               "3af11014-634e-495c-806a-320e25f62304",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = subtenantlightthemecolorlistoptions1.clone();
            assertNotNull(subtenantlightthemecolorlistoptions1);
            assertNotNull(subtenantlightthemecolorlistoptions2);
            assertNotSame(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(7),
                                                                                                                               Long.valueOf(-93),
                                                                                                                               Order.getDefault(),
                                                                                                                               "47832210-cf4e-4eb1-97d2-fa5d90024bec",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(7),
                                                                                                                               Long.valueOf(-93),
                                                                                                                               Order.getDefault(),
                                                                                                                               "47832210-cf4e-4eb1-97d2-fa5d90024bec",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemecolorlistoptions1);
            assertNotNull(subtenantlightthemecolorlistoptions2);
            assertNotSame(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2.hashCode(),
                         subtenantlightthemecolorlistoptions1.hashCode());
            int hashCode = subtenantlightthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemecolorlistoptions1.hashCode());
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(50),
                                                                                                                               Long.valueOf(-45),
                                                                                                                               Order.getDefault(),
                                                                                                                               "3fccc26e-8822-4f98-a5d8-5481f1f46139",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(50),
                                                                                                                               Long.valueOf(-45),
                                                                                                                               Order.getDefault(),
                                                                                                                               "3fccc26e-8822-4f98-a5d8-5481f1f46139",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions3 = new SubtenantLightThemeColorListOptions(Integer.valueOf(88),
                                                                                                                               Long.valueOf(-110),
                                                                                                                               Order.getDefault(),
                                                                                                                               "11993748-ccb0-43a3-944a-2a471d200da1",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemecolorlistoptions1);
            assertNotNull(subtenantlightthemecolorlistoptions2);
            assertNotNull(subtenantlightthemecolorlistoptions3);
            assertNotSame(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertNotSame(subtenantlightthemecolorlistoptions3, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions2, subtenantlightthemecolorlistoptions1);
            assertEquals(subtenantlightthemecolorlistoptions1, subtenantlightthemecolorlistoptions2);
            assertEquals(subtenantlightthemecolorlistoptions1, subtenantlightthemecolorlistoptions1);
            assertFalse(subtenantlightthemecolorlistoptions1.equals(null));
            assertNotEquals(subtenantlightthemecolorlistoptions3, subtenantlightthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

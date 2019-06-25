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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-35),
                                                                                                                               Long.valueOf(60),
                                                                                                                               Order.getDefault(),
                                                                                                                               "81200a43-a56d-472e-982d-d3bc7949fb29",
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-29),
                                                                                                                               Long.valueOf(76),
                                                                                                                               Order.getDefault(),
                                                                                                                               "eef55080-a5a6-4979-958a-f36a55c66871",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-29),
                                                                                                                               Long.valueOf(76),
                                                                                                                               Order.getDefault(),
                                                                                                                               "eef55080-a5a6-4979-958a-f36a55c66871",
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
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions1 = new SubtenantLightThemeColorListOptions(Integer.valueOf(24),
                                                                                                                               Long.valueOf(-77),
                                                                                                                               Order.getDefault(),
                                                                                                                               "66359a64-df8c-489f-998f-e6ed474da5c0",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions2 = new SubtenantLightThemeColorListOptions(Integer.valueOf(24),
                                                                                                                               Long.valueOf(-77),
                                                                                                                               Order.getDefault(),
                                                                                                                               "66359a64-df8c-489f-998f-e6ed474da5c0",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeColorListOptions subtenantlightthemecolorlistoptions3 = new SubtenantLightThemeColorListOptions(Integer.valueOf(-61),
                                                                                                                               Long.valueOf(26),
                                                                                                                               Order.getDefault(),
                                                                                                                               "4cffea8a-4bb0-4268-a1c5-67e33272c28f",
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

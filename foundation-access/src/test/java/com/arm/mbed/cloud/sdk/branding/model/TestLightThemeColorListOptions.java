// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model LightThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(46),
                                                                                                    Long.valueOf(-51),
                                                                                                    Order.getDefault(),
                                                                                                    "059e7922-e89a-4382-a50a-99ad2e477359",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = lightthemecolorlistoptions1.clone();
            assertNotNull(lightthemecolorlistoptions1);
            assertNotNull(lightthemecolorlistoptions2);
            assertNotSame(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(65),
                                                                                                    Long.valueOf(48),
                                                                                                    Order.getDefault(),
                                                                                                    "330c445e-ee50-48f2-887b-b91ebe370eef",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = new LightThemeColorListOptions(Integer.valueOf(65),
                                                                                                    Long.valueOf(48),
                                                                                                    Order.getDefault(),
                                                                                                    "330c445e-ee50-48f2-887b-b91ebe370eef",
                                                                                                    null, null);
            assertNotNull(lightthemecolorlistoptions1);
            assertNotNull(lightthemecolorlistoptions2);
            assertNotSame(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2.hashCode(), lightthemecolorlistoptions1.hashCode());
            int hashCode = lightthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, lightthemecolorlistoptions1.hashCode());
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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(74),
                                                                                                    Long.valueOf(57),
                                                                                                    Order.getDefault(),
                                                                                                    "3e514077-d9b6-469f-a2b8-cb03f02c13f0",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = new LightThemeColorListOptions(Integer.valueOf(74),
                                                                                                    Long.valueOf(57),
                                                                                                    Order.getDefault(),
                                                                                                    "3e514077-d9b6-469f-a2b8-cb03f02c13f0",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions3 = new LightThemeColorListOptions(Integer.valueOf(82),
                                                                                                    Long.valueOf(63),
                                                                                                    Order.getDefault(),
                                                                                                    "52337942-ff29-49e5-b9aa-fb4ecbfa66af",
                                                                                                    null, null);
            assertNotNull(lightthemecolorlistoptions1);
            assertNotNull(lightthemecolorlistoptions2);
            assertNotNull(lightthemecolorlistoptions3);
            assertNotSame(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertNotSame(lightthemecolorlistoptions3, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions1, lightthemecolorlistoptions2);
            assertEquals(lightthemecolorlistoptions1, lightthemecolorlistoptions1);
            assertFalse(lightthemecolorlistoptions1.equals(null));
            assertNotEquals(lightthemecolorlistoptions3, lightthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Mon Jun 03 11:17:45 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model LightThemeColorDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeColorDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LightThemeColorDao lightthemecolordao1 = new LightThemeColorDao();
            LightThemeColorDao lightthemecolordao2 = lightthemecolordao1.clone();
            assertNotNull(lightthemecolordao1);
            assertNotNull(lightthemecolordao2);
            assertNotSame(lightthemecolordao2, lightthemecolordao1);
            assertEquals(lightthemecolordao2, lightthemecolordao1);
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
            LightThemeColorDao lightthemecolordao1 = new LightThemeColorDao();
            LightThemeColorDao lightthemecolordao2 = new LightThemeColorDao();
            assertNotNull(lightthemecolordao1);
            assertNotNull(lightthemecolordao2);
            assertNotSame(lightthemecolordao2, lightthemecolordao1);
            assertEquals(lightthemecolordao2, lightthemecolordao1);
            assertEquals(lightthemecolordao2.hashCode(), lightthemecolordao1.hashCode());
            int hashCode = lightthemecolordao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, lightthemecolordao1.hashCode());
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
            LightThemeColorDao lightthemecolordao1 = new LightThemeColorDao();
            LightThemeColorDao lightthemecolordao2 = new LightThemeColorDao();
            assertNotNull(lightthemecolordao1);
            assertNotNull(lightthemecolordao2);
            assertNotSame(lightthemecolordao2, lightthemecolordao1);
            assertEquals(lightthemecolordao2, lightthemecolordao1);
            assertEquals(lightthemecolordao2, lightthemecolordao1);
            assertEquals(lightthemecolordao1, lightthemecolordao2);
            assertEquals(lightthemecolordao1, lightthemecolordao1);
            assertFalse(lightthemecolordao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DarkThemeColorReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDarkThemeColorReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DarkThemeColorReference darkthemecolorreference = DarkThemeColorReference.getValue(null);
            assertNotNull(darkthemecolorreference);
            assertTrue(darkthemecolorreference.isDefault());
            darkthemecolorreference = DarkThemeColorReference.getValue(DarkThemeColorReference.getDefault()
                                                                                              .getString());
            assertNotNull(darkthemecolorreference);
            assertTrue(darkthemecolorreference.isDefault());
            darkthemecolorreference = DarkThemeColorReference.getValue("CANVAS_BACKGROUND");
            assertNotNull(darkthemecolorreference);
            assertTrue(darkthemecolorreference.isDefault());
            darkthemecolorreference = DarkThemeColorReference.getValue("canvas_background_font_color");
            assertNotNull(darkthemecolorreference);
            assertFalse(darkthemecolorreference.isDefault());
            darkthemecolorreference = DarkThemeColorReference.getValue("9874ced7-43c0-473a-a887-9f2ee101030e");
            assertNotNull(darkthemecolorreference);
            assertTrue(darkthemecolorreference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
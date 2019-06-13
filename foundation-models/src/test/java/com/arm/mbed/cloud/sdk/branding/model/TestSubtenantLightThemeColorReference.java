// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeColorReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeColorReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantLightThemeColorReference subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue(null);
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue(SubtenantLightThemeColorReference.getDefault()
                                                                                                                            .getString());
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue("CANVAS_BACKGROUND");
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue("canvas_background_font_color");
            assertNotNull(subtenantlightthemecolorreference);
            assertFalse(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue("fc45f9f9-439b-447c-9f75-9bf44ead994f");
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

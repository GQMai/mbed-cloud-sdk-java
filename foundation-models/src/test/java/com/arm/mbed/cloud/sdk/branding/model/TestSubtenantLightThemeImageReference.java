// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeImageReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeImageReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantLightThemeImageReference subtenantlightthemeimagereference = SubtenantLightThemeImageReference.getValue(null);
            assertNotNull(subtenantlightthemeimagereference);
            assertTrue(subtenantlightthemeimagereference.isDefault());
            subtenantlightthemeimagereference = SubtenantLightThemeImageReference.getValue(SubtenantLightThemeImageReference.getDefault()
                                                                                                                            .getString());
            assertNotNull(subtenantlightthemeimagereference);
            assertTrue(subtenantlightthemeimagereference.isDefault());
            subtenantlightthemeimagereference = SubtenantLightThemeImageReference.getValue("BRAND_LOGO_EMAIL");
            assertNotNull(subtenantlightthemeimagereference);
            assertTrue(subtenantlightthemeimagereference.isDefault());
            subtenantlightthemeimagereference = SubtenantLightThemeImageReference.getValue("brand_logo_landscape");
            assertNotNull(subtenantlightthemeimagereference);
            assertFalse(subtenantlightthemeimagereference.isDefault());
            subtenantlightthemeimagereference = SubtenantLightThemeImageReference.getValue("0705f1d6-fada-47e2-8cad-7422e0c0ff65");
            assertNotNull(subtenantlightthemeimagereference);
            assertTrue(subtenantlightthemeimagereference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

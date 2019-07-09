// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeImageReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeImageReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantDarkThemeImageReference subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue(null);
            assertNotNull(subtenantdarkthemeimagereference);
            assertTrue(subtenantdarkthemeimagereference.isDefault());
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue(SubtenantDarkThemeImageReference.getDefault()
                                                                                                                         .getString());
            assertNotNull(subtenantdarkthemeimagereference);
            assertTrue(subtenantdarkthemeimagereference.isDefault());
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue("BRAND_LOGO_EMAIL");
            assertNotNull(subtenantdarkthemeimagereference);
            assertTrue(subtenantdarkthemeimagereference.isDefault());
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue("brand_logo_landscape");
            assertNotNull(subtenantdarkthemeimagereference);
            assertFalse(subtenantdarkthemeimagereference.isDefault());
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue("ff975077-485e-425a-9621-ddd25f64904f");
            assertNotNull(subtenantdarkthemeimagereference);
            assertTrue(subtenantdarkthemeimagereference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

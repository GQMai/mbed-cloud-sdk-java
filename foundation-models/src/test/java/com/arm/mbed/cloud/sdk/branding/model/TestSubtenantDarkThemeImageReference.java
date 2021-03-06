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
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue("APP_LOGO_LANDSCAPE");
            assertNotNull(subtenantdarkthemeimagereference);
            assertTrue(subtenantdarkthemeimagereference.isDefault());
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue("app_logo_portrait");
            assertNotNull(subtenantdarkthemeimagereference);
            assertFalse(subtenantdarkthemeimagereference.isDefault());
            subtenantdarkthemeimagereference = SubtenantDarkThemeImageReference.getValue("1c3f0874-a230-4c27-b47c-46c6b11f1311");
            assertNotNull(subtenantdarkthemeimagereference);
            assertTrue(subtenantdarkthemeimagereference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

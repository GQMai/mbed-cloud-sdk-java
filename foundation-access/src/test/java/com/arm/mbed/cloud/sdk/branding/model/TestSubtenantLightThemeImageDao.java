// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Tue Jun 04 15:39:38 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeImageDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeImageDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeImageDao subtenantlightthemeimagedao1 = new SubtenantLightThemeImageDao();
            SubtenantLightThemeImageDao subtenantlightthemeimagedao2 = subtenantlightthemeimagedao1.clone();
            assertNotNull(subtenantlightthemeimagedao1);
            assertNotNull(subtenantlightthemeimagedao2);
            assertNotSame(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
            assertEquals(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
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
            SubtenantLightThemeImageDao subtenantlightthemeimagedao1 = new SubtenantLightThemeImageDao();
            SubtenantLightThemeImageDao subtenantlightthemeimagedao2 = new SubtenantLightThemeImageDao();
            assertNotNull(subtenantlightthemeimagedao1);
            assertNotNull(subtenantlightthemeimagedao2);
            assertNotSame(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
            assertEquals(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
            assertEquals(subtenantlightthemeimagedao2.hashCode(), subtenantlightthemeimagedao1.hashCode());
            int hashCode = subtenantlightthemeimagedao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemeimagedao1.hashCode());
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
            SubtenantLightThemeImageDao subtenantlightthemeimagedao1 = new SubtenantLightThemeImageDao();
            SubtenantLightThemeImageDao subtenantlightthemeimagedao2 = new SubtenantLightThemeImageDao();
            assertNotNull(subtenantlightthemeimagedao1);
            assertNotNull(subtenantlightthemeimagedao2);
            assertNotSame(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
            assertEquals(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
            assertEquals(subtenantlightthemeimagedao2, subtenantlightthemeimagedao1);
            assertEquals(subtenantlightthemeimagedao1, subtenantlightthemeimagedao2);
            assertEquals(subtenantlightthemeimagedao1, subtenantlightthemeimagedao1);
            assertFalse(subtenantlightthemeimagedao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

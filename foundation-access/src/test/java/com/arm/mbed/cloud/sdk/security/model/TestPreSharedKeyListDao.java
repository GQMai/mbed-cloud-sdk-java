// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model PreSharedKeyListDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPreSharedKeyListDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PreSharedKeyListDao presharedkeylistdao1 = new PreSharedKeyListDao();
            PreSharedKeyListDao presharedkeylistdao2 = presharedkeylistdao1.clone();
            assertNotNull(presharedkeylistdao1);
            assertNotNull(presharedkeylistdao2);
            assertNotSame(presharedkeylistdao2, presharedkeylistdao1);
            assertEquals(presharedkeylistdao2, presharedkeylistdao1);
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
            PreSharedKeyListDao presharedkeylistdao1 = new PreSharedKeyListDao();
            PreSharedKeyListDao presharedkeylistdao2 = new PreSharedKeyListDao();
            assertNotNull(presharedkeylistdao1);
            assertNotNull(presharedkeylistdao2);
            assertNotSame(presharedkeylistdao2, presharedkeylistdao1);
            assertEquals(presharedkeylistdao2, presharedkeylistdao1);
            assertEquals(presharedkeylistdao2.hashCode(), presharedkeylistdao1.hashCode());
            int hashCode = presharedkeylistdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, presharedkeylistdao1.hashCode());
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
            PreSharedKeyListDao presharedkeylistdao1 = new PreSharedKeyListDao();
            PreSharedKeyListDao presharedkeylistdao2 = new PreSharedKeyListDao();
            assertNotNull(presharedkeylistdao1);
            assertNotNull(presharedkeylistdao2);
            assertNotSame(presharedkeylistdao2, presharedkeylistdao1);
            assertEquals(presharedkeylistdao2, presharedkeylistdao1);
            assertEquals(presharedkeylistdao2, presharedkeylistdao1);
            assertEquals(presharedkeylistdao1, presharedkeylistdao2);
            assertEquals(presharedkeylistdao1, presharedkeylistdao1);
            assertFalse(presharedkeylistdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

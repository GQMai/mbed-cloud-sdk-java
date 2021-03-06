// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Jan 11 00:36:38 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateDao.
 */
public class TestSubtenantTrustedCertificateDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantTrustedCertificateDao subtenanttrustedcertificatedao1 = new SubtenantTrustedCertificateDao();
            SubtenantTrustedCertificateDao subtenanttrustedcertificatedao2 = subtenanttrustedcertificatedao1.clone();
            assertNotNull(subtenanttrustedcertificatedao1);
            assertNotNull(subtenanttrustedcertificatedao2);
            assertNotSame(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
            assertEquals(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
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
            SubtenantTrustedCertificateDao subtenanttrustedcertificatedao1 = new SubtenantTrustedCertificateDao();
            SubtenantTrustedCertificateDao subtenanttrustedcertificatedao2 = new SubtenantTrustedCertificateDao();
            assertNotNull(subtenanttrustedcertificatedao1);
            assertNotNull(subtenanttrustedcertificatedao2);
            assertNotSame(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
            assertEquals(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
            assertEquals(subtenanttrustedcertificatedao2.hashCode(), subtenanttrustedcertificatedao1.hashCode());
            int hashCode = subtenanttrustedcertificatedao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenanttrustedcertificatedao1.hashCode());
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
            SubtenantTrustedCertificateDao subtenanttrustedcertificatedao1 = new SubtenantTrustedCertificateDao();
            SubtenantTrustedCertificateDao subtenanttrustedcertificatedao2 = new SubtenantTrustedCertificateDao();
            assertNotNull(subtenanttrustedcertificatedao1);
            assertNotNull(subtenanttrustedcertificatedao2);
            assertNotSame(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
            assertEquals(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
            assertEquals(subtenanttrustedcertificatedao2, subtenanttrustedcertificatedao1);
            assertEquals(subtenanttrustedcertificatedao1, subtenanttrustedcertificatedao2);
            assertEquals(subtenanttrustedcertificatedao1, subtenanttrustedcertificatedao1);
            assertFalse(subtenanttrustedcertificatedao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

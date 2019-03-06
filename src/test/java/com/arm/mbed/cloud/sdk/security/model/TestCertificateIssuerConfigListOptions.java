// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfigListOptions.
 */
public class TestCertificateIssuerConfigListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-82),
                                                                                                                            Long.valueOf(-72),
                                                                                                                            Order.getDefault(),
                                                                                                                            "96efb7b0-ac5f-4165-813c-e9b3c3511264",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = certificateissuerconfiglistoptions1.clone();
            assertNotNull(certificateissuerconfiglistoptions1);
            assertNotNull(certificateissuerconfiglistoptions2);
            assertNotSame(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(50),
                                                                                                                            Long.valueOf(-36),
                                                                                                                            Order.getDefault(),
                                                                                                                            "3936bdfa-3b6e-4bff-a00f-98c95ea90220",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(50),
                                                                                                                            Long.valueOf(-36),
                                                                                                                            Order.getDefault(),
                                                                                                                            "3936bdfa-3b6e-4bff-a00f-98c95ea90220",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(certificateissuerconfiglistoptions1);
            assertNotNull(certificateissuerconfiglistoptions2);
            assertNotSame(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2.hashCode(),
                         certificateissuerconfiglistoptions1.hashCode());
            int hashCode = certificateissuerconfiglistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerconfiglistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-10),
                                                                                                                            Long.valueOf(38),
                                                                                                                            Order.getDefault(),
                                                                                                                            "bb2be749-5303-4505-8e5f-5a1de6c4d963",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(-10),
                                                                                                                            Long.valueOf(38),
                                                                                                                            Order.getDefault(),
                                                                                                                            "bb2be749-5303-4505-8e5f-5a1de6c4d963",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions3 = new CertificateIssuerConfigListOptions(Integer.valueOf(-85),
                                                                                                                            Long.valueOf(-59),
                                                                                                                            Order.getDefault(),
                                                                                                                            "ca48f530-920b-4fa8-ab43-c8238321de17",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(certificateissuerconfiglistoptions1);
            assertNotNull(certificateissuerconfiglistoptions2);
            assertNotNull(certificateissuerconfiglistoptions3);
            assertNotSame(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertNotSame(certificateissuerconfiglistoptions3, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions2, certificateissuerconfiglistoptions1);
            assertEquals(certificateissuerconfiglistoptions1, certificateissuerconfiglistoptions2);
            assertEquals(certificateissuerconfiglistoptions1, certificateissuerconfiglistoptions1);
            assertFalse(certificateissuerconfiglistoptions1.equals(null));
            assertNotEquals(certificateissuerconfiglistoptions3, certificateissuerconfiglistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

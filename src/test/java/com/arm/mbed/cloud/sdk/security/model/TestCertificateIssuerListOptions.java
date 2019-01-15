// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerListOptions.
 */
public class TestCertificateIssuerListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(-16),
                                                                                                          Long.valueOf(25),
                                                                                                          Order.getDefault(),
                                                                                                          "0097e07b-8bda-4877-8119-caf2831265a6",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = certificateissuerlistoptions1.clone();
            assertNotNull(certificateissuerlistoptions1);
            assertNotNull(certificateissuerlistoptions2);
            assertNotSame(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(-90),
                                                                                                          Long.valueOf(-90),
                                                                                                          Order.getDefault(),
                                                                                                          "13897175-1946-4a6e-8a77-614a795da8dd",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(-90),
                                                                                                          Long.valueOf(-90),
                                                                                                          Order.getDefault(),
                                                                                                          "13897175-1946-4a6e-8a77-614a795da8dd",
                                                                                                          null, null);
            assertNotNull(certificateissuerlistoptions1);
            assertNotNull(certificateissuerlistoptions2);
            assertNotSame(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2.hashCode(), certificateissuerlistoptions1.hashCode());
            int hashCode = certificateissuerlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerlistoptions1.hashCode());
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
            CertificateIssuerListOptions certificateissuerlistoptions1 = new CertificateIssuerListOptions(Integer.valueOf(115),
                                                                                                          Long.valueOf(65),
                                                                                                          Order.getDefault(),
                                                                                                          "620727ba-06de-4a83-b393-7e1c477c61c4",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions2 = new CertificateIssuerListOptions(Integer.valueOf(115),
                                                                                                          Long.valueOf(65),
                                                                                                          Order.getDefault(),
                                                                                                          "620727ba-06de-4a83-b393-7e1c477c61c4",
                                                                                                          null, null);
            CertificateIssuerListOptions certificateissuerlistoptions3 = new CertificateIssuerListOptions(Integer.valueOf(-17),
                                                                                                          Long.valueOf(-108),
                                                                                                          Order.getDefault(),
                                                                                                          "e9bdbe57-e750-4690-b15b-f17e6e7e1e00",
                                                                                                          null, null);
            assertNotNull(certificateissuerlistoptions1);
            assertNotNull(certificateissuerlistoptions2);
            assertNotNull(certificateissuerlistoptions3);
            assertNotSame(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertNotSame(certificateissuerlistoptions3, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions2, certificateissuerlistoptions1);
            assertEquals(certificateissuerlistoptions1, certificateissuerlistoptions2);
            assertEquals(certificateissuerlistoptions1, certificateissuerlistoptions1);
            assertFalse(certificateissuerlistoptions1.equals(null));
            assertNotEquals(certificateissuerlistoptions3, certificateissuerlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

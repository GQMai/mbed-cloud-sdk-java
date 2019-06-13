// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfigListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerConfigListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(64),
                                                                                                                            Long.valueOf(-12),
                                                                                                                            Order.getDefault(),
                                                                                                                            "1ee63866-80d1-476b-8b19-93cb9fe90925",
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
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            CertificateIssuerConfigListOptions option = new CertificateIssuerConfigListOptions().equalToReference("bda02c24-9352-40d1-9e8c-7c854490a5f2");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE));
            assertTrue(option.hasFilter(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getReferenceFilters());
            assertEquals("bda02c24-9352-40d1-9e8c-7c854490a5f2",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE,
                                                                    String.class, option));
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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(90),
                                                                                                                            Long.valueOf(-44),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c05eea56-711c-4323-9d61-8b33608f4a3f",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(90),
                                                                                                                            Long.valueOf(-44),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c05eea56-711c-4323-9d61-8b33608f4a3f",
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
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-97),
                                                                                                                            Long.valueOf(104),
                                                                                                                            Order.getDefault(),
                                                                                                                            "8f8239b0-1799-44c0-a2c8-5a20a1406243",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(-97),
                                                                                                                            Long.valueOf(104),
                                                                                                                            Order.getDefault(),
                                                                                                                            "8f8239b0-1799-44c0-a2c8-5a20a1406243",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions3 = new CertificateIssuerConfigListOptions(Integer.valueOf(-17),
                                                                                                                            Long.valueOf(-128),
                                                                                                                            Order.getDefault(),
                                                                                                                            "fb052687-b539-4f4d-bada-e4dde3569263",
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

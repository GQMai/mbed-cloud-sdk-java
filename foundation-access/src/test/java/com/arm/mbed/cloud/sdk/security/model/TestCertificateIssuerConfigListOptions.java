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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(35),
                                                                                                                            Long.valueOf(19),
                                                                                                                            Order.getDefault(),
                                                                                                                            "5dfd5b02-870f-4311-b826-eb7efcafb380",
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
            CertificateIssuerConfigListOptions option = new CertificateIssuerConfigListOptions().equalToReference("588d53bf-64bd-4e8d-8f66-a80673bc2fa1");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE));
            assertTrue(option.hasFilter(CertificateIssuerConfigListOptions.TAG_FILTER_BY_REFERENCE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getReferenceFilters());
            assertEquals("588d53bf-64bd-4e8d-8f66-a80673bc2fa1",
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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(-36),
                                                                                                                            Long.valueOf(-119),
                                                                                                                            Order.getDefault(),
                                                                                                                            "447b1e58-99ea-4eca-91b4-25f7f40c0f55",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(-36),
                                                                                                                            Long.valueOf(-119),
                                                                                                                            Order.getDefault(),
                                                                                                                            "447b1e58-99ea-4eca-91b4-25f7f40c0f55",
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
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions1 = new CertificateIssuerConfigListOptions(Integer.valueOf(22),
                                                                                                                            Long.valueOf(2),
                                                                                                                            Order.getDefault(),
                                                                                                                            "08bced70-bb75-4ce3-905b-5bfe6a93e827",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions2 = new CertificateIssuerConfigListOptions(Integer.valueOf(22),
                                                                                                                            Long.valueOf(2),
                                                                                                                            Order.getDefault(),
                                                                                                                            "08bced70-bb75-4ce3-905b-5bfe6a93e827",
                                                                                                                            null,
                                                                                                                            null);
            CertificateIssuerConfigListOptions certificateissuerconfiglistoptions3 = new CertificateIssuerConfigListOptions(Integer.valueOf(-86),
                                                                                                                            Long.valueOf(-36),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b4a04e0a-b4ec-441b-a089-14569862d170",
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

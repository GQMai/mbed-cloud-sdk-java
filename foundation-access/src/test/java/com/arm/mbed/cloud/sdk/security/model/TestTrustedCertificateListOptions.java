// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificateListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestTrustedCertificateListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-100),
                                                                                                             Long.valueOf(-113),
                                                                                                             Order.getDefault(),
                                                                                                             "c6c483f1-dc89-4b9c-96f1-071f97788ca6",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = trustedcertificatelistoptions1.clone();
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings({ "boxing", "resource" })
    @Test
    public void testFilters() {
        try {
            TrustedCertificateListOptions option = new TrustedCertificateListOptions().equalToValid(Boolean.TRUE)
                                                                                      .equalToName("2a8e7906-7491-4fda-956c-f4cdcc68c8db")
                                                                                      .equalToStatus(TrustedCertificateStatus.getDefault())
                                                                                      .equalToDeviceExecutionMode(Integer.valueOf(46))
                                                                                      .notEqualToDeviceExecutionMode(Integer.valueOf(-99))
                                                                                      .likeIssuer("1f373d12-eabf-4c9e-a8fd-62740dbe6a15")
                                                                                      .equalToService(TrustedCertificateService.getDefault())
                                                                                      .likeSubject("f2ea0580-67e0-445b-9979-eb77e281c290")
                                                                                      .equalToEnrollmentMode(Boolean.FALSE);
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_VALID));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_VALID, FilterOperator.EQUAL));
            assertNotNull(option.getValidFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_NAME, FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("2a8e7906-7491-4fda-956c-f4cdcc68c8db",
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(TrustedCertificateStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                                                    TrustedCertificateStatus.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(46),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-99),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER, FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("1f373d12-eabf-4c9e-a8fd-62740dbe6a15",
                         ListOptionsEncoder.encodeSingleLikeFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                                                   String.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_SERVICE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SERVICE, FilterOperator.EQUAL));
            assertNotNull(option.getServiceFilters());
            assertEquals(TrustedCertificateService.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                                                    TrustedCertificateService.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT, FilterOperator.LIKE));
            assertNotNull(option.getSubjectFilters());
            assertEquals("f2ea0580-67e0-445b-9979-eb77e281c290",
                         ListOptionsEncoder.encodeSingleLikeFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                                                   String.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollmentModeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                                                    Boolean.class, option));
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-118),
                                                                                                             Long.valueOf(-90),
                                                                                                             Order.getDefault(),
                                                                                                             "31489405-5c8b-4c7a-9690-19c6595d5c8c",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(-118),
                                                                                                             Long.valueOf(-90),
                                                                                                             Order.getDefault(),
                                                                                                             "31489405-5c8b-4c7a-9690-19c6595d5c8c",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2.hashCode(), trustedcertificatelistoptions1.hashCode());
            int hashCode = trustedcertificatelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, trustedcertificatelistoptions1.hashCode());
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-101),
                                                                                                             Long.valueOf(46),
                                                                                                             Order.getDefault(),
                                                                                                             "470c308a-6bff-45e2-8458-ca36b098be9f",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(-101),
                                                                                                             Long.valueOf(46),
                                                                                                             Order.getDefault(),
                                                                                                             "470c308a-6bff-45e2-8458-ca36b098be9f",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions3 = new TrustedCertificateListOptions(Integer.valueOf(-40),
                                                                                                             Long.valueOf(-68),
                                                                                                             Order.getDefault(),
                                                                                                             "1f6b7295-27f0-40d2-817d-5f1a8c404c8d",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotNull(trustedcertificatelistoptions3);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertNotSame(trustedcertificatelistoptions3, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions1, trustedcertificatelistoptions2);
            assertEquals(trustedcertificatelistoptions1, trustedcertificatelistoptions1);
            assertFalse(trustedcertificatelistoptions1.equals(null));
            assertNotEquals(trustedcertificatelistoptions3, trustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

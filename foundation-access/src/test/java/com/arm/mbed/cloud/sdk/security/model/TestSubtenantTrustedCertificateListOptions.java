// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantTrustedCertificateListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(123),
                                                                                                                                        Long.valueOf(-98),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "6cb85988-0240-4dfc-a2ac-9e05a721fbe4",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = subtenanttrustedcertificatelistoptions1.clone();
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
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
            SubtenantTrustedCertificateListOptions option = new SubtenantTrustedCertificateListOptions().equalToValid(Boolean.TRUE)
                                                                                                        .equalToName("f685ddbf-45a6-4e66-9757-1826a78e20f3")
                                                                                                        .equalToStatus(SubtenantTrustedCertificateStatus.getDefault())
                                                                                                        .equalToDeviceExecutionMode(Integer.valueOf(40))
                                                                                                        .notEqualToDeviceExecutionMode(Integer.valueOf(-14))
                                                                                                        .likeIssuer("6c73a3a1-42ae-447b-897d-5b0798c983c5")
                                                                                                        .equalToService(SubtenantTrustedCertificateService.getDefault())
                                                                                                        .likeSubject("d4cfe8c6-bb40-4df6-8a12-362b1c7973d3")
                                                                                                        .equalToEnrollmentMode(Boolean.FALSE);
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getValidFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("f685ddbf-45a6-4e66-9757-1826a78e20f3",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(SubtenantTrustedCertificateStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                                                    SubtenantTrustedCertificateStatus.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(40),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-14),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                        FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("6c73a3a1-42ae-447b-897d-5b0798c983c5",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getServiceFilters());
            assertEquals(SubtenantTrustedCertificateService.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                                                    SubtenantTrustedCertificateService.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                        FilterOperator.LIKE));
            assertNotNull(option.getSubjectFilters());
            assertEquals("d4cfe8c6-bb40-4df6-8a12-362b1c7973d3",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollmentModeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(47),
                                                                                                                                        Long.valueOf(123),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "dba6cdc7-2d47-4906-97b3-810764e7fe82",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(47),
                                                                                                                                        Long.valueOf(123),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "dba6cdc7-2d47-4906-97b3-810764e7fe82",
                                                                                                                                        null,
                                                                                                                                        null);
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2.hashCode(),
                         subtenanttrustedcertificatelistoptions1.hashCode());
            int hashCode = subtenanttrustedcertificatelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenanttrustedcertificatelistoptions1.hashCode());
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-13),
                                                                                                                                        Long.valueOf(-88),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "6633dcd3-58c1-4a6f-93fc-aaf4158c6bdc",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-13),
                                                                                                                                        Long.valueOf(-88),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "6633dcd3-58c1-4a6f-93fc-aaf4158c6bdc",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions3 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(97),
                                                                                                                                        Long.valueOf(-36),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "6615ea1b-8ed9-46d5-bdcb-38c004a451d4",
                                                                                                                                        null,
                                                                                                                                        null);
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotNull(subtenanttrustedcertificatelistoptions3);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertNotSame(subtenanttrustedcertificatelistoptions3, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions1, subtenanttrustedcertificatelistoptions2);
            assertEquals(subtenanttrustedcertificatelistoptions1, subtenanttrustedcertificatelistoptions1);
            assertFalse(subtenanttrustedcertificatelistoptions1.equals(null));
            assertNotEquals(subtenanttrustedcertificatelistoptions3, subtenanttrustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

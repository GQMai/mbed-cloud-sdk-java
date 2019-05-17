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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-37),
                                                                                                                                        Long.valueOf(56),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "f347178b-6d5b-4782-aa32-793e65db3972",
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
                                                                                                        .equalToName("13adeca8-8816-4b83-96a1-58954eaf53d2")
                                                                                                        .equalToStatus(SubtenantTrustedCertificateStatus.getDefault())
                                                                                                        .equalToDeviceExecutionMode(Integer.valueOf(68))
                                                                                                        .notEqualToDeviceExecutionMode(Integer.valueOf(-85))
                                                                                                        .likeIssuer("e262df96-75e6-429e-abdc-afe75747a3c2")
                                                                                                        .equalToService(SubtenantTrustedCertificateService.getDefault())
                                                                                                        .likeSubject("2f1f03b2-9fc1-4de0-b24f-a80fa510e3f7")
                                                                                                        .equalToEnrollmentMode(Boolean.TRUE);
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
            assertEquals("13adeca8-8816-4b83-96a1-58954eaf53d2",
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
            assertEquals(Integer.valueOf(68),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-85),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                        FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("e262df96-75e6-429e-abdc-afe75747a3c2",
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
            assertEquals("2f1f03b2-9fc1-4de0-b24f-a80fa510e3f7",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollmentModeFilters());
            assertEquals(Boolean.TRUE,
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-21),
                                                                                                                                        Long.valueOf(35),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "c376ffad-ec57-4c1a-aeb4-a8b6a5e48ad9",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-21),
                                                                                                                                        Long.valueOf(35),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "c376ffad-ec57-4c1a-aeb4-a8b6a5e48ad9",
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-57),
                                                                                                                                        Long.valueOf(-125),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "3beba695-2bae-4b38-86d4-a885c88286d7",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-57),
                                                                                                                                        Long.valueOf(-125),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "3beba695-2bae-4b38-86d4-a885c88286d7",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions3 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(-109),
                                                                                                                                        Long.valueOf(-79),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "f34d1c8c-cd03-4e3e-9394-c97afef469e5",
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

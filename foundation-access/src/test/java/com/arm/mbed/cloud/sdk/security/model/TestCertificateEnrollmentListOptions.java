// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateEnrollmentListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(51),
                                                                                                                      Long.valueOf(79),
                                                                                                                      Order.getDefault(),
                                                                                                                      "bbc15a71-712d-41eb-917e-e21d77dbbcc1",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = certificateenrollmentlistoptions1.clone();
            assertNotNull(certificateenrollmentlistoptions1);
            assertNotNull(certificateenrollmentlistoptions2);
            assertNotSame(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
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
            CertificateEnrollmentListOptions option = new CertificateEnrollmentListOptions().lessThanUpdatedAt(new Date(1561379514531L))
                                                                                            .greaterThanUpdatedAt(new Date(1561379515814L))
                                                                                            .equalToCertificateName("b2d4bb0a-364c-44d9-8b9a-d0cd99f425fb")
                                                                                            .equalToDeviceId("bd657356-a07e-4c13-90b8-a0ea5985258b")
                                                                                            .notEqualToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .equalToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .lessThanCreatedAt(new Date(1561379520621L))
                                                                                            .greaterThanCreatedAt(new Date(1561379520797L))
                                                                                            .notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault())
                                                                                            .equalToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault());
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1561379514531L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1561379515814L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getCertificateNameFilters());
            assertEquals("b2d4bb0a-364c-44d9-8b9a-d0cd99f425fb",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("bd657356-a07e-4c13-90b8-a0ea5985258b",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEnrollResultFilters());
            assertEquals(CertificateEnrollmentEnrollResult.getDefault(),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                                                       CertificateEnrollmentEnrollResult.class,
                                                                       option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollResultFilters());
            assertEquals(CertificateEnrollmentEnrollResult.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_RESULT,
                                                                    CertificateEnrollmentEnrollResult.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1561379520621L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1561379520797L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEnrollStatusFilters());
            assertEquals(CertificateEnrollmentEnrollStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                                                       CertificateEnrollmentEnrollStatus.class,
                                                                       option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollStatusFilters());
            assertEquals(CertificateEnrollmentEnrollStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_ENROLL_STATUS,
                                                                    CertificateEnrollmentEnrollStatus.class, option));
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-76),
                                                                                                                      Long.valueOf(36),
                                                                                                                      Order.getDefault(),
                                                                                                                      "ee45f39e-4cd5-49f5-9d5e-bd7064185973",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(-76),
                                                                                                                      Long.valueOf(36),
                                                                                                                      Order.getDefault(),
                                                                                                                      "ee45f39e-4cd5-49f5-9d5e-bd7064185973",
                                                                                                                      null,
                                                                                                                      null);
            assertNotNull(certificateenrollmentlistoptions1);
            assertNotNull(certificateenrollmentlistoptions2);
            assertNotSame(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2.hashCode(), certificateenrollmentlistoptions1.hashCode());
            int hashCode = certificateenrollmentlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateenrollmentlistoptions1.hashCode());
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(110),
                                                                                                                      Long.valueOf(-122),
                                                                                                                      Order.getDefault(),
                                                                                                                      "d55cc744-dbcf-41fa-998a-62bad7d68997",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(110),
                                                                                                                      Long.valueOf(-122),
                                                                                                                      Order.getDefault(),
                                                                                                                      "d55cc744-dbcf-41fa-998a-62bad7d68997",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions3 = new CertificateEnrollmentListOptions(Integer.valueOf(50),
                                                                                                                      Long.valueOf(-109),
                                                                                                                      Order.getDefault(),
                                                                                                                      "578f4bb7-c6d7-41f2-89e1-2abd8865ab54",
                                                                                                                      null,
                                                                                                                      null);
            assertNotNull(certificateenrollmentlistoptions1);
            assertNotNull(certificateenrollmentlistoptions2);
            assertNotNull(certificateenrollmentlistoptions3);
            assertNotSame(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertNotSame(certificateenrollmentlistoptions3, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions2, certificateenrollmentlistoptions1);
            assertEquals(certificateenrollmentlistoptions1, certificateenrollmentlistoptions2);
            assertEquals(certificateenrollmentlistoptions1, certificateenrollmentlistoptions1);
            assertFalse(certificateenrollmentlistoptions1.equals(null));
            assertNotEquals(certificateenrollmentlistoptions3, certificateenrollmentlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

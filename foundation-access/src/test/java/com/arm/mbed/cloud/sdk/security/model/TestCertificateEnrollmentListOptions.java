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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-98),
                                                                                                                      Long.valueOf(-39),
                                                                                                                      Order.getDefault(),
                                                                                                                      "9158e822-f71c-445a-b8a2-4c8463a24cb5",
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
            CertificateEnrollmentListOptions option = new CertificateEnrollmentListOptions().lessThanUpdatedAt(new Date(1557959072691L))
                                                                                            .greaterThanUpdatedAt(new Date(1557959070427L))
                                                                                            .equalToCertificateName("c5738c3a-9bf1-4044-a090-0be1240c51d9")
                                                                                            .equalToDeviceId("ec98f135-95b4-433a-95ca-676f62e03bcc")
                                                                                            .notEqualToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .equalToEnrollResult(CertificateEnrollmentEnrollResult.getDefault())
                                                                                            .lessThanCreatedAt(new Date(1557959065059L))
                                                                                            .greaterThanCreatedAt(new Date(1557959065252L))
                                                                                            .notEqualToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault())
                                                                                            .equalToEnrollStatus(CertificateEnrollmentEnrollStatus.getDefault());
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1557959072691L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1557959070427L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getCertificateNameFilters());
            assertEquals("c5738c3a-9bf1-4044-a090-0be1240c51d9",
                         ListOptionsEncoder.encodeSingleEqualFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CERTIFICATE_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_DEVICE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("ec98f135-95b4-433a-95ca-676f62e03bcc",
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
            assertEquals(new Date(1557959065059L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(CertificateEnrollmentListOptions.TAG_FILTER_BY_CREATED_AT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1557959065252L),
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-6),
                                                                                                                      Long.valueOf(58),
                                                                                                                      Order.getDefault(),
                                                                                                                      "2b989ac9-cf5f-486e-ad29-182fceb43ad2",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(-6),
                                                                                                                      Long.valueOf(58),
                                                                                                                      Order.getDefault(),
                                                                                                                      "2b989ac9-cf5f-486e-ad29-182fceb43ad2",
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
            CertificateEnrollmentListOptions certificateenrollmentlistoptions1 = new CertificateEnrollmentListOptions(Integer.valueOf(-20),
                                                                                                                      Long.valueOf(-8),
                                                                                                                      Order.getDefault(),
                                                                                                                      "d7091be4-601f-426c-9aa7-4c4d2837e412",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions2 = new CertificateEnrollmentListOptions(Integer.valueOf(-20),
                                                                                                                      Long.valueOf(-8),
                                                                                                                      Order.getDefault(),
                                                                                                                      "d7091be4-601f-426c-9aa7-4c4d2837e412",
                                                                                                                      null,
                                                                                                                      null);
            CertificateEnrollmentListOptions certificateenrollmentlistoptions3 = new CertificateEnrollmentListOptions(Integer.valueOf(-5),
                                                                                                                      Long.valueOf(-115),
                                                                                                                      Order.getDefault(),
                                                                                                                      "4a178666-43e3-481e-b743-692c59eb0c24",
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

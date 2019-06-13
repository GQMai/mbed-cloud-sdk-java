// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollment.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateEnrollment {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-]]]].d__12",
                                                                                     new Date(1560440634896L),
                                                                                     "2dde6af3-b101-4c0d-a1a4-dea4706a2cd1",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "06a5dd8a-de0f-427d-b609-2da4b2ebb6bc",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9f47da75-44d6-44b7-887e-c414cb0d54cc",
                                                                                     new Date(1560440627915L));
            CertificateEnrollment certificateenrollment2 = certificateenrollment1.clone();
            assertNotNull(certificateenrollment1);
            assertNotNull(certificateenrollment2);
            assertNotSame(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-]]]].d__12",
                                                                                     new Date(1560440627931L),
                                                                                     "18ab66cc-e5f4-4b63-8c5f-86c6ae6e2dec",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "3899cea9-e834-4322-adae-4ee5851a20f5",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "e0cd5adb-d120-4e5e-863d-a342c13abbbb",
                                                                                     new Date(1560440634105L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-]]]].d__12",
                                                                                     new Date(1560440627931L),
                                                                                     "18ab66cc-e5f4-4b63-8c5f-86c6ae6e2dec",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "3899cea9-e834-4322-adae-4ee5851a20f5",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "e0cd5adb-d120-4e5e-863d-a342c13abbbb",
                                                                                     new Date(1560440634105L));
            assertNotNull(certificateenrollment1);
            assertNotNull(certificateenrollment2);
            assertNotSame(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2.hashCode(), certificateenrollment1.hashCode());
            int hashCode = certificateenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateenrollment1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("_-]]]].d__12",
                                                                                new Date(1560440628004L),
                                                                                "adc215e4-a996-4ea7-b918-9c15a6a6a252",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "ef0b5efd-5db4-4fed-8d82-58222803f486",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "8f565b81-c739-43e8-b12d-337a23a7000c",
                                                                                new Date(1560440628569L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-]]]].d__12",
                                                                                     new Date(1560440633153L),
                                                                                     "30d800f5-1f22-4ad0-bc66-4bc2a852b2cb",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "9920580b-6238-40ba-b005-cd061a0daf83",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "c4e16c45-9f36-424d-b477-a3cf7bbb8563",
                                                                                     new Date(1560440632792L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-]]]].d__12",
                                                                                     new Date(1560440633153L),
                                                                                     "30d800f5-1f22-4ad0-bc66-4bc2a852b2cb",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "9920580b-6238-40ba-b005-cd061a0daf83",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "c4e16c45-9f36-424d-b477-a3cf7bbb8563",
                                                                                     new Date(1560440632792L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("_-]]]].d__12",
                                                                                     new Date(1560440633494L),
                                                                                     "2c048377-9d00-4bfc-8da2-9facadd10a28",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "6fe658e6-d303-4aeb-a964-d04050e1748a",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "8f609fff-462c-425b-a3d9-318347d3e79a",
                                                                                     new Date(1560440635773L));
            assertNotNull(certificateenrollment1);
            assertNotNull(certificateenrollment2);
            assertNotNull(certificateenrollment3);
            assertNotSame(certificateenrollment2, certificateenrollment1);
            assertNotSame(certificateenrollment3, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment2, certificateenrollment1);
            assertEquals(certificateenrollment1, certificateenrollment2);
            assertEquals(certificateenrollment1, certificateenrollment1);
            assertFalse(certificateenrollment1.equals(null));
            assertNotEquals(certificateenrollment3, certificateenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].Q", new Date(1558096102410L),
                                                                                     "a4be15e3-bd3c-487f-87e1-cc662cfdf46f",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "3546c6ce-02cc-4146-81fe-73767dacaa25",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "946eb4cc-e530-4341-9500-677a1d7bc477",
                                                                                     new Date(1558096100560L));
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
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].Q", new Date(1558096107424L),
                                                                                     "b5d50705-6ae4-47be-ba38-d1e2e3f2da50",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "0875920e-5147-49c5-bbfd-b0d6264960f9",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "0a40919a-f9c6-4631-b93c-d05e6ab8e2d9",
                                                                                     new Date(1558096100258L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-].Q", new Date(1558096107424L),
                                                                                     "b5d50705-6ae4-47be-ba38-d1e2e3f2da50",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "0875920e-5147-49c5-bbfd-b0d6264960f9",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "0a40919a-f9c6-4631-b93c-d05e6ab8e2d9",
                                                                                     new Date(1558096100258L));
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
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("_-].Q", new Date(1558096102366L),
                                                                                "1e3984b8-b374-4d58-8e33-9958629908a4",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                "d756b228-73ea-4960-adcd-0ecb15727ec8",
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "4a3f7a01-a2fe-4523-a3cb-410e461b41ca",
                                                                                new Date(1558096107305L));
        assertTrue(certificateenrollment.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("_-].Q", new Date(1558096109441L),
                                                                                     "3dfe90df-142d-4c8a-9a77-02923015b880",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "41b3c712-bfc6-403b-9e74-039f15c32eb6",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "b5ac55af-a28a-4169-8135-1ff84bb008d0",
                                                                                     new Date(1558096100521L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("_-].Q", new Date(1558096109441L),
                                                                                     "3dfe90df-142d-4c8a-9a77-02923015b880",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "41b3c712-bfc6-403b-9e74-039f15c32eb6",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "b5ac55af-a28a-4169-8135-1ff84bb008d0",
                                                                                     new Date(1558096100521L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("_-].Q", new Date(1558096105906L),
                                                                                     "82774fb0-26ad-470a-ae85-9b776e3358b0",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     "913b5b1d-7095-4659-a275-3a3f7f95a56e",
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "d425cdfb-fd62-4c21-8cca-c3b380ca77fe",
                                                                                     new Date(1558096104095L));
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

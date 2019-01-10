// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollment.
 */
public class TestCertificateEnrollment {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("cf935e06-f846-469e-b10b-3a2d4f2ac95d",
                                                                                     new Date(1547159620616L),
                                                                                     "5c46a66d-20cb-4fca-abb2-6740a0b2df4f",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "9df393db-2169-4c77-b6b8-d16a37d01681",
                                                                                     new Date(1547159620786L));
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
    @Test
    public void testHashCode() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("11f073c7-b31d-4c81-9644-543b51a4c3fb",
                                                                                     new Date(1547159620682L),
                                                                                     "28f4a43c-ff0b-4d57-888c-0b659ba28203",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "07343a4f-d368-4208-b38f-7464d880793b",
                                                                                     new Date(1547159629378L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("11f073c7-b31d-4c81-9644-543b51a4c3fb",
                                                                                     new Date(1547159620682L),
                                                                                     "28f4a43c-ff0b-4d57-888c-0b659ba28203",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "07343a4f-d368-4208-b38f-7464d880793b",
                                                                                     new Date(1547159629378L));
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
    @Test
    public void testIsValid() {
        CertificateEnrollment certificateenrollment = new CertificateEnrollment("8109a6f0-5e46-48c5-ae2f-e0975c216203",
                                                                                new Date(1547159623744L),
                                                                                "090f0fa6-3817-45d8-b678-a922148a0f34",
                                                                                CertificateEnrollmentEnrollResult.getDefault(),
                                                                                CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                "0da2f287-24e7-4a07-9492-2a8c75872dca",
                                                                                new Date(1547159626968L));
        assertTrue(certificateenrollment.isValid());
        CertificateEnrollment certificateenrollmentInvalid = new CertificateEnrollment("f185705c-82a9-4807-9036-a2a1176f1dfa",
                                                                                       new Date(1547159625614L),
                                                                                       "c1524b13-edee-47ea-8188-fa6078e320fb",
                                                                                       CertificateEnrollmentEnrollResult.getDefault(),
                                                                                       CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                       null, new Date(1547159623555L));
        assertFalse(certificateenrollmentInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            CertificateEnrollment certificateenrollment1 = new CertificateEnrollment("2afc04a7-8e27-4a78-a990-717117136a9b",
                                                                                     new Date(1547159623612L),
                                                                                     "8dec1220-b5ce-45c8-805e-fc0b42ffff63",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "52293689-6562-4c5a-bbc7-4d3764b9c171",
                                                                                     new Date(1547159620061L));
            CertificateEnrollment certificateenrollment2 = new CertificateEnrollment("2afc04a7-8e27-4a78-a990-717117136a9b",
                                                                                     new Date(1547159623612L),
                                                                                     "8dec1220-b5ce-45c8-805e-fc0b42ffff63",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "52293689-6562-4c5a-bbc7-4d3764b9c171",
                                                                                     new Date(1547159620061L));
            CertificateEnrollment certificateenrollment3 = new CertificateEnrollment("6286881f-09b8-4a9a-8446-a9a097cb2dbf",
                                                                                     new Date(1547159627143L),
                                                                                     "459f3cd0-21c3-4ad7-900c-acdb8333ce6d",
                                                                                     CertificateEnrollmentEnrollResult.getDefault(),
                                                                                     CertificateEnrollmentEnrollStatus.getDefault(),
                                                                                     "5485d29a-c17f-4874-bf5f-adeea9e7a21f",
                                                                                     new Date(1547159626148L));
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

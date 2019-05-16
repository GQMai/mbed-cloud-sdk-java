// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeveloperCertificate.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeveloperCertificate {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("b2009718-f810-4826-9471-bebc9d9a57a8",
                                                                                  "46275cdd-a386-4448-b7f8-a08272a5a6da",
                                                                                  new Date(1558003275080L),
                                                                                  "9a38f796-6853-47b2-8663-1e1f5ec194ad",
                                                                                  "a94921a1-d34f-474d-bcad-8adc1320454b",
                                                                                  "404c3851-4cc3-4176-8f88-6205dd75a595",
                                                                                  "eab2a909-ced5-42d5-b499-717d7335283b",
                                                                                  "b8873d0f-5e55-4c89-b633-a6c74d9fdd70");
            DeveloperCertificate developercertificate2 = developercertificate1.clone();
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotSame(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("3af6bb25-5dcd-44f3-a660-ec50bae8a357",
                                                                                  "d5be87e6-adb6-4b88-80e7-81a6cf39567c",
                                                                                  new Date(1558003283274L),
                                                                                  "956d0be8-947a-4710-8089-16f5ac4786b4",
                                                                                  "585a8e59-cdc2-49c4-af5a-0cb413f4406c",
                                                                                  "257489b1-bd03-4c3f-bb69-289c131e6355",
                                                                                  "9a4f7ff2-6c7b-40fe-a8ef-79bb1b67ff05",
                                                                                  "71208273-cb86-485b-9c0c-261184e840d0");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("3af6bb25-5dcd-44f3-a660-ec50bae8a357",
                                                                                  "d5be87e6-adb6-4b88-80e7-81a6cf39567c",
                                                                                  new Date(1558003283274L),
                                                                                  "956d0be8-947a-4710-8089-16f5ac4786b4",
                                                                                  "585a8e59-cdc2-49c4-af5a-0cb413f4406c",
                                                                                  "257489b1-bd03-4c3f-bb69-289c131e6355",
                                                                                  "9a4f7ff2-6c7b-40fe-a8ef-79bb1b67ff05",
                                                                                  "71208273-cb86-485b-9c0c-261184e840d0");
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotSame(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate2.hashCode(), developercertificate1.hashCode());
            int hashCode = developercertificate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, developercertificate1.hashCode());
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
        DeveloperCertificate developercertificate = new DeveloperCertificate("01d4b255-b03b-43b1-8b42-ef3a4fae75b9",
                                                                             "b2a267e7-b63e-4273-bd69-0ccbdca9d296",
                                                                             new Date(1558003275673L),
                                                                             "72b0efb9-7346-4cdd-a678-cc92489d66f6",
                                                                             "ff99b276-211d-4460-be37-ee68b5735cf6",
                                                                             "918158b0-443d-46c5-8fca-dd2979760c1b",
                                                                             "d8374472-34ea-4260-b335-4c4dd3b35dcf",
                                                                             "f2f634c5-db81-472c-84ce-10f40ead034a");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("b0f40a57-7e4d-4f1a-86d7-9f8c7659b601",
                                                                                    "2c8b7b44-ec2b-4b10-b694-23aecadb52ea",
                                                                                    new Date(1558003278483L),
                                                                                    "60e37396-d48e-4a03-983a-c22ea210fa43",
                                                                                    "14ae0885-688c-4cd8-8677-75aa9a613f8a",
                                                                                    "3dcfeaab-4243-439e-8063-f7a53300cad8",
                                                                                    null,
                                                                                    "e9f22e6f-af08-4905-bf19-d9357ffabe4d");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("16566706-31d4-47d0-a1ac-353d807744d1",
                                                                                  "1f02064b-134b-42d0-a51f-5a9e955ad610",
                                                                                  new Date(1558003277409L),
                                                                                  "5f28b03c-6a3b-4d96-9765-ce36754415c0",
                                                                                  "1edd3d01-2f58-47a0-a085-e32943060824",
                                                                                  "4c2359a9-f92b-482d-9807-9ad0e65aa6da",
                                                                                  "8f820f86-b179-4138-a8a8-139668623395",
                                                                                  "4b25cf18-939b-4e8e-9000-ae94dceeb461");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("16566706-31d4-47d0-a1ac-353d807744d1",
                                                                                  "1f02064b-134b-42d0-a51f-5a9e955ad610",
                                                                                  new Date(1558003277409L),
                                                                                  "5f28b03c-6a3b-4d96-9765-ce36754415c0",
                                                                                  "1edd3d01-2f58-47a0-a085-e32943060824",
                                                                                  "4c2359a9-f92b-482d-9807-9ad0e65aa6da",
                                                                                  "8f820f86-b179-4138-a8a8-139668623395",
                                                                                  "4b25cf18-939b-4e8e-9000-ae94dceeb461");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("4614321e-f6b2-49bb-8feb-3bc4b69c05d2",
                                                                                  "e7b78100-006e-43df-ae70-730333068a69",
                                                                                  new Date(1558003281067L),
                                                                                  "d3528a58-1095-47cb-b410-f9f6f06b10b1",
                                                                                  "591b906c-a87d-4d0b-b7a1-6ab9ffa9c275",
                                                                                  "804e6faf-4fab-4e45-a135-1750b7eb6d1f",
                                                                                  "498aebfd-bab4-44e8-8531-9277419834c1",
                                                                                  "0c9149d0-33f0-477e-bb75-5ccebf582a04");
            assertNotNull(developercertificate1);
            assertNotNull(developercertificate2);
            assertNotNull(developercertificate3);
            assertNotSame(developercertificate2, developercertificate1);
            assertNotSame(developercertificate3, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate2, developercertificate1);
            assertEquals(developercertificate1, developercertificate2);
            assertEquals(developercertificate1, developercertificate1);
            assertFalse(developercertificate1.equals(null));
            assertNotEquals(developercertificate3, developercertificate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

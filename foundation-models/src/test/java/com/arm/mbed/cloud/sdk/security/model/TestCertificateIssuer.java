// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuer.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuer {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1553793333106L),
                                                                         "c73f3dba-543e-40d1-abb0-18fc9236c31d",
                                                                         "9b8c7f38-8dfd-44c5-ad2c-99a320e7aabb", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "66e30d67-974e-40f0-b29f-1b21447a81b8");
            CertificateIssuer certificateissuer2 = certificateissuer1.clone();
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
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
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1553793332658L),
                                                                         "dc7c4a26-c88d-43ec-bc02-3944b8a28cb2",
                                                                         "fff1e827-e7f7-4264-8fd1-9c251f2c8d52", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "27c45b26-7e5f-4c8f-ba3a-c7b28df3ddd7");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1553793332658L),
                                                                         "dc7c4a26-c88d-43ec-bc02-3944b8a28cb2",
                                                                         "fff1e827-e7f7-4264-8fd1-9c251f2c8d52", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "27c45b26-7e5f-4c8f-ba3a-c7b28df3ddd7");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2.hashCode(), certificateissuer1.hashCode());
            int hashCode = certificateissuer1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuer1.hashCode());
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
        CertificateIssuer certificateissuer = new CertificateIssuer(new Date(1553793331138L),
                                                                    "47cf64a9-4a91-4fc3-b090-6d8f5a2ff055",
                                                                    "47f8da18-36bb-476d-b9a8-36d9f29fe392", null,
                                                                    CertificateIssuerType.getDefault(),
                                                                    "b3f8e1bf-cfbe-45d7-9abb-7927a07e8fba");
        assertTrue(certificateissuer.isValid());
        CertificateIssuer certificateissuerInvalid = new CertificateIssuer(new Date(1553793336738L),
                                                                           "09f0ee9d-27bc-4eed-9643-115603faeb6eed9fc200-ef33-496e-806f-598217b1c184f575ea0d-70d1-4e98-849d-ca62c014ace1",
                                                                           "4b97dbfb-77ea-4116-ad34-3a23fc182443", null,
                                                                           CertificateIssuerType.getDefault(), null);
        assertFalse(certificateissuerInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1553793336259L),
                                                                         "811bfc77-ddc6-4808-9ebb-07707f87daa7",
                                                                         "396993a5-7e4a-4dbf-b47e-058416438863", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "98926884-0750-47be-ad69-fff713005623");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1553793336259L),
                                                                         "811bfc77-ddc6-4808-9ebb-07707f87daa7",
                                                                         "396993a5-7e4a-4dbf-b47e-058416438863", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "98926884-0750-47be-ad69-fff713005623");
            CertificateIssuer certificateissuer3 = new CertificateIssuer(new Date(1553793331458L),
                                                                         "7c801618-ea18-47b0-9fd7-b2913c97c100",
                                                                         "79e10521-be22-4fe9-9454-dc80ceca6759", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "213a9399-e7d7-4e0e-bca4-0b6201fe2fa0");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotNull(certificateissuer3);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertNotSame(certificateissuer3, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer1, certificateissuer2);
            assertEquals(certificateissuer1, certificateissuer1);
            assertFalse(certificateissuer1.equals(null));
            assertNotEquals(certificateissuer3, certificateissuer1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

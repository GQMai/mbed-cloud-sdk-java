// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfig.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerConfig {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("f9a58e2e-891b-4f77-a695-746574f7bda0",
                                                                                           new Date(1562657744433L),
                                                                                           "e20f082b-691d-4195-896c-bf667ef77b02",
                                                                                           "8ea911c5-0045-4c46-bc01-612f7577980c",
                                                                                           new Date(1562657745325L));
            CertificateIssuerConfig certificateissuerconfig2 = certificateissuerconfig1.clone();
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("9f9eab83-9f24-4e4f-b71f-3c5c6f13f496",
                                                                                           new Date(1562657744654L),
                                                                                           "31958773-7f6d-4236-a310-3c566b8d9089",
                                                                                           "f9dfb7a2-3659-4e78-a3b6-aec452c10480",
                                                                                           new Date(1562657742889L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("9f9eab83-9f24-4e4f-b71f-3c5c6f13f496",
                                                                                           new Date(1562657744654L),
                                                                                           "31958773-7f6d-4236-a310-3c566b8d9089",
                                                                                           "f9dfb7a2-3659-4e78-a3b6-aec452c10480",
                                                                                           new Date(1562657742889L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2.hashCode(), certificateissuerconfig1.hashCode());
            int hashCode = certificateissuerconfig1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerconfig1.hashCode());
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
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("7169041d-6e20-4a82-ac2c-72a5a06efe5e",
                                                                                      new Date(1562657745403L),
                                                                                      "2d5de1fc-2445-4c8d-ae54-9844cd61e4b4",
                                                                                      "165d5b4b-d64f-47d0-b731-eb86e9854d83",
                                                                                      new Date(1562657746477L));
        assertTrue(certificateissuerconfig.isValid());
        CertificateIssuerConfig certificateissuerconfigInvalid = new CertificateIssuerConfig(null,
                                                                                             new Date(1562657745734L),
                                                                                             "07f2a7d2-15f7-4ac3-a82a-57fcc8498315",
                                                                                             null,
                                                                                             new Date(1562657748598L));
        assertFalse(certificateissuerconfigInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("67f6ad94-9559-49e6-ab6d-51c8144a6eb7",
                                                                                           new Date(1562657747997L),
                                                                                           "abb47385-6498-40d8-8c4b-c29893ccee54",
                                                                                           "dae7913e-b1e6-4ff9-a451-620c3b19af1c",
                                                                                           new Date(1562657750197L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("67f6ad94-9559-49e6-ab6d-51c8144a6eb7",
                                                                                           new Date(1562657747997L),
                                                                                           "abb47385-6498-40d8-8c4b-c29893ccee54",
                                                                                           "dae7913e-b1e6-4ff9-a451-620c3b19af1c",
                                                                                           new Date(1562657750197L));
            CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("34d074cd-53e8-4360-b8d8-8acd7f0e437c",
                                                                                           new Date(1562657748748L),
                                                                                           "af64582e-16e3-4120-9a04-4ac2509971eb",
                                                                                           "b469e2fe-5b90-48f0-ad3f-1a7c91340ec3",
                                                                                           new Date(1562657751178L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotNull(certificateissuerconfig3);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertNotSame(certificateissuerconfig3, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig1, certificateissuerconfig2);
            assertEquals(certificateissuerconfig1, certificateissuerconfig1);
            assertFalse(certificateissuerconfig1.equals(null));
            assertNotEquals(certificateissuerconfig3, certificateissuerconfig1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("39f252e7-9172-4298-955b-1f6071aca093",
                                                                                  "7573628c-405c-4ea9-9908-f7dd00495d9d",
                                                                                  new Date(1553200098128L),
                                                                                  "1060f207-b0d7-4764-beb8-89051af7b87f",
                                                                                  "f56ad031-ffa8-4f19-a214-6a84399f189e",
                                                                                  "4add0c56-e584-48c4-9c59-2b78b96d435b",
                                                                                  "5853e2b0-6097-4f17-930f-2f12e0baefe2");
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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("7ca55886-6f8c-4eff-9168-70486cc15992",
                                                                                  "1917da2a-3a50-4b58-b838-a55486a0b726",
                                                                                  new Date(1553200093394L),
                                                                                  "bc7fae51-fc17-425a-b557-390fe64d3907",
                                                                                  "6f8f7ecd-8ce0-4ac7-a170-ae9f2d53a051",
                                                                                  "bd84c659-51bc-4f96-8303-c78466e9118e",
                                                                                  "17aef1f7-1b4e-4682-81ac-224539baed29");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("7ca55886-6f8c-4eff-9168-70486cc15992",
                                                                                  "1917da2a-3a50-4b58-b838-a55486a0b726",
                                                                                  new Date(1553200093394L),
                                                                                  "bc7fae51-fc17-425a-b557-390fe64d3907",
                                                                                  "6f8f7ecd-8ce0-4ac7-a170-ae9f2d53a051",
                                                                                  "bd84c659-51bc-4f96-8303-c78466e9118e",
                                                                                  "17aef1f7-1b4e-4682-81ac-224539baed29");
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
        DeveloperCertificate developercertificate = new DeveloperCertificate("91fc3de4-db13-4c50-998a-af66a3c19782",
                                                                             "baf2d5a6-e2ea-4222-9ac2-04d6950f5f9f",
                                                                             new Date(1553200099766L),
                                                                             "74570815-a55d-486a-b5e6-e4df8cfbe7ca",
                                                                             "0cb40767-f4f1-4644-a68d-8b039a936180",
                                                                             "f1c5d860-85c3-4016-9279-2fe9c1c828ee",
                                                                             "d1be0b77-0d73-445e-afb4-fb65026dfb81");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("642eac07-8081-467f-a271-bfbf6a35e1b0",
                                                                                    "42f51da4-50f0-431b-a090-22fee66bf596",
                                                                                    new Date(1553200098960L),
                                                                                    "fd143fe2-ccf5-4aa2-9698-a48d29403a8a",
                                                                                    "0206146c-17bb-40d4-b2f0-01582ede26ec",
                                                                                    null,
                                                                                    "b45fc294-2bcd-42ce-a4b3-58ca115946f1");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("36f84cd9-007f-4023-b110-17e566e0d9ac",
                                                                                  "6099316f-3d4a-4b8e-8172-a549d9643ae1",
                                                                                  new Date(1553200099013L),
                                                                                  "854e386b-2dd6-4d73-af23-b11ecaa6a831",
                                                                                  "eb821db9-6627-4661-b115-276353ce8730",
                                                                                  "c1d63190-1899-4db7-af1e-43f7b402c76e",
                                                                                  "cd17d87a-c6b2-4337-8d7a-f30d720316be");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("36f84cd9-007f-4023-b110-17e566e0d9ac",
                                                                                  "6099316f-3d4a-4b8e-8172-a549d9643ae1",
                                                                                  new Date(1553200099013L),
                                                                                  "854e386b-2dd6-4d73-af23-b11ecaa6a831",
                                                                                  "eb821db9-6627-4661-b115-276353ce8730",
                                                                                  "c1d63190-1899-4db7-af1e-43f7b402c76e",
                                                                                  "cd17d87a-c6b2-4337-8d7a-f30d720316be");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("aed024a8-eee2-4c0c-b1a1-d70f1302af63",
                                                                                  "d58fc27d-4a7a-4cfb-9d73-f0d5a8a5c644",
                                                                                  new Date(1553200098631L),
                                                                                  "0500e498-f69b-4666-8747-b1b06d77fe4f",
                                                                                  "17ad11c2-6e65-4ace-bd55-14079bb1d451",
                                                                                  "2d4ee56f-5703-41cc-b101-f0bde02432f1",
                                                                                  "f9bd5725-79ec-4ff2-b6f7-fdf89f70ad68");
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
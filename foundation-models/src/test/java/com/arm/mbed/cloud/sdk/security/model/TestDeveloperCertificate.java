// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeveloperCertificate.
 */
public class TestDeveloperCertificate {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("5381ea01-7f01-40eb-be16-06ea1e28e328",
                                                                                  "3529b253-4b5f-42ae-a782-a83ffdea62c3",
                                                                                  new Date(1547225901951L),
                                                                                  "49fd3fda-be87-4272-97cb-1778c2dbdc65",
                                                                                  "1a399c89-eaac-4c28-acb2-1a4a2fc29b0f",
                                                                                  "076ec140-3f14-4bb2-8cf6-bf9199fd2e1f",
                                                                                  "1a164365-b4cf-46a4-969e-0feefdbea103");
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
    @Test
    public void testHashCode() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("a5f1b59b-ba35-4c41-918e-cbb550dd6e40",
                                                                                  "60e8a68f-b342-43f0-9378-e86af1cb2de2",
                                                                                  new Date(1547225899083L),
                                                                                  "5c6d1897-da85-48fd-9293-514e47309f70",
                                                                                  "e928a4e3-5a28-41e3-9b93-7969b41a5e3c",
                                                                                  "e9ed5687-50f7-4320-a0d2-c7f56f1098f2",
                                                                                  "01b2a0eb-6572-4a34-916e-2f4b2b5da45e");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("a5f1b59b-ba35-4c41-918e-cbb550dd6e40",
                                                                                  "60e8a68f-b342-43f0-9378-e86af1cb2de2",
                                                                                  new Date(1547225899083L),
                                                                                  "5c6d1897-da85-48fd-9293-514e47309f70",
                                                                                  "e928a4e3-5a28-41e3-9b93-7969b41a5e3c",
                                                                                  "e9ed5687-50f7-4320-a0d2-c7f56f1098f2",
                                                                                  "01b2a0eb-6572-4a34-916e-2f4b2b5da45e");
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
    @Test
    public void testIsValid() {
        DeveloperCertificate developercertificate = new DeveloperCertificate("155c6254-350a-46fa-a942-59a01efa93ef",
                                                                             "2cd1643f-9529-4304-8eed-829fcca9111d",
                                                                             new Date(1547225898206L),
                                                                             "a8140084-2dd7-48ee-bc22-5f2d4b8aba6a",
                                                                             "f56704cf-e316-4de3-b522-950f91dcb510",
                                                                             "0c91971c-d97b-41d6-9e4f-7c43f699af50",
                                                                             "c64d90b6-cf46-4809-80e9-90329ae2dcde");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("18036b71-4043-4f57-94a1-5a985a4d49bf",
                                                                                    "5412d7de-93aa-4c43-b14e-cc3e43bfc316",
                                                                                    new Date(1547225901154L),
                                                                                    "af9d1ee5-c340-4e83-92dd-10a04651a498",
                                                                                    "11f4ff47-4e5b-42b3-bacb-8d1c9488f659",
                                                                                    null,
                                                                                    "0bacce1a-9fe0-4ca3-b53c-aeefc0717a6f");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("b4a37de7-d535-430b-a5cf-bd8f29fca061",
                                                                                  "33e353ba-1263-4654-99cb-17f825a07c9f",
                                                                                  new Date(1547225896102L),
                                                                                  "da113d16-e7cb-4de3-9da6-c597cf9531c3",
                                                                                  "654b2d07-b536-4dcc-bbed-fb75c3f4ea8d",
                                                                                  "101828c9-4d6b-40ff-8bb4-2e86ee23f41d",
                                                                                  "34b71762-479c-4856-9288-86dcfc397618");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("b4a37de7-d535-430b-a5cf-bd8f29fca061",
                                                                                  "33e353ba-1263-4654-99cb-17f825a07c9f",
                                                                                  new Date(1547225896102L),
                                                                                  "da113d16-e7cb-4de3-9da6-c597cf9531c3",
                                                                                  "654b2d07-b536-4dcc-bbed-fb75c3f4ea8d",
                                                                                  "101828c9-4d6b-40ff-8bb4-2e86ee23f41d",
                                                                                  "34b71762-479c-4856-9288-86dcfc397618");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("bf579ca5-a86e-4a20-8622-5f6778ae6e9c",
                                                                                  "328646d8-944d-4a43-ad2c-370386a4c2bd",
                                                                                  new Date(1547225899824L),
                                                                                  "2cda74b2-5851-43b0-bc97-ff9b4bf8ff89",
                                                                                  "fdb4a08d-1939-484f-85da-c44557683924",
                                                                                  "e598a007-087f-47df-95c0-69a8cc5ed4c1",
                                                                                  "acdbd9f2-3d9f-497e-936d-87c564295dcd");
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
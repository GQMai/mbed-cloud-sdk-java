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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("de1efe7f-6ca9-4f22-8f35-4646b68e5eaa",
                                                                                  "f275831a-444c-4226-90d4-eff0cfae98ed",
                                                                                  new Date(1557959069095L),
                                                                                  "f085365c-92c0-4126-955a-2d8387727669",
                                                                                  "55ff5353-c1c1-48a8-ac97-b59d20ee3508",
                                                                                  "0a54aa68-cb90-49c9-b651-d778422d43a1",
                                                                                  "72688ac9-4e82-41af-aa2e-4e845d89d553",
                                                                                  "5dc97163-2961-4fad-9425-4f215b333772");
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
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("4551acec-8552-4786-817c-a6c8e3282a87",
                                                                                  "642aa868-b6dd-45ca-b5b9-38a6536f39f2",
                                                                                  new Date(1557959065797L),
                                                                                  "8e714f00-27f5-401b-83ae-b369fc1f914e",
                                                                                  "3a6b8e97-b2ae-41c3-b786-5c1c941e1bd8",
                                                                                  "19f36175-b5c5-4a4a-be17-a4b065860cbb",
                                                                                  "8003b5f3-f6bf-4315-a1aa-c982c2d956fa",
                                                                                  "c7081adb-7ad8-4975-ad97-aecd5d9f076d");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("4551acec-8552-4786-817c-a6c8e3282a87",
                                                                                  "642aa868-b6dd-45ca-b5b9-38a6536f39f2",
                                                                                  new Date(1557959065797L),
                                                                                  "8e714f00-27f5-401b-83ae-b369fc1f914e",
                                                                                  "3a6b8e97-b2ae-41c3-b786-5c1c941e1bd8",
                                                                                  "19f36175-b5c5-4a4a-be17-a4b065860cbb",
                                                                                  "8003b5f3-f6bf-4315-a1aa-c982c2d956fa",
                                                                                  "c7081adb-7ad8-4975-ad97-aecd5d9f076d");
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
        DeveloperCertificate developercertificate = new DeveloperCertificate("82326f04-eb22-4df8-bd34-354ef593f769",
                                                                             "9015e296-6f78-45e6-94ec-b1d1eb1990cd",
                                                                             new Date(1557959066796L),
                                                                             "2a73132d-e0c4-4a0f-87ef-90a3920410cd",
                                                                             "e189e1cd-73f9-4458-bf0b-11e60ecc5d43",
                                                                             "56d03e60-1a98-4fa6-8133-45d2f050972a",
                                                                             "d972bccd-a473-4f90-bfe5-75a1a03e4362",
                                                                             "5901fd18-5431-44b9-a837-68144d39f925");
        assertTrue(developercertificate.isValid());
        DeveloperCertificate developercertificateInvalid = new DeveloperCertificate("2d2bcf3b-61c9-4a8a-9a09-7b9fd328ef1b",
                                                                                    "bf5c74c3-f2e4-4994-951d-bee2747c3839",
                                                                                    new Date(1557959064347L),
                                                                                    "67302791-42e3-44b8-891c-6e119467ba43",
                                                                                    "0e6e08ff-81ca-4c9a-b44a-d0d36c526d1b",
                                                                                    "ac5c71aa-1945-4d84-ae09-93c78ffcd741",
                                                                                    null,
                                                                                    "69622379-d2d3-4570-b6f3-91411e917f6d");
        assertFalse(developercertificateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeveloperCertificate developercertificate1 = new DeveloperCertificate("f7f2b681-9f2a-4489-941a-974c135c9f91",
                                                                                  "3f6f12ac-1bcc-4049-ac9e-a95715efe673",
                                                                                  new Date(1557959072613L),
                                                                                  "35a6d6d1-86e8-4b9b-8e08-a58c3a3e7fb9",
                                                                                  "b6f72507-c802-4d07-bc4c-1aba7d504630",
                                                                                  "717ff401-0d70-41df-b0c7-844fb7f6a09c",
                                                                                  "0f5740a3-9aed-4d78-8daf-a0a92c3aaa1c",
                                                                                  "3858394c-9586-4303-a1b5-377c1846730d");
            DeveloperCertificate developercertificate2 = new DeveloperCertificate("f7f2b681-9f2a-4489-941a-974c135c9f91",
                                                                                  "3f6f12ac-1bcc-4049-ac9e-a95715efe673",
                                                                                  new Date(1557959072613L),
                                                                                  "35a6d6d1-86e8-4b9b-8e08-a58c3a3e7fb9",
                                                                                  "b6f72507-c802-4d07-bc4c-1aba7d504630",
                                                                                  "717ff401-0d70-41df-b0c7-844fb7f6a09c",
                                                                                  "0f5740a3-9aed-4d78-8daf-a0a92c3aaa1c",
                                                                                  "3858394c-9586-4303-a1b5-377c1846730d");
            DeveloperCertificate developercertificate3 = new DeveloperCertificate("32e5166c-e804-42a5-b5ef-7e3341c4bc28",
                                                                                  "b318e22f-4c1f-482b-81c1-4d81d168fd2c",
                                                                                  new Date(1557959069367L),
                                                                                  "2c20cb24-b40f-40ac-bb1e-12806d0f69f4",
                                                                                  "076e6824-220a-4a13-8275-ca288e1e1f62",
                                                                                  "9a6c0ce6-7dec-40b9-9a76-a9c50ece44e4",
                                                                                  "97216aa8-5404-46e8-b2f8-cbfbfb5ef130",
                                                                                  "fc6c67c9-ed6b-4f3c-8eaa-5ed8a6d4d773");
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

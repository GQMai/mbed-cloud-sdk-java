// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model Saml2Request.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSaml2Request {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Saml2Request saml2request1 = new Saml2Request(null, "81befd0f-477f-4d08-b8c3-9bd03edd040a", null,
                                                          "90e8e9fc-549b-4779-bfe0-8311b15507f7",
                                                          "3f89ee20-de5d-4ccf-a122-d88f27ee9ffd",
                                                          "ef6b492a-1e23-469f-bd7e-c05c20dadc78");
            Saml2Request saml2request2 = saml2request1.clone();
            assertNotNull(saml2request1);
            assertNotNull(saml2request2);
            assertNotSame(saml2request2, saml2request1);
            assertEquals(saml2request2, saml2request1);
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
            Saml2Request saml2request1 = new Saml2Request(null, "a14dff5a-06da-495d-a3ae-159d248e6e74", null,
                                                          "eb3e43c4-48b3-4ff5-b369-6236293e510f",
                                                          "5c0691f7-e584-4109-8695-d78389505a3c",
                                                          "9aa3b343-991f-4bde-80a1-811febd6e523");
            Saml2Request saml2request2 = new Saml2Request(null, "a14dff5a-06da-495d-a3ae-159d248e6e74", null,
                                                          "eb3e43c4-48b3-4ff5-b369-6236293e510f",
                                                          "5c0691f7-e584-4109-8695-d78389505a3c",
                                                          "9aa3b343-991f-4bde-80a1-811febd6e523");
            assertNotNull(saml2request1);
            assertNotNull(saml2request2);
            assertNotSame(saml2request2, saml2request1);
            assertEquals(saml2request2, saml2request1);
            assertEquals(saml2request2.hashCode(), saml2request1.hashCode());
            int hashCode = saml2request1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, saml2request1.hashCode());
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
        Saml2Request saml2request = new Saml2Request(null, "40982622-0693-4a46-80ea-2370be5ab66c", null,
                                                     "3cdaaa20-55c6-4c97-9f06-1948e178ce3c",
                                                     "b55e8827-d5b0-4062-9acf-2dd880153610",
                                                     "b774a74d-a9da-4f11-9b4a-3cd33440ab3c");
        assertTrue(saml2request.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Saml2Request saml2request1 = new Saml2Request(null, "ae0d69b8-3955-4d38-8b91-f8a9204289cf", null,
                                                          "a4a7b757-2b2a-44bf-a07b-692efe0e7cc1",
                                                          "aa86d6ed-c66e-492b-9a09-bc32d85263e5",
                                                          "0c259377-6fad-4d82-bee2-cf406e563503");
            Saml2Request saml2request2 = new Saml2Request(null, "ae0d69b8-3955-4d38-8b91-f8a9204289cf", null,
                                                          "a4a7b757-2b2a-44bf-a07b-692efe0e7cc1",
                                                          "aa86d6ed-c66e-492b-9a09-bc32d85263e5",
                                                          "0c259377-6fad-4d82-bee2-cf406e563503");
            Saml2Request saml2request3 = new Saml2Request(null, "11c20d59-f515-4acc-b215-960fc776ceb5", null,
                                                          "07946441-50f7-4de7-99d1-d44ac830f75e",
                                                          "d1fe583f-8881-4627-9a4e-9a8349acf08b",
                                                          "9da6a8fc-63ec-4c36-8ed4-1ee6d208058a");
            assertNotNull(saml2request1);
            assertNotNull(saml2request2);
            assertNotNull(saml2request3);
            assertNotSame(saml2request2, saml2request1);
            assertNotSame(saml2request3, saml2request1);
            assertEquals(saml2request2, saml2request1);
            assertEquals(saml2request2, saml2request1);
            assertEquals(saml2request1, saml2request2);
            assertEquals(saml2request1, saml2request1);
            assertFalse(saml2request1.equals(null));
            assertNotEquals(saml2request3, saml2request1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

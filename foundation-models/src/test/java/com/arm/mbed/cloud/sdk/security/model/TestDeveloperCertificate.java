// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

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
        DeveloperCertificate developercertificate1 = new DeveloperCertificate("0310dcf4-ed2f-47fb-a924-0cb45a3d23fa",
                                                                              "4560bb21-c3a1-4b5c-a54c-23020cf393b1",
                                                                              new java.util.Date(1545929352461L),
                                                                              "dd16f81e-32df-4441-a761-b17c6ae95653",
                                                                              "def241d5-3196-4a40-8100-066a48d314be",
                                                                              "b4d3c0f0-4dc1-4ca4-88a4-47eeef1d62bc",
                                                                              "ed84b6be-08ad-4c45-9590-cc8fb0304758",
                                                                              "0a2cdf61-6a11-4371-9ad0-4ae51d49a4e4");
        DeveloperCertificate developercertificate2 = developercertificate1.clone();
        assertNotNull(developercertificate1);
        assertNotNull(developercertificate2);
        assertNotSame(developercertificate2, developercertificate1);
        assertEquals(developercertificate2, developercertificate1);
    }

    /**
     * Tests the isvalid method.
     */
    @Test
    public void testIsvalid() {
        DeveloperCertificate developercertificate = new DeveloperCertificate("9e13734e-ad6e-4056-acf1-c44bab885f4e",
                                                                             "eb07d071-317e-4496-ba06-9802eaa1e47f",
                                                                             new java.util.Date(1545929353476L),
                                                                             "1c92e4d8-ff8a-41ee-9c42-82117ec09a67",
                                                                             "60982dc3-c5bd-4a39-aac7-1fbc6167718d",
                                                                             "0223d302-d888-4c51-b338-9b428768043f",
                                                                             "207a5391-d937-4acf-be27-3f7cd736bea7",
                                                                             "f7fb79cc-dc29-49f7-89c1-80288b08f7ee");
        assertTrue(developercertificate.isValid());
    }

    /**
     * Tests the hashcode method.
     */
    @Test
    public void testHashcode() {
        DeveloperCertificate developercertificate1 = new DeveloperCertificate("3775a1f4-981a-464b-a5e8-c729a6770dc7",
                                                                              "b6cf9d9d-227f-48fc-9d7a-3d3ccd93bc30",
                                                                              new java.util.Date(1545929359336L),
                                                                              "021e4f39-0e43-4a26-b774-4c159ba141ae",
                                                                              "e3ca0563-9039-44b3-bf59-735f3a45c345",
                                                                              "cc108640-3c3a-414f-9099-d258be46530f",
                                                                              "3dc4ef4a-f7b7-4799-8b8a-60372058bd46",
                                                                              "38f6a451-c417-4c99-bdfd-62919ff23659");
        DeveloperCertificate developercertificate2 = new DeveloperCertificate("3775a1f4-981a-464b-a5e8-c729a6770dc7",
                                                                              "b6cf9d9d-227f-48fc-9d7a-3d3ccd93bc30",
                                                                              new java.util.Date(1545929359336L),
                                                                              "021e4f39-0e43-4a26-b774-4c159ba141ae",
                                                                              "e3ca0563-9039-44b3-bf59-735f3a45c345",
                                                                              "cc108640-3c3a-414f-9099-d258be46530f",
                                                                              "3dc4ef4a-f7b7-4799-8b8a-60372058bd46",
                                                                              "38f6a451-c417-4c99-bdfd-62919ff23659");
        assertNotNull(developercertificate1);
        assertNotNull(developercertificate2);
        assertNotSame(developercertificate2, developercertificate1);
        assertEquals(developercertificate2, developercertificate1);
        assertEquals(developercertificate2.hashCode(), developercertificate1.hashCode());
        int hashCode = developercertificate1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, developercertificate1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        DeveloperCertificate developercertificate1 = new DeveloperCertificate("54c18aea-01ab-4778-9c0e-41f8a05df95c",
                                                                              "02360d4f-4355-4ff0-b954-3b330063aa6a",
                                                                              new java.util.Date(1545929357253L),
                                                                              "2f1b1f3e-5dc3-4018-8ee8-a2c289a1eb2c",
                                                                              "c6b80f44-ca67-4b87-b19d-66350e52803a",
                                                                              "41ec8650-939f-43bf-85cb-107a688c6026",
                                                                              "17414033-78de-4a09-a904-6c1e73942c2b",
                                                                              "aabc8b49-0603-4aa0-b874-73c784e0f15f");
        DeveloperCertificate developercertificate2 = new DeveloperCertificate("54c18aea-01ab-4778-9c0e-41f8a05df95c",
                                                                              "02360d4f-4355-4ff0-b954-3b330063aa6a",
                                                                              new java.util.Date(1545929357253L),
                                                                              "2f1b1f3e-5dc3-4018-8ee8-a2c289a1eb2c",
                                                                              "c6b80f44-ca67-4b87-b19d-66350e52803a",
                                                                              "41ec8650-939f-43bf-85cb-107a688c6026",
                                                                              "17414033-78de-4a09-a904-6c1e73942c2b",
                                                                              "aabc8b49-0603-4aa0-b874-73c784e0f15f");
        DeveloperCertificate developercertificate3 = new DeveloperCertificate("2b1942dc-d60d-4f0a-9926-54aef3483a73",
                                                                              "88773c4c-1a6e-43a6-b7d8-2473838f8058",
                                                                              new java.util.Date(1545929350858L),
                                                                              "bf27b9c7-07be-44c3-9e30-386ef9e9f5c5",
                                                                              "9351af85-6442-4df7-a80c-7ce22e53afe5",
                                                                              "88e48a00-0e58-4e29-a993-3360ad701501",
                                                                              "30aed74a-2f49-4435-baa3-34a5b0111f6c",
                                                                              "851f48ea-abb3-48c8-a283-283f83d6078c");
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
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model VerificationResponse.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestVerificationResponse {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            VerificationResponse verificationresponse1 = new VerificationResponse("c5b727ff-69dc-4dbc-8301-e29c9d7b1204",
                                                                                  false);
            VerificationResponse verificationresponse2 = verificationresponse1.clone();
            assertNotNull(verificationresponse1);
            assertNotNull(verificationresponse2);
            assertNotSame(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
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
            VerificationResponse verificationresponse1 = new VerificationResponse("2c74d646-cf0a-4d0d-802e-79328ae03104",
                                                                                  true);
            VerificationResponse verificationresponse2 = new VerificationResponse("2c74d646-cf0a-4d0d-802e-79328ae03104",
                                                                                  true);
            assertNotNull(verificationresponse1);
            assertNotNull(verificationresponse2);
            assertNotSame(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2.hashCode(), verificationresponse1.hashCode());
            int hashCode = verificationresponse1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, verificationresponse1.hashCode());
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
        VerificationResponse verificationresponse = new VerificationResponse("b5cbb117-dd9f-48f0-a2e9-fe21e6d05716",
                                                                             false);
        assertTrue(verificationresponse.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            VerificationResponse verificationresponse1 = new VerificationResponse("7f47fa17-75e0-4a47-8a9a-017dce77ae05",
                                                                                  true);
            VerificationResponse verificationresponse2 = new VerificationResponse("7f47fa17-75e0-4a47-8a9a-017dce77ae05",
                                                                                  true);
            VerificationResponse verificationresponse3 = new VerificationResponse("e8f15ba9-e9ae-46bd-85ce-44e0e7b8ec98",
                                                                                  true);
            assertNotNull(verificationresponse1);
            assertNotNull(verificationresponse2);
            assertNotNull(verificationresponse3);
            assertNotSame(verificationresponse2, verificationresponse1);
            assertNotSame(verificationresponse3, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse2, verificationresponse1);
            assertEquals(verificationresponse1, verificationresponse2);
            assertEquals(verificationresponse1, verificationresponse1);
            assertFalse(verificationresponse1.equals(null));
            assertNotEquals(verificationresponse3, verificationresponse1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model LoginHistory.
 */
public class TestLoginHistory {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1547159628810L),
                                                          "7542ac31-dd4e-4989-be8a-4409cf834cbd", true,
                                                          "779597fb-3521-4d38-a51f-be5500d1a7cb");
            LoginHistory loginhistory2 = loginhistory1.clone();
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotSame(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
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
            LoginHistory loginhistory1 = new LoginHistory(new Date(1547159623661L),
                                                          "5f2b7029-aa78-4d6a-9309-00475b0856b3", false,
                                                          "b85ec9c0-0d9a-4aed-ac21-d44dfe1aafb4");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1547159623661L),
                                                          "5f2b7029-aa78-4d6a-9309-00475b0856b3", false,
                                                          "b85ec9c0-0d9a-4aed-ac21-d44dfe1aafb4");
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotSame(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory2.hashCode(), loginhistory1.hashCode());
            int hashCode = loginhistory1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, loginhistory1.hashCode());
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
        LoginHistory loginhistory = new LoginHistory(new Date(1547159625771L), "7d05df34-2be2-4cd8-a121-27704373af55",
                                                     false, "11a13190-3aaa-41cc-a45b-3596bcb38686");
        assertTrue(loginhistory.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1547159626940L),
                                                          "c60fbd26-f86e-4434-9b7e-fb9f75791645", true,
                                                          "267f9cef-3afe-4c23-8c35-9e288bdf497e");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1547159626940L),
                                                          "c60fbd26-f86e-4434-9b7e-fb9f75791645", true,
                                                          "267f9cef-3afe-4c23-8c35-9e288bdf497e");
            LoginHistory loginhistory3 = new LoginHistory(new Date(1547159629073L),
                                                          "33614af2-47ad-43b7-ba32-a1832a3124b3", true,
                                                          "afd29a18-ab3c-4cd2-ad1c-06e8e72e50ab");
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotNull(loginhistory3);
            assertNotSame(loginhistory2, loginhistory1);
            assertNotSame(loginhistory3, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory1, loginhistory2);
            assertEquals(loginhistory1, loginhistory1);
            assertFalse(loginhistory1.equals(null));
            assertNotEquals(loginhistory3, loginhistory1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

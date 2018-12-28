// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

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
        LoginHistory loginhistory1 = new LoginHistory(new java.util.Date(1546003508508L),
                                                      "7079ca9d-c9b3-4653-9bc1-9808c0cbf359", false,
                                                      "4999b3ac-d656-4887-a6b1-f1dc36ca8417");
        LoginHistory loginhistory2 = loginhistory1.clone();
        assertNotNull(loginhistory1);
        assertNotNull(loginhistory2);
        assertNotSame(loginhistory2, loginhistory1);
        assertEquals(loginhistory2, loginhistory1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        LoginHistory loginhistory = new LoginHistory(new java.util.Date(1546003514816L),
                                                     "6dd0f77b-698b-4ff5-8554-f8ce9ce15169", false,
                                                     "4b815615-8db0-40bc-9301-6010404bcbf9");
        assertTrue(loginhistory.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        LoginHistory loginhistory1 = new LoginHistory(new java.util.Date(1546003515886L),
                                                      "185670b7-d730-483e-a9de-09a2700e4ee4", false,
                                                      "4a4e6e76-4798-4250-98f1-85f30b3b11ae");
        LoginHistory loginhistory2 = new LoginHistory(new java.util.Date(1546003515886L),
                                                      "185670b7-d730-483e-a9de-09a2700e4ee4", false,
                                                      "4a4e6e76-4798-4250-98f1-85f30b3b11ae");
        assertNotNull(loginhistory1);
        assertNotNull(loginhistory2);
        assertNotSame(loginhistory2, loginhistory1);
        assertEquals(loginhistory2, loginhistory1);
        assertEquals(loginhistory2.hashCode(), loginhistory1.hashCode());
        int hashCode = loginhistory1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, loginhistory1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        LoginHistory loginhistory1 = new LoginHistory(new java.util.Date(1546003515879L),
                                                      "bd175ef6-534c-472b-b106-16169d85f9d0", true,
                                                      "f2f93847-80d0-4d46-9187-0490d1744c6b");
        LoginHistory loginhistory2 = new LoginHistory(new java.util.Date(1546003515879L),
                                                      "bd175ef6-534c-472b-b106-16169d85f9d0", true,
                                                      "f2f93847-80d0-4d46-9187-0490d1744c6b");
        LoginHistory loginhistory3 = new LoginHistory(new java.util.Date(1546003511866L),
                                                      "fa8612fa-e006-4b6a-81a8-7029deae4ff5", true,
                                                      "e604f490-fb68-4028-a966-1e35b250ef8b");
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
    }
}

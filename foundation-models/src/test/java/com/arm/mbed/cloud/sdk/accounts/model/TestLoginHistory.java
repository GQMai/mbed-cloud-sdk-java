// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model LoginHistory.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLoginHistory {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1561379515368L),
                                                          "71bcf222-1131-413d-9182-df56eddb456a", true,
                                                          "ccd3a9d1-82d0-4e14-baca-7cd232362d37");
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
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1561379517322L),
                                                          "d45da150-a904-40ae-9323-69d79e33f808", true,
                                                          "7c94a276-f6f3-4a62-b52f-3f9f491ded11");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1561379517322L),
                                                          "d45da150-a904-40ae-9323-69d79e33f808", true,
                                                          "7c94a276-f6f3-4a62-b52f-3f9f491ded11");
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
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        LoginHistory loginhistory = new LoginHistory(new Date(1561379516796L), "bf7eeb21-e785-4313-beb0-e3e02a764343",
                                                     true, "542f7379-3f93-4f26-a5d3-d3de386eba8a");
        assertTrue(loginhistory.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1561379511865L),
                                                          "38aef083-581d-4e30-832b-a5f8120d3551", false,
                                                          "e6f2d0e3-229c-4b57-833d-d32423bd581d");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1561379511865L),
                                                          "38aef083-581d-4e30-832b-a5f8120d3551", false,
                                                          "e6f2d0e3-229c-4b57-833d-d32423bd581d");
            LoginHistory loginhistory3 = new LoginHistory(new Date(1561379514910L),
                                                          "409692de-b1cb-45a5-a95f-73eea9ad7d2c", false,
                                                          "fff956f1-1fac-4e56-b5d5-aa56a668ca27");
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

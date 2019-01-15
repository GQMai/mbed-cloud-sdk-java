// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ServerCredentials.
 */
public class TestServerCredentials {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1547573357330L),
                                                                         "cde750fd-8031-4d50-a8b6-f31d62f7fa8d",
                                                                         "b508f6da-96cd-4a33-aff9-1c66bdeb5b3f",
                                                                         "6f4c53f1-f36c-4b49-9349-2c0f71a29366");
            ServerCredentials servercredentials2 = servercredentials1.clone();
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotSame(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
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
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1547573361773L),
                                                                         "b56217e5-11ff-47ec-b24f-0c070eee4893",
                                                                         "9dab5f31-5040-4a44-a037-eb3772697878",
                                                                         "f7343718-66c6-4007-a793-df7a16b767dc");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1547573361773L),
                                                                         "b56217e5-11ff-47ec-b24f-0c070eee4893",
                                                                         "9dab5f31-5040-4a44-a037-eb3772697878",
                                                                         "f7343718-66c6-4007-a793-df7a16b767dc");
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotSame(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials2.hashCode(), servercredentials1.hashCode());
            int hashCode = servercredentials1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, servercredentials1.hashCode());
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
        ServerCredentials servercredentials = new ServerCredentials(new Date(1547573356187L),
                                                                    "b20aaa4d-ec2a-4247-9aae-a55b4fce8b7b",
                                                                    "df3f0e36-a36e-4f65-85c9-896fa9cb5a80",
                                                                    "2005153e-25f9-42af-baa0-7c587f6947cc");
        assertTrue(servercredentials.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1547573365260L),
                                                                         "548455e4-8178-43f3-9597-c24568a27b49",
                                                                         "b1d1b74b-c462-4710-a91a-1fb027c0032c",
                                                                         "5f92a7ce-3b1d-47e0-9227-1c476ec24e01");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1547573365260L),
                                                                         "548455e4-8178-43f3-9597-c24568a27b49",
                                                                         "b1d1b74b-c462-4710-a91a-1fb027c0032c",
                                                                         "5f92a7ce-3b1d-47e0-9227-1c476ec24e01");
            ServerCredentials servercredentials3 = new ServerCredentials(new Date(1547573359711L),
                                                                         "e9731e0a-0f65-4077-8c31-d8c0c73dc3ee",
                                                                         "632a0ede-cd8e-42e4-ad1b-29138f9b8748",
                                                                         "e8ae6d76-97ac-4913-a644-bb26b13b45f6");
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotNull(servercredentials3);
            assertNotSame(servercredentials2, servercredentials1);
            assertNotSame(servercredentials3, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials1, servercredentials2);
            assertEquals(servercredentials1, servercredentials1);
            assertFalse(servercredentials1.equals(null));
            assertNotEquals(servercredentials3, servercredentials1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

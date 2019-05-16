// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ActiveSession.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestActiveSession {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ActiveSession activesession1 = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                             "bcbeb635-51c7-4e84-bcd1-c2071db452eb",
                                                             new Date(1557969569880L),
                                                             "d0febb25-c97d-406c-bfc5-05ea1e9d79e2",
                                                             "f5925eb1-a9e0-42df-a6b2-7d277287e5ea");
            ActiveSession activesession2 = activesession1.clone();
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
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
            ActiveSession activesession1 = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                             "77578e59-06fc-4aea-84d6-ac651cfa90f2",
                                                             new Date(1557969578010L),
                                                             "1e1e4cff-6abf-4e81-a518-d5c365e03c91",
                                                             "e87386a5-4e9b-4fab-8b76-ed5819434e3f");
            ActiveSession activesession2 = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                             "77578e59-06fc-4aea-84d6-ac651cfa90f2",
                                                             new Date(1557969578010L),
                                                             "1e1e4cff-6abf-4e81-a518-d5c365e03c91",
                                                             "e87386a5-4e9b-4fab-8b76-ed5819434e3f");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2.hashCode(), activesession1.hashCode());
            int hashCode = activesession1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, activesession1.hashCode());
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
        ActiveSession activesession = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                        "d28418ce-9ab3-4006-83a1-86600c53e1c9",
                                                        new Date(1557969570078L),
                                                        "1852ec8b-4860-409f-8f7b-7d707be180c1",
                                                        "ae9c185b-3e02-4d98-844e-89fa01218d6c");
        assertTrue(activesession.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ActiveSession activesession1 = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                             "42e3dab4-fb34-4f37-80c7-04828fd1f734",
                                                             new Date(1557969572169L),
                                                             "73005927-d8e0-41a8-8f94-bc722487090a",
                                                             "2e6e61ab-e895-4df9-a1ea-dc21c6446a98");
            ActiveSession activesession2 = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                             "42e3dab4-fb34-4f37-80c7-04828fd1f734",
                                                             new Date(1557969572169L),
                                                             "73005927-d8e0-41a8-8f94-bc722487090a",
                                                             "2e6e61ab-e895-4df9-a1ea-dc21c6446a98");
            ActiveSession activesession3 = new ActiveSession("bc05f908d0c49f1d35eb7cbe17ca2cb5",
                                                             "25ba9f95-bba4-412c-9b09-a2932496408c",
                                                             new Date(1557969571703L),
                                                             "8ec9daed-4552-49f5-8e6c-b310eb6ab2d3",
                                                             "47d5a4be-a5e1-42fc-860b-eabce1af4898");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotNull(activesession3);
            assertNotSame(activesession2, activesession1);
            assertNotSame(activesession3, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession1, activesession2);
            assertEquals(activesession1, activesession1);
            assertFalse(activesession1.equals(null));
            assertNotEquals(activesession3, activesession1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
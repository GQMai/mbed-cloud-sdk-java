// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model Policy.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPolicy {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Policy policy1 = new Policy("1cfc5f0e-6e9b-4ceb-b53f-738b986d323b", true,
                                        "a385f40c-b10a-4226-af5a-08f1c967d8fa", true,
                                        "8b38cbc4-2090-4874-8a83-12d7c153a0e1");
            Policy policy2 = policy1.clone();
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotSame(policy2, policy1);
            assertEquals(policy2, policy1);
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
            Policy policy1 = new Policy("de0f6a89-22f2-495b-a0df-e690cc46ca6f", false,
                                        "2be7de87-01f5-45d5-a97f-998fc8686582", true,
                                        "9743ecb0-baca-49e9-a2ae-d314acab45e5");
            Policy policy2 = new Policy("de0f6a89-22f2-495b-a0df-e690cc46ca6f", false,
                                        "2be7de87-01f5-45d5-a97f-998fc8686582", true,
                                        "9743ecb0-baca-49e9-a2ae-d314acab45e5");
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotSame(policy2, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy2.hashCode(), policy1.hashCode());
            int hashCode = policy1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, policy1.hashCode());
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
        Policy policy = new Policy("e570adbd-7cbb-4980-8caf-6a2f3be9488a", false,
                                   "b122dfcd-caee-44eb-801f-0a4d63ccb01d", true,
                                   "dc20fb29-d224-46f4-8399-bef1d0e0a7d3");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("17c22496-3be0-4c8f-ae52-4e70d11d8ec7", true,
                                        "de6aedb6-e935-48ca-ad9b-7da5bd8b4190", false,
                                        "11c063dd-4e7e-4287-a912-485d6e05f721");
            Policy policy2 = new Policy("17c22496-3be0-4c8f-ae52-4e70d11d8ec7", true,
                                        "de6aedb6-e935-48ca-ad9b-7da5bd8b4190", false,
                                        "11c063dd-4e7e-4287-a912-485d6e05f721");
            Policy policy3 = new Policy("d80852af-2846-4b4d-a0fd-f64082dc4889", true,
                                        "16a8188a-a96b-4d81-bcff-38ef981912dc", false,
                                        "4e3a6f1d-7e06-4282-9961-5817ec391a53");
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotNull(policy3);
            assertNotSame(policy2, policy1);
            assertNotSame(policy3, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy1, policy2);
            assertEquals(policy1, policy1);
            assertFalse(policy1.equals(null));
            assertNotEquals(policy3, policy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

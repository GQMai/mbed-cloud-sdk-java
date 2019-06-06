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
            Policy policy1 = new Policy("ddabcadb-b804-47a0-b61a-e59434aa9ea6", true,
                                        "b9a7bd94-5ed0-4e03-bdfd-0927a842d3e0", true,
                                        "b43dfafe-e143-47d4-8d2f-6b01ae40b9ef");
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
            Policy policy1 = new Policy("1dc7a59a-330a-4ee2-a1d2-075d450243cd", false,
                                        "6af051a9-cc42-4d06-870a-01a34176466f", true,
                                        "80ad6439-ce3a-43f7-910e-117f84f3a269");
            Policy policy2 = new Policy("1dc7a59a-330a-4ee2-a1d2-075d450243cd", false,
                                        "6af051a9-cc42-4d06-870a-01a34176466f", true,
                                        "80ad6439-ce3a-43f7-910e-117f84f3a269");
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
        Policy policy = new Policy("148b4d1d-0793-462f-bc0f-748ae0f04fbd", false,
                                   "58e047e9-a1b9-43ce-9eb0-c7b7c2b9889b", true,
                                   "4a120994-66ed-4c49-8c22-d24c46f69024");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("e906e586-ede2-42ac-bc4b-8175af24401e", false,
                                        "f1d97f80-afe0-49b3-851a-425460b1b296", false,
                                        "8e7f8191-57ab-462a-a904-74f8cd2e8fa2");
            Policy policy2 = new Policy("e906e586-ede2-42ac-bc4b-8175af24401e", false,
                                        "f1d97f80-afe0-49b3-851a-425460b1b296", false,
                                        "8e7f8191-57ab-462a-a904-74f8cd2e8fa2");
            Policy policy3 = new Policy("e7ecba6d-21df-47fb-963c-3631f8027d83", false,
                                        "5dfe4e82-cde2-4ff2-97cb-c5e635c7c4d8", false,
                                        "22adf7a9-87fc-4ec9-a5ae-f936db907006");
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

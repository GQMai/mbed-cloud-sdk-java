// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model PasswordPolicy.
 */
public class TestPasswordPolicy {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        PasswordPolicy passwordpolicy1 = new PasswordPolicy("31a3b369-dc2e-4b33-ae22-0c5c307c754a");
        PasswordPolicy passwordpolicy2 = passwordpolicy1.clone();
        assertNotNull(passwordpolicy1);
        assertNotNull(passwordpolicy2);
        assertNotSame(passwordpolicy2, passwordpolicy1);
        assertEquals(passwordpolicy2, passwordpolicy1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        PasswordPolicy passwordpolicy = new PasswordPolicy("984190b1-9d64-4f9d-900c-a4adfba8338a");
        assertTrue(passwordpolicy.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        PasswordPolicy passwordpolicy1 = new PasswordPolicy("207518d1-cffa-4edf-81ea-356f038668e1");
        PasswordPolicy passwordpolicy2 = new PasswordPolicy("207518d1-cffa-4edf-81ea-356f038668e1");
        assertNotNull(passwordpolicy1);
        assertNotNull(passwordpolicy2);
        assertNotSame(passwordpolicy2, passwordpolicy1);
        assertEquals(passwordpolicy2, passwordpolicy1);
        assertEquals(passwordpolicy2.hashCode(), passwordpolicy1.hashCode());
        int hashCode = passwordpolicy1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, passwordpolicy1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        PasswordPolicy passwordpolicy1 = new PasswordPolicy("6006b727-3925-4c7d-9250-020e7e05d8a7");
        PasswordPolicy passwordpolicy2 = new PasswordPolicy("6006b727-3925-4c7d-9250-020e7e05d8a7");
        PasswordPolicy passwordpolicy3 = new PasswordPolicy("c3b7dac3-49eb-404c-afe4-8be01fa5d577");
        assertNotNull(passwordpolicy1);
        assertNotNull(passwordpolicy2);
        assertNotNull(passwordpolicy3);
        assertNotSame(passwordpolicy2, passwordpolicy1);
        assertNotSame(passwordpolicy3, passwordpolicy1);
        assertEquals(passwordpolicy2, passwordpolicy1);
        assertEquals(passwordpolicy2, passwordpolicy1);
        assertEquals(passwordpolicy1, passwordpolicy2);
        assertEquals(passwordpolicy1, passwordpolicy1);
        assertFalse(passwordpolicy1.equals(null));
        assertNotEquals(passwordpolicy3, passwordpolicy1);
    }
}

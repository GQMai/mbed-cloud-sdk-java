// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model ApiKeyDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestApiKeyDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ApiKeyDao apikeydao1 = new ApiKeyDao();
            ApiKeyDao apikeydao2 = apikeydao1.clone();
            assertNotNull(apikeydao1);
            assertNotNull(apikeydao2);
            assertNotSame(apikeydao2, apikeydao1);
            assertEquals(apikeydao2, apikeydao1);
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
            ApiKeyDao apikeydao1 = new ApiKeyDao();
            ApiKeyDao apikeydao2 = new ApiKeyDao();
            assertNotNull(apikeydao1);
            assertNotNull(apikeydao2);
            assertNotSame(apikeydao2, apikeydao1);
            assertEquals(apikeydao2, apikeydao1);
            assertEquals(apikeydao2.hashCode(), apikeydao1.hashCode());
            int hashCode = apikeydao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikeydao1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ApiKeyDao apikeydao1 = new ApiKeyDao();
            ApiKeyDao apikeydao2 = new ApiKeyDao();
            assertNotNull(apikeydao1);
            assertNotNull(apikeydao2);
            assertNotSame(apikeydao2, apikeydao1);
            assertEquals(apikeydao2, apikeydao1);
            assertEquals(apikeydao2, apikeydao1);
            assertEquals(apikeydao1, apikeydao2);
            assertEquals(apikeydao1, apikeydao1);
            assertFalse(apikeydao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

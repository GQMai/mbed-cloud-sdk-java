// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model ApiKeyStatus.
 */
public class TestApiKeyStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetvalue() {
        ApiKeyStatus apikeystatus = ApiKeyStatus.getValue(null);
        assertNotNull(apikeystatus);
        assertTrue(apikeystatus.isDefault());
        apikeystatus = ApiKeyStatus.getValue(ApiKeyStatus.getDefault().getString());
        assertNotNull(apikeystatus);
        assertTrue(apikeystatus.isDefault());
        apikeystatus = ApiKeyStatus.getValue("ACTIVE");
        assertNotNull(apikeystatus);
        assertTrue(apikeystatus.isDefault());
        apikeystatus = ApiKeyStatus.getValue("INACTIVE");
        assertNotNull(apikeystatus);
        assertFalse(apikeystatus.isDefault());
        apikeystatus = ApiKeyStatus.getValue("e4054b72-82d9-4045-8d69-b85bc5c77a3d");
        assertNotNull(apikeystatus);
        assertTrue(apikeystatus.isDefault());
    }
}

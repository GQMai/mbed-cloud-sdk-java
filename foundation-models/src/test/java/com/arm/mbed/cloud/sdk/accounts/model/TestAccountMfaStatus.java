// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model AccountMfaStatus.
 */
public class TestAccountMfaStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetvalue() {
        AccountMfaStatus accountmfastatus = AccountMfaStatus.getValue(null);
        assertNotNull(accountmfastatus);
        assertTrue(accountmfastatus.isDefault());
        accountmfastatus = AccountMfaStatus.getValue(AccountMfaStatus.getDefault().getString());
        assertNotNull(accountmfastatus);
        assertTrue(accountmfastatus.isDefault());
        accountmfastatus = AccountMfaStatus.getValue("ENFORCED");
        assertNotNull(accountmfastatus);
        assertTrue(accountmfastatus.isDefault());
        accountmfastatus = AccountMfaStatus.getValue("optional");
        assertNotNull(accountmfastatus);
        assertFalse(accountmfastatus.isDefault());
        accountmfastatus = AccountMfaStatus.getValue("545935e2-3a75-41ba-b1ab-5e21c54aa35d");
        assertNotNull(accountmfastatus);
        assertTrue(accountmfastatus.isDefault());
    }
}

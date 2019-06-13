// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkCreateStatus.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentBulkCreateStatus {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DeviceEnrollmentBulkCreateStatus deviceenrollmentbulkcreatestatus = DeviceEnrollmentBulkCreateStatus.getValue(null);
            assertNotNull(deviceenrollmentbulkcreatestatus);
            assertTrue(deviceenrollmentbulkcreatestatus.isDefault());
            deviceenrollmentbulkcreatestatus = DeviceEnrollmentBulkCreateStatus.getValue(DeviceEnrollmentBulkCreateStatus.getDefault()
                                                                                                                         .getString());
            assertNotNull(deviceenrollmentbulkcreatestatus);
            assertTrue(deviceenrollmentbulkcreatestatus.isDefault());
            deviceenrollmentbulkcreatestatus = DeviceEnrollmentBulkCreateStatus.getValue("COMPLETED");
            assertNotNull(deviceenrollmentbulkcreatestatus);
            assertTrue(deviceenrollmentbulkcreatestatus.isDefault());
            deviceenrollmentbulkcreatestatus = DeviceEnrollmentBulkCreateStatus.getValue("new");
            assertNotNull(deviceenrollmentbulkcreatestatus);
            assertFalse(deviceenrollmentbulkcreatestatus.isDefault());
            deviceenrollmentbulkcreatestatus = DeviceEnrollmentBulkCreateStatus.getValue("421112ff-a918-48c4-af7e-856c07cf9a32");
            assertNotNull(deviceenrollmentbulkcreatestatus);
            assertTrue(deviceenrollmentbulkcreatestatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

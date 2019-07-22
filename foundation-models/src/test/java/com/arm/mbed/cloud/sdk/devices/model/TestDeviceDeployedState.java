// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceDeployedState.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceDeployedState {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            DeviceDeployedState devicedeployedstate = DeviceDeployedState.getValue(null);
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue(DeviceDeployedState.getDefault().getString());
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue("DEVELOPMENT");
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue("production");
            assertNotNull(devicedeployedstate);
            assertFalse(devicedeployedstate.isDefault());
            devicedeployedstate = DeviceDeployedState.getValue("91d9bf67-0da9-4e22-8fa8-bd4990824ce7");
            assertNotNull(devicedeployedstate);
            assertTrue(devicedeployedstate.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

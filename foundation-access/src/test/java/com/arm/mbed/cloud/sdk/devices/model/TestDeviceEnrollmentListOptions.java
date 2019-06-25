// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(48),
                                                                                                       Long.valueOf(25),
                                                                                                       Order.getDefault(),
                                                                                                       "6c9d33d3-eb38-4ff8-a55c-230eeafaa8a9",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = deviceenrollmentlistoptions1.clone();
            assertNotNull(deviceenrollmentlistoptions1);
            assertNotNull(deviceenrollmentlistoptions2);
            assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
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
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(31),
                                                                                                       Long.valueOf(105),
                                                                                                       Order.getDefault(),
                                                                                                       "b3cd154f-aef1-45d5-bb1c-65add0eb41f0",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(Integer.valueOf(31),
                                                                                                       Long.valueOf(105),
                                                                                                       Order.getDefault(),
                                                                                                       "b3cd154f-aef1-45d5-bb1c-65add0eb41f0",
                                                                                                       null, null);
            assertNotNull(deviceenrollmentlistoptions1);
            assertNotNull(deviceenrollmentlistoptions2);
            assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2.hashCode(), deviceenrollmentlistoptions1.hashCode());
            int hashCode = deviceenrollmentlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentlistoptions1.hashCode());
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
            DeviceEnrollmentListOptions deviceenrollmentlistoptions1 = new DeviceEnrollmentListOptions(Integer.valueOf(-80),
                                                                                                       Long.valueOf(17),
                                                                                                       Order.getDefault(),
                                                                                                       "e18e995c-deb5-4ee2-afc1-d6e6be51d464",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions2 = new DeviceEnrollmentListOptions(Integer.valueOf(-80),
                                                                                                       Long.valueOf(17),
                                                                                                       Order.getDefault(),
                                                                                                       "e18e995c-deb5-4ee2-afc1-d6e6be51d464",
                                                                                                       null, null);
            DeviceEnrollmentListOptions deviceenrollmentlistoptions3 = new DeviceEnrollmentListOptions(Integer.valueOf(-91),
                                                                                                       Long.valueOf(64),
                                                                                                       Order.getDefault(),
                                                                                                       "2c177eb9-72ac-4298-b8be-64f5538e3bd3",
                                                                                                       null, null);
            assertNotNull(deviceenrollmentlistoptions1);
            assertNotNull(deviceenrollmentlistoptions2);
            assertNotNull(deviceenrollmentlistoptions3);
            assertNotSame(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertNotSame(deviceenrollmentlistoptions3, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions2, deviceenrollmentlistoptions1);
            assertEquals(deviceenrollmentlistoptions1, deviceenrollmentlistoptions2);
            assertEquals(deviceenrollmentlistoptions1, deviceenrollmentlistoptions1);
            assertFalse(deviceenrollmentlistoptions1.equals(null));
            assertNotEquals(deviceenrollmentlistoptions3, deviceenrollmentlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

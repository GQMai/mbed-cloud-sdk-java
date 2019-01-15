// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DeviceListOptions.
 */
public class TestDeviceListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeviceListOptions devicelistoptions1 = new DeviceListOptions(Integer.valueOf(-98), Long.valueOf(-126),
                                                                         Order.getDefault(),
                                                                         "b83929fd-be70-41f9-9063-8bcd86af2278", null,
                                                                         null);
            DeviceListOptions devicelistoptions2 = devicelistoptions1.clone();
            assertNotNull(devicelistoptions1);
            assertNotNull(devicelistoptions2);
            assertNotSame(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            DeviceListOptions devicelistoptions1 = new DeviceListOptions(Integer.valueOf(89), Long.valueOf(-107),
                                                                         Order.getDefault(),
                                                                         "d1c16c92-cddc-4a12-adf2-162087bfd949", null,
                                                                         null);
            DeviceListOptions devicelistoptions2 = new DeviceListOptions(Integer.valueOf(89), Long.valueOf(-107),
                                                                         Order.getDefault(),
                                                                         "d1c16c92-cddc-4a12-adf2-162087bfd949", null,
                                                                         null);
            assertNotNull(devicelistoptions1);
            assertNotNull(devicelistoptions2);
            assertNotSame(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2.hashCode(), devicelistoptions1.hashCode());
            int hashCode = devicelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicelistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceListOptions devicelistoptions1 = new DeviceListOptions(Integer.valueOf(74), Long.valueOf(42),
                                                                         Order.getDefault(),
                                                                         "333110fd-651b-4345-a64e-6740ff2aee2d", null,
                                                                         null);
            DeviceListOptions devicelistoptions2 = new DeviceListOptions(Integer.valueOf(74), Long.valueOf(42),
                                                                         Order.getDefault(),
                                                                         "333110fd-651b-4345-a64e-6740ff2aee2d", null,
                                                                         null);
            DeviceListOptions devicelistoptions3 = new DeviceListOptions(Integer.valueOf(102), Long.valueOf(-67),
                                                                         Order.getDefault(),
                                                                         "83c4201e-7c1c-4ad4-951c-9e928b806dbe", null,
                                                                         null);
            assertNotNull(devicelistoptions1);
            assertNotNull(devicelistoptions2);
            assertNotNull(devicelistoptions3);
            assertNotSame(devicelistoptions2, devicelistoptions1);
            assertNotSame(devicelistoptions3, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions1, devicelistoptions2);
            assertEquals(devicelistoptions1, devicelistoptions1);
            assertFalse(devicelistoptions1.equals(null));
            assertNotEquals(devicelistoptions3, devicelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

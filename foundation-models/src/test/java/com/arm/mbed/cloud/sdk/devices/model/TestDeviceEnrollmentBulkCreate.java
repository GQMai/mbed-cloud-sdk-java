// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkCreate.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentBulkCreate {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("206698dc-4157-42bd-916a-3bb7877b2daa",
                                                                                                    new Date(1559835553788L),
                                                                                                    new Date(1559835552572L),
                                                                                                    84,
                                                                                                    "8d800ef6-dfae-4996-907a-6330fc9e94fb",
                                                                                                    "574f6b0d-f763-4aff-87d3-4d515a22e434",
                                                                                                    "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                                    42,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    32);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = deviceenrollmentbulkcreate1.clone();
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("2275b88c-5566-4402-a175-7a4ba54fa9c6",
                                                                                                    new Date(1559835554127L),
                                                                                                    new Date(1559835552259L),
                                                                                                    115,
                                                                                                    "e3d02906-e613-4d0a-ab65-bc2d05613bf6",
                                                                                                    "77b98d6a-3380-4c85-a228-7e5fce88b8ba",
                                                                                                    "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                                    -17,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    42);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("2275b88c-5566-4402-a175-7a4ba54fa9c6",
                                                                                                    new Date(1559835554127L),
                                                                                                    new Date(1559835552259L),
                                                                                                    115,
                                                                                                    "e3d02906-e613-4d0a-ab65-bc2d05613bf6",
                                                                                                    "77b98d6a-3380-4c85-a228-7e5fce88b8ba",
                                                                                                    "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                                    -17,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    42);
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2.hashCode(), deviceenrollmentbulkcreate1.hashCode());
            int hashCode = deviceenrollmentbulkcreate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentbulkcreate1.hashCode());
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
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("26b7ff28-bf7f-4ff6-8dd5-cbff4e95cb91",
                                                                                               new Date(1559835552457L),
                                                                                               new Date(1559835556422L),
                                                                                               -56,
                                                                                               "9a4c4ac2-2804-47df-ad0a-eed90e097a76",
                                                                                               "e805cc37-5a01-41dc-b5e3-fa8c50d1afc4",
                                                                                               "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                               -81,
                                                                                               DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               28);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("ebb41e29-acde-4578-bea6-e5e2ace28fb8",
                                                                                                      new Date(1559835550979L),
                                                                                                      new Date(1559835555272L),
                                                                                                      79,
                                                                                                      "a55de6b9-bdb7-49a8-8e81-319ef2de10b4",
                                                                                                      "517f5c47-6b5d-4b48-987b-39cd660d5dc7",
                                                                                                      "CicjC@6�?�LCUceeuCLpGM2\u001dUo\u001e]5Krl6fl2LpC@Uf4pCC缑25uLS圙2oSuCiGp<S$$",
                                                                                                      -122,
                                                                                                      DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      26);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("79a5aaba-ba7e-4cbc-b7df-7f4f0dad748c",
                                                                                                    new Date(1559835557237L),
                                                                                                    new Date(1559835553703L),
                                                                                                    63,
                                                                                                    "e179e419-f078-4154-bf28-4345ec4e4fc1",
                                                                                                    "195602d6-f7f8-472b-8edc-bad156d04a74",
                                                                                                    "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                                    78,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -13);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("79a5aaba-ba7e-4cbc-b7df-7f4f0dad748c",
                                                                                                    new Date(1559835557237L),
                                                                                                    new Date(1559835553703L),
                                                                                                    63,
                                                                                                    "e179e419-f078-4154-bf28-4345ec4e4fc1",
                                                                                                    "195602d6-f7f8-472b-8edc-bad156d04a74",
                                                                                                    "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                                    78,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -13);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("ab84430e-64f4-4f01-bd2c-2b755c109711",
                                                                                                    new Date(1559835559494L),
                                                                                                    new Date(1559835560076L),
                                                                                                    78,
                                                                                                    "5e33ea29-c76a-41c5-93cd-848a43ff5e7e",
                                                                                                    "62707871-bddc-4217-a841-daf358cbb251",
                                                                                                    "8OPw7ExvVt7TYBx8HJXVhWq3D1O8t9Im",
                                                                                                    -103,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -24);
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotNull(deviceenrollmentbulkcreate3);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertNotSame(deviceenrollmentbulkcreate3, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate1, deviceenrollmentbulkcreate2);
            assertEquals(deviceenrollmentbulkcreate1, deviceenrollmentbulkcreate1);
            assertFalse(deviceenrollmentbulkcreate1.equals(null));
            assertNotEquals(deviceenrollmentbulkcreate3, deviceenrollmentbulkcreate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

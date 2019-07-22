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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("2bfd1aef-f2da-4992-8095-da8902653209",
                                                                                                    new Date(1563781718878L),
                                                                                                    new Date(1563781716487L),
                                                                                                    -26,
                                                                                                    "b80120a6-4564-4b37-8113-736916b3f0cd",
                                                                                                    "fe65c310-906d-4860-af51-819990920ef4",
                                                                                                    "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                                    107,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    48);
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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("a43c834e-b232-4c6a-88a4-48d0a190c40f",
                                                                                                    new Date(1563781721784L),
                                                                                                    new Date(1563781717454L),
                                                                                                    -105,
                                                                                                    "421c247c-a35e-4650-a1f2-70462f2e5063",
                                                                                                    "e50c5452-e679-43e6-aeab-cdc450a89d39",
                                                                                                    "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                                    -114,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -89);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("a43c834e-b232-4c6a-88a4-48d0a190c40f",
                                                                                                    new Date(1563781721784L),
                                                                                                    new Date(1563781717454L),
                                                                                                    -105,
                                                                                                    "421c247c-a35e-4650-a1f2-70462f2e5063",
                                                                                                    "e50c5452-e679-43e6-aeab-cdc450a89d39",
                                                                                                    "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                                    -114,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -89);
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
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("49028a61-bad2-4586-9bcf-1134608c58e4",
                                                                                               new Date(1563781717359L),
                                                                                               new Date(1563781719600L),
                                                                                               2,
                                                                                               "a201fe6f-26c4-4b71-9f86-7a86b9bc040b",
                                                                                               "4e61326e-b0b3-429a-af86-c7d7b57445ed",
                                                                                               "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                               -50,
                                                                                               DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               25);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("59bd7da3-ce33-4d4b-a992-c78fd8c68c2e",
                                                                                                      new Date(1563781717462L),
                                                                                                      new Date(1563781717653L),
                                                                                                      16,
                                                                                                      "4f021b41-fc3a-47d3-94d2-4be246a63c1d",
                                                                                                      "5f63558d-ff7f-472b-af6e-6d7a524ef3f2",
                                                                                                      "DPF᧢<넸\u0007V괷MpuTg많4イPi6uFVFuF絿4QF`\u0004�?�:@VP<ḳFPFl쬒=Ci46DVF4iVuNr噯rn1Ti",
                                                                                                      34,
                                                                                                      DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      10);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("dd02efe1-1be3-4e80-b630-b8f643f74f7d",
                                                                                                    new Date(1563781720750L),
                                                                                                    new Date(1563781715619L),
                                                                                                    -9,
                                                                                                    "110b50e4-6127-4ca5-a90f-7deb7c2b13e3",
                                                                                                    "2566d7d8-d8fe-4a92-a240-a2af666e0284",
                                                                                                    "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                                    87,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    62);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("dd02efe1-1be3-4e80-b630-b8f643f74f7d",
                                                                                                    new Date(1563781720750L),
                                                                                                    new Date(1563781715619L),
                                                                                                    -9,
                                                                                                    "110b50e4-6127-4ca5-a90f-7deb7c2b13e3",
                                                                                                    "2566d7d8-d8fe-4a92-a240-a2af666e0284",
                                                                                                    "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                                    87,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    62);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("7f33deff-3806-43fd-92aa-595174c47c44",
                                                                                                    new Date(1563781722054L),
                                                                                                    new Date(1563781723889L),
                                                                                                    38,
                                                                                                    "e76052bb-1897-4228-9f03-5f86f560704b",
                                                                                                    "ea6c99b2-6b30-41ad-87bf-879acee392cc",
                                                                                                    "LSRh5B3K5893sv7tY8E9I2G7jkJ8KXHH",
                                                                                                    -15,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -69);
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

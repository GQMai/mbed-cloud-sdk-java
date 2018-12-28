// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkDelete.
 */
public class TestDeviceEnrollmentBulkDelete {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("eb5cda3f-a4e8-40b2-8e6a-c8a3cde1ea04",
                                                                                                new java.util.Date(1545996949881L),
                                                                                                new java.util.Date(1545996950408L),
                                                                                                49,
                                                                                                "ee7eeb8a-a9e8-415b-8d17-a8cdd5ca297c",
                                                                                                "072e6151-fd5b-4588-829f-ac38d62df5d4",
                                                                                                "K931I2OBoQP3tzL18RY40Bx8Pck9mPB0",
                                                                                                -62,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                -95);
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = deviceenrollmentbulkdelete1.clone();
        assertNotNull(deviceenrollmentbulkdelete1);
        assertNotNull(deviceenrollmentbulkdelete2);
        assertNotSame(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
        assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
    }

    /**
     * Tests the isvalid method.
     */
    @Test
    public void testIsvalid() {
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete = new DeviceEnrollmentBulkDelete("b8eed4aa-f263-460a-aa7c-8ec900a9b8ce",
                                                                                               new java.util.Date(1545996954653L),
                                                                                               new java.util.Date(1545996953614L),
                                                                                               43,
                                                                                               "c3e57cb8-ffc9-4ab2-8449-ed2d35e2a823",
                                                                                               "2f94c9fe-3547-43ab-af02-89868c7885d1",
                                                                                               "xp46CU94859VxO0DlnbQ9ZUW451zotHG",
                                                                                               50,
                                                                                               com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                               123);
        assertTrue(deviceenrollmentbulkdelete.isValid());
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdeleteInvalid = new DeviceEnrollmentBulkDelete("32e5f095-6fef-4f86-802e-25ba7d6470fd",
                                                                                                      new java.util.Date(1545996956557L),
                                                                                                      new java.util.Date(1545996950305L),
                                                                                                      -45,
                                                                                                      "38c71fd2-aaba-4a8a-8263-132765731c7f",
                                                                                                      "c404043b-4034-4d73-99ff-aafae876b045",
                                                                                                      "8xr掆Oeu=Xe@Ne;8hJC冶Qf@7Q3QWqOqrl<A`⩿CIHJ?㵸h8f8A3jNXJx3HIxCYnxj",
                                                                                                      59,
                                                                                                      com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                      -74);
        assertFalse(deviceenrollmentbulkdeleteInvalid.isValid());
    }

    /**
     * Tests the hashcode method.
     */
    @Test
    public void testHashcode() {
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("fed4d097-db6f-49e5-8652-4e3e53e450bd",
                                                                                                new java.util.Date(1545996953378L),
                                                                                                new java.util.Date(1545996950396L),
                                                                                                48,
                                                                                                "1a27c330-0eff-4ac2-87c7-8986e1316c6a",
                                                                                                "d88ed33b-ac7e-4a1a-a094-b30a84f14162",
                                                                                                "90M2c0j26PeE5N9U1r9joFwvmBa94rIP",
                                                                                                123,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                44);
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("fed4d097-db6f-49e5-8652-4e3e53e450bd",
                                                                                                new java.util.Date(1545996953378L),
                                                                                                new java.util.Date(1545996950396L),
                                                                                                48,
                                                                                                "1a27c330-0eff-4ac2-87c7-8986e1316c6a",
                                                                                                "d88ed33b-ac7e-4a1a-a094-b30a84f14162",
                                                                                                "90M2c0j26PeE5N9U1r9joFwvmBa94rIP",
                                                                                                123,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                44);
        assertNotNull(deviceenrollmentbulkdelete1);
        assertNotNull(deviceenrollmentbulkdelete2);
        assertNotSame(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
        assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
        assertEquals(deviceenrollmentbulkdelete2.hashCode(), deviceenrollmentbulkdelete1.hashCode());
        int hashCode = deviceenrollmentbulkdelete1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, deviceenrollmentbulkdelete1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete1 = new DeviceEnrollmentBulkDelete("d263a646-929c-4c96-bf09-c6bfa373724b",
                                                                                                new java.util.Date(1545996954627L),
                                                                                                new java.util.Date(1545996955297L),
                                                                                                -29,
                                                                                                "6947cb1d-d254-4bbf-88ab-5f5acbdd4428",
                                                                                                "9ca4f652-526e-4933-bb7c-4e4ad1a53db2",
                                                                                                "Z5nM0Jh9J8cU3z51Z40S9P1xiGvnF0s3",
                                                                                                80,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                -76);
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete2 = new DeviceEnrollmentBulkDelete("d263a646-929c-4c96-bf09-c6bfa373724b",
                                                                                                new java.util.Date(1545996954627L),
                                                                                                new java.util.Date(1545996955297L),
                                                                                                -29,
                                                                                                "6947cb1d-d254-4bbf-88ab-5f5acbdd4428",
                                                                                                "9ca4f652-526e-4933-bb7c-4e4ad1a53db2",
                                                                                                "Z5nM0Jh9J8cU3z51Z40S9P1xiGvnF0s3",
                                                                                                80,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                -76);
        DeviceEnrollmentBulkDelete deviceenrollmentbulkdelete3 = new DeviceEnrollmentBulkDelete("a0b1b8c6-5f62-471b-ab96-8ef874041571",
                                                                                                new java.util.Date(1545996949883L),
                                                                                                new java.util.Date(1545996952889L),
                                                                                                112,
                                                                                                "bf8f2429-3fed-4e6a-badf-b302eef0c0aa",
                                                                                                "1fab5d67-d0da-468f-9abb-3c8799641345",
                                                                                                "h68lM990Tv5990bv7tiJfD253BBb2lS7",
                                                                                                -105,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkDeleteStatus.getDefault(),
                                                                                                102);
        assertNotNull(deviceenrollmentbulkdelete1);
        assertNotNull(deviceenrollmentbulkdelete2);
        assertNotNull(deviceenrollmentbulkdelete3);
        assertNotSame(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
        assertNotSame(deviceenrollmentbulkdelete3, deviceenrollmentbulkdelete1);
        assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
        assertEquals(deviceenrollmentbulkdelete2, deviceenrollmentbulkdelete1);
        assertEquals(deviceenrollmentbulkdelete1, deviceenrollmentbulkdelete2);
        assertEquals(deviceenrollmentbulkdelete1, deviceenrollmentbulkdelete1);
        assertFalse(deviceenrollmentbulkdelete1.equals(null));
        assertNotEquals(deviceenrollmentbulkdelete3, deviceenrollmentbulkdelete1);
    }
}

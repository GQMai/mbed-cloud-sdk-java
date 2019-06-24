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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("aa2e64ca-3ca2-4e53-b165-d6a0f990ddba",
                                                                                                    new Date(1561379511601L),
                                                                                                    new Date(1561379517029L),
                                                                                                    22,
                                                                                                    "d728249e-f22f-4775-8611-bfd2bfa61941",
                                                                                                    "ab5a66c3-e779-4bd7-b56e-f5a1073b2f62",
                                                                                                    "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                                    -63,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    41);
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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("83a1734c-3ffa-40d3-8ea1-e5e0096cfe82",
                                                                                                    new Date(1561379520552L),
                                                                                                    new Date(1561379521419L),
                                                                                                    -128,
                                                                                                    "01e797b5-e7dc-467b-a0ec-1bb1071773db",
                                                                                                    "b48e919b-132c-4930-9e92-73d252114f7a",
                                                                                                    "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                                    -63,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    40);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("83a1734c-3ffa-40d3-8ea1-e5e0096cfe82",
                                                                                                    new Date(1561379520552L),
                                                                                                    new Date(1561379521419L),
                                                                                                    -128,
                                                                                                    "01e797b5-e7dc-467b-a0ec-1bb1071773db",
                                                                                                    "b48e919b-132c-4930-9e92-73d252114f7a",
                                                                                                    "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                                    -63,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    40);
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
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("fc07c150-45fb-4087-be35-ccd85f9b19e1",
                                                                                               new Date(1561379520562L),
                                                                                               new Date(1561379514783L),
                                                                                               0,
                                                                                               "6a2f5af2-7fed-4aec-a9eb-ac480d0600c7",
                                                                                               "12110d00-3fc9-45ae-b780-ec934e5268b5",
                                                                                               "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                               122,
                                                                                               DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               -78);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("783b4492-1c1b-4bde-97c1-46166700235b",
                                                                                                      new Date(1561379518832L),
                                                                                                      new Date(1561379516981L),
                                                                                                      -82,
                                                                                                      "d4c21d3e-61f7-4f7e-9682-9245c57f2202",
                                                                                                      "8b4c5f28-dca1-46ac-8802-97c8104d5b04",
                                                                                                      "cU=pT1挓铕juccD5p>gs]䲺.sG2FuuFIuBAc:G2Q:QJ\bXPi1upnI]r5\u0003n?Bu葪Y5p[M",
                                                                                                      -98,
                                                                                                      DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      116);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("7f0242b2-0a65-40cf-bb07-3a9d3b193edb",
                                                                                                    new Date(1561379519488L),
                                                                                                    new Date(1561379517551L),
                                                                                                    -63,
                                                                                                    "8999f0ce-4e3b-42a5-ac4e-656257a558fa",
                                                                                                    "5454f152-14ef-4c66-bffa-8cc5d67f2957",
                                                                                                    "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                                    -73,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    86);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("7f0242b2-0a65-40cf-bb07-3a9d3b193edb",
                                                                                                    new Date(1561379519488L),
                                                                                                    new Date(1561379517551L),
                                                                                                    -63,
                                                                                                    "8999f0ce-4e3b-42a5-ac4e-656257a558fa",
                                                                                                    "5454f152-14ef-4c66-bffa-8cc5d67f2957",
                                                                                                    "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                                    -73,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    86);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("d1d4e304-f1d5-4ede-8491-762eee0f91e3",
                                                                                                    new Date(1561379516233L),
                                                                                                    new Date(1561379513199L),
                                                                                                    -49,
                                                                                                    "2c8e89a4-6839-42cb-9571-4e41f70683c7",
                                                                                                    "df7a3dea-067a-457a-94f7-ed98d5558c91",
                                                                                                    "wdtC0b8Refb6e367R84H7vES03qLomV9",
                                                                                                    -57,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    88);
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

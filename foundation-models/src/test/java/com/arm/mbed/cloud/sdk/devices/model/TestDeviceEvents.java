// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEvents.
 */
public class TestDeviceEvents {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1547225901198L), null,
                                                          new Date(1547225896202L),
                                                          "2cc6f0de-74e9-48a1-8138-fd933404c436",
                                                          "d96a0efe-a8c3-4d40-a369-494a9280b8ef",
                                                          "bff726a7-33a4-461b-b2e0-0895751fce88",
                                                          "c90f013e-35f9-4bb2-8217-5cb9a2ed18fb",
                                                          "df6cb30f-b178-4422-ac79-bc976403301c",
                                                          "d41f74ea-aaf1-4690-916e-9f2f96c0b9e7", false);
            DeviceEvents deviceevents2 = deviceevents1.clone();
            assertNotNull(deviceevents1);
            assertNotNull(deviceevents2);
            assertNotSame(deviceevents2, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
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
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1547225897174L), null,
                                                          new Date(1547225900147L),
                                                          "e3d869be-bff0-4db6-a3f5-ac569acb7645",
                                                          "eb2fec98-f167-4e06-ba60-27704e09d91e",
                                                          "7af119ee-3a23-4f45-8b84-803ebc78c9c4",
                                                          "0c943961-20ff-4232-830d-661662ca3ea0",
                                                          "fa641fe2-aa00-4f4f-9fe9-02561c869983",
                                                          "a16218bd-1a5f-44d6-bd1a-06be926e7ff3", true);
            DeviceEvents deviceevents2 = new DeviceEvents(null, new Date(1547225897174L), null,
                                                          new Date(1547225900147L),
                                                          "e3d869be-bff0-4db6-a3f5-ac569acb7645",
                                                          "eb2fec98-f167-4e06-ba60-27704e09d91e",
                                                          "7af119ee-3a23-4f45-8b84-803ebc78c9c4",
                                                          "0c943961-20ff-4232-830d-661662ca3ea0",
                                                          "fa641fe2-aa00-4f4f-9fe9-02561c869983",
                                                          "a16218bd-1a5f-44d6-bd1a-06be926e7ff3", true);
            assertNotNull(deviceevents1);
            assertNotNull(deviceevents2);
            assertNotSame(deviceevents2, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
            assertEquals(deviceevents2.hashCode(), deviceevents1.hashCode());
            int hashCode = deviceevents1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceevents1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsValid() {
        DeviceEvents deviceevents = new DeviceEvents(null, new Date(1547225896641L), null, new Date(1547225897713L),
                                                     "fcc86160-463d-4822-8ef0-74c8898ac457",
                                                     "f31e7e5c-5d3e-41dd-8435-c70bc81e9434",
                                                     "06a6d211-ca30-42c7-84c0-61d788c19822",
                                                     "b91a3901-cfb0-4f44-9ff9-4f49c6ad9b72",
                                                     "f4d382a6-6349-4fa3-82ec-21520ca82cb8",
                                                     "149703bb-6978-4287-82e7-8ac512786c25", false);
        assertTrue(deviceevents.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceEvents deviceevents1 = new DeviceEvents(null, new Date(1547225900966L), null,
                                                          new Date(1547225900076L),
                                                          "7a92255a-b8db-4098-bd5d-39276ec4713b",
                                                          "0bf36d8d-a9cd-4d4f-99fe-6890ee788329",
                                                          "c1508035-2fd5-4c03-a0db-5c45b391c779",
                                                          "f37f4dae-ab41-4558-bc2d-fa2a72ac22c2",
                                                          "26068c90-26cd-40ab-9f14-d504c02c904e",
                                                          "2fa3e7d9-16ef-473a-8507-9e04bfab997f", true);
            DeviceEvents deviceevents2 = new DeviceEvents(null, new Date(1547225900966L), null,
                                                          new Date(1547225900076L),
                                                          "7a92255a-b8db-4098-bd5d-39276ec4713b",
                                                          "0bf36d8d-a9cd-4d4f-99fe-6890ee788329",
                                                          "c1508035-2fd5-4c03-a0db-5c45b391c779",
                                                          "f37f4dae-ab41-4558-bc2d-fa2a72ac22c2",
                                                          "26068c90-26cd-40ab-9f14-d504c02c904e",
                                                          "2fa3e7d9-16ef-473a-8507-9e04bfab997f", true);
            DeviceEvents deviceevents3 = new DeviceEvents(null, new Date(1547225898323L), null,
                                                          new Date(1547225898996L),
                                                          "d3d518b5-7d95-4c5d-a1b4-cb0b368ff5af",
                                                          "efe02527-4906-44bb-ac29-e6aa00ed238c",
                                                          "37a793b5-1644-45c4-a561-a35a174b5368",
                                                          "b1dd38ee-844b-48ef-85c0-d38ae0dc8fb8",
                                                          "d0e11f92-a359-4003-b64b-3e0681b12f07",
                                                          "079b6b63-0df3-4902-ab46-62c006266c08", true);
            assertNotNull(deviceevents1);
            assertNotNull(deviceevents2);
            assertNotNull(deviceevents3);
            assertNotSame(deviceevents2, deviceevents1);
            assertNotSame(deviceevents3, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
            assertEquals(deviceevents2, deviceevents1);
            assertEquals(deviceevents1, deviceevents2);
            assertEquals(deviceevents1, deviceevents1);
            assertFalse(deviceevents1.equals(null));
            assertNotEquals(deviceevents3, deviceevents1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
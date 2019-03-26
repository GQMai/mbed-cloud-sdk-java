// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentDenial.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentDenial {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("dabb617064ef7999683938ecbe24e627",
                                                                                        new Date(1553592028800L),
                                                                                        "24fb2d76-1254-4c3a-a0d3-871a7ab6080c",
                                                                                        "27b41fb7fb4babc36d7c94b8efab5eca",
                                                                                        "d6bd373ae2bdeb2555bb5bf95a55fdc6");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = deviceenrollmentdenial1.clone();
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
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
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("88359e6959215cc6397bd64df9eae243",
                                                                                        new Date(1553592029337L),
                                                                                        "a244ed7c-0f1a-401f-ba89-1361bf999b7c",
                                                                                        "6acef9e0cd428bc1d0de850a6e8b1dbc",
                                                                                        "dc11bcc5de7889e5c7e09c8f17ad3410");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("88359e6959215cc6397bd64df9eae243",
                                                                                        new Date(1553592029337L),
                                                                                        "a244ed7c-0f1a-401f-ba89-1361bf999b7c",
                                                                                        "6acef9e0cd428bc1d0de850a6e8b1dbc",
                                                                                        "dc11bcc5de7889e5c7e09c8f17ad3410");
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2.hashCode(), deviceenrollmentdenial1.hashCode());
            int hashCode = deviceenrollmentdenial1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentdenial1.hashCode());
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
        DeviceEnrollmentDenial deviceenrollmentdenial = new DeviceEnrollmentDenial("fda8850fdcbeb16cbec41e94aac7ed8e",
                                                                                   new Date(1553592032438L),
                                                                                   "9e0c0162-3724-489a-b21a-d442a4de1650",
                                                                                   "f97dce6afe98320c9e2527e32d76a5dc",
                                                                                   "dfcf146c32cbafcadaea60d8d4f8baab");
        assertTrue(deviceenrollmentdenial.isValid());
        DeviceEnrollmentDenial deviceenrollmentdenialInvalid = new DeviceEnrollmentDenial("44V4皼cYSc.cc4=ccZ\u0016>c芪ccI䊫\tc\u0005쳴ⴥ齼OcC\u00074/D\u001eRcc厠c4c44c�?F4'-c.cc4࿄4",
                                                                                          new Date(1553592024940L),
                                                                                          "cadbb3fc-c490-431c-a7cf-ba9f1e0fbe0b",
                                                                                          "18\u00008c111318\u0019�??疯8[\u00128ᄾ뙙88L838\u00141\u0017\u001bc1ད333=\t18CV;8c3%1嵔18]c8\fc88\u0013c8",
                                                                                          "6築86鱒㗃8_8!\u00008*86崲66\u001c\u001d_\u0007668⫟6뤀D8\u001f䬵6X�?G8%W�?�688\u000086\u001eJ\\\\)�?L8\u001a6F8�?�86嗽6J");
        assertFalse(deviceenrollmentdenialInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("ac3edad9ed6cec9bcddef23cbfa3eefe",
                                                                                        new Date(1553592025876L),
                                                                                        "2b37e461-4617-40b5-bda5-f154c069af99",
                                                                                        "8beb6daf2cb1f6e22b3a3df3ceba8b3f",
                                                                                        "f3c6a2afb6abf6a40ecc133dbfae2037");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("ac3edad9ed6cec9bcddef23cbfa3eefe",
                                                                                        new Date(1553592025876L),
                                                                                        "2b37e461-4617-40b5-bda5-f154c069af99",
                                                                                        "8beb6daf2cb1f6e22b3a3df3ceba8b3f",
                                                                                        "f3c6a2afb6abf6a40ecc133dbfae2037");
            DeviceEnrollmentDenial deviceenrollmentdenial3 = new DeviceEnrollmentDenial("713c09afd722406ecc7aac5e4dd0c4b4",
                                                                                        new Date(1553592028222L),
                                                                                        "0a4e947f-65ee-484c-8d8f-da00aa9b637f",
                                                                                        "261ca9c3be6cf6dafdbeed5c96eccd3a",
                                                                                        "ccc7a2d05aecea0ff8fd8c2704e09d6e");
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotNull(deviceenrollmentdenial3);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertNotSame(deviceenrollmentdenial3, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial1, deviceenrollmentdenial2);
            assertEquals(deviceenrollmentdenial1, deviceenrollmentdenial1);
            assertFalse(deviceenrollmentdenial1.equals(null));
            assertNotEquals(deviceenrollmentdenial3, deviceenrollmentdenial1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
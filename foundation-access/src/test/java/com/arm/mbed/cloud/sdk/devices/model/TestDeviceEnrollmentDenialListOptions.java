// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentDenialListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentDenialListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions1 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-94),
                                                                                                                         Long.valueOf(-44),
                                                                                                                         Order.getDefault(),
                                                                                                                         "d8aaee20-c285-4841-a1fb-dde00fe95601",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions2 = deviceenrollmentdeniallistoptions1.clone();
            assertNotNull(deviceenrollmentdeniallistoptions1);
            assertNotNull(deviceenrollmentdeniallistoptions2);
            assertNotSame(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            DeviceEnrollmentDenialListOptions option = new DeviceEnrollmentDenialListOptions().equalToEndpointName("b66afeee-3e43-4570-8a98-51824de41dcc")
                                                                                              .equalToTrustedCertificateId("eb10e244-af60-4726-bdc6-9fb81accde21");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_ENDPOINT_NAME));
            assertTrue(option.hasFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_ENDPOINT_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEndpointNameFilters());
            assertEquals("b66afeee-3e43-4570-8a98-51824de41dcc",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_ENDPOINT_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_TRUSTED_CERTIFICATE_ID));
            assertTrue(option.hasFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_TRUSTED_CERTIFICATE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getTrustedCertificateIdFilters());
            assertEquals("eb10e244-af60-4726-bdc6-9fb81accde21",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_TRUSTED_CERTIFICATE_ID,
                                                                    String.class, option));
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
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions1 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-125),
                                                                                                                         Long.valueOf(107),
                                                                                                                         Order.getDefault(),
                                                                                                                         "977f59eb-2a17-442e-b2f7-3e0a4b172416",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions2 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-125),
                                                                                                                         Long.valueOf(107),
                                                                                                                         Order.getDefault(),
                                                                                                                         "977f59eb-2a17-442e-b2f7-3e0a4b172416",
                                                                                                                         null,
                                                                                                                         null);
            assertNotNull(deviceenrollmentdeniallistoptions1);
            assertNotNull(deviceenrollmentdeniallistoptions2);
            assertNotSame(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2.hashCode(), deviceenrollmentdeniallistoptions1.hashCode());
            int hashCode = deviceenrollmentdeniallistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentdeniallistoptions1.hashCode());
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
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions1 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(9),
                                                                                                                         Long.valueOf(9),
                                                                                                                         Order.getDefault(),
                                                                                                                         "85b4a4be-5960-4018-9785-14223466c59f",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions2 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(9),
                                                                                                                         Long.valueOf(9),
                                                                                                                         Order.getDefault(),
                                                                                                                         "85b4a4be-5960-4018-9785-14223466c59f",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions3 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(105),
                                                                                                                         Long.valueOf(70),
                                                                                                                         Order.getDefault(),
                                                                                                                         "00fb7774-00c2-4285-88d6-6508b20454c1",
                                                                                                                         null,
                                                                                                                         null);
            assertNotNull(deviceenrollmentdeniallistoptions1);
            assertNotNull(deviceenrollmentdeniallistoptions2);
            assertNotNull(deviceenrollmentdeniallistoptions3);
            assertNotSame(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertNotSame(deviceenrollmentdeniallistoptions3, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions1, deviceenrollmentdeniallistoptions2);
            assertEquals(deviceenrollmentdeniallistoptions1, deviceenrollmentdeniallistoptions1);
            assertFalse(deviceenrollmentdeniallistoptions1.equals(null));
            assertNotEquals(deviceenrollmentdeniallistoptions3, deviceenrollmentdeniallistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

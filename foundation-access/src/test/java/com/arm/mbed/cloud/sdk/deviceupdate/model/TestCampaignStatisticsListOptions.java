// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(-99),
                                                                                                             Long.valueOf(-94),
                                                                                                             Order.getDefault(),
                                                                                                             "e5b6fddf-6800-491a-8b3a-cabe7e75f1af",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = campaignstatisticslistoptions1.clone();
            assertNotNull(campaignstatisticslistoptions1);
            assertNotNull(campaignstatisticslistoptions2);
            assertNotSame(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(90),
                                                                                                             Long.valueOf(-98),
                                                                                                             Order.getDefault(),
                                                                                                             "8151cb96-c6e3-42f4-9a4d-73cf7b29bfb1",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = new CampaignStatisticsListOptions(Integer.valueOf(90),
                                                                                                             Long.valueOf(-98),
                                                                                                             Order.getDefault(),
                                                                                                             "8151cb96-c6e3-42f4-9a4d-73cf7b29bfb1",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(campaignstatisticslistoptions1);
            assertNotNull(campaignstatisticslistoptions2);
            assertNotSame(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2.hashCode(), campaignstatisticslistoptions1.hashCode());
            int hashCode = campaignstatisticslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticslistoptions1.hashCode());
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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(100),
                                                                                                             Long.valueOf(7),
                                                                                                             Order.getDefault(),
                                                                                                             "08ba88b3-377a-4f25-a5c8-90cdcabc75c6",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = new CampaignStatisticsListOptions(Integer.valueOf(100),
                                                                                                             Long.valueOf(7),
                                                                                                             Order.getDefault(),
                                                                                                             "08ba88b3-377a-4f25-a5c8-90cdcabc75c6",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions3 = new CampaignStatisticsListOptions(Integer.valueOf(20),
                                                                                                             Long.valueOf(63),
                                                                                                             Order.getDefault(),
                                                                                                             "ca0755fc-cf9f-4ac8-af87-45f56419afe7",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(campaignstatisticslistoptions1);
            assertNotNull(campaignstatisticslistoptions2);
            assertNotNull(campaignstatisticslistoptions3);
            assertNotSame(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertNotSame(campaignstatisticslistoptions3, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions2, campaignstatisticslistoptions1);
            assertEquals(campaignstatisticslistoptions1, campaignstatisticslistoptions2);
            assertEquals(campaignstatisticslistoptions1, campaignstatisticslistoptions1);
            assertFalse(campaignstatisticslistoptions1.equals(null));
            assertNotEquals(campaignstatisticslistoptions3, campaignstatisticslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

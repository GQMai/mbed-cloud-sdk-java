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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(-93),
                                                                                                             Long.valueOf(120),
                                                                                                             Order.getDefault(),
                                                                                                             "917a3200-b4a6-419f-9d8d-d316b9baf769",
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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(118),
                                                                                                             Long.valueOf(-61),
                                                                                                             Order.getDefault(),
                                                                                                             "26ef106f-28ff-4c8d-bd3b-07f1e6c77b6c",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = new CampaignStatisticsListOptions(Integer.valueOf(118),
                                                                                                             Long.valueOf(-61),
                                                                                                             Order.getDefault(),
                                                                                                             "26ef106f-28ff-4c8d-bd3b-07f1e6c77b6c",
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
            CampaignStatisticsListOptions campaignstatisticslistoptions1 = new CampaignStatisticsListOptions(Integer.valueOf(114),
                                                                                                             Long.valueOf(75),
                                                                                                             Order.getDefault(),
                                                                                                             "d36adefd-d00d-49ef-9f03-ed623aa1db97",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions2 = new CampaignStatisticsListOptions(Integer.valueOf(114),
                                                                                                             Long.valueOf(75),
                                                                                                             Order.getDefault(),
                                                                                                             "d36adefd-d00d-49ef-9f03-ed623aa1db97",
                                                                                                             null,
                                                                                                             null);
            CampaignStatisticsListOptions campaignstatisticslistoptions3 = new CampaignStatisticsListOptions(Integer.valueOf(18),
                                                                                                             Long.valueOf(99),
                                                                                                             Order.getDefault(),
                                                                                                             "c46de231-de2a-4e7c-920e-96f03cf186dd",
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

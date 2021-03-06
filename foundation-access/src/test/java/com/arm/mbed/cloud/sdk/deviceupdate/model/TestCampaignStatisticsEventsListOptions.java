// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsEventsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsEventsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(121),
                                                                                                                               Long.valueOf(-66),
                                                                                                                               Order.getDefault(),
                                                                                                                               "2552e941-cb5d-4a64-bd34-0c80efa442b7",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = campaignstatisticseventslistoptions1.clone();
            assertNotNull(campaignstatisticseventslistoptions1);
            assertNotNull(campaignstatisticseventslistoptions2);
            assertNotSame(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-120),
                                                                                                                               Long.valueOf(91),
                                                                                                                               Order.getDefault(),
                                                                                                                               "796e1b96-d2c7-425b-a027-1992f9df0bec",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-120),
                                                                                                                               Long.valueOf(91),
                                                                                                                               Order.getDefault(),
                                                                                                                               "796e1b96-d2c7-425b-a027-1992f9df0bec",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(campaignstatisticseventslistoptions1);
            assertNotNull(campaignstatisticseventslistoptions2);
            assertNotSame(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2.hashCode(),
                         campaignstatisticseventslistoptions1.hashCode());
            int hashCode = campaignstatisticseventslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticseventslistoptions1.hashCode());
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
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions1 = new CampaignStatisticsEventsListOptions(Integer.valueOf(16),
                                                                                                                               Long.valueOf(52),
                                                                                                                               Order.getDefault(),
                                                                                                                               "a90fd4ce-f7a9-4efb-bdf4-6419a4256272",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions2 = new CampaignStatisticsEventsListOptions(Integer.valueOf(16),
                                                                                                                               Long.valueOf(52),
                                                                                                                               Order.getDefault(),
                                                                                                                               "a90fd4ce-f7a9-4efb-bdf4-6419a4256272",
                                                                                                                               null,
                                                                                                                               null);
            CampaignStatisticsEventsListOptions campaignstatisticseventslistoptions3 = new CampaignStatisticsEventsListOptions(Integer.valueOf(-113),
                                                                                                                               Long.valueOf(-5),
                                                                                                                               Order.getDefault(),
                                                                                                                               "93ddf0f6-a266-43c2-b50f-02d0428e607e",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(campaignstatisticseventslistoptions1);
            assertNotNull(campaignstatisticseventslistoptions2);
            assertNotNull(campaignstatisticseventslistoptions3);
            assertNotSame(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertNotSame(campaignstatisticseventslistoptions3, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions2, campaignstatisticseventslistoptions1);
            assertEquals(campaignstatisticseventslistoptions1, campaignstatisticseventslistoptions2);
            assertEquals(campaignstatisticseventslistoptions1, campaignstatisticseventslistoptions1);
            assertFalse(campaignstatisticseventslistoptions1.equals(null));
            assertNotEquals(campaignstatisticseventslistoptions3, campaignstatisticseventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

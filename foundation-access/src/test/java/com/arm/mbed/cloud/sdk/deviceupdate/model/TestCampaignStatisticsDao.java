// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Tue May 14 13:12:52 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsDao.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsDao campaignstatisticsdao1 = new CampaignStatisticsDao();
            CampaignStatisticsDao campaignstatisticsdao2 = campaignstatisticsdao1.clone();
            assertNotNull(campaignstatisticsdao1);
            assertNotNull(campaignstatisticsdao2);
            assertNotSame(campaignstatisticsdao2, campaignstatisticsdao1);
            assertEquals(campaignstatisticsdao2, campaignstatisticsdao1);
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
            CampaignStatisticsDao campaignstatisticsdao1 = new CampaignStatisticsDao();
            CampaignStatisticsDao campaignstatisticsdao2 = new CampaignStatisticsDao();
            assertNotNull(campaignstatisticsdao1);
            assertNotNull(campaignstatisticsdao2);
            assertNotSame(campaignstatisticsdao2, campaignstatisticsdao1);
            assertEquals(campaignstatisticsdao2, campaignstatisticsdao1);
            assertEquals(campaignstatisticsdao2.hashCode(), campaignstatisticsdao1.hashCode());
            int hashCode = campaignstatisticsdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticsdao1.hashCode());
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
            CampaignStatisticsDao campaignstatisticsdao1 = new CampaignStatisticsDao();
            CampaignStatisticsDao campaignstatisticsdao2 = new CampaignStatisticsDao();
            assertNotNull(campaignstatisticsdao1);
            assertNotNull(campaignstatisticsdao2);
            assertNotSame(campaignstatisticsdao2, campaignstatisticsdao1);
            assertEquals(campaignstatisticsdao2, campaignstatisticsdao1);
            assertEquals(campaignstatisticsdao2, campaignstatisticsdao1);
            assertEquals(campaignstatisticsdao1, campaignstatisticsdao2);
            assertEquals(campaignstatisticsdao1, campaignstatisticsdao1);
            assertFalse(campaignstatisticsdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserInvitationListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserInvitationListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions1 = new SubtenantUserInvitationListOptions(Integer.valueOf(-70),
                                                                                                                            Long.valueOf(-111),
                                                                                                                            Order.getDefault(),
                                                                                                                            "3ea5115f-1e40-4b0a-9605-60d3f693d904",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions2 = subtenantuserinvitationlistoptions1.clone();
            assertNotNull(subtenantuserinvitationlistoptions1);
            assertNotNull(subtenantuserinvitationlistoptions2);
            assertNotSame(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
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
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            SubtenantUserInvitationListOptions option = new SubtenantUserInvitationListOptions();
            assertFalse(option.hasFilters());
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
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
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions1 = new SubtenantUserInvitationListOptions(Integer.valueOf(-60),
                                                                                                                            Long.valueOf(-7),
                                                                                                                            Order.getDefault(),
                                                                                                                            "88f149d2-6710-4729-8bc6-42088b90cd30",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions2 = new SubtenantUserInvitationListOptions(Integer.valueOf(-60),
                                                                                                                            Long.valueOf(-7),
                                                                                                                            Order.getDefault(),
                                                                                                                            "88f149d2-6710-4729-8bc6-42088b90cd30",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantuserinvitationlistoptions1);
            assertNotNull(subtenantuserinvitationlistoptions2);
            assertNotSame(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2.hashCode(),
                         subtenantuserinvitationlistoptions1.hashCode());
            int hashCode = subtenantuserinvitationlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuserinvitationlistoptions1.hashCode());
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
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions1 = new SubtenantUserInvitationListOptions(Integer.valueOf(-19),
                                                                                                                            Long.valueOf(63),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b3ae37ad-aa5b-4512-8557-e532b082c3d9",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions2 = new SubtenantUserInvitationListOptions(Integer.valueOf(-19),
                                                                                                                            Long.valueOf(63),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b3ae37ad-aa5b-4512-8557-e532b082c3d9",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantUserInvitationListOptions subtenantuserinvitationlistoptions3 = new SubtenantUserInvitationListOptions(Integer.valueOf(104),
                                                                                                                            Long.valueOf(74),
                                                                                                                            Order.getDefault(),
                                                                                                                            "0d80df62-9f48-4fc3-b1f2-9aab62ecc444",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantuserinvitationlistoptions1);
            assertNotNull(subtenantuserinvitationlistoptions2);
            assertNotNull(subtenantuserinvitationlistoptions3);
            assertNotSame(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertNotSame(subtenantuserinvitationlistoptions3, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions2, subtenantuserinvitationlistoptions1);
            assertEquals(subtenantuserinvitationlistoptions1, subtenantuserinvitationlistoptions2);
            assertEquals(subtenantuserinvitationlistoptions1, subtenantuserinvitationlistoptions1);
            assertFalse(subtenantuserinvitationlistoptions1.equals(null));
            assertNotEquals(subtenantuserinvitationlistoptions3, subtenantuserinvitationlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

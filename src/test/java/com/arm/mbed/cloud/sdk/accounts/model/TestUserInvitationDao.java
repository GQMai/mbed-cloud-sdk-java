// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Jan 11 00:36:38 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model UserInvitationDao.
 */
public class TestUserInvitationDao {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            UserInvitationDao userinvitationdao1 = new UserInvitationDao();
            UserInvitationDao userinvitationdao2 = userinvitationdao1.clone();
            assertNotNull(userinvitationdao1);
            assertNotNull(userinvitationdao2);
            assertNotSame(userinvitationdao2, userinvitationdao1);
            assertEquals(userinvitationdao2, userinvitationdao1);
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
            UserInvitationDao userinvitationdao1 = new UserInvitationDao();
            UserInvitationDao userinvitationdao2 = new UserInvitationDao();
            assertNotNull(userinvitationdao1);
            assertNotNull(userinvitationdao2);
            assertNotSame(userinvitationdao2, userinvitationdao1);
            assertEquals(userinvitationdao2, userinvitationdao1);
            assertEquals(userinvitationdao2.hashCode(), userinvitationdao1.hashCode());
            int hashCode = userinvitationdao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userinvitationdao1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            UserInvitationDao userinvitationdao1 = new UserInvitationDao();
            UserInvitationDao userinvitationdao2 = new UserInvitationDao();
            assertNotNull(userinvitationdao1);
            assertNotNull(userinvitationdao2);
            assertNotSame(userinvitationdao2, userinvitationdao1);
            assertEquals(userinvitationdao2, userinvitationdao1);
            assertEquals(userinvitationdao2, userinvitationdao1);
            assertEquals(userinvitationdao1, userinvitationdao2);
            assertEquals(userinvitationdao1, userinvitationdao1);
            assertFalse(userinvitationdao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
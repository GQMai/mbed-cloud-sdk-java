// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model ParentAccount.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestParentAccount {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ParentAccount parentaccount1 = new ParentAccount("0b65f.834ca@cc570.me",
                                                             "7ea049b8-7331-4569-ab33-dd94a7a6a679",
                                                             "dbffc04464ee5d492da2ca1837b00ec4");
            ParentAccount parentaccount2 = parentaccount1.clone();
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotSame(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
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
            ParentAccount parentaccount1 = new ParentAccount("8364b.80447@bd1c0.me",
                                                             "bb7ef641-27eb-4103-83f1-0a64fd49fad1",
                                                             "dbffc04464ee5d492da2ca1837b00ec4");
            ParentAccount parentaccount2 = new ParentAccount("8364b.80447@bd1c0.me",
                                                             "bb7ef641-27eb-4103-83f1-0a64fd49fad1",
                                                             "dbffc04464ee5d492da2ca1837b00ec4");
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotSame(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount2.hashCode(), parentaccount1.hashCode());
            int hashCode = parentaccount1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, parentaccount1.hashCode());
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
        ParentAccount parentaccount = new ParentAccount("fddca.109b3@753e0.me", "d0c6e68f-7066-49cc-bf18-b41a0ccf9f2f",
                                                        "dbffc04464ee5d492da2ca1837b00ec4");
        assertTrue(parentaccount.isValid());
        ParentAccount parentaccountInvalid = new ParentAccount("幪\t撟�?\u000f\u0014\u0000\u0006\f�??\u000f\u0015\u0012䥽\u0001�?\u0001텋쩚拵\u0001\u000f탠�?3둸ℶ?\t\u0012봖樯张�?-�?\f\f\u0005\u0016\u0016>탱튊旅\u0015歄\u001c\f徴\u0000졌\u0014斎\f",
                                                               "c29d07bd-303d-41a1-9a37-3daff2000b81295302a5-ad90-4b25-8b84-419c0383b51f7b4b1420-e77a-4ea0-8749-0954b1cbbd20",
                                                               "�?疣U\t憒�?鼘Y�?\u0002ᶣ\u000e\u0015髃\u0004Y㨃QᓒTNX)‖]천:\u0000�?\u0013宇/ᓗL檙C\u0005L^X.�?美\u0014⦌鸬\u0005닫ꧮ〢맕\u0011�?�%AH\u0014ౄ");
        assertFalse(parentaccountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ParentAccount parentaccount1 = new ParentAccount("18e12.0fa9d@cd029.me",
                                                             "cf8d72e7-39c7-4031-a6a4-b47d666f017b",
                                                             "dbffc04464ee5d492da2ca1837b00ec4");
            ParentAccount parentaccount2 = new ParentAccount("18e12.0fa9d@cd029.me",
                                                             "cf8d72e7-39c7-4031-a6a4-b47d666f017b",
                                                             "dbffc04464ee5d492da2ca1837b00ec4");
            ParentAccount parentaccount3 = new ParentAccount("c703b.4a51f@c7ca9.me",
                                                             "0271fe04-fd9b-47a6-810f-8908acd1c78c",
                                                             "dbffc04464ee5d492da2ca1837b00ec4");
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotNull(parentaccount3);
            assertNotSame(parentaccount2, parentaccount1);
            assertNotSame(parentaccount3, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount1, parentaccount2);
            assertEquals(parentaccount1, parentaccount1);
            assertFalse(parentaccount1.equals(null));
            assertNotEquals(parentaccount3, parentaccount1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUser.
 */
public class TestSubtenantUser {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("4222a9ab-b9d8-430f-9ccd-b46d925d2295",
                                                             "2295204e-d897-48b8-b652-719bff585e74",
                                                             new Date(1547159625488L), -2,
                                                             "0b52551f-b2ae-4596-971e-d8e7cc7cdd74", false,
                                                             "0a3398e3-0bab-4da8-965d-111482ad2f2d",
                                                             "69924ff9-b70e-4331-b2f4-591a555b7f7f", -128, null, null,
                                                             false, "fd7d9e47-89be-4f8a-8255-329e334624e9", 48,
                                                             "59a4d617-251a-4454-ba5e-0792314fabd7",
                                                             SubtenantUserStatus.getDefault(), false, false,
                                                             new Date(1547159621455L),
                                                             "62ecf3c8-05f7-4f41-b8bf-f9471c887015");
            SubtenantUser subtenantuser2 = subtenantuser1.clone();
            assertNotNull(subtenantuser1);
            assertNotNull(subtenantuser2);
            assertNotSame(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
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
            SubtenantUser subtenantuser1 = new SubtenantUser("9c17b411-a533-4163-b2e1-8d4ceccc560f",
                                                             "86a3734f-8bae-49dc-aa9f-d772fb19a835",
                                                             new Date(1547159626480L), -106,
                                                             "00d255d7-e839-4f13-8d12-0d04ddf9bba5", true,
                                                             "6c85c086-a8b8-4b61-8caa-678d144341af",
                                                             "7d1c27c2-8347-46aa-8f64-e00e0196a93a", 31, null, null,
                                                             false, "b2908568-ddbf-4508-815d-b2f27b0bc253", -79,
                                                             "cae7b41a-637b-4335-8c54-7ad304e4b12f",
                                                             SubtenantUserStatus.getDefault(), true, true,
                                                             new Date(1547159630277L),
                                                             "b2f759f7-f1ac-4e0a-92e3-16758979b579");
            SubtenantUser subtenantuser2 = new SubtenantUser("9c17b411-a533-4163-b2e1-8d4ceccc560f",
                                                             "86a3734f-8bae-49dc-aa9f-d772fb19a835",
                                                             new Date(1547159626480L), -106,
                                                             "00d255d7-e839-4f13-8d12-0d04ddf9bba5", true,
                                                             "6c85c086-a8b8-4b61-8caa-678d144341af",
                                                             "7d1c27c2-8347-46aa-8f64-e00e0196a93a", 31, null, null,
                                                             false, "b2908568-ddbf-4508-815d-b2f27b0bc253", -79,
                                                             "cae7b41a-637b-4335-8c54-7ad304e4b12f",
                                                             SubtenantUserStatus.getDefault(), true, true,
                                                             new Date(1547159630277L),
                                                             "b2f759f7-f1ac-4e0a-92e3-16758979b579");
            assertNotNull(subtenantuser1);
            assertNotNull(subtenantuser2);
            assertNotSame(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2.hashCode(), subtenantuser1.hashCode());
            int hashCode = subtenantuser1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuser1.hashCode());
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
        SubtenantUser subtenantuser = new SubtenantUser("bb14321b-f66b-4c45-a918-33e7c4ac049e",
                                                        "5d7d0ef6-d0bb-4639-9cb2-2c6b11a7e7f1",
                                                        new Date(1547159627873L), -83,
                                                        "cd07b78e-7010-4e46-957d-e682517fceeb", false,
                                                        "2a99e905-7295-4240-b754-ee0fdae31547",
                                                        "1a2f5858-dcce-43d5-9cda-470a406bc5e7", -70, null, null, false,
                                                        "51c04248-490c-4639-afb2-fcf26f214bbd", -8,
                                                        "d72450ec-db3c-4386-9ff2-907ae7ebf8ec",
                                                        SubtenantUserStatus.getDefault(), false, true,
                                                        new Date(1547159620777L),
                                                        "034015e8-2bb7-4cdd-b95f-f22037ee7a47");
        assertTrue(subtenantuser.isValid());
        SubtenantUser subtenantuserInvalid = new SubtenantUser(null, "eb26ba60-8ffc-4014-8bf0-0b94100d555b",
                                                               new Date(1547159626882L), -12, null, true,
                                                               "6e4b595f-550d-43a6-9b75-1d4555c8f7f0", null, 11, null,
                                                               null, false, "808cb4ac-c90e-4a15-9e92-2b31166e010b", 5,
                                                               "64d1efb8-2ce4-4c35-8eb5-be51178bb979",
                                                               SubtenantUserStatus.getDefault(), false, true,
                                                               new Date(1547159624882L),
                                                               "604d56b4-7786-40b0-848c-0827fe86a46d");
        assertFalse(subtenantuserInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("b377b968-79fa-4553-824d-568bd4177037",
                                                             "f589150e-17f3-46e7-8841-bb02f0f54db0",
                                                             new Date(1547159624732L), -127,
                                                             "9254850c-f9e0-417e-9bb2-5c356572f60a", false,
                                                             "93b95c24-a60f-45af-89f5-f2643fba08f1",
                                                             "768d4614-9e20-40ae-99fa-c63544512a8d", 22, null, null,
                                                             false, "2185a6bb-b5bb-47e2-890e-23c0c1974d2d", 6,
                                                             "31d8f137-de68-401b-b2db-aaae4901fc5a",
                                                             SubtenantUserStatus.getDefault(), true, true,
                                                             new Date(1547159626616L),
                                                             "aff5d2a9-af3c-41d9-b125-a591086e5e99");
            SubtenantUser subtenantuser2 = new SubtenantUser("b377b968-79fa-4553-824d-568bd4177037",
                                                             "f589150e-17f3-46e7-8841-bb02f0f54db0",
                                                             new Date(1547159624732L), -127,
                                                             "9254850c-f9e0-417e-9bb2-5c356572f60a", false,
                                                             "93b95c24-a60f-45af-89f5-f2643fba08f1",
                                                             "768d4614-9e20-40ae-99fa-c63544512a8d", 22, null, null,
                                                             false, "2185a6bb-b5bb-47e2-890e-23c0c1974d2d", 6,
                                                             "31d8f137-de68-401b-b2db-aaae4901fc5a",
                                                             SubtenantUserStatus.getDefault(), true, true,
                                                             new Date(1547159626616L),
                                                             "aff5d2a9-af3c-41d9-b125-a591086e5e99");
            SubtenantUser subtenantuser3 = new SubtenantUser("ed8cb99e-4f25-4833-9e43-ae9d9eabfa19",
                                                             "b7c652a8-55ad-4692-b022-de176f206082",
                                                             new Date(1547159629175L), 30,
                                                             "89ad0d1c-1ee3-4396-a410-45a944bb66a5", false,
                                                             "3c11e3ce-7eb6-4fd8-ae92-65e8bac462bc",
                                                             "3d0d1b86-37cf-4243-adfc-22e7d7a6e8a2", 7, null, null,
                                                             false, "51320333-8b0f-4c4f-9e52-bfdb3a275e56", 113,
                                                             "bfdda957-2070-4320-aeea-0f8177fee313",
                                                             SubtenantUserStatus.getDefault(), true, true,
                                                             new Date(1547159628753L),
                                                             "22f90aeb-5865-401b-8059-634634523119");
            assertNotNull(subtenantuser1);
            assertNotNull(subtenantuser2);
            assertNotNull(subtenantuser3);
            assertNotSame(subtenantuser2, subtenantuser1);
            assertNotSame(subtenantuser3, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser2, subtenantuser1);
            assertEquals(subtenantuser1, subtenantuser2);
            assertEquals(subtenantuser1, subtenantuser1);
            assertFalse(subtenantuser1.equals(null));
            assertNotEquals(subtenantuser3, subtenantuser1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

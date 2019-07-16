// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUser.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUser {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                             "e7326465-00ca-4bfb-8c25-31de6475f5a8",
                                                             new Date(1563275986340L), -123, null,
                                                             "f91b4.45709@f7adc.me", false,
                                                             "d6e44133-2031-47cd-8502-ec0f09fe6e01",
                                                             "9e70a034c4e3cc5aa8682c95a95d2309", false, false, false,
                                                             -124, null, null, "2490ac2c-7dfe-4983-81c8-83cbcc7b1084",
                                                             71, "5f1a6eb2-942a-48bd-9c6a-6dae97a1c1b3",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1563275989894L), "mKQ=i");
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
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                             "bb1f5085-29ce-4dcd-91d7-2202a46fc641",
                                                             new Date(1563275984933L), -63, null,
                                                             "e8060.6b041@7d006.me", false,
                                                             "6dce7fc1-3a0a-4860-ac0b-8ddd7c947819",
                                                             "9e70a034c4e3cc5aa8682c95a95d2309", false, false, true, 45,
                                                             null, null, "3290514f-53c5-4cce-b953-57eba2516215", -80,
                                                             "164be3c0-e734-41dd-9543-42b7624f9a7c",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1563275992181L), "mKQ=i");
            SubtenantUser subtenantuser2 = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                             "bb1f5085-29ce-4dcd-91d7-2202a46fc641",
                                                             new Date(1563275984933L), -63, null,
                                                             "e8060.6b041@7d006.me", false,
                                                             "6dce7fc1-3a0a-4860-ac0b-8ddd7c947819",
                                                             "9e70a034c4e3cc5aa8682c95a95d2309", false, false, true, 45,
                                                             null, null, "3290514f-53c5-4cce-b953-57eba2516215", -80,
                                                             "164be3c0-e734-41dd-9543-42b7624f9a7c",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1563275992181L), "mKQ=i");
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
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        SubtenantUser subtenantuser = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                        "14b16994-e2d6-4e3e-ad68-efefbff1cc29",
                                                        new Date(1563275992078L), 74, null, "5a58f.dddc0@913e7.me",
                                                        true, "fdf47c5e-6b0e-471c-b855-7e166d90114b",
                                                        "9e70a034c4e3cc5aa8682c95a95d2309", false, false, false, -42,
                                                        null, null, "6044aa93-7622-4bed-ac87-d93a14e2ccc3", 52,
                                                        "472ccb24-1614-40c0-b164-15f77ea4e7d3",
                                                        SubtenantUserStatus.getDefault(), null,
                                                        new Date(1563275988417L), "mKQ=i");
        assertTrue(subtenantuser.isValid());
        SubtenantUser subtenantuserInvalid = new SubtenantUser(null, null, "a44f6e90-d2cc-4582-bc82-8c63aaeb7e6b",
                                                               new Date(1563275986778L), -112, null, null, false,
                                                               "da1cee2b-2fc2-4f96-b813-0739c9fad16c3e9a7ae9-4bd9-4fd0-bbb3-dae55343fcbf7938ead2-5f03-4007-8608-81d3937c5892",
                                                               "U`ᑡbìM묅bb어VV⧒K<D䓫\u0010b\u0016bbb1b\u0006'11[1虑1R!UDb\bb᥾11/\u0002\\\\bb\u001d\u00051੔bPW11bb1b�??C",
                                                               false, false, true, 115, null, null,
                                                               "797f9fad-8181-4a1d-9ffe-2bf3a96061eb", 108,
                                                               "4a6732cd-05ed-46e5-b7a1-0c401aacbdd4cc30a4c0-30fd-4d63-af14-db54c4f278e725471703-3411-467f-954f-cea1cf1acbe0",
                                                               SubtenantUserStatus.getDefault(), null,
                                                               new Date(1563275990874L),
                                                               "PkNOkj\u000e:@f[ W㴠l`AABXj\u0002\u000fᥴMkd$$\u0012\bj9X\tY牱\u000bC_kTGO\\\\\u001e喬/(lka)?fBB;�?�>gIl5P");
        assertFalse(subtenantuserInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUser subtenantuser1 = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                             "a10195eb-8efd-417e-8542-70baf9076a73",
                                                             new Date(1563275986972L), -47, null,
                                                             "36b4f.f6e8e@b1c91.fr", false,
                                                             "487dd987-3247-4935-9cae-228fe7d7426e",
                                                             "9e70a034c4e3cc5aa8682c95a95d2309", true, false, true, 58,
                                                             null, null, "a25ade29-33a2-440d-b30f-352b6705b632", 17,
                                                             "d9348115-f01e-47be-b751-e6f2a9b070e4",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1563275990136L), "mKQ=i");
            SubtenantUser subtenantuser2 = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                             "a10195eb-8efd-417e-8542-70baf9076a73",
                                                             new Date(1563275986972L), -47, null,
                                                             "36b4f.f6e8e@b1c91.fr", false,
                                                             "487dd987-3247-4935-9cae-228fe7d7426e",
                                                             "9e70a034c4e3cc5aa8682c95a95d2309", true, false, true, 58,
                                                             null, null, "a25ade29-33a2-440d-b30f-352b6705b632", 17,
                                                             "d9348115-f01e-47be-b751-e6f2a9b070e4",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1563275990136L), "mKQ=i");
            SubtenantUser subtenantuser3 = new SubtenantUser("9e70a034c4e3cc5aa8682c95a95d2309", null,
                                                             "6ad75713-5e31-4dc5-a53a-7e73b14d51a1",
                                                             new Date(1563275990981L), -24, null,
                                                             "909cd.084dd@08aaf.me", false,
                                                             "55fbae88-d65b-484c-92b9-d9cbfa45296b",
                                                             "9e70a034c4e3cc5aa8682c95a95d2309", true, false, true, 74,
                                                             null, null, "40667c7a-bd65-4f79-8423-9a8763c02aef", -44,
                                                             "fce2584e-6885-4929-bd75-9b27d7d754bb",
                                                             SubtenantUserStatus.getDefault(), null,
                                                             new Date(1563275986657L), "mKQ=i");
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

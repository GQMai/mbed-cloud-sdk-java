// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model User.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUser {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            User user1 = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "001505ef-7573-4795-a8d9-496d45459ac1",
                                  new Date(1562657745182L), 93, null, "bafe7.ce675@4a14f.fr", true,
                                  "2a3149da-b361-4ce9-ba7e-34318a4c1c38", "5cc1ad15aa5e8e57d330ac5269a987d5", true,
                                  true, true, -115, null, null, "4529a274-3069-4eae-891c-9078bcbc68ee", -54,
                                  "a9536a15-d5d8-4e83-8674-327eb35e36f8", UserStatus.getDefault(), null,
                                  new Date(1562657749091L), "._5._K");
            User user2 = user1.clone();
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
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
            User user1 = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "9729dd6e-4acd-4d6b-8dc8-0038b8cbf4d3",
                                  new Date(1562657744698L), 67, null, "3b83b.a26f3@f1654.me", true,
                                  "34527c3a-21da-40b2-8fe0-7b075365e86b", "5cc1ad15aa5e8e57d330ac5269a987d5", true,
                                  false, true, 55, null, null, "07f25dda-a56b-4375-8641-8134d4eb5911", -21,
                                  "1139acd9-4fa7-42e8-a534-efad08602d16", UserStatus.getDefault(), null,
                                  new Date(1562657744189L), "._5._K");
            User user2 = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "9729dd6e-4acd-4d6b-8dc8-0038b8cbf4d3",
                                  new Date(1562657744698L), 67, null, "3b83b.a26f3@f1654.me", true,
                                  "34527c3a-21da-40b2-8fe0-7b075365e86b", "5cc1ad15aa5e8e57d330ac5269a987d5", true,
                                  false, true, 55, null, null, "07f25dda-a56b-4375-8641-8134d4eb5911", -21,
                                  "1139acd9-4fa7-42e8-a534-efad08602d16", UserStatus.getDefault(), null,
                                  new Date(1562657744189L), "._5._K");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user2.hashCode(), user1.hashCode());
            int hashCode = user1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, user1.hashCode());
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
        User user = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "d58174a4-cfe8-4ec1-b787-824c86477221",
                             new Date(1562657745078L), -109, null, "9b0cf.faf6c@8f06b.fr", false,
                             "79ef9c24-1261-4ec5-a485-6da42b2a5d09", "5cc1ad15aa5e8e57d330ac5269a987d5", false, true,
                             true, 33, null, null, "38df84e1-1eae-4c30-adbd-48931e8b1508", 49,
                             "ace45069-e603-44cb-bfa2-6aafe84305aa", UserStatus.getDefault(), null,
                             new Date(1562657752259L), "._5._K");
        assertTrue(user.isValid());
        User userInvalid = new User("\fbD嘯4D潰?㸀?[M4T�?4\u00114ᑟ\u001bbbb\u00154b(-44\u0013[b\u001e뚤<bb4\u001bb:U\u000e44b/bNb4\u001d爱,\u001a엙几^@",
                                    null, "b2d4180f-7bf7-4865-b1e0-1b0ddca9f5de", new Date(1562657751086L), -54, null,
                                    null, true,
                                    "c530129d-15fa-4250-b5cd-a88a9b31a32b1127b903-cabe-4cfa-8bd7-a4e018ff5a3435b05969-12b7-4000-86b3-f758c002ab8b",
                                    "\fbD嘯4D潰?㸀?[M4T�?4\u00114ᑟ\u001bbbb\u00154b(-44\u0013[b\u001e뚤<bb4\u001bb:U\u000e44b/bNb4\u001d爱,\u001a엙几^@",
                                    true, true, false, -55, null, null, "b766728c-28e3-432e-840e-bb668c1a497f", -43,
                                    "6e2971f9-ca8e-4069-8ae4-d3892bf107769f0b5ed6-dd05-4a73-82e4-49464c078e15993ee7f9-f173-4262-8f42-9c2dbb2e04b1",
                                    UserStatus.getDefault(), null, new Date(1562657743120L),
                                    "1IE\u0000B⎂0F9ᰥ1섯V칔3:0䞰O1\u0000[:9/\u0013[D2T3,/F7TℹDT3G\f\u0017^\u0004\u001d:7D]2賗J\u0002:융AUQ\u001c\u001b9>");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            User user1 = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "420986ca-5601-4779-932b-c2949ec7c09d",
                                  new Date(1562657749084L), -44, null, "ca48e.c5117@5271b.fr", false,
                                  "ef17983b-cb48-4de9-8005-b3d3043af203", "5cc1ad15aa5e8e57d330ac5269a987d5", true,
                                  true, false, 4, null, null, "b8442a64-35ab-423c-bd51-b6e037c5a80b", -108,
                                  "01d92b69-5438-42ea-99ff-9681ab0072bd", UserStatus.getDefault(), null,
                                  new Date(1562657752144L), "._5._K");
            User user2 = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "420986ca-5601-4779-932b-c2949ec7c09d",
                                  new Date(1562657749084L), -44, null, "ca48e.c5117@5271b.fr", false,
                                  "ef17983b-cb48-4de9-8005-b3d3043af203", "5cc1ad15aa5e8e57d330ac5269a987d5", true,
                                  true, false, 4, null, null, "b8442a64-35ab-423c-bd51-b6e037c5a80b", -108,
                                  "01d92b69-5438-42ea-99ff-9681ab0072bd", UserStatus.getDefault(), null,
                                  new Date(1562657752144L), "._5._K");
            User user3 = new User("5cc1ad15aa5e8e57d330ac5269a987d5", null, "45f33d7d-2833-4915-bfae-3054530a8708",
                                  new Date(1562657745553L), -83, null, "ad803.220b5@feb07.fr", false,
                                  "6573e6bb-29da-4495-add0-459b647f8d10", "5cc1ad15aa5e8e57d330ac5269a987d5", true,
                                  true, false, -69, null, null, "a3b76e33-bd01-41a1-b1a3-71cc91c8017c", 51,
                                  "375a21dc-47d0-42ae-933c-53dbc22a92f4", UserStatus.getDefault(), null,
                                  new Date(1562657744962L), "._5._K");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotNull(user3);
            assertNotSame(user2, user1);
            assertNotSame(user3, user1);
            assertEquals(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user1, user2);
            assertEquals(user1, user1);
            assertFalse(user1.equals(null));
            assertNotEquals(user3, user1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

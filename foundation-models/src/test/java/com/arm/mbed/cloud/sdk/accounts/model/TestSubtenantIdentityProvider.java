// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantIdentityProvider.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantIdentityProvider {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantIdentityProvider subtenantidentityprovider1 = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 new Date(1610683992562L),
                                                                                                 "16d0a5bf-7fe9-4b4a-b038-c4fba8eac6ac",
                                                                                                 "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 true,
                                                                                                 "f515a65d-570c-4027-bc5d-15b5253b5284",
                                                                                                 new OidcRequest(),
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1610683989917L));
            SubtenantIdentityProvider subtenantidentityprovider2 = subtenantidentityprovider1.clone();
            assertNotNull(subtenantidentityprovider1);
            assertNotNull(subtenantidentityprovider2);
            assertNotSame(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
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
            SubtenantIdentityProvider subtenantidentityprovider1 = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 new Date(1610683994693L),
                                                                                                 "2c56c52d-55d9-44dc-a0ef-c3a2043fb12b",
                                                                                                 "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 true,
                                                                                                 "9d12b74c-8f1b-4715-a237-cebbccf18c8a",
                                                                                                 new OidcRequest(),
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1610683994750L));
            SubtenantIdentityProvider subtenantidentityprovider2 = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 new Date(1610683994693L),
                                                                                                 "2c56c52d-55d9-44dc-a0ef-c3a2043fb12b",
                                                                                                 "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 true,
                                                                                                 "9d12b74c-8f1b-4715-a237-cebbccf18c8a",
                                                                                                 new OidcRequest(),
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1610683994750L));
            assertNotNull(subtenantidentityprovider1);
            assertNotNull(subtenantidentityprovider2);
            assertNotSame(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2.hashCode(), subtenantidentityprovider1.hashCode());
            int hashCode = subtenantidentityprovider1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantidentityprovider1.hashCode());
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
        SubtenantIdentityProvider subtenantidentityprovider = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                            new Date(1610683994575L),
                                                                                            "67cf8acd-7c4a-4392-8803-0ae6c6b53a35",
                                                                                            "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                            true,
                                                                                            "36aae36d-c0ba-45d3-bb9b-99be230497d3",
                                                                                            new OidcRequest(), null,
                                                                                            SubtenantIdentityProviderStatus.getDefault(),
                                                                                            new Date(1610683988039L));
        assertTrue(subtenantidentityprovider.isValid());
        SubtenantIdentityProvider subtenantidentityproviderInvalid = new SubtenantIdentityProvider(null,
                                                                                                   new Date(1610683988620L),
                                                                                                   "22d2d87d-57b4-4737-9c88-94d56b5ea4cd5637aaac-1abb-4e3d-870d-3f1746adfb72ae9de4a4-d404-4554-8598-21b06618a71414e02103-b0d0-48de-be0b-6d121e6d872b8554d059-a047-45c7-b9c1-a1d9859d5c40b654ecb8-585a-4027-88b4-a4edaaffadb9460a50fc-105f-4afd-b864-7974505f03fec425da8d-a407-4baf-bdc4-8a9b298275abec942dd7-22c9-46c4-a0cb-620812227a1678f0206a-6065-4b53-875a-c439820d8699ec1cc632-6225-471c-9b12-8dd138d533babec18b57-5351-4425-b213-cf38aef5688e78d48eb3-08c5-45f4-967d-184934da6cc7e4c6f848-15f5-4827-a812-7f78e23428f3",
                                                                                                   "\u001a뺳@ꩵ@窥VUD\u000eA.L=GZ⼔�?�W \u0011\u000f敃�?<R>뜲�??�?�T/<-縭 쨊\u0007Y'쪹�?�//,䔑X,Q\u000b᪔S�?�฾=픗(,�?�^\u000e",
                                                                                                   true, null,
                                                                                                   new OidcRequest(),
                                                                                                   null,
                                                                                                   SubtenantIdentityProviderStatus.getDefault(),
                                                                                                   new Date(1610683992184L));
        assertFalse(subtenantidentityproviderInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantIdentityProvider subtenantidentityprovider1 = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 new Date(1610683990126L),
                                                                                                 "8b6b5e6f-9203-4a51-b43b-274d29136d65",
                                                                                                 "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 true,
                                                                                                 "4b95e2b2-2531-4170-b69b-b771c22a31c9",
                                                                                                 new OidcRequest(),
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1610683985834L));
            SubtenantIdentityProvider subtenantidentityprovider2 = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 new Date(1610683990126L),
                                                                                                 "8b6b5e6f-9203-4a51-b43b-274d29136d65",
                                                                                                 "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 true,
                                                                                                 "4b95e2b2-2531-4170-b69b-b771c22a31c9",
                                                                                                 new OidcRequest(),
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1610683985834L));
            SubtenantIdentityProvider subtenantidentityprovider3 = new SubtenantIdentityProvider("3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 new Date(1610683987096L),
                                                                                                 "872867b0-776d-4977-9531-e4db10eb1308",
                                                                                                 "3b2c98a6b0d3341e5184f0f766dde798",
                                                                                                 true,
                                                                                                 "a527cd0a-bd5f-4067-a279-aa3227f2da1d",
                                                                                                 new OidcRequest(),
                                                                                                 null,
                                                                                                 SubtenantIdentityProviderStatus.getDefault(),
                                                                                                 new Date(1610683989465L));
            assertNotNull(subtenantidentityprovider1);
            assertNotNull(subtenantidentityprovider2);
            assertNotNull(subtenantidentityprovider3);
            assertNotSame(subtenantidentityprovider2, subtenantidentityprovider1);
            assertNotSame(subtenantidentityprovider3, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider2, subtenantidentityprovider1);
            assertEquals(subtenantidentityprovider1, subtenantidentityprovider2);
            assertEquals(subtenantidentityprovider1, subtenantidentityprovider1);
            assertFalse(subtenantidentityprovider1.equals(null));
            assertNotEquals(subtenantidentityprovider3, subtenantidentityprovider1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

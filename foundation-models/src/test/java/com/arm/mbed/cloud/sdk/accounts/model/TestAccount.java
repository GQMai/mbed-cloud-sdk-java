// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Account.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestAccount {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Account account1 = new Account("9f058d28-e85d-4577-a43c-e53747ce649d",
                                           "2cbc5ac7-241b-4c07-8a09-223f5bb95fdf", "70166.a7a90@0e150.me",
                                           "57d45e85-f679-454f-a70b-2e93bcc38b71", "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           "79788182-8bca-454b-bc96-e96a0c5ff9e9",
                                           "ff494476-4fe1-408d-aff7-989c13e32bd7",
                                           "39c36310-7f9f-4275-ac16-9eff738c52af", null,
                                           "e92e64e0-813f-4014-a6a0-e1e3c2b64155",
                                           "b5943b6d-1329-475b-b3ed-bb46581883de",
                                           "59c3dab3-c7e8-48c4-aa3c-80adb2519cf1",
                                           "d98dc698-af03-4532-bd33-08c992c7d06e",
                                           "806290c5-23c4-49ac-a17f-b4ea32102203", new Date(1558096106082L), null,
                                           "dcd0fdc9-2bd1-4611-8803-9e58b6cb5fd7",
                                           "4f0329e6-f8be-4bfa-adee-ebe57e3da04d", "9fc54.1639f@a5c6b.me",
                                           "ad663c8f-1b2a-4bdb-bc77-2b46b3172009", new Date(1558096103174L), 1,
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 86, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           new PasswordPolicy(), 1, "f4d16bdd-f5fc-4744-ae07-24a496232c20", null,
                                           "8f1ca0af-b3f3-4667-9672-f839ffd9f964",
                                           "054b1c54-fbfa-45b5-9527-f01ee039f598",
                                           "a8431111-c38d-4e02-9157-2dcda6c034a9", "a10f9.06112@cccde.fr",
                                           "b723b8c3-149f-494b-b8d7-e3f77e4b6597", AccountStatus.getDefault(),
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "e9d9bc06-2e88-4638-9bd9-5c3634c8923c",
                                           new Date(1558096108235L), new Date(1558096101428L));
            Account account2 = account1.clone();
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotSame(account2, account1);
            assertEquals(account2, account1);
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
            Account account1 = new Account("7b4bcd30-fd87-43eb-8c3a-6bd322f5495e",
                                           "d93afb6c-c836-4f28-a6eb-d02f2ab9cf14", "7a12e.7a03a@09149.me",
                                           "254fae83-ee2a-4b40-96a3-342e75379bfe", "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           "657f387d-d825-4a0d-9e1c-5ef90fcc4ead",
                                           "b8b4d439-06c6-49d2-b1d6-072b371cc583",
                                           "60e5b81f-722a-4977-a6b3-9891d2c86a62", null,
                                           "96751835-74d5-42f1-8bbc-15251f366eb9",
                                           "91f4435b-085a-409b-9624-ea688fdf7560",
                                           "45b2964c-76c8-49b3-b0b7-4f6e65d8aebc",
                                           "4d0d2955-b03f-4171-b267-e142be885649",
                                           "e4f19cb9-a173-475a-a31d-f552df1e1698", new Date(1558096104609L), null,
                                           "e7f05f30-84c5-4f52-bf97-7af0813da3fd",
                                           "75a1a651-39b3-4d99-ab5e-e34789340e71", "8c597.deeb0@1e2a8.fr",
                                           "1826fdf1-c46b-48e6-a048-9d9ab05c09fd", new Date(1558096102320L), 1,
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           new PasswordPolicy(), 1, "225447e3-b478-419f-96fb-4385dd686196", null,
                                           "9a02f7da-2160-4784-bfc7-443c393176e5",
                                           "8ccd366d-8ca0-4eba-ba11-d3257a5d945b",
                                           "fc2b8397-0036-4505-b376-64bdcd0a34c0", "45736.ebb0e@b2bae.me",
                                           "16e44390-85cb-47eb-b17e-41d52e72cc06", AccountStatus.getDefault(),
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "dd338ee1-651a-4e23-9e3b-c9bc69e86fbb",
                                           new Date(1558096106707L), new Date(1558096106517L));
            Account account2 = new Account("7b4bcd30-fd87-43eb-8c3a-6bd322f5495e",
                                           "d93afb6c-c836-4f28-a6eb-d02f2ab9cf14", "7a12e.7a03a@09149.me",
                                           "254fae83-ee2a-4b40-96a3-342e75379bfe", "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           "657f387d-d825-4a0d-9e1c-5ef90fcc4ead",
                                           "b8b4d439-06c6-49d2-b1d6-072b371cc583",
                                           "60e5b81f-722a-4977-a6b3-9891d2c86a62", null,
                                           "96751835-74d5-42f1-8bbc-15251f366eb9",
                                           "91f4435b-085a-409b-9624-ea688fdf7560",
                                           "45b2964c-76c8-49b3-b0b7-4f6e65d8aebc",
                                           "4d0d2955-b03f-4171-b267-e142be885649",
                                           "e4f19cb9-a173-475a-a31d-f552df1e1698", new Date(1558096104609L), null,
                                           "e7f05f30-84c5-4f52-bf97-7af0813da3fd",
                                           "75a1a651-39b3-4d99-ab5e-e34789340e71", "8c597.deeb0@1e2a8.fr",
                                           "1826fdf1-c46b-48e6-a048-9d9ab05c09fd", new Date(1558096102320L), 1,
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           new PasswordPolicy(), 1, "225447e3-b478-419f-96fb-4385dd686196", null,
                                           "9a02f7da-2160-4784-bfc7-443c393176e5",
                                           "8ccd366d-8ca0-4eba-ba11-d3257a5d945b",
                                           "fc2b8397-0036-4505-b376-64bdcd0a34c0", "45736.ebb0e@b2bae.me",
                                           "16e44390-85cb-47eb-b17e-41d52e72cc06", AccountStatus.getDefault(),
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "dd338ee1-651a-4e23-9e3b-c9bc69e86fbb",
                                           new Date(1558096106707L), new Date(1558096106517L));
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotSame(account2, account1);
            assertEquals(account2, account1);
            assertEquals(account2.hashCode(), account1.hashCode());
            int hashCode = account1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, account1.hashCode());
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
        Account account = new Account("cbc49dbd-e3b2-4456-a5ab-e87a1980bd42", "bda48c75-7f2c-4084-8864-f69b3dfffebb",
                                      "77727.23ebc@57108.fr", "8372d6ce-342a-40a9-b018-fc4d2e800a44",
                                      "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "d3af6639-592d-46e0-80b6-fc9a9f2b78fc",
                                      "367c1a7b-87a6-4bbc-9581-306672e4ecb6", "ee5932f3-a6f8-44f5-a864-7d5ee81eeb4c",
                                      null, "9ee43186-53dc-4753-a165-a69f78336f65",
                                      "aa29ff31-2964-4046-93ff-fd6ea2faecb9", "d0dc46cc-0647-4e71-be57-1c02439f832f",
                                      "a57ed600-3e64-4d14-bed4-2638819a698f", "ab8a0280-8f42-4853-a167-7ceebf826a3e",
                                      new Date(1558096103529L), null, "d25dd903-ea89-4b29-91a2-c10c092535c0",
                                      "baf667a5-1609-45a6-96d4-3b17f5d9f62b", "def61.d0fa7@fcf59.me",
                                      "5545071b-9194-4c56-9a69-d12ae96a55f0", new Date(1558096104375L), 102,
                                      "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 1, null, AccountMfaStatus.getDefault(), null,
                                      new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9", new PasswordPolicy(), 1,
                                      "2ee33ac7-8214-4f5e-a18c-0aa31933c69a", null,
                                      "d43650ee-5966-4c17-9bcb-a2a80c84b812", "9d623d0d-d081-4f4d-850b-3771a5dd2dbb",
                                      "c02cf1a6-0027-422c-a80a-fc9e21f013ac", "386af.6c05b@5eaa1.me",
                                      "e94f1373-16bc-4908-9b09-9b2eb38faaf3", AccountStatus.getDefault(),
                                      "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "7fad8e0b-309c-4ed1-a84b-678748697da8",
                                      new Date(1558096102299L), new Date(1558096105401L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("7a2d0797-bae1-4135-af02-679075bf9790aa1e5991-00a9-4536-8e7e-90a9c8b8d5d5629acba4-bd8d-4fd7-b225-e594becf354a",
                                             "bc58ba01-ff1c-4575-a825-746af149fd24d39f21ff-9bc0-42c8-9b86-2f9e7bacf6127829766a-e952-4c57-b890-a972ef3f0931",
                                             ">�?\u0003আ%>>\u000e⽘ᣗሬ>ﺆ♧㤻9�?\u0019ⴑ嚾ဇ>姷>蓉ᡠ>ഺܒ໠�?�\u0016➖0\t�?℞�?�䓹\u0001Ү٪\u0010裸殺>\u0014\u0007ﺼ;\u000f>\u001a\u000b㒋4",
                                             "17d2b50a-a459-449a-91ca-8cc27a03eb418ee38941-ca60-4b44-b653-84317ec8e5820b24e2e5-00da-4d3e-b5c5-cf3073b64911",
                                             "2@T^&72V2\u00112_8�?@7M훆C7#\u000e728N822?288=7摞\u0000*E8\u0005\u0014콴TK22VӟT@\u0001$$Y+\f87龧7巭",
                                             "1f687c3d-4a98-403a-81a3-d6a313ea81c3",
                                             "05364705-62ce-408a-987a-b8931ea34c1a71e9b3ee-f6d8-46ae-baa3-dd957399246e0d767e8f-e4ab-4d38-876d-b03d6ced1381",
                                             "593b6d84-c11b-4e91-af22-b737d74df216", null,
                                             "b7c4f298-5a44-424a-95b6-1e20fb357a4d40c79f66-935d-4545-aae2-fcfdd25ce799bc4c7494-20f6-4a66-904d-732b5cd1f461",
                                             "071d1ce4-7ce0-41d2-b02f-4294d7bb18a667eb0163-198b-43c7-9b92-7bf0c452f9c90278624c-c139-42a2-848b-51db71fbe672",
                                             "07422bc8-9dde-4301-9599-3653bd17ed7d103430db-3c89-425d-830c-502f74a910d20cd3224b-237f-4e1f-8074-02d5709eaefa",
                                             "8f34729a-2c04-4b60-a948-0dc1a62955bb",
                                             "6381dbfb-98f1-4793-ba6b-31d07b60fbf8d8aaa02e-99d7-43e9-b6aa-9b76965b8c2d726f7419-f2d2-49ff-9315-7653a933a211",
                                             new Date(1558096108641L), null, "f3851dff-7dde-4ff0-8cb4-be1e1b7dfd00",
                                             "5c95c8e0-ece1-4760-8093-6448aa5edea51bce444f-6bdb-4997-9c8b-e61079539c72d5dc4e1d-5d87-4fd4-814c-9ba69b370b44",
                                             ">�?\u0003আ%>>\u000e⽘ᣗሬ>ﺆ♧㤻9�?\u0019ⴑ嚾ဇ>姷>蓉ᡠ>ഺܒ໠�?�\u0016➖0\t�?℞�?�䓹\u0001Ү٪\u0010裸殺>\u0014\u0007ﺼ;\u000f>\u001a\u000b㒋4",
                                             null, new Date(1558096106429L), 180 + 1,
                                             "2@T^&72V2\u00112_8�?@7M훆C7#\u000e728N822?288=7摞\u0000*E8\u0005\u0014콴TK22VӟT@\u0001$$Y+\f87龧7巭",
                                             120 + 1, null, AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                             "2@T^&72V2\u00112_8�?@7M훆C7#\u000e728N822?288=7摞\u0000*E8\u0005\u0014콴TK22VӟT@\u0001$$Y+\f87龧7巭",
                                             new PasswordPolicy(), 45 + 1,
                                             "cc5559dd-d4cb-49c4-8934-277d90d93bcec3b97106-805c-4a51-a83b-ea291c1dc615e4a209a1-daa1-429b-8f45-839d2d7df457",
                                             null,
                                             "25328ec9-3736-49ab-bb0b-a3cfa6a73d90b146c7b6-1587-4391-a07a-4dc98a8235d5f33be733-0404-4c30-9026-09cb7508bc7f",
                                             "b4dc491f-43d6-42d0-91f6-aadefa87ac16",
                                             "721ad7b4-1b9c-476d-b3ec-7e8757eedb50",
                                             ">�?\u0003আ%>>\u000e⽘ᣗሬ>ﺆ♧㤻9�?\u0019ⴑ嚾ဇ>姷>蓉ᡠ>ഺܒ໠�?�\u0016➖0\t�?℞�?�䓹\u0001Ү٪\u0010裸殺>\u0014\u0007ﺼ;\u000f>\u001a\u000b㒋4",
                                             "2cf73ad6-2c79-49d6-997b-9a5b7122f74846ee6fcf-8b78-46af-b3c4-b0bebfa68eaa0900d92a-98f7-4615-a321-22ae7f4dd426",
                                             AccountStatus.getDefault(),
                                             "2@T^&72V2\u00112_8�?@7M훆C7#\u000e728N822?288=7摞\u0000*E8\u0005\u0014콴TK22VӟT@\u0001$$Y+\f87龧7巭",
                                             "d732dbc5-589c-4317-b9df-5a219cc53c9b", new Date(1558096102264L),
                                             new Date(1558096102973L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("e8d01905-4dbd-4e5c-ade8-f6c9f2fe317d",
                                           "9fd25de0-d5ba-4998-a46d-ae256a04075a", "cc073.8b020@5ddfd.fr",
                                           "cd4f2040-1971-4e88-97f3-f3f7b4abe1c3", "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           "0686dc39-be2a-4eea-b16d-7cdf3a03a788",
                                           "dcd2e4f9-1ef8-4f1f-bd92-764d8dfeef17",
                                           "11903add-e332-4b3f-b9f3-79dba30a1940", null,
                                           "3250d08b-05f0-4063-87aa-ffa3729aeff0",
                                           "d712767c-faf1-4640-88fa-709b943f1813",
                                           "a2ed0d3f-a578-4e7d-a767-d2760f17aed6",
                                           "2a9f672e-63c8-483d-83cf-a01009d96f79",
                                           "9b7a8ff6-362e-49aa-8240-d87e6162dad8", new Date(1558096104900L), null,
                                           "5241be67-d0c3-48d1-9ba7-a44fc8456e01",
                                           "89d1784f-c909-4a50-9ecd-e926415533c1", "3dfe1.b9c21@24346.fr",
                                           "232392fd-047a-45cf-b931-6e5bf8e4be29", new Date(1558096102373L), 113,
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           new PasswordPolicy(), 1, "03f0b35c-1c17-4450-87e2-d6f11747f355", null,
                                           "bbfa94f8-b5a9-416f-986f-1233e93e8cee",
                                           "68ad865b-b668-475e-9102-fb24cecd4611",
                                           "e48939de-0f04-4627-ba28-b11ce4eeb779", "a5ede.bd54d@7fdfc.me",
                                           "0f37f183-71af-4b98-8df8-e58a8b5d2896", AccountStatus.getDefault(),
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "6f063afa-405d-46c8-81f6-a18f8dab593e",
                                           new Date(1558096100352L), new Date(1558096106259L));
            Account account2 = new Account("e8d01905-4dbd-4e5c-ade8-f6c9f2fe317d",
                                           "9fd25de0-d5ba-4998-a46d-ae256a04075a", "cc073.8b020@5ddfd.fr",
                                           "cd4f2040-1971-4e88-97f3-f3f7b4abe1c3", "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           "0686dc39-be2a-4eea-b16d-7cdf3a03a788",
                                           "dcd2e4f9-1ef8-4f1f-bd92-764d8dfeef17",
                                           "11903add-e332-4b3f-b9f3-79dba30a1940", null,
                                           "3250d08b-05f0-4063-87aa-ffa3729aeff0",
                                           "d712767c-faf1-4640-88fa-709b943f1813",
                                           "a2ed0d3f-a578-4e7d-a767-d2760f17aed6",
                                           "2a9f672e-63c8-483d-83cf-a01009d96f79",
                                           "9b7a8ff6-362e-49aa-8240-d87e6162dad8", new Date(1558096104900L), null,
                                           "5241be67-d0c3-48d1-9ba7-a44fc8456e01",
                                           "89d1784f-c909-4a50-9ecd-e926415533c1", "3dfe1.b9c21@24346.fr",
                                           "232392fd-047a-45cf-b931-6e5bf8e4be29", new Date(1558096102373L), 113,
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 1, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           new PasswordPolicy(), 1, "03f0b35c-1c17-4450-87e2-d6f11747f355", null,
                                           "bbfa94f8-b5a9-416f-986f-1233e93e8cee",
                                           "68ad865b-b668-475e-9102-fb24cecd4611",
                                           "e48939de-0f04-4627-ba28-b11ce4eeb779", "a5ede.bd54d@7fdfc.me",
                                           "0f37f183-71af-4b98-8df8-e58a8b5d2896", AccountStatus.getDefault(),
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "6f063afa-405d-46c8-81f6-a18f8dab593e",
                                           new Date(1558096100352L), new Date(1558096106259L));
            Account account3 = new Account("e4fb95f2-d082-4c6a-b94d-754f4a0d84ad",
                                           "2011547d-2cae-48f4-9b21-ba38fe41b3a4", "f69cb.1ca1a@47d43.fr",
                                           "72a30dd6-f360-4f12-808a-3291f677ca59", "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           "dc5963cb-9b6e-428d-a106-449f1d7b781d",
                                           "1e77edd4-c88c-47cb-9f4e-eb43c27e5dec",
                                           "ee6ef3b8-25f5-403c-b048-ec9c86e65b76", null,
                                           "ae7d17df-fb6d-4cbe-bd9a-b3a10841c33a",
                                           "c4a1950b-3b09-4104-9e5e-8963687a0c86",
                                           "fd8e8d38-c2b3-49f8-b9e6-b7ef5f11981c",
                                           "f10baa23-9745-4a82-85a1-fab6c7df69a8",
                                           "2fd8f42b-7c5f-46d1-bb01-e60070f9df5f", new Date(1558096102602L), null,
                                           "8d8fb451-a44f-418b-8316-9365cce24bc5",
                                           "e11261e0-5cf7-4266-98f3-e27911b2778d", "25a71.5941a@d86a5.fr",
                                           "f26db712-203f-4c4c-be69-f15d62f63a7e", new Date(1558096109264L), 1,
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", 19, null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "bf46f5afa631cc54fbbfd0f5b5ecdbe9",
                                           new PasswordPolicy(), 1, "1eebb994-ef46-4902-9f76-a260ee4d3bcd", null,
                                           "9b712b28-621a-4cf9-9b86-77810908af91",
                                           "c25c979d-f2cd-42cf-bbf4-ab01e8f857a0",
                                           "8135b814-b9bd-451b-af73-66bf9637ca04", "7c067.568cf@802b8.me",
                                           "4698fa46-d036-46b1-a3ca-b27c7302defe", AccountStatus.getDefault(),
                                           "bf46f5afa631cc54fbbfd0f5b5ecdbe9", "8d64f115-ebb7-4637-9c73-9d99498550ba",
                                           new Date(1558096105471L), new Date(1558096100870L));
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotNull(account3);
            assertNotSame(account2, account1);
            assertNotSame(account3, account1);
            assertEquals(account2, account1);
            assertEquals(account2, account1);
            assertEquals(account1, account2);
            assertEquals(account1, account1);
            assertFalse(account1.equals(null));
            assertNotEquals(account3, account1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

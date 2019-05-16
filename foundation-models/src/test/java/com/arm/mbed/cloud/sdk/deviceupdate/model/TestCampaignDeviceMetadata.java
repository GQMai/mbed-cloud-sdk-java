// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CampaignDeviceMetadata.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignDeviceMetadata {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("c214dc7b-ce50-4ff8-ba87-cbd2ce7b51b6",
                                                                                        new Date(1557969578890L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "1b72ff99-7259-4462-b24e-9c81e252bfca",
                                                                                        "8a71530a-07fa-414c-a56e-d76aea3ed30c",
                                                                                        "7f0bc5d1-5eca-44c5-871e-b9b27c5097c0",
                                                                                        "37d2119b-7676-41e9-aee1-1bee3a262095",
                                                                                        "709ea38c-cbed-4cc1-9af5-be7e939ca208",
                                                                                        "0d7b24e3-3cac-43d2-a4f0-f393344356b8",
                                                                                        new Date(1557969579034L));
            CampaignDeviceMetadata campaigndevicemetadata2 = campaigndevicemetadata1.clone();
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
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
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("181c9638-7693-4fb2-a5f3-9df16aef1a08",
                                                                                        new Date(1557969578780L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "4ccecc64-88e8-46ae-973d-622e3d7675f2",
                                                                                        "71cac546-a7d0-440d-b473-939281ce1eb8",
                                                                                        "36a65e9c-2443-413c-919b-b2726a73e925",
                                                                                        "9a8c8a1c-c76d-4b25-a7ed-c83df815aaf6",
                                                                                        "45e2ca87-2a71-4ba4-9261-25c693fdab99",
                                                                                        "cf164bc0-b8fe-4a1d-9741-a11c43115991",
                                                                                        new Date(1557969578773L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("181c9638-7693-4fb2-a5f3-9df16aef1a08",
                                                                                        new Date(1557969578780L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "4ccecc64-88e8-46ae-973d-622e3d7675f2",
                                                                                        "71cac546-a7d0-440d-b473-939281ce1eb8",
                                                                                        "36a65e9c-2443-413c-919b-b2726a73e925",
                                                                                        "9a8c8a1c-c76d-4b25-a7ed-c83df815aaf6",
                                                                                        "45e2ca87-2a71-4ba4-9261-25c693fdab99",
                                                                                        "cf164bc0-b8fe-4a1d-9741-a11c43115991",
                                                                                        new Date(1557969578773L));
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2.hashCode(), campaigndevicemetadata1.hashCode());
            int hashCode = campaigndevicemetadata1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaigndevicemetadata1.hashCode());
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
        CampaignDeviceMetadata campaigndevicemetadata = new CampaignDeviceMetadata("2ad01f67-0792-4ad1-bdef-2d801fa7515c",
                                                                                   new Date(1557969569928L),
                                                                                   CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                   "44f3d4c1-b1ed-4eff-a1ef-d6edbbb9c9a2",
                                                                                   "92502d8d-eda2-40f5-84b3-d3e630ddca4d",
                                                                                   "a24db953-805f-474c-beff-646f084ef5fa",
                                                                                   "2b75817c-4a9e-45f3-9821-c6e30b1dacfc",
                                                                                   "28ba3413-4be2-419e-82c3-469dcedb0ede",
                                                                                   "0bfbbb50-488f-4a10-bade-15f0fa819807",
                                                                                   new Date(1557969578086L));
        assertTrue(campaigndevicemetadata.isValid());
        CampaignDeviceMetadata campaigndevicemetadataInvalid = new CampaignDeviceMetadata(null,
                                                                                          new Date(1557969578556L),
                                                                                          CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                          "2959dbbb-5516-42ff-815a-ec296a345c4b336bf289-3fbc-4983-86e2-9955f3df9a9f7c703bc4-4cbc-4bb6-950f-e967911551272d5d4ff5-b902-4c0e-a295-05f87b7a17d704c92c06-e0ae-4157-85a8-9c9fd513165cd4178d1b-7f7d-463a-ba45-e260b05d20cb54e555bf-612c-4e25-85cb-1b116c133bd74f687f8d-d2bd-45d3-8645-0532b0977950d62bfddc-90ef-411b-9d08-f8e438cd4b812290dd37-f506-49bc-819a-9a0caaf405fad7fca07a-c6df-4540-80df-ce0bba9be2f8baa91ac9-6567-4b37-b3d6-0535ceef88979ffb0c77-9eca-43fb-9e73-114b8a814b79ed97d309-917d-44bd-9b64-a7361b20fc655ac3ec6e-b7f1-478b-ba1d-93eacc57b1ccb6c3d9a2-d6f1-4ae9-bd11-8f38984afe7542a8d11e-c271-4e00-914c-f5a60ba250d9676a3b01-c19e-4578-9e9b-2caef05c9aaacc5c9e3a-bdcb-4d6e-9b61-b62615a380142d096c37-0840-4617-8d7a-9e4b93818b03f7ec30ee-c3b6-4354-b156-19933aac238003f9e167-0695-4fa9-a985-a6b03df79ddffd7d2ca7-6ac3-4647-8c35-09a5ffdebfd012d8e254-2ad1-454c-866d-d7a7ac4ecc91a5b85186-5918-4de0-9a93-8dabe1b2dfe3537cfdf2-e0b2-4d62-b8a5-d6441adfa76724e0262e-f355-4b56-9f56-8cbfad7008401b0f9847-f56c-4501-aa49-54e925a4a6588f911022-cc7f-4bed-b2c6-8f603578ef58a01b15d7-7171-4655-83bf-c12d1436d91227eb94a6-f003-4acc-9b4d-83552d79a75bf5192d80-00b0-481b-aa1f-e98712f0deddbe693d75-c2d9-445d-8204-541eed841bb61c70b6b4-1a7f-4ee3-b196-644880fea688abac969e-afb6-4b58-ada1-7601b86a09afd82a8c21-bb54-4a2b-98d9-aa8de7ab9a251d7cd0dd-9c5c-4560-93eb-8be2fc45a7775cfb3747-1f5e-4432-8028-0093f19c21f1c7b0ff07-7408-44f0-b871-01ddd4642c293c302558-96d1-4ef4-9420-404c4053fca31dec572e-9f02-45fe-a7c0-44a1cdcd5c0cd7e1a6a1-0a4d-4bad-bb55-831622b3aea477175362-3fef-4adc-8eb2-95ad5fc4b2d70cdf9989-bc96-492a-a805-af05fd99d16b4fd62d91-4b1f-45c0-b78d-414f344c9613e9079cf1-6a3b-4550-bcda-2dad9e178a64005eb8cc-56d3-4043-bcc0-b9e52fcc09f6e99f8a39-41aa-4741-8824-60d6e5c8503c734edaee-61b1-40c5-a527-2c639ca9352a49c19f53-d8d4-4d7a-ad5e-f4160c6845a5ee60cae6-e546-4b0a-9c47-ea527cb64e38e4193029-a92e-4165-b500-b08c0957ec0843a7f8dc-0410-4457-ac3c-76064d38d29c9c31d04c-18e3-43a4-8d73-eaefc0956229873302de-2fe3-4b85-a6f9-b0be5cf76648716876a4-d8a0-4722-b807-f5d9693dafd9",
                                                                                          "8e4ecbb1-92fe-456a-851d-762cf0e82618",
                                                                                          "574af188-5881-42a7-8a35-e965a137a7fb",
                                                                                          "b673bda4-cc92-4213-91d4-7071cfdd29ce",
                                                                                          "ae617ca6-1053-497a-96dd-c82167ad41ed",
                                                                                          "bf173694-a0f5-4c7e-b532-45eb09a607f3305e85df-345b-4636-bf56-7f0bc439f5731045cd22-5af9-46c2-8b7f-749190db4e48ff615c1c-be56-40c7-96e3-6f0a2b983f40",
                                                                                          new Date(1557969578325L));
        assertFalse(campaigndevicemetadataInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("981a8b03-2d8c-415d-9289-44f3e2486c34",
                                                                                        new Date(1557969577882L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "d42b59bf-cd4a-4c1b-b884-e8ecf9d41dd1",
                                                                                        "50666b2e-1584-4069-83fe-f3b72a0e841e",
                                                                                        "0d5b31bf-ad21-4918-82c4-7254eb299b94",
                                                                                        "8e2b76ac-cc29-44bd-9700-dd90de223c5c",
                                                                                        "671c7ac2-5712-4a17-a420-0cfb0a4cac32",
                                                                                        "3a356012-f44d-43cd-8930-c62ee3a0cc5e",
                                                                                        new Date(1557969576274L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("981a8b03-2d8c-415d-9289-44f3e2486c34",
                                                                                        new Date(1557969577882L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "d42b59bf-cd4a-4c1b-b884-e8ecf9d41dd1",
                                                                                        "50666b2e-1584-4069-83fe-f3b72a0e841e",
                                                                                        "0d5b31bf-ad21-4918-82c4-7254eb299b94",
                                                                                        "8e2b76ac-cc29-44bd-9700-dd90de223c5c",
                                                                                        "671c7ac2-5712-4a17-a420-0cfb0a4cac32",
                                                                                        "3a356012-f44d-43cd-8930-c62ee3a0cc5e",
                                                                                        new Date(1557969576274L));
            CampaignDeviceMetadata campaigndevicemetadata3 = new CampaignDeviceMetadata("2106ee35-895e-4314-bd1b-cec786476f97",
                                                                                        new Date(1557969572428L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "4f5fb36a-fd57-45f9-9afd-5410ee029bf0",
                                                                                        "6e98bfe5-b82e-45aa-9dc4-dc772dd89f9b",
                                                                                        "bdd07252-52c0-4283-a46d-2baa07af5150",
                                                                                        "76e97339-bf1a-4b14-9a2a-4b4dfa05b6e6",
                                                                                        "50671fd1-f770-479f-8935-31efacdee1fb",
                                                                                        "f738ae17-aa2c-472e-af9c-673febdbda6a",
                                                                                        new Date(1557969569525L));
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotNull(campaigndevicemetadata3);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertNotSame(campaigndevicemetadata3, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata1, campaigndevicemetadata2);
            assertEquals(campaigndevicemetadata1, campaigndevicemetadata1);
            assertFalse(campaigndevicemetadata1.equals(null));
            assertNotEquals(campaigndevicemetadata3, campaigndevicemetadata1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
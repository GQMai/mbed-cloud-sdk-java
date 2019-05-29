// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Device.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDevice {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Device device1 = new Device("1e515fc9-9f6d-4199-9658-7709f4455221", false, new Date(1559147596252L),
                                        new Date(1559147601166L), "5473d956-d124-4cd7-8653-1c3a559f531b",
                                        new Date(1559147594377L), new Date(1559147596404L), null,
                                        DeviceDeployedState.getDefault(), "fc029167-338b-4b0f-ada4-4a96d61b84da",
                                        "5e54f8eb-159f-44b5-a289-1eb4effcade3", "4060cb39-53c3-4df2-9b58-dfa8a8e", 17,
                                        "e26bcb12-5614-4b57-9237-85d5f6131dcb", "3c9ff09f-ce8d-47a3-868c-ff24afb1ec58",
                                        "07b38c7f-626c-466a-a49c-6cd6703f938d", new Date(1559147592406L),
                                        "fb320011-8933-41bd-be1a-79a4df486e56", "9128586f-e7e0-4c8a-90fe-6ce4d8623cb7",
                                        "91e117a4-4c3f-4786-a0c0-5be95e966d62",
                                        "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                        "08485596-a230-46b5-8dba-5f4cdd4b6aa3", new Date(1559147595081L),
                                        DeviceMechanism.getDefault(), "60c80d1f-f097-4a09-9e61-22b95f71bf28",
                                        "290883c6-80a1-4c13-897f-b890a9ef885c", "3d3ef5a8-8266-4105-b5a8-c2e5f61803a2",
                                        DeviceState.getDefault(), new Date(1559147596999L),
                                        "42c60dde-113f-470a-be89-0a7fd6daacc5");
            Device device2 = device1.clone();
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotSame(device2, device1);
            assertEquals(device2, device1);
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
            Device device1 = new Device("311e7636-9029-41b0-a9d5-6e8d400d96a6", true, new Date(1559147597213L),
                                        new Date(1559147595494L), "1e5ee6eb-6c01-4673-b04a-f1338ad9404c",
                                        new Date(1559147596472L), new Date(1559147599451L), null,
                                        DeviceDeployedState.getDefault(), "3a3ce771-5044-4277-bfff-1b1d3ce7dbe1",
                                        "b7cfd508-0d79-47f6-95d9-a9ae0a1fa687", "38acc7ba-afe6-4706-934f-f2c5e9b", 55,
                                        "205630e4-0e5a-4ada-a089-577874ca0878", "3d9c5357-907e-4288-90cd-412d8efe18a0",
                                        "c7b0af0d-ebbd-41ce-ae5e-34ee44cc847c", new Date(1559147593102L),
                                        "b206816b-b494-43b6-bfe6-333b6001b3c3", "26fed626-e8a8-41c8-bc9b-df4d0fae825e",
                                        "09520cd3-816d-4366-b204-57758c2f3f74",
                                        "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                        "fd94e2ca-49f5-4353-8511-0dfd02e04dad", new Date(1559147594116L),
                                        DeviceMechanism.getDefault(), "beec3c54-692a-4f12-a8c5-75afa1eb76fe",
                                        "6a1d7586-0913-42e9-a930-d740037f2b59", "eeaf50f8-5ff4-425d-912e-d557523444ce",
                                        DeviceState.getDefault(), new Date(1559147598744L),
                                        "212f8f9c-d0a3-4809-9bb3-92f9fc42ea00");
            Device device2 = new Device("311e7636-9029-41b0-a9d5-6e8d400d96a6", true, new Date(1559147597213L),
                                        new Date(1559147595494L), "1e5ee6eb-6c01-4673-b04a-f1338ad9404c",
                                        new Date(1559147596472L), new Date(1559147599451L), null,
                                        DeviceDeployedState.getDefault(), "3a3ce771-5044-4277-bfff-1b1d3ce7dbe1",
                                        "b7cfd508-0d79-47f6-95d9-a9ae0a1fa687", "38acc7ba-afe6-4706-934f-f2c5e9b", 55,
                                        "205630e4-0e5a-4ada-a089-577874ca0878", "3d9c5357-907e-4288-90cd-412d8efe18a0",
                                        "c7b0af0d-ebbd-41ce-ae5e-34ee44cc847c", new Date(1559147593102L),
                                        "b206816b-b494-43b6-bfe6-333b6001b3c3", "26fed626-e8a8-41c8-bc9b-df4d0fae825e",
                                        "09520cd3-816d-4366-b204-57758c2f3f74",
                                        "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                        "fd94e2ca-49f5-4353-8511-0dfd02e04dad", new Date(1559147594116L),
                                        DeviceMechanism.getDefault(), "beec3c54-692a-4f12-a8c5-75afa1eb76fe",
                                        "6a1d7586-0913-42e9-a930-d740037f2b59", "eeaf50f8-5ff4-425d-912e-d557523444ce",
                                        DeviceState.getDefault(), new Date(1559147598744L),
                                        "212f8f9c-d0a3-4809-9bb3-92f9fc42ea00");
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotSame(device2, device1);
            assertEquals(device2, device1);
            assertEquals(device2.hashCode(), device1.hashCode());
            int hashCode = device1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, device1.hashCode());
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
        Device device = new Device("596c0c09-bad4-4535-965f-06e47482ed05", true, new Date(1559147591995L),
                                   new Date(1559147600908L), "61c76ba9-df97-4750-af0e-02c0d394df90",
                                   new Date(1559147601010L), new Date(1559147600249L), null,
                                   DeviceDeployedState.getDefault(), "b6d67d86-e48b-40bb-8021-c5ff59a8a264",
                                   "e6117dd4-2dd4-4c49-91d7-02c7bed05d20", "1396072b-c227-428c-a1c9-6942114", -89,
                                   "56728707-d9f8-4d6b-accb-969784407cb2", "e44c2558-cd3e-4f89-bd11-4533a068dc76",
                                   "58817e66-7b4d-448d-b06c-15a72f68c89f", new Date(1559147599915L),
                                   "1b0b26c9-3b02-4f3e-b1e1-bc5cad39100a", "4500a15a-ba5b-43aa-b88d-37ccf57a0732",
                                   "3bfb2f99-2266-46c8-b052-06a28e33885b",
                                   "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                   "0a1e72cd-5773-4188-8c1b-6dc20e91f425", new Date(1559147593497L),
                                   DeviceMechanism.getDefault(), "ff158d83-6076-4bd3-8220-ab8a2d174dc4",
                                   "f20e129f-6dd2-41e4-8a13-dc3579ac45bc", "113056f0-78f0-42ca-9970-ea68a8c8ac72",
                                   DeviceState.getDefault(), new Date(1559147599437L),
                                   "d9081f1a-e5d8-4bb4-9e2a-db781696f6a4");
        assertTrue(device.isValid());
        Device deviceInvalid = new Device("4d615a03-4f8e-415b-8a3e-ff9bc729afd8", false, new Date(1559147598970L),
                                          new Date(1559147591890L),
                                          "c37a62f7-5c15-459f-a45b-14365b4372aff677a0b2-602f-4fed-909e-4147b60e735054bf9ac7-8c78-46e5-8672-7c379781a641874129a4-4277-482b-8a5a-2db57b6278f01ea4d060-8516-47a3-8b68-f1702c6c34f9466f9239-94a9-4d86-be9e-32537c17600b4a300f7b-2bde-436b-abb0-adab0d3225b51d2de08b-aec0-4050-a26b-bf7df869e3330374ee8d-608a-426e-b945-b1d069b83635fff52839-45fd-4800-b2a0-4994b56e6780d01c9d11-78db-48bb-b9e4-6e6e4f5804acac88b59d-c666-49b7-94b4-60c2cb8483df11da3a56-faec-44ed-9a7b-5a1fd238778c3fccbfeb-4a23-42e2-bc1c-73765241c98b",
                                          new Date(1559147598351L), new Date(1559147592010L), null,
                                          DeviceDeployedState.getDefault(), "90f7f848-69c5-407c-a66e-c5984fe02781",
                                          "1c8de652-02ef-4f4f-b622-4d3bca2ebbc3fa55879f-fddf-4f96-a008-528e3cb7822dc2f51219-e5ed-4049-82c6-bc99381c1b026e26af43-31b7-44dc-8a88-a58c0f4e3d2243519d38-6fd2-4e4e-b39d-6525a226c8a269a0a7eb-ce30-4e2c-9eb9-80acea7f7cf999deec91-de46-447d-84c4-9300d304f49322da9fc2-4c81-4832-a5d0-9a7b4dece20a681c8156-a8f5-4c2f-bd68-81fb3d84c3368255f7d8-2ce4-4520-a529-c035f7c960df24498d1b-ecbd-4593-8510-5823354cc7eca22c8d7d-85f3-46c4-9a59-7598e5182e714906f67a-9003-43f2-8118-3dbc9d360ce9c1cdb6ba-4234-4163-b2f9-c53e8fe390108f7c99aa-fc9b-4792-9bac-b2e9dbde540ec46e76e4-82dd-4efa-8e0f-3f18a0d49d0401fa1b37-be66-48ed-b25d-35cb5d83e63d7d75b7ca-3373-4b3b-baf7-289ed84b4525416d96e8-60c2-4ded-b68d-49ec899fd6fabfcff61d-5237-46b5-b872-61308638b3af813e7b93-f071-4c17-9950-89f187423c2d778e84b2-eb91-47e3-97c0-2d7509c24e10e7958021-bc92-4928-a3ef-7b2ecd7f58a052ff9563-59db-4ce1-a700-2791d60bb5f5b09bc16e-9b0c-4e1b-89c7-50f1995838ad2795cc7d-a5e9-4ee7-8a92-3879666f607204666484-0453-4c9a-a864-c4e563cb445a4758039e-8d51-47b4-adad-c2509a17ddac661448bd-9989-4cad-b47c-a4cfd9b8fede7178f345-9608-4cd6-9e11-e61fce97e657a238983c-49af-4694-b914-a88390e252985bad9514-39e2-4804-9361-2a85ff956e3fe12439b4-699e-4152-bfa2-d84a32cb7c70e9598dad-6ddd-448d-b0d0-fc0da29fcc4807b99a65-ff7e-4c12-9a54-465dbec58034ec8926ff-d7aa-46df-85fb-50052bd7fa5c671b213c-aefd-4d18-940b-5cb5119060553ade3d95-e169-4293-baac-d5802b3188b3e2ede19b-a807-4cb5-8ec1-ad5fec7720d8fa3f44ab-79f0-4fa3-bfe2-07fe78edc555f0790d50-0d28-4c9d-a2cf-076e0d324f25e46ecfd1-3751-4308-88ec-5b94a04e4cc37dac0792-3a76-43a8-96e1-24ac9653a5c87e556908-2d2c-4dc4-ab7e-7d6698a4a1cfc63a9734-5555-4152-8c83-7e51a6e9894e8c3c6768-7ad1-45f4-a882-de9517fbeb19c0d46fc2-b95e-4090-b820-b0104f7747573badda2a-3695-43e2-b9ce-ab28d65b150e54c28bca-ac24-441a-8ea6-69fc80327f1e5b425b08-e071-49ac-8898-7f60c45397d3e51eb5ea-1b39-4323-9c3a-b7882a064697e41864ab-562f-4edb-93b7-41177c0515aa7637a527-19e6-4011-a124-976d4c6b8a6e0299f6dd-52ca-43ee-89cc-9cded075c9b4c807faa4-6b0d-4f39-ac3a-883a383f247874ecff1d-d918-4578-bb21-99bcd3dc3886",
                                          "7dc0e5f7-ed7e-480a-96e4-46557768e179", -1,
                                          "2265727c-48f0-43f1-a5f5-e9dd2e876964366efa53-9f2d-42e6-a17b-0b3886b8ed76454d102d-8fbf-445e-9b2a-b441fa1e962063212943-4f16-4c66-965d-67355f9f9cfad3effc90-734f-44ca-a9de-a3a5bf1b09dd16a5b723-68ed-4d2c-9f6d-6493f7084a917496cba4-d5c3-4494-bdfe-fb06288460a9a0715cac-dab6-4992-9b55-f1f4745493e037a4b0a1-fc2c-4469-9b0d-c62ad8b1868c357a4aa0-afb2-45be-9de4-8264f01db84bca69b9a9-b8fa-4c5b-83f0-c92e218930d6a858cc88-527b-4ce9-9618-4aa48ce62ff704bc65f9-b06b-4742-9b19-c40cf82d7ef1834bf503-9f59-409f-a350-37a90fe3a8ac1483f4d4-24ac-4f23-a90b-a43995137acc",
                                          "9ee86fe5-153c-4d93-9134-bd7383b6bcb5",
                                          "31d0cc1b-083e-426f-80e6-c4670b83f412760fec88-a369-4389-91f6-aaf1f6746ad9",
                                          new Date(1559147599863L), "6a51afbd-5b04-4f9c-805a-7766fa77c1c1",
                                          "2f32105b-3428-49fb-8720-acaa3e7f2872",
                                          "6dfc9d38-8b9b-41e8-bde4-eb14efe62519",
                                          "\u0013:G-KP?<>㵺?\u001b*앫:G\u0011^T:R๪#>?X.K]QҒ\u001e㯠\t\u0007?@鷳#Q\u0018`R<\u0014;\u0013>,\u001bᴩ碆\b谪:@`\u001a饱\u0016<ࡾ",
                                          "25de9adb-326b-43c7-80d7-b838a427498e", new Date(1559147597945L),
                                          DeviceMechanism.getDefault(), "71080434-20e5-4ae7-ac3d-c508e45c4890",
                                          "fe9b7072-2d92-4653-af29-7d4cbad381f01dbcb669-b74a-49f6-9a6a-7b708c217ae7d31eda4f-8607-4138-acf6-fceea83d7b8f552c34bb-878e-43a3-913b-b13f1d923f22",
                                          "c3f51426-b57a-49cd-9694-cb487b2351d2", DeviceState.getDefault(),
                                          new Date(1559147592733L), "bd198939-9c68-4d17-afc8-7792a57659c9");
        assertFalse(deviceInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Device device1 = new Device("8c31435e-76ee-4199-8853-a8efbfbaa85d", true, new Date(1559147599499L),
                                        new Date(1559147601318L), "5d36cffe-bf57-45cc-8a6a-23c0caa35b7c",
                                        new Date(1559147601454L), new Date(1559147598810L), null,
                                        DeviceDeployedState.getDefault(), "7edd0e98-4a6e-4bd8-a572-2d0d1e367bdb",
                                        "a78213c3-e4bf-47ee-b2fe-0d2cf5d18d1a", "3e5abac4-7af2-42a7-bdd1-40d36da", -128,
                                        "3d4efec8-e07e-47e3-ab69-864c4f66b8b9", "5dc75969-2299-4b53-998c-bd858f630800",
                                        "f46da725-3d06-4387-a8fb-bb0586d08774", new Date(1559147596133L),
                                        "87bbb268-5b97-49fb-b181-e78daa1559fb", "29c5cb05-28e5-4bf2-a530-a1f553c0dd4b",
                                        "68ccf4ad-d93c-4d8d-9334-0b577399b59d",
                                        "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                        "8924a052-b7cd-489e-a63a-10bd9800b19d", new Date(1559147595876L),
                                        DeviceMechanism.getDefault(), "86dfabb0-305e-4ce5-9e96-f7b09a4222fb",
                                        "213a4621-63f3-405d-9ad6-ec96479f1b5c", "1c8481be-2f04-4f63-a1c0-9c77a75201a9",
                                        DeviceState.getDefault(), new Date(1559147594662L),
                                        "2436b721-0afe-464a-8e1f-dd0ed2103ecb");
            Device device2 = new Device("8c31435e-76ee-4199-8853-a8efbfbaa85d", true, new Date(1559147599499L),
                                        new Date(1559147601318L), "5d36cffe-bf57-45cc-8a6a-23c0caa35b7c",
                                        new Date(1559147601454L), new Date(1559147598810L), null,
                                        DeviceDeployedState.getDefault(), "7edd0e98-4a6e-4bd8-a572-2d0d1e367bdb",
                                        "a78213c3-e4bf-47ee-b2fe-0d2cf5d18d1a", "3e5abac4-7af2-42a7-bdd1-40d36da", -128,
                                        "3d4efec8-e07e-47e3-ab69-864c4f66b8b9", "5dc75969-2299-4b53-998c-bd858f630800",
                                        "f46da725-3d06-4387-a8fb-bb0586d08774", new Date(1559147596133L),
                                        "87bbb268-5b97-49fb-b181-e78daa1559fb", "29c5cb05-28e5-4bf2-a530-a1f553c0dd4b",
                                        "68ccf4ad-d93c-4d8d-9334-0b577399b59d",
                                        "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                        "8924a052-b7cd-489e-a63a-10bd9800b19d", new Date(1559147595876L),
                                        DeviceMechanism.getDefault(), "86dfabb0-305e-4ce5-9e96-f7b09a4222fb",
                                        "213a4621-63f3-405d-9ad6-ec96479f1b5c", "1c8481be-2f04-4f63-a1c0-9c77a75201a9",
                                        DeviceState.getDefault(), new Date(1559147594662L),
                                        "2436b721-0afe-464a-8e1f-dd0ed2103ecb");
            Device device3 = new Device("7ffa6ce7-ff68-4846-9fa8-ff9e54d160e2", true, new Date(1559147595229L),
                                        new Date(1559147597471L), "464b919f-6ebe-404c-a5bf-75f2f71f17ab",
                                        new Date(1559147595252L), new Date(1559147597188L), null,
                                        DeviceDeployedState.getDefault(), "64e83abb-5074-4605-b086-c67c92cab2f4",
                                        "02fa534f-7323-495d-9b90-5e9eb29ce826", "9f893ff0-e731-4d9a-885d-f8638ea", -36,
                                        "fd5a903d-7f3e-4c27-841d-abd095dc148a", "3ba8d122-bb3c-427f-951b-de7f880b07fb",
                                        "10d93788-b235-498c-8ec7-ab5964d6a18d", new Date(1559147601192L),
                                        "6f18906f-c7c0-41e6-8fb4-cf3dccbd464d", "95da1c9d-f364-47ea-9a9a-1be4813c872c",
                                        "8ba338ac-78da-4217-9e22-a6fa6e002f26",
                                        "7fee2eD8ECEDcC93FDaEA2dBCd1abe3EC62ac2495FebcC6fadAD27a2AF3cCAde",
                                        "5d3dbd96-4036-4d39-a3a3-53982a4348a9", new Date(1559147596386L),
                                        DeviceMechanism.getDefault(), "986964c1-1c25-48f2-bc60-73fbb1c81a1e",
                                        "4250c324-8205-4d41-b8a2-25e536bd3334", "4906dff9-22b8-47a5-aeb4-38e99a5d7dd5",
                                        DeviceState.getDefault(), new Date(1559147593264L),
                                        "94a3a133-ca24-44f3-9c45-6b0fa451feab");
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotNull(device3);
            assertNotSame(device2, device1);
            assertNotSame(device3, device1);
            assertEquals(device2, device1);
            assertEquals(device2, device1);
            assertEquals(device1, device2);
            assertEquals(device1, device1);
            assertFalse(device1.equals(null));
            assertNotEquals(device3, device1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

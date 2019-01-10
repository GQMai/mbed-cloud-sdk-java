// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Device.
 */
public class TestDevice {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            Device device1 = new Device("67995f1b-0215-4b3c-9189-1270ca65bc19", false, new Date(1547159622933L),
                                        new Date(1547159620882L), "3bc3f13a-65cb-4e18-b8c6-705a23f8a5e9",
                                        new Date(1547159628593L), new Date(1547159624787L), null,
                                        DeviceDeployedState.getDefault(), "a5e8268c-f59a-47fe-bd0f-e99356f4c650",
                                        "9210f7ab-d9ff-4030-9c12-0fac90596e4a", "02e36b74-6295-4a0e-ace3-e7d191a8ea8d",
                                        -106, "ebdd0c62-6e55-4372-b689-a0880d9346ae",
                                        "c7d2b72c-e30b-4e1a-848d-8c1b1687a114", "4bab1998-7309-4ede-b056-4fd77305b5ed",
                                        new Date(1547159628188L), "b3dbd7a5-c83a-427b-8e32-51a05d6c7b0d",
                                        "3229fddc-3cad-4a45-aec5-ccff43b605ea", "0f7c8f67-2738-415b-ab26-803bd79ca2ed",
                                        "Ada5Cc2D3E039b4E263BE2e27a6c7a34a4Ad7cf3eDE9AD6F55DdDbDeC66bCeB9",
                                        "_ca_65__0_3dc__b3f__e9_02e_6eabb", "4298c5e5-f88d-4bc9-b6fd-fe824adaf9e3",
                                        new Date(1547159625372L), "_f_e___e_f5e_c9f6__5e_7_fb77a6__",
                                        "7d063d4c-9421-4570-a307-0cc8836a7e8b", new Date(1547159623860L),
                                        DeviceLifecycleStatus.getDefault(), "5def6bf0-2fb7-44fd-ac0d-8be7a1cd91ec",
                                        new Date(1547159623000L), DeviceMechanism.getDefault(),
                                        "16370558-1c95-4349-80e8-61b6c257bb91", "25b611ed-9805-4acd-a5cd-3bef25e029c0",
                                        false, "80324d05-9206-41b5-bbbb-0840837e1297", DeviceState.getDefault(), false,
                                        new Date(1547159626452L), "ce1ddfec-6218-4b2b-b13f-383113023d0b");
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
    @Test
    public void testHashCode() {
        try {
            Device device1 = new Device("1146fe8e-c883-4ba5-bcc1-3de9c16650ff", true, new Date(1547159621533L),
                                        new Date(1547159624857L), "39d24fea-2f27-45c3-a8cb-aacccd9ccccb",
                                        new Date(1547159628561L), new Date(1547159627855L), null,
                                        DeviceDeployedState.getDefault(), "c574c413-a66f-48be-a934-d310807302cd",
                                        "432a27ce-86e4-4e68-87e0-926d8eba6db6", "4e1f97dc-3e0e-4b3b-b506-6834861b23ac",
                                        -73, "abd0dacb-9dd1-4d25-98f7-6800873990c1",
                                        "11ff642a-bf13-4c6b-8289-64c678e748f0", "0923f17d-85ec-4420-ae17-1d2ee295f9df",
                                        new Date(1547159629791L), "aa509c74-8e39-4c4e-b87c-5909c27b44fb",
                                        "ed1c10a7-b5dc-4852-9189-e6029985b6e0", "1f03dc93-afa8-46dd-ac4d-9d150349cbbb",
                                        "4efac1c63aac94b9fFDD2FeFaA8fF11fEbdCa7fF7DFDfad99AadAfC70f7DceB8",
                                        "29____3e2_aa__0cb__0_2f0__e780a_", "8ecc36f2-1a10-4988-82e1-53451f47f2de",
                                        new Date(1547159626036L), "d___5_3_5ae3f8_9___532cbf5fbc_bf",
                                        "ae878a8e-0735-478f-bb37-45bdc4830c5d", new Date(1547159623898L),
                                        DeviceLifecycleStatus.getDefault(), "d12953a2-4283-4177-9a24-9bbd478efd7c",
                                        new Date(1547159625259L), DeviceMechanism.getDefault(),
                                        "f81c1490-e636-48d9-bd3b-ae692851714a", "439eb7bc-5a2f-4b11-bb69-0d94c0760a2f",
                                        false, "35b6a944-eeb9-4069-a94f-ab0738aa495f", DeviceState.getDefault(), false,
                                        new Date(1547159628333L), "b6daee7d-1f07-44e6-8888-dfbb7a6de908");
            Device device2 = new Device("1146fe8e-c883-4ba5-bcc1-3de9c16650ff", true, new Date(1547159621533L),
                                        new Date(1547159624857L), "39d24fea-2f27-45c3-a8cb-aacccd9ccccb",
                                        new Date(1547159628561L), new Date(1547159627855L), null,
                                        DeviceDeployedState.getDefault(), "c574c413-a66f-48be-a934-d310807302cd",
                                        "432a27ce-86e4-4e68-87e0-926d8eba6db6", "4e1f97dc-3e0e-4b3b-b506-6834861b23ac",
                                        -73, "abd0dacb-9dd1-4d25-98f7-6800873990c1",
                                        "11ff642a-bf13-4c6b-8289-64c678e748f0", "0923f17d-85ec-4420-ae17-1d2ee295f9df",
                                        new Date(1547159629791L), "aa509c74-8e39-4c4e-b87c-5909c27b44fb",
                                        "ed1c10a7-b5dc-4852-9189-e6029985b6e0", "1f03dc93-afa8-46dd-ac4d-9d150349cbbb",
                                        "4efac1c63aac94b9fFDD2FeFaA8fF11fEbdCa7fF7DFDfad99AadAfC70f7DceB8",
                                        "29____3e2_aa__0cb__0_2f0__e780a_", "8ecc36f2-1a10-4988-82e1-53451f47f2de",
                                        new Date(1547159626036L), "d___5_3_5ae3f8_9___532cbf5fbc_bf",
                                        "ae878a8e-0735-478f-bb37-45bdc4830c5d", new Date(1547159623898L),
                                        DeviceLifecycleStatus.getDefault(), "d12953a2-4283-4177-9a24-9bbd478efd7c",
                                        new Date(1547159625259L), DeviceMechanism.getDefault(),
                                        "f81c1490-e636-48d9-bd3b-ae692851714a", "439eb7bc-5a2f-4b11-bb69-0d94c0760a2f",
                                        false, "35b6a944-eeb9-4069-a94f-ab0738aa495f", DeviceState.getDefault(), false,
                                        new Date(1547159628333L), "b6daee7d-1f07-44e6-8888-dfbb7a6de908");
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
    @Test
    public void testIsValid() {
        Device device = new Device("5db724a5-72f9-4f4c-ac4d-9ec021f4ba35", true, new Date(1547159622856L),
                                   new Date(1547159622218L), "11f60199-71fd-4810-9399-7353405782e7",
                                   new Date(1547159627712L), new Date(1547159621586L), null,
                                   DeviceDeployedState.getDefault(), "86c88856-f353-4c88-9cd9-178012b0f0ca",
                                   "ff2c971c-c62c-4318-b11b-7e8645f3681f", "7051dfab-e0c7-4646-8528-740d9cd32570", 29,
                                   "b9ce91d9-760b-4716-b4c1-85fdccd30ad0", "8f7fe8d2-d6b0-4e1e-838a-c6c622d062f7",
                                   "6d0e5236-7ecb-4d29-9876-cd1ae9b3d442", new Date(1547159623479L),
                                   "1c73622c-ec76-4dab-8eb1-fb83813d6d07", "44af3dd6-d1de-457a-bea4-8b557b28f5b0",
                                   "7acbbffa-73cb-4d2a-bf07-06d88af3f14a",
                                   "5ebCfacbaadcd6C8cE10e15Af8280ddEDE071fFAaf9Aa3DB5Cad94BbBCac4cEA",
                                   "3__8___7df___49_c10ad_11___0c___", "233d7666-7bac-4443-afb1-a2a67d9f58cf",
                                   new Date(1547159620267L), "_8e0cc80_8d_5a____9a__0_4__8__f8",
                                   "2b2018c4-f184-431b-9d93-cf814c6b3039", new Date(1547159620685L),
                                   DeviceLifecycleStatus.getDefault(), "2c711174-290e-4844-9e89-734066e0730c",
                                   new Date(1547159624326L), DeviceMechanism.getDefault(),
                                   "d56fc230-d36b-4c2e-aa42-2d627ee63a7d", "ac1c742c-6785-49c9-bb63-57e1f3f4ca6d",
                                   false, "f8961208-f5b5-4b88-9ebd-b633f067c367", DeviceState.getDefault(), true,
                                   new Date(1547159628046L), "fb76e20b-7b7c-47b6-8809-70ee7e8f5030");
        assertTrue(device.isValid());
        Device deviceInvalid = new Device("81af1923-859d-4c37-8c65-4703dd84eb49", false, new Date(1547159623367L),
                                          new Date(1547159626345L), "d56fadd2-0f9b-48bd-adf3-a5f66a5a9874",
                                          new Date(1547159626724L), new Date(1547159621525L), null,
                                          DeviceDeployedState.getDefault(), "54ed07d8-8812-496d-a94c-f7ce08c03aa1",
                                          "327f88e5-a43b-41da-9934-e638e0f39329",
                                          "d4481d74-4ddb-4ea5-95e3-26bf58d0ca1b", 68,
                                          "35ccf225-ec48-4457-9e8c-3b4f96396ef2",
                                          "834189cd-c27a-4163-8686-61e31ccb8190",
                                          "7166436e-28ab-426e-a61a-762d94b83725", new Date(1547159620303L),
                                          "fffa943f-ad19-4c09-b507-24580ec9a3ec",
                                          "7f210dbe-b2c1-4716-83e1-3079885f4bb2", null,
                                          ">㼩\u0011J@Q??J᷇益�??X+@\u0014짥Tॱ_N\u001c鼳7?Q웊_ψ\f\u0011I?㺦?I랧KH긫>_:\u0014+77@?7ㅡ^\t\u0011ꡃ:P=7%\u0017T>",
                                          "11L\u0006䀚.272☇㺂薯(`782``\u001a[7``\u0014屰*`\u001a밊킽/N>S17`鮰\u000bﲹ梺泧\u0003\u001a\u000b1.87玶78`�?7�?�8湫\u0017 ``",
                                          "9c52a23d-82f4-4b51-afcb-1e70f0419e34", new Date(1547159621455L),
                                          "(c\u001a`a:鹞\u00165`5c3``c3`EcaA5⬺\u001fS35�??�?a/`3�?�5333`=cc3a勼cc5`ccc`\u0017`3.R\u0014c333",
                                          "8a038114-df8b-4555-bcb7-4084c775c74c", new Date(1547159621587L),
                                          DeviceLifecycleStatus.getDefault(), "02de412b-7b2d-485b-b18a-10fae7ac97dd",
                                          new Date(1547159628900L), DeviceMechanism.getDefault(),
                                          "a860bae2-8224-4bd0-a8e7-67bef74c2a1f",
                                          "4fd7d4ca-b2b6-44b6-8660-d1f266f45203", true,
                                          "38cc7b0d-8263-43eb-b53b-6c1f443944dc", DeviceState.getDefault(), false,
                                          new Date(1547159624511L), "6e80190b-914c-48f7-912b-b47858f39b4c");
        assertFalse(deviceInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            Device device1 = new Device("5b2b06f2-e7fd-43a8-a295-7551c5658508", true, new Date(1547159626487L),
                                        new Date(1547159627411L), "2cb17aff-a9f4-4dc3-92bd-6d2c1149cd04",
                                        new Date(1547159627720L), new Date(1547159623764L), null,
                                        DeviceDeployedState.getDefault(), "14811319-7b07-4dbb-9113-1ae42c6d1665",
                                        "984c614a-94ff-45e3-b4ae-d0da38f4edcf", "49f389ad-80fd-4c8f-9b25-0cfcfeb7b568",
                                        -43, "b367c571-2fa1-493a-be2e-34d1dd0c3915",
                                        "95dcf55a-f4ff-4ad3-ad1e-2696ab69fe5b", "2b9ea904-97c2-46fc-9b2d-3b16aada0010",
                                        new Date(1547159624418L), "21abea09-7365-4200-95e9-9d5c3a5cb7e7",
                                        "75e7af72-be87-4bbe-ab12-67c5219baae6", "4d1438ba-f3e2-48ea-8b2b-f8e9d0a862f6",
                                        "c40FFEc1aafACFEBC2B1fEEdD6475b99bcb11fdCbbd7DbFebA8beA4cdfaccdCb",
                                        "d_27187b6_63_81_7d177b__866_c_fe", "1da40e28-5400-484f-8206-9927f025afee",
                                        new Date(1547159620720L), "b_0a_f17bc784aedb_7__90f_e73f3_c",
                                        "9ab8c234-2069-4bbe-ad51-be365253cc57", new Date(1547159626448L),
                                        DeviceLifecycleStatus.getDefault(), "fb0e02f7-4f07-4975-bb8d-30f1c3967df0",
                                        new Date(1547159628440L), DeviceMechanism.getDefault(),
                                        "d9ba66ef-118b-4938-932f-9a07d1c18ec0", "0fbbf119-64ee-4650-8554-fc30050d28d7",
                                        false, "0eab9bb3-db8b-4c2a-b90d-1d98b4cdfbd6", DeviceState.getDefault(), true,
                                        new Date(1547159625177L), "e2e7c8af-eddc-4c01-9560-d027cc699d06");
            Device device2 = new Device("5b2b06f2-e7fd-43a8-a295-7551c5658508", true, new Date(1547159626487L),
                                        new Date(1547159627411L), "2cb17aff-a9f4-4dc3-92bd-6d2c1149cd04",
                                        new Date(1547159627720L), new Date(1547159623764L), null,
                                        DeviceDeployedState.getDefault(), "14811319-7b07-4dbb-9113-1ae42c6d1665",
                                        "984c614a-94ff-45e3-b4ae-d0da38f4edcf", "49f389ad-80fd-4c8f-9b25-0cfcfeb7b568",
                                        -43, "b367c571-2fa1-493a-be2e-34d1dd0c3915",
                                        "95dcf55a-f4ff-4ad3-ad1e-2696ab69fe5b", "2b9ea904-97c2-46fc-9b2d-3b16aada0010",
                                        new Date(1547159624418L), "21abea09-7365-4200-95e9-9d5c3a5cb7e7",
                                        "75e7af72-be87-4bbe-ab12-67c5219baae6", "4d1438ba-f3e2-48ea-8b2b-f8e9d0a862f6",
                                        "c40FFEc1aafACFEBC2B1fEEdD6475b99bcb11fdCbbd7DbFebA8beA4cdfaccdCb",
                                        "d_27187b6_63_81_7d177b__866_c_fe", "1da40e28-5400-484f-8206-9927f025afee",
                                        new Date(1547159620720L), "b_0a_f17bc784aedb_7__90f_e73f3_c",
                                        "9ab8c234-2069-4bbe-ad51-be365253cc57", new Date(1547159626448L),
                                        DeviceLifecycleStatus.getDefault(), "fb0e02f7-4f07-4975-bb8d-30f1c3967df0",
                                        new Date(1547159628440L), DeviceMechanism.getDefault(),
                                        "d9ba66ef-118b-4938-932f-9a07d1c18ec0", "0fbbf119-64ee-4650-8554-fc30050d28d7",
                                        false, "0eab9bb3-db8b-4c2a-b90d-1d98b4cdfbd6", DeviceState.getDefault(), true,
                                        new Date(1547159625177L), "e2e7c8af-eddc-4c01-9560-d027cc699d06");
            Device device3 = new Device("8f6c6b01-8aef-439c-86cb-acfb014b9cc6", true, new Date(1547159620924L),
                                        new Date(1547159621976L), "f919f2e6-8b12-4e0a-bda4-926c0ad0a0ea",
                                        new Date(1547159624356L), new Date(1547159623317L), null,
                                        DeviceDeployedState.getDefault(), "4cb3c2ea-da40-4855-9595-1b9795ff561e",
                                        "3cd47dce-5336-4a94-9114-7bf4a29d6e38", "1c596aa5-4232-41a1-b38d-3a1498efce29",
                                        36, "cf099b65-eaeb-4bc1-9289-bf382ffff740",
                                        "268c513d-af9e-46df-a23b-e01c6b953ab8", "5e991d78-4f69-49a5-a885-90e9e66694bb",
                                        new Date(1547159620797L), "b977abb8-926e-4d6c-96c5-40dd40280ca6",
                                        "c5865325-7493-4f0a-a0d0-8f2cb85da48a", "11dd749a-361b-44bd-a791-787543f8a518",
                                        "eab2Ad1f73269De96BDcA5cFb631EfEBDb4accdC4d0D51E3Fa3eFbcf644D80bA",
                                        "b91adfac9ad__e_fc_b4___1b_ba14e_", "d9775a67-2c2e-460d-a81e-a0f481949bd9",
                                        new Date(1547159621335L), "83ce__0_9c_07_8c2a6c1e32__c__87_",
                                        "4ece040f-f291-46b6-9c95-3e971a763e76", new Date(1547159622084L),
                                        DeviceLifecycleStatus.getDefault(), "a3c93f3d-dd67-4814-9be1-a2c3a542871e",
                                        new Date(1547159621773L), DeviceMechanism.getDefault(),
                                        "92c05717-571a-4918-bf43-bc440903c6b3", "b3d37406-9f29-4837-a3b5-1926fc7e932d",
                                        false, "eb5ae8ce-e7a0-49b6-9376-fab5b6e07808", DeviceState.getDefault(), true,
                                        new Date(1547159624510L), "d74578e3-ea8e-4247-a6c3-bacef5805826");
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

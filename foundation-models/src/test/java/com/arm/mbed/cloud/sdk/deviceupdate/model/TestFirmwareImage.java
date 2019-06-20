// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model FirmwareImage.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestFirmwareImage {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1561032447267L),
                                                             "4f66411f-8634-4b34-966f-4e428304ec16", -104,
                                                             "c08a4aab-8aa2-4814-9644-1d6ae4e13ec2",
                                                             "ba1a0ab6-b30d-40b3-85b7-9e97a2fcb895",
                                                             "ee244c30-85fb-4edf-90c3-d2f8cbb655ce",
                                                             "bfcc76ff-bae1-4ab1-bf46-ac6a495a09a8",
                                                             new Date(1561032447149L));
            FirmwareImage firmwareimage2 = firmwareimage1.clone();
            assertNotNull(firmwareimage1);
            assertNotNull(firmwareimage2);
            assertNotSame(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1561032443115L),
                                                             "750ce3c7-aa8d-430c-87a6-4b21d4c2b121", 125,
                                                             "10ca1925-17de-4fdd-b5f2-ce104d232667",
                                                             "b8db4193-f678-4ef5-a54f-8502bd7ab310",
                                                             "f953b385-a4a6-4ede-85be-ed89b4af9052",
                                                             "3ce7586a-8259-414e-a130-04d2b868c3b3",
                                                             new Date(1561032448214L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1561032443115L),
                                                             "750ce3c7-aa8d-430c-87a6-4b21d4c2b121", 125,
                                                             "10ca1925-17de-4fdd-b5f2-ce104d232667",
                                                             "b8db4193-f678-4ef5-a54f-8502bd7ab310",
                                                             "f953b385-a4a6-4ede-85be-ed89b4af9052",
                                                             "3ce7586a-8259-414e-a130-04d2b868c3b3",
                                                             new Date(1561032448214L));
            assertNotNull(firmwareimage1);
            assertNotNull(firmwareimage2);
            assertNotSame(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2.hashCode(), firmwareimage1.hashCode());
            int hashCode = firmwareimage1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, firmwareimage1.hashCode());
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
        FirmwareImage firmwareimage = new FirmwareImage(new Date(1561032446327L),
                                                        "82c60f52-ce08-437c-b576-1dec58525bba", 93,
                                                        "2ad17be6-36f9-4ad2-aeda-d951dae13b70",
                                                        "607de968-fa43-49b3-87c8-664ac1369043",
                                                        "77810f45-2416-4cd0-b86a-6b5e4d1bdbbd",
                                                        "741a2bdc-5baf-46ce-a2ca-b20ad9288f2d",
                                                        new Date(1561032447107L));
        assertTrue(firmwareimage.isValid());
        FirmwareImage firmwareimageInvalid = new FirmwareImage(new Date(1561032447616L),
                                                               "770d9709-4db0-4008-89ab-ae0c718fa805", 71,
                                                               "0f0f43a7-ce65-4594-90bc-85f6fc7ed8da",
                                                               "9ec7b28e-3758-40fe-a1a5-4be0eca2434bb8762e48-4b11-4c2a-9673-50c13f1a7a3b7f2872c3-6e94-460c-a203-9d16c6b1c78e37c73cb6-efe1-4df7-a548-ed72441003e4549c34fa-4009-40f2-b8a4-6151e8f557ce0698a3dd-4ae4-42f5-acac-6f23c07b5bbdaf18c2dd-5a74-4a3f-82d4-c2377eaceb8319cf310b-9121-45d8-9fb9-184293cf6d56b1515f97-f986-451a-a0aa-489eef8cab577a4b5c3b-23d1-48b0-b232-e9b96c833b1091925d37-59fe-451b-8ad9-fc06c286558bc49d664f-48c9-4039-aaa0-7e1e7a2a18fce8df2473-6c4d-4531-bdec-ccb4321bd8916c0ce5bf-4840-40dc-bb82-55c14c64d46fb4a2e0e8-d2af-4129-9cf8-6180b30c49ae5c4814be-d475-4a8a-80ce-ed26f5696150887bcbd4-d972-4adc-a7b6-f0b16449832e01940fb2-9765-4777-9e9f-fb9f1670d83b4438d0af-870d-4e02-8c13-9de300604bacec38463e-51e9-4afb-aa60-0763421a8014f9bb8ca1-cfc8-4185-9050-da5a7fc70f2f5aac072d-ef22-4744-a1fa-225b03696d7b576d36cf-f9dc-46e7-a533-28f3218926563c4c98e0-f37e-4ddf-b2f1-4a6d6d33ed6973370079-d379-46a6-8273-4f6558a1c06c6e5ee56b-3aca-4e21-8fe1-9437f22293ee6a2da7dd-909d-4ae4-9658-ae09a95bd1526dcdcdc3-12c8-4d8e-a32d-86d9ffa696814695a608-99ef-444b-8cb4-4f14330428cc5d4899f6-3e4a-4ac0-820e-c318971c3f7a0e3e144b-d111-4c79-a2d9-6ff4607586164319aaf2-d7e7-4259-bb7d-8ac8beff5924fb70b45d-b398-41ab-a422-0397882eedd8cb3846a4-6628-4cfd-aa54-7e33732ea1deed5add66-ff44-403a-a777-64b24f49b36ebf6bc065-dbe3-40df-a9da-6b856d9e20cb3817752b-c7a1-44b6-803c-676965a8b650b6519ee4-7a5c-4d40-8134-385583a641ae6695a125-242f-450e-9f23-4c31b62272f14ab7407f-1527-4717-804c-36329997a875b07b4e03-daa4-4372-a0da-d06c03b1797a52680edd-3761-4b24-b224-8e2f6f6f9d2b032f2c37-8dd6-487c-b045-6e909dcc2d30b975b63e-4403-43fe-87c6-d2549fb8771ff3dfdbd7-18e5-463e-83e4-c1d9c19a93bca9959699-ce57-4ff0-af99-d2b343d5e88876d80bf2-f750-4565-b57e-4dd29d22b8dbce94ddcc-e11a-4ab9-b666-b233373f78b6b80b5da8-5686-4fcc-b004-61e3511bf9e408d79f6b-6494-4916-91d2-907f2b5caac66498fd8b-7b9d-4b47-8157-301f4de79aac0690dfd0-5f21-447a-9342-298d976864227555ac59-58cc-4219-b500-752b61e8c1d83efa44e5-3062-44cb-86c0-bdae2f9d6efab5417570-3d7b-4aba-880f-e6663e843a32a269efad-21e1-4547-928b-5d9168d5cf90",
                                                               "c948f44c-968c-4147-8234-39d355dae508",
                                                               "da5d780d-4df8-4eeb-b5bc-81ca8f8b3ac9294babe7-24d3-4f45-adbb-3612328c5f4535bf09a0-2722-4d11-99db-01543de99c751410b710-791e-4458-9213-56613e3b8607",
                                                               new Date(1561032445492L));
        assertFalse(firmwareimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1561032445093L),
                                                             "6c1bcf67-9f38-4d55-a2c1-d7274f51a2cc", 126,
                                                             "ee1dc372-991e-4631-ade5-a93027e7d84e",
                                                             "f8e1f474-12f3-4bf4-8835-d0fe15cf4533",
                                                             "4b306e22-4ee7-49f5-886d-5a751a869447",
                                                             "4044aa4e-a0c6-47b7-b748-4c4decd5c751",
                                                             new Date(1561032448321L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1561032445093L),
                                                             "6c1bcf67-9f38-4d55-a2c1-d7274f51a2cc", 126,
                                                             "ee1dc372-991e-4631-ade5-a93027e7d84e",
                                                             "f8e1f474-12f3-4bf4-8835-d0fe15cf4533",
                                                             "4b306e22-4ee7-49f5-886d-5a751a869447",
                                                             "4044aa4e-a0c6-47b7-b748-4c4decd5c751",
                                                             new Date(1561032448321L));
            FirmwareImage firmwareimage3 = new FirmwareImage(new Date(1561032449861L),
                                                             "10b55eaf-e136-4e42-8836-c7098dee0e9c", 115,
                                                             "2c741a2b-e5d2-4dba-8c2c-48b41d55be72",
                                                             "8e7672c8-0a8f-42a7-b52f-b6a1e5217df4",
                                                             "973efc84-a41e-41c1-a0a9-07ad0f265ea8",
                                                             "a9e452b2-45e8-4245-a130-8da4524e7319",
                                                             new Date(1561032446745L));
            assertNotNull(firmwareimage1);
            assertNotNull(firmwareimage2);
            assertNotNull(firmwareimage3);
            assertNotSame(firmwareimage2, firmwareimage1);
            assertNotSame(firmwareimage3, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage2, firmwareimage1);
            assertEquals(firmwareimage1, firmwareimage2);
            assertEquals(firmwareimage1, firmwareimage1);
            assertFalse(firmwareimage1.equals(null));
            assertNotEquals(firmwareimage3, firmwareimage1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

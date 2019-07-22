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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1563781717227L),
                                                             "79adcc2d-3a06-4a73-b69a-1c36f14de2c6", -89,
                                                             "8eb9111d-751d-48f7-a11a-8e22b334bb8f",
                                                             "1432c86e-a3dc-4e6e-978e-12d34532437b",
                                                             "d68d361b-27b3-4e46-9aec-0ade94fa9e77",
                                                             "a71bfee9-ccec-4690-b45c-b0c356f22c0c",
                                                             new Date(1563781718482L));
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
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1563781722836L),
                                                             "318c7d26-b96d-4021-a5d7-40bc52275d1c", 111,
                                                             "aec23f0b-20db-45f8-a6d9-2ad00063a4b7",
                                                             "dc4445ba-f682-4fe3-8eec-2f37a31db7dd",
                                                             "e0d857fe-9464-471a-b80f-e531b3d41b39",
                                                             "7844634d-d67b-4a87-a2aa-b2629ef32c24",
                                                             new Date(1563781715083L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1563781722836L),
                                                             "318c7d26-b96d-4021-a5d7-40bc52275d1c", 111,
                                                             "aec23f0b-20db-45f8-a6d9-2ad00063a4b7",
                                                             "dc4445ba-f682-4fe3-8eec-2f37a31db7dd",
                                                             "e0d857fe-9464-471a-b80f-e531b3d41b39",
                                                             "7844634d-d67b-4a87-a2aa-b2629ef32c24",
                                                             new Date(1563781715083L));
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
        FirmwareImage firmwareimage = new FirmwareImage(new Date(1563781716605L),
                                                        "e6fa63b1-26f1-440b-97f1-886b7345db2b", -119,
                                                        "7f9e7a93-e08b-4546-8bbd-121b67a7cc0e",
                                                        "991b3a79-b00a-46fd-b613-3c71edc60f90",
                                                        "0b933e5b-3193-40ae-b7cf-bcd014b9fa7e",
                                                        "8f2dcc39-415c-4851-8ed6-2f2c45599427",
                                                        new Date(1563781724455L));
        assertTrue(firmwareimage.isValid());
        FirmwareImage firmwareimageInvalid = new FirmwareImage(new Date(1563781717781L),
                                                               "714d80f9-b891-4bd7-af35-ae6ff7a47753", 39,
                                                               "a420e6e3-e635-4e13-accc-637c652029b4",
                                                               "5c42b969-4cc1-4bbe-ac80-09228066d7c5e68fa545-92c4-4ab0-949d-eb04622fe8c4d022fe1d-87d0-40f4-a388-4edd342e873da1657d0f-69b4-46fc-b311-92272746ae994b3688be-7069-4cd5-8522-a012f117c9c3e11d69df-74d7-4b3f-ba43-3bba501d58d966706cf3-2605-41b2-987a-6df17ca730f0e3ff466e-41b5-425b-8fc7-301e7d266ae98da581a5-b5eb-46cb-a323-cfcb015d74ea131f022e-5d62-4f1a-9122-b92a9fb80fe4ae061bc5-2f20-4c85-aa29-2b1c76b9428d1c6d25fa-0bb1-442c-9dba-f8163a0e67cf9429bc50-4fcd-42ff-8fae-0c7659f7128fce6da4d5-fe87-431b-bdf1-41c7eb4caf67c282f4ac-c4de-4d9f-8c14-4f5bc13e9544d1b09a6c-db22-44ca-b407-78eb373afc1ae0155d37-2905-49fd-9856-c18f8c2aea02669bbf93-99e9-4b4b-a0cc-35b522d8d3cd499768fd-8a1c-46d4-a2e4-03ebbc296f160279c903-9a57-49b7-a015-b21ee03c6df46d19c2e0-d3cc-45b7-bbe4-da292383ff2540bb2d6f-5105-47ae-84b2-826375db902b8fe06e4b-2afe-4257-8db4-c89462521cd2a8cb9f19-b369-406c-a578-84ca5ea946dac3150471-bb53-4c8c-a783-9be68427df2beba921a2-4964-4ae2-bbc2-39bc8acbe6041ab96b44-4e6d-42d2-a8b5-4c6db851689f2d42a4c0-3c48-4f30-99f3-ded00bc82309489a9db4-3954-44f3-ba48-e2c69d1f3b4c8241c6eb-6a31-443c-b99f-0fbb9b7886f4882aba9e-76b4-46d1-a701-93d293bc09ba788e55aa-ef2c-4ef3-9be0-5251d000af0be9c459e7-b8c0-4346-ab58-4f75c766885841acf737-4996-4090-88c3-b37f8f2726521da079f6-2786-4e70-929b-1bab684a33b97d17c2f9-7993-4b4e-92e0-47e2a320cb1d4ad97815-4e39-40c4-8af1-d9eb518dc099ca9eeed1-5cc4-4b7b-b262-2c19c2b016ab61fb2d1b-cf08-4d64-8ba2-a510375092b2b460eb3d-e070-414f-b0c2-482ea3269b9b3de75a6e-5caa-4d6a-8e96-f81836121481cf266a7f-8ef3-4d22-a820-9d96dc4954f5709002bf-54e0-468a-8078-724056db810010d15866-eb0b-4393-9711-6152de9824cbb1deb70c-485e-4b14-b93c-0f7ec10179a31bab975a-910b-40ec-8593-87f5810ab2a5c3cafa18-8a8a-4125-a625-0f41a701cf81441d2656-7b13-489d-b729-3886dee9520273d3b170-c781-4a16-be9d-936462b2a12f4a213c2b-3aa7-4bdb-88dc-d9820275228bf30658fb-23e3-40cf-a316-7873b3245504cf99ceed-2020-4bab-a27a-4e782bc7e151a2ee6f8d-5fdf-4919-8741-3d5ca56bbaaf7b50d212-fea6-4a7f-9028-3b201649bb787b82418b-06a6-4d66-926d-d0aa52d990f12aa1e4c3-79e5-410c-8768-cd761f3bfa21",
                                                               "22a2a9e9-9a8f-4c69-9b96-78fee0d733db",
                                                               "deee3c58-02a2-4a8a-bb50-146553e0cacf542e7801-efc3-4ab4-97ed-7b8ea1a04bc60bc2b339-9f92-4ee0-9aae-60eaf7845f8a0e89ae18-d6ec-44c8-984c-b300685d2c7c",
                                                               new Date(1563781717704L));
        assertFalse(firmwareimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareImage firmwareimage1 = new FirmwareImage(new Date(1563781723079L),
                                                             "b9728ebb-a998-496b-8eba-98dd3767a7ee", 103,
                                                             "4711e06d-a40f-4881-b4cc-821cc4ab9bb2",
                                                             "3aa82749-3e89-4f45-8816-0141c2e7ead5",
                                                             "728305f5-02c1-4239-90a1-22fbd1c68588",
                                                             "ef7f6343-a49e-4dd4-8b75-a7398788367d",
                                                             new Date(1563781723027L));
            FirmwareImage firmwareimage2 = new FirmwareImage(new Date(1563781723079L),
                                                             "b9728ebb-a998-496b-8eba-98dd3767a7ee", 103,
                                                             "4711e06d-a40f-4881-b4cc-821cc4ab9bb2",
                                                             "3aa82749-3e89-4f45-8816-0141c2e7ead5",
                                                             "728305f5-02c1-4239-90a1-22fbd1c68588",
                                                             "ef7f6343-a49e-4dd4-8b75-a7398788367d",
                                                             new Date(1563781723027L));
            FirmwareImage firmwareimage3 = new FirmwareImage(new Date(1563781717702L),
                                                             "313ffd02-a216-433b-9507-5e5388827e93", 5,
                                                             "6e6f1f00-1387-494d-8911-5bea0724f553",
                                                             "c7139c55-be35-4b94-9b7b-8b9b4b693f83",
                                                             "29e37ac5-e8d3-43de-b54e-d8041147c456",
                                                             "d0fe8033-4d83-4d29-b2bb-ddcbb09d7f58",
                                                             new Date(1563781722837L));
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

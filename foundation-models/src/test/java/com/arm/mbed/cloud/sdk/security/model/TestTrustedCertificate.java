// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificate.
 */
public class TestTrustedCertificate {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        TrustedCertificate trustedcertificate1 = new TrustedCertificate("02048375-56d0-4e9f-841b-69848ab60644",
                                                                        "14a60d97-3e4b-4c05-8db5-3ae9b1c2b02d",
                                                                        new java.util.Date(1546003515552L),
                                                                        "c6041228-b733-4c60-8698-0aa3065e807f", 5,
                                                                        false, "9a9f141c-b333-489a-a1d2-d7565669a479",
                                                                        true, "a2568a60-dbd1-4bad-9558-b5c8b99b3298",
                                                                        "822c232b-6676-485a-a89b-b63fecda3dc5",
                                                                        "464e103e-a229-4d63-b361-385105553122",
                                                                        "75d136f3-92f6-4cd2-b667-c331de8cb880",
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                        "b94927af-bbe8-46dd-83ba-e6f15ebb5dd1",
                                                                        new java.util.Date(1546003517367L),
                                                                        new java.util.Date(1546003507855L));
        TrustedCertificate trustedcertificate2 = trustedcertificate1.clone();
        assertNotNull(trustedcertificate1);
        assertNotNull(trustedcertificate2);
        assertNotSame(trustedcertificate2, trustedcertificate1);
        assertEquals(trustedcertificate2, trustedcertificate1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        TrustedCertificate trustedcertificate = new TrustedCertificate("608e76a6-ed6e-4dd9-8c9c-de47985e09e5",
                                                                       "231ffb9e-5620-44e0-b862-4da5357a0eef",
                                                                       new java.util.Date(1546003508249L),
                                                                       "032882ff-ef84-44c6-8b91-a28cfa1ad3fc", -7,
                                                                       false, "76316052-550e-458e-8114-20b84a119496",
                                                                       false, "cac74400-66f8-4ffc-b62a-ca260d75d34a",
                                                                       "6e5275fc-8cae-4a5e-9628-7e30ad21c413",
                                                                       "a25e2c96-189b-43ee-bec3-b45424cdbc52",
                                                                       "202c231f-5dd6-4538-95ae-e64f68af0a16",
                                                                       com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                       com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                       "0208b7a6-51d8-406d-8f6d-208d8a1cbecf",
                                                                       new java.util.Date(1546003513771L),
                                                                       new java.util.Date(1546003514796L));
        assertTrue(trustedcertificate.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        TrustedCertificate trustedcertificate1 = new TrustedCertificate("7b3dffd0-8775-40e6-9ac7-b2a5a32b711b",
                                                                        "0d2821e2-15f1-4745-96f2-ee83f7aded84",
                                                                        new java.util.Date(1546003511054L),
                                                                        "56c226b6-51bf-4672-b994-5bbbe9298252", -69,
                                                                        true, "6c938244-29f0-4709-8b3a-e79b278a574d",
                                                                        true, "4b0d6a37-7710-4688-95ed-87f0cd95ec28",
                                                                        "69cfd8e9-84ea-4856-a693-4005851ebf5a",
                                                                        "b87c88fe-3ea5-4f5e-96a2-983fcfc79d9b",
                                                                        "70d4715a-e909-4f77-94f6-bcb1bf0733f3",
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                        "6d251d55-74a2-480d-9455-15c7eaa9f539",
                                                                        new java.util.Date(1546003510576L),
                                                                        new java.util.Date(1546003511580L));
        TrustedCertificate trustedcertificate2 = new TrustedCertificate("7b3dffd0-8775-40e6-9ac7-b2a5a32b711b",
                                                                        "0d2821e2-15f1-4745-96f2-ee83f7aded84",
                                                                        new java.util.Date(1546003511054L),
                                                                        "56c226b6-51bf-4672-b994-5bbbe9298252", -69,
                                                                        true, "6c938244-29f0-4709-8b3a-e79b278a574d",
                                                                        true, "4b0d6a37-7710-4688-95ed-87f0cd95ec28",
                                                                        "69cfd8e9-84ea-4856-a693-4005851ebf5a",
                                                                        "b87c88fe-3ea5-4f5e-96a2-983fcfc79d9b",
                                                                        "70d4715a-e909-4f77-94f6-bcb1bf0733f3",
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                        "6d251d55-74a2-480d-9455-15c7eaa9f539",
                                                                        new java.util.Date(1546003510576L),
                                                                        new java.util.Date(1546003511580L));
        assertNotNull(trustedcertificate1);
        assertNotNull(trustedcertificate2);
        assertNotSame(trustedcertificate2, trustedcertificate1);
        assertEquals(trustedcertificate2, trustedcertificate1);
        assertEquals(trustedcertificate2.hashCode(), trustedcertificate1.hashCode());
        int hashCode = trustedcertificate1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, trustedcertificate1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        TrustedCertificate trustedcertificate1 = new TrustedCertificate("8e3f9815-acd4-4d56-ab0a-4926afe8882a",
                                                                        "8bb25456-e8a8-4ccb-9897-75abb2a79eb5",
                                                                        new java.util.Date(1546003515100L),
                                                                        "b5a9c457-2b80-4acc-99af-dfd687714220", -12,
                                                                        true, "9f364a2f-56cc-45ab-ac6f-dcc3dfbf92ef",
                                                                        false, "9a6de623-b50c-4576-89bd-20d0328498c0",
                                                                        "c28ff5c9-78a1-4601-9dc8-bb3166c213f3",
                                                                        "62fc644e-7ae2-4723-8935-fcea1ab7b4ab",
                                                                        "2f245b13-de1e-4182-b998-f885002e6045",
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                        "02cf641d-9321-452a-acf2-438742c25fd8",
                                                                        new java.util.Date(1546003517083L),
                                                                        new java.util.Date(1546003510208L));
        TrustedCertificate trustedcertificate2 = new TrustedCertificate("8e3f9815-acd4-4d56-ab0a-4926afe8882a",
                                                                        "8bb25456-e8a8-4ccb-9897-75abb2a79eb5",
                                                                        new java.util.Date(1546003515100L),
                                                                        "b5a9c457-2b80-4acc-99af-dfd687714220", -12,
                                                                        true, "9f364a2f-56cc-45ab-ac6f-dcc3dfbf92ef",
                                                                        false, "9a6de623-b50c-4576-89bd-20d0328498c0",
                                                                        "c28ff5c9-78a1-4601-9dc8-bb3166c213f3",
                                                                        "62fc644e-7ae2-4723-8935-fcea1ab7b4ab",
                                                                        "2f245b13-de1e-4182-b998-f885002e6045",
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                        "02cf641d-9321-452a-acf2-438742c25fd8",
                                                                        new java.util.Date(1546003517083L),
                                                                        new java.util.Date(1546003510208L));
        TrustedCertificate trustedcertificate3 = new TrustedCertificate("4881e610-c5ef-4c2d-b791-d8e3045cc69e",
                                                                        "1ff1eb5d-b378-4ead-9f03-ad12e4db9dab",
                                                                        new java.util.Date(1546003510796L),
                                                                        "75d48f54-d5e1-4c08-a2c3-f9576a8391c2", -60,
                                                                        false, "6dad063d-e168-4d12-862d-9a797d0bb1a4",
                                                                        true, "bd374a45-a8c8-441c-9178-a76e1e1e7a96",
                                                                        "eb5f0c7d-bb1b-4a7f-907b-cf166a6a929d",
                                                                        "ee79db1c-8af5-4244-aaa1-ac708017a504",
                                                                        "2ffb4c3d-7033-4664-b100-a1050764dbc7",
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                        com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                        "c68577e3-7658-45d0-95f3-3abe096ba8f3",
                                                                        new java.util.Date(1546003511621L),
                                                                        new java.util.Date(1546003511465L));
        assertNotNull(trustedcertificate1);
        assertNotNull(trustedcertificate2);
        assertNotNull(trustedcertificate3);
        assertNotSame(trustedcertificate2, trustedcertificate1);
        assertNotSame(trustedcertificate3, trustedcertificate1);
        assertEquals(trustedcertificate2, trustedcertificate1);
        assertEquals(trustedcertificate2, trustedcertificate1);
        assertEquals(trustedcertificate1, trustedcertificate2);
        assertEquals(trustedcertificate1, trustedcertificate1);
        assertFalse(trustedcertificate1.equals(null));
        assertNotEquals(trustedcertificate3, trustedcertificate1);
    }
}

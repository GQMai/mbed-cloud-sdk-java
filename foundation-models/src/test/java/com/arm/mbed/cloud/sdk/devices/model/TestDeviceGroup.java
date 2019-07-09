// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceGroup.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceGroup {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1562657744950L), null,
                                                       "21f112a9-ed3f-435f-9bc0-b80158df269c", -62,
                                                       "a62e6dcb-e6b6-4d03-9fc7-fe02214e7068",
                                                       "32affdcf-93ee-4fdf-a9e0-63559a6ad37f",
                                                       new Date(1562657744525L));
            DeviceGroup devicegroup2 = devicegroup1.clone();
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotSame(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
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
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1562657746786L), null,
                                                       "7c0b1757-6d23-4e62-8267-5e33ef680d85", 110,
                                                       "11951f3c-c90c-4f5a-bb2c-2e5b1c3182fe",
                                                       "3bbf2dd7-7d96-4bc6-9358-1694725040cc",
                                                       new Date(1562657751455L));
            DeviceGroup devicegroup2 = new DeviceGroup(new Date(1562657746786L), null,
                                                       "7c0b1757-6d23-4e62-8267-5e33ef680d85", 110,
                                                       "11951f3c-c90c-4f5a-bb2c-2e5b1c3182fe",
                                                       "3bbf2dd7-7d96-4bc6-9358-1694725040cc",
                                                       new Date(1562657751455L));
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotSame(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup2.hashCode(), devicegroup1.hashCode());
            int hashCode = devicegroup1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicegroup1.hashCode());
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
        DeviceGroup devicegroup = new DeviceGroup(new Date(1562657751286L), null,
                                                  "75075410-c2b1-48ef-a9dd-93cc685bde17", 73,
                                                  "b09b6ad6-c65c-4b5d-a4c3-31f8f35b79e0",
                                                  "16f57457-2817-4621-8497-d896745a775b", new Date(1562657746249L));
        assertTrue(devicegroup.isValid());
        DeviceGroup devicegroupInvalid = new DeviceGroup(new Date(1562657743644L), null,
                                                         "e0ae6f93-d898-4e4c-9723-6234f439b1d08249fbc5-1cac-4112-8bbc-cf72e34df8bf5bb7b07f-1c8f-416b-8c9f-4aa0edd53e399aa59dce-15ae-4e21-b036-fc2b112b2ace08749ccb-9519-406c-b2d0-4e5c2ba1e22811d3e51c-4814-4645-a838-0c8eff6faddf5df18591-1521-4f10-a73d-db3e685ca22989f09b68-11ec-4d08-bfe9-3439356af32359e59f08-f740-44c6-a7f5-21a877ed1a10915b8f44-6f3d-4140-9d3a-3757913466e31e55896f-d343-49ce-859a-ab1907e2f8d6b46124c3-773b-4e3a-b45e-49dad57348f429b578db-6e4a-40b7-84f3-bc84a8c8755a7138e114-6d55-4a23-8a0b-3be86e51e97fdaf85c44-8196-4eec-abbe-02c59498fff84529a0d5-63ed-44aa-86dc-276ab11dad051f133b3f-6f35-493d-9eb4-7cb72179e2d46c21c255-a5c1-45bd-9c82-1b89070f16985e9f5a66-10e2-4dbf-8282-f164bcb6a1296a1799d3-5249-49dd-9170-2f27d3cc12cde5ecfc94-156c-4804-b6b4-ea4a6e3d5f78fccd3958-7f12-4740-9dd6-cf17a328d7c95b5436be-8131-41d7-b7a4-265f9000dc4b05fc439c-9953-4f81-b362-1a3f3c2f33cdcb4a5f60-252c-49dd-829f-e9d6fcccec679ff0b1be-0b66-4af9-86d5-72cdd11d07c1aab4971a-b7e3-491d-b2f3-f70c77e55fd0514564a6-d515-4c72-b427-db026390fc799b8c1711-e5d1-4f09-a5e8-ee20be9c89312389d52f-7bb6-4b0c-88c5-860bb4d122d57cc74a16-7df9-41bf-af33-cfefc7d180410e27387a-d828-4e7b-8471-88935df3515136bf86b1-481a-47d5-af87-3a108c299ff4799b15b0-94bd-4d86-971a-220f44035b981abf09a1-b1ac-4738-b8e0-d3ca43a99d0d4a353088-630e-4561-b8f0-c68e243b1ce88e1103fc-67aa-4e4f-bb48-74f0b1b1101dea99fbf2-3012-4767-89f0-c9202e067507e3474da1-d020-4cda-97ac-4505039246ecc88ef619-d4c1-4503-bde8-4481477cddc427010827-5e50-4440-9919-557eb5353923128a451e-ab41-436b-9b20-925d8eeeb8d6566f4f5e-ee3d-4b39-92eb-e670b8b3f11b70d8c85e-c65e-425a-a8ee-1124ae45e3a767b9a209-8521-4100-8794-40454eb2730d36f9acb1-31d5-4609-89b0-aa7824e8df472dbde2fc-5cfd-49b2-91e6-e89dae2e3c523e22078c-8f80-4d4f-8ec5-82af4361f0394538e640-acfd-4379-8c21-bed17a579d6eaf3614ec-7d2c-496e-a270-de012b17bf6b954a4ba5-30d4-4e57-9e6d-f3b080ac161c4dfc7ed1-5064-4be2-8d0e-d45e76ec937651bc4b73-849b-489c-9216-0fd9f52cf1a5b4d17b3e-3327-4e2b-a347-87e869cd07622a25f07a-1a12-41be-a33a-3d3ba14f7e440e5b0cff-3bc7-41d3-a277-2282a2675b5b",
                                                         -73, "c61f17b7-b13c-47ec-9ee1-800273551556",
                                                         "c22abb08-d0ff-4bd5-80e0-d7927852006e7284b83e-933d-42ac-9257-971f5de7debea3f0db67-de22-4a59-b4c5-2983654a12c5e48e1404-2324-4862-ac41-625dd444c1a5",
                                                         new Date(1562657745847L));
        assertFalse(devicegroupInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceGroup devicegroup1 = new DeviceGroup(new Date(1562657746484L), null,
                                                       "926deaab-6756-4aaf-8558-20ec775e4b98", 92,
                                                       "0da48d21-2b69-43ba-b39e-7ccd3fafd4da",
                                                       "3702b771-5eb9-4d5b-bf20-ec1d10cb2bff",
                                                       new Date(1562657749721L));
            DeviceGroup devicegroup2 = new DeviceGroup(new Date(1562657746484L), null,
                                                       "926deaab-6756-4aaf-8558-20ec775e4b98", 92,
                                                       "0da48d21-2b69-43ba-b39e-7ccd3fafd4da",
                                                       "3702b771-5eb9-4d5b-bf20-ec1d10cb2bff",
                                                       new Date(1562657749721L));
            DeviceGroup devicegroup3 = new DeviceGroup(new Date(1562657744452L), null,
                                                       "90af8539-3eab-49de-9eb5-6f37827ca868", 112,
                                                       "a5ff162a-266b-4e61-aaab-d7b3c8ad2bb1",
                                                       "46b6d631-f79c-4119-a18f-999c591320d2",
                                                       new Date(1562657751957L));
            assertNotNull(devicegroup1);
            assertNotNull(devicegroup2);
            assertNotNull(devicegroup3);
            assertNotSame(devicegroup2, devicegroup1);
            assertNotSame(devicegroup3, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup2, devicegroup1);
            assertEquals(devicegroup1, devicegroup2);
            assertEquals(devicegroup1, devicegroup1);
            assertFalse(devicegroup1.equals(null));
            assertNotEquals(devicegroup3, devicegroup1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEventsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEventsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(76),
                                                                                           Long.valueOf(-82),
                                                                                           Order.getDefault(),
                                                                                           "64165f98-6ec0-4c60-86b5-ffa92822952f",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = deviceeventslistoptions1.clone();
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings({ "boxing", "resource" })
    @Test
    public void testFilters() {
        try {
            DeviceEventsListOptions option = new DeviceEventsListOptions().equalToDeviceId("09244501-0ecb-4289-88cd-28c9c8cad4ea")
                                                                          .notEqualToDeviceId("479bdedd-812a-4358-81f1-26acd5caa245")
                                                                          .inDeviceIds(Arrays.asList("0714976f-4743-4cad-b5b2-19837e690bf7",
                                                                                                     "87cc3c03-e5b0-4719-9020-34d98ddb2137",
                                                                                                     "24c47a43-faa5-4174-9acc-f06b1530d504",
                                                                                                     "15deab57-358b-461e-847c-113c20208bb3",
                                                                                                     "fa8a4eef-8a7c-4737-8153-5a3570fd358d",
                                                                                                     "311ae2d8-c06e-4037-9180-863b07bcfe42",
                                                                                                     "4f03a0e2-8b94-4676-b2ae-bc412791e6e1"))
                                                                          .notInDeviceIds(Arrays.asList("bce1cb6b-30d0-4a3c-8aba-7521067deb1d",
                                                                                                        "38588099-4c5d-4e1e-a0ea-492d519583c2",
                                                                                                        "1c1f1d72-a430-42b3-b7a9-925569e1e66d",
                                                                                                        "16689391-1248-4d27-9818-ec3edb0efe75",
                                                                                                        "dccaeeaf-e792-4614-8233-1240c05811c9",
                                                                                                        "dc61661c-382e-48fd-9c19-90853dd7ff1a",
                                                                                                        "0ccbd978-fda5-4451-af04-123a1c6642de",
                                                                                                        "79e286d2-6654-4bca-b644-eed0e9c42f1b",
                                                                                                        "53c8df25-0770-43ac-8891-c7860b33c2de"))
                                                                          .equalToDescription("ce136d24-5ef3-42fe-83c5-5ea5a1201cf9")
                                                                          .notEqualToDescription("d060d93a-b6c9-487c-aada-bcce7bde7582")
                                                                          .inDescriptions(Arrays.asList("14d75778-0d17-4a6c-bbd7-5ca029568c5a",
                                                                                                        "41d8cabd-1ba9-4ace-bd6e-0432206db5e0",
                                                                                                        "5ad9bccd-ebf9-40dc-ac3e-95beb1cb847c"))
                                                                          .notInDescriptions(Arrays.asList("061eff3f-62d6-4d7a-b958-ce7338149194",
                                                                                                           "8fcae98e-61a8-4a29-af48-40df092ce150"))
                                                                          .inDateTimes(Arrays.asList(new Date(1558003279325L),
                                                                                                     new Date(1558003276488L),
                                                                                                     new Date(1558003279517L),
                                                                                                     new Date(1558003283338L)))
                                                                          .notInDateTimes(Arrays.asList(new Date(1558003275513L),
                                                                                                        new Date(1558003280088L),
                                                                                                        new Date(1558003283901L),
                                                                                                        new Date(1558003276414L)))
                                                                          .lessThanDateTime(new Date(1558003278877L))
                                                                          .greaterThanDateTime(new Date(1558003278796L))
                                                                          .equalToStateChange(Boolean.FALSE)
                                                                          .notEqualToStateChange(Boolean.TRUE)
                                                                          .equalToId("5841bcc3-2870-4e17-bc1f-10f357781b14")
                                                                          .notEqualToId("4c4ae1d6-0801-4da3-86b8-952348d53b34")
                                                                          .inIds(Arrays.asList("70fcce1b-5b5f-4939-b4f8-d6ae84313caa",
                                                                                               "43a2a7cb-993c-4bae-9af5-f392e6cbc795",
                                                                                               "c178844c-106a-4e03-ad85-c7dc05c511fc"))
                                                                          .notInIds(Arrays.asList("e10d6863-7892-40c1-960b-8541b03b385f"))
                                                                          .equalToEventType("2820d74f-11f3-4035-9e9f-4b599bd8523f")
                                                                          .notEqualToEventType("f6c24019-97bb-4ece-8528-04c146f17112")
                                                                          .inEventTypes(Arrays.asList("b321d320-8fb6-46d3-b2ce-c20599f054ae",
                                                                                                      "f6747036-5cfb-4213-8b9e-0bc7b01ad5d7",
                                                                                                      "2ddbadf8-c42d-45b7-a069-0c39e9fea08d"))
                                                                          .notInEventTypes(Arrays.asList("9dedd05a-c642-47dc-9d28-1d43e43d63ba",
                                                                                                         "4b3fd68e-e1ee-477d-8709-df11d333bef4"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("09244501-0ecb-4289-88cd-28c9c8cad4ea",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("479bdedd-812a-4358-81f1-26acd5caa245",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("0714976f-4743-4cad-b5b2-19837e690bf7", "87cc3c03-e5b0-4719-9020-34d98ddb2137",
                                       "24c47a43-faa5-4174-9acc-f06b1530d504", "15deab57-358b-461e-847c-113c20208bb3",
                                       "fa8a4eef-8a7c-4737-8153-5a3570fd358d", "311ae2d8-c06e-4037-9180-863b07bcfe42",
                                       "4f03a0e2-8b94-4676-b2ae-bc412791e6e1"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("bce1cb6b-30d0-4a3c-8aba-7521067deb1d", "38588099-4c5d-4e1e-a0ea-492d519583c2",
                                       "1c1f1d72-a430-42b3-b7a9-925569e1e66d", "16689391-1248-4d27-9818-ec3edb0efe75",
                                       "dccaeeaf-e792-4614-8233-1240c05811c9", "dc61661c-382e-48fd-9c19-90853dd7ff1a",
                                       "0ccbd978-fda5-4451-af04-123a1c6642de", "79e286d2-6654-4bca-b644-eed0e9c42f1b",
                                       "53c8df25-0770-43ac-8891-c7860b33c2de"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("ce136d24-5ef3-42fe-83c5-5ea5a1201cf9",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("d060d93a-b6c9-487c-aada-bcce7bde7582",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("14d75778-0d17-4a6c-bbd7-5ca029568c5a", "41d8cabd-1ba9-4ace-bd6e-0432206db5e0",
                                       "5ad9bccd-ebf9-40dc-ac3e-95beb1cb847c"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("061eff3f-62d6-4d7a-b958-ce7338149194", "8fcae98e-61a8-4a29-af48-40df092ce150"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1558003279325L), new Date(1558003276488L), new Date(1558003279517L),
                                       new Date(1558003283338L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.NOT_IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1558003275513L), new Date(1558003280088L), new Date(1558003283901L),
                                       new Date(1558003276414L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.LESS_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1558003278877L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.GREATER_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1558003278796L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE,
                                                                       Boolean.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("5841bcc3-2870-4e17-bc1f-10f357781b14",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("4c4ae1d6-0801-4da3-86b8-952348d53b34",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("70fcce1b-5b5f-4939-b4f8-d6ae84313caa", "43a2a7cb-993c-4bae-9af5-f392e6cbc795",
                                       "c178844c-106a-4e03-ad85-c7dc05c511fc"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("e10d6863-7892-40c1-960b-8541b03b385f"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("2820d74f-11f3-4035-9e9f-4b599bd8523f",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("f6c24019-97bb-4ece-8528-04c146f17112",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("b321d320-8fb6-46d3-b2ce-c20599f054ae", "f6747036-5cfb-4213-8b9e-0bc7b01ad5d7",
                                       "2ddbadf8-c42d-45b7-a069-0c39e9fea08d"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("9dedd05a-c642-47dc-9d28-1d43e43d63ba", "4b3fd68e-e1ee-477d-8709-df11d333bef4"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    List.class, option));
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(-69),
                                                                                           Long.valueOf(45),
                                                                                           Order.getDefault(),
                                                                                           "357b26ac-8321-4e70-a9af-314c951af699",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(-69),
                                                                                           Long.valueOf(45),
                                                                                           Order.getDefault(),
                                                                                           "357b26ac-8321-4e70-a9af-314c951af699",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2.hashCode(), deviceeventslistoptions1.hashCode());
            int hashCode = deviceeventslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceeventslistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(28),
                                                                                           Long.valueOf(-115),
                                                                                           Order.getDefault(),
                                                                                           "12ae961f-8f36-41f2-9cbe-98fb5fa471ce",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(28),
                                                                                           Long.valueOf(-115),
                                                                                           Order.getDefault(),
                                                                                           "12ae961f-8f36-41f2-9cbe-98fb5fa471ce",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions3 = new DeviceEventsListOptions(Integer.valueOf(-32),
                                                                                           Long.valueOf(-20),
                                                                                           Order.getDefault(),
                                                                                           "04152617-ce6b-430b-909d-f37a61abb3bd",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotNull(deviceeventslistoptions3);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertNotSame(deviceeventslistoptions3, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions2);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions1);
            assertFalse(deviceeventslistoptions1.equals(null));
            assertNotEquals(deviceeventslistoptions3, deviceeventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

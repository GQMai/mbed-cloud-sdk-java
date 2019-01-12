// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollment.
 */
public class TestDeviceEnrollment {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("1b03dc0a-5d33-41e5-bd9f-2dc7b105d5aa",
                                                                      new Date(1547225903357L),
                                                                      new Date(1547225901690L),
                                                                      "PoeZ20O1279cC4jp573H20wouCl8cOh1",
                                                                      "A-zM:5y2:aM00kjU:6OO1vtU:9D4pvpMRSlR5di:U8U5oD66188mXF62W19724Ehp7H:Xff14NdF2KXGzUY2MwftvC04:45yw",
                                                                      new Date(1547225902510L),
                                                                      "UXa0Tj9xN0Yy079rziK5oq2E5fn9k0GK");
            DeviceEnrollment deviceenrollment2 = deviceenrollment1.clone();
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
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
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("c309a36e-05e9-4f00-b795-dfbb8355b91c",
                                                                      new Date(1547225902461L),
                                                                      new Date(1547225901680L),
                                                                      "2Mr2339my4r73xR0Vg9dK1a1sXTtWge4",
                                                                      "A-EjwFAHnZLN68P8EHe164RfxJ0Zmv761oNs2t1wt8h1Y2C:4mkNpS0494URkAHjSBy9cci8JzHG0:lMYQ94aP5ALPDv1hyTd",
                                                                      new Date(1547225903554L),
                                                                      "MEL7oT52WZcv4UR06oo9yZayW0kjn62B");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("c309a36e-05e9-4f00-b795-dfbb8355b91c",
                                                                      new Date(1547225902461L),
                                                                      new Date(1547225901680L),
                                                                      "2Mr2339my4r73xR0Vg9dK1a1sXTtWge4",
                                                                      "A-EjwFAHnZLN68P8EHe164RfxJ0Zmv761oNs2t1wt8h1Y2C:4mkNpS0494URkAHjSBy9cci8JzHG0:lMYQ94aP5ALPDv1hyTd",
                                                                      new Date(1547225903554L),
                                                                      "MEL7oT52WZcv4UR06oo9yZayW0kjn62B");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2.hashCode(), deviceenrollment1.hashCode());
            int hashCode = deviceenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollment1.hashCode());
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
        DeviceEnrollment deviceenrollment = new DeviceEnrollment("5e79f9b3-63f7-479e-9c66-847c06770bbb",
                                                                 new Date(1547225897152L), new Date(1547225897705L),
                                                                 "8nz4rZa6C4QUa3YvuqU0hQy5WJylTQL7",
                                                                 "A-0p832fC51V:6hfUsHlr:T3gFKP:9S2VvEP50Lwfw3p2nh0R28SoYLxK0yzUe:56f1iV4e::Jj3MIc:nr0TOHYqm86TS90rp",
                                                                 new Date(1547225902771L),
                                                                 "G6lqQkwFBpW2QK16ql6NrDHSrgMEx5qz");
        assertTrue(deviceenrollment.isValid());
        DeviceEnrollment deviceenrollmentInvalid = new DeviceEnrollment("6d1a2227-5487-4a3b-8f09-197ba82cd945",
                                                                        new Date(1547225897941L),
                                                                        new Date(1547225896058L),
                                                                        "⡶`t7,A\u001bXkT`[LkbrW7<\u001e矩OG5:X(5䴒75궖5왔G\u0006=駄actmmF55WStoeRajoXLororꕱR7",
                                                                        null, new Date(1547225895684L),
                                                                        "YY[=UYvO6Ml\u0001<iqLSvRM8HMMnf686EL nᄯ(F`6Y8=Y昅MrwY8Y68M+\u0012\u001dFE-\u0001/YYs6");
        assertFalse(deviceenrollmentInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("0a80bf1a-5944-4de0-b5b6-64fbe8fe8db5",
                                                                      new Date(1547225899322L),
                                                                      new Date(1547225900434L),
                                                                      "dj22NW32bVQ4Wm0eeK952tT8y5FY541e",
                                                                      "A-DcxihF5Ojk7TXCp9t684d8S1BoDPCfqXtrCJEOy1fX8F3P524SV7HpX3Vxpn0keZNQML:BryH4B7sru5m:8s:Ynx6:cTxXV",
                                                                      new Date(1547225897538L),
                                                                      "0kUu7wzS1D297MxHZJUvE91ch8bY1vqK");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("0a80bf1a-5944-4de0-b5b6-64fbe8fe8db5",
                                                                      new Date(1547225899322L),
                                                                      new Date(1547225900434L),
                                                                      "dj22NW32bVQ4Wm0eeK952tT8y5FY541e",
                                                                      "A-DcxihF5Ojk7TXCp9t684d8S1BoDPCfqXtrCJEOy1fX8F3P524SV7HpX3Vxpn0keZNQML:BryH4B7sru5m:8s:Ynx6:cTxXV",
                                                                      new Date(1547225897538L),
                                                                      "0kUu7wzS1D297MxHZJUvE91ch8bY1vqK");
            DeviceEnrollment deviceenrollment3 = new DeviceEnrollment("30081e4d-b738-4d73-9fbb-498437561672",
                                                                      new Date(1547225898726L),
                                                                      new Date(1547225901869L),
                                                                      "g8IW5U6Vj7sJ4L9j0uXjSW0IMHzj40zh",
                                                                      "A-kAHZ6jGNI7ay72MvGv9wWvn5Y:lG5tiiN345I16M8MEi6pP19:2uKGOoChIIG0:4mb0JJF53l:5ptLGAEZqp2m4v5p9lu6u",
                                                                      new Date(1547225898107L),
                                                                      "V2D55WVrxhHi60XdyLZ8B48T07601pn5");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotNull(deviceenrollment3);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertNotSame(deviceenrollment3, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment1, deviceenrollment2);
            assertEquals(deviceenrollment1, deviceenrollment1);
            assertFalse(deviceenrollment1.equals(null));
            assertNotEquals(deviceenrollment3, deviceenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
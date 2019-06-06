// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model LightThemeImage.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeImage {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LightThemeImage lightthemeimage1 = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                                   "54674b94-0b92-48b3-8309-953bef5ebf17",
                                                                   new Date(1559758606105L));
            LightThemeImage lightthemeimage2 = lightthemeimage1.clone();
            assertNotNull(lightthemeimage1);
            assertNotNull(lightthemeimage2);
            assertNotSame(lightthemeimage2, lightthemeimage1);
            assertEquals(lightthemeimage2, lightthemeimage1);
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
            LightThemeImage lightthemeimage1 = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                                   "ca84ace3-ffeb-4176-acf0-1af1a1bda75e",
                                                                   new Date(1559758610336L));
            LightThemeImage lightthemeimage2 = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                                   "ca84ace3-ffeb-4176-acf0-1af1a1bda75e",
                                                                   new Date(1559758610336L));
            assertNotNull(lightthemeimage1);
            assertNotNull(lightthemeimage2);
            assertNotSame(lightthemeimage2, lightthemeimage1);
            assertEquals(lightthemeimage2, lightthemeimage1);
            assertEquals(lightthemeimage2.hashCode(), lightthemeimage1.hashCode());
            int hashCode = lightthemeimage1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, lightthemeimage1.hashCode());
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
        LightThemeImage lightthemeimage = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                              "c5482898-d420-4e85-a50c-7d66ef82cc51",
                                                              new Date(1559758605229L));
        assertTrue(lightthemeimage.isValid());
        LightThemeImage lightthemeimageInvalid = new LightThemeImage(null, "26290c7e-04a0-4237-9068-5ebeb567661b",
                                                                     new Date(1559758609337L));
        assertFalse(lightthemeimageInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            LightThemeImage lightthemeimage1 = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                                   "5d6880ee-7b55-4e0f-b68d-8de258d55ec4",
                                                                   new Date(1559758612037L));
            LightThemeImage lightthemeimage2 = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                                   "5d6880ee-7b55-4e0f-b68d-8de258d55ec4",
                                                                   new Date(1559758612037L));
            LightThemeImage lightthemeimage3 = new LightThemeImage(LightThemeImageReference.getDefault(),
                                                                   "ca0ed660-72d6-48c7-ae17-0b8bc179fb35",
                                                                   new Date(1559758611017L));
            assertNotNull(lightthemeimage1);
            assertNotNull(lightthemeimage2);
            assertNotNull(lightthemeimage3);
            assertNotSame(lightthemeimage2, lightthemeimage1);
            assertNotSame(lightthemeimage3, lightthemeimage1);
            assertEquals(lightthemeimage2, lightthemeimage1);
            assertEquals(lightthemeimage2, lightthemeimage1);
            assertEquals(lightthemeimage1, lightthemeimage2);
            assertEquals(lightthemeimage1, lightthemeimage1);
            assertFalse(lightthemeimage1.equals(null));
            assertNotEquals(lightthemeimage3, lightthemeimage1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}

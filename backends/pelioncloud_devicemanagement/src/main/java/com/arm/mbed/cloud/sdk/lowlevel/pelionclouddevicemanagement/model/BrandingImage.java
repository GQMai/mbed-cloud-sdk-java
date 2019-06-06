/*
 * Pelion Device Management API
 * Pelion Device Management API build from the publicly defined API definitions.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * BrandingImage
 */

public class BrandingImage implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Entity name: always &#39;branding_image&#39;
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        IMAGE("branding_image");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ObjectEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ObjectEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ObjectEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("object")
    private ObjectEnum object = null;

    /**
     * Name of the image.
     */
    @JsonAdapter(ReferenceEnum.Adapter.class)
    public enum ReferenceEnum {
        BRAND_LOGO_PORTRAIT("brand_logo_portrait"),

        BRAND_LOGO_SQUARE("brand_logo_square"),

        BRAND_LOGO_LANDSCAPE("brand_logo_landscape"),

        BRAND_LOGO_EMAIL("brand_logo_email"),

        DESKTOP_BACKGROUND_LANDSCAPE("desktop_background_landscape"),

        DESKTOP_BACKGROUND_SQUARE("desktop_background_square"),

        DESKTOP_BACKGROUND_PORTRAIT("desktop_background_portrait"),

        CAROUSEL_IMAGE_PORTRAIT_0("carousel_image_portrait_0"),

        CAROUSEL_IMAGE_PORTRAIT_1("carousel_image_portrait_1"),

        CAROUSEL_IMAGE_PORTRAIT_2("carousel_image_portrait_2"),

        CAROUSEL_IMAGE_PORTRAIT_3("carousel_image_portrait_3"),

        CAROUSEL_IMAGE_PORTRAIT_4("carousel_image_portrait_4"),

        CAROUSEL_IMAGE_PORTRAIT_5("carousel_image_portrait_5"),

        CAROUSEL_IMAGE_PORTRAIT_6("carousel_image_portrait_6"),

        CAROUSEL_IMAGE_PORTRAIT_7("carousel_image_portrait_7"),

        CAROUSEL_IMAGE_PORTRAIT_8("carousel_image_portrait_8"),

        CAROUSEL_IMAGE_PORTRAIT_9("carousel_image_portrait_9"),

        CAROUSEL_IMAGE_SQUARE_0("carousel_image_square_0"),

        CAROUSEL_IMAGE_SQUARE_1("carousel_image_square_1"),

        CAROUSEL_IMAGE_SQUARE_2("carousel_image_square_2"),

        CAROUSEL_IMAGE_SQUARE_3("carousel_image_square_3"),

        CAROUSEL_IMAGE_SQUARE_4("carousel_image_square_4"),

        CAROUSEL_IMAGE_SQUARE_5("carousel_image_square_5"),

        CAROUSEL_IMAGE_SQUARE_6("carousel_image_square_6"),

        CAROUSEL_IMAGE_SQUARE_7("carousel_image_square_7"),

        CAROUSEL_IMAGE_SQUARE_8("carousel_image_square_8"),

        CAROUSEL_IMAGE_SQUARE_9("carousel_image_square_9"),

        CAROUSEL_IMAGE_LANDSCAPE_0("carousel_image_landscape_0"),

        CAROUSEL_IMAGE_LANDSCAPE_1("carousel_image_landscape_1"),

        CAROUSEL_IMAGE_LANDSCAPE_2("carousel_image_landscape_2"),

        CAROUSEL_IMAGE_LANDSCAPE_3("carousel_image_landscape_3"),

        CAROUSEL_IMAGE_LANDSCAPE_4("carousel_image_landscape_4"),

        CAROUSEL_IMAGE_LANDSCAPE_5("carousel_image_landscape_5"),

        CAROUSEL_IMAGE_LANDSCAPE_6("carousel_image_landscape_6"),

        CAROUSEL_IMAGE_LANDSCAPE_7("carousel_image_landscape_7"),

        CAROUSEL_IMAGE_LANDSCAPE_8("carousel_image_landscape_8"),

        CAROUSEL_IMAGE_LANDSCAPE_9("carousel_image_landscape_9");

        private String value;

        ReferenceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ReferenceEnum fromValue(String text) {
            for (ReferenceEnum b : ReferenceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ReferenceEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ReferenceEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ReferenceEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ReferenceEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("reference")
    private ReferenceEnum reference = null;

    @SerializedName("static_uri")
    private String staticUri = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    /**
     * Entity name: always &#39;branding_image&#39;
     * 
     * @return object
     **/
    @ApiModelProperty(value = "Entity name: always 'branding_image'")
    public ObjectEnum getObject() {
        return object;
    }

    public BrandingImage reference(ReferenceEnum reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Name of the image.
     * 
     * @return reference
     **/
    @ApiModelProperty(value = "Name of the image.")
    public ReferenceEnum getReference() {
        return reference;
    }

    public void setReference(ReferenceEnum reference) {
        this.reference = reference;
    }

    /**
     * The static link to the image.
     * 
     * @return staticUri
     **/
    @ApiModelProperty(example = "https://static.mbed.com/123456789.jpg", value = "The static link to the image.")
    public String getStaticUri() {
        return staticUri;
    }

    /**
     * Last update time in UTC.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2018-02-14T15:24:14Z", value = "Last update time in UTC.")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandingImage brandingImage = (BrandingImage) o;
        return Objects.equals(this.object, brandingImage.object)
               && Objects.equals(this.reference, brandingImage.reference)
               && Objects.equals(this.staticUri, brandingImage.staticUri)
               && Objects.equals(this.updatedAt, brandingImage.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, reference, staticUri, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandingImage {\n");

        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    staticUri: ").append(toIndentedString(staticUri)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

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

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Business model for this account. Manageable by the root admin only.
 */
@JsonAdapter(BusinessModel.Adapter.class)
public enum BusinessModel {

    ACTIVE_DEVICE_BUSINESS_MODEL("active_device_business_model"),

    API_CALLS_1_BUSINESS_MODEL("api_calls_1_business_model");

    private String value;

    BusinessModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessModel fromValue(String text) {
        for (BusinessModel b : BusinessModel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<BusinessModel> {
        @Override
        public void write(final JsonWriter jsonWriter, final BusinessModel enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BusinessModel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BusinessModel.fromValue(String.valueOf(value));
        }
    }
}

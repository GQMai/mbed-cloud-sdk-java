package com.arm.pelion.sdk.foundation.generator.model;

import java.util.Date;

import com.arm.mbed.cloud.sdk.common.model.DataFile;

public class TypePrimitive {

    @SuppressWarnings("incomplete-switch")
    public static Class<?> getDataType(String type, String format) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "string":
                return getStringClass(format);
            case "integer":
                return getIntegerClass(format);
            case "number":
                return getNumberClass(format);
            case "boolean":
                return boolean.class;
            case "file":
                return DataFile.class;
        }
        return null;
    }

    @SuppressWarnings("incomplete-switch")
    private static Class<?> getNumberClass(String format) {
        if (format == null) {
            return double.class;
        }
        switch (format) {
            case "float":
                return float.class;
            case "double":
                return double.class;
        }
        return double.class;
    }

    private static Class<?> getIntegerClass(String format) {
        if (format == null) {
            return int.class;
        }
        switch (format) {
            case "int32":
                return int.class;
            case "int64":
                return long.class;
        }
        return int.class;
    }

    private static Class<?> getStringClass(String format) {
        if (format == null) {
            return String.class;
        }
        switch (format) {
            case "binary":
                return byte[].class;
            case "byte":
                return String.class;
            case "date":
            case "date-time":
                return Date.class;
        }
        return String.class;
    }

}
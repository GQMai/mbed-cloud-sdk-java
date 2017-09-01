package com.arm.mbed.cloud.sdk.common.listing.filtering;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SDKEnum;

@Preamble(description = "Filter operator")
public enum FilterOperator implements SDKEnum {

    NOT_EQUAL("not equal to", FilterMarshaller.SUFFIX_SEPARATOR + "neq", "$neq"), EQUAL("equal to", null,
            "$eq"), GREATER_THAN("greater than", FilterMarshaller.SUFFIX_SEPARATOR + "gte",
                    "$gte"), LESS_THAN("less than", FilterMarshaller.SUFFIX_SEPARATOR + "lte", "$lte");

    private final String suffix;
    private final String string;
    private final String symbol;

    private FilterOperator(String string, String suffix, String symbol) {
        this.suffix = suffix;
        this.string = string;
        this.symbol = symbol;
    }

    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }

    @Override
    public boolean isDefault() {
        return this == getDefault();
    }

    public static FilterOperator getDefault() {
        return EQUAL;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getString() {
        return string;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return getString();
    }

    public static FilterOperator getFromSuffix(String suffix) {
        if (suffix != null) {
            suffix = suffix.trim();
            suffix = suffix.replace(FilterMarshaller.SUFFIX_SEPARATOR, "");
        }
        for (FilterOperator operator : values()) {
            String opSuffix = operator.getSuffix();
            if (opSuffix != null) {
                opSuffix = opSuffix.replace(FilterMarshaller.SUFFIX_SEPARATOR, "");
                if (opSuffix.equalsIgnoreCase(suffix)) {
                    return operator;
                }
            } else {
                if (suffix == null || suffix.isEmpty()) {
                    return operator;
                }
            }
        }
        return getDefault();
    }

    public static FilterOperator getFromSymbol(String symbol) {
        if (symbol == null) {
            return getDefault();
        }
        symbol = symbol.trim();
        for (FilterOperator operator : values()) {
            if (operator.getSymbol().equalsIgnoreCase(symbol)) {
                return operator;
            }
        }
        return getDefault();
    }

    @Override
    public <T extends SDKEnum> T merge(T obj1, T obj2) {
        if (obj1 == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj1;
        }
        if (obj1.isDefault()) {
            return obj2;
        }
        if (obj2.isDefault()) {
            return obj1;
        }
        return obj2;
    }
}

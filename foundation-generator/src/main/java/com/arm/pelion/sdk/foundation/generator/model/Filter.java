package com.arm.pelion.sdk.foundation.generator.model;

import com.arm.mbed.cloud.sdk.common.listing.FilterOptions;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import com.arm.pelion.sdk.foundation.generator.util.Utils;

public class Filter {

    private String fieldName;
    private String specFieldName;
    private TypeParameter fieldType;
    private FilterOperator operator;
    private boolean isVerified;

    public Filter(String fieldName, String specFieldName, TypeParameter fieldType, FilterOperator operator,
                  boolean isVerified) {
        super();
        this.fieldName = fieldName;
        this.specFieldName = specFieldName;
        this.fieldType = fieldType;
        this.operator = operator;
        this.isVerified = isVerified;
    }

    public Filter() {
        this(null, null, null, null, false);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getSpecFieldName() {
        return specFieldName;
    }

    public void setSpecFieldName(String specFieldName) {
        this.specFieldName = specFieldName;
    }

    public TypeParameter getFieldType() {
        return fieldType;
    }

    public void setFieldType(TypeParameter fieldType) {
        this.fieldType = fieldType == null ? fieldType : fieldType.clone();
    }

    public FilterOperator getOperator() {
        return operator;
    }

    public void setOperator(FilterOperator operator) {
        this.operator = operator;
    }

    public boolean correspondsToOperator(FilterOperator op) {
        return op == null ? false : op.equals(operator);
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean correspondsToParameter(Parameter parameter) {
        if (parameter == null) {
            return false;
        }
        return correspondsToParameter(parameter.getName());
    }

    public boolean correspondsToParameter(String parameterIdentifier) {
        if (parameterIdentifier == null) {
            return false;
        }
        return Utils.isSameParameter(parameterIdentifier, Utils.combineNames(false, fieldName, operator.getSuffix()))
               || Utils.isSameParameter(parameterIdentifier,
                                        Utils.combineNames(false, specFieldName, operator.getSuffix()));
    }

    public Field getTag() {
        Field tag = new Field(true, TypeFactory.stringType(), Utils.generateConstantName("tagFilterBy", fieldName),
                              "Tag for filter by " + fieldName, null, null, true, false, false, false, null, false)
                                                                                                                   .initialiser("\""
                                                                                                                                + fieldName
                                                                                                                                + "\"");
        tag.setAccessible(true);
        return tag;
    }

    public String getEncodingMethodName() {
        switch (operator) {
            case EQUAL:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_EQUAL;
            case GREATER_THAN:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_GREATER_THAN;
            case IN:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_IN;
            case LESS_THAN:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_LESS_THAN;
            case LIKE:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_LIKE;
            case NOT_EQUAL:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_NOT_EQUAL;
            case NOT_IN:
                return ListOptionsEncoder.METHOD_FILTER_ENCODE_NOT_IN;
            case UNKNOWN_ENUM:
            default:
                return null;
        }
    }

    public String getAddFilterMethodName() {
        switch (operator) {
            case EQUAL:
                return FilterOptions.METHOD_FILTER_ADD_EQUAL;
            case GREATER_THAN:
                return FilterOptions.METHOD_FILTER_ADD_GREATER_THAN;
            case IN:
                return FilterOptions.METHOD_FILTER_ADD_IN;
            case LESS_THAN:
                return FilterOptions.METHOD_FILTER_ADD_LESS_THAN;
            case LIKE:
                return FilterOptions.METHOD_FILTER_ADD_LIKE;
            case NOT_EQUAL:
                return FilterOptions.METHOD_FILTER_ADD_NOT_EQUAL;
            case NOT_IN:
                return FilterOptions.METHOD_FILTER_ADD_NOT_IN;
            case UNKNOWN_ENUM:
            default:
                return null;
        }
    }

    public boolean canHaveMultipleInputTypes() {
        return operator.isMultipleValuesOperator();
    }

    public String getIdentifier() {
        return fieldName + operator.getSuffix();
    }

    @Override
    public String toString() {
        return "Filter [field=" + fieldName + ", spec field=" + specFieldName + ", tag=" + getTag().getName()
               + ", operator=" + operator + ", type=" + (fieldType == null ? null : fieldType.getShortName())
               + ", isVerified=" + isVerified + "]";
    }

}

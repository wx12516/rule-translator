package com.asiainfo.rule.translator.model;

public enum BusiDataType {
    STRING(false),
    NUMBER(false),
    DATE(false),
    STRINGS(true),
    NUMBERS(true),
    DATES(true),
    ;

    final boolean isSingle;

    BusiDataType(boolean isSingleValue) {
        this.isSingle = isSingleValue;
    }

    public boolean isSingle() {
        return isSingle;
    }
}

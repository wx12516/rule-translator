package com.asiainfo.rule.translator.enums;

import java.util.HashMap;
import java.util.Map;

public enum OperationSymbol {
    EQUAL("=="),
    NOT_EQUAL("!="),
    LT("<"),
    GT(">"),
    LE("<="),
    GE(">="),
    IN("in"),
    NOT_IN("notIn"),
    ;
    private static final Map<String, OperationSymbol> OPERATION_SYMBOL_MAP = new HashMap<>(values().length);

    final String symbol;

    static {
        for (OperationSymbol o : values()) {
            OPERATION_SYMBOL_MAP.put(o.symbol, o);
        }
    }

    OperationSymbol(String symbol) {
        this.symbol = symbol;
    }

    public final String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

    public final static OperationSymbol toEnum(String symbol) {
        return OPERATION_SYMBOL_MAP.get(symbol);
    }

}
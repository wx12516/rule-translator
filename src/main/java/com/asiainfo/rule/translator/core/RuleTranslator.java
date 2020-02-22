package com.asiainfo.rule.translator.core;


@FunctionalInterface
public interface RuleTranslator<T, R> {
    R doTranslator(T sourceData);
}

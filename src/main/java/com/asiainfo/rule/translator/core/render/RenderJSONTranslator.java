package com.asiainfo.rule.translator.core.render;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.rule.translator.core.RuleTranslator;
import com.asiainfo.rule.translator.parser.render.RuleLexer;
import com.asiainfo.rule.translator.parser.render.RuleParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * 规则脚本翻译成前端渲染JSON
 */
public class RenderJSONTranslator implements RuleTranslator<String, JSONObject> {

    public JSONObject doTranslator(String ruleScript) {
        CharStream charStream = CharStreams.fromString(ruleScript);
        RuleLexer lexer = new RuleLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RuleParser parser = new RuleParser(tokens);
        RuleParser.ProgramContext program = parser.program();
        RenderTranslatorVisitor visitor = new RenderTranslatorVisitor();
        JSON res = visitor.visit(program);
        return JSONObject.class.cast(res);
    }

}

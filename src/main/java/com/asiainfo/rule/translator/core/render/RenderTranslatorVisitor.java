package com.asiainfo.rule.translator.core.render;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.rule.translator.parser.render.RuleBaseVisitor;
import com.asiainfo.rule.translator.parser.render.RuleParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RenderTranslatorVisitor extends RuleBaseVisitor<JSON> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RenderTranslatorVisitor.class);

    private final JSONArray condition = new JSONArray();
    private final JSONArray segment = new JSONArray();
    private final JSONObject calculator = new JSONObject();
    private final Map<String, String> segmentTempMap = new LinkedHashMap<>();


    @Override
    public JSON visitProgram(RuleParser.ProgramContext ctx) {
        for (Tree c : ctx.children) {
            if (c instanceof RuleParser.ConditionStatementContext) {
                visitConditionStatement((RuleParser.ConditionStatementContext) c);
            } else if (c instanceof RuleParser.SegmentStatementListContext) {
                visitSegmentStatementList((RuleParser.SegmentStatementListContext) c);
            }
        }
        return new JSONObject(3, true) {{
            put("condition", condition);
            put("segment", segment);
            put("calculator", calculator);
        }};
    }

    @Override
    public JSON visitConditionStatement(RuleParser.ConditionStatementContext ctx) {
        for (Tree c : ctx.children) {
            if (c instanceof RuleParser.ConditionExprContext) {
                visitConditionExpr((RuleParser.ConditionExprContext) c);
            } else if (c instanceof RuleParser.SegmentStatementListContext) {
                visitSegmentStatementList((RuleParser.SegmentStatementListContext) c);
            }
        }
        return null;
    }

    @Override
    public JSON visitConditionExpr(RuleParser.ConditionExprContext ctx) {
        for (Tree c : ctx.children) {
            if (c instanceof RuleParser.ConditionRowExprContext) {
                JSON v = visitConditionRowExpr((RuleParser.ConditionRowExprContext) c);
                condition.add(v);
            }
        }
        return null;
    }

    @Override
    public JSON visitConditionRowExpr(RuleParser.ConditionRowExprContext ctx) {
        JSONObject res = new JSONObject(5, true);
        res.put("left", toTokenString(ctx.left));
        res.put("busi", ctx.busiExpr.getText());
        res.put("operSymbol", toOperationSymbolString(ctx));
        res.put("busiDesc", ctx.busiDescExpr.getText());
        res.put("right", toTokenString(ctx.right));
        res.put("min", "");
        res.put("max", "");
        return res;
    }

    private String toOperationSymbolString(RuleParser.ConditionRowExprContext ctx) {
        if (ctx.BANG() != null && ctx.LPAREN() != null && ctx.RPAREN() != null  // notIn特殊处理 !(a in [1,2,3])
                && "in".equals(ctx.operSymbol.getText())) {
            return "notIn";
        }
        return ctx.operSymbol.getText();
    }

    private String toTokenString(Token t) {
        if (t == null) {
            return "";
        }
        return t.getText();
    }

    @Override
    public JSON visitSegmentStatementList(RuleParser.SegmentStatementListContext ctx) {
        for (Tree c : ctx.children) {
            visitSegmentStatement((RuleParser.SegmentStatementContext) c);
        }
        return null;
    }

    @Override
    public JSON visitSegmentStatement(RuleParser.SegmentStatementContext ctx) {
        for (Tree c : ctx.children) {
            if (c instanceof RuleParser.SegmentExprContext) {
                this.visitSegmentExpr((RuleParser.SegmentExprContext) c);
            } else if (c instanceof RuleParser.CalculatorStatementContext) {
                this.visitCalculatorStatement((RuleParser.CalculatorStatementContext) c);
            }
        }
        return null;
    }

    @Override
    public JSON visitSegmentSubExpr(RuleParser.SegmentSubExprContext ctx) {
        LOGGER.info("{} {} {}", ctx.left.getText(),
                ctx.op.getText(), ctx.right.getText());
        segment.add(ctx.getText());
        return null;
    }

}

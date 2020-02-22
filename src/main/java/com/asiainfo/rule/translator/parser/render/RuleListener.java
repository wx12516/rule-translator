// Generated from E:/development/java/SZ-support3/rule-translator/src/main/resources/render\Rule.g4 by ANTLR 4.8

package com.asiainfo.rule.translator.parser.render;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RuleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RuleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#defineVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefineVariableStatement(RuleParser.DefineVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#defineVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefineVariableStatement(RuleParser.DefineVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(RuleParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(RuleParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#segmentStatementList}.
	 * @param ctx the parse tree
	 */
	void enterSegmentStatementList(RuleParser.SegmentStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#segmentStatementList}.
	 * @param ctx the parse tree
	 */
	void exitSegmentStatementList(RuleParser.SegmentStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#segmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterSegmentStatement(RuleParser.SegmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#segmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitSegmentStatement(RuleParser.SegmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#calculatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCalculatorStatement(RuleParser.CalculatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#calculatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCalculatorStatement(RuleParser.CalculatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpr(RuleParser.ConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpr(RuleParser.ConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#conditionRowExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionRowExpr(RuleParser.ConditionRowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#conditionRowExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionRowExpr(RuleParser.ConditionRowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#segmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterSegmentExpr(RuleParser.SegmentExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#segmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitSegmentExpr(RuleParser.SegmentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#segmentSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterSegmentSubExpr(RuleParser.SegmentSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#segmentSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitSegmentSubExpr(RuleParser.SegmentSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code limitExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpr(RuleParser.LimitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code limitExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpr(RuleParser.LimitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(RuleParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(RuleParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(RuleParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(RuleParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(RuleParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(RuleParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExpr(RuleParser.NegativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExpr(RuleParser.NegativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(RuleParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(RuleParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(RuleParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(RuleParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(RuleParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(RuleParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(RuleParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(RuleParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(RuleParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(RuleParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(RuleParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(RuleParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(RuleParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(RuleParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(RuleParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(RuleParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(RuleParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(RuleParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(RuleParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(RuleParser.StringAtomContext ctx);
}
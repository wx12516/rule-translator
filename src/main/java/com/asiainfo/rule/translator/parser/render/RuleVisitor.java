// Generated from E:/development/java/SZ-support3/rule-translator/src/main/resources/render\Rule.g4 by ANTLR 4.8

package com.asiainfo.rule.translator.parser.render;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RuleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#defineVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVariableStatement(RuleParser.DefineVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(RuleParser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#segmentStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentStatementList(RuleParser.SegmentStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#segmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentStatement(RuleParser.SegmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#calculatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculatorStatement(RuleParser.CalculatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpr(RuleParser.ConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#conditionRowExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionRowExpr(RuleParser.ConditionRowExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#segmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentExpr(RuleParser.SegmentExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#segmentSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentSubExpr(RuleParser.SegmentSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limitExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitExpr(RuleParser.LimitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(RuleParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(RuleParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(RuleParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpr(RuleParser.NegativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(RuleParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(RuleParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(RuleParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link RuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(RuleParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(RuleParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(RuleParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(RuleParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(RuleParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(RuleParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link RuleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(RuleParser.StringAtomContext ctx);
}
// Generated from E:/development/java/SZ-support3/rule-translator/src/main/resources/render\Rule.g4 by ANTLR 4.8

package com.asiainfo.rule.translator.parser.render;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, IF=2, IN=3, LIMIT=4, X1=5, X6=6, X7=7, DECIMAL_LITERAL=8, HEX_LITERAL=9, 
		OCT_LITERAL=10, BINARY_LITERAL=11, FLOAT_LITERAL=12, HEX_FLOAT_LITERAL=13, 
		BOOL_LITERAL=14, CHAR_LITERAL=15, STRING_LITERAL=16, LPAREN=17, RPAREN=18, 
		LBRACE=19, RBRACE=20, LBRACK=21, RBRACK=22, SEMI=23, COMMA=24, ASSIGN=25, 
		GT=26, LT=27, BANG=28, EQUAL=29, LE=30, GE=31, NOTEQUAL=32, AND=33, OR=34, 
		ADD=35, SUB=36, MUL=37, DIV=38, MOD=39, WS=40, COMMENT=41, LINE_COMMENT=42, 
		IDENTIFIER=43;
	public static final int
		RULE_program = 0, RULE_defineVariableStatement = 1, RULE_conditionStatement = 2, 
		RULE_segmentStatementList = 3, RULE_segmentStatement = 4, RULE_calculatorStatement = 5, 
		RULE_conditionExpr = 6, RULE_conditionRowExpr = 7, RULE_segmentExpr = 8, 
		RULE_segmentSubExpr = 9, RULE_expr = 10, RULE_array = 11, RULE_elementValue = 12, 
		RULE_atom = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defineVariableStatement", "conditionStatement", "segmentStatementList", 
			"segmentStatement", "calculatorStatement", "conditionExpr", "conditionRowExpr", 
			"segmentExpr", "segmentSubExpr", "expr", "array", "elementValue", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'if'", "'in'", "'limit'", "'X1'", "'X6'", "'X7'", null, 
			null, null, null, null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'='", "'>'", "'<'", "'!'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "IF", "IN", "LIMIT", "X1", "X6", "X7", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "ASSIGN", "GT", 
			"LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RuleParser.EOF, 0); }
		public DefineVariableStatementContext defineVariableStatement() {
			return getRuleContext(DefineVariableStatementContext.class,0);
		}
		public SegmentStatementListContext segmentStatementList() {
			return getRuleContext(SegmentStatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEF) {
					{
					setState(28);
					defineVariableStatement();
					}
				}

				setState(31);
				conditionStatement();
				setState(32);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEF) {
					{
					setState(34);
					defineVariableStatement();
					}
				}

				setState(37);
				segmentStatementList();
				setState(38);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineVariableStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RuleParser.DEF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RuleParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RuleParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuleParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(RuleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RuleParser.SEMI, i);
		}
		public DefineVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterDefineVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitDefineVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitDefineVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVariableStatementContext defineVariableStatement() throws RecognitionException {
		DefineVariableStatementContext _localctx = new DefineVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defineVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(DEF);
			setState(43);
			match(IDENTIFIER);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(44);
				match(COMMA);
				setState(45);
				match(IDENTIFIER);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(51);
				match(SEMI);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RuleParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(RuleParser.LPAREN, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuleParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(RuleParser.LBRACE, 0); }
		public CalculatorStatementContext calculatorStatement() {
			return getRuleContext(CalculatorStatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(RuleParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(RuleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RuleParser.SEMI, i);
		}
		public SegmentStatementListContext segmentStatementList() {
			return getRuleContext(SegmentStatementListContext.class,0);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditionStatement);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(IF);
				setState(58);
				match(LPAREN);
				setState(59);
				conditionExpr();
				setState(60);
				match(RPAREN);
				setState(61);
				match(LBRACE);
				setState(62);
				calculatorStatement();
				setState(63);
				match(RBRACE);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(64);
					match(SEMI);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(IF);
				setState(71);
				match(LPAREN);
				setState(72);
				conditionExpr();
				setState(73);
				match(RPAREN);
				setState(74);
				match(LBRACE);
				setState(75);
				segmentStatementList();
				setState(76);
				match(RBRACE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(77);
					match(SEMI);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentStatementListContext extends ParserRuleContext {
		public List<SegmentStatementContext> segmentStatement() {
			return getRuleContexts(SegmentStatementContext.class);
		}
		public SegmentStatementContext segmentStatement(int i) {
			return getRuleContext(SegmentStatementContext.class,i);
		}
		public SegmentStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSegmentStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSegmentStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSegmentStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentStatementListContext segmentStatementList() throws RecognitionException {
		SegmentStatementListContext _localctx = new SegmentStatementListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_segmentStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				segmentStatement();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RuleParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(RuleParser.LPAREN, 0); }
		public SegmentExprContext segmentExpr() {
			return getRuleContext(SegmentExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuleParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(RuleParser.LBRACE, 0); }
		public CalculatorStatementContext calculatorStatement() {
			return getRuleContext(CalculatorStatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(RuleParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(RuleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RuleParser.SEMI, i);
		}
		public SegmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSegmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSegmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSegmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentStatementContext segmentStatement() throws RecognitionException {
		SegmentStatementContext _localctx = new SegmentStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_segmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			match(LPAREN);
			setState(92);
			segmentExpr();
			setState(93);
			match(RPAREN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(94);
				match(LBRACE);
				setState(95);
				calculatorStatement();
				setState(96);
				match(RBRACE);
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(100);
				match(SEMI);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculatorStatementContext extends ParserRuleContext {
		public List<TerminalNode> X6() { return getTokens(RuleParser.X6); }
		public TerminalNode X6(int i) {
			return getToken(RuleParser.X6, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(RuleParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(RuleParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> X7() { return getTokens(RuleParser.X7); }
		public TerminalNode X7(int i) {
			return getToken(RuleParser.X7, i);
		}
		public List<TerminalNode> X1() { return getTokens(RuleParser.X1); }
		public TerminalNode X1(int i) {
			return getToken(RuleParser.X1, i);
		}
		public TerminalNode MUL() { return getToken(RuleParser.MUL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(RuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(RuleParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(RuleParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(RuleParser.BINARY_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RuleParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(RuleParser.HEX_FLOAT_LITERAL, 0); }
		public List<TerminalNode> SEMI() { return getTokens(RuleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RuleParser.SEMI, i);
		}
		public TerminalNode LIMIT() { return getToken(RuleParser.LIMIT, 0); }
		public TerminalNode LPAREN() { return getToken(RuleParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuleParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(RuleParser.RPAREN, 0); }
		public CalculatorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculatorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterCalculatorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitCalculatorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitCalculatorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculatorStatementContext calculatorStatement() throws RecognitionException {
		CalculatorStatementContext _localctx = new CalculatorStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_calculatorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(X6);
			setState(107);
			match(ASSIGN);
			setState(108);
			expr(0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(109);
				match(SEMI);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(X7);
			setState(116);
			match(ASSIGN);
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(118);
				match(SEMI);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(X1);
			setState(125);
			match(ASSIGN);
			setState(126);
			match(X6);
			setState(127);
			match(MUL);
			setState(128);
			match(X7);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(129);
				match(SEMI);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X1) {
				{
				setState(135);
				match(X1);
				setState(136);
				match(ASSIGN);
				setState(137);
				match(LIMIT);
				setState(138);
				match(LPAREN);
				setState(139);
				expr(0);
				setState(140);
				match(COMMA);
				setState(141);
				match(X1);
				setState(142);
				match(COMMA);
				setState(143);
				expr(0);
				setState(144);
				match(RPAREN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(145);
					match(SEMI);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionExprContext extends ParserRuleContext {
		public List<ConditionRowExprContext> conditionRowExpr() {
			return getRuleContexts(ConditionRowExprContext.class);
		}
		public ConditionRowExprContext conditionRowExpr(int i) {
			return getRuleContext(ConditionRowExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RuleParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RuleParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(RuleParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RuleParser.OR, i);
		}
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitConditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitConditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			conditionRowExpr();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				conditionRowExpr();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionRowExprContext extends ParserRuleContext {
		public Token left;
		public ExprContext busiExpr;
		public Token operSymbol;
		public ExprContext busiDescExpr;
		public Token right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(RuleParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(RuleParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(RuleParser.LT, 0); }
		public TerminalNode GT() { return getToken(RuleParser.GT, 0); }
		public TerminalNode LE() { return getToken(RuleParser.LE, 0); }
		public TerminalNode GE() { return getToken(RuleParser.GE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(RuleParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(RuleParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(RuleParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(RuleParser.RPAREN, i);
		}
		public TerminalNode IN() { return getToken(RuleParser.IN, 0); }
		public TerminalNode BANG() { return getToken(RuleParser.BANG, 0); }
		public ConditionRowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionRowExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterConditionRowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitConditionRowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitConditionRowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionRowExprContext conditionRowExpr() throws RecognitionException {
		ConditionRowExprContext _localctx = new ConditionRowExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionRowExpr);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						((ConditionRowExprContext)_localctx).left = match(LPAREN);
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(167);
				((ConditionRowExprContext)_localctx).busiExpr = expr(0);
				setState(168);
				((ConditionRowExprContext)_localctx).operSymbol = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
					((ConditionRowExprContext)_localctx).operSymbol = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				((ConditionRowExprContext)_localctx).busiDescExpr = expr(0);
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						((ConditionRowExprContext)_localctx).right = match(RPAREN);
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						((ConditionRowExprContext)_localctx).left = match(LPAREN);
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(182);
					match(BANG);
					setState(183);
					match(LPAREN);
					}
					break;
				}
				setState(186);
				((ConditionRowExprContext)_localctx).busiExpr = expr(0);
				setState(187);
				((ConditionRowExprContext)_localctx).operSymbol = match(IN);
				setState(188);
				((ConditionRowExprContext)_localctx).busiDescExpr = expr(0);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(189);
					match(RPAREN);
					}
					break;
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						((ConditionRowExprContext)_localctx).right = match(RPAREN);
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentExprContext extends ParserRuleContext {
		public List<SegmentSubExprContext> segmentSubExpr() {
			return getRuleContexts(SegmentSubExprContext.class);
		}
		public SegmentSubExprContext segmentSubExpr(int i) {
			return getRuleContext(SegmentSubExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RuleParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RuleParser.AND, i);
		}
		public SegmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSegmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSegmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSegmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentExprContext segmentExpr() throws RecognitionException {
		SegmentExprContext _localctx = new SegmentExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_segmentExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			segmentSubExpr();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(201);
				match(AND);
				setState(202);
				segmentSubExpr();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentSubExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(RuleParser.LE, 0); }
		public TerminalNode LT() { return getToken(RuleParser.LT, 0); }
		public TerminalNode GE() { return getToken(RuleParser.GE, 0); }
		public TerminalNode GT() { return getToken(RuleParser.GT, 0); }
		public TerminalNode IN() { return getToken(RuleParser.IN, 0); }
		public SegmentSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSegmentSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSegmentSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSegmentSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentSubExprContext segmentSubExpr() throws RecognitionException {
		SegmentSubExprContext _localctx = new SegmentSubExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_segmentSubExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((SegmentSubExprContext)_localctx).left = expr(0);
			setState(209);
			((SegmentSubExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
				((SegmentSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			((SegmentSubExprContext)_localctx).right = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LimitExprContext extends ExprContext {
		public TerminalNode LIMIT() { return getToken(RuleParser.LIMIT, 0); }
		public TerminalNode LPAREN() { return getToken(RuleParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuleParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(RuleParser.RPAREN, 0); }
		public LimitExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterLimitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitLimitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode BANG() { return getToken(RuleParser.BANG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(RuleParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(RuleParser.SUB, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExprContext extends ExprContext {
		public TerminalNode SUB() { return getToken(RuleParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterNegativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitNegativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNegativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(RuleParser.LE, 0); }
		public TerminalNode GE() { return getToken(RuleParser.GE, 0); }
		public TerminalNode LT() { return getToken(RuleParser.LT, 0); }
		public TerminalNode GT() { return getToken(RuleParser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(RuleParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(RuleParser.NOTEQUAL, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RuleParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RuleParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RuleParser.MOD, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(RuleParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuleParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				_localctx = new LimitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				match(LIMIT);
				setState(214);
				match(LPAREN);
				setState(215);
				expr(0);
				setState(216);
				match(COMMA);
				setState(217);
				expr(0);
				setState(218);
				match(COMMA);
				setState(219);
				expr(0);
				setState(220);
				match(RPAREN);
				}
				break;
			case SUB:
				{
				_localctx = new NegativeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(SUB);
				setState(223);
				expr(8);
				}
				break;
			case BANG:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(BANG);
				setState(225);
				expr(7);
				}
				break;
			case LBRACK:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				array();
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				atom();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(LPAREN);
				setState(229);
				expr(0);
				setState(230);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(241);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(RuleParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RuleParser.RBRACK, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuleParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LBRACK);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIMIT) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << BANG) | (1L << SUB) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(249);
				elementValue();
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						match(COMMA);
						setState(251);
						elementValue();
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(257);
					match(COMMA);
					}
				}

				}
			}

			setState(262);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementValue);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode BOOL_LITERAL() { return getToken(RuleParser.BOOL_LITERAL, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode IDENTIFIER() { return getToken(RuleParser.IDENTIFIER, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING_LITERAL() { return getToken(RuleParser.STRING_LITERAL, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(RuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(RuleParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(RuleParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(RuleParser.BINARY_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RuleParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(RuleParser.HEX_FLOAT_LITERAL, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BOOL_LITERAL:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(BOOL_LITERAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\2\3\2\5"+
		"\2&\n\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13"+
		"\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D"+
		"\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4"+
		"T\13\4\5\4V\n\4\3\5\6\5Y\n\5\r\5\16\5Z\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6e\n\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16"+
		"\7t\13\7\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\5\7\u009a\n\7\3\b\3\b\3\b"+
		"\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\t\7\t\u00b4\n\t"+
		"\f\t\16\t\u00b7\13\t\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\3\t\3\t\5\t\u00c1\n"+
		"\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\5\t\u00c9\n\t\3\n\3\n\3\n\7\n"+
		"\u00ce\n\n\f\n\16\n\u00d1\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f6\n\f\f\f\16\f\u00f9"+
		"\13\f\3\r\3\r\3\r\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r\3\r\5\r\u0105"+
		"\n\r\5\r\u0107\n\r\3\r\3\r\3\16\3\16\5\16\u010d\n\16\3\17\3\17\3\17\3"+
		"\17\5\17\u0113\n\17\3\17\2\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\b\3\2\n\17\3\2#$\4\2\34\35\37\"\5\2\5\5\34\35 !\3\2\')\3\2%&\2\u012e"+
		"\2*\3\2\2\2\4,\3\2\2\2\6U\3\2\2\2\bX\3\2\2\2\n\\\3\2\2\2\fl\3\2\2\2\16"+
		"\u009b\3\2\2\2\20\u00c8\3\2\2\2\22\u00ca\3\2\2\2\24\u00d2\3\2\2\2\26\u00ea"+
		"\3\2\2\2\30\u00fa\3\2\2\2\32\u010c\3\2\2\2\34\u0112\3\2\2\2\36 \5\4\3"+
		"\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5\6\4\2\"#\7\2\2\3#+\3\2\2\2"+
		"$&\5\4\3\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\5\b\5\2()\7\2\2\3)+\3\2\2"+
		"\2*\37\3\2\2\2*%\3\2\2\2+\3\3\2\2\2,-\7\3\2\2-\62\7-\2\2./\7\32\2\2/\61"+
		"\7-\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\638\3\2"+
		"\2\2\64\62\3\2\2\2\65\67\7\31\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;<\7\4\2\2<=\7\23\2\2=>\5\16\b\2>?\7"+
		"\24\2\2?@\7\25\2\2@A\5\f\7\2AE\7\26\2\2BD\7\31\2\2CB\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FV\3\2\2\2GE\3\2\2\2HI\7\4\2\2IJ\7\23\2\2JK\5\16\b"+
		"\2KL\7\24\2\2LM\7\25\2\2MN\5\b\5\2NR\7\26\2\2OQ\7\31\2\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2U;\3\2\2\2UH\3\2\2\2V\7"+
		"\3\2\2\2WY\5\n\6\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\t\3\2\2\2"+
		"\\]\7\4\2\2]^\7\23\2\2^_\5\22\n\2_d\7\24\2\2`a\7\25\2\2ab\5\f\7\2bc\7"+
		"\26\2\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2ei\3\2\2\2fh\7\31\2\2gf\3\2\2\2h"+
		"k\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\13\3\2\2\2ki\3\2\2\2lm\7\b\2\2mn\7\33\2"+
		"\2nr\5\26\f\2oq\7\31\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2"+
		"\2\2tr\3\2\2\2uv\7\t\2\2vw\7\33\2\2w{\t\2\2\2xz\7\31\2\2yx\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\7\2\2\177\u0080"+
		"\7\33\2\2\u0080\u0081\7\b\2\2\u0081\u0082\7\'\2\2\u0082\u0086\7\t\2\2"+
		"\u0083\u0085\7\31\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0099\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7\7\2\2\u008a\u008b\7\33\2\2\u008b\u008c\7\6\2\2\u008c\u008d\7"+
		"\23\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\32\2\2\u008f\u0090\7\7\2\2"+
		"\u0090\u0091\7\32\2\2\u0091\u0092\5\26\f\2\u0092\u0096\7\24\2\2\u0093"+
		"\u0095\7\31\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u0089\3\2\2\2\u0099\u009a\3\2\2\2\u009a\r\3\2\2\2\u009b\u00a0\5\20\t"+
		"\2\u009c\u009d\t\3\2\2\u009d\u009f\5\20\t\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\23\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\t\4\2\2\u00ab"+
		"\u00af\5\26\f\2\u00ac\u00ae\7\24\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00c9\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\7\23\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00bb\7\23\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5\26\f\2\u00bd"+
		"\u00be\7\5\2\2\u00be\u00c0\5\26\f\2\u00bf\u00c1\7\24\2\2\u00c0\u00bf\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\7\24\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00a6\3\2\2\2\u00c8"+
		"\u00b5\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00cf\5\24\13\2\u00cb\u00cc\7#\2"+
		"\2\u00cc\u00ce\5\24\13\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\23\3\2\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\t\5\2\2\u00d4\u00d5\5\26\f\2\u00d5"+
		"\25\3\2\2\2\u00d6\u00d7\b\f\1\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\7\23\2"+
		"\2\u00d9\u00da\5\26\f\2\u00da\u00db\7\32\2\2\u00db\u00dc\5\26\f\2\u00dc"+
		"\u00dd\7\32\2\2\u00dd\u00de\5\26\f\2\u00de\u00df\7\24\2\2\u00df\u00eb"+
		"\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00eb\5\26\f\n\u00e2\u00e3\7\36\2\2"+
		"\u00e3\u00eb\5\26\f\t\u00e4\u00eb\5\30\r\2\u00e5\u00eb\5\34\17\2\u00e6"+
		"\u00e7\7\23\2\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9\7\24\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea"+
		"\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00f7\3\2"+
		"\2\2\u00ec\u00ed\f\5\2\2\u00ed\u00ee\t\6\2\2\u00ee\u00f6\5\26\f\6\u00ef"+
		"\u00f0\f\4\2\2\u00f0\u00f1\t\7\2\2\u00f1\u00f6\5\26\f\5\u00f2\u00f3\f"+
		"\3\2\2\u00f3\u00f4\t\4\2\2\u00f4\u00f6\5\26\f\4\u00f5\u00ec\3\2\2\2\u00f5"+
		"\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0106"+
		"\7\27\2\2\u00fb\u0100\5\32\16\2\u00fc\u00fd\7\32\2\2\u00fd\u00ff\5\32"+
		"\16\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\32"+
		"\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u00fb\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\30"+
		"\2\2\u0109\31\3\2\2\2\u010a\u010d\5\30\r\2\u010b\u010d\5\26\f\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\33\3\2\2\2\u010e\u0113\t\2\2"+
		"\2\u010f\u0113\7\20\2\2\u0110\u0113\7-\2\2\u0111\u0113\7\22\2\2\u0112"+
		"\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2"+
		"\2\2\u0113\35\3\2\2\2#\37%*\628ERUZdir{\u0086\u0096\u0099\u00a0\u00a6"+
		"\u00af\u00b5\u00ba\u00c0\u00c5\u00c8\u00cf\u00ea\u00f5\u00f7\u0100\u0104"+
		"\u0106\u010c\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
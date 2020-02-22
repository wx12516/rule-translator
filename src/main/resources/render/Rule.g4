grammar Rule;

options {
	language = Java;
	output = AST;
	encoding  = 'utf-8';
}

@header {
package com.asiainfo.rule.translator.parser.render;
}

//文法
program
 : defineVariableStatement? conditionStatement EOF
 | defineVariableStatement? segmentStatementList EOF
 ;

defineVariableStatement
 : DEF IDENTIFIER (COMMA IDENTIFIER)* SEMI*
 ;

//条件指标语句
conditionStatement
 : IF LPAREN conditionExpr RPAREN LBRACE calculatorStatement RBRACE SEMI*
 | IF LPAREN conditionExpr RPAREN LBRACE segmentStatementList RBRACE SEMI*
 ;

//分段条件指标语句
segmentStatementList
 : segmentStatement+
 ;

segmentStatement
 : IF LPAREN segmentExpr RPAREN (LBRACE calculatorStatement RBRACE)? SEMI*
 ;

//计算公式
calculatorStatement
 : X6 ASSIGN expr SEMI*
   X7 ASSIGN (DECIMAL_LITERAL | HEX_LITERAL | OCT_LITERAL | BINARY_LITERAL | FLOAT_LITERAL | HEX_FLOAT_LITERAL) SEMI*
   X1 ASSIGN X6 MUL X7 SEMI*
   (X1 ASSIGN LIMIT LPAREN expr COMMA X1 COMMA expr RPAREN SEMI*)?
 ;

conditionExpr
 : conditionRowExpr ((AND|OR) conditionRowExpr)*
 ;

conditionRowExpr
 : left = LPAREN* busiExpr = expr operSymbol = (EQUAL|NOTEQUAL|LT|GT|LE|GE) busiDescExpr = expr right = RPAREN*
 | left = LPAREN* (BANG LPAREN) ? busiExpr = expr operSymbol = IN busiDescExpr = expr RPAREN? right = RPAREN*
 ;

segmentExpr
 : segmentSubExpr (AND segmentSubExpr)*
 ;

segmentSubExpr
 : left = expr op = (LE|LT|GE|GT|IN) right = expr
 ;

expr
 : LIMIT LPAREN expr COMMA expr COMMA expr RPAREN                                                         #limitExpr
 | SUB expr                                                                                               #negativeExpr
 | BANG expr                                                                                              #notExpr
 | array                                                                                                  #arrayExpr
 | atom                                                                                                   #atomExpr
 | LPAREN expr RPAREN                                                                                     #parenExpr
 | expr op = (MUL | DIV | MOD) expr                                                                       #mulDivExpr
 | expr op = (ADD | SUB) expr                                                                             #addExpr
 | expr op = (LE | GE | LT | GT | EQUAL | NOTEQUAL) expr                                                  #relationalExpr
// | expr op = IN expr                                                                                      #inExpr
// | expr op=(AND | OR) expr                                                                                #logicExpr
 ;

array
 : LBRACK (elementValue (COMMA elementValue)* COMMA?)? RBRACK
 ;

elementValue
 : array
 | expr
 ;

atom
 : (DECIMAL_LITERAL | HEX_LITERAL | OCT_LITERAL | BINARY_LITERAL | FLOAT_LITERAL | HEX_FLOAT_LITERAL)  #numberAtom
 | BOOL_LITERAL                                                                                        #booleanAtom
 | IDENTIFIER                                                                                          #idAtom
 | STRING_LITERAL                                                                                      #stringAtom
 ;
 
// Keywords
DEF:                'def';
IF:                 'if';
IN:                 'in';
LIMIT:              'limit'; //limit函数
X1:                 'X1';    //计算变量
X6:                 'X6';    //基数变量
X7:                 'X7';    //比率变量

// Literals

DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';

// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';

// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
MOD:                '%';

// Whitespace and comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

// Identifiers

IDENTIFIER:         Letter LetterOrDigit*;

// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;
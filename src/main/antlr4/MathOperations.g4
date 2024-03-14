grammar MathOperations;

prog: expr* EOF;

expr: addSubExpr;

addSubExpr
 : mulDivExpr (op=('+' | '-') mulDivExpr)*
 ;

mulDivExpr
 : factorialExpr (op=('*' | '/') factorialExpr)*
 ;

factorialExpr
 : powerExpr factorialOp?
 ;

factorialOp
 : '!' factorialExpr?
 ;

powerExpr
 : unaryExpr ('**' unaryExpr)*
 ;

unaryExpr
 : ('+' | '-')? atom
 ;

atom
 : number
 | '(' expr ')'            // Parentheses have the highest precedence
 | function                // Function calls (logarithmic, trigonometric, hyperbolic)
 | special_number
 ;

function
 : logarithmic_function '(' expr ')'
 | trigonometric_function '(' expr ')'
 | hyperbolic_function '(' expr ')'
 ;

logarithmic_function
 : 'log'
 | 'ln'
 ;

trigonometric_function
 : 'sin'
 | 'cos'
 | 'tan'
 | 'asin'
 | 'acos'
 | 'atan'
 ;

hyperbolic_function
 : 'sinh'
 | 'cosh'
 | 'tanh'
 ;

number
 : FLOAT
 | INT
 | SCI_NUM
 ;

special_number
 : 'pi'
 | 'e'
 ;

// Lexer rules
FLOAT: DIGIT+ '.' DIGIT* | '.' DIGIT+;
INT: DIGIT+;
SCI_NUM: DIGIT+ ('e' | 'E') ('+' | '-')? DIGIT+;
PI: 'pi';
E: 'e';
LOG: 'log';
LN: 'ln';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';
ASIN: 'asin';
ACOS: 'acos';
ATAN: 'atan';
SINH: 'sinh';
COSH: 'cosh';
TANH: 'tanh';
DIGIT: '0'..'9';
WS: [ \t\r\n]+ -> skip;

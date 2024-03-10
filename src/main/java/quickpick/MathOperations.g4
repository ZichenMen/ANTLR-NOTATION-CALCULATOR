grammar MathOperations;

// Parser rules
prog: expr* EOF;

expr: expr op=('*' | '/') expr # MulDiv
    | expr op=('+' | '-') expr # AddSub
    | expr '**' expr          # Power
    | 'log' '(' expr ')'      # LogarithmBase10
    | 'ln' '(' expr ')'       # NaturalLogarithm
    | trig_function '(' expr ')' # TrigFunctions
    | hyperbolic_function '(' expr ')' # HyperbolicFunctions
    | expr '!'                # Factorial
    | '(' expr ')'            # Parens
    | number                  # NumberLiteral
    ;

trig_function: 'sin' | 'cos' | 'tan' | 'asin' | 'acos' | 'atan';
hyperbolic_function: 'sinh' | 'cosh' | 'tanh';

number: FLOAT
    | INT
    | SCI_NUM
    | special_number;

special_number: 'pi' | 'e';

// Lexer rules
FLOAT: DIGIT+ '.' DIGIT+;
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

// Define what a digit is (you could expand this to include other number bases if needed)
DIGIT: '0'..'9';

// Define a rule for whitespace and tell the lexer to skip it
WS: [ \t\r\n]+ -> skip;

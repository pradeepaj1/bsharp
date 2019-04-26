grammar BSharp;

/*
* Parser Rules.
*
*/

bSharp 								: (declaration)* statements;

declaration     					: DOUBLE VARIABLE SEMICOLON
                                    | DOUBLE VARIABLE EQUAL DOUBLEVALUE SEMICOLON
                                    | BOOL VARIABLE SEMICOLON
                                    | BOOL VARIABLE EQUAL BOOLVALUE SEMICOLON;

writeStatement						: WRITE'(' WORD ')' SEMICOLON
                                    | WRITE'(' VARIABLE ')' SEMICOLON;

statements							: singleStatement
                                    | singleStatement statements;

singleStatement						: assignmentStatement SEMICOLON
                                    | boolAssignment SEMICOLON
                                    | conditionalStatement
                                    | whileStatement
                                    | writeStatement;

assignmentStatement      			: VARIABLE EQUAL DOUBLEVALUE
                                    | VARIABLE EQUAL BOOLVALUE
                                    | DOUBLE VARIABLE EQUAL DOUBLEVALUE
                                    | BOOL VARIABLE EQUAL BOOLVALUE
                                    | DOUBLE VARIABLE EQUAL arithmeticExpression
                                    | BOOL VARIABLE EQUAL booleanExpression
                                    | VARIABLE EQUAL arithmeticExpression;

boolAssignment						: VARIABLE EQUAL BOOLVALUE
                                    | BOOL WHITESPACE VARIABLE EQUAL BOOLVALUE;

conditionalStatement				: ifBlock (elseBlock)?;

ifBlock                             : IF '(' booleanExpression ')' trueBlock=blockOfStatements;

elseBlock                           : ELSE falseBlock=blockOfStatements;

blockOfStatements					: '{' statements '}';

whileStatement						: WHILE '(' booleanExpression ')' blockOfStatements;

booleanExpression                   : relationalExpression | logicalExpression;

logicalExpression                   : arithmeticExpression
                                    | logicalExpression logicalOperator logicalExpression
                                    | VARIABLE
                                    | BOOLVALUE;

relationalExpression				: arithmeticExpression
                                    | relationalExpression relationalOperator relationalExpression
                                    | VARIABLE
                                    | DOUBLEVALUE;


arithmeticExpression				: left=arithmeticExpression op=('*' | '/' ) right=arithmeticExpression
                                    | left=arithmeticExpression op=('+' | '-' ) right=arithmeticExpression
                                    | VARIABLE
                                    | DOUBLEVALUE;

relationalOperator					: '<' | '>' | '<=' | '>=' | '==' | '!=';

logicalOperator					    : '&&' | '||' | '!';



/*
* Lexer Rules.
*
*/
fragment DIGIT      : [0-9];
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment TRUE		: 'True';
fragment FALSE		: 'False';
fragment MINUS      : '-';

WORD		: '"' (LOWERCASE|UPPERCASE|'_'| WHITESPACE)+ '"';
WRITE       : 'write' ;
DOUBLEVALUE	: MINUS? DIGIT+ '.' DIGIT+ ;
BOOLVALUE   : TRUE | FALSE ;
DOUBLE	    : 'double';
BOOL        : 'bool';
SEMICOLON   : ';';
EQUAL       : '=';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
VARIABLE    : (LOWERCASE | UPPERCASE | '_')+ ;

WHITESPACE
    :   [ \t]+
        -> skip
    ;

NEWLINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BLOCKCOMMENT
    :   '/*' .*? '*/'
        -> skip
    ;

LINECOMMENT
    :   '//' ~[\r\n]*
        -> skip
    ;
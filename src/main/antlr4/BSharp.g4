grammar BSharp;

/*
* Parser Rules.
*
*/

bSharp 								: 'start' NEWLINE body NEWLINE 'end';

body								: (declaration NEWLINE)* statements;

declaration     					: DOUBLE WHITESPACE VARIABLE SEMICOLON
                                    | DOUBLE WHITESPACE VARIABLE EQUAL DOUBLEVALUE SEMICOLON
                                    | BOOL WHITESPACE VARIABLE SEMICOLON
                                    | BOOL WHITESPACE VARIABLE EQUAL BOOLVALUE SEMICOLON;

writeStatement						: WRITE WHITESPACE WORD SEMICOLON;

statements							: singleStatement NEWLINE
                                    | singleStatement NEWLINE statements;

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
                                    | VARIABLE EQUAL arithmeticExpression ;

boolAssignment						: VARIABLE EQUAL BOOLVALUE
                                    | BOOL VARIABLE EQUAL BOOLVALUE;

conditionalStatement				: IF '(' booleanExpression ')' blockOfStatements (ELSE blockOfStatements)?;

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


arithmeticExpression				: arithmeticExpression arithmeticOperator arithmeticExpression
                                    |'(' arithmeticExpression ')'
                                    | VARIABLE
                                    | DOUBLEVALUE;

relationalOperator					: '<' | '>' | '<=' | '>=' | '==' | '!=';

logicalOperator					    : '&&' | '||' | '!';

arithmeticOperator					: '+' | '-' | '*' | '/';


/*
* Lexer Rules.
*
*/
fragment DIGIT      : [0-9];
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment TRUE		: 'True';
fragment FALSE		: 'False';
WHITESPACE : ' ';
WORD		: '"' (LOWERCASE|UPPERCASE|'_'| WHITESPACE)+ '"';
WRITE: 'write' ;
DOUBLEVALUE		: DIGIT+ '.' DIGIT+ ;
BOOLVALUE   : TRUE | FALSE ;
DOUBLE	    : 'double';
BOOL        : 'bool';
SEMICOLON   : ';';
EQUAL       : '=';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
VARIABLE : (LOWERCASE | UPPERCASE | '_')+ ;






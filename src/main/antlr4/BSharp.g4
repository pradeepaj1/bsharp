grammar BSharp;

/*
* Parser Rules.
*
*/

bSharp 								: 'start' body 'end';

body								: declaration | statements ;

declaration     					: doubleType variable ';' | doubleType variable '=' value ';'
                                       | boolType variable ';' | boolType variable '=' booleanValue ';';

write								: 'write' WORD ';';

statements							: singleStatement | singleStatement statements;

singleStatement						: assignment ';' | boolAssignment ';' | conditionalStatement | whileStatement | write;

assignment      					: variable '=' value | doubleType variable '=' value| doubleType variable '=' expression | variable '=' expression ;

boolAssignment						: variable '=' booleanValue | boolType variable '=' booleanValue;

conditionalStatement				: 'if' '(' booleanExpression ')' blockOfStatements ('else' blockOfStatements)?;

blockOfStatements					: '{' statements '}';

whileStatement						: 'while' '(' booleanExpression ')' blockOfStatements;

booleanExpression					: expression | booleanExpression relOperator booleanExpression | variable | value | booleanValue;

variable							: (LOWERCASE | UPPERCASE | '_')+ ;

value								: DIGIT+ '.' DIGIT+ ;

booleanValue 						: TRUE | FALSE;

doubleType							: 'double' ;

boolType							: 'bool';

expression							: expression op expression |'(' expression ')' | | variable | value;

relOperator							: '<' | '>' | '<=' | '>=' | '==' | '!=' | '&&' | '||';

op									: '+' | '-' | '*' | '/';


fragment TRUE		: 'True';
fragment FALSE		: 'False';
fragment DIGIT      : [0-9];
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment WORD		: (LOWERCASE | UPPERCASE | ' ')* ;



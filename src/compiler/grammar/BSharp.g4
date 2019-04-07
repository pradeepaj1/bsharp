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

singleStatement						: assignment ';' | boolAssignment ';' | conditionalStatement | while | write;

assignment      					: variable '=' value | doubleType variable '=' value| doubleType variable '=' expression | variable '=' expression ;

boolAssignment						: variable '=' booleanValue | boolType variable '=' booleanValue;

conditionalStatement				: 'if' '(' booleanExpression ')' blockOfStatements ('else' blockOfStatements)?;

blockOfStatements					: '{' statements '}';

while								: 'while' '(' booleanExpression ')' blockOfStatements;

booleanExpression					: expression | booleanExpression relOperator booleanExpression | variable | value | booleanValue;

variable							: (LOWERCASE | UPPERCASE | '_')+ ;

value								: DIGIT+ '.' DIGIT+ ;

booleanValue 						: (TRUE | FALSE);



doubleType							: 'double' ;

boolType							: 'bool';

expression							: expression op expression |'(' expression ')' | | variable | value;

relOperator							: '<' | '>' | '<=' | '>=' | '==' | '!=' | '&&' | '||';

op									: '+' | '-' | '*' | '/';


fragment T			: ('T'|'t') ;
fragment R			: ('R'|'r') ;
fragment U          : ('U'|'u') ;
fragment E          : ('E'|'e') ;
fragment F          : ('F'|'f') ;
fragment A          : ('A'|'a') ;
fragment L          : ('L'|'l') ;
fragment S          : ('S'|'s') ;
fragment TRUE		: T R U E;
fragment FALSE		: F A L S E;
fragment DIGIT      : [0-9];
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment WORD		: (LOWERCASE | UPPERCASE | ' ')* ;



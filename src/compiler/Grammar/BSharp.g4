grammar BSharp;

/*
* Parser Rules.
*
*/

bSharp 								: 'start' body 'end';

body								: declaration | statements ;

declaration     					: dataType variable ';' | dataType variable '=' value ';';

write								: 'write' (WORD) ';';

statements							: singleStatement | singleStatement statements;

singleStatement						: assignment ';' | boolAssignment ';' | conditionalStatement | while | write;

assignment      					: variable '=' value | doubleType variable '=' value| doubleType variable '=' expression | variable '=' expression ;

boolAssignment						: variable '=' booleanValue | boolType variable '=' booleanValue;

conditionalStatement				: 'if' '(' booleanExpression ')' blockOfStatements ('else' blockOfStatements)?;

blockOfStatements					: '{' statements '}';

while								: 'while' '(' booleanExpression ')' blockOfStatements;

booleanExpression					: expression | booleanExpression relOperator booleanExpression | variable | value | booleanValue;

variable							: (LOWERCASE | UPPERCASE | '_')+ ;

fragment WORD						: (LOWERCASE | UPPERCASE | ' ')* ;

value								: [0-9]+ '.' [0-9]+ ;

booleanValue 						: (TRUE | FALSE);

TRUE								: T R U E;

FALSE								: F A L S E;

doubleType							: 'double' ;

boolType							: 'bool';

expression							: expression op expression |'(' expression ')' | | variable | value;

relOperator							: '<' | '>' | '<=' | '>=' | == | != | && | ||;

op									: '+' | '-' | '*' | '/';

fragment T			: ('T'|'t') ;
fragment R			: ('R'|'r') ;
fragment U          : ('U'|'u') ;
fragment E          : ('E'|'e') ;
fragment F          : ('F'|'f') ;
fragment A          : ('A'|'a') ;
fragment L          : ('L'|'l') ;
fragment S          : ('S'|'s') ;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;


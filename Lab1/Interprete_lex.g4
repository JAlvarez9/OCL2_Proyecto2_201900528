lexer grammar Interprete_lex;

//Tokens

//Expresiones Regulares
NUMBER:  [0-9]+;
FLOAT_NUM: [0-9]+('.'[0-9]+)?;

//Caracter

CHAR_2: '\''~["]'\'';

//Cadena
CADENA:  '"'~["]*'"';



//Comentarios

CMT : '//' .+? ('\n'|EOF) -> skip ;

//Simbolos del Programa

EXCLA:  '!';
PARA:   '(';
PARC:   ')';
LLAVEA: '{';
LLAVEC: '}';
CORCHA: '[';
CORCHC: ']';
PYC:    ';';
DPTS:   ':';
COMA:   ',';
DEFAUL: '_';
OR_MATCH: '|';
PNT:    '.';
PUNTERO:    '&';

//Operadores Aritmeticos

MUL:    '*';
SUM:    '+';
DIV:    '/';
REST:   '-';
POW:    'pow';
POWF:   'powf';
MODUL:  '%';

//Operadores Relacionales
DIFERENCIACION: '!=';
IGUALACION: '==';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
MAYOR:  '>';
MENOR:  '<';
IGUAL:  '=';

//Operadores Logicos
AND: '&&';
OR:  '||';

//Palabras reservadas

TRUE: 'true';
FALSE: 'false';
INT:    'i64';
FLOAT:  'f64';
BOOLEAN:    'bool';
CHAR:   'char';
STR:    '&str';
STRING: 'String';
USIZE:  'usize';
PRINT:  'println';
LET:    'let';
MUT:    'mut';
IF:     'if';
ELSE:   'else';
LOOP:   'loop';
WHILE:  'while';
MATCH:  'match';
FOR:    'for';
IN:     'in';
BRE:        'break';
STRUCT:     'struct';
VEC:        'Vec'|'vec';
NEWI:       'new';
WITH_CAP:  'with_capacity';
PUSH:       'push';
INSERT:     'insert';
REMOVE:     'remove';
CONTAINS:   'contains';
LEN:        'len';
TOCHARS:    'chars';
TOSTRING:   'to_string';
TOOWNED:    'to_owned';
CASTEO:     'as';
CONTINIU:   'continue';
ABOSLU:     'abs';
RAIZITA:    'sqrt';
CLONATION:  'clone';
FUNCT:      'fn';
RETURNASO: 'return';
PUBLI:      'pub';
MODULO:     'mod';
CAPACITY:   'capacity';


ID:     ([a-zA-Z_])[a-zA-Z0-9_]*;



WS: [ \\\r\n\t]+ -> skip;
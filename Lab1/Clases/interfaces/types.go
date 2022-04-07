package interfaces

type TipoExpresion int

type Available int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STR
	BOOLEAN
	NULL
	BREAK
	ARRAY
	CHAR
	STRING
	STRUCT
	VECTOR
	CONTINUE
	RETURN
	USIZE
	MODULO
)

const (
	NEUTRAL Available = iota
	PUBLICO
	PRIVADO
)

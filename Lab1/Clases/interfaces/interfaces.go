package interfaces

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
)

type Symbol struct {
	Id       string
	Tipo     TipoExpresion
	Valor    interface{}
	IsMut    bool
	Ambito   string
	Fila     int
	Columna  int
	Visible  Available
	Posicion int
}

type Value struct {
	Valor      string
	IsTemp     bool
	Type       TipoExpresion
	TrueLabel  string
	FalseLabel string

	Simbolin Symbol
}

type Expresion interface {
	Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) Value
}

type Instruction interface {
	Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) Value
}

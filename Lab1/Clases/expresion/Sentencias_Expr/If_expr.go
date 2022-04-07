package sentenciasexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type If_expr struct {
	Expresion   p_Interfaces.Expresion
	Bloque_if   p_Interfaces.Expresion
	Bloque_else p_Interfaces.Expresion
	Line        int
	Columna     int
}

func NewIf_expr(condition p_Interfaces.Expresion, bloque_if p_Interfaces.Expresion, bloque_else p_Interfaces.Expresion, linea int, colu int) If_expr {
	ifinstr := If_expr{
		Expresion:   condition,
		Bloque_if:   bloque_if,
		Bloque_else: bloque_else,
		Line:        linea,
		Columna:     colu,
	}
	return ifinstr
}

func (p If_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

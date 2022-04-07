package matchexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type Default_Expr struct {
	Expresion p_Interfaces.Expresion
	Linea     int
	Columna   int
}

func NewDefault_Expr(exp p_Interfaces.Expresion, line int, colu int) Default_Expr {
	defaulteo := Default_Expr{
		Expresion: exp,
		Linea:     line,
		Columna:   colu,
	}
	return defaulteo
}

func (p Default_Expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

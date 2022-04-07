package matchexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Match_expr struct {
	Expresion    p_Interfaces.Expresion
	Bloque_Cases *arrayList.List
	Default      p_Interfaces.Expresion
	Linea        int
	Columna      int
}

func NewMatch_Expr(expre p_Interfaces.Expresion, bloque *arrayList.List, defal p_Interfaces.Expresion, line int, colu int) Match_expr {
	matchi := Match_expr{
		Expresion:    expre,
		Bloque_Cases: bloque,
		Default:      defal,
		Linea:        line,
		Columna:      colu,
	}
	return matchi
}

func (p Match_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

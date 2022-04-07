package sentenciasexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Loop_expr struct {
	Bloque_Loop *arrayList.List
	Linea       int
	Columna     int
}

func NewLoop_expr(bloque *arrayList.List, line int, colu int) Loop_expr {
	lopsito := Loop_expr{
		Bloque_Loop: bloque,
		Linea:       line,
		Columna:     colu,
	}

	return lopsito
}

func (p Loop_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

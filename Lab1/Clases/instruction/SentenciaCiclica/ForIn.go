package sentenciaciclica

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type ForIn struct {
	Id_Variable  string
	Expr_Inicial p_Interface.Expresion
	Expr_Final   p_Interface.Expresion
	Expr_Vector  p_Interface.Expresion
	Bloque_ForIn *arrayList.List
	Linea        int
	Columna      int
}

func NewForIn(id string, ini p_Interface.Expresion, fin p_Interface.Expresion, vec p_Interface.Expresion, bloq *arrayList.List, line int, colu int) ForIn {
	forini := ForIn{
		Id_Variable:  id,
		Expr_Inicial: ini,
		Expr_Final:   fin,
		Expr_Vector:  vec,
		Bloque_ForIn: bloq,
		Linea:        line,
		Columna:      colu,
	}
	return forini
}

func (p ForIn) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

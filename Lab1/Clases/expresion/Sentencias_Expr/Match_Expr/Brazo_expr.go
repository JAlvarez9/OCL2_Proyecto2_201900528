package matchexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Brazo_expr struct {
	Lista_Expresiones *arrayList.List
	Expresion         p_Interfaces.Expresion
	Linea             int
	Columna           int
}

func NewBrazo_expr(lis *arrayList.List, exp p_Interfaces.Expresion, line int, colu int) Brazo_expr {
	brazito := Brazo_expr{
		Lista_Expresiones: lis,
		Expresion:         exp,
		Linea:             line,
		Columna:           colu,
	}
	return brazito
}

func (p Brazo_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

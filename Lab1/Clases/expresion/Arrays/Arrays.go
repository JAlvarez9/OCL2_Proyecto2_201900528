package arrays

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Array struct {
	ListExp           *arrayList.List
	Expresion_repetir p_Interface.Expresion
	Expresion_veces   p_Interface.Expresion
	Line              int
	Columna           int
}

func NewArray(list *arrayList.List, exp_re p_Interface.Expresion, exp_vec p_Interface.Expresion, line int, colu int) Array {
	arraysito := Array{
		ListExp:           list,
		Expresion_repetir: exp_re,
		Expresion_veces:   exp_vec,
		Line:              line,
		Columna:           colu,
	}
	return arraysito
}

func (p Array) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

package vector

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Vector struct {
	ListExp           *arrayList.List
	Expresion_repetir p_Interface.Expresion
	Expresion_veces   p_Interface.Expresion
	is_New            bool
	is_Capacity       p_Interface.Expresion
	Line              int
	Columna           int
}

func NewVector(list *arrayList.List, exp_re p_Interface.Expresion, exp_vec p_Interface.Expresion, isnew bool, iscapa p_Interface.Expresion, line int, colu int) Vector {
	vectorsito := Vector{
		ListExp:           list,
		Expresion_repetir: exp_re,
		Expresion_veces:   exp_vec,
		is_New:            isnew,
		is_Capacity:       iscapa,
		Line:              line,
		Columna:           colu,
	}
	return vectorsito
}

func (p Vector) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

package vector

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type VectorAccess struct {
	Array   p_Interface.Expresion
	Index   p_Interface.Expresion
	Linea   int
	Columna int
}

func NewVectorAccess(arr p_Interface.Expresion, ind p_Interface.Expresion, line int, colu int) VectorAccess {
	arraysito := VectorAccess{
		Array:   arr,
		Index:   ind,
		Linea:   line,
		Columna: colu,
	}
	return arraysito
}

func (p VectorAccess) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

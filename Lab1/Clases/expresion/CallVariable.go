package expresion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type CallVariable struct {
	Id      string
	Line    int
	Columna int
}

func NewCallVariable(id string, line int, column int) CallVariable {
	exp := CallVariable{Id: id, Line: line, Columna: column}
	return exp
}

func (p CallVariable) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

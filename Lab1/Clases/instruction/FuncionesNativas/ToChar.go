package funcionesnativas

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type ToChar struct {
	Valor   p_Interfaces.Expresion
	Line    int
	Columna int
}

func NewToChar(valo p_Interfaces.Expresion, fila int, colu int) ToChar {
	tochari := ToChar{
		Valor:   valo,
		Line:    fila,
		Columna: colu,
	}
	return tochari
}

func (p ToChar) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

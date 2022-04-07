package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Remove_instr struct {
	Id      string
	Valor   p_Interface.Expresion
	Linea   int
	Columna int
}

func NewRemove_instr(id string, vect p_Interface.Expresion, line int, colu int) Remove_instr {
	pushito := Remove_instr{
		Id:      id,
		Valor:   vect,
		Linea:   line,
		Columna: colu,
	}
	return pushito
}

func (p Remove_instr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

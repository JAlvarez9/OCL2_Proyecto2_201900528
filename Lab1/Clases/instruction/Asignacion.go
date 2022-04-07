package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Asignacion struct {
	Id          string
	Expresion   p_Interface.Expresion
	Id_Atributo string
	Line        int
	Columna     int
}

func NewAsignacion(id string, expresion p_Interface.Expresion, id_atr string, line int, colu int) Asignacion {
	instr := Asignacion{
		Id:          id,
		Expresion:   expresion,
		Id_Atributo: id_atr,
		Line:        line,
		Columna:     colu,
	}
	return instr
}

func (p Asignacion) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

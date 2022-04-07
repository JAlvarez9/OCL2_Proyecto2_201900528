package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Insert struct {
	Id       string
	Pos_Vec  p_Interface.Expresion
	Expr_Add p_Interface.Expresion
	Linea    int
	Columna  int
}

func NewInsert(id string, vect p_Interface.Expresion, agregar p_Interface.Expresion, line int, colu int) Insert {
	pushito := Insert{
		Id:       id,
		Pos_Vec:  vect,
		Expr_Add: agregar,
		Linea:    line,
		Columna:  colu,
	}
	return pushito
}

func (p Insert) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

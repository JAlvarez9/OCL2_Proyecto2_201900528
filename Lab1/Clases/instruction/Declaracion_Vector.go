package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"

	p_Interface "LAB1/Clases/interfaces"
)

type Declaration_Vector struct {
	Id         string
	Tipo       p_Interface.TipoExpresion
	Tipo_Datos p_Interface.TipoExpresion
	Expresion  p_Interface.Expresion
	Id_Struct  string
	IsMut      bool
	Line       int
	Columna    int
}

func NewDeclaration_Vector(id string, tipo_datos p_Interface.TipoExpresion, val p_Interface.Expresion, id_str string, isMut bool, line int, colu int) Declaration_Vector {
	instr := Declaration_Vector{
		Id:         id,
		Tipo:       p_Interface.VECTOR,
		Tipo_Datos: tipo_datos,
		Expresion:  val,
		Id_Struct:  id_str,
		IsMut:      isMut,
		Line:       line,
		Columna:    colu,
	}
	return instr
}

func (p Declaration_Vector) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

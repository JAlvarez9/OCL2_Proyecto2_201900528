package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Structs "LAB1/Clases/Structs_inter"

	//p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
)

type Declaration_Array struct {
	Id         string
	Tipo       p_Interface.TipoExpresion
	Tipo_Datos *p_Structs.Array_type
	Expresion  p_Interface.Expresion
	IsMut      bool
	Line       int
	Columna    int
}

func NewDeclaration_Array(id string, tipo_datos *p_Structs.Array_type, val p_Interface.Expresion, isMut bool, line int, colu int) Declaration_Array {
	instr := Declaration_Array{
		Id:         id,
		Tipo:       p_Interface.ARRAY,
		Tipo_Datos: tipo_datos,
		Expresion:  val,
		IsMut:      isMut,
		Line:       line,
		Columna:    colu,
	}
	return instr
}

func (p Declaration_Array) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

/*
func recursividad_Array(structusito *p_Structs.Array_type, controlador *p_Controlador.Controlador2, env interface{}, env_uni interface{}) []interface{} {
	if structusito.Array_Son == nil {
		var size = structusito.Size.Ejecutar(controlador, env, env_uni).Valor
		var sup = make([]interface{}, size.(int))
		return sup
	} else {
		var result = recursividad_Array(structusito.Array_Son, controlador, env, env_uni)
		var size = structusito.Size.Ejecutar(controlador, env, env_uni).Valor
		var sup = make([]interface{}, size.(int))
		for i := 0; i < len(sup); i++ {
			sup[i] = result
		}
		return sup
	}
}
*/

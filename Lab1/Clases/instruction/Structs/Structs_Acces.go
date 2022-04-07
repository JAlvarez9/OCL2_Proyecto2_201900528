package structs

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Struct_Acces struct {
	Id_Struct   p_Interface.Expresion
	Id_Atributo string
	Linea       int
	Columna     int
}

func NewStruct_Acces(idS p_Interface.Expresion, idA string, line int, colu int) Struct_Acces {
	structsito := Struct_Acces{
		Id_Struct:   idS,
		Id_Atributo: idA,
		Linea:       line,
		Columna:     colu,
	}
	return structsito
}

func (p Struct_Acces) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

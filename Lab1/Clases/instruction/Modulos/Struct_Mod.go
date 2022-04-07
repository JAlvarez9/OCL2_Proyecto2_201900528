package modulos

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Struct_Mod struct {
	Structt   p_Interface.Instruction
	Available p_Interface.Available
	Linea     int
	Columna   int
}

func NewStruct_Mod(funci p_Interface.Instruction, pub p_Interface.Available, line int, colu int) Struct_Mod {
	funcioncita := Struct_Mod{
		Structt:   funci,
		Available: pub,
		Linea:     line,
		Columna:   colu,
	}
	return funcioncita
}

func (p Struct_Mod) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

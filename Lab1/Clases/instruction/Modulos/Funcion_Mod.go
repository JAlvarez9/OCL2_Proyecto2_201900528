package modulos

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Funcion_Mod struct {
	Funcion   p_Interface.Instruction
	Available p_Interface.Available
	Linea     int
	Columna   int
}

func NewFuncion_Mod(funci p_Interface.Instruction, pub p_Interface.Available, line int, colu int) Funcion_Mod {
	funcioncita := Funcion_Mod{
		Funcion:   funci,
		Available: pub,
		Linea:     line,
		Columna:   colu,
	}
	return funcioncita
}

func (p Funcion_Mod) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

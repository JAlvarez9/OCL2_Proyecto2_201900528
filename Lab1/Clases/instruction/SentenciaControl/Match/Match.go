package match

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Match struct {
	Expresion    p_Interfaces.Expresion
	Bloque_Cases *arrayList.List
	Default      p_Interfaces.Instruction
	Linea        int
	Columna      int
}

func NewMatch(exp p_Interfaces.Expresion, bloque_cases *arrayList.List, defaul p_Interfaces.Instruction, line int, colu int) Match {
	match := Match{
		Expresion:    exp,
		Bloque_Cases: bloque_cases,
		Default:      defaul,
		Linea:        line,
		Columna:      colu,
	}
	return match
}

func (p Match) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

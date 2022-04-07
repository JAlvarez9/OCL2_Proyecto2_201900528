package sentenciacontrol

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type If struct {
	Expresion   p_Interfaces.Expresion
	Bloque_if   *arrayList.List
	Bloque_else *arrayList.List
	Line        int
	Columna     int
}

func NewIf(condition p_Interfaces.Expresion, bloque_if *arrayList.List, bloque_else *arrayList.List, linea int, colu int) If {
	ifinstr := If{
		Expresion:   condition,
		Bloque_if:   bloque_if,
		Bloque_else: bloque_else,
		Line:        linea,
		Columna:     colu,
	}
	return ifinstr
}

func (p If) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

package sentenciaciclica

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Loop struct {
	Bloque_loop *arrayList.List
	Line        int
	Columna     int
}

func NewLoop(bloque *arrayList.List, line int, columna int) Loop {
	loop := Loop{
		Bloque_loop: bloque,
		Line:        line,
		Columna:     columna,
	}

	return loop
}

func (p Loop) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}
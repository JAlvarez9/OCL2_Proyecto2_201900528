package match

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Default struct {
	Bloque_Default *arrayList.List
	Linea          int
	Columna        int
}

func NewDefault(bloque *arrayList.List, line int, columna int) Default {
	defaulteo := Default{
		Bloque_Default: bloque,
		Linea:          line,
		Columna:        columna,
	}

	return defaulteo
}

func (p Default) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

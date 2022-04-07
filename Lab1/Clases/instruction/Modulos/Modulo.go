package modulos

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"

	arraylist "github.com/colegno/arraylist"
)

type Modulos struct {
	ID         string
	Available  p_Interface.Available
	Bloque_Mod *arraylist.List
	Linea      int
	Columna    int
}

func NewModulos(id string, publico p_Interface.Available, bloque_mod *arraylist.List, line int, columna int) Modulos {
	modulin := Modulos{
		ID:         id,
		Available:  publico,
		Bloque_Mod: bloque_mod,
		Linea:      line,
		Columna:    columna,
	}
	return modulin
}

func (p Modulos) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

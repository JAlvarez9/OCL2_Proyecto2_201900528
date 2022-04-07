package sentenciaciclica

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type While struct {
	Expresion    p_Interfaces.Expresion
	Bloque_While *arrayList.List
	Linea        int
	Columna      int
}

func NewWhile(expre p_Interfaces.Expresion, bloque *arrayList.List, line int, colu int) While {
	while := While{
		Expresion:    expre,
		Bloque_While: bloque,
		Linea:        line,
		Columna:      colu,
	}
	return while
}

func (p While) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Contains struct {
	Expresion p_Interface.Expresion
	Valor     p_Interface.Expresion
	Linea     int
	Columna   int
}

func NewContains(expre p_Interface.Expresion, vect p_Interface.Expresion, line int, colu int) Contains {
	pushito := Contains{
		Expresion: expre,
		Valor:     vect,
		Linea:     line,
		Columna:   colu,
	}
	return pushito
}

func (p Contains) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

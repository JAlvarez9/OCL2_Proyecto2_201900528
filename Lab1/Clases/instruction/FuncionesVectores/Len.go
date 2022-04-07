package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Len struct {
	Expresion p_Interface.Expresion
	Linea     int
	Columna   int
}

func NewLen(expre p_Interface.Expresion, line int, colu int) Len {
	pushito := Len{
		Expresion: expre,
		Linea:     line,
		Columna:   colu,
	}
	return pushito
}

func (p Len) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

package funcionesnativas

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type RaizCuadrada struct {
	Expresion p_Interfaces.Expresion
	Linea     int
	Columna   int
}

func NewRaizCuadrada(exp p_Interfaces.Expresion, line int, colu int) RaizCuadrada {
	absolotin := RaizCuadrada{
		Expresion: exp,
		Linea:     line,
		Columna:   colu,
	}
	return absolotin
}

func (p RaizCuadrada) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

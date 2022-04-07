package sentenciatransferencia

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type Returnaso struct {
	Expresion p_Interfaces.Expresion
	Line      int
	Columna   int
}

func NewReturnaso(exo p_Interfaces.Expresion, line int, colu int) Returnaso {
	breakisto := Returnaso{
		Expresion: exo,
		Line:      line,
		Columna:   colu,
	}
	return breakisto
}

func (p Returnaso) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

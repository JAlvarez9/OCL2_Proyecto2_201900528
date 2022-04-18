package sentenciatransferencia

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
	"fmt"
)

type Break struct {
	Expresion p_Interfaces.Expresion
	Line      int
	Columna   int
}

func NewBreak(exo p_Interfaces.Expresion, line int, colu int) Break {
	breakisto := Break{
		Expresion: exo,
		Line:      line,
		Columna:   colu,
	}
	return breakisto
}

func (p Break) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	generador.AddComent("INICIO BREAK")
	if p.Expresion == nil {
		if generador.GetLastBreak() == "" {
			fmt.Println("El Break no esta dentro de un ciclico")
		}

		generador.AddGoTo(generador.GetLastBreak())

	}
	generador.AddComent("FINAL BREAK")
	return result
}

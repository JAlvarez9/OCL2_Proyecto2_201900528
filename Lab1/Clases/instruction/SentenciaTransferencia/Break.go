package sentenciatransferencia

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
	"fmt"
	"strconv"
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

	} else {
		a := p.Expresion.Ejecutar(controlador, generador, env, env_uni)
		if generador.GetLastBreak() == "" {
			fmt.Println("El Break no esta dentro de un ciclico")
		}

		if a.IsP {
			if a.Type == p_Interfaces.INTEGER || a.Type == p_Interfaces.FLOAT {
				generador.AddExpression(generador.Valor_Return_Expre, a.Valor, "", "")
			} else if a.Type == p_Interfaces.STR || a.Type == p_Interfaces.STRING {
				generador.AddComent("INICIO STRING")
				runas := []rune(a.Valor)
				var ascii []int

				for i := 0; i < len(runas); i++ {
					ascii = append(ascii, int(runas[i]))
				}

				generador.AddExpression(generador.Valor_Return_Expre, "H", "", "")
				for i := 0; i < len(ascii); i++ {
					generador.AddHeap("H", strconv.Itoa(ascii[i]))
					generador.AddExpression("H", "H", "1", "+")
				}
				generador.AddHeap("H", "-1")
				generador.AddExpression("H", "H", "1", "+")
				generador.AddComent("FINAL STRING")
			} else if a.Type == p_Interfaces.BOOLEAN {
				if a.Valor == "true" {
					a.Valor = "1"
				} else if a.Valor == "false" {
					a.Valor = "0"
				}
			}
		} else if a.IsCV {
			generador.AddExpression(generador.Valor_Return_Expre, a.Valor, "", "")
		}

		generador.AddGoTo(generador.GetLastBreak())

	}
	generador.AddComent("FINAL BREAK")
	return result
}

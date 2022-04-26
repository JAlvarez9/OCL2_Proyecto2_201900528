package matchexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
	"strconv"
)

type Default_Expr struct {
	Expresion p_Interfaces.Expresion
	Linea     int
	Columna   int
}

func NewDefault_Expr(exp p_Interfaces.Expresion, line int, colu int) Default_Expr {
	defaulteo := Default_Expr{
		Expresion: exp,
		Linea:     line,
		Columna:   colu,
	}
	return defaulteo
}

func (p Default_Expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value

	a := p.Expresion.Ejecutar(controlador, generador, env, env_uni)
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

	return result
}

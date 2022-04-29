package sentenciasexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
	"strconv"

	arrayList "github.com/colegno/arraylist"
)

type If_expr struct {
	Expresion   p_Interfaces.Expresion
	Bloque_if   *arrayList.List
	Bloque_else *arrayList.List
	Line        int
	Columna     int
}

func NewIf_expr(condition p_Interfaces.Expresion, bloque_if *arrayList.List, bloque_else *arrayList.List, linea int, colu int) If_expr {
	ifinstr := If_expr{
		Expresion:   condition,
		Bloque_if:   bloque_if,
		Bloque_else: bloque_else,
		Line:        linea,
		Columna:     colu,
	}
	return ifinstr
}

func (p If_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	var regreso p_Interfaces.Value
	var resultTemp string
	generador.AddComent("INICIO IF-EXPRESION")
	if generador.Valor_Return_Expre == "" {
		resultTemp = generador.NewTemp()
		generador.Valor_Return_Expre = resultTemp
	} else {
		resultTemp = generador.Valor_Return_Expre
	}

	regreso.Valor = resultTemp
	finalLabel := generador.NewLabel()
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	if result.Valor == "true" {
		generador.AddGoTo(result.TrueLabel)
	} else if result.Valor == "false" {
		generador.AddGoTo(result.FalseLabel)
	}

	if result.IsCV == true && result.Type == p_Interfaces.BOOLEAN {

		generador.AddIf(result.Valor, "1", "==", result.TrueLabel)
		generador.AddGoTo(result.FalseLabel)

	}
	if result.IsP {

	}

	generador.AddLabel(result.TrueLabel)
	for i, s := range p.Bloque_if.ToArray() {
		//s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, env, env_uni)
		if i != p.Bloque_if.Len()-1 {
			s.(p_Interfaces.Instruction).Ejecutar(controlador, generador, env, env_uni)
		} else {
			a := s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, env, env_uni)
			if a.Type == p_Interfaces.STR || a.Type == p_Interfaces.STRING {
				tempo := generador.NewTemp()
				generador.AddComent("INICIO STRING")
				runas := []rune(a.Valor)
				var ascii []int

				for i := 0; i < len(runas); i++ {
					ascii = append(ascii, int(runas[i]))
				}

				generador.AddExpression(tempo, "H", "", "")
				for i := 0; i < len(ascii); i++ {
					generador.AddHeap("H", strconv.Itoa(ascii[i]))
					generador.AddExpression("H", "H", "1", "+")
				}
				generador.AddHeap("H", "-1")
				generador.AddExpression("H", "H", "1", "+")
				generador.AddComent("FINAL STRING")
				generador.AddExpression(resultTemp, tempo, "", "")
			} else {
				generador.AddExpression(resultTemp, a.Valor, "", "")
			}

		}

	}
	generador.AddGoTo(finalLabel)
	generador.AddLabel(result.FalseLabel)
	for i, s := range p.Bloque_else.ToArray() {
		//s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, env, env_uni)
		if i != p.Bloque_if.Len()-1 {
			s.(p_Interfaces.Instruction).Ejecutar(controlador, generador, env, env_uni)
		} else {
			a := s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, env, env_uni)
			if a.Type == p_Interfaces.STR || a.Type == p_Interfaces.STRING {
				tempo := generador.NewTemp()
				generador.AddComent("INICIO STRING")
				runas := []rune(a.Valor)
				var ascii []int

				for i := 0; i < len(runas); i++ {
					ascii = append(ascii, int(runas[i]))
				}

				generador.AddExpression(tempo, "H", "", "")
				for i := 0; i < len(ascii); i++ {
					generador.AddHeap("H", strconv.Itoa(ascii[i]))
					generador.AddExpression("H", "H", "1", "+")
				}
				generador.AddHeap("H", "-1")
				generador.AddExpression("H", "H", "1", "+")
				generador.AddComent("FINAL STRING")
				generador.AddExpression(resultTemp, tempo, "", "")
			} else {
				generador.AddExpression(resultTemp, a.Valor, "", "")
			}
		}

	}
	generador.AddLabel(finalLabel)
	generador.AddComent("FINAL IF-EXPRESION")

	return regreso
}

package arrays

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"

	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"

	arrayList "github.com/colegno/arraylist"
)

type Array struct {
	ListExp           *arrayList.List
	Expresion_repetir p_Interface.Expresion
	Expresion_veces   p_Interface.Expresion
	Line              int
	Columna           int
}

func NewArray(list *arrayList.List, exp_re p_Interface.Expresion, exp_vec p_Interface.Expresion, line int, colu int) Array {
	arraysito := Array{
		ListExp:           list,
		Expresion_repetir: exp_re,
		Expresion_veces:   exp_vec,
		Line:              line,
		Columna:           colu,
	}
	return arraysito
}

func (p Array) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO ARRAY")
	var tmpExp *arrayList.List
	tmpExp = arrayList.New()
	var temporalin string
	if p.ListExp.Len() != 0 {
		for _, s := range p.ListExp.ToArray() {
			tmpExp.Add(s.(p_Interface.Expresion).Ejecutar(controlador, generador, env, env_uni))
		}

		temporalin2 := generador.NewTemp()
		generador.AddExpression(temporalin2, "H", "", "")
		generador.AddHeap("H", strconv.Itoa(tmpExp.Len()))
		generador.AddExpression("H", "H", "1", "+")
		for _, s := range tmpExp.ToArray() {
			sup := s.(p_Interface.Value)

			if sup.IsP {
				if sup.Type == p_Interface.INTEGER || sup.Type == p_Interface.FLOAT || sup.Type == p_Interface.USIZE {

					generador.AddHeap("H", sup.Valor)
					generador.AddExpression("H", "H", "1", "+")

				} else if sup.Type == p_Interface.STR || sup.Type == p_Interface.STRING {

					runas := []rune(sup.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}
					temporalin = generador.NewTemp()
					generador.AddExpression(temporalin, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")

				} else if sup.Type == p_Interface.BOOLEAN {
					// TENGO QUE HACER QUE GUARDE UN BOOLEAN
					if sup.Valor == "true" {

						generador.AddHeap("H", "1")
						generador.AddExpression("H", "H", "1", "+")
					} else if sup.Valor == "false" {

						generador.AddHeap("H", "0")
						generador.AddExpression("H", "H", "1", "+")
					}

				} else if sup.Type == p_Interface.CHAR {

					runas := []rune(sup.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddHeap("H", strconv.Itoa(ascii[0]))
					generador.AddExpression("H", "H", "1", "+")

				}
			}
			if sup.IsCV {
				generador.AddHeap("H", sup.Valor)
				generador.AddExpression("H", "H", "1", "+")
			}
			if !sup.IsCV && !sup.IsP {

				generador.AddHeap("H", sup.Valor)
				generador.AddExpression("H", "H", "1", "+")
			}
			result.Valor = temporalin2
			result.Type = p_Interface.ARRAY

		}
		//result.Type =
		generador.AddComent("FIN ARRAY")
		return result

	} else {
		s := p.Expresion_repetir.Ejecutar(controlador, generador, env, env_uni)
		valor := p.Expresion_veces.Ejecutar(controlador, generador, env, env_uni)
		fmt.Println(valor)
		for i := 0; i < 5; i++ {
			fmt.Println(s)
			tmpExp.Add(s)
		}

		temporalin2 := generador.NewTemp()
		generador.AddExpression(temporalin2, "H", "", "")
		generador.AddHeap("H", strconv.Itoa(tmpExp.Len()))
		generador.AddExpression("H", "H", "1", "+")
		for _, s := range tmpExp.ToArray() {
			sup := s.(p_Interface.Value)
			temporalin := generador.NewTemp()
			if sup.IsP {
				if sup.Type == p_Interface.INTEGER || sup.Type == p_Interface.FLOAT || sup.Type == p_Interface.USIZE {
					generador.AddComent("INICIO DECLARACION INT STRUCT")

					generador.AddExpression(temporalin, "H", "", "")
					generador.AddHeap(temporalin, sup.Valor)
					generador.AddExpression(temporalin, "H", "1", "+")
					generador.AddComent("FIN DECLARACION INT STRUCT")
				} else if sup.Type == p_Interface.STR || sup.Type == p_Interface.STRING {
					generador.AddComent("INICIO DECLARACION STRING STRUCT")
					if !sup.IsP {
						temporalin2 := generador.NewTemp()
						generador.AddExpression(temporalin2, "H", "", "")
						generador.AddHeap(temporalin2, result.Valor)
						generador.AddExpression(temporalin, "H", "1", "+")
					} else {

						runas := []rune(sup.Valor)
						var ascii []int

						for i := 0; i < len(runas); i++ {
							ascii = append(ascii, int(runas[i]))
						}
						temporalin := generador.NewTemp()
						generador.AddExpression(temporalin, "H", "", "")
						for i := 0; i < len(ascii); i++ {
							generador.AddHeap("H", strconv.Itoa(ascii[i]))
							generador.AddExpression("H", "H", "1", "+")
						}
						generador.AddHeap("H", "-1")
						generador.AddExpression("H", "H", "1", "+")
						temporalin2 := generador.NewTemp()
						generador.AddExpression(temporalin2, "H", "", "")
						generador.AddHeap(temporalin2, temporalin)
						generador.AddExpression(temporalin, "H", "1", "+")
					}
					generador.AddComent("FIN DECLARACION INT STRUCT")
				} else if sup.Type == p_Interface.BOOLEAN {
					// TENGO QUE HACER QUE GUARDE UN BOOLEAN
					generador.AddComent("INICIO DECLARACION BOOL STRUCT")
					if sup.IsP {
						if sup.Valor == "true" {

							temporalin := generador.NewTemp()
							generador.AddExpression(temporalin, "H", "", "")
							generador.AddHeap(temporalin, "1")
							generador.AddExpression(temporalin, "H", "1", "+")
						} else if sup.Valor == "false" {

							temporalin := generador.NewTemp()
							generador.AddExpression(temporalin, "H", "", "")
							generador.AddHeap(temporalin, "0")
							generador.AddExpression(temporalin, "H", "1", "+")
						}
					} else {

						temporalin := generador.NewTemp()
						generador.AddExpression(temporalin, "H", "", "")
						generador.AddHeap(temporalin, sup.Valor)
						generador.AddExpression(temporalin, "H", "1", "+")
					}
					generador.AddComent("FIN DECLARACION BOOL STRUCT")
				} else if sup.Type == p_Interface.CHAR {
					generador.AddComent("INICIO DECLARACION CHAR STRUCT")
					if !sup.IsP {
						temporalin2 := generador.NewTemp()
						generador.AddExpression(temporalin2, "H", "", "")
						generador.AddHeap(temporalin2, sup.Valor)
						generador.AddExpression(temporalin, "H", "1", "+")
					} else {

						runas := []rune(sup.Valor)
						var ascii []int

						for i := 0; i < len(runas); i++ {
							ascii = append(ascii, int(runas[i]))
						}

						temporalin := generador.NewTemp()
						generador.AddExpression(temporalin, "H", "", "")
						generador.AddHeap(temporalin, strconv.Itoa(ascii[0]))
						generador.AddExpression(temporalin, "H", "1", "+")
					}
					generador.AddComent("FIN DECLARACION CHAR STRUCT")
				}
			}
			if sup.IsCV {

				temporalin := generador.NewTemp()
				generador.AddExpression(temporalin, "H", "", "")
				generador.AddHeap(temporalin, sup.Valor)
			}
			result.Valor = temporalin

		}
		generador.AddComent("FIN ARRAY")
		return result
	}

	return result
}

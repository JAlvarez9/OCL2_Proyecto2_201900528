package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"
	"strings"

	arrayList "github.com/colegno/arraylist"
)

type Imprimir struct {
	Expresion p_Interface.Expresion
	List_Exp  *arrayList.List
	Linea     int
	Columna   int
}

func NewImprimir(val p_Interface.Expresion, lista *arrayList.List, line int, colu int) Imprimir {
	exp := Imprimir{
		Expresion: val,
		List_Exp:  lista,
		Linea:     line,
		Columna:   colu,
	}
	return exp
}
func (p Imprimir) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("Inicio Print")
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)

	if p.List_Exp.Len() == 0 {
		if result.IsCV {

			switch result.Simbolin.Tipo {
			case p_Interface.INTEGER:

				b := "(int)" + result.Valor
				generador.AddPrint("d", b)
			case p_Interface.FLOAT:

				b := "(float)" + result.Valor
				generador.AddPrint("f", b)
			case p_Interface.STR:
				finalLabel := generador.NewLabel()
				nullLabel := generador.NewLabel()
				generador.AddIf(result.Valor, "-1", "==", nullLabel)
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				tempStack := generador.NewTemp()
				generador.AddExpression(tempStack, "P", "1", "+")
				generador.AddStack(tempStack, result.Valor)
				generador.Bring_Func("print_string")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddGoTo(finalLabel)
				generador.AddLabel(nullLabel)
				generador.Bring_Func("Native_Print_Null")
				generador.AddLabel(finalLabel)
			case p_Interface.STRING:
				finalLabel := generador.NewLabel()
				nullLabel := generador.NewLabel()
				generador.AddIf(result.Valor, "-1", "==", nullLabel)
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				tempStack := generador.NewTemp()
				generador.AddExpression(tempStack, "P", "1", "+")
				generador.AddStack(tempStack, result.Valor)
				generador.Bring_Func("print_string")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddGoTo(finalLabel)
				generador.AddLabel(nullLabel)
				generador.Bring_Func("Native_Print_Null")
				generador.AddLabel(finalLabel)
			case p_Interface.CHAR:
				b := "(int)" + result.Valor
				generador.AddPrint("c", b)
			case p_Interface.BOOLEAN:
				labelsito1 := generador.NewLabel()
				labelsito2 := generador.NewLabel()
				labelsito3 := generador.NewLabel()
				generador.AddIf(result.Valor, "1", "==", labelsito1)
				generador.AddGoTo(labelsito2)
				generador.AddLabel(labelsito1)
				generador.Bring_Func("Native_Print_True")
				generador.AddGoTo(labelsito3)
				generador.AddLabel(labelsito2)
				generador.Bring_Func("Native_Print_False")
				generador.AddLabel(labelsito3)
			}

			generador.AddPrint("c", "(int)10")
			generador.AddComent("Final Print")
			return result
		}

		switch result.Type {
		case p_Interface.INTEGER:
			generador.AddPrint("d", "(int)"+fmt.Sprintf("%v", result.Valor))
		case p_Interface.FLOAT:
			generador.AddPrint("f", "(float)"+fmt.Sprintf("%v", result.Valor))
		case p_Interface.BOOLEAN:

			if result.Valor == "true" {
				generador.AddGoTo(result.TrueLabel)
			} else {
				generador.AddGoTo(result.FalseLabel)
			}
			newLabel := generador.NewLabel()
			generador.AddLabel(result.TrueLabel)
			generador.Bring_Func("Native_Print_True")
			generador.AddGoTo(newLabel)
			generador.AddLabel(result.FalseLabel)
			generador.Bring_Func("Native_Print_False")
			generador.AddGoTo(newLabel)
			generador.AddLabel(newLabel)
		case p_Interface.STR:
			finalLabel := generador.NewLabel()
			tempHeap := generador.NewTemp()
			if result.IsArit {
				tempHeap = result.Valor
			} else {
				runs := []rune(result.Valor)

				var val_Ascci []int

				for i := 0; i < len(runs); i++ {
					val_Ascci = append(val_Ascci, int(runs[i]))
				}

				generador.AddExpression(tempHeap, "H", "", "")
				for _, s := range val_Ascci {
					generador.AddHeap("H", fmt.Sprintf("%v", s))
					generador.AddExpression("H", "H", "1", "+")
				}
			}

			generador.AddHeap("H", "-1")
			generador.AddExpression("H", "H", "1", "+")
			nullLabel := generador.NewLabel()
			generador.AddIf(tempHeap, "-1", "==", nullLabel)
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
			tempStack := generador.NewTemp()
			generador.AddExpression(tempStack, "P", "1", "+")
			generador.AddStack(tempStack, tempHeap)
			generador.Bring_Func("print_string")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
			generador.AddGoTo(finalLabel)
			generador.AddLabel(nullLabel)
			generador.Bring_Func("Native_Print_Null")
			generador.AddLabel(finalLabel)
		case p_Interface.STRING:
			runs := []rune(result.Valor)
			finalLabel := generador.NewLabel()
			var val_Ascci []int

			for i := 0; i < len(runs); i++ {
				val_Ascci = append(val_Ascci, int(runs[i]))
			}
			tempHeap := generador.NewTemp()
			generador.AddExpression(tempHeap, "H", "", "")
			for _, s := range val_Ascci {
				generador.AddHeap("H", fmt.Sprintf("%v", s))
				generador.AddExpression("H", "H", "1", "+")
			}
			generador.AddHeap("H", "-1")
			generador.AddExpression("H", "H", "1", "+")
			nullLabel := generador.NewLabel()
			generador.AddIf(tempHeap, "-1", "==", nullLabel)
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
			tempStack := generador.NewTemp()
			generador.AddExpression(tempStack, "P", "1", "+")
			generador.AddStack(tempStack, tempHeap)
			generador.Bring_Func("print_string")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
			generador.AddGoTo(finalLabel)
			generador.AddLabel(nullLabel)
			generador.Bring_Func("Native_Print_Null")
			generador.AddLabel(finalLabel)
		case p_Interface.NULL:
			generador.Bring_Func("Native_Print_Null")
		case p_Interface.CHAR:
			runas := []rune(result.Valor)
			var ascii []int

			for i := 0; i < len(runas); i++ {
				ascii = append(ascii, int(runas[i]))
			}
			generador.AddPrint("c", "(int)"+fmt.Sprintf("%v", ascii[0]))

		}
	} else {
		array_Exp := make([]string, 0)
		array_Splitaso := make([]string, 0)
		array_Concat := make([]string, 0)
		var lastPart string

		if strings.Contains(result.Valor, "{}") {
			splitaso := strings.Split(result.Valor, "{}")

			for i, spl := range splitaso {

				if i != len(splitaso)-1 {

					tempo := generador.NewTemp()
					generador.AddComent("INICIO STRING")
					runas := []rune(spl)
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
					array_Splitaso = append(array_Splitaso, tempo)

				} else {
					tempo := generador.NewTemp()
					generador.AddComent("INICIO STRING")
					runas := []rune(spl)
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
					lastPart = tempo
				}

			}

			if len(splitaso)-1 == p.List_Exp.Len() {
				for _, s := range p.List_Exp.ToArray() {
					tempo := generador.NewTemp()
					sup := s.(p_Interface.Expresion).Ejecutar(controlador, generador, env, env_uni)
					if sup.IsP {
						if sup.Type == p_Interface.INTEGER || sup.Type == p_Interface.USIZE {

							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
							tempStack := generador.NewTemp()
							generador.AddExpression(tempStack, "P", "1", "+")
							generador.AddStack(tempStack, sup.Valor)
							generador.Bring_Func("Native_Int_Str")
							generador.AddExpression(tempo, "STACK[(int)P]", "", "")
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
							array_Exp = append(array_Exp, tempo)

						} else if sup.Type == p_Interface.FLOAT {
							generador.AddComent("INICIO F64-STRING")
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
							tempStack := generador.NewTemp()
							generador.AddExpression(tempStack, "P", "1", "+")
							generador.AddStack(tempStack, sup.Valor)
							generador.Bring_Func("Native_Double_Str")
							generador.AddExpression(tempo, "STACK[(int)P]", "", "")
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
							array_Exp = append(array_Exp, tempo)
							generador.AddComent("FIN F64-STRING")

						} else if sup.Type == p_Interface.STR || sup.Type == p_Interface.STRING {
							generador.AddComent("INICIO STRING")
							runas := []rune(sup.Valor)
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
							array_Exp = append(array_Exp, tempo)
						} else if sup.Type == p_Interface.BOOLEAN {
							if sup.Valor == "true" {
								generador.AddExpression(tempo, "H", "", "")
								generador.AddHeap("H", "116")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "114")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "117")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "101")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "-1")
								generador.AddExpression("H", "H", "1", "+")

							} else if sup.Valor == "false" {
								generador.AddExpression(tempo, "H", "", "")
								generador.AddHeap("H", "102")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "97")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "108")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "115")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "101")
								generador.AddExpression("H", "H", "1", "+")
								generador.AddHeap("H", "-1")
								generador.AddExpression("H", "H", "1", "+")
							}
							array_Exp = append(array_Exp, tempo)
						}
					}
					if sup.IsCV || sup.IsArit {
						if sup.Type == p_Interface.STR || sup.Type == p_Interface.STRING {
							tempo = sup.Valor
							array_Exp = append(array_Exp, tempo)
						} else if sup.Type == p_Interface.INTEGER {
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
							tempStack := generador.NewTemp()
							generador.AddExpression(tempStack, "P", "1", "+")
							generador.AddStack(tempStack, sup.Valor)
							generador.Bring_Func("Native_Int_Str")
							generador.AddExpression(tempo, "STACK[(int)P]", "", "")
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
							array_Exp = append(array_Exp, tempo)
						} else if sup.Type == p_Interface.FLOAT {
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
							tempStack := generador.NewTemp()
							generador.AddExpression(tempStack, "P", "1", "+")
							generador.AddStack(tempStack, sup.Valor)
							generador.Bring_Func("Native_Double_Str")
							generador.AddExpression(tempo, "STACK[(int)P]", "", "")
							generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
							array_Exp = append(array_Exp, tempo)
						} else if sup.Type == p_Interface.BOOLEAN {
							temporalin1 := generador.NewTemp()
							finalLabel := generador.NewLabel()
							tlabel := generador.NewLabel()
							generador.AddExpression(temporalin1, sup.Valor, "", "")
							generador.AddIf(temporalin1, "0", "==", tlabel)
							generador.AddExpression(tempo, "H", "", "")
							generador.AddHeap("H", "116")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "114")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "117")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "101")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "-1")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddGoTo(finalLabel)
							generador.AddLabel(tlabel)
							generador.AddExpression(tempo, "H", "", "")
							generador.AddHeap("H", "102")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "97")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "108")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "115")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "101")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddHeap("H", "-1")
							generador.AddExpression("H", "H", "1", "+")
							generador.AddLabel(finalLabel)
							array_Exp = append(array_Exp, tempo)
						}
					}

				}
			} else {
				err := p_Errores.NewError("En el print no tiene la misma cantidad de espacion que la expresiones", env.(p_Enviroment.Enviroment).HaveFatha(), p.Linea, p.Columna)
				controlador.Errores.Add(err)
			}

			for i, _ := range array_Splitaso {
				generador.AddComent("INICIO CONCAT SUBSTRING")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				temporalin1 := generador.NewTemp()
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, array_Splitaso[i])
				temporalin2 := generador.NewTemp()
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, array_Exp[i])
				generador.Bring_Func("Native_Concat_Str")
				temporalin3 := generador.NewTemp()
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				array_Concat = append(array_Concat, temporalin3)
				generador.AddComent("FINAL CONCAT SUBSTRING")
			}

			temporalin1 := generador.NewTemp()

			for i, _ := range array_Concat {
				if i < len(array_Concat)-1 {
					generador.AddComent("INICIO COMBINACION STRING")
					generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
					temporalin2 := generador.NewTemp()
					generador.AddExpression(temporalin2, "P", "1", "+")
					if i == 0 {
						generador.AddStack(temporalin2, array_Concat[i])
					} else {
						generador.AddStack(temporalin2, temporalin1)
					}

					temporalin3 := generador.NewTemp()
					generador.AddExpression(temporalin3, "P", "2", "+")
					generador.AddStack(temporalin3, array_Concat[i+1])
					generador.Bring_Func("Native_Concat_Str")
					generador.AddExpression(temporalin1, "STACK[(int)P]", "", "")
					generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
					generador.AddComent("FIN COMBINACION STRING")

				} else if len(array_Concat)-1 == 0 {
					generador.AddComent("INICIO COMBINACION STRING")
					temporalin1 = array_Concat[0]
					generador.AddComent("FIN COMBINACION STRING")
				}
			}

			if lastPart != "" {
				generador.AddComent("INICIO COMBINACION STRING")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				temporalin2 := generador.NewTemp()
				generador.AddExpression(temporalin2, "P", "1", "+")
				generador.AddStack(temporalin2, temporalin1)
				temporalin3 := generador.NewTemp()
				generador.AddExpression(temporalin3, "P", "2", "+")
				generador.AddStack(temporalin3, lastPart)
				generador.Bring_Func("Native_Concat_Str")
				generador.AddExpression(temporalin1, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddComent("FIN COMBINACION STRING")

			}

			finalLabel := generador.NewLabel()
			nullLabel := generador.NewLabel()
			generador.AddIf(temporalin1, "-1", "==", nullLabel)
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
			tempStack := generador.NewTemp()
			generador.AddExpression(tempStack, "P", "1", "+")
			generador.AddStack(tempStack, temporalin1)
			generador.Bring_Func("print_string")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
			generador.AddGoTo(finalLabel)
			generador.AddLabel(nullLabel)
			generador.Bring_Func("Native_Print_Null")
			generador.AddLabel(finalLabel)

			//fmt.Println(splitaso)

		} else if strings.Contains(result.Valor, "{:?}") {

		}
	}
	generador.AddPrint("c", "(int)10")
	generador.AddComent("Final Print")
	return result
}

/*

func PrintVectors(s p_Interface.Symbol) string {
	var cadena = ""

	cadena += "["
	for _, sup := range s.Valor.(*arrayList.List).ToArray() {

		switch sup.(p_Interface.Symbol).Tipo {
		case p_Interface.ARRAY:
			cadena += PrintVectors(sup.(p_Interface.Symbol))
		case p_Interface.VECTOR:
			cadena += PrintVectors(sup.(p_Interface.Symbol))
		case p_Interface.STR:
			cadena += "\"" + sup.(p_Interface.Symbol).Valor.(string) + "\","
		case p_Interface.INTEGER:
			cadena += strconv.Itoa(sup.(p_Interface.Symbol).Valor.(int)) + ","
		case p_Interface.CHAR:
			cadena += "'" + sup.(p_Interface.Symbol).Valor.(string) + "',"
		case p_Interface.STRING:
			cadena += "\"" + sup.(p_Interface.Symbol).Valor.(string) + "\","
		case p_Interface.NULL:
			return ""
		}

	}
	cadena += "] \n"

	return cadena
}
*/

/*
if sup.(interfaces.Symbol).Tipo == interfaces.ARRAY || sup.(interfaces.Symbol).Tipo == interfaces.VECTOR {
			cadena += PrintVectors(sup.(interfaces.Symbol))
		} else if sup.(interfaces.Symbol).Tipo == interfaces.STR {
			cadena += "\"" + sup.(interfaces.Symbol).Valor.(string) + "\","
		} else if sup.(interfaces.Symbol).Tipo == interfaces.INTEGER {
			cadena += strconv.Itoa(sup.(interfaces.Symbol).Valor.(int)) + ","
		}
*/

package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"

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
		if result.Simbolin.Valor != nil {

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

		case p_Interface.CHAR:
			runas := []rune(result.Valor)
			var ascii []int

			for i := 0; i < len(runas); i++ {
				ascii = append(ascii, int(runas[i]))
			}
			generador.AddPrint("c", "(int)"+fmt.Sprintf("%v", ascii[0]))

		}
	} else {

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

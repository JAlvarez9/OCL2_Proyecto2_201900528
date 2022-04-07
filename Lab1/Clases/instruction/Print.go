package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"

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

	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	switch result.Type {
	case p_Interface.INTEGER:
		generador.AddPrint("d", "(int)"+fmt.Sprintf("%v", result.Valor))
	case p_Interface.FLOAT:
		generador.AddPrint("f", "(float)"+fmt.Sprintf("%v", result.Valor))
	case p_Interface.BOOLEAN:
		newLabel := generador.NewLabel()
		generador.AddLabel(result.TrueLabel)
		generador.AddPrint("d", "(int)1")
		generador.AddGoTo(newLabel)
		generador.AddLabel(result.FalseLabel)
		generador.AddPrint("d", "(int)0")
		generador.AddLabel(newLabel)
	case p_Interface.STR:

		runs := []rune(result.Valor)

		var val_Ascci []int

		for i := 0; i < len(runs); i++ {
			val_Ascci = append(val_Ascci, int(runs[i]))
		}
		for _, s := range val_Ascci {
			generador.AddPrint("c", fmt.Sprintf("%v", s))
		}
		fmt.Println(val_Ascci)
	}

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
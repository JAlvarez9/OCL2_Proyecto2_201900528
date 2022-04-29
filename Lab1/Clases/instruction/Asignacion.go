package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"

	"github.com/colegno/arraylist"
)

type Asignacion struct {
	Id          string
	Expresion   p_Interface.Expresion
	Id_Atributo string
	Acces_Array *arraylist.List
	Line        int
	Columna     int
}

func NewAsignacion(id string, expresion p_Interface.Expresion, id_atr string, list *arraylist.List, line int, colu int) Asignacion {
	instr := Asignacion{
		Id:          id,
		Expresion:   expresion,
		Id_Atributo: id_atr,
		Acces_Array: list,
		Line:        line,
		Columna:     colu,
	}
	return instr
}

func (p Asignacion) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO ASIGNACION")
	temporalin2 := generador.NewTemp()
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	if result.IsP {
		if result.Type == p_Interface.INTEGER || result.Type == p_Interface.FLOAT || result.Type == p_Interface.USIZE {
			generador.AddExpression(temporalin2, result.Valor, "", "")
		} else if result.Type == p_Interface.STR || result.Type == p_Interface.STRING {
			generador.AddComent("INICIO STRING")
			runas := []rune(result.Valor)
			var ascii []int

			for i := 0; i < len(runas); i++ {
				ascii = append(ascii, int(runas[i]))
			}

			generador.AddExpression(temporalin2, "H", "", "")
			for i := 0; i < len(ascii); i++ {
				generador.AddHeap("H", strconv.Itoa(ascii[i]))
				generador.AddExpression("H", "H", "1", "+")
			}
			generador.AddHeap("H", "-1")
			generador.AddExpression("H", "H", "1", "+")
			generador.AddComent("FINAL STRING")
		} else if result.Type == p_Interface.BOOLEAN {
			if result.Valor == "true" {
				result.Valor = "1"
				generador.AddExpression(temporalin2, "1", "", "")
			} else if result.Valor == "false" {
				result.Valor = "0"
				generador.AddExpression(temporalin2, "0", "", "")
			}
		} else if result.Type == p_Interface.CHAR {
			generador.AddComent("INICIO CHAR")
			runas := []rune(result.Valor)
			var ascii []int

			for i := 0; i < len(runas); i++ {
				ascii = append(ascii, int(runas[i]))
			}

			a := fmt.Sprintf("%v", result.Simbolin.Posicion)
			temporalin := generador.NewTemp()
			generador.AddExpression(temporalin, "P", a, "+")
			generador.AddStack(temporalin, strconv.Itoa(ascii[0]))
			generador.AddExpression(temporalin2, strconv.Itoa(ascii[0]), "", "")
			generador.AddComent("FINAL CHAR")
		}

		if p.Id_Atributo != "" {

			sup := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
			id_s := sup.Valor.(p_Interface.Symbol).Valor.(string)
			var pos_fin int
			structsito := env.(p_Enviroment.Enviroment).GetStruct(controlador, id_s, p.Line, p.Columna)
			for i, s := range structsito.Valor.(*arraylist.List).ToArray() {
				if p.Id_Atributo == s.(p_Interface.Symbol).Id {
					pos_fin = sup.Posicion + i + 1
				}
			}
			a := fmt.Sprintf("%v", pos_fin)
			temporalin := generador.NewTemp()
			generador.AddExpression(temporalin, "P", a, "+")
			generador.AddStack(temporalin, temporalin2)

		} else if p.Acces_Array.Len() != 0 {
			array := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
			pos := strconv.Itoa(array.Posicion)
			temporali := generador.NewTemp()
			generador.AddExpression(temporali, "STACK[(int)"+pos+"]", "", "")
			for i, s := range p.Acces_Array.ToArray() {
				generador.AddComent("Inicio CALL VECTOR")
				sup := s.(p_Interface.Expresion).Ejecutar(controlador, generador, env, env_uni)
				labelsito1 := generador.NewLabel()
				labelsito2 := generador.NewLabel()
				labelsito3 := generador.NewLabel()
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()
				generador.AddIf(temporali, "-1", "==", labelsito1)
				generador.AddExpression(temporalin1, temporali, "", "")
				generador.AddExpression(temporalin2, "HEAP[(int)"+temporalin1+"]", "", "")
				generador.AddIf(sup.Valor, temporalin2, ">=", labelsito2)
				generador.AddExpression(temporalin1, temporalin1, "1", "+")
				generador.AddExpression(temporalin1, temporalin1, sup.Valor, "+")
				generador.AddExpression(temporalin3, "HEAP[(int)"+temporalin1+"]", "", "")
				generador.AddGoTo(labelsito3)
				generador.AddLabel(labelsito1)
				generador.Bring_Func("Native_Print_Null")
				generador.AddExpression(temporalin3, "-1", "", "")
				generador.AddGoTo(labelsito3)
				generador.AddLabel(labelsito2)
				//BRING FUNC ERROR POS
				generador.AddExpression(temporalin3, "-1", "", "")
				if i == p.Acces_Array.Len()-1 {
					pos = temporalin1
				} else {
					pos = temporalin3
					temporali = temporalin3
				}
				generador.AddLabel(labelsito3)
				generador.AddComent("FIN CALL VECTOR")
			}
			generador.AddHeap(pos, temporalin2)
		} else {
			sup := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
			temporalin := generador.NewTemp()
			a := fmt.Sprintf("%v", sup.Posicion)
			generador.AddExpression(temporalin, "P", a, "+")
			generador.AddStack(temporalin, temporalin2)
		}

	}
	if result.IsCV || result.IsArit {
		sup := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
		temporalin := generador.NewTemp()
		a := fmt.Sprintf("%v", sup.Posicion)
		generador.AddExpression(temporalin, "P", a, "+")
		generador.AddStack(temporalin, result.Valor)
	}

	generador.AddComent("FINAL ASIGNACION")
	return result
	//a = 2:
}

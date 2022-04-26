package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"
)

type Asignacion struct {
	Id          string
	Expresion   p_Interface.Expresion
	Id_Atributo string
	Line        int
	Columna     int
}

func NewAsignacion(id string, expresion p_Interface.Expresion, id_atr string, line int, colu int) Asignacion {
	instr := Asignacion{
		Id:          id,
		Expresion:   expresion,
		Id_Atributo: id_atr,
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
		if result.Type == p_Interface.INTEGER || result.Type == p_Interface.FLOAT {
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
		}
		sup := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
		temporalin := generador.NewTemp()
		a := fmt.Sprintf("%v", sup.Posicion)
		generador.AddExpression(temporalin, "P", a, "+")
		generador.AddStack(temporalin, temporalin2)

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

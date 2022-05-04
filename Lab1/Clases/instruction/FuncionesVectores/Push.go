package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"
)

type Push struct {
	Id      p_Interface.Expresion
	Valor   p_Interface.Expresion
	Linea   int
	Columna int
}

func NewPush(id p_Interface.Expresion, vect p_Interface.Expresion, line int, colu int) Push {
	pushito := Push{
		Id:      id,
		Valor:   vect,
		Linea:   line,
		Columna: colu,
	}
	return pushito
}

func (p Push) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO PUSH")
	arraysin := p.Id.Ejecutar(controlador, generador, env, env_uni)
	insersion := p.Valor.Ejecutar(controlador, generador, env, env_uni)

	if insersion.Type == p_Interface.STR || insersion.Type == p_Interface.STRING {

		tempHeap := generador.NewTemp()
		if insersion.IsArit {
			tempHeap = insersion.Valor
		} else {
			runs := []rune(insersion.Valor)

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
		insersion.Valor = tempHeap
	}

	temporalin1 := generador.NewTemp()
	temporalin2 := generador.NewTemp()

	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
	generador.AddExpression(temporalin1, "P", "1", "+")
	generador.AddStack(temporalin1, arraysin.Valor)
	generador.AddExpression(temporalin2, "P", "2", "+")
	generador.AddStack(temporalin2, insersion.Valor)
	generador.Bring_Func("Native_Push_Vector")
	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
	generador.AddComent("FIN PUSH")
	return result
}

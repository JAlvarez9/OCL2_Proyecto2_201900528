package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"
)

type Insert struct {
	Id       p_Interface.Expresion
	Pos_Vec  p_Interface.Expresion
	Expr_Add p_Interface.Expresion
	Linea    int
	Columna  int
}

func NewInsert(id p_Interface.Expresion, vect p_Interface.Expresion, agregar p_Interface.Expresion, line int, colu int) Insert {
	pushito := Insert{
		Id:       id,
		Pos_Vec:  vect,
		Expr_Add: agregar,
		Linea:    line,
		Columna:  colu,
	}
	return pushito
}

func (p Insert) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO INSERT")
	arraysito := p.Id.Ejecutar(controlador, generador, env, env_uni)
	inidicito := p.Pos_Vec.Ejecutar(controlador, generador, env, env_uni)
	valorcito := p.Expr_Add.Ejecutar(controlador, generador, env, env_uni)

	if valorcito.Type == p_Interface.STR || valorcito.Type == p_Interface.STRING {

		tempHeap := generador.NewTemp()
		if valorcito.IsArit {
			tempHeap = valorcito.Valor
		} else {
			runs := []rune(valorcito.Valor)

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
		valorcito.Valor = tempHeap
	}

	temporalin1 := generador.NewTemp()
	temporalin2 := generador.NewTemp()
	temporalin3 := generador.NewTemp()

	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
	generador.AddExpression(temporalin1, "P", "1", "+")
	generador.AddStack(temporalin1, arraysito.Valor)
	generador.AddExpression(temporalin2, "P", "2", "+")
	generador.AddStack(temporalin2, inidicito.Valor)
	generador.AddExpression(temporalin3, "P", "3", "+")
	generador.AddStack(temporalin3, valorcito.Valor)
	generador.Bring_Func("Native_Insert_Vector")
	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
	generador.AddComent("FIN INSERT")

	return result
}

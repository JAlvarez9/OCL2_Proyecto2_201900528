package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"strconv"
)

type Remove_instr struct {
	Id      p_Interface.Expresion
	Valor   p_Interface.Expresion
	Linea   int
	Columna int
}

func NewRemove_instr(id p_Interface.Expresion, vect p_Interface.Expresion, line int, colu int) Remove_instr {
	pushito := Remove_instr{
		Id:      id,
		Valor:   vect,
		Linea:   line,
		Columna: colu,
	}
	return pushito
}

func (p Remove_instr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO REMOVE")
	arraysito := p.Id.Ejecutar(controlador, generador, env, env_uni)
	indicito := p.Valor.Ejecutar(controlador, generador, env, env_uni)

	temporalin1 := generador.NewTemp()
	temporalin2 := generador.NewTemp()
	temporalin3 := generador.NewTemp()

	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
	generador.AddExpression(temporalin1, "P", "1", "+")
	generador.AddStack(temporalin1, arraysito.Valor)
	generador.AddExpression(temporalin2, "P", "2", "+")
	generador.AddStack(temporalin2, indicito.Valor)
	generador.Bring_Func("Native_Remove_Vector")
	generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
	generador.AddComent("FIN REMOVE")
	result.Valor = temporalin3
	result.IsCV = true
	result.Type = arraysito.Type
	return result
}

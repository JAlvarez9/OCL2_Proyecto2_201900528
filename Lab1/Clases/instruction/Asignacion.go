package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
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
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	sup := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
	temporalin := generador.NewTemp()
	a := fmt.Sprintf("%v", sup.Posicion)
	generador.AddExpression(temporalin, "P", a, "+")
	generador.AddStack(temporalin, result.Valor)
	generador.AddComent("FINAL ASIGNACION")
	return result
}

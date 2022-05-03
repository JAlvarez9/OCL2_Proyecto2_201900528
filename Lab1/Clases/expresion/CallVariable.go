package expresion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"strconv"
)

type CallVariable struct {
	Id      string
	Line    int
	Columna int
}

func NewCallVariable(id string, line int, column int) CallVariable {
	exp := CallVariable{Id: id, Line: line, Columna: column}
	return exp
}

func (p CallVariable) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO CALL VARIABLE")
	sup := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id, p.Line, p.Columna)
	result.Simbolin = sup
	if sup.Tipo == p_Interface.ARRAY || sup.Tipo == p_Interface.VECTOR {
		result.Type = sup.Valor.(p_Interface.Symbol).Valor.(p_Interface.TipoExpresion)
	} else {
		result.Type = sup.Tipo
	}
	sup2 := generador.NewTemp()
	generador.AddExpression(sup2, "STACK[(int)"+strconv.Itoa(result.Simbolin.Posicion)+"]", "", "")
	if result.Type == p_Interface.BOOLEAN {
		truel := generador.NewLabel()
		falsel := generador.NewLabel()
		result.TrueLabel = truel
		result.FalseLabel = falsel
	}
	result.Valor = sup2
	result.IsCV = true
	generador.AddComent("FIN CALL VARIABLE")
	return result
}

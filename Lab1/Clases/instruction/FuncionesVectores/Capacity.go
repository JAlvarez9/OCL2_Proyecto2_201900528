package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Capacity struct {
	Exp     p_Interface.Expresion
	Line    int
	Columna int
}

func NewCapacity(exp p_Interface.Expresion, line int, col int) Capacity {
	capac := Capacity{
		Exp:     exp,
		Line:    line,
		Columna: col,
	}
	return capac
}

func (p Capacity) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO CAPACITY")
	result = p.Exp.Ejecutar(controlador, generador, env, env_uni)

	result.IsCV = true
	result.Type = p_Interface.INTEGER

	newSymb := p_Interface.Symbol{
		Valor: result.Valor,
		Tipo:  p_Interface.INTEGER,
	}
	result.Simbolin = newSymb
	temporalin := generador.NewTemp()
	generador.AddExpression(temporalin, "HEAP[(int)"+result.Valor+"]", "", "")
	result.Valor = temporalin
	generador.AddComent("FIN CAPACITY")
	return result
}

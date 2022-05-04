package funcionesvectores

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"strconv"
)

type Len struct {
	Expresion p_Interface.Expresion
	Linea     int
	Columna   int
}

func NewLen(expre p_Interface.Expresion, line int, colu int) Len {
	pushito := Len{
		Expresion: expre,
		Linea:     line,
		Columna:   colu,
	}
	return pushito
}

func (p Len) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.IsLen = true
	generador.AddComent("INICIO LEN")
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)

	tempo := generador.NewTemp()
	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
	tempStack := generador.NewTemp()
	generador.AddExpression(tempStack, "P", "1", "+")
	generador.AddStack(tempStack, result.Valor)
	generador.Bring_Func("Native_Len_Vector")
	generador.AddExpression(tempo, "STACK[(int)P]", "", "")
	generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
	result.Valor = tempo
	newSymb := p_Interface.Symbol{
		Valor: result.Valor,
		Tipo:  p_Interface.INTEGER,
	}
	result.Simbolin = newSymb
	result.IsCV = true
	generador.IsLen = false
	generador.AddComent("FIN LEN")
	return result
}

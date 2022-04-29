package funcionesnativas

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interfaces "LAB1/Clases/interfaces"
	"strconv"
)

type Absoluto struct {
	Expresion p_Interfaces.Expresion
	Linea     int
	Columna   int
}

func NewAbsoluto(exp p_Interfaces.Expresion, line int, colu int) Absoluto {
	absolotin := Absoluto{
		Expresion: exp,
		Linea:     line,
		Columna:   colu,
	}
	return absolotin
}

func (p Absoluto) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value

	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)

	if result.Type == p_Interfaces.INTEGER || result.Type == p_Interfaces.FLOAT || result.Type == p_Interfaces.USIZE {
		tempo := generador.NewTemp()
		if result.IsP {
			generador.AddComent("INICIO ABSOLUTO")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
			tempStack := generador.NewTemp()
			generador.AddExpression(tempStack, "P", "1", "+")
			generador.AddStack(tempStack, result.Valor)
			generador.Bring_Func("Native_Abs")
			generador.AddExpression(tempo, "STACK[(int)P]", "", "")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
			generador.AddComent("FIN ABSOLUTO")
			result.Valor = tempo
		} else if result.IsCV || result.IsArit {
			generador.AddComent("INICIO ABSOLUTO")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
			tempStack := generador.NewTemp()
			generador.AddExpression(tempStack, "P", "1", "+")
			generador.AddStack(tempStack, result.Valor)
			generador.Bring_Func("Native_Abs")
			generador.AddExpression(tempo, "STACK[(int)P]", "", "")
			generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
			result.Valor = tempo
			generador.AddComent("FIN ABSOLUTO")
		}
	} else {
		newErr := p_Errores.NewError("La variable ya existe", env.(p_Enviroment.Enviroment).HaveFatha(), p.Linea, p.Columna)
		controlador.Errores.Add(newErr)
		controlador.Agregar_Consola("La variable ya existe")
	}

	return result
}

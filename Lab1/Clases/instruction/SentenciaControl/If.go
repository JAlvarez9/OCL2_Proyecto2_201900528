package sentenciacontrol

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type If struct {
	Expresion   p_Interfaces.Expresion
	Bloque_if   *arrayList.List
	Bloque_else *arrayList.List
	Line        int
	Columna     int
}

func NewIf(condition p_Interfaces.Expresion, bloque_if *arrayList.List, bloque_else *arrayList.List, linea int, colu int) If {
	ifinstr := If{
		Expresion:   condition,
		Bloque_if:   bloque_if,
		Bloque_else: bloque_else,
		Line:        linea,
		Columna:     colu,
	}
	return ifinstr
}

func (p If) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	generador.AddComent("INICIO IF")
	finalLabel := generador.NewLabel()
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	tempEnv := p_Enviroment.NewEnviroment(env)
	if result.Valor == "true" {
		generador.AddGoTo(result.TrueLabel)
	} else if result.Valor == "false" {
		generador.AddGoTo(result.FalseLabel)
	}

	if result.IsCV == true && result.Type == p_Interfaces.BOOLEAN {

		generador.AddIf(result.Valor, "1", "==", result.TrueLabel)
		generador.AddGoTo(result.FalseLabel)

	}

	generador.AddLabel(result.TrueLabel)
	for _, s := range p.Bloque_if.ToArray() {
		s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, tempEnv, env_uni)

	}
	generador.AddGoTo(finalLabel)
	generador.AddLabel(result.FalseLabel)
	for _, s := range p.Bloque_else.ToArray() {
		s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, tempEnv, env_uni)

	}
	generador.AddLabel(finalLabel)
	generador.AddComent("FINAL IF")
	return result
}

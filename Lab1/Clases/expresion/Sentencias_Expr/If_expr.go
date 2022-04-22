package sentenciasexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type If_expr struct {
	Expresion   p_Interfaces.Expresion
	Bloque_if   p_Interfaces.Expresion
	Bloque_else p_Interfaces.Expresion
	Line        int
	Columna     int
}

func NewIf_expr(condition p_Interfaces.Expresion, bloque_if p_Interfaces.Expresion, bloque_else p_Interfaces.Expresion, linea int, colu int) If_expr {
	ifinstr := If_expr{
		Expresion:   condition,
		Bloque_if:   bloque_if,
		Bloque_else: bloque_else,
		Line:        linea,
		Columna:     colu,
	}
	return ifinstr
}

func (p If_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value

	generador.AddComent("INICIO IF")
	finalLabel := generador.NewLabel()
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
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

	p.Bloque_if.Ejecutar(controlador, generador, env, env_uni)

	generador.AddGoTo(finalLabel)
	generador.AddLabel(result.FalseLabel)

	p.Bloque_else.Ejecutar(controlador, generador, env, env_uni)

	generador.AddLabel(finalLabel)
	generador.AddComent("FINAL IF")
	return result
}

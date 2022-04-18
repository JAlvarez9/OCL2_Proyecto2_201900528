package Operacion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
)

type Logica struct {
	Op1      p_Interface.Expresion
	Operador string
	Op2      p_Interface.Expresion
	Unario   bool
	Line     int
	Column   int
}

func NewOperacion_Logica(op1 p_Interface.Expresion, operador string, op2 p_Interface.Expresion, unario bool, line int, colu int) Logica {
	exp := Logica{Op1: op1, Operador: operador, Op2: op2, Unario: unario, Line: line, Column: colu}
	return exp
}

func (p Logica) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("Inicio Logico")
	var retornoIzq p_Interface.Value
	var retornoDer p_Interface.Value

	switch p.Operador {
	case "&&":
		{
			finalLabel := generador.NewLabel()
			retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
			if retornoIzq.Type != p_Interface.BOOLEAN {
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
			if retornoIzq.Valor == "true" {
				generador.AddGoTo(retornoIzq.TrueLabel)
			} else if retornoIzq.Valor == "false" {
				generador.AddGoTo(retornoIzq.FalseLabel)
			}
			generador.AddLabel(retornoIzq.TrueLabel)
			retornoDer = p.Op2.Ejecutar(controlador, generador, env, env_uni)
			if retornoDer.Type != p_Interface.BOOLEAN {
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
			if retornoDer.Valor == "true" {
				generador.AddGoTo(retornoDer.TrueLabel)
			} else if retornoDer.Valor == "false" {
				generador.AddGoTo(retornoDer.FalseLabel)
			}

			generador.AddLabel(retornoIzq.FalseLabel)
			generador.AddLabel(retornoDer.FalseLabel)
			generador.AddGoTo(finalLabel)
			return p_Interface.Value{
				Valor:      "",
				IsTemp:     false,
				Type:       p_Interface.BOOLEAN,
				TrueLabel:  retornoDer.TrueLabel,
				FalseLabel: finalLabel,
			}

		}
	case "||":
		{
			finalLabel := generador.NewLabel()
			retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
			if retornoIzq.Type != p_Interface.BOOLEAN {
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
			if retornoIzq.Valor == "true" {
				generador.AddGoTo(retornoIzq.TrueLabel)
			} else if retornoIzq.Valor == "false" {
				generador.AddGoTo(retornoIzq.FalseLabel)
			}
			generador.AddLabel(retornoIzq.FalseLabel)
			retornoDer = p.Op2.Ejecutar(controlador, generador, env, env_uni)
			if retornoDer.Type != p_Interface.BOOLEAN {
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
			if retornoDer.Valor == "true" {
				generador.AddGoTo(retornoDer.TrueLabel)
			} else if retornoDer.Valor == "false" {
				generador.AddGoTo(retornoDer.FalseLabel)
			}
			generador.AddLabel(retornoIzq.TrueLabel)
			generador.AddLabel(retornoDer.TrueLabel)
			generador.AddGoTo(finalLabel)

			return p_Interface.Value{
				Valor:      "",
				IsTemp:     false,
				Type:       p_Interface.BOOLEAN,
				TrueLabel:  finalLabel,
				FalseLabel: retornoDer.FalseLabel,
			}

		}
	case "!":
		{

			retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
			if retornoIzq.Type == p_Interface.BOOLEAN {

				sup := retornoIzq.TrueLabel
				sup1 := retornoIzq.FalseLabel
				if retornoIzq.Valor == "true" {
					retornoIzq.Valor = "false"
				} else if retornoIzq.Valor == "false" {
					retornoIzq.Valor = "true"
				}
				retornoIzq.TrueLabel = sup1
				retornoIzq.FalseLabel = sup
				/*sup1, _ := strconv.ParseBool(retornoIzq.Valor)
				if sup1 {
					generador.AddGoTo(falseLabel)
				} else {
					generador.AddGoTo(trueLabel)
				}*/
				return retornoIzq
			} else {
				var err = p_Errores.NewError("No se puede operara en la NOT", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en el NOT " + retornoIzq.Valor)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}

	}
	generador.AddComent("Final Logico")
	return result
}

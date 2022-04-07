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

	var retornoIzq p_Interface.Value
	var retornoDer p_Interface.Value

	if p.Unario == true {
		retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
	} else {
		retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
		retornoDer = p.Op2.Ejecutar(controlador, generador, env, env_uni)
	}

	newTemp := generador.NewTemp()

	if retornoIzq.Type == -6 || retornoDer.Type == -6 {
		var err = p_Errores.NewError("Es un error semantico", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
		controlador.Errores.Add(err)
		return p_Interface.Value{
			Valor:      newTemp,
			IsTemp:     true,
			Type:       p_Interface.NULL,
			TrueLabel:  "",
			FalseLabel: "",
		}
	}
	var valor1 string
	var valor2 string

	if retornoIzq.Valor == "true" {
		valor1 = "1"
	} else {
		valor1 = "0"
	}

	if retornoDer.Valor == "true" {
		valor2 = "1"
	} else {
		valor2 = "0"
	}

	switch p.Operador {
	case "&&":
		{
			if retornoIzq.Type == p_Interface.BOOLEAN && retornoDer.Type == p_Interface.BOOLEAN {

				if retornoIzq.Valor == "false" && retornoDer.Valor == "false" {
					trueLabel := generador.NewLabel()
					falseLabel := generador.NewLabel()

					generador.AddIf("1", "1", p.Operador, trueLabel)
					generador.AddGoTo(falseLabel)
					return p_Interface.Value{
						Valor:      newTemp,
						IsTemp:     false,
						Type:       p_Interface.BOOLEAN,
						TrueLabel:  trueLabel,
						FalseLabel: falseLabel,
					}
				} else {
					trueLabel := generador.NewLabel()
					falseLabel := generador.NewLabel()

					generador.AddIf(valor1, valor2, p.Operador, trueLabel)
					generador.AddGoTo(falseLabel)
					return p_Interface.Value{
						Valor:      newTemp,
						IsTemp:     false,
						Type:       p_Interface.BOOLEAN,
						TrueLabel:  trueLabel,
						FalseLabel: falseLabel,
					}
				}

			} else {
				var err = p_Errores.NewError("No se puede operara en la operacion relacional", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la operacion relacional " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "||":
		{
			if retornoIzq.Type == p_Interface.BOOLEAN && retornoDer.Type == p_Interface.BOOLEAN {
				trueLabel := generador.NewLabel()
				falseLabel := generador.NewLabel()

				generador.AddIf(valor1, valor2, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la operacion relacional", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la operacion relacional " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "!":
		{
			if retornoIzq.Type == p_Interface.BOOLEAN {
				trueLabel := generador.NewLabel()
				falseLabel := generador.NewLabel()

				generador.AddIf(valor1, valor2, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la NOT", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en el NOT " + retornoIzq.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}

	}

	return result
}

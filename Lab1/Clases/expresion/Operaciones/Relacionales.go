package Operacion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
)

type Relacional struct {
	Op1      p_Interface.Expresion
	Operador string
	Op2      p_Interface.Expresion
	Unario   bool
	Line     int
	Column   int
}

func NewOperacion_Relacional(op1 p_Interface.Expresion, operador string, op2 p_Interface.Expresion, unario bool, line int, colu int) Relacional {
	exp := Relacional{Op1: op1, Operador: operador, Op2: op2, Unario: unario, Line: line, Column: colu}
	return exp
}

func (p Relacional) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("Inicio Relacional")
	var retornoIzq p_Interface.Value
	var retornoDer p_Interface.Value

	if p.Unario == true {
		retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
	} else {
		retornoIzq = p.Op1.Ejecutar(controlador, generador, env, env_uni)
		retornoDer = p.Op2.Ejecutar(controlador, generador, env, env_uni)
	}

	//var dominante p_Interface.TypeExpresion|

	if retornoIzq.Type == -6 || retornoDer.Type == -6 {
		var err = p_Errores.NewError("Es un error semantico", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
		controlador.Errores.Add(err)
		return p_Interface.Value{
			Valor:      "",
			IsTemp:     true,
			Type:       p_Interface.NULL,
			TrueLabel:  "",
			FalseLabel: "",
		}
	}
	trueLabel := generador.NewLabel()
	falseLabel := generador.NewLabel()
	//sup3 := ""
	switch p.Operador {
	case "<":
		{
			//dominante = logic_dominante[retornoIzq.Type][retornoDer.Type]
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
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
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case ">":
		{

			//dominante = logic_dominante[retornoIzq.Type][retornoDer.Type]
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
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
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "<=":
		{

			//dominante = logic_dominante[retornoIzq.Type][retornoDer.Type]
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
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
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case ">=":
		{

			//dominante = logic_dominante[retornoIzq.Type][retornoDer.Type]
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
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
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "==":
		{

			//dominante = logic_dominante[retornoIzq.Type][retornoDer.Type]
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
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
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "!=":
		{

			//dominante = logic_dominante[retornoIzq.Type][retornoDer.Type]
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:      "",
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
					Valor:      "",
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	}
	generador.AddComent("Final Relacional")
	return result
}

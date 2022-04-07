package Operacion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
)

type Aritmetica struct {
	Op1      p_Interface.Expresion
	Operador string
	Op2      p_Interface.Expresion
	Unario   bool
	Line     int
	Column   int
}

func NewOperacion_Arit(op1 p_Interface.Expresion, operador string, op2 p_Interface.Expresion, unario bool, line int, colu int) Aritmetica {
	exp := Aritmetica{Op1: op1, Operador: operador, Op2: op2, Unario: unario, Line: line, Column: colu}
	return exp
}

func (p Aritmetica) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
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

	switch p.Operador {
	case "+":
		{

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}

			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.STR,
					TrueLabel:  "",
					FalseLabel: "",
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.STRING,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.STRING,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.STRING,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {

				var err = p_Errores.NewError("No se puede operara en la suma", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la suma " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}

			}

		}
	case "-":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if p.Unario == true {
				if retornoIzq.Type == p_Interface.INTEGER {

				} else if retornoIzq.Type == p_Interface.FLOAT {

				}
			}

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la resta ", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la resta " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "*":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la multiplicacion ", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la multiplicacion " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "/":
		{
			//dominante = div_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la division ", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la division " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "pow":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExprePow(newTemp, retornoIzq.Valor, retornoDer.Valor, "^")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la potencia ", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la potencia " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "powf":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExprePow(newTemp, retornoIzq.Valor, retornoDer.Valor, "^")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la potencia ", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la potencia " + retornoIzq.Valor + " y " + retornoDer.Valor)
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.NULL,
					TrueLabel:  "",
					FalseLabel: "",
				}
			}
		}
	case "%":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "%")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "%")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
				}
			} else {
				var err = p_Errores.NewError("No se puede operara en la potencia ", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("No se puede operar en la potencia " + retornoIzq.Valor + " y " + retornoDer.Valor)
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

package Operacion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"strconv"
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
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER || retornoIzq.Type == p_Interface.CHAR && retornoDer.Type == p_Interface.CHAR {

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

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
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
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER || retornoIzq.Type == p_Interface.CHAR && retornoDer.Type == p_Interface.CHAR {

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

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")

				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
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
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER || retornoIzq.Type == p_Interface.CHAR && retornoDer.Type == p_Interface.CHAR {

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

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
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
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER || retornoIzq.Type == p_Interface.CHAR && retornoDer.Type == p_Interface.CHAR {

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

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Mayo_Menor_Igual_String")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
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
				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
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

			} else if retornoIzq.Type == p_Interface.CHAR && retornoDer.Type == p_Interface.CHAR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")

				generador.AddIf(retornoIzq.Valor, retornoDer.Valor, p.Operador, trueLabel)
				generador.AddGoTo(falseLabel)
				return p_Interface.Value{
					Valor:        "",
					IsTemp:       false,
					Type:         p_Interface.BOOLEAN,
					TrueLabel:    trueLabel,
					FalseLabel:   falseLabel,
					IsRelacional: true,
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
			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER || retornoIzq.Type == p_Interface.CHAR && retornoDer.Type == p_Interface.CHAR {

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

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
				return p_Interface.Value{
					Valor:      "",
					IsTemp:     false,
					Type:       p_Interface.BOOLEAN,
					TrueLabel:  trueLabel,
					FalseLabel: falseLabel,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {

				generador.AddComent("INICIO COMPARACION STRING")
				heapIzq := generador.NewTemp()
				heapDer := generador.NewTemp()

				if retornoIzq.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoIzq.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapIzq, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoIzq.IsP == false {
					heapIzq = retornoIzq.Valor
				}

				if retornoDer.IsP {
					generador.AddComent("INICIO STRING")
					runas := []rune(retornoDer.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddExpression(heapDer, "H", "", "")
					for i := 0; i < len(ascii); i++ {
						generador.AddHeap("H", strconv.Itoa(ascii[i]))
						generador.AddExpression("H", "H", "1", "+")
					}
					generador.AddHeap("H", "-1")
					generador.AddExpression("H", "H", "1", "+")
					generador.AddComent("FINAL STRING")
				} else if retornoDer.IsP == false {
					heapDer = retornoDer.Valor
				}

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, heapIzq)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, heapDer)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "0", "==", trueLabel)
				generador.AddGoTo(falseLabel)
				generador.AddComent("FINAL COMPARACION STRING")
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

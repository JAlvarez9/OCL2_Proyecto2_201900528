package Operacion

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"strconv"
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
	generador.AddComent("Inicio Aritmetico")
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
					IsArit:     true,
				}

			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STR {

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
				}
				if retornoIzq.IsCV || retornoIzq.IsArit {
					heapIzq = retornoIzq.Valor
				}
				if retornoDer.IsCV || retornoDer.IsArit {
					heapDer = retornoDer.Valor
				}
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin2, "P", "1", "+")
				generador.AddStack(temporalin2, heapIzq)
				generador.AddExpression(temporalin3, "P", "2", "+")
				generador.AddStack(temporalin3, heapDer)
				generador.Bring_Func("Native_Concat_Str")
				generador.AddExpression(temporalin1, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")

				return p_Interface.Value{
					Valor:      temporalin1,
					IsTemp:     true,
					Type:       p_Interface.STR,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}

			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STRING {
				generador.AddComent("INICIO CONCAT STRING")
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
				}
				if retornoIzq.IsCV || retornoIzq.IsArit {
					heapIzq = retornoIzq.Valor
				}
				if retornoDer.IsCV || retornoDer.IsArit {
					heapDer = retornoDer.Valor
				}
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin2, "P", "1", "+")
				generador.AddStack(temporalin2, heapIzq)
				generador.AddExpression(temporalin3, "P", "2", "+")
				generador.AddStack(temporalin3, heapDer)
				generador.Bring_Func("Native_Concat_Str")
				generador.AddExpression(temporalin1, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddComent("FIN CONCAT STRING")
				return p_Interface.Value{
					Valor:      temporalin1,
					IsTemp:     true,
					Type:       p_Interface.STRING,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.STR && retornoDer.Type == p_Interface.STRING {
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
				}
				if retornoIzq.IsCV || retornoIzq.IsArit {
					heapIzq = retornoIzq.Valor
				}
				if retornoDer.IsCV || retornoDer.IsArit {
					heapDer = retornoDer.Valor
				}
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin2, "P", "1", "+")
				generador.AddStack(temporalin2, heapIzq)
				generador.AddExpression(temporalin3, "P", "2", "+")
				generador.AddStack(temporalin3, heapDer)
				generador.Bring_Func("Native_Concat_Str")
				generador.AddExpression(temporalin1, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				return p_Interface.Value{
					Valor:      temporalin1,
					IsTemp:     true,
					Type:       p_Interface.STRING,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.STRING && retornoDer.Type == p_Interface.STR {
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
				}
				if retornoIzq.IsCV || retornoIzq.IsArit {
					heapIzq = retornoIzq.Valor
				}
				if retornoDer.IsCV || retornoDer.IsArit {
					heapDer = retornoDer.Valor
				}
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin2, "P", "1", "+")
				generador.AddStack(temporalin2, heapIzq)
				generador.AddExpression(temporalin3, "P", "2", "+")
				generador.AddStack(temporalin3, heapDer)
				generador.Bring_Func("Native_Concat_Str")
				generador.AddExpression(temporalin1, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				return p_Interface.Value{
					Valor:      temporalin1,
					IsTemp:     true,
					Type:       p_Interface.STRING,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "+")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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
					generador.AddExpression(newTemp, "", retornoIzq.Valor, "-")
					return p_Interface.Value{
						Valor:      newTemp,
						IsTemp:     true,
						Type:       p_Interface.INTEGER,
						TrueLabel:  "",
						FalseLabel: "",
						IsArit:     true,
					}
				} else if retornoIzq.Type == p_Interface.FLOAT {
					generador.AddExpression(newTemp, "", retornoIzq.Valor, "-")
					return p_Interface.Value{
						Valor:      newTemp,
						IsTemp:     true,
						Type:       p_Interface.FLOAT,
						TrueLabel:  "",
						FalseLabel: "",
						IsArit:     true,
					}
				}
			}

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "-")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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
					IsArit:     true,
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
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "*")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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

				errorLabel := generador.NewLabel()
				noErrorLabel := generador.NewLabel()
				resultado := generador.NewTemp()
				final := generador.NewLabel()
				generador.AddIf(retornoDer.Valor, "0", "==", errorLabel)
				generador.AddGoTo(noErrorLabel)
				generador.AddLabel(errorLabel)
				generador.Bring_Func("Native_Print_MathError")
				generador.AddExpression(resultado, "0", "", "")
				generador.AddGoTo(final)
				generador.AddLabel(noErrorLabel)
				generador.AddExpression(resultado, retornoIzq.Valor, retornoDer.Valor, "/")
				generador.AddLabel(final)
				return p_Interface.Value{
					Valor:      resultado,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {

				sup3, _ := strconv.ParseFloat(retornoDer.Valor, 8)

				if sup3 == 0.0 {
					return p_Interface.Value{
						Valor:      newTemp,
						IsTemp:     true,
						Type:       p_Interface.NULL,
						TrueLabel:  "",
						FalseLabel: "",
						IsArit:     true,
					}
				}

				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.USIZE && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.USIZE {
				generador.AddExpression(newTemp, retornoIzq.Valor, retornoDer.Valor, "/")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.USIZE,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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
					IsArit:     true,
				}
			}
		}
	case "pow":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				labelsito1 := generador.NewLabel()
				labelsito2 := generador.NewLabel()
				temporalin0 := generador.NewTemp()
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()

				generador.AddIf(retornoDer.Valor, "0", "==", labelsito1)
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, retornoIzq.Valor)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, retornoDer.Valor)
				generador.Bring_Func("Native_Pot_NumEnteros")
				generador.AddExpression(temporalin0, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddGoTo(labelsito2)
				generador.AddLabel(labelsito1)
				generador.AddExpression(temporalin0, "1", "", "")
				generador.AddLabel(labelsito2)

				return p_Interface.Value{
					Valor:      temporalin0,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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
					IsArit:     true,
				}
			}
		}
	case "powf":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				labelsito1 := generador.NewLabel()
				labelsito2 := generador.NewLabel()
				temporalin0 := generador.NewTemp()
				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()

				generador.AddIf(retornoDer.Valor, "0", "==", labelsito1)
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				generador.AddStack(temporalin1, retornoIzq.Valor)
				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, retornoDer.Valor)
				generador.Bring_Func("Native_Pot_NumEnteros")
				generador.AddExpression(temporalin0, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddGoTo(labelsito2)
				generador.AddLabel(labelsito1)
				generador.AddExpression(temporalin0, "1", "", "")
				generador.AddLabel(labelsito2)
				return p_Interface.Value{
					Valor:      temporalin0,
					IsTemp:     true,
					Type:       p_Interface.FLOAT,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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
					IsArit:     true,
				}
			}
		}
	case "%":
		{
			//dominante = resta_mul_pot_mod_dominante[retornoIzq.Type][retornoDer.Type]

			if retornoIzq.Type == p_Interface.INTEGER && retornoDer.Type == p_Interface.INTEGER {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "%")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
				}
			} else if retornoIzq.Type == p_Interface.FLOAT && retornoDer.Type == p_Interface.FLOAT {
				generador.AddExpression(newTemp, "(int)"+retornoIzq.Valor, "(int)"+retornoDer.Valor, "%")
				return p_Interface.Value{
					Valor:      newTemp,
					IsTemp:     true,
					Type:       p_Interface.INTEGER,
					TrueLabel:  "",
					FalseLabel: "",
					IsArit:     true,
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
					IsArit:     true,
				}
			}
		}
	}
	generador.AddComent("Final Aritmetico")
	return result
}

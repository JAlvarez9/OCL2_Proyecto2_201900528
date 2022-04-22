package match

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interfaces "LAB1/Clases/interfaces"
	"fmt"
	"strconv"

	arrayList "github.com/colegno/arraylist"
)

type Match struct {
	Expresion    p_Interfaces.Expresion
	Bloque_Cases *arrayList.List
	Default      p_Interfaces.Instruction
	Linea        int
	Columna      int
}

func NewMatch(exp p_Interfaces.Expresion, bloque_cases *arrayList.List, defaul p_Interfaces.Instruction, line int, colu int) Match {
	match := Match{
		Expresion:    exp,
		Bloque_Cases: bloque_cases,
		Default:      defaul,
		Linea:        line,
		Columna:      colu,
	}
	return match
}

func (p Match) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	generador.AddComent("INICIO MATCH")
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	defaultLabel := generador.NewLabel()
	exitLabel := generador.NewLabel()
	var tempHeapM string
	if result.IsP {
		if result.Type == p_Interfaces.INTEGER || result.Type == p_Interfaces.FLOAT {
			generador.ExpMatch = result
		} else if result.Type == p_Interfaces.STR || result.Type == p_Interfaces.STRING {
			tempHeapM = generador.NewTemp()
			runs := []rune(result.Valor)
			var val_Ascci []int

			for i := 0; i < len(runs); i++ {
				val_Ascci = append(val_Ascci, int(runs[i]))
			}

			generador.AddExpression(tempHeapM, "H", "", "")
			for _, s := range val_Ascci {
				generador.AddHeap("H", fmt.Sprintf("%v", s))
				generador.AddExpression("H", "H", "1", "+")
			}
			generador.AddHeap("H", "-1")
			generador.AddExpression("H", "H", "1", "+")
		} else if result.Type == p_Interfaces.BOOLEAN {
			if result.Valor == "true" {
				result.Valor = "1"
			} else if result.Valor == "false" {
				result.Valor = "0"
			}
		}
	}
	if result.IsCV || result.IsArit {
		generador.ExpMatch = result
	}

	if result.IsRelacional || result.IsLog {

	}

	for _, instr := range p.Bloque_Cases.ToArray() {
		generador.AddComent("INICIO BRAZO")
		a := instr.(Brazo).Expresiones
		trueLabel := generador.NewLabel()
		falseLabel := generador.NewLabel()
		for _, brazin := range a.ToArray() {

			bra := brazin.(p_Interfaces.Expresion)
			sup := bra.Ejecutar(controlador, generador, env, env_uni)

			if sup.Type == p_Interfaces.INTEGER || sup.Type == p_Interfaces.FLOAT {
				generador.AddIf(generador.ExpMatch.(p_Interfaces.Value).Valor, sup.Valor, "==", trueLabel)
				generador.AddGoTo(falseLabel)
			} else if sup.Type == p_Interfaces.STR || sup.Type == p_Interfaces.STRING {
				runs := []rune(sup.Valor)
				var val_Ascci []int

				for i := 0; i < len(runs); i++ {
					val_Ascci = append(val_Ascci, int(runs[i]))
				}
				tmpBra := generador.NewTemp()
				generador.AddExpression(tmpBra, "H", "", "")
				for _, s := range val_Ascci {
					generador.AddHeap("H", fmt.Sprintf("%v", s))
					generador.AddExpression("H", "H", "1", "+")
				}
				generador.AddHeap("H", "-1")
				generador.AddExpression("H", "H", "1", "+")

				temporalin1 := generador.NewTemp()
				temporalin2 := generador.NewTemp()
				temporalin3 := generador.NewTemp()

				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "+")
				generador.AddExpression(temporalin1, "P", "1", "+")
				if result.IsCV {
					generador.AddStack(temporalin1, result.Valor)
				} else {
					generador.AddStack(temporalin1, tempHeapM)
				}

				generador.AddExpression(temporalin2, "P", "2", "+")
				generador.AddStack(temporalin2, tmpBra)
				generador.Bring_Func("Native_Compare_Strings")
				generador.AddExpression(temporalin3, "STACK[(int)P]", "", "")
				generador.AddExpression("P", "P", strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), "-")
				generador.AddIf(temporalin3, "1", "==", trueLabel)
				generador.AddGoTo(falseLabel)
			} else if sup.Type == p_Interfaces.BOOLEAN {
				if sup.Valor == "true" {
					sup.Valor = "1"
				} else if sup.Valor == "false" {
					sup.Valor = "0"
				}
				generador.AddIf(result.Valor, sup.Valor, "==", trueLabel)
				generador.AddGoTo(falseLabel)
			}

		}
		generador.AddLabel(trueLabel)
		instr.(p_Interfaces.Instruction).Ejecutar(controlador, generador, env, env_uni)
		generador.AddGoTo(exitLabel)

		generador.AddLabel(falseLabel)

		generador.AddComent("FINAL BRAZO")
	}

	generador.AddComent("INICIO DEFAULT")
	generador.AddLabel(defaultLabel)
	p.Default.Ejecutar(controlador, generador, env, env_uni)
	generador.AddComent("FINAL DEFAULT")
	generador.AddLabel(exitLabel)
	generador.AddComent("FINAL MATCH")
	return result
}

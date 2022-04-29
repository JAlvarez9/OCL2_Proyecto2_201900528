package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"
)

type Declaration struct {
	Id        string
	Tipo      p_Interface.TipoExpresion
	Id_Struct string
	Expresion p_Interface.Expresion
	IsMut     bool
	Line      int
	Columna   int
}

func NewDeclaration(id string, tipo p_Interface.TipoExpresion, id_s string, val p_Interface.Expresion, isMut bool, line int, colu int) Declaration {
	instr := Declaration{
		Id:        id,
		Tipo:      tipo,
		Id_Struct: id_s,
		Expresion: val,
		IsMut:     isMut,
		Line:      line,
		Columna:   colu,
	}
	return instr
}

func (p Declaration) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO DECLARACION")

	if p.Id_Struct != "" {

		generador.AddComent("DECLARACION STRUCT")
		newSym2 := p_Interface.Symbol{
			Id:       p.Id,
			Tipo:     p.Tipo,
			Valor:    p.Id_Struct,
			IsMut:    p.IsMut,
			Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
			Fila:     p.Line,
			Columna:  p.Columna,
			Posicion: env.(p_Enviroment.Enviroment).GetSize(),
		}
		env.(p_Enviroment.Enviroment).SaveVarible(controlador, p.Id, newSym2, p_Interface.STRUCT, p.IsMut, newSym2.Ambito, p_Interface.NEUTRAL, p.Line, p.Columna)
		env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, p.Id, newSym2, p_Interface.STRUCT, p.IsMut, newSym2.Ambito, p.Line, p.Columna)
		//temporalin1 := generador.NewTemp()
		result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)

		a := fmt.Sprintf("%v", newSym2.Posicion)
		temporalin := generador.NewTemp()
		generador.AddExpression(temporalin, "P", a, "+")
		generador.AddStack(temporalin, result.Valor)
		generador.AddComent("FIN DECLARACION STRUCT")
	} else {

		result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
		newSym := p_Interface.Symbol{
			Id:       p.Id,
			Tipo:     p.Tipo,
			Valor:    "",
			IsMut:    p.IsMut,
			Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
			Fila:     p.Line,
			Columna:  p.Columna,
			Posicion: env.(p_Enviroment.Enviroment).GetSize(),
		}
		env.(p_Enviroment.Enviroment).SaveVarible(controlador, p.Id, newSym, p.Tipo, p.IsMut, newSym.Ambito, p_Interface.NEUTRAL, p.Line, p.Columna)
		env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, p.Id, newSym, p.Tipo, p.IsMut, newSym.Ambito, p.Line, p.Columna)

		if result.Type == p_Interface.INTEGER || result.Type == p_Interface.FLOAT || result.Type == p_Interface.USIZE {
			a := fmt.Sprintf("%v", newSym.Posicion)
			temporalin := generador.NewTemp()
			generador.AddExpression(temporalin, "P", a, "+")
			generador.AddStack(temporalin, result.Valor)
		} else if result.Type == p_Interface.STR || result.Type == p_Interface.STRING {

			if !result.IsP {
				temporalin2 := generador.NewTemp()
				generador.AddExpression(temporalin2, "P", strconv.Itoa(newSym.Posicion), "+")
				generador.AddStack(temporalin2, result.Valor)
			} else {

				runas := []rune(result.Valor)
				var ascii []int

				for i := 0; i < len(runas); i++ {
					ascii = append(ascii, int(runas[i]))
				}
				temporalin := generador.NewTemp()
				generador.AddExpression(temporalin, "H", "", "")
				for i := 0; i < len(ascii); i++ {
					generador.AddHeap("H", strconv.Itoa(ascii[i]))
					generador.AddExpression("H", "H", "1", "+")
				}
				generador.AddHeap("H", "-1")
				generador.AddExpression("H", "H", "1", "+")
				temporalin2 := generador.NewTemp()
				generador.AddExpression(temporalin2, "P", strconv.Itoa(newSym.Posicion), "+")
				generador.AddStack(temporalin2, temporalin)
			}

		} else if result.Type == p_Interface.BOOLEAN {
			// TENGO QUE HACER QUE GUARDE UN BOOLEAN
			if result.IsP {
				if result.Valor == "true" {
					a := fmt.Sprintf("%v", newSym.Posicion)
					temporalin := generador.NewTemp()
					generador.AddExpression(temporalin, "P", a, "+")
					generador.AddStack(temporalin, "1")
				} else if result.Valor == "false" {
					a := fmt.Sprintf("%v", newSym.Posicion)
					temporalin := generador.NewTemp()
					generador.AddExpression(temporalin, "P", a, "+")
					generador.AddStack(temporalin, "0")
				}
			} else {
				a := fmt.Sprintf("%v", newSym.Posicion)
				temporalin := generador.NewTemp()
				generador.AddExpression(temporalin, "P", a, "+")
				generador.AddStack(temporalin, result.Valor)
			}

		} else if result.Type == p_Interface.CHAR {

			if !result.IsP {
				temporalin2 := generador.NewTemp()
				generador.AddExpression(temporalin2, "P", strconv.Itoa(newSym.Posicion), "+")
				generador.AddStack(temporalin2, result.Valor)
			} else {

				runas := []rune(result.Valor)
				var ascii []int

				for i := 0; i < len(runas); i++ {
					ascii = append(ascii, int(runas[i]))
				}

				a := fmt.Sprintf("%v", newSym.Posicion)
				temporalin := generador.NewTemp()
				generador.AddExpression(temporalin, "P", a, "+")
				generador.AddStack(temporalin, strconv.Itoa(ascii[0]))
			}

		}
	}

	generador.Valor_Return_Expre = ""
	generador.AddComent("FINAL DECLARACION")
	return result
}

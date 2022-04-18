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
	Expresion p_Interface.Expresion
	IsMut     bool
	Line      int
	Columna   int
}

func NewDeclaration(id string, tipo p_Interface.TipoExpresion, val p_Interface.Expresion, isMut bool, line int, colu int) Declaration {
	instr := Declaration{
		Id:        id,
		Tipo:      tipo,
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

	if result.Type == p_Interface.INTEGER || result.Type == p_Interface.FLOAT {
		a := fmt.Sprintf("%v", newSym.Posicion)
		temporalin := generador.NewTemp()
		generador.AddExpression(temporalin, "P", a, "+")
		generador.AddStack(temporalin, result.Valor)
	} else if result.Type == p_Interface.STR || result.Type == p_Interface.STRING {
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
	generador.AddComent("FINAL DECLARACION")
	return result
}

package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
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

	a := fmt.Sprintf("%v", newSym.Posicion)
	temporalin := generador.NewTemp()
	generador.AddExpression(temporalin, "P", a, "+")
	generador.AddStack(temporalin, result.Valor)
	return result
}

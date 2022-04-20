package sentenciaciclica

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"

	arrayList "github.com/colegno/arraylist"
)

type ForIn struct {
	Id_Variable  string
	Expr_Inicial p_Interface.Expresion
	Expr_Final   p_Interface.Expresion
	Expr_Vector  p_Interface.Expresion
	Bloque_ForIn *arrayList.List
	Linea        int
	Columna      int
}

func NewForIn(id string, ini p_Interface.Expresion, fin p_Interface.Expresion, vec p_Interface.Expresion, bloq *arrayList.List, line int, colu int) ForIn {
	forini := ForIn{
		Id_Variable:  id,
		Expr_Inicial: ini,
		Expr_Final:   fin,
		Expr_Vector:  vec,
		Bloque_ForIn: bloq,
		Linea:        line,
		Columna:      colu,
	}
	return forini
}

func (p ForIn) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO FOR IN")
	if p.Expr_Inicial != nil && p.Expr_Final != nil {
		var inicio p_Interface.Value = p.Expr_Inicial.Ejecutar(controlador, generador, env, env_uni)
		var final p_Interface.Value = p.Expr_Final.Ejecutar(controlador, generador, env, env_uni)
		newSym := p_Interface.Symbol{
			Id:       p.Id_Variable,
			Tipo:     inicio.Type,
			Valor:    "",
			IsMut:    true,
			Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
			Fila:     p.Linea,
			Columna:  p.Columna,
			Posicion: env.(p_Enviroment.Enviroment).GetSize(),
		}
		b := fmt.Sprintf("%v", newSym.Posicion)
		temporalin2 := generador.NewTemp()
		generador.AddExpression(temporalin2, "P", b, "+")
		generador.AddStack(temporalin2, inicio.Valor)
		env.(p_Enviroment.Enviroment).SaveVarible(controlador, p.Id_Variable, newSym, inicio.Type, true, newSym.Ambito, p_Interface.NEUTRAL, p.Linea, p.Columna)
		initialLabel := generador.NewLabel()
		finalLabel := generador.NewLabel()
		trueLabel := generador.NewLabel()
		tempIf := generador.NewTemp()
		LabelJustPlus := generador.NewLabel()
		generador.AddBreakList(finalLabel)
		generador.AddContinueList(LabelJustPlus)
		generador.AddLabel(initialLabel)
		generador.AddExpression(tempIf, "STACK[(int)"+strconv.Itoa(newSym.Posicion)+"]", "", "")
		generador.AddIf(tempIf, final.Valor, "<", trueLabel)
		generador.AddGoTo(finalLabel)

		generador.AddLabel(trueLabel)
		for _, s := range p.Bloque_ForIn.ToArray() {
			s.(p_Interface.Instruction).Ejecutar(controlador, generador, env, env_uni)
		}
		temporalin := generador.NewTemp()
		//a := fmt.Sprintf("%v", inicio.Simbolin.Posicion)
		supp := env.(p_Enviroment.Enviroment).GetVariable(controlador, p.Id_Variable, p.Linea, p.Columna)
		temp2 := generador.NewTemp()
		generador.AddExpression(temporalin, "P", strconv.Itoa(supp.Posicion), "+")
		generador.AddExpression(temp2, "STACK[(int)"+temporalin+"]", "", "")
		generador.AddStack(temporalin, temp2+"+ 1")
		generador.AddGoTo(initialLabel)
		generador.AddLabel(LabelJustPlus)
		tempJustPlus := generador.NewTemp()
		//aa := fmt.Sprintf("%v", inicio.Simbolin.Posicion)
		temp3 := generador.NewTemp()
		generador.AddExpression(tempJustPlus, "P", strconv.Itoa(supp.Posicion), "+")
		generador.AddExpression(temp3, "STACK[(int)"+tempJustPlus+"]", "", "")
		generador.AddStack(tempJustPlus, temp3+"+ 1")
		generador.AddGoTo(initialLabel)
		generador.AddLabel(finalLabel)
		generador.QuitLastBreak()
		generador.QuitLastContinue()
	}
	generador.AddComent("FIN FOR IN")
	return result
}

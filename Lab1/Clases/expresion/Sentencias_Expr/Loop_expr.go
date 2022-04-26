package sentenciasexpr

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Loop_expr struct {
	Bloque_Loop *arrayList.List
	Linea       int
	Columna     int
}

func NewLoop_expr(bloque *arrayList.List, line int, colu int) Loop_expr {
	lopsito := Loop_expr{
		Bloque_Loop: bloque,
		Linea:       line,
		Columna:     colu,
	}

	return lopsito
}

func (p Loop_expr) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	//var result p_Interfaces.Value
	var regreso p_Interfaces.Value
	generador.AddComent("INICIO LOOP-EXPRESION")
	initalLabel := generador.NewLabel()
	finalLabel := generador.NewLabel()
	resultTemp := generador.NewTemp()
	if generador.Valor_Return_Expre == "" {
		resultTemp = generador.NewTemp()
		generador.Valor_Return_Expre = resultTemp
	} else {
		resultTemp = generador.Valor_Return_Expre
	}
	regreso.Valor = resultTemp
	generador.AddBreakList(finalLabel)
	generador.AddLabel(initalLabel)
	for _, s := range p.Bloque_Loop.ToArray() {
		a := s.(p_Interfaces.Instruction).Ejecutar(controlador, generador, env, env_uni)
		fmt.Println(a.Type)
	}
	generador.AddGoTo(initalLabel)
	generador.AddLabel(finalLabel)

	generador.QuitLastBreak()
	generador.AddComent("FIN LOOP-EXPRESION")
	return regreso
}

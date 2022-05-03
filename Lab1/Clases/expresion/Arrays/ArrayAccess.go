package arrays

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type ArrayAccess struct {
	Array   p_Interface.Expresion
	Index   p_Interface.Expresion
	Linea   int
	Columna int
}

func NewArrayAccess(arr p_Interface.Expresion, ind p_Interface.Expresion, line int, colu int) ArrayAccess {
	arraysito := ArrayAccess{
		Array:   arr,
		Index:   ind,
		Linea:   line,
		Columna: colu,
	}
	return arraysito
}

func (p ArrayAccess) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO CALL ARRAY/VECTOR")
	arraysito := p.Array.Ejecutar(controlador, generador, env, env_uni)
	index_arr := p.Index.Ejecutar(controlador, generador, env, env_uni)
	labelsito1 := generador.NewLabel()
	labelsito2 := generador.NewLabel()
	labelsito3 := generador.NewLabel()
	temporalin1 := generador.NewTemp()
	temporalin2 := generador.NewTemp()
	temporalin3 := generador.NewTemp()
	generador.AddIf(arraysito.Valor, "-1", "==", labelsito1)
	generador.AddExpression(temporalin1, arraysito.Valor, "", "")
	generador.AddExpression(temporalin2, "HEAP[(int)"+temporalin1+"]", "", "")
	generador.AddIf(index_arr.Valor, temporalin2, ">=", labelsito2)
	generador.AddExpression(temporalin1, temporalin1, "1", "+")
	generador.AddExpression(temporalin1, temporalin1, index_arr.Valor, "+")
	generador.AddExpression(temporalin3, "HEAP[(int)"+temporalin1+"]", "", "")
	generador.AddIf(temporalin3, "-415", "==", labelsito1)
	generador.AddGoTo(labelsito3)
	generador.AddLabel(labelsito1)
	generador.Bring_Func("Native_Print_Null")
	generador.AddExpression(temporalin3, "-1", "", "")
	generador.AddGoTo(labelsito3)
	generador.AddLabel(labelsito2)
	generador.Bring_Func("Native_Out_Range")
	generador.AddExpression(temporalin3, "-1", "", "")
	generador.AddLabel(labelsito3)
	generador.AddComent("FIN CALL ARRAY/VECTOR")
	result.Type = arraysito.Type
	result.Simbolin.Tipo = arraysito.Type
	result.Valor = temporalin3
	result.IsCV = true
	return result
}

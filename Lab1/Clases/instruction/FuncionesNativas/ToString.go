package funcionesnativas

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interfaces "LAB1/Clases/interfaces"
)

type ToString struct {
	Valor   p_Interfaces.Expresion
	Line    int
	Columna int
}

func NewToString(valo p_Interfaces.Expresion, fila int, colu int) ToString {
	tochari := ToString{
		Valor:   valo,
		Line:    fila,
		Columna: colu,
	}
	return tochari
}

func (p ToString) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value

	result = p.Valor.Ejecutar(controlador, generador, env, env_uni)
	if result.Type == p_Interfaces.STR || result.Type == p_Interfaces.STRING {
		result.Type = p_Interfaces.STRING
		return result
	} else {
		err := p_Errores.NewError("No es de tipo &str para reazliar to_string", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Columna)
		controlador.Errores.Add(err)
		controlador.Agregar_Consola("No es de tipo &str para realizar to_string")
		var a p_Interfaces.Value
		return a
	}

	return result
}

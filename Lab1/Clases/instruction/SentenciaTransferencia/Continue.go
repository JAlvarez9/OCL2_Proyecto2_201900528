package sentenciatransferencia

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type Continue struct {
	Line    int
	Columna int
}

func NewContinue(line int, colu int) Continue {
	breakisto := Continue{
		Line:    line,
		Columna: colu,
	}
	return breakisto
}

func (p Continue) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value = p_Interfaces.Value{
		Valor:      "",
		IsTemp:     true,
		Type:       p_Interfaces.CONTINUE,
		TrueLabel:  "",
		FalseLabel: "",
	}
	generador.AddComent("INICIO CONTINUE")
	generador.AddGoTo(generador.GetLastContinue())
	generador.AddComent("FIN CONTINUE")
	return result
}

package casteos

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"
)

type Casteo struct {
	Valor   p_Interfaces.Expresion
	Tipo    p_Interfaces.TipoExpresion
	Linea   int
	Columna int
}

func NewCasteo(val p_Interfaces.Expresion, tip p_Interfaces.TipoExpresion, line int, colu int) Casteo {
	casteito := Casteo{
		Valor:   val,
		Tipo:    tip,
		Linea:   line,
		Columna: colu,
	}
	return casteito
}

func (p Casteo) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	return result
}

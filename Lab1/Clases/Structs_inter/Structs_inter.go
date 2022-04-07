package structsinter

import (
	p_Interface "LAB1/Clases/interfaces"
)

type Atributos_Struct struct {
	Id    string
	Valor p_Interface.Symbol
}

type Array_type struct {
	Tipo      p_Interface.TipoExpresion
	Size      p_Interface.Expresion
	Array_Son *Array_type
}

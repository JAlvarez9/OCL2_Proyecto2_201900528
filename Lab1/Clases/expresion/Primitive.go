package expresion

import (
	p_Controlador "LAB1/Clases/Controlador"
	"fmt"

	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
)

type Primitivo struct {
	Valor interface{}
	Tipo  p_Interface.TipoExpresion
}

func NewPrimitivo(val interface{}, tipo p_Interface.TipoExpresion) Primitivo {
	exp := Primitivo{val, tipo}
	return exp
}

func (p Primitivo) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {

	soportin := p_Interface.Value{
		Valor:      fmt.Sprintf("%v", p.Valor),
		IsTemp:     false,
		Type:       p.Tipo,
		TrueLabel:  "",
		FalseLabel: "",
	}

	if soportin.Type == p_Interface.BOOLEAN {
		trueLabel := generador.NewLabel()
		falseLabel := generador.NewLabel()

		soportin.TrueLabel = trueLabel
		soportin.FalseLabel = falseLabel
	}

	return soportin

}

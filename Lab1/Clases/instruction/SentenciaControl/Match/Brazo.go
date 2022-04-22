package match

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Brazo struct {
	Expresiones  *arrayList.List
	Bloque_Brazo *arrayList.List
	Linea        int
	Columna      int
}

func NewBrazo(exp *arrayList.List, bloque *arrayList.List, line int, colum int) Brazo {
	brazito := Brazo{
		Expresiones:  exp,
		Bloque_Brazo: bloque,
		Linea:        line,
		Columna:      colum,
	}
	return brazito
}

func (p Brazo) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value

	for _, a := range p.Bloque_Brazo.ToArray() {
		a.(p_Interfaces.Instruction).Ejecutar(controlador, generador, env, env_uni)
	}

	return result
}

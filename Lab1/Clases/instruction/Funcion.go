package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Funcion struct {
	Id             string
	Lista_Para     *arrayList.List
	Tipo           p_Interface.TipoExpresion
	Bloque_funcion *arrayList.List
	Line           int
	Columna        int
}

func NewFuncion(id string, paras *arrayList.List, tipito p_Interface.TipoExpresion, bloq *arrayList.List, line int, colu int) Funcion {
	funcioncita := Funcion{
		Id:             id,
		Lista_Para:     paras,
		Tipo:           tipito,
		Bloque_funcion: bloq,
		Line:           line,
		Columna:        colu,
	}
	return funcioncita
}

func (p Funcion) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	tempEnv := p_Enviroment.NewEnviroment(env)
	if p.Id != "main" {
		generador.SetisFuncTrue()
		generador.Ini_func("void", p.Id)
	}
	for _, s := range p.Bloque_funcion.ToArray() {
		s.(p_Interface.Expresion).Ejecutar(controlador, generador, tempEnv, env_uni)
	}
	if p.Id != "main" {
		generador.Finish_func()
		generador.SetLogicFalse()
	}
	return result
}

/*
func (p Funcion) GuardarFunc(controlador *p_Controlador.Controlador2, env interface{}, env_uni interface{}) {

	a := p_Interface.Symbol{
		Id:    p.Id,
		Valor: p,
	}

	env.(p_Enviroment.Enviroment).SaveVarible(controlador, p.Id, a, p.Tipo, false, env.(p_Enviroment.Enviroment).HaveFatha(), p_Interface.NEUTRAL, p.Line, p.Columna)
	env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, p.Id, a, p.Tipo, false, env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Columna)

}
*/

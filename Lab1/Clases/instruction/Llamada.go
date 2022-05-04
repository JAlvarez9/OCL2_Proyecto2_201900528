package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Llamada struct {
	Id            string
	Bloque_params *arrayList.List
	Linea         int
	Columna       int
}

func NewLlamada(id string, params *arrayList.List, line int, colu int) Llamada {
	llamadita := Llamada{
		Id:            id,
		Bloque_params: params,
		Linea:         line,
		Columna:       colu,
	}
	return llamadita
}

func (p Llamada) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value

	generador.Bring_Func(p.Id)

	return result
}

/*
func ChaeckParams(params_llama *arrayList.List, params_func *arrayList.List, controlador *p_Controlador.Controlador2, env interface{}, line int, colu int, env_uni interface{}) bool {

	if params_llama.Len() == params_func.Len() {
		for i, s_ll := range params_llama.ToArray() {

			var a p_Interface.Symbol

			if reflect.TypeOf(s_ll).String() == "interfaces.Symbol" {
				a = env.(p_Enviroment.Enviroment).GetVariable(controlador, s_ll.(p_Interface.Symbol).Id, line, colu)
			} else {
				a = s_ll.(p_Interface.Expresion).Ejecutar(controlador, env, env_uni)
			}

			if a.Tipo == params_func.GetValue(i).(p_Interface.Symbol).Tipo {
				//fmt.Println(a.Tipo == params_func.GetValue(i).(p_Interface.Symbol).Tipo)
				simbolin := p_Interface.Symbol{
					Id:      params_func.GetValue(i).(p_Interface.Symbol).Id,
					Tipo:    params_func.GetValue(i).(p_Interface.Symbol).Tipo,
					Valor:   a.Valor,
					IsMut:   a.IsMut,
					Ambito:  a.Ambito,
					Fila:    line,
					Columna: colu,
				}

				env.(p_Enviroment.Enviroment).SaveVarible(controlador, simbolin.Id, simbolin, simbolin.Tipo, simbolin.IsMut, simbolin.Ambito, p_Interface.NEUTRAL, simbolin.Fila, simbolin.Columna)
				env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, simbolin.Id, simbolin, simbolin.Tipo, simbolin.IsMut, simbolin.Ambito, simbolin.Fila, simbolin.Columna)

			}

		}

		return true
	} else {
		err := p_Errores.NewError("Los parametros no concuerdan con la cantidad de la función", env.(p_Enviroment.Enviroment).HaveFatha(), line, colu)
		controlador.Errores.Add(err)
		controlador.Agregar_Consola("Los parametros no concuerdan con la cantidad de la función")
	}

	return false

}
*/

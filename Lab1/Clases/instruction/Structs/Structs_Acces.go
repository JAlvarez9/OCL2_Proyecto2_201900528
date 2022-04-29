package structs

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"reflect"
	"strconv"

	"github.com/colegno/arraylist"
)

type Struct_Acces struct {
	Id_Struct   p_Interface.Expresion
	Id_Atributo string
	Linea       int
	Columna     int
}

func NewStruct_Acces(idS p_Interface.Expresion, idA string, line int, colu int) Struct_Acces {
	structsito := Struct_Acces{
		Id_Struct:   idS,
		Id_Atributo: idA,
		Linea:       line,
		Columna:     colu,
	}
	return structsito
}

func (p Struct_Acces) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	generador.AddComent("INICIO ACCES STRUCT")
	result = p.Id_Struct.Ejecutar(controlador, generador, env, env_uni)
	var id_s string
	if reflect.TypeOf(result.Simbolin.Valor.(p_Interface.Symbol).Valor).String() != "*arraylist.List" {
		id_s = result.Simbolin.Valor.(p_Interface.Symbol).Valor.(string)
	} else {
		id_s = result.Simbolin.Valor.(p_Interface.Symbol).Id
		result.Type = p_Interface.INTEGER
	}

	structsito := env.(p_Enviroment.Enviroment).GetStruct(controlador, id_s, p.Linea, p.Columna)
	for i, s := range structsito.Valor.(*arraylist.List).ToArray() {
		if p.Id_Atributo == s.(p_Interface.Symbol).Id {

			if s.(p_Interface.Symbol).Tipo == p_Interface.STRUCT {
				result.Simbolin = s.(p_Interface.Symbol)
				result.Simbolin.Posicion = result.Simbolin.Posicion + i + 1
				break
			}
			a := strconv.Itoa(result.Simbolin.Posicion + i + 1)
			result.Simbolin = s.(p_Interface.Symbol)
			result.Type = s.(p_Interface.Symbol).Tipo
			sup2 := generador.NewTemp()
			generador.AddExpression(sup2, "STACK[(int)"+a+"]", "", "")
			result.Valor = sup2
			result.IsCV = true
			break
		}
	}
	generador.AddComent("FIN ACCES STRUCT")
	return result
}

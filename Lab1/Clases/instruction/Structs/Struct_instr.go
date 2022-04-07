package structs

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Struct struct {
	Id              string
	Lista_Atributos *arrayList.List
	Linea           int
	Columna         int
}

func NewStruct(id string, list *arrayList.List, line int, colu int) Struct {
	structsito := Struct{
		Id:              id,
		Lista_Atributos: list,
		Linea:           line,
		Columna:         colu,
	}
	return structsito
}

func (p Struct) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	return result
}

/*
func (p Struct) GuardarStruct(controlador *p_Controlador.Controlador2, env interface{}) {

	var a bool = false
	var sup2 string
	var sup = arrayList.New()
	for _, s := range p.Lista_Atributos.ToArray() {
		if s.(p_Interface.Symbol).Tipo == p_Interface.STRUCT {
			sup2 = s.(p_Interface.Symbol).Valor.(string)
			a = true
			b := env.(p_Enviroment.Enviroment).GetStruct(controlador, sup2, p.Linea, p.Columna)
			var sup3 = p_Interface.Symbol{
				Id:      s.(p_Interface.Symbol).Id,
				Tipo:    p_Interface.STRUCT,
				Valor:   b,
				IsMut:   s.(p_Interface.Symbol).IsMut,
				Ambito:  s.(p_Interface.Symbol).Ambito,
				Fila:    s.(p_Interface.Symbol).Fila,
				Columna: s.(p_Interface.Symbol).Columna,
			}
			sup.Add(sup3)
			continue
		}
		sup.Add(s)
	}

	if a == false {
		env.(p_Enviroment.Enviroment).SaveStruct(controlador, p.Id, p.Lista_Atributos, p.Linea, p.Columna)
	} else {
		env.(p_Enviroment.Enviroment).SaveStruct(controlador, p.Id, sup, p.Linea, p.Columna)
	}

}
*/

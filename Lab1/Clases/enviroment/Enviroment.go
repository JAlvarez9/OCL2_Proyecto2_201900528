package enviroment

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	"LAB1/Clases/interfaces"
	"fmt"

	"github.com/colegno/arraylist"
)

type Enviroment struct {
	father   interface{}
	variable map[string]interfaces.Symbol
	structs  map[string]interfaces.Symbol
	modulos  map[string]interfaces.Symbol
	size     map[string]int
}

func NewEnviroment(father interface{}) Enviroment {
	size := make(map[string]int)
	size["size"] = 0
	env := Enviroment{father, make(map[string]interfaces.Symbol), make(map[string]interfaces.Symbol), make(map[string]interfaces.Symbol), size}
	return env
}

func (env Enviroment) GetSize() int {
	return env.size["size"]
}

func (env Enviroment) SaveVarible(controlador *p_Controlador.Controlador2, id string, value interfaces.Symbol, tipo interfaces.TipoExpresion, ismut bool, ambito string, available interfaces.Available, line int, column int) {
	if _, ok := env.variable[id]; ok {

		newErr := p_Errores.NewError("La variable ya existe", env.HaveFatha(), line, column)
		controlador.Errores.Add(newErr)
		controlador.Agregar_Consola("La variable ya existe")
		return
	}
	env.variable[id] = interfaces.Symbol{
		Id:       id,
		Tipo:     tipo,
		Valor:    value,
		IsMut:    ismut,
		Ambito:   ambito,
		Fila:     line,
		Columna:  column,
		Visible:  available,
		Posicion: env.size["size"],
	}
	env.size["size"] = env.size["size"] + 1
}

func (env Enviroment) GetVariable(controlador *p_Controlador.Controlador2, id string, line int, column int) interfaces.Symbol {

	var tmpEnv Enviroment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.variable[id]; ok {
			return variable
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Enviroment)
		}
	}

	err := p_Errores.NewError("La variable no existe", env.HaveFatha(), line, column)
	controlador.Errores.Add(err)
	return interfaces.Symbol{
		Id:   "",
		Tipo: interfaces.NULL,
		Valor: interfaces.Symbol{
			Id:    "",
			Tipo:  interfaces.NULL,
			Valor: 0,
		},
	}
}

func (env Enviroment) ReplaceVec(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, id string, line int, column int, valor interfaces.Expresion, env_uni interface{}) {

	var tmpEnv Enviroment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.variable[id]; ok {
			if variable.IsMut == false {
				err := p_Errores.NewError("La variable no es mutable", env.HaveFatha(), line, column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("La variable no es mutable")
				return

			} else {
				a := valor.Ejecutar(controlador, generador, env, env_uni)
				tmpEnv.variable[id].Valor.(interfaces.Symbol).Valor.(*arraylist.List).Add(a)
				return
			}

		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Enviroment)
		}
	}

	err := p_Errores.NewError("La variable no existe", env.HaveFatha(), line, column)
	controlador.Errores.Add(err)
	controlador.Agregar_Consola("La variable no existe")

}
func (env Enviroment) InsertVec(controlador *p_Controlador.Controlador2, id string, valor interfaces.Expresion, pos interfaces.Expresion, line int, column int, env_uni interface{}) {

}

func (env Enviroment) RemoveVec(controlador *p_Controlador.Controlador2, id string, line int, column int, valor interfaces.Expresion, env_uni interface{}) interfaces.Symbol {
	var result interfaces.Symbol
	return result

}

func (env Enviroment) ContainsVec(controlador *p_Controlador.Controlador2, id string, line int, column int, valor interfaces.Expresion, env_uni interface{}) interfaces.Symbol {

	return interfaces.Symbol{
		Id:      "",
		Tipo:    interfaces.NULL,
		Valor:   "",
		IsMut:   false,
		Ambito:  env.HaveFatha(),
		Fila:    line,
		Columna: column,
	}
}

func (env Enviroment) LenVec(controlador *p_Controlador.Controlador2, id string, line int, column int) interfaces.Symbol {

	var tmpEnv Enviroment
	tmpEnv = env
	sup := interfaces.Symbol{
		Id:      "",
		Tipo:    interfaces.INTEGER,
		Valor:   0,
		IsMut:   false,
		Ambito:  env.HaveFatha(),
		Fila:    line,
		Columna: column,
	}

	for {
		if variable, ok := tmpEnv.variable[id]; ok {

			sup.Valor = variable.Valor.(interfaces.Symbol).Valor.(*arraylist.List).Len()
			return sup

		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Enviroment)
		}
	}

	err := p_Errores.NewError("La variable no existe", env.HaveFatha(), line, column)
	controlador.Errores.Add(err)
	controlador.Agregar_Consola("La variable no existe")

	return sup
}

func (env Enviroment) AlterVariable(controlador *p_Controlador.Controlador2, id string, value interfaces.Symbol, line int, column int) interfaces.Symbol {

	var tmpEnv Enviroment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.variable[id]; ok {
			if variable.IsMut == false {
				//fmt.Println("No es mutable perro")
				err := p_Errores.NewError("La variable no es mutable", env.HaveFatha(), line, column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("La variable no es mutable")
				return interfaces.Symbol{
					Id:   "",
					Tipo: interfaces.NULL,
					Valor: interfaces.Symbol{
						Id:      "",
						Tipo:    interfaces.NULL,
						Valor:   0,
						IsMut:   false,
						Ambito:  "Global",
						Fila:    line,
						Columna: column,
					},
				}
			}
			tmpEnv.variable[id] = interfaces.Symbol{
				Id:      id,
				Tipo:    variable.Tipo,
				Valor:   value,
				IsMut:   true,
				Ambito:  env.HaveFatha(),
				Fila:    line,
				Columna: column,
			}
			return variable
		}
		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Enviroment)
		}
	}
	err := p_Errores.NewError("La variable no existe", env.HaveFatha(), line, column)
	controlador.Errores.Add(err)
	return interfaces.Symbol{
		Id:   "",
		Tipo: interfaces.NULL,
		Valor: interfaces.Symbol{
			Id:    "",
			Tipo:  interfaces.NULL,
			Valor: 0,
		},
	}
}

func (env Enviroment) AlterVariable_AtrStr(controlador *p_Controlador.Controlador2, id string, value interfaces.Symbol, id_atr string, line int, column int) interfaces.Symbol {

	var tmpEnv Enviroment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.variable[id]; ok {
			if variable.IsMut == false {
				//fmt.Println("No es mutable perro")
				err := p_Errores.NewError("La variable no es mutable", env.HaveFatha(), line, column)
				controlador.Errores.Add(err)
				controlador.Agregar_Consola("La variable no es mutable")
				return interfaces.Symbol{
					Id:   "",
					Tipo: interfaces.NULL,
					Valor: interfaces.Symbol{
						Id:      "",
						Tipo:    interfaces.NULL,
						Valor:   0,
						IsMut:   false,
						Ambito:  "Global",
						Fila:    line,
						Columna: column,
					},
				}
			}
			sup := tmpEnv.variable[id]
			list_niuvi := arraylist.New()
			for _, s := range sup.Valor.(interfaces.Symbol).Valor.(*arraylist.List).ToArray() {
				a := s.(interfaces.Symbol)
				if s.(interfaces.Symbol).Id == id_atr {
					a.Valor = value.Valor
				}
				list_niuvi.Add(a)
			}
			fmt.Println("")
			sup2 := interfaces.Symbol{
				Id:      sup.Valor.(interfaces.Symbol).Id,
				Tipo:    sup.Valor.(interfaces.Symbol).Tipo,
				Valor:   list_niuvi,
				IsMut:   sup.Valor.(interfaces.Symbol).IsMut,
				Ambito:  sup.Valor.(interfaces.Symbol).Ambito,
				Fila:    sup.Valor.(interfaces.Symbol).Fila,
				Columna: sup.Valor.(interfaces.Symbol).Columna,
			}

			sup3 := interfaces.Symbol{
				Id:      sup.Id,
				Tipo:    sup.Tipo,
				Valor:   sup2,
				IsMut:   sup.IsMut,
				Ambito:  sup.Ambito,
				Fila:    sup.Fila,
				Columna: sup.Columna,
			}
			tmpEnv.variable[id] = sup3
			return variable
		}
		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Enviroment)
		}
	}
	err := p_Errores.NewError("La variable no existe", env.HaveFatha(), line, column)
	controlador.Errores.Add(err)
	return interfaces.Symbol{
		Id:   "",
		Tipo: interfaces.NULL,
		Valor: interfaces.Symbol{
			Id:    "",
			Tipo:  interfaces.NULL,
			Valor: 0,
		},
	}
}

func (env Enviroment) SaveVarible_Uni(controlador *p_Controlador.Controlador2, id string, value interfaces.Symbol, tipo interfaces.TipoExpresion, ismut bool, ambito string, line int, column int) {

	env.variable[id] = interfaces.Symbol{
		Id:      id,
		Tipo:    tipo,
		Valor:   value,
		IsMut:   ismut,
		Ambito:  ambito,
		Fila:    line,
		Columna: column,
	}
}

func (p Enviroment) HaveFatha() string {
	if p.father != nil {
		return "Local"
	}

	return "Global"
}

func (env Enviroment) SaveStruct(controlador *p_Controlador.Controlador2, id string, list *arraylist.List, line int, colu int) {
	if structs, ok := env.structs[id]; ok {
		a := "El struct " + structs.Id + " ya existe"
		err := p_Errores.NewError(a, env.HaveFatha(), line, colu)
		controlador.Errores.Add(err)
		controlador.Agregar_Consola("El struct " + structs.Id + " ya existe")
	}
	env.structs[id] = interfaces.Symbol{
		Id:      id,
		Tipo:    interfaces.STRUCT,
		Valor:   list,
		IsMut:   true,
		Ambito:  env.HaveFatha(),
		Fila:    line,
		Columna: colu,
	}
}

func (env Enviroment) GetStruct(controlador *p_Controlador.Controlador2, id string, line int, colu int) interfaces.Symbol {
	var tmpEnv Enviroment
	tmpEnv = env

	for {
		if tmpStruct, ok := tmpEnv.structs[id]; ok {
			return tmpStruct
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Enviroment)
		}
	}

	err := p_Errores.NewError("El estruct no existe en el programa", env.HaveFatha(), line, colu)
	controlador.Errores.Add(err)
	controlador.Agregar_Consola("El struct no existe en el programa")
	return interfaces.Symbol{
		Id:      "",
		Tipo:    -1,
		Valor:   "",
		IsMut:   false,
		Ambito:  id,
		Fila:    line,
		Columna: colu,
	}
}

func (env Enviroment) GetVariable_Env() map[string]interfaces.Symbol {
	return env.variable
}

func (env Enviroment) GetModulos_Env() map[string]interfaces.Symbol {
	return env.modulos
}

func (env Enviroment) SaveModules(controlador *p_Controlador.Controlador2, id string, list *arraylist.List, ava interfaces.Available, line int, colu int) {
	if structs, ok := env.structs[id]; ok {
		a := "El struct " + structs.Id + " ya existe"
		err := p_Errores.NewError(a, env.HaveFatha(), line, colu)
		controlador.Errores.Add(err)
		controlador.Agregar_Consola("El modulo " + structs.Id + " ya existe")
	}
	env.modulos[id] = interfaces.Symbol{
		Id:      id,
		Tipo:    interfaces.MODULO,
		Valor:   list,
		IsMut:   true,
		Ambito:  env.HaveFatha(),
		Fila:    line,
		Columna: colu,
		Visible: ava,
	}
}

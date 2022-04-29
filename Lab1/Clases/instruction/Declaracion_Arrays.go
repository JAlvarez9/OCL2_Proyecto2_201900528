package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Structs "LAB1/Clases/Structs_inter"
	"strconv"

	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
)

type Declaration_Array struct {
	Id         string
	Tipo       p_Interface.TipoExpresion
	Tipo_Datos *p_Structs.Array_type
	Expresion  p_Interface.Expresion
	IsMut      bool
	Line       int
	Columna    int
}

func NewDeclaration_Array(id string, tipo_datos *p_Structs.Array_type, val p_Interface.Expresion, isMut bool, line int, colu int) Declaration_Array {
	instr := Declaration_Array{
		Id:         id,
		Tipo:       p_Interface.ARRAY,
		Tipo_Datos: tipo_datos,
		Expresion:  val,
		IsMut:      isMut,
		Line:       line,
		Columna:    colu,
	}
	return instr
}

func (p Declaration_Array) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value

	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	//fmt.Println("asdfasdf")
	if result.Type == p_Interface.ARRAY {

		newSym := p_Interface.Symbol{
			Id:       p.Id,
			Tipo:     p_Interface.ARRAY,
			Valor:    p.Tipo_Datos,
			IsMut:    p.IsMut,
			Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
			Fila:     p.Line,
			Columna:  p.Columna,
			Posicion: env.(p_Enviroment.Enviroment).GetSize(),
		}
		generador.AddStack(strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), result.Valor)
		env.(p_Enviroment.Enviroment).SaveVarible(controlador, p.Id, newSym, p_Interface.ARRAY, p.IsMut, env.(p_Enviroment.Enviroment).HaveFatha(), p_Interface.NEUTRAL, p.Line, p.Columna)
		env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, p.Id, newSym, p_Interface.ARRAY, p.IsMut, env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Columna)

	} else {
		err := p_Errores.NewError("No son es del mismo tipo array", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Columna)
		controlador.Errores.Add(err)
		controlador.Agregar_Consola("No son es del mismo tipo array")
	}

	return result
}

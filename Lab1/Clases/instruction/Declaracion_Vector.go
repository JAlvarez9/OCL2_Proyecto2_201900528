package instruction

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	"strconv"

	p_Interface "LAB1/Clases/interfaces"
)

type Declaration_Vector struct {
	Id         string
	Tipo       p_Interface.TipoExpresion
	Tipo_Datos p_Interface.TipoExpresion
	Expresion  p_Interface.Expresion
	Id_Struct  string
	IsMut      bool
	Line       int
	Columna    int
}

func NewDeclaration_Vector(id string, tipo_datos p_Interface.TipoExpresion, val p_Interface.Expresion, id_str string, isMut bool, line int, colu int) Declaration_Vector {
	instr := Declaration_Vector{
		Id:         id,
		Tipo:       p_Interface.VECTOR,
		Tipo_Datos: tipo_datos,
		Expresion:  val,
		Id_Struct:  id_str,
		IsMut:      isMut,
		Line:       line,
		Columna:    colu,
	}
	return instr
}

func (p Declaration_Vector) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value

	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	//fmt.Println("asdfasdf")
	if result.Type == p_Interface.VECTOR {

		newSym := p_Interface.Symbol{
			Id:       p.Id,
			Tipo:     p_Interface.VECTOR,
			Valor:    p.Tipo_Datos,
			IsMut:    p.IsMut,
			Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
			Fila:     p.Line,
			Columna:  p.Columna,
			Posicion: env.(p_Enviroment.Enviroment).GetSize(),
		}
		generador.AddStack(strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), result.Valor)
		env.(p_Enviroment.Enviroment).SaveVarible(controlador, p.Id, newSym, p_Interface.VECTOR, p.IsMut, env.(p_Enviroment.Enviroment).HaveFatha(), p_Interface.NEUTRAL, p.Line, p.Columna)
		env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, p.Id, newSym, p_Interface.VECTOR, p.IsMut, env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Columna)

	} else {
		err := p_Errores.NewError("No son es del mismo tipo array", env.(p_Enviroment.Enviroment).HaveFatha(), p.Line, p.Columna)
		controlador.Errores.Add(err)
		controlador.Agregar_Consola("No son es del mismo tipo array")
	}

	return result
}

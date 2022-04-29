package structs

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Enviroment "LAB1/Clases/enviroment"
	p_Interface "LAB1/Clases/interfaces"
	"fmt"
	"strconv"

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
	structsito := env.(p_Enviroment.Enviroment).GetStruct(controlador, p.Id, p.Linea, p.Columna)

	if p.Lista_Atributos.Len() == structsito.Valor.(*arrayList.List).Len() {
		for i, sup := range p.Lista_Atributos.ToArray() {
			var sup_pos string
			b := structsito.Valor.(*arrayList.List).GetValue(i).(p_Interface.Symbol)
			if b.Tipo == p_Interface.STRUCT {
				newSym := p_Interface.Symbol{
					Id:       b.Id,
					Tipo:     b.Tipo,
					Valor:    p.Id,
					IsMut:    true,
					Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
					Fila:     p.Linea,
					Columna:  p.Columna,
					Posicion: i + 1,
				}
				sup_pos = strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize())
				env.(p_Enviroment.Enviroment).SaveVarible(controlador, strconv.Itoa(env.(p_Enviroment.Enviroment).GetSize()), newSym, b.Tipo, true, newSym.Ambito, p_Interface.NEUTRAL, p.Linea, p.Columna)
				env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, b.Id, newSym, b.Tipo, true, newSym.Ambito, p.Linea, p.Columna)
			}
			a := sup.(p_Interface.Symbol).Valor.(p_Interface.Instruction).Ejecutar(controlador, generador, env, env_uni)

			if b.Tipo == a.Type {
				newSym := p_Interface.Symbol{
					Id:       b.Id,
					Tipo:     a.Type,
					Valor:    "",
					IsMut:    true,
					Ambito:   env.(p_Enviroment.Enviroment).HaveFatha(),
					Fila:     p.Linea,
					Columna:  p.Columna,
					Posicion: i + 1,
				}
				pos_stack := env.(p_Enviroment.Enviroment).GetSize()
				if a.Type == p_Interface.STRUCT {
					as := fmt.Sprintf("%v", sup_pos)
					temporalin := generador.NewTemp()
					generador.AddExpression(temporalin, "P", as, "+")
					generador.AddStack(temporalin, a.Valor)
				}
				if a.Type != p_Interface.STRUCT {
					env.(p_Enviroment.Enviroment).SaveVarible(controlador, strconv.Itoa(pos_stack), newSym, a.Type, true, newSym.Ambito, p_Interface.NEUTRAL, p.Linea, p.Columna)
					env_uni.(p_Enviroment.Enviroment).SaveVarible_Uni(controlador, b.Id, newSym, a.Type, true, newSym.Ambito, p.Linea, p.Columna)
				}
				if a.IsP {
					if a.Type == p_Interface.INTEGER || a.Type == p_Interface.FLOAT || a.Type == p_Interface.USIZE {
						generador.AddComent("INICIO DECLARACION INT STRUCT")
						as := fmt.Sprintf("%v", pos_stack)
						temporalin := generador.NewTemp()
						generador.AddExpression(temporalin, "P", as, "+")
						generador.AddStack(temporalin, a.Valor)
						generador.AddComent("FIN DECLARACION INT STRUCT")
					} else if a.Type == p_Interface.STR || a.Type == p_Interface.STRING {
						generador.AddComent("INICIO DECLARACION STRING STRUCT")
						if !a.IsP {
							temporalin2 := generador.NewTemp()
							generador.AddExpression(temporalin2, "P", strconv.Itoa(pos_stack), "+")
							generador.AddStack(temporalin2, result.Valor)
						} else {

							runas := []rune(a.Valor)
							var ascii []int

							for i := 0; i < len(runas); i++ {
								ascii = append(ascii, int(runas[i]))
							}
							temporalin := generador.NewTemp()
							generador.AddExpression(temporalin, "H", "", "")
							for i := 0; i < len(ascii); i++ {
								generador.AddHeap("H", strconv.Itoa(ascii[i]))
								generador.AddExpression("H", "H", "1", "+")
							}
							generador.AddHeap("H", "-1")
							generador.AddExpression("H", "H", "1", "+")
							temporalin2 := generador.NewTemp()
							generador.AddExpression(temporalin2, "P", strconv.Itoa(pos_stack), "+")
							generador.AddStack(temporalin2, temporalin)
						}
						generador.AddComent("FIN DECLARACION INT STRUCT")
					} else if a.Type == p_Interface.BOOLEAN {
						// TENGO QUE HACER QUE GUARDE UN BOOLEAN
						generador.AddComent("INICIO DECLARACION BOOL STRUCT")
						if a.IsP {
							if a.Valor == "true" {
								as := fmt.Sprintf("%v", pos_stack)
								temporalin := generador.NewTemp()
								generador.AddExpression(temporalin, "P", as, "+")
								generador.AddStack(temporalin, "1")
							} else if a.Valor == "false" {
								as := fmt.Sprintf("%v", pos_stack)
								temporalin := generador.NewTemp()
								generador.AddExpression(temporalin, "P", as, "+")
								generador.AddStack(temporalin, "0")
							}
						} else {
							as := fmt.Sprintf("%v", pos_stack)
							temporalin := generador.NewTemp()
							generador.AddExpression(temporalin, "P", as, "+")
							generador.AddStack(temporalin, a.Valor)
						}
						generador.AddComent("FIN DECLARACION BOOL STRUCT")
					} else if a.Type == p_Interface.CHAR {
						generador.AddComent("INICIO DECLARACION CHAR STRUCT")
						if !a.IsP {
							temporalin2 := generador.NewTemp()
							generador.AddExpression(temporalin2, "P", strconv.Itoa(pos_stack), "+")
							generador.AddStack(temporalin2, a.Valor)
						} else {

							runas := []rune(a.Valor)
							var ascii []int

							for i := 0; i < len(runas); i++ {
								ascii = append(ascii, int(runas[i]))
							}

							as := fmt.Sprintf("%v", pos_stack)
							temporalin := generador.NewTemp()
							generador.AddExpression(temporalin, "P", as, "+")
							generador.AddStack(temporalin, strconv.Itoa(ascii[0]))
						}
						generador.AddComent("FIN DECLARACION CHAR STRUCT")
					}
				}
				if a.IsCV {
					as := fmt.Sprintf("%v", pos_stack)
					temporalin := generador.NewTemp()
					generador.AddExpression(temporalin, "P", as, "+")
					generador.AddStack(temporalin, a.Valor)
				}
			}
		}
	}
	result.Valor = strconv.Itoa(p.Lista_Atributos.Len())
	result.Type = p_Interface.STRUCT
	return result
}

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

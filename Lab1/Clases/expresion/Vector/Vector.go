package vector

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interface "LAB1/Clases/interfaces"
	"strconv"

	arrayList "github.com/colegno/arraylist"
)

type Vector struct {
	ListExp           *arrayList.List
	Expresion_repetir p_Interface.Expresion
	Expresion_veces   p_Interface.Expresion
	is_New            bool
	is_Capacity       p_Interface.Expresion
	Line              int
	Columna           int
}

func NewVector(list *arrayList.List, exp_re p_Interface.Expresion, exp_vec p_Interface.Expresion, isnew bool, iscapa p_Interface.Expresion, line int, colu int) Vector {
	vectorsito := Vector{
		ListExp:           list,
		Expresion_repetir: exp_re,
		Expresion_veces:   exp_vec,
		is_New:            isnew,
		is_Capacity:       iscapa,
		Line:              line,
		Columna:           colu,
	}
	return vectorsito
}

func (p Vector) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interface.Value {
	var result p_Interface.Value
	var tmpExp *arrayList.List
	tmpExp = arrayList.New()
	tempo_str := arrayList.New()
	var tipito p_Interface.TipoExpresion
	if p.is_New {

	}
	if p.is_Capacity != nil {
		number, _ := strconv.Atoi(p.is_Capacity.Ejecutar(controlador, generador, env, env_uni).Valor)
		temporalin2 := generador.NewTemp()
		generador.AddExpression(temporalin2, "H", "", "")
		generador.AddHeap("H", strconv.Itoa(number))
		generador.AddExpression("H", "H", "1", "+")
		for i := 0; i < number; i++ {
			generador.AddHeap("H", "-415")
			generador.AddExpression("H", "H", "1", "+")
		}
		result.Valor = temporalin2
		result.Type = p_Interface.VECTOR

		return result
	}

	if p.ListExp.Len() != 0 {
		for _, s := range p.ListExp.ToArray() {
			a := s.(p_Interface.Expresion).Ejecutar(controlador, generador, env, env_uni)
			tmpExp.Add(a)
			tipito = a.Type
		}

		if tipito == p_Interface.STR || tipito == p_Interface.STRING {
			for _, s := range tmpExp.ToArray() {
				sup := s.(p_Interface.Value)
				runas := []rune(sup.Valor)
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
				tempo_str.Add(temporalin)
			}
		}

		temporalin2 := generador.NewTemp()
		generador.AddExpression(temporalin2, "H", "", "")
		generador.AddHeap("H", strconv.Itoa(tmpExp.Len()))
		generador.AddExpression("H", "H", "1", "+")
		for i, s := range tmpExp.ToArray() {
			sup := s.(p_Interface.Value)

			if sup.IsP {
				if sup.Type == p_Interface.INTEGER || sup.Type == p_Interface.FLOAT || sup.Type == p_Interface.USIZE {

					generador.AddHeap("H", sup.Valor)
					generador.AddExpression("H", "H", "1", "+")

				} else if sup.Type == p_Interface.STRING || sup.Type == p_Interface.STR {
					generador.AddHeap("H", tempo_str.GetValue(i).(string))
					generador.AddExpression("H", "H", "1", "+")
				} else if sup.Type == p_Interface.BOOLEAN {
					// TENGO QUE HACER QUE GUARDE UN BOOLEAN
					if sup.Valor == "true" {

						generador.AddHeap("H", "1")
						generador.AddExpression("H", "H", "1", "+")
					} else if sup.Valor == "false" {

						generador.AddHeap("H", "0")
						generador.AddExpression("H", "H", "1", "+")
					}

				} else if sup.Type == p_Interface.CHAR {

					runas := []rune(sup.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddHeap("H", strconv.Itoa(ascii[0]))
					generador.AddExpression("H", "H", "1", "+")

				}
			}
			if sup.IsCV || sup.IsArit {
				generador.AddHeap("H", sup.Valor)
				generador.AddExpression("H", "H", "1", "+")
			}
			if !sup.IsCV && !sup.IsP {

				generador.AddHeap("H", sup.Valor)
				generador.AddExpression("H", "H", "1", "+")
			}
			result.Valor = temporalin2
			result.Type = p_Interface.VECTOR

		}
		//result.Type =
		generador.AddComent("FIN ARRAY")
		return result

	} else {
		s := p.Expresion_repetir.Ejecutar(controlador, generador, env, env_uni)
		valor := p.Expresion_veces.Ejecutar(controlador, generador, env, env_uni)
		numbers, _ := strconv.Atoi(valor.Valor)
		for i := 0; i < numbers; i++ {

			tmpExp.Add(s)
			tipito = s.Type
		}

		if tipito == p_Interface.STR || tipito == p_Interface.STRING {
			for _, s := range tmpExp.ToArray() {
				sup := s.(p_Interface.Value)
				runas := []rune(sup.Valor)
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
				tempo_str.Add(temporalin)
			}
		}

		temporalin2 := generador.NewTemp()
		generador.AddExpression(temporalin2, "H", "", "")
		generador.AddHeap("H", strconv.Itoa(tmpExp.Len()))
		generador.AddExpression("H", "H", "1", "+")
		for i, s := range tmpExp.ToArray() {
			sup := s.(p_Interface.Value)

			if sup.IsP {
				if sup.Type == p_Interface.INTEGER || sup.Type == p_Interface.FLOAT || sup.Type == p_Interface.USIZE {
					generador.AddHeap("H", sup.Valor)
					generador.AddExpression("H", "H", "1", "+")
				} else if sup.Type == p_Interface.STR || sup.Type == p_Interface.STRING {
					generador.AddHeap("H", tempo_str.GetValue(i).(string))
					generador.AddExpression("H", "H", "1", "+")
				} else if sup.Type == p_Interface.BOOLEAN {
					// TENGO QUE HACER QUE GUARDE UN BOOLEAN

					if sup.Valor == "true" {

						generador.AddHeap("H", "1")
						generador.AddExpression("H", "H", "1", "+")
					} else if sup.Valor == "false" {

						generador.AddHeap("H", "0")
						generador.AddExpression("H", "H", "1", "+")
					}

				} else if sup.Type == p_Interface.CHAR {

					runas := []rune(sup.Valor)
					var ascii []int

					for i := 0; i < len(runas); i++ {
						ascii = append(ascii, int(runas[i]))
					}

					generador.AddHeap("H", strconv.Itoa(ascii[0]))
					generador.AddExpression("H", "H", "1", "+")

				}
			}
			if sup.IsCV {
				generador.AddHeap("H", sup.Valor)
				generador.AddExpression("H", "H", "1", "+")
			}
			if !sup.IsCV && !sup.IsP {

				generador.AddHeap("H", sup.Valor)
				generador.AddExpression("H", "H", "1", "+")
			}
			result.Valor = temporalin2
			result.Type = p_Interface.VECTOR
		}
		generador.AddComent("FIN ARRAY")
		return result
	}

	return result
}

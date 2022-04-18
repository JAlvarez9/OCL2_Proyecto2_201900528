package sentenciaciclica

import (
	p_Controlador "LAB1/Clases/Controlador"
	p_Generador "LAB1/Clases/Generador"
	p_Interfaces "LAB1/Clases/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type While struct {
	Expresion    p_Interfaces.Expresion
	Bloque_While *arrayList.List
	Linea        int
	Columna      int
}

func NewWhile(expre p_Interfaces.Expresion, bloque *arrayList.List, line int, colu int) While {
	while := While{
		Expresion:    expre,
		Bloque_While: bloque,
		Linea:        line,
		Columna:      colu,
	}
	return while
}

func (p While) Ejecutar(controlador *p_Controlador.Controlador2, generador *p_Generador.Generador, env interface{}, env_uni interface{}) p_Interfaces.Value {
	var result p_Interfaces.Value
	generador.AddComent("INICIO WHILE")
	//tmpEnv := p_Enviroment.NewEnviroment(env.(p_Enviroment.Enviroment))
	initialLabel := generador.NewLabel()
	generador.AddLabel(initialLabel)
	result = p.Expresion.Ejecutar(controlador, generador, env, env_uni)
	generador.AddBreakList(result.FalseLabel)
	generador.AddLabel(result.TrueLabel)
	for _, s := range p.Bloque_While.ToArray() {
		s.(p_Interfaces.Expresion).Ejecutar(controlador, generador, env, env_uni)
	}
	generador.AddGoTo(initialLabel)
	generador.AddLabel(result.FalseLabel)
	generador.QuitLastBreak()
	generador.AddComent("FINAL WHILE")
	return result
}

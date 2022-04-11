package generador

import (
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Generador struct {
	Temporal    int
	Label       int
	Code        *arrayList.List
	TempList    *arrayList.List
	Native_Func *arrayList.List
}

func NewGene() *Generador {
	gene := Generador{
		Temporal: 0,
		Label:    0,
		Code:     arrayList.New(),
		TempList: arrayList.New(),
	}
	return &gene
}

func (g Generador) GetCode() *arrayList.List {
	return g.Code
}

func (g Generador) GetTemps() *arrayList.List {
	return g.TempList
}

func (g *Generador) NewTemp() string {
	temp := "t" + fmt.Sprintf("%v", g.Temporal)
	g.Temporal = g.Temporal + 1
	g.TempList.Add(temp)
	return temp
}

func (g *Generador) NewLabel() string {
	temp := g.Label
	g.Label = g.Label + 1
	return "L" + fmt.Sprintf("%v", temp)

}

func (g *Generador) AddLabel(label string) {
	g.Code.Add(label + ":")
}

func (g *Generador) AddStack(posicion string, value string) {
	g.Code.Add("STACK[(int)" + posicion + "] = " + value + ";")
}

func (g *Generador) AddHeap(posicion string, value string) {
	g.Code.Add("HEAP[(int)" + posicion + "] = " + value + ";")
}

func (g *Generador) AddExpression(target string, left string, right string, operator string) {
	g.Code.Add(target + " = " + left + " " + operator + " " + right + ";")
}

func (g *Generador) AddExprePow(target string, left string, right string, operator string) {
	g.Code.Add(target + " = " + "pow(" + left + "," + right + ");")
}

func (g *Generador) AddPrint(typePrint string, value string) {
	g.Code.Add("printf(\"%" + typePrint + "\" ," + value + ");")
}

func (g *Generador) AddIf(left string, right string, opeartor string, label string) {
	g.Code.Add("if(" + left + " " + opeartor + " " + right + ") goto " + label + ";")
}

func (g *Generador) AddGoTo(label string) {
	g.Code.Add("goto " + label + ";")
}

//FUNCIONES------------------------------

func (g *Generador) Ini_func(tipo string, id string) {

	g.Code.Add(tipo + " " + id + "(){ \n")

}

//---------------Imprimir String--------------------

func (g *Generador) AddImprimirString() {
	g.Ini_func("void", "print_string")
	labelsito := g.NewLabel()
	labelsito2 := g.NewLabel()

	temporalin := g.NewTemp()
	temporalin2 := g.NewTemp()

	g.AddExpression(temporalin, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin+"]", "", "")
	g.AddLabel(labelsito)
	temporalin3 := g.NewTemp()

	g.AddExpression(temporalin3, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddIf(temporalin, "-1", "==", labelsito2)
	g.AddPrint("c", "(int)"+temporalin3)

	g.AddExpression(temporalin2, temporalin2, "1", "+")
	g.AddGoTo(labelsito)
	g.AddLabel(labelsito2)
	g.Code.Add("return; \n}")

}

func (g *Generador) Bring_Func(id string) {
	g.Code.Add(id + "();")
}

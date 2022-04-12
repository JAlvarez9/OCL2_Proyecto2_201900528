package generador

import (
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Generador struct {
	Temporal int
	Label    int
	Code     *arrayList.List
	TempList *arrayList.List

	All_Func *arrayList.List
	isFunc   bool

	isNot bool
}

func NewGene() *Generador {
	gene := Generador{
		Temporal: 0,
		Label:    0,
		Code:     arrayList.New(),
		TempList: arrayList.New(),
		All_Func: arrayList.New(),
		isFunc:   false,
		isNot:    false,
	}
	return &gene
}

//---------Add Instructs---------------

func (g *Generador) AddInstruc(instr string) {
	if g.isFunc {
		g.All_Func.Add(instr)
	} else {
		g.Code.Add(instr)
	}
}

func (g *Generador) GetFunctions() *arrayList.List {
	return g.All_Func
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

func (g *Generador) SetNotTrue() {
	g.isNot = true
}
func (g *Generador) SetNotFalse() {
	g.isNot = false
}

func (g *Generador) NewLabel() string {
	temp := g.Label
	g.Label = g.Label + 1
	return "L" + fmt.Sprintf("%v", temp)

}

func (g *Generador) AddLabel(label string) {
	g.AddInstruc(label + ":")
}

func (g *Generador) AddStack(posicion string, value string) {
	g.AddInstruc("STACK[(int)" + posicion + "] = " + value + ";")
}

func (g *Generador) AddHeap(posicion string, value string) {
	g.AddInstruc("HEAP[(int)" + posicion + "] = " + value + ";")
}

func (g *Generador) AddExpression(target string, left string, right string, operator string) {
	g.AddInstruc(target + " = " + left + " " + operator + " " + right + ";")
}

func (g *Generador) AddExprePow(target string, left string, right string, operator string) {
	g.AddInstruc(target + " = " + "pow(" + left + "," + right + ");")
}

func (g *Generador) AddPrint(typePrint string, value string) {
	g.AddInstruc("printf(\"%" + typePrint + "\" ," + value + ");")
}

func (g *Generador) AddIf(left string, right string, opeartor string, label string) {
	g.AddInstruc("if(" + left + " " + opeartor + " " + right + ") goto " + label + ";")
}

func (g *Generador) AddGoTo(label string) {
	g.AddInstruc("goto " + label + ";")
}

func (g *Generador) AddComent(label string) {
	g.AddInstruc("//+++++++++++++ " + label + " +++++++++++++++++")
}

//FUNCIONES------------------------------

func (g *Generador) Ini_func(tipo string, id string) {
	g.isFunc = true
	g.AddInstruc(tipo + " " + id + "(){ \n")

}

func (g *Generador) Finish_func() {
	g.AddInstruc("return; \n } \n")
	g.isFunc = false
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

//------------------Funciones Nativas--------------------

func (g *Generador) Func_Nat_Print_True() {
	g.Ini_func("void", "Native_Print_True")
	g.AddPrint("c", "(int)116")
	g.AddPrint("c", "(int)114")
	g.AddPrint("c", "(int)117")
	g.AddPrint("c", "(int)101")
	g.AddPrint("c", "(int)10")
	g.Finish_func()
}

func (g *Generador) Func_Nat_Print_False() {
	g.Ini_func("void", "Native_Print_False")
	g.AddPrint("c", "(int)102")
	g.AddPrint("c", "(int)97")
	g.AddPrint("c", "(int)108")
	g.AddPrint("c", "(int)115")
	g.AddPrint("c", "(int)101")
	g.AddPrint("c", "(int)10")
	g.Finish_func()
}

func (g *Generador) Func_Nat_Print_MathError() {
	g.Ini_func("void", "Native_Print_MathError")
	g.AddPrint("c", "(int)77")
	g.AddPrint("c", "(int)97")
	g.AddPrint("c", "(int)116")
	g.AddPrint("c", "(int)104")
	g.AddPrint("c", "(int)32")
	g.AddPrint("c", "(int)69")
	g.AddPrint("c", "(int)114")
	g.AddPrint("c", "(int)114")
	g.AddPrint("c", "(int)111")
	g.AddPrint("c", "(int)114")
	g.AddPrint("c", "(int)10")
	g.Finish_func()
}

func (g *Generador) Bring_Func(id string) {
	g.AddInstruc(id + "();")
}

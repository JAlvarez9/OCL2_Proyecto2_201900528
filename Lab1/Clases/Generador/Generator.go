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

	isNot   bool
	isLogic bool

	isBreak    *arrayList.List
	isContinue *arrayList.List
}

func NewGene() *Generador {
	gene := Generador{
		Temporal:   0,
		Label:      0,
		Code:       arrayList.New(),
		TempList:   arrayList.New(),
		All_Func:   arrayList.New(),
		isFunc:     false,
		isNot:      false,
		isLogic:    false,
		isBreak:    arrayList.New(),
		isContinue: arrayList.New(),
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

func (g *Generador) SetLogicTrue() {
	g.isLogic = true
}

func (g *Generador) SetLogicFalse() {
	g.isLogic = false
}

func (g *Generador) GetLastBreak() string {

	if g.isBreak.Len() != 0 {
		return g.isBreak.GetValue(g.isBreak.Len() - 1).(string)
	} else {
		return ""
	}
}

func (g *Generador) AddBreakList(label string) {
	g.isBreak.Add(label)
}

func (g *Generador) QuitLastBreak() {
	g.isBreak.RemoveAtIndex(g.isBreak.Len() - 1)
}

func (g *Generador) GetLastContinue() string {
	if g.isContinue.Len() != 0 {
		return g.isContinue.GetValue(g.isContinue.Len() - 1).(string)
	} else {
		return ""
	}
}

func (g *Generador) AddContinueList(label string) {
	g.isContinue.Add(label)
}

func (g *Generador) QuitLastContinue() {
	g.isContinue.RemoveAtIndex(g.isContinue.Len() - 1)
}

func (g *Generador) GetIsLogic() bool {
	return g.isLogic
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
	labelsito3 := g.NewLabel()

	temporalin := g.NewTemp()
	temporalin2 := g.NewTemp()

	g.AddExpression(temporalin, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin+"]", "", "")
	g.AddLabel(labelsito)
	temporalin3 := g.NewTemp()

	g.AddExpression(temporalin3, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddIf(temporalin3, "-1", "!=", labelsito2)
	g.AddGoTo(labelsito3)
	g.AddLabel(labelsito2)
	g.AddPrint("c", "(int)"+temporalin3)
	g.AddExpression(temporalin2, temporalin2, "1", "+")
	g.AddGoTo(labelsito)
	g.AddLabel(labelsito3)
	g.Finish_func()

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

func (g *Generador) Func_Nat_Print_Null() {
	g.Ini_func("void", "Native_Print_Null")
	g.AddPrint("c", "(int)78")
	g.AddPrint("c", "(int)117")
	g.AddPrint("c", "(int)108")
	g.AddPrint("c", "(int)108")
	g.AddPrint("c", "(int)10")
	g.Finish_func()
}

func (g *Generador) Func_Nat_Pow_proc() {

	g.Ini_func("void", "Native_Pot_NumEnteros")

	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()

	g.AddExpression(temporalin1, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin3, "P", "2", "+")
	g.AddExpression(temporalin4, "STACK[(int)"+temporalin3+"]", "", "")
	g.AddExpression(temporalin5, "0", temporalin2, "+")
	g.AddLabel(labelsito3)
	g.AddIf(temporalin4, "1", ">", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddExpression(temporalin5, temporalin5, temporalin2, "*")
	g.AddExpression(temporalin4, temporalin4, "1", "-")
	g.AddGoTo(labelsito3)
	g.AddLabel(labelsito2)
	g.AddStack("P", temporalin5)
	g.Finish_func()
}

func (g *Generador) Func_Nat_Compare_String() {

	g.Ini_func("void", "Native_Compare_Strings")

	temporalin0 := g.NewTemp()
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	labelsito0 := g.NewLabel()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()
	labelsito4 := g.NewLabel()
	labelsito5 := g.NewLabel()
	labelsito6 := g.NewLabel()

	g.AddExpression(temporalin0, "P", "1", "+")
	g.AddExpression(temporalin1, "STACK[(int)"+temporalin0+"]", "", "")
	g.AddExpression(temporalin2, "P", "2", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin4, "1", "", "")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddLabel(labelsito2)
	g.AddIf(temporalin5, "-1", "!=", labelsito0)
	g.AddGoTo(labelsito1)
	g.AddLabel(labelsito0)
	g.AddIf(temporalin5, temporalin6, "!=", labelsito3)
	g.AddGoTo(labelsito4)
	g.AddLabel(labelsito3)
	g.AddExpression(temporalin4, "0", "", "")
	g.AddGoTo(labelsito1)
	g.AddLabel(labelsito4)
	g.AddExpression(temporalin1, temporalin1, "1", "+")
	g.AddExpression(temporalin3, temporalin3, "1", "+")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddIf(temporalin6, "-1", "!=", labelsito5)
	g.AddGoTo(labelsito6)
	g.AddLabel(labelsito5)
	g.AddExpression(temporalin4, "0", "", "")
	g.AddLabel(labelsito6)
	g.AddStack("P", temporalin4)

	g.Finish_func()

}

func (g *Generador) Fun_Mayor_Menor_Que_String() {
	g.Ini_func("void", "Native_Mayo_Menor_String")
	temporalin0 := g.NewTemp()
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	temporalin7 := g.NewTemp()
	temporalin8 := g.NewTemp()
	labelsito0 := g.NewLabel()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()
	labelsito4 := g.NewLabel()
	labelsito5 := g.NewLabel()
	labelsito6 := g.NewLabel()
	labelsito7 := g.NewLabel()

	g.AddExpression(temporalin0, "P", "1", "+")
	g.AddExpression(temporalin1, "STACK[(int)"+temporalin0+"]", "", "")
	g.AddExpression(temporalin2, "P", "2", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin4, "1", "", "")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddExpression(temporalin7, "0", "", "")
	g.AddExpression(temporalin8, "0", "", "")
	g.AddLabel(labelsito0)
	g.AddIf(temporalin5, "-1", "!=", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddExpression(temporalin7, temporalin7, temporalin5, "+")
	g.AddExpression(temporalin1, temporalin1, "1", "+")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddGoTo(labelsito0)
	g.AddLabel(labelsito2)
	g.AddIf(temporalin6, "-1", "!=", labelsito3)
	g.AddGoTo(labelsito4)
	g.AddLabel(labelsito3)
	g.AddExpression(temporalin8, temporalin8, temporalin6, "+")
	g.AddExpression(temporalin3, temporalin3, "1", "+")
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito4)
	g.AddIf(temporalin7, temporalin8, ">", labelsito5)
	g.AddGoTo(labelsito6)
	g.AddLabel(labelsito5)
	g.AddExpression(temporalin4, "1", "", "")
	g.AddGoTo(labelsito7)
	g.AddLabel(labelsito6)
	g.AddExpression(temporalin4, "0", "", "")
	g.AddLabel(labelsito7)
	g.AddStack("P", temporalin4)

	g.Finish_func()

}

func (g *Generador) Fun_Mayor_Menor_Igual_Que_String() {
	g.Ini_func("void", "Native_Mayo_Menor_Igual_String")
	temporalin0 := g.NewTemp()
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	temporalin7 := g.NewTemp()
	temporalin8 := g.NewTemp()
	labelsito0 := g.NewLabel()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()
	labelsito4 := g.NewLabel()
	labelsito5 := g.NewLabel()
	labelsito6 := g.NewLabel()
	labelsito7 := g.NewLabel()

	g.AddExpression(temporalin0, "P", "1", "+")
	g.AddExpression(temporalin1, "STACK[(int)"+temporalin0+"]", "", "")
	g.AddExpression(temporalin2, "P", "2", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin4, "1", "", "")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddExpression(temporalin7, "0", "", "")
	g.AddExpression(temporalin8, "0", "", "")
	g.AddLabel(labelsito0)
	g.AddIf(temporalin5, "-1", "!=", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddExpression(temporalin7, temporalin7, temporalin5, "+")
	g.AddExpression(temporalin1, temporalin1, "1", "+")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddGoTo(labelsito0)
	g.AddLabel(labelsito2)
	g.AddIf(temporalin6, "-1", "!=", labelsito3)
	g.AddGoTo(labelsito4)
	g.AddLabel(labelsito3)
	g.AddExpression(temporalin8, temporalin8, temporalin6, "+")
	g.AddExpression(temporalin3, temporalin3, "1", "+")
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito4)
	g.AddIf(temporalin7, temporalin8, ">=", labelsito5)
	g.AddGoTo(labelsito6)
	g.AddLabel(labelsito5)
	g.AddExpression(temporalin4, "1", "", "")
	g.AddGoTo(labelsito7)
	g.AddLabel(labelsito6)
	g.AddExpression(temporalin4, "0", "", "")
	g.AddLabel(labelsito7)
	g.AddStack("P", temporalin4)

	g.Finish_func()

}

func (g *Generador) Bring_Func(id string) {
	g.AddInstruc(id + "();")
}

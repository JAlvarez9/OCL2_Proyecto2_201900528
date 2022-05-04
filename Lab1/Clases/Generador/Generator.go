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

	IsLen bool

	ExpMatch interface{}

	Valor_Return_Expre string
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

func (g *Generador) SetisFuncTrue() {
	g.isFunc = true
}

func (g *Generador) SetisFuncFalse() {
	g.isFunc = false
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

func (g *Generador) Func_Concat_Strings() {
	g.Ini_func("void", "Native_Concat_Str")
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()
	labelsito4 := g.NewLabel()
	labelsito5 := g.NewLabel()

	g.AddExpression(temporalin1, "H", "", "")
	g.AddExpression(temporalin2, "P", "1", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin4, "P", "2", "+")
	g.AddExpression(temporalin5, "STACK[(int)"+temporalin4+"]", "", "")
	g.AddLabel(labelsito3)
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin3+"]", "", "")
	g.AddIf(temporalin6, "-1", "!=", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddHeap("H", temporalin6)
	g.AddExpression("H", "H", "1", "+")
	g.AddExpression(temporalin3, temporalin3, "1", "+")
	g.AddGoTo(labelsito3)
	g.AddLabel(labelsito2)
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin5+"]", "", "")
	g.AddIf(temporalin6, "-1", "!=", labelsito4)
	g.AddGoTo(labelsito5)
	g.AddLabel(labelsito4)
	g.AddHeap("H", temporalin6)
	g.AddExpression("H", "H", "1", "+")
	g.AddExpression(temporalin5, temporalin5, "1", "+")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito5)
	g.AddHeap("H", "-1")
	g.AddExpression("H", "H", "1", "+")
	g.AddStack("P", temporalin1)
	g.Finish_func()
}

func (g *Generador) Func_Nat_Int_String() {
	g.Ini_func("void", "Native_Int_Str")
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	temporalin7 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()
	labelsito4 := g.NewLabel()
	labelsito5 := g.NewLabel()
	labelsito6 := g.NewLabel()
	labelsito7 := g.NewLabel()
	labelsito8 := g.NewLabel()
	labelsito9 := g.NewLabel()
	labelsito10 := g.NewLabel()
	labelsito11 := g.NewLabel()
	labelsito12 := g.NewLabel()
	labelsito13 := g.NewLabel()

	g.AddExpression(temporalin1, "H", "", "")
	g.AddExpression(temporalin2, "P", "1", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddIf(temporalin3, "0", "==", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddHeap("H", "48")
	g.AddExpression("H", "H", "1", "+")
	g.AddLabel(labelsito2)
	g.AddIf(temporalin3, "0", "<", labelsito3)
	g.AddGoTo(labelsito4)
	g.AddLabel(labelsito3)
	g.AddHeap("H", "45")
	g.AddExpression("H", "H", "1", "+")
	g.AddExpression(temporalin3, "0", temporalin3, "-")
	g.AddLabel(labelsito4)
	g.AddExpression(temporalin4, "0", "", "")
	g.AddLabel(labelsito5)
	g.AddIf(temporalin3, "0", ">", labelsito6)
	g.AddGoTo(labelsito7)
	g.AddLabel(labelsito6)
	g.AddExpression(temporalin4, temporalin4, "10", "*")
	g.AddExpression(temporalin5, "(int)"+temporalin3, "10", "%")
	g.AddExpression(temporalin4, temporalin4, temporalin5, "+")
	g.AddIf(temporalin4, "0", "==", labelsito8)
	g.AddGoTo(labelsito9)
	g.AddLabel(labelsito8)
	g.AddExpression(temporalin6, temporalin6, "1", "+")
	g.AddLabel(labelsito9)
	g.AddExpression(temporalin3, "(int)"+temporalin3, "10", "/")
	g.AddGoTo(labelsito5)
	g.AddLabel(labelsito7)
	g.AddIf(temporalin4, "0", ">", labelsito10)
	g.AddGoTo(labelsito11)
	g.AddLabel(labelsito10)
	g.AddExpression(temporalin7, "(int)"+temporalin4, "10", "%")
	g.AddExpression(temporalin7, temporalin7, "48", "+")
	g.AddHeap("H", temporalin7)
	g.AddExpression("H", "H", "1", "+")
	g.AddExpression(temporalin4, "(int)"+temporalin4, "10", "/")
	g.AddGoTo(labelsito7)
	g.AddLabel(labelsito11)
	g.AddIf(temporalin6, "0", ">", labelsito12)
	g.AddGoTo(labelsito13)
	g.AddLabel(labelsito12)
	g.AddHeap("H", "48")
	g.AddExpression("H", "H", "1", "+")
	g.AddExpression(temporalin6, temporalin6, "1", "-")
	g.AddGoTo(labelsito11)
	g.AddLabel(labelsito13)
	g.AddHeap("H", "-1")
	g.AddExpression("H", "H", "1", "+")
	g.AddStack("P", temporalin1)
	g.Finish_func()
}

func (g *Generador) Func_Nat_Double_String() {

	g.Ini_func("void", "Native_Double_Str")
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	temporalin7 := g.NewTemp()
	temporalin8 := g.NewTemp()
	temporalin9 := g.NewTemp()
	temporalin10 := g.NewTemp()
	temporalin11 := g.NewTemp()
	temporalin12 := g.NewTemp()
	temporalin13 := g.NewTemp()
	temporalin14 := g.NewTemp()
	temporalin15 := g.NewTemp()
	temporalin16 := g.NewTemp()
	temporalin17 := g.NewTemp()
	temporalin18 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()
	labelsito4 := g.NewLabel()
	labelsito5 := g.NewLabel()
	labelsito6 := g.NewLabel()
	labelsito7 := g.NewLabel()
	labelsito8 := g.NewLabel()
	labelsito9 := g.NewLabel()

	g.AddExpression(temporalin1, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin3, "(int)"+temporalin2, "1", "/")
	g.AddExpression(temporalin4, "fmod("+temporalin2+","+temporalin3+")", "", "")
	g.AddIf(temporalin4, "0", "<", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddExpression(temporalin4, "0", temporalin4, "-")
	g.AddLabel(labelsito2)
	g.AddExpression(temporalin5, temporalin3, "", "")
	g.AddExpression(temporalin6, "0.0", "", "")
	g.AddExpression(temporalin7, "0.0", "", "")
	g.AddLabel(labelsito3)
	g.AddIf(temporalin4, "0.01", ">", labelsito4)
	g.AddGoTo(labelsito5)
	g.AddLabel(labelsito4)
	g.AddExpression(temporalin4, temporalin4, "10", "*")
	g.AddExpression(temporalin6, temporalin6, "10", "*")
	g.AddExpression(temporalin3, "(int)"+temporalin4, "1", "/")
	g.AddExpression(temporalin4, "fmod("+temporalin4+","+temporalin3+")", "", "")
	g.AddExpression(temporalin6, temporalin6, temporalin3, "+")
	g.AddIf(temporalin4, "0.99", ">", labelsito6)
	g.AddGoTo(labelsito7)
	g.AddLabel(labelsito6)
	g.AddGoTo(labelsito5)
	g.AddLabel(labelsito7)
	g.AddIf(temporalin7, "7", ">", labelsito8)
	g.AddGoTo(labelsito9)
	g.AddLabel(labelsito8)
	g.AddGoTo(labelsito5)
	g.AddLabel(labelsito9)
	g.AddExpression(temporalin7, temporalin7, "1", "+")
	g.AddGoTo(labelsito3)
	g.AddLabel(labelsito5)
	g.AddComent("Inicio i64-String")
	g.AddExpression("P", "P", "2", "+")
	g.AddExpression(temporalin8, "P", "1", "+")
	g.AddStack(temporalin8, temporalin5)
	g.Bring_Func("Native_Int_Str")
	g.AddExpression(temporalin9, "STACK[(int)P]", "", "")
	g.AddExpression("P", "P", "2", "-")
	g.AddComent("Fin i64-String")
	g.AddComent("Inicio f64-String")
	g.AddExpression("P", "P", "2", "+")
	g.AddExpression(temporalin10, "P", "1", "+")
	g.AddStack(temporalin10, temporalin6)
	g.Bring_Func("Native_Int_Str")
	g.AddExpression(temporalin11, "STACK[(int)P]", "", "")
	g.AddExpression("P", "P", "2", "-")
	g.AddComent("Fin f64-String")
	g.AddExpression(temporalin12, "H", "", "")
	g.AddHeap("H", "46")
	g.AddExpression("H", "H", "1", "+")
	g.AddHeap("H", "-1")
	g.AddExpression("H", "H", "1", "+")
	g.AddExpression("P", "P", "2", "+")
	g.AddExpression(temporalin13, "P", "1", "+")
	g.AddStack(temporalin13, temporalin9)
	g.AddExpression(temporalin14, "P", "2", "+")
	g.AddStack(temporalin14, temporalin12)
	g.Bring_Func("Native_Concat_Str")
	g.AddExpression(temporalin15, "STACK[(int)P]", "", "")
	g.AddExpression("P", "P", "2", "-")
	g.AddExpression("P", "P", "2", "+")
	g.AddExpression(temporalin16, "P", "1", "+")
	g.AddStack(temporalin16, temporalin15)
	g.AddExpression(temporalin17, "P", "2", "+")
	g.AddStack(temporalin17, temporalin11)
	g.Bring_Func("Native_Concat_Str")
	g.AddExpression(temporalin18, "STACK[(int)P]", "", "")
	g.AddExpression("P", "P", "2", "-")
	g.AddStack("P", temporalin18)
	g.Finish_func()

}

func (g *Generador) Func_Nat_Index_Out_Range() {
	g.Ini_func("void", "Native_Out_Range")
	g.AddPrint("c", "(int)73")
	g.AddPrint("c", "(int)110")
	g.AddPrint("c", "(int)100")
	g.AddPrint("c", "(int)101")
	g.AddPrint("c", "(int)120")
	g.AddPrint("c", "(int)32")
	g.AddPrint("c", "(int)79")
	g.AddPrint("c", "(int)117")
	g.AddPrint("c", "(int)116")
	g.AddPrint("c", "(int)32")
	g.AddPrint("c", "(int)79")
	g.AddPrint("c", "(int)102")
	g.AddPrint("c", "(int)32")
	g.AddPrint("c", "(int)82")
	g.AddPrint("c", "(int)97")
	g.AddPrint("c", "(int)110")
	g.AddPrint("c", "(int)103")
	g.AddPrint("c", "(int)101")
	g.AddPrint("c", "(int)10")
	g.Finish_func()
}

func (g *Generador) Func_Nat_Abso() {
	g.Ini_func("void", "Native_Abs")
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()

	g.AddExpression(temporalin1, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin1+"]", "", "")
	g.AddIf(temporalin2, "0", "<", labelsito1)
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddExpression(temporalin2, temporalin2, "-1", "*")
	g.AddLabel(labelsito2)
	g.AddStack("P", temporalin2)
	g.Finish_func()
}

func (g *Generador) Func_Nat_Len_Vector() {
	g.Ini_func("void", "Native_Len_Vector")
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()

	g.AddExpression(temporalin1, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin3, "0", "", "")
	g.AddIf(temporalin2, "-1", "==", labelsito1)
	g.AddExpression(temporalin4, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin2, temporalin2, "1", "+")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddLabel(labelsito2)
	g.AddIf(temporalin3, temporalin4, ">=", labelsito1)
	g.AddIf(temporalin5, "-415", "==", labelsito1)
	g.AddExpression(temporalin3, temporalin3, "1", "+")
	g.AddExpression(temporalin2, temporalin2, "1", "+")
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddStack("P", temporalin3)
	g.Finish_func()

}

func (g *Generador) Func_Nat_Push_Vector() {
	g.Ini_func("void", "Native_Push_Vector")
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	temporalin7 := g.NewTemp()
	labelsito1 := g.NewLabel()
	labelsito2 := g.NewLabel()
	labelsito3 := g.NewLabel()

	g.AddExpression(temporalin1, "P", "1", "+")
	g.AddExpression(temporalin2, "STACK[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin3, "P", "2", "+")
	g.AddExpression(temporalin4, "STACK[(int)"+temporalin3+"]", "", "")
	g.AddExpression(temporalin5, "0", "", "")
	g.AddIf(temporalin2, "-1", "==", labelsito3)
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin2, temporalin2, "1", "+")
	g.AddExpression(temporalin7, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddLabel(labelsito2)
	g.AddIf(temporalin5, temporalin6, ">=", labelsito3)
	g.AddIf(temporalin7, "-415", "==", labelsito1)
	g.AddExpression(temporalin5, temporalin5, "1", "+")
	g.AddExpression(temporalin2, temporalin2, "1", "+")
	g.AddExpression(temporalin7, "HEAP[(int)"+temporalin2+"]", "", "")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito1)
	g.AddHeap(temporalin2, temporalin4)
	g.AddLabel(labelsito3)

	g.Finish_func()
}

func (g *Generador) Func_Nat_Insert_Vector() {
	g.Ini_func("void", "Native_Insert_Vector")
	temporalin0 := g.NewTemp()
	temporalin1 := g.NewTemp()
	temporalin2 := g.NewTemp()
	temporalin3 := g.NewTemp()
	temporalin4 := g.NewTemp()
	temporalin5 := g.NewTemp()
	temporalin6 := g.NewTemp()
	labelsito0 := g.NewLabel()
	labelsito1 := g.NewLabel()

	g.AddExpression(temporalin0, "P", "1", "+")
	g.AddExpression(temporalin1, "STACK[(int)"+temporalin0+"]", "", "")
	g.AddExpression(temporalin2, "P", "2", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin4, "P", "3", "+")
	g.AddExpression(temporalin5, "STACK[(int)"+temporalin4+"]", "", "")
	g.AddIf(temporalin1, "-1", "==", labelsito0)
	g.AddExpression(temporalin6, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddIf(temporalin3, temporalin6, ">=", labelsito0)
	g.AddExpression(temporalin1, temporalin1, "1", "+")
	g.AddExpression(temporalin1, temporalin3, temporalin1, "+")
	g.AddHeap(temporalin1, temporalin5)
	g.AddGoTo(labelsito1)
	g.AddLabel(labelsito0)
	g.Bring_Func("Native_Out_Range")
	g.AddLabel(labelsito1)
	g.Finish_func()

}

func (g *Generador) Func_Nat_Remove_Vector() {
	g.Ini_func("void", "Native_Remove_Vector")

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

	g.AddExpression(temporalin0, "P", "1", "+")
	g.AddExpression(temporalin1, "STACK[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin2, "P", "2", "+")
	g.AddExpression(temporalin3, "STACK[(int)"+temporalin2+"]", "", "")
	g.AddExpression(temporalin4, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddExpression(temporalin5, "0", "", "")
	g.AddExpression(temporalin6, "0", "", "")
	g.AddExpression(temporalin8, "0", "", "")
	g.AddIf(temporalin3, temporalin4, ">=", labelsito0)
	g.AddExpression(temporalin1, temporalin1, "1", "+")
	g.AddExpression(temporalin1, temporalin1, temporalin3, "+")
	g.AddExpression(temporalin8, "HEAP[(int)"+temporalin1+"]", "", "")
	g.AddLabel(labelsito1)
	g.AddExpression(temporalin7, temporalin1, "1", "+")
	g.AddIf(temporalin7, temporalin4, ">", labelsito3)
	g.AddExpression(temporalin5, "HEAP[(int)"+temporalin7+"]", "", "")
	g.AddHeap(temporalin1, temporalin5)
	g.AddExpression(temporalin1, temporalin1, "1", "+")
	g.AddGoTo(labelsito1)
	g.AddLabel(labelsito3)
	g.AddExpression(temporalin7, temporalin7, "1", "-")
	g.AddHeap(temporalin7, "-415")
	g.AddGoTo(labelsito2)
	g.AddLabel(labelsito0)
	g.Bring_Func("Native_Out_Range")
	g.AddLabel(labelsito2)
	g.AddStack("P", temporalin8)
	g.Finish_func()
}

func (g *Generador) Bring_Func(id string) {
	g.AddInstruc(id + "();")
}

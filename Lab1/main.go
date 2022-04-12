package main

import (
	"LAB1/Clases/enviroment"
	"encoding/json"
	"fmt"
	"html/template"
	"io/ioutil"
	"net/http"
	"parser"
	"reflect"

	p_Controlador "LAB1/Clases/Controlador"
	p_Errores "LAB1/Clases/Errores"
	p_Generador "LAB1/Clases/Generador"
	p_Instruction "LAB1/Clases/instruction"

	"LAB1/Clases/interfaces"

	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/colegno/arraylist"
)

var controlador p_Controlador.Controlador2
var generador p_Generador.Generador
var env_uni enviroment.Enviroment
var list_sim *arraylist.List
var list_mod *arraylist.List
var list_tablitas *arraylist.List

type Data struct {
	Consola string
}

type Lista_Errores struct {
	Listita   []p_Errores.Error
	Listita_S []Simbolines
	Listita_M []Modulines
	Listita_T []Tablitas
}

type Simbolines struct {
	Id        string
	Tipo_Dato string
	Ambito    string
	Fila      int
	Columna   int
}

type Modulines struct {
	Nombre    string
	No_Tablas int
	Line      int
}
type Tablitas struct {
	Nombre     string
	Base       string
	Visibildad string
	Linea      int
}

//Funciones Front

var tmpl *template.Template

func init() {
	tmpl = template.Must(template.ParseGlob("src/templates/*.html"))
}

func InitialPage(w http.ResponseWriter, r *http.Request) {
	tmpl.ExecuteTemplate(w, "index.html", nil)
}

func ReportsPage(w http.ResponseWriter, r *http.Request) {
	var lista_to_Send Lista_Errores
	for i := 0; i < controlador.Errores.Len(); i++ {
		lista_to_Send.Listita = append(lista_to_Send.Listita, controlador.Errores.GetValue(i).(p_Errores.Error))
	}
	for i := 0; i < list_sim.Len(); i++ {
		lista_to_Send.Listita_S = append(lista_to_Send.Listita_S, list_sim.GetValue(i).(Simbolines))
	}
	for i := 0; i < list_mod.Len(); i++ {
		lista_to_Send.Listita_M = append(lista_to_Send.Listita_M, list_mod.GetValue(i).(Modulines))
	}
	for i := 0; i < list_tablitas.Len(); i++ {
		lista_to_Send.Listita_T = append(lista_to_Send.Listita_T, list_tablitas.GetValue(i).(Tablitas))
	}

	tmpl.ExecuteTemplate(w, "Reportes.html", lista_to_Send)
}

//Peticiones Back

func Consola_Back(w http.ResponseWriter, r *http.Request) {

	controlador.Consola = ""
	controlador.Errores.Clear()

	var newDoc Data
	reqBody, err := ioutil.ReadAll(r.Body)
	if err != nil {
		json.NewEncoder(w).Encode("Error")
	}
	json.Unmarshal(reqBody, &newDoc)
	fmt.Println("Parser: ")
	is := antlr.NewInputStream(newDoc.Consola)
	lexer := parser.NewInterprete_lex(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := parser.NewInterprete(stream)

	p.BuildParseTrees = true
	tree := p.Start()

	antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)
	//fmt.Println(controlador.Errores)
	fmt.Println("End")
	json.NewEncoder(w).Encode(controlador)
}

//Funciones Back

type TreeShapeListener struct {
	*parser.BaseInterpreteListener
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	result := ctx.GetLista()

	var globalEnv enviroment.Enviroment

	globalEnv = enviroment.NewEnviroment(nil)
	env_uni_tmp := enviroment.NewEnviroment(nil)
	generador = *p_Generador.NewGene()
	var salida string
	salida = ""
	/*
		for _, s := range result.ToArray() {
			if reflect.TypeOf(s).String() == "instruction.Funcion" {
				s.(p_Instruction.Funcion).GuardarFunc(&controlador, globalEnv, env_uni_tmp)
			} else if reflect.TypeOf(s).String() == "structs.Struct" {
				s.(p_Structs.Struct).GuardarStruct(&controlador, globalEnv)
			} else if reflect.TypeOf(s).String() == "modulos.Modulos" {
				s.(p_Modulos.Modulos).Ejecutar(&controlador, globalEnv, env_uni_tmp)
			}
		}
	*/

	for _, s := range result.ToArray() {
		if reflect.TypeOf(s).String() == "instruction.Funcion" {
			if s.(p_Instruction.Funcion).Id == "main" {
				s.(interfaces.Instruction).Ejecutar(&controlador, &generador, globalEnv, env_uni_tmp)

			}
		}
	}

	generador.Func_Nat_Print_True()
	generador.Func_Nat_Print_False()
	generador.Func_Nat_Print_MathError()

	salida += "#include <stdio.h>\n"
	salida += "#include <math.h>\n"
	salida += "double HEAP[82000];\n"
	salida += "double STACK[82000];\n"
	salida += "double P;\n"
	salida += "double H;\n"
	salida += "double "

	salida += fmt.Sprintf("%v", generador.GetTemps().GetValue(0))
	generador.GetTemps().RemoveAtIndex(0)

	for _, s := range generador.GetTemps().ToArray() {
		salida += ", "
		salida += fmt.Sprintf("%v", s)
	}

	salida += ";\n\n"

	for _, s := range generador.GetFunctions().ToArray() {
		salida += fmt.Sprintf("%v", s)
		salida += "\n"
	}

	salida += "\nvoid main(){\n"

	for _, s := range generador.GetCode().ToArray() {
		salida += fmt.Sprintf("%v", s)
		salida += "\n"
	}

	salida += "\nreturn;\n}\n"
	controlador.Consola = salida

	/*
		env_uni = env_uni_tmp
		sup := arraylist.New()
		sup2 := arraylist.New()
		sup3 := arraylist.New()
		for _, element := range env_uni.GetVariable_Env() {
			a := Simbolines{
				Id:        element.Id,
				Tipo_Dato: GetType(element.Tipo),
				Ambito:    element.Ambito,
				Fila:      element.Fila,
				Columna:   element.Columna,
			}
			sup.Add(a)
		}
		for _, element := range globalEnv.GetModulos_Env() {
			conta := 0
			for _, f := range element.Valor.(*arraylist.List).ToArray() {
				if reflect.TypeOf(f).String() == "modulos.Modulos" {
					conta = conta + 1
				}
			}

			a := Modulines{
				Nombre:    element.Id,
				No_Tablas: conta,
				Line:      element.Fila,
			}
			sup2.Add(a)
		}

		for _, element := range globalEnv.GetModulos_Env() {
			for _, f := range element.Valor.(*arraylist.List).ToArray() {
				if reflect.TypeOf(f).String() == "modulos.Modulos" {
					a := Tablitas{
						Nombre:     f.(p_Modulos.Modulos).ID,
						Base:       element.Id,
						Visibildad: GetVisi(f.(p_Modulos.Modulos).Available),
						Linea:      f.(p_Modulos.Modulos).Linea,
					}
					sup3.Add(a)
				}
			}
		}
		list_tablitas = sup3
		list_mod = sup2
		list_sim = sup
	*/
}

func main() {

	fs := http.FileServer(http.Dir("src"))
	http.Handle("/src/", http.StripPrefix("/src/", fs))
	http.Handle("/", http.RedirectHandler("/Inicio", 302))

	//Front
	http.HandleFunc("/Inicio", InitialPage)
	http.HandleFunc("/Reportes", ReportsPage)

	//Back

	http.HandleFunc("/Consola_Back", Consola_Back)

	//Listener
	http.ListenAndServe(":3000", nil)
}

func GetType(tipo interfaces.TipoExpresion) string {
	var a string
	switch tipo {
	case interfaces.STR:
		return "&str"
	case interfaces.STRING:
		return "String"
	case interfaces.INTEGER:
		return "i64"
	case interfaces.FLOAT:
		return "f64"
	case interfaces.ARRAY:
		return "Array"
	case interfaces.VECTOR:
		return "Vector"
	case interfaces.USIZE:
		return "Usize"
	default:
		return "Funcion"
	}

	return a
}

func GetVisi(tipo interfaces.Available) string {
	switch tipo {
	case interfaces.PUBLICO:
		return "Publico"
	case interfaces.PRIVADO:
		return "Privado"
	}
	return ""
}

/*
	fmt.Println("Parser: ")
	is := antlr.NewInputStream("println!(\"Holis\");")
	lexer := parser.NewInterprete_lex(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := parser.NewInterprete(stream)

	p.BuildParseTrees = true
	tree := p.Start()

	antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)
	fmt.Println("End")
*/

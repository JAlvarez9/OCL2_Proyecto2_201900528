package Controlador

import (
	"github.com/colegno/arraylist"
)

type Controlador2 struct {
	Errores arraylist.List
	Consola string
}

func (this *Controlador2) Agregar_Consola(a string) {

	this.Consola += a + "\n"
	//fmt.Println("Se agrego!!")
}

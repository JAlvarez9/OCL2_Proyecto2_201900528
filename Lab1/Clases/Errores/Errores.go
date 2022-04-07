package Errores

import (
	"fmt"
	"time"
)

type Error struct {
	Descripcion string
	Ambito      string
	Linea       int
	Columna     int
	Fecha       string
}

func NewError(descr string, ambit string, line int, col int) Error {
	t := time.Now()
	fecha := fmt.Sprintf("%d-%02d-%02dT%02d:%02d:%02d",
		t.Year(), t.Month(), t.Day(),
		t.Hour(), t.Minute(), t.Second())
	exp := Error{
		Descripcion: descr,
		Ambito:      ambit,
		Linea:       line,
		Columna:     col,
		Fecha:       fecha,
	}
	return exp
}

// Code generated from Interprete.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser // Interprete

import "github.com/antlr/antlr4/runtime/Go/antlr"

// InterpreteListener is a complete listener for a parse tree produced by Interprete.
type InterpreteListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterInstrucciones is called when entering the instrucciones production.
	EnterInstrucciones(c *InstruccionesContext)

	// EnterInstruccion is called when entering the instruccion production.
	EnterInstruccion(c *InstruccionContext)

	// EnterSent_Modulos is called when entering the sent_Modulos production.
	EnterSent_Modulos(c *Sent_ModulosContext)

	// EnterIntructions_modulos is called when entering the intructions_modulos production.
	EnterIntructions_modulos(c *Intructions_modulosContext)

	// EnterInstruct_modulos is called when entering the instruct_modulos production.
	EnterInstruct_modulos(c *Instruct_modulosContext)

	// EnterSent_struct is called when entering the sent_struct production.
	EnterSent_struct(c *Sent_structContext)

	// EnterAtributos_struct is called when entering the atributos_struct production.
	EnterAtributos_struct(c *Atributos_structContext)

	// EnterAtributos_struct_decl is called when entering the atributos_struct_decl production.
	EnterAtributos_struct_decl(c *Atributos_struct_declContext)

	// EnterSent_funcion is called when entering the sent_funcion production.
	EnterSent_funcion(c *Sent_funcionContext)

	// EnterParams_funcion is called when entering the params_funcion production.
	EnterParams_funcion(c *Params_funcionContext)

	// EnterParams_funcion_decl is called when entering the params_funcion_decl production.
	EnterParams_funcion_decl(c *Params_funcion_declContext)

	// EnterSent_Llamada is called when entering the sent_Llamada production.
	EnterSent_Llamada(c *Sent_LlamadaContext)

	// EnterParams_llamada is called when entering the params_llamada production.
	EnterParams_llamada(c *Params_llamadaContext)

	// EnterFunciones_Trans is called when entering the funciones_Trans production.
	EnterFunciones_Trans(c *Funciones_TransContext)

	// EnterDeclaracion is called when entering the declaracion production.
	EnterDeclaracion(c *DeclaracionContext)

	// EnterArray_decl is called when entering the array_decl production.
	EnterArray_decl(c *Array_declContext)

	// EnterArray_decl_array is called when entering the array_decl_array production.
	EnterArray_decl_array(c *Array_decl_arrayContext)

	// EnterVector_decl is called when entering the vector_decl production.
	EnterVector_decl(c *Vector_declContext)

	// EnterVector_expr is called when entering the vector_expr production.
	EnterVector_expr(c *Vector_exprContext)

	// EnterSent_funciones_Vec is called when entering the sent_funciones_Vec production.
	EnterSent_funciones_Vec(c *Sent_funciones_VecContext)

	// EnterSentencias_expr is called when entering the sentencias_expr production.
	EnterSentencias_expr(c *Sentencias_exprContext)

	// EnterSent_matchexpr is called when entering the sent_matchexpr production.
	EnterSent_matchexpr(c *Sent_matchexprContext)

	// EnterMatchexpr_listbrazos is called when entering the matchexpr_listbrazos production.
	EnterMatchexpr_listbrazos(c *Matchexpr_listbrazosContext)

	// EnterList_brazosexpr is called when entering the list_brazosexpr production.
	EnterList_brazosexpr(c *List_brazosexprContext)

	// EnterMatchexpr_listbrazosexpr_listexpr is called when entering the matchexpr_listbrazosexpr_listexpr production.
	EnterMatchexpr_listbrazosexpr_listexpr(c *Matchexpr_listbrazosexpr_listexprContext)

	// EnterEl_defaultexpr is called when entering the el_defaultexpr production.
	EnterEl_defaultexpr(c *El_defaultexprContext)

	// EnterTipo is called when entering the tipo production.
	EnterTipo(c *TipoContext)

	// EnterAsignacion is called when entering the asignacion production.
	EnterAsignacion(c *AsignacionContext)

	// EnterAsig_array_vect is called when entering the asig_array_vect production.
	EnterAsig_array_vect(c *Asig_array_vectContext)

	// EnterSent_if_expr is called when entering the sent_if_expr production.
	EnterSent_if_expr(c *Sent_if_exprContext)

	// EnterSent_instru_if_expre is called when entering the sent_instru_if_expre production.
	EnterSent_instru_if_expre(c *Sent_instru_if_expreContext)

	// EnterSent_loop_expr is called when entering the sent_loop_expr production.
	EnterSent_loop_expr(c *Sent_loop_exprContext)

	// EnterPrintaso is called when entering the printaso production.
	EnterPrintaso(c *PrintasoContext)

	// EnterList_expre_print is called when entering the list_expre_print production.
	EnterList_expre_print(c *List_expre_printContext)

	// EnterList_expre_vec_arr is called when entering the list_expre_vec_arr production.
	EnterList_expre_vec_arr(c *List_expre_vec_arrContext)

	// EnterSent_if is called when entering the sent_if production.
	EnterSent_if(c *Sent_ifContext)

	// EnterSent_match is called when entering the sent_match production.
	EnterSent_match(c *Sent_matchContext)

	// EnterMatch_listbrazos is called when entering the match_listbrazos production.
	EnterMatch_listbrazos(c *Match_listbrazosContext)

	// EnterList_brazos is called when entering the list_brazos production.
	EnterList_brazos(c *List_brazosContext)

	// EnterMatch_listbrazos_listexpr is called when entering the match_listbrazos_listexpr production.
	EnterMatch_listbrazos_listexpr(c *Match_listbrazos_listexprContext)

	// EnterEl_default is called when entering the el_default production.
	EnterEl_default(c *El_defaultContext)

	// EnterSent_loop is called when entering the sent_loop production.
	EnterSent_loop(c *Sent_loopContext)

	// EnterSent_while is called when entering the sent_while production.
	EnterSent_while(c *Sent_whileContext)

	// EnterSent_ForIn is called when entering the sent_ForIn production.
	EnterSent_ForIn(c *Sent_ForInContext)

	// EnterExpression_vec_Arr is called when entering the expression_vec_Arr production.
	EnterExpression_vec_Arr(c *Expression_vec_ArrContext)

	// EnterAtributos_struct_exp is called when entering the atributos_struct_exp production.
	EnterAtributos_struct_exp(c *Atributos_struct_expContext)

	// EnterAtributos_struct_decl_exp is called when entering the atributos_struct_decl_exp production.
	EnterAtributos_struct_decl_exp(c *Atributos_struct_decl_expContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterLlamada_expre is called when entering the llamada_expre production.
	EnterLlamada_expre(c *Llamada_expreContext)

	// EnterPrimitivo is called when entering the primitivo production.
	EnterPrimitivo(c *PrimitivoContext)

	// EnterList_array is called when entering the list_array production.
	EnterList_array(c *List_arrayContext)

	// EnterLlamadas_structs is called when entering the llamadas_structs production.
	EnterLlamadas_structs(c *Llamadas_structsContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstrucciones is called when exiting the instrucciones production.
	ExitInstrucciones(c *InstruccionesContext)

	// ExitInstruccion is called when exiting the instruccion production.
	ExitInstruccion(c *InstruccionContext)

	// ExitSent_Modulos is called when exiting the sent_Modulos production.
	ExitSent_Modulos(c *Sent_ModulosContext)

	// ExitIntructions_modulos is called when exiting the intructions_modulos production.
	ExitIntructions_modulos(c *Intructions_modulosContext)

	// ExitInstruct_modulos is called when exiting the instruct_modulos production.
	ExitInstruct_modulos(c *Instruct_modulosContext)

	// ExitSent_struct is called when exiting the sent_struct production.
	ExitSent_struct(c *Sent_structContext)

	// ExitAtributos_struct is called when exiting the atributos_struct production.
	ExitAtributos_struct(c *Atributos_structContext)

	// ExitAtributos_struct_decl is called when exiting the atributos_struct_decl production.
	ExitAtributos_struct_decl(c *Atributos_struct_declContext)

	// ExitSent_funcion is called when exiting the sent_funcion production.
	ExitSent_funcion(c *Sent_funcionContext)

	// ExitParams_funcion is called when exiting the params_funcion production.
	ExitParams_funcion(c *Params_funcionContext)

	// ExitParams_funcion_decl is called when exiting the params_funcion_decl production.
	ExitParams_funcion_decl(c *Params_funcion_declContext)

	// ExitSent_Llamada is called when exiting the sent_Llamada production.
	ExitSent_Llamada(c *Sent_LlamadaContext)

	// ExitParams_llamada is called when exiting the params_llamada production.
	ExitParams_llamada(c *Params_llamadaContext)

	// ExitFunciones_Trans is called when exiting the funciones_Trans production.
	ExitFunciones_Trans(c *Funciones_TransContext)

	// ExitDeclaracion is called when exiting the declaracion production.
	ExitDeclaracion(c *DeclaracionContext)

	// ExitArray_decl is called when exiting the array_decl production.
	ExitArray_decl(c *Array_declContext)

	// ExitArray_decl_array is called when exiting the array_decl_array production.
	ExitArray_decl_array(c *Array_decl_arrayContext)

	// ExitVector_decl is called when exiting the vector_decl production.
	ExitVector_decl(c *Vector_declContext)

	// ExitVector_expr is called when exiting the vector_expr production.
	ExitVector_expr(c *Vector_exprContext)

	// ExitSent_funciones_Vec is called when exiting the sent_funciones_Vec production.
	ExitSent_funciones_Vec(c *Sent_funciones_VecContext)

	// ExitSentencias_expr is called when exiting the sentencias_expr production.
	ExitSentencias_expr(c *Sentencias_exprContext)

	// ExitSent_matchexpr is called when exiting the sent_matchexpr production.
	ExitSent_matchexpr(c *Sent_matchexprContext)

	// ExitMatchexpr_listbrazos is called when exiting the matchexpr_listbrazos production.
	ExitMatchexpr_listbrazos(c *Matchexpr_listbrazosContext)

	// ExitList_brazosexpr is called when exiting the list_brazosexpr production.
	ExitList_brazosexpr(c *List_brazosexprContext)

	// ExitMatchexpr_listbrazosexpr_listexpr is called when exiting the matchexpr_listbrazosexpr_listexpr production.
	ExitMatchexpr_listbrazosexpr_listexpr(c *Matchexpr_listbrazosexpr_listexprContext)

	// ExitEl_defaultexpr is called when exiting the el_defaultexpr production.
	ExitEl_defaultexpr(c *El_defaultexprContext)

	// ExitTipo is called when exiting the tipo production.
	ExitTipo(c *TipoContext)

	// ExitAsignacion is called when exiting the asignacion production.
	ExitAsignacion(c *AsignacionContext)

	// ExitAsig_array_vect is called when exiting the asig_array_vect production.
	ExitAsig_array_vect(c *Asig_array_vectContext)

	// ExitSent_if_expr is called when exiting the sent_if_expr production.
	ExitSent_if_expr(c *Sent_if_exprContext)

	// ExitSent_instru_if_expre is called when exiting the sent_instru_if_expre production.
	ExitSent_instru_if_expre(c *Sent_instru_if_expreContext)

	// ExitSent_loop_expr is called when exiting the sent_loop_expr production.
	ExitSent_loop_expr(c *Sent_loop_exprContext)

	// ExitPrintaso is called when exiting the printaso production.
	ExitPrintaso(c *PrintasoContext)

	// ExitList_expre_print is called when exiting the list_expre_print production.
	ExitList_expre_print(c *List_expre_printContext)

	// ExitList_expre_vec_arr is called when exiting the list_expre_vec_arr production.
	ExitList_expre_vec_arr(c *List_expre_vec_arrContext)

	// ExitSent_if is called when exiting the sent_if production.
	ExitSent_if(c *Sent_ifContext)

	// ExitSent_match is called when exiting the sent_match production.
	ExitSent_match(c *Sent_matchContext)

	// ExitMatch_listbrazos is called when exiting the match_listbrazos production.
	ExitMatch_listbrazos(c *Match_listbrazosContext)

	// ExitList_brazos is called when exiting the list_brazos production.
	ExitList_brazos(c *List_brazosContext)

	// ExitMatch_listbrazos_listexpr is called when exiting the match_listbrazos_listexpr production.
	ExitMatch_listbrazos_listexpr(c *Match_listbrazos_listexprContext)

	// ExitEl_default is called when exiting the el_default production.
	ExitEl_default(c *El_defaultContext)

	// ExitSent_loop is called when exiting the sent_loop production.
	ExitSent_loop(c *Sent_loopContext)

	// ExitSent_while is called when exiting the sent_while production.
	ExitSent_while(c *Sent_whileContext)

	// ExitSent_ForIn is called when exiting the sent_ForIn production.
	ExitSent_ForIn(c *Sent_ForInContext)

	// ExitExpression_vec_Arr is called when exiting the expression_vec_Arr production.
	ExitExpression_vec_Arr(c *Expression_vec_ArrContext)

	// ExitAtributos_struct_exp is called when exiting the atributos_struct_exp production.
	ExitAtributos_struct_exp(c *Atributos_struct_expContext)

	// ExitAtributos_struct_decl_exp is called when exiting the atributos_struct_decl_exp production.
	ExitAtributos_struct_decl_exp(c *Atributos_struct_decl_expContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitLlamada_expre is called when exiting the llamada_expre production.
	ExitLlamada_expre(c *Llamada_expreContext)

	// ExitPrimitivo is called when exiting the primitivo production.
	ExitPrimitivo(c *PrimitivoContext)

	// ExitList_array is called when exiting the list_array production.
	ExitList_array(c *List_arrayContext)

	// ExitLlamadas_structs is called when exiting the llamadas_structs production.
	ExitLlamadas_structs(c *Llamadas_structsContext)
}

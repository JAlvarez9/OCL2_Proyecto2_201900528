// Code generated from Interprete.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser // Interprete

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseInterpreteListener is a complete listener for a parse tree produced by Interprete.
type BaseInterpreteListener struct{}

var _ InterpreteListener = &BaseInterpreteListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseInterpreteListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseInterpreteListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseInterpreteListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseInterpreteListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseInterpreteListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseInterpreteListener) ExitStart(ctx *StartContext) {}

// EnterInstrucciones is called when production instrucciones is entered.
func (s *BaseInterpreteListener) EnterInstrucciones(ctx *InstruccionesContext) {}

// ExitInstrucciones is called when production instrucciones is exited.
func (s *BaseInterpreteListener) ExitInstrucciones(ctx *InstruccionesContext) {}

// EnterInstruccion is called when production instruccion is entered.
func (s *BaseInterpreteListener) EnterInstruccion(ctx *InstruccionContext) {}

// ExitInstruccion is called when production instruccion is exited.
func (s *BaseInterpreteListener) ExitInstruccion(ctx *InstruccionContext) {}

// EnterSent_Modulos is called when production sent_Modulos is entered.
func (s *BaseInterpreteListener) EnterSent_Modulos(ctx *Sent_ModulosContext) {}

// ExitSent_Modulos is called when production sent_Modulos is exited.
func (s *BaseInterpreteListener) ExitSent_Modulos(ctx *Sent_ModulosContext) {}

// EnterIntructions_modulos is called when production intructions_modulos is entered.
func (s *BaseInterpreteListener) EnterIntructions_modulos(ctx *Intructions_modulosContext) {}

// ExitIntructions_modulos is called when production intructions_modulos is exited.
func (s *BaseInterpreteListener) ExitIntructions_modulos(ctx *Intructions_modulosContext) {}

// EnterInstruct_modulos is called when production instruct_modulos is entered.
func (s *BaseInterpreteListener) EnterInstruct_modulos(ctx *Instruct_modulosContext) {}

// ExitInstruct_modulos is called when production instruct_modulos is exited.
func (s *BaseInterpreteListener) ExitInstruct_modulos(ctx *Instruct_modulosContext) {}

// EnterSent_struct is called when production sent_struct is entered.
func (s *BaseInterpreteListener) EnterSent_struct(ctx *Sent_structContext) {}

// ExitSent_struct is called when production sent_struct is exited.
func (s *BaseInterpreteListener) ExitSent_struct(ctx *Sent_structContext) {}

// EnterAtributos_struct is called when production atributos_struct is entered.
func (s *BaseInterpreteListener) EnterAtributos_struct(ctx *Atributos_structContext) {}

// ExitAtributos_struct is called when production atributos_struct is exited.
func (s *BaseInterpreteListener) ExitAtributos_struct(ctx *Atributos_structContext) {}

// EnterAtributos_struct_decl is called when production atributos_struct_decl is entered.
func (s *BaseInterpreteListener) EnterAtributos_struct_decl(ctx *Atributos_struct_declContext) {}

// ExitAtributos_struct_decl is called when production atributos_struct_decl is exited.
func (s *BaseInterpreteListener) ExitAtributos_struct_decl(ctx *Atributos_struct_declContext) {}

// EnterSent_funcion is called when production sent_funcion is entered.
func (s *BaseInterpreteListener) EnterSent_funcion(ctx *Sent_funcionContext) {}

// ExitSent_funcion is called when production sent_funcion is exited.
func (s *BaseInterpreteListener) ExitSent_funcion(ctx *Sent_funcionContext) {}

// EnterParams_funcion is called when production params_funcion is entered.
func (s *BaseInterpreteListener) EnterParams_funcion(ctx *Params_funcionContext) {}

// ExitParams_funcion is called when production params_funcion is exited.
func (s *BaseInterpreteListener) ExitParams_funcion(ctx *Params_funcionContext) {}

// EnterParams_funcion_decl is called when production params_funcion_decl is entered.
func (s *BaseInterpreteListener) EnterParams_funcion_decl(ctx *Params_funcion_declContext) {}

// ExitParams_funcion_decl is called when production params_funcion_decl is exited.
func (s *BaseInterpreteListener) ExitParams_funcion_decl(ctx *Params_funcion_declContext) {}

// EnterSent_Llamada is called when production sent_Llamada is entered.
func (s *BaseInterpreteListener) EnterSent_Llamada(ctx *Sent_LlamadaContext) {}

// ExitSent_Llamada is called when production sent_Llamada is exited.
func (s *BaseInterpreteListener) ExitSent_Llamada(ctx *Sent_LlamadaContext) {}

// EnterParams_llamada is called when production params_llamada is entered.
func (s *BaseInterpreteListener) EnterParams_llamada(ctx *Params_llamadaContext) {}

// ExitParams_llamada is called when production params_llamada is exited.
func (s *BaseInterpreteListener) ExitParams_llamada(ctx *Params_llamadaContext) {}

// EnterFunciones_Trans is called when production funciones_Trans is entered.
func (s *BaseInterpreteListener) EnterFunciones_Trans(ctx *Funciones_TransContext) {}

// ExitFunciones_Trans is called when production funciones_Trans is exited.
func (s *BaseInterpreteListener) ExitFunciones_Trans(ctx *Funciones_TransContext) {}

// EnterDeclaracion is called when production declaracion is entered.
func (s *BaseInterpreteListener) EnterDeclaracion(ctx *DeclaracionContext) {}

// ExitDeclaracion is called when production declaracion is exited.
func (s *BaseInterpreteListener) ExitDeclaracion(ctx *DeclaracionContext) {}

// EnterArray_decl is called when production array_decl is entered.
func (s *BaseInterpreteListener) EnterArray_decl(ctx *Array_declContext) {}

// ExitArray_decl is called when production array_decl is exited.
func (s *BaseInterpreteListener) ExitArray_decl(ctx *Array_declContext) {}

// EnterArray_decl_array is called when production array_decl_array is entered.
func (s *BaseInterpreteListener) EnterArray_decl_array(ctx *Array_decl_arrayContext) {}

// ExitArray_decl_array is called when production array_decl_array is exited.
func (s *BaseInterpreteListener) ExitArray_decl_array(ctx *Array_decl_arrayContext) {}

// EnterVector_decl is called when production vector_decl is entered.
func (s *BaseInterpreteListener) EnterVector_decl(ctx *Vector_declContext) {}

// ExitVector_decl is called when production vector_decl is exited.
func (s *BaseInterpreteListener) ExitVector_decl(ctx *Vector_declContext) {}

// EnterVector_expr is called when production vector_expr is entered.
func (s *BaseInterpreteListener) EnterVector_expr(ctx *Vector_exprContext) {}

// ExitVector_expr is called when production vector_expr is exited.
func (s *BaseInterpreteListener) ExitVector_expr(ctx *Vector_exprContext) {}

// EnterSent_funciones_Vec is called when production sent_funciones_Vec is entered.
func (s *BaseInterpreteListener) EnterSent_funciones_Vec(ctx *Sent_funciones_VecContext) {}

// ExitSent_funciones_Vec is called when production sent_funciones_Vec is exited.
func (s *BaseInterpreteListener) ExitSent_funciones_Vec(ctx *Sent_funciones_VecContext) {}

// EnterSentencias_expr is called when production sentencias_expr is entered.
func (s *BaseInterpreteListener) EnterSentencias_expr(ctx *Sentencias_exprContext) {}

// ExitSentencias_expr is called when production sentencias_expr is exited.
func (s *BaseInterpreteListener) ExitSentencias_expr(ctx *Sentencias_exprContext) {}

// EnterSent_matchexpr is called when production sent_matchexpr is entered.
func (s *BaseInterpreteListener) EnterSent_matchexpr(ctx *Sent_matchexprContext) {}

// ExitSent_matchexpr is called when production sent_matchexpr is exited.
func (s *BaseInterpreteListener) ExitSent_matchexpr(ctx *Sent_matchexprContext) {}

// EnterMatchexpr_listbrazos is called when production matchexpr_listbrazos is entered.
func (s *BaseInterpreteListener) EnterMatchexpr_listbrazos(ctx *Matchexpr_listbrazosContext) {}

// ExitMatchexpr_listbrazos is called when production matchexpr_listbrazos is exited.
func (s *BaseInterpreteListener) ExitMatchexpr_listbrazos(ctx *Matchexpr_listbrazosContext) {}

// EnterList_brazosexpr is called when production list_brazosexpr is entered.
func (s *BaseInterpreteListener) EnterList_brazosexpr(ctx *List_brazosexprContext) {}

// ExitList_brazosexpr is called when production list_brazosexpr is exited.
func (s *BaseInterpreteListener) ExitList_brazosexpr(ctx *List_brazosexprContext) {}

// EnterMatchexpr_listbrazosexpr_listexpr is called when production matchexpr_listbrazosexpr_listexpr is entered.
func (s *BaseInterpreteListener) EnterMatchexpr_listbrazosexpr_listexpr(ctx *Matchexpr_listbrazosexpr_listexprContext) {
}

// ExitMatchexpr_listbrazosexpr_listexpr is called when production matchexpr_listbrazosexpr_listexpr is exited.
func (s *BaseInterpreteListener) ExitMatchexpr_listbrazosexpr_listexpr(ctx *Matchexpr_listbrazosexpr_listexprContext) {
}

// EnterEl_defaultexpr is called when production el_defaultexpr is entered.
func (s *BaseInterpreteListener) EnterEl_defaultexpr(ctx *El_defaultexprContext) {}

// ExitEl_defaultexpr is called when production el_defaultexpr is exited.
func (s *BaseInterpreteListener) ExitEl_defaultexpr(ctx *El_defaultexprContext) {}

// EnterTipo is called when production tipo is entered.
func (s *BaseInterpreteListener) EnterTipo(ctx *TipoContext) {}

// ExitTipo is called when production tipo is exited.
func (s *BaseInterpreteListener) ExitTipo(ctx *TipoContext) {}

// EnterAsignacion is called when production asignacion is entered.
func (s *BaseInterpreteListener) EnterAsignacion(ctx *AsignacionContext) {}

// ExitAsignacion is called when production asignacion is exited.
func (s *BaseInterpreteListener) ExitAsignacion(ctx *AsignacionContext) {}

// EnterAsig_array_vect is called when production asig_array_vect is entered.
func (s *BaseInterpreteListener) EnterAsig_array_vect(ctx *Asig_array_vectContext) {}

// ExitAsig_array_vect is called when production asig_array_vect is exited.
func (s *BaseInterpreteListener) ExitAsig_array_vect(ctx *Asig_array_vectContext) {}

// EnterSent_if_expr is called when production sent_if_expr is entered.
func (s *BaseInterpreteListener) EnterSent_if_expr(ctx *Sent_if_exprContext) {}

// ExitSent_if_expr is called when production sent_if_expr is exited.
func (s *BaseInterpreteListener) ExitSent_if_expr(ctx *Sent_if_exprContext) {}

// EnterSent_instru_if_expre is called when production sent_instru_if_expre is entered.
func (s *BaseInterpreteListener) EnterSent_instru_if_expre(ctx *Sent_instru_if_expreContext) {}

// ExitSent_instru_if_expre is called when production sent_instru_if_expre is exited.
func (s *BaseInterpreteListener) ExitSent_instru_if_expre(ctx *Sent_instru_if_expreContext) {}

// EnterSent_loop_expr is called when production sent_loop_expr is entered.
func (s *BaseInterpreteListener) EnterSent_loop_expr(ctx *Sent_loop_exprContext) {}

// ExitSent_loop_expr is called when production sent_loop_expr is exited.
func (s *BaseInterpreteListener) ExitSent_loop_expr(ctx *Sent_loop_exprContext) {}

// EnterPrintaso is called when production printaso is entered.
func (s *BaseInterpreteListener) EnterPrintaso(ctx *PrintasoContext) {}

// ExitPrintaso is called when production printaso is exited.
func (s *BaseInterpreteListener) ExitPrintaso(ctx *PrintasoContext) {}

// EnterList_expre_print is called when production list_expre_print is entered.
func (s *BaseInterpreteListener) EnterList_expre_print(ctx *List_expre_printContext) {}

// ExitList_expre_print is called when production list_expre_print is exited.
func (s *BaseInterpreteListener) ExitList_expre_print(ctx *List_expre_printContext) {}

// EnterList_expre_vec_arr is called when production list_expre_vec_arr is entered.
func (s *BaseInterpreteListener) EnterList_expre_vec_arr(ctx *List_expre_vec_arrContext) {}

// ExitList_expre_vec_arr is called when production list_expre_vec_arr is exited.
func (s *BaseInterpreteListener) ExitList_expre_vec_arr(ctx *List_expre_vec_arrContext) {}

// EnterSent_if is called when production sent_if is entered.
func (s *BaseInterpreteListener) EnterSent_if(ctx *Sent_ifContext) {}

// ExitSent_if is called when production sent_if is exited.
func (s *BaseInterpreteListener) ExitSent_if(ctx *Sent_ifContext) {}

// EnterSent_match is called when production sent_match is entered.
func (s *BaseInterpreteListener) EnterSent_match(ctx *Sent_matchContext) {}

// ExitSent_match is called when production sent_match is exited.
func (s *BaseInterpreteListener) ExitSent_match(ctx *Sent_matchContext) {}

// EnterMatch_listbrazos is called when production match_listbrazos is entered.
func (s *BaseInterpreteListener) EnterMatch_listbrazos(ctx *Match_listbrazosContext) {}

// ExitMatch_listbrazos is called when production match_listbrazos is exited.
func (s *BaseInterpreteListener) ExitMatch_listbrazos(ctx *Match_listbrazosContext) {}

// EnterList_brazos is called when production list_brazos is entered.
func (s *BaseInterpreteListener) EnterList_brazos(ctx *List_brazosContext) {}

// ExitList_brazos is called when production list_brazos is exited.
func (s *BaseInterpreteListener) ExitList_brazos(ctx *List_brazosContext) {}

// EnterMatch_listbrazos_listexpr is called when production match_listbrazos_listexpr is entered.
func (s *BaseInterpreteListener) EnterMatch_listbrazos_listexpr(ctx *Match_listbrazos_listexprContext) {
}

// ExitMatch_listbrazos_listexpr is called when production match_listbrazos_listexpr is exited.
func (s *BaseInterpreteListener) ExitMatch_listbrazos_listexpr(ctx *Match_listbrazos_listexprContext) {
}

// EnterEl_default is called when production el_default is entered.
func (s *BaseInterpreteListener) EnterEl_default(ctx *El_defaultContext) {}

// ExitEl_default is called when production el_default is exited.
func (s *BaseInterpreteListener) ExitEl_default(ctx *El_defaultContext) {}

// EnterSent_loop is called when production sent_loop is entered.
func (s *BaseInterpreteListener) EnterSent_loop(ctx *Sent_loopContext) {}

// ExitSent_loop is called when production sent_loop is exited.
func (s *BaseInterpreteListener) ExitSent_loop(ctx *Sent_loopContext) {}

// EnterSent_while is called when production sent_while is entered.
func (s *BaseInterpreteListener) EnterSent_while(ctx *Sent_whileContext) {}

// ExitSent_while is called when production sent_while is exited.
func (s *BaseInterpreteListener) ExitSent_while(ctx *Sent_whileContext) {}

// EnterSent_ForIn is called when production sent_ForIn is entered.
func (s *BaseInterpreteListener) EnterSent_ForIn(ctx *Sent_ForInContext) {}

// ExitSent_ForIn is called when production sent_ForIn is exited.
func (s *BaseInterpreteListener) ExitSent_ForIn(ctx *Sent_ForInContext) {}

// EnterExpression_vec_Arr is called when production expression_vec_Arr is entered.
func (s *BaseInterpreteListener) EnterExpression_vec_Arr(ctx *Expression_vec_ArrContext) {}

// ExitExpression_vec_Arr is called when production expression_vec_Arr is exited.
func (s *BaseInterpreteListener) ExitExpression_vec_Arr(ctx *Expression_vec_ArrContext) {}

// EnterAtributos_struct_exp is called when production atributos_struct_exp is entered.
func (s *BaseInterpreteListener) EnterAtributos_struct_exp(ctx *Atributos_struct_expContext) {}

// ExitAtributos_struct_exp is called when production atributos_struct_exp is exited.
func (s *BaseInterpreteListener) ExitAtributos_struct_exp(ctx *Atributos_struct_expContext) {}

// EnterAtributos_struct_decl_exp is called when production atributos_struct_decl_exp is entered.
func (s *BaseInterpreteListener) EnterAtributos_struct_decl_exp(ctx *Atributos_struct_decl_expContext) {
}

// ExitAtributos_struct_decl_exp is called when production atributos_struct_decl_exp is exited.
func (s *BaseInterpreteListener) ExitAtributos_struct_decl_exp(ctx *Atributos_struct_decl_expContext) {
}

// EnterExpression is called when production expression is entered.
func (s *BaseInterpreteListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseInterpreteListener) ExitExpression(ctx *ExpressionContext) {}

// EnterLlamada_expre is called when production llamada_expre is entered.
func (s *BaseInterpreteListener) EnterLlamada_expre(ctx *Llamada_expreContext) {}

// ExitLlamada_expre is called when production llamada_expre is exited.
func (s *BaseInterpreteListener) ExitLlamada_expre(ctx *Llamada_expreContext) {}

// EnterPrimitivo is called when production primitivo is entered.
func (s *BaseInterpreteListener) EnterPrimitivo(ctx *PrimitivoContext) {}

// ExitPrimitivo is called when production primitivo is exited.
func (s *BaseInterpreteListener) ExitPrimitivo(ctx *PrimitivoContext) {}

// EnterList_array is called when production list_array is entered.
func (s *BaseInterpreteListener) EnterList_array(ctx *List_arrayContext) {}

// ExitList_array is called when production list_array is exited.
func (s *BaseInterpreteListener) ExitList_array(ctx *List_arrayContext) {}

// EnterLlamadas_structs is called when production llamadas_structs is entered.
func (s *BaseInterpreteListener) EnterLlamadas_structs(ctx *Llamadas_structsContext) {}

// ExitLlamadas_structs is called when production llamadas_structs is exited.
func (s *BaseInterpreteListener) ExitLlamadas_structs(ctx *Llamadas_structsContext) {}

parser grammar Interprete;

options {
    tokenVocab = Interprete_lex;
}

@header { 
    import "LAB1/Clases/interfaces"
    import "LAB1/Clases/expresion"
    import "LAB1/Clases/expresion/Operaciones"
    import "LAB1/Clases/expresion/Sentencias_Expr"
    import "LAB1/Clases/expresion/Sentencias_Expr/Match_Expr"
    import "LAB1/Clases/expresion/Arrays"
    import "LAB1/Clases/expresion/Vector"
    import "LAB1/Clases/expresion/Casteos"
    import "LAB1/Clases/instruction"
    import "LAB1/Clases/instruction/sentenciacontrol"
    import "LAB1/Clases/instruction/SentenciaCiclica"
    import "LAB1/Clases/instruction/SentenciaTransferencia"
    import "LAB1/Clases/instruction/SentenciaControl/Match"
    import "LAB1/Clases/instruction/FuncionesVectores"
    import "LAB1/Clases/instruction/FuncionesNativas"
    import "LAB1/Clases/instruction/Structs"
    import "LAB1/Clases/instruction/Modulos"
    import "LAB1/Clases/Structs_inter"

    import arrayList "github.com/colegno/arraylist"
}

start returns [*arrayList.List lista]
    : instrucciones {$lista = $instrucciones.l}
    ;

instrucciones returns [*arrayList.List l]
    @init{
        $l = arrayList.New()   
    }
    : e += instruccion* {
            listInt := localctx.(*InstruccionesContext).GetE()
                for _, e := range listInt { 
                    $l.Add(e.GetInstr())
                 }
            }
    ;

instruccion returns [interfaces.Instruction instr]
    : printaso PYC{ $instr = $printaso.instr }
    | printaso { $instr = $printaso.instr }
    | declaracion { $instr = $declaracion.instr }
    | vector_decl { $instr = $vector_decl.instr }
    | array_decl { $instr = $array_decl.instr }
    | asignacion { $instr = $asignacion.instr }
    | sent_if   { $instr = $sent_if.instr }
    | sent_loop { $instr = $sent_loop.instr }
    | sent_while { $instr = $sent_while.instr }
    | sent_match { $instr = $sent_match.instr }
    | sent_funciones_Vec { $instr = $sent_funciones_Vec.instr }
    | sent_ForIn { $instr = $sent_ForIn.instr }
    | funciones_Trans { $instr = $funciones_Trans.instr }
    | sent_funcion { $instr = $sent_funcion.instr }
    | sent_Llamada { $instr = $sent_Llamada.instr }
    | sent_struct { $instr = $sent_struct.instr }
    | sent_Modulos { $instr = $sent_Modulos.instr }
    ;

sent_Modulos returns [ interfaces.Instruction instr ]
    : PUBLI MODULO ID LLAVEA li=intructions_modulos LLAVEC   { $instr = modulos.NewModulos($ID.text, interfaces.PUBLICO, $li.l, $MODULO.line, $MODULO.pos) }
    | MODULO ID LLAVEA li=intructions_modulos LLAVEC         { $instr = modulos.NewModulos($ID.text, interfaces.PRIVADO, $li.l, $MODULO.line, $MODULO.pos) }
    ;

intructions_modulos returns [ *arrayList.List l ]
    : li=intructions_modulos instruct_modulos { 
        $li.l.Add($instruct_modulos.instr)  
        $l = $li.l
     }
    | instruct_modulos                     { 
        a := arrayList.New() 
        a.Add($instruct_modulos.instr)
        $l = a
     }
    ;

instruct_modulos returns [ interfaces.Instruction instr ]
    : sent_Modulos          { $instr = $sent_Modulos.instr }
    | PUBLI sent_funcion    { $instr = modulos.NewFuncion_Mod( $sent_funcion.instr, interfaces.PUBLICO, $PUBLI.line, $PUBLI.pos ) }
    | sf=sent_funcion       { $instr = modulos.NewFuncion_Mod( $sf.instr, interfaces.PRIVADO, 0, 0 ) }
    | PUBLI sent_struct     { $instr = modulos.NewStruct_Mod( $sent_struct.instr, interfaces.PUBLICO , $PUBLI.line, $PUBLI.pos ) }
    | ss=sent_struct           { $instr = modulos.NewStruct_Mod( $ss.instr, interfaces.PUBLICO , 0, 0 ) }
    ;

sent_struct returns [ interfaces.Instruction instr ]
    : STRUCT ID LLAVEA atributos_struct LLAVEC { $instr = structs.NewStruct($ID.text, $atributos_struct.l,$STRUCT.line,$STRUCT.pos) }
    ;

atributos_struct returns [ *arrayList.List l ]
    : li=atributos_struct COMA asd=atributos_struct_decl {
        $li.l.Add($asd.s)
        $l = $li.l
    }
    | atributos_struct_decl  {
        a := arrayList.New()
        a.Add($atributos_struct_decl.s)
        $l = a
    }
    ;
atributos_struct_decl returns [ interfaces.Symbol s ]
    :ID DPTS array_decl_array {$s = interfaces.Symbol{ Id: $ID.text, Tipo: 6}}
    |ID DPTS vector_decl { $s = interfaces.Symbol{ Id: $ID.text, Tipo: 10} } 
    |ID DPTS tipo { $s = interfaces.Symbol{ Id: $ID.text, Tipo: $tipo.te} }  
    |id1=ID DPTS id2=ID { $s = interfaces.Symbol{ Id: $id1.text, Tipo: 9, Valor: $id2.text} }
    ;

sent_funcion returns [ interfaces.Instruction instr ]
    : FUNCT ID PARA PARC LLAVEA instrucciones LLAVEC { 
        $instr = instruction.NewFuncion($ID.text, arrayList.New(), interfaces.NULL, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA params_funcion PARC LLAVEA instrucciones LLAVEC{
        $instr = instruction.NewFuncion($ID.text, $params_funcion.l, interfaces.NULL, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA PARC REST MAYOR tipo LLAVEA instrucciones LLAVEC { 
        $instr = instruction.NewFuncion($ID.text, arrayList.New(), $tipo.te, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA params_funcion PARC REST MAYOR tipo LLAVEA instrucciones LLAVEC{
        $instr = instruction.NewFuncion($ID.text, $params_funcion.l, $tipo.te, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT id1=ID PARA PARC REST MAYOR id2=ID LLAVEA instrucciones LLAVEC { 
        $instr = instruction.NewFuncion($id1.text, arrayList.New(), interfaces.NULL, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT id1=ID PARA params_funcion PARC REST MAYOR id2=ID LLAVEA instrucciones LLAVEC{
        $instr = instruction.NewFuncion($id1.text, $params_funcion.l, interfaces.NULL, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA PARC REST MAYOR array_decl_array LLAVEA instrucciones LLAVEC { 
        $instr = instruction.NewFuncion($ID.text, arrayList.New(), interfaces.ARRAY, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA params_funcion PARC REST MAYOR array_decl_array LLAVEA instrucciones LLAVEC{
        $instr = instruction.NewFuncion($ID.text, $params_funcion.l, interfaces.ARRAY, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA PARC REST MAYOR  VEC MENOR tipo MAYOR LLAVEA instrucciones LLAVEC { 
        $instr = instruction.NewFuncion($ID.text, arrayList.New(), interfaces.VECTOR, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    | FUNCT ID PARA params_funcion PARC REST MAYOR  VEC MENOR tipo MAYOR LLAVEA instrucciones LLAVEC{
        $instr = instruction.NewFuncion($ID.text, $params_funcion.l, interfaces.VECTOR, $instrucciones.l, $FUNCT.line, $FUNCT.pos) 
    }
    ;

params_funcion returns [ *arrayList.List l ]
    : li=params_funcion COMA params_funcion_decl {
        $li.l.Add($params_funcion_decl.s)  
        $l = $li.l
    }
    | params_funcion_decl      { 
        a := arrayList.New()
        a.Add($params_funcion_decl.s)
        $l = a
     } 
    ;
params_funcion_decl returns [ interfaces.Symbol s ]
    :  ID DPTS PUNTERO MUT array_decl_array { $s = interfaces.Symbol{ Id: $ID.text, Tipo: 6, IsMut: true} }
    |  ID DPTS PUNTERO array_decl_array     { $s = interfaces.Symbol{ Id: $ID.text, Tipo: 6, IsMut: false} }
    |  ID DPTS PUNTERO MUT vector_expr      { $s = interfaces.Symbol{ Id: $ID.text, Tipo: 10, IsMut: true} }
    |  ID DPTS PUNTERO vector_expr          { $s = interfaces.Symbol{ Id: $ID.text, Tipo: 10, IsMut: false} }
    |  ID DPTS MUT tipo                     { $s = interfaces.Symbol{ Id: $ID.text, Tipo: $tipo.te, IsMut: true} }
    |  ID DPTS tipo                         { $s = interfaces.Symbol{ Id: $ID.text, Tipo: $tipo.te, IsMut: false} } 
    ;
sent_Llamada returns [ interfaces.Instruction instr ]
    :  ID PARA PARC PYC{ $instr = instruction.NewLlamada($ID.text, arrayList.New(), $PARA.line, $PARA.pos) }
    | ID PARA li=params_llamada PARC PYC { $instr = instruction.NewLlamada($ID.text, $li.l, $PARA.line, $PARA.pos) }
    ;

params_llamada returns [ *arrayList.List l ]
    : li = params_llamada COMA expression { 
        $li.l.Add($expression.p)  
        $l = $li.l
        }
    | li = params_llamada COMA PUNTERO MUT expression { 
        $li.l.Add($expression.p)  
        $l = $li.l
        }
    | expression {
        a := arrayList.New()
        a.Add($expression.p)
        $l = a
    }
    | PUNTERO MUT expression {
        a := arrayList.New()
        a.Add($expression.p)
        $l = a
    }  
    ;

funciones_Trans returns [interfaces.Instruction instr]
    : BRE PYC { $instr = sentenciatransferencia.NewBreak( nil, $BRE.line, $BRE.pos ) }
    | BRE expression PYC { $instr = sentenciatransferencia.NewBreak( $expression.p, $BRE.line, $BRE.pos ) }
    | CONTINIU PYC { $instr = sentenciatransferencia.NewContinue($CONTINIU.line, $CONTINIU.pos) }
    | RETURNASO PYC { $instr = sentenciatransferencia.NewReturnaso(nil, $RETURNASO.line, $RETURNASO.pos) } 
    | RETURNASO expression PYC  { $instr = sentenciatransferencia.NewReturnaso($expression.p, $RETURNASO.line, $RETURNASO.pos) }
    | RETURNASO expression_vec_Arr PYC  { $instr = sentenciatransferencia.NewReturnaso($expression_vec_Arr.p, $RETURNASO.line, $RETURNASO.pos) }
    ;

declaracion returns[ interfaces.Instruction instr ]
    : LET MUT ID DPTS  tipo IGUAL expression PYC { 
        $instr = instruction.NewDeclaration($ID.text, $tipo.te, $expression.p, true ,$IGUAL.line,$IGUAL.pos ) 
        }
    | LET ID DPTS  tipo IGUAL expression PYC { 
        $instr = instruction.NewDeclaration($ID.text, $tipo.te, $expression.p, false,  $IGUAL.line,$IGUAL.pos ) 
        }
    //Sentencias expresion
    | LET MUT ID DPTS tipo IGUAL sentencias_expr PYC { 
        $instr = instruction.NewDeclaration($ID.text, $tipo.te, $sentencias_expr.p, true,$IGUAL.line,$IGUAL.pos ) 
        }
    | LET ID DPTS tipo IGUAL sentencias_expr PYC { 
        $instr = instruction.NewDeclaration($ID.text, $tipo.te, $sentencias_expr.p, false, $IGUAL.line,$IGUAL.pos ) 
        }
    ;

array_decl returns [ interfaces.Instruction instr ]
    : LET MUT ID DPTS tr=array_decl_array IGUAL ea=expression_vec_Arr PYC { 
        $instr = instruction.NewDeclaration_Array($ID.text, $tr.at, $ea.p, true, $LET.line,$LET.pos) 
    }
    | LET MUT ID IGUAL ea=expression_vec_Arr PYC {
        var a *structsinter.Array_type
        $instr = instruction.NewDeclaration_Array($ID.text, a, $ea.p, true, $LET.line,$LET.pos) 
    }
    | LET ID DPTS tr=array_decl_array IGUAL ea=expression_vec_Arr PYC {
        $instr = instruction.NewDeclaration_Array($ID.text, $tr.at, $ea.p, false, $LET.line,$LET.pos) 
    }
    | LET ID IGUAL ea=expression_vec_Arr PYC {
        var a *structsinter.Array_type
        $instr = instruction.NewDeclaration_Array($ID.text, a, $ea.p, false, $LET.line,$LET.pos) 
    }
    ;

array_decl_array returns [ *structsinter.Array_type at ]
    : CORCHA stru = array_decl_array PYC expression_vec_Arr CORCHC {
        a:= &structsinter.Array_type{
                Tipo: $stru.at.Tipo,
                Size: $expression_vec_Arr.p,
                Array_Son: $stru.at,
	        }
        $at = a 
    }
    | CORCHA tipo PYC expression_vec_Arr CORCHC {
        a:= &structsinter.Array_type{
                Tipo: $tipo.te,
                Size: $expression_vec_Arr.p,
                Array_Son: nil,
	        }
        $at = a
    }
    ;


vector_decl returns[ interfaces.Instruction instr ] 
    : LET MUT ID DPTS VEC MENOR tipo MAYOR IGUAL ea=vector_expr PYC { 
        $instr = instruction.NewDeclaration_Vector($ID.text, $tipo.te, $ea.p, "" ,true, $LET.line,$LET.pos) 
    }
    | LET MUT id1=ID DPTS VEC MENOR id2=ID MAYOR IGUAL ea=vector_expr PYC { 
        $instr = instruction.NewDeclaration_Vector($id1.text, interfaces.STRUCT, $ea.p, $id2.text ,true, $LET.line,$LET.pos) 
    }
    | LET MUT ID IGUAL ea=vector_expr PYC {
        $instr = instruction.NewDeclaration_Vector($ID.text, 4, $ea.p, "" ,true, $LET.line,$LET.pos) 
    }
    | LET ID DPTS VEC MENOR tipo MAYOR IGUAL ea=vector_expr PYC {
        $instr = instruction.NewDeclaration_Vector($ID.text, $tipo.te, $ea.p, "" ,false, $LET.line,$LET.pos) 
    }
    | LET ID IGUAL ea=vector_expr PYC {
        $instr = instruction.NewDeclaration_Vector($ID.text, 4, $ea.p, "" ,false, $LET.line,$LET.pos) 
    }
    | LET id1=ID DPTS VEC MENOR id2=ID MAYOR IGUAL ea=vector_expr PYC {
        $instr = instruction.NewDeclaration_Vector($id1.text, interfaces.STRUCT, $ea.p, $id2.text ,false, $LET.line,$LET.pos) 
    }
    ; 
    
vector_expr returns [ interfaces.Expresion p ] 
    : VEC EXCLA CORCHA list_expre_vec_arr CORCHC { 
        var a,b,c interfaces.Expresion
        $p = vector.NewVector( $list_expre_vec_arr.l, a , b , false,c,$CORCHA.line, $CORCHA.pos  ) 
        }
    | VEC EXCLA CORCHA exp1=expression_vec_Arr PYC exp2=expression_vec_Arr CORCHC { 
        var a interfaces.Expresion
        $p = vector.NewVector( arrayList.New(), $exp1.p, $exp2.p ,false, a ,$CORCHA.line, $CORCHA.pos) 
        }
    | VEC DPTS DPTS NEWI PARA PARC { 
        var a,b,c interfaces.Expresion
        $p =  vector.NewVector(arrayList.New(),a,b,true,c,$NEWI.line,$NEWI.pos) 
    }
    |VEC EXCLA DPTS DPTS WITH_CAP PARA expression_vec_Arr PARC { 
        var a,b interfaces.Expresion
        $p =  vector.NewVector(arrayList.New(),a,b,false,$expression_vec_Arr.p,$WITH_CAP.line,$WITH_CAP.pos) 
    }
    ;


sent_funciones_Vec returns [ interfaces.Instruction instr ]
    : ID  PNT PUSH PARA expression PARC PYC { $instr = funcionesvectores.NewPush($ID.text, $expression.p, $PUSH.line, $PUSH.pos) }
    | ID PNT INSERT PARA exp1=expression COMA exp2=expression PARC PYC { 
        $instr = funcionesvectores.NewInsert($ID.text, $exp1.p, $exp2.p, $INSERT.line, $INSERT.pos) 
    }
    |ID PNT REMOVE PARA expression PARC PYC { 
        $instr = funcionesvectores.NewRemove_instr($ID.text, $expression.p, $REMOVE.line, $REMOVE.pos) 
    }
    ;

sentencias_expr returns [ interfaces.Expresion p ]
    : sent_if_expr PYC { $p = $sent_if_expr.p }
    | sent_loop_expr  { $p = $sent_loop_expr.p }
    | sent_matchexpr { $p = $sent_matchexpr.p }
    ;

sent_matchexpr returns [ interfaces.Expresion p ]
    : MATCH expression LLAVEA matchexpr_listbrazos el_defaultexpr LLAVEC { 
        $p = matchexpr.NewMatch_Expr($expression.p, $matchexpr_listbrazos.l, $el_defaultexpr.p, $MATCH.line,$MATCH.pos) 
        }
    | MATCH expression LLAVEA matchexpr_listbrazos LLAVEC {
        var a interfaces.Expresion
        $p = matchexpr.NewMatch_Expr($expression.p, $matchexpr_listbrazos.l, a, $MATCH.line,$MATCH.pos)
    }
    | MATCH expression LLAVEA el_defaultexpr LLAVEC {
        $p = matchexpr.NewMatch_Expr($expression.p, arrayList.New(), $el_defaultexpr.p, $MATCH.line,$MATCH.pos) 
    }
    ;

matchexpr_listbrazos returns [ *arrayList.List l ]
    : brz = matchexpr_listbrazos list_brazosexpr {
        $brz.l.Add($list_brazosexpr.p)
        $l = $brz.l
    }
    | list_brazosexpr {
        a := arrayList.New()
        a.Add($list_brazosexpr.p)
        $l = a
    } 
    ;

list_brazosexpr returns[ interfaces.Expresion p ]
    : po = expression IGUAL MAYOR pi = expression COMA { 
        a := arrayList.New()
        a.Add($po.p)
        $p = matchexpr.NewBrazo_expr(a, $pi.p, $IGUAL.line , $IGUAL.pos)
     }
    | exp = matchexpr_listbrazosexpr_listexpr IGUAL MAYOR expression COMA { $p = matchexpr.NewBrazo_expr( $exp.l , $expression.p ,$IGUAL.line, $IGUAL.pos ) }
    ;

matchexpr_listbrazosexpr_listexpr returns [  *arrayList.List l ]
    : g = match_listbrazos_listexpr OR_MATCH expression {
        $g.l.Add($expression.p)
        $l = $g.l
    }
    | expression {
        a := arrayList.New()
        a.Add($expression.p)
        $l = a
    }
    ;

el_defaultexpr returns[ interfaces.Expresion p ]
    :   DEFAUL IGUAL MAYOR expression COMA{ $p = matchexpr.NewDefault_Expr($expression.p, $DEFAUL.line, $DEFAUL.pos) }
    ;


tipo returns[ interfaces.TipoExpresion te]
    : INT   { $te = 0 }
    | FLOAT { $te = 1 }
    | STR { $te = 2 }
    | BOOLEAN { $te = 3}
    | CHAR      { $te = 7 }
    | STRING    { $te = 8 }
    | USIZE     { $te = 13 }
    ;

asignacion returns[ interfaces.Instruction instr ]
    : ID IGUAL expression PYC { $instr = instruction.NewAsignacion($ID.text, $expression.p, "" ,$ID.line, $ID.pos) }
    | id1=ID PNT id2=ID IGUAL expression PYC { $instr = instruction.NewAsignacion($id1.text, $expression.p, $id2.text ,$ID.line, $ID.pos) }
    ;

sent_if_expr returns [interfaces.Expresion p ]
    : IF ini = expression LLAVEA instru=sent_instru_if_expre LLAVEC { 
        b := arrayList.New()
        $p = sentenciasexpr.NewIf_expr($ini.p, $instru.l,b, $IF.line, $IF.pos   ) 
        }
    | IF ini = expression LLAVEA instru=sent_instru_if_expre LLAVEC ELSE LLAVEA instru2=sent_instru_if_expre LLAVEC{ 
        $p = sentenciasexpr.NewIf_expr($ini.p, $instru.l, $instru2.l , $IF.line, $IF.pos ) 
        }
    | IF ini = expression LLAVEA instru=sent_instru_if_expre LLAVEC ELSE sent = sent_if_expr{ 
        a := arrayList.New()
        a.Add($sent.p)
        $p = sentenciasexpr.NewIf_expr($ini.p,$instru.l,a, $IF.line, $IF.pos   )  
        }
    ;

sent_instru_if_expre returns [ *arrayList.List l ]
    : in=instrucciones ex=expression { 
        $in.l.Add($ex.p)
        $l = $in.l
     }
    | ex=expression{
        a := arrayList.New()
        a.Add($ex.p)
        $l = a
    }
    ;

sent_loop_expr returns [ interfaces.Expresion p ]
    : LOOP LLAVEA instrucciones LLAVEC { $p = sentenciasexpr.NewLoop_expr($instrucciones.l,$LOOP.line,$LOOP.pos) }
    ;

printaso returns[ interfaces.Instruction instr ]
    : PRINT EXCLA PARA expression PARC  { 
         a := arrayList.New()
        $instr = instruction.NewImprimir($expression.p, a, $PRINT.line, $PRINT.pos) 
        }
    | PRINT EXCLA PARA expression COMA li = list_expre_print PARC{  $instr = instruction.NewImprimir($expression.p, $li.l, $PRINT.line, $PRINT.pos)  }
    ;

list_expre_print returns[ *arrayList.List l ]
    : li = list_expre_print COMA expression { 
        $li.l.Add($expression.p)  
        $l = $li.l
        }
    | expression {
        a := arrayList.New()
        a.Add($expression.p)
        $l = a
    }  
    ;



list_expre_vec_arr returns[ *arrayList.List l ]
    : li = list_expre_vec_arr COMA expression_vec_Arr { 
        $li.l.Add($expression_vec_Arr.p)  
        $l = $li.l
        }
    | expression_vec_Arr {
        a := arrayList.New()
        a.Add($expression_vec_Arr.p)
        $l = a
    }  
    ;

sent_if returns[ interfaces.Instruction instr ]
    : IF expression LLAVEA instrucciones LLAVEC { $instr = sentenciacontrol.NewIf($expression.p, $instrucciones.l, arrayList.New(), $IF.line,$IF.pos) }
    | IF expression LLAVEA ins1=instrucciones LLAVEC ELSE LLAVEA ins2=instrucciones LLAVEC{ $instr = sentenciacontrol.NewIf($expression.p, $ins1.l, $ins2.l, $IF.line,$IF.pos) }
    | IF expression LLAVEA ins1=instrucciones LLAVEC ELSE sent = sent_if{ 
        a := arrayList.New()
        a.Add($sent.instr)
        $instr = sentenciacontrol.NewIf($expression.p, $ins1.l, a , $IF.line,$IF.pos) }
    ;
sent_match returns[ interfaces.Instruction instr ]
    : MATCH expression LLAVEA match_listbrazos el_default LLAVEC{ $instr = match.NewMatch($expression.p, $match_listbrazos.l, $el_default.instr, $MATCH.line, $MATCH.pos) }
    | MATCH expression LLAVEA el_default LLAVEC {$instr = match.NewMatch($expression.p, arrayList.New(), $el_default.instr, $MATCH.line, $MATCH.pos)}
    ; 
match_listbrazos returns [ *arrayList.List l ]
    : braz = match_listbrazos list_brazos { 
    $braz.l.Add($list_brazos.instr)
     $l = $braz.l
     }
    | list_brazos                  {
        a := arrayList.New()
        a.Add($list_brazos.instr)
        $l = a
    }
    ;

list_brazos returns [ interfaces.Instruction instr ]
    :  expression IGUAL MAYOR LLAVEA instrucciones LLAVEC{ 
        a := arrayList.New()
        a.Add($expression.p)
        $instr = match.NewBrazo(a, $instrucciones.l, $IGUAL.line, $IGUAL.pos) 
        }
    |  exprs=match_listbrazos_listexpr IGUAL MAYOR LLAVEA instrucciones LLAVEC { $instr = match.NewBrazo($exprs.l, $instrucciones.l, $IGUAL.line, $IGUAL.pos)  }
    | expression IGUAL MAYOR instruccion COMA{
        a := arrayList.New()
        a.Add($expression.p)
        b := arrayList.New()
        b.Add($instruccion.instr)
        $instr = match.NewBrazo(a, b, $IGUAL.line, $IGUAL.pos) 
        }
    | exprs=match_listbrazos_listexpr IGUAL MAYOR instruccion COMA{
        b := arrayList.New()
        b.Add($instruccion.instr)
        $instr = match.NewBrazo($exprs.l, b, $IGUAL.line, $IGUAL.pos)
        }
    ;

match_listbrazos_listexpr returns [ *arrayList.List l ]
    : h = match_listbrazos_listexpr OR_MATCH expression  { 
        $h.l.Add($expression.p)
        $l = $h.l
     }
    | expression {
        a := arrayList.New()
        a.Add($expression.p)
        $l = a
        }
        
    ;

el_default returns [ interfaces.Instruction instr ]
    : DEFAUL IGUAL MAYOR LLAVEA instrucciones LLAVEC { $instr = match.NewDefault($instrucciones.l , $DEFAUL.line, $DEFAUL.pos) }  
    | DEFAUL IGUAL MAYOR instruccion COMA { 
        a := arrayList.New()
        a.Add($instruccion.instr)
        $instr = match.NewDefault(a , $DEFAUL.line, $DEFAUL.pos)  
        }
    ;

sent_loop returns[ interfaces.Instruction instr ]
    : LOOP LLAVEA instrucciones LLAVEC { $instr = sentenciaciclica.NewLoop($instrucciones.l,$LOOP.line,$LOOP.pos) }
    ;

sent_while returns[ interfaces.Instruction instr ]
    :   WHILE expression LLAVEA instrucciones LLAVEC { $instr = sentenciaciclica.NewWhile($expression.p , $instrucciones.l , $WHILE.line, $WHILE.pos) }
    ;

sent_ForIn returns [ interfaces.Instruction instr ]
    : FOR ID IN exp1=expression PNT PNT exp2=expression LLAVEA instrucciones LLAVEC {
        var a interfaces.Expresion
        $instr = sentenciaciclica.NewForIn( $ID.text, $exp1.p, $exp2.p,a, $instrucciones.l, $IN.line, $IN.pos )
    }
    | FOR ID IN exp=expression_vec_Arr LLAVEA instrucciones LLAVEC {
        var a,b interfaces.Expresion
        $instr = sentenciaciclica.NewForIn( $ID.text, a,b, $exp.p , $instrucciones.l, $IN.line, $IN.pos )
    }
    ;

expression_vec_Arr returns[interfaces.Expresion p]
    : INT DPTS DPTS op=POW PARA opIz=expression_vec_Arr COMA opDe=expression_vec_Arr PARC {$p=Operacion.NewOperacion_Arit($opIz.p,$op.text,$opDe.p,false,$INT.line,$INT.pos)}
    | FLOAT DPTS DPTS op=POWF PARA opIz=expression_vec_Arr COMA opDe=expression_vec_Arr PARC {$p=Operacion.NewOperacion_Arit($opIz.p,$op.text,$opDe.p,false,$FLOAT.line,$FLOAT.pos)}
    | opIz = expression_vec_Arr op=MODUL opDe = expression_vec_Arr {$p=Operacion.NewOperacion_Arit($opIz.p,$op.text,$opDe.p,false,$op.line,$op.pos)} 
    | opIz = expression_vec_Arr ope=(MUL|DIV) opDe = expression_vec_Arr {$p=Operacion.NewOperacion_Arit($opIz.p,$ope.text,$opDe.p,false,$ope.line,$ope.pos)}
    | opIz = expression_vec_Arr ope=(SUM|REST) opDe = expression_vec_Arr {$p=Operacion.NewOperacion_Arit($opIz.p,$ope.text,$opDe.p,false,$ope.line,$ope.pos)}
    | opIz = expression_vec_Arr op=(MENOR|MENORIGUAL|MAYORIGUAL|MAYOR|IGUALACION|DIFERENCIACION) opDe = expression_vec_Arr {$p = Operacion.NewOperacion_Relacional($opIz.p,$op.text,$opDe.p,false,$op.line,$op.pos)}
    | PARA expression_vec_Arr PARC { $p = $expression_vec_Arr.p}
    | opIz = expression_vec_Arr ope=(AND|OR) opDe = expression_vec_Arr {$p = Operacion.NewOperacion_Logica($opIz.p,$ope.text,$opDe.p,false,$ope.line,$ope.pos)}     
    | op=EXCLA operador = expression_vec_Arr {$p = Operacion.NewOperacion_Logica($operador.p,$op.text,nil,true,$op.line,$op.pos)}
    //Declaracoin arreglos
    | CORCHA list_expre_vec_arr CORCHC { 
        var a interfaces.Expresion
        var b interfaces.Expresion
        $p = arrays.NewArray( $list_expre_vec_arr.l, a , b , $CORCHA.line, $CORCHA.pos  ) 
        }
    | CORCHA exp1=expression_vec_Arr PYC exp2=expression_vec_Arr CORCHC { $p = arrays.NewArray( arrayList.New(), $exp1.p, $exp2.p , $CORCHA.line, $CORCHA.pos) }
    //Funciones Vectores
    | exp4=expression PNT TOCHARS PARA PARC { $p = funcionesnativas.NewToChar($exp4.p, $TOCHARS.line, $TOCHARS.pos) }
    | vector_expr { $p = $vector_expr.p }
    | primitivo { $p = $primitivo.p }
    ;

atributos_struct_exp returns [ *arrayList.List l ]
    : li=atributos_struct_exp COMA asd=atributos_struct_decl_exp {
        $li.l.Add($asd.s)
        $l = $li.l
    }
    | atributos_struct_decl_exp  {
        a := arrayList.New()
        a.Add($atributos_struct_decl_exp.s)
        $l = a
    }
    ;
atributos_struct_decl_exp returns [ interfaces.Symbol s ]
    :ID DPTS exp2=expression {$s = interfaces.Symbol{ Id: $ID.text, Valor: $exp2.p } }  
    |ID DPTS exp=expression_vec_Arr {$s = interfaces.Symbol{ Id: $ID.text,  Valor:$exp.p }}
    ;

expression returns[interfaces.Expresion p]
    : INT DPTS DPTS op=POW PARA opIz=expression COMA opDe=expression PARC {$p=Operacion.NewOperacion_Arit($opIz.p,$op.text,$opDe.p,false,$INT.line,$INT.pos)}
    | exp4=expression PNT TOSTRING PARA PARC { $p = funcionesnativas.NewToString($exp4.p, $TOSTRING.line, $TOSTRING.pos) }
    | FLOAT DPTS DPTS op=POWF PARA opIz=expression COMA opDe=expression PARC {$p=Operacion.NewOperacion_Arit($opIz.p,$op.text,$opDe.p,false,$FLOAT.line,$FLOAT.pos)}
    | exp8 =expression PNT LEN PARA PARC { $p = funcionesvectores.NewLen($exp8.p, $LEN.line, $LEN.pos) }
    | opIz = expression op=MODUL opDe = expression {$p=Operacion.NewOperacion_Arit($opIz.p,$op.text,$opDe.p,false,$op.line,$op.pos)} 
    | opIz = expression ope=(MUL|DIV) opDe = expression {$p=Operacion.NewOperacion_Arit($opIz.p,$ope.text,$opDe.p,false,$ope.line,$ope.pos)}
    | opIz = expression ope=(SUM|REST) opDe = expression {$p=Operacion.NewOperacion_Arit($opIz.p,$ope.text,$opDe.p,false,$ope.line,$ope.pos)}
    | ope=REST opDe = expression {$p=Operacion.NewOperacion_Arit($opDe.p,$ope.text,nil,true,$ope.line,$ope.pos)}
    | PARA expression PARC { $p = $expression.p}
    | opIz = expression op=(MENOR|MENORIGUAL|MAYORIGUAL|MAYOR|IGUALACION|DIFERENCIACION) opDe = expression {$p = Operacion.NewOperacion_Relacional($opIz.p,$op.text,$opDe.p,false,$op.line,$op.pos)}
    | PARA expression PARC { $p = $expression.p}
    | opIz = expression ope=(AND|OR) opDe = expression {$p = Operacion.NewOperacion_Logica($opIz.p,$ope.text,$opDe.p,false,$ope.line,$ope.pos)}     
    | op=EXCLA operador = expression {$p = Operacion.NewOperacion_Logica($operador.p,$op.text,nil,true,$op.line,$op.pos)}
    | ID PNT REMOVE PARA expression PARC { $p = funcionesvectores.NewRemove_exp($ID.text, $expression.p, $REMOVE.line, $REMOVE.pos) } 
    | exp8 =expression PNT CONTAINS PARA PUNTERO expression PARC { $p = funcionesvectores.NewContains($exp8.p, $expression.p, $CONTAINS.line, $CONTAINS.pos ) }
    | exp4=expression PNT TOCHARS PARA PARC { $p = funcionesnativas.NewToChar($exp4.p, $TOCHARS.line, $TOCHARS.pos) }
    | exp4=expression PNT TOOWNED PARA PARC { $p = funcionesnativas.NewToString($exp4.p, $TOOWNED.line, $TOOWNED.pos) }
    | exp5=expression CASTEO tipo { $p = casteos.NewCasteo($exp5.p, $tipo.te, $CASTEO.line , $CASTEO.pos ) }
    | exp6=expression PNT ABOSLU PARA PARC { $p = funcionesnativas.NewAbsoluto($exp6.p, $ABOSLU.line, $ABOSLU.pos) }
    | exp7=expression PNT RAIZITA PARA PARC { $p = funcionesnativas.NewRaizCuadrada($exp7.p, $ABOSLU.line, $ABOSLU.pos) }
    | exp9=expression PNT CLONATION PARA PARC { $p = funcionesnativas.NewClone($exp9.p, $CLONATION.line, $CLONATION.pos) }
    | ID LLAVEA li=atributos_struct_exp LLAVEC { $p = structs.NewStruct( $ID.text, $li.l, $LLAVEA.line, $LLAVEA.pos ) }
    | llamadas_structs { $p =  $llamadas_structs.p }
    | llamada_expre { $p = $llamada_expre.p }
    | primitivo { $p = $primitivo.p }
    ;

llamada_expre returns [interfaces.Expresion p]
    :  ID PARA PARC  { $p = instruction.NewLlamada($ID.text, arrayList.New(), $PARA.line, $PARA.pos) }
    | ID PARA li=params_llamada PARC { $p = instruction.NewLlamada($ID.text, $li.l, $PARA.line, $PARA.pos) }
    ;


primitivo returns[ interfaces.Expresion p]
    :NUMBER { 
            num, err:= strconv.Atoi($NUMBER.text)
            if err !=nil{ 
                fmt.Println(err)
            }   
            $p = expresion.NewPrimitivo (num, interfaces.INTEGER)
     }
    | FLOAT_NUM {
        num, err:= strconv.ParseFloat($FLOAT_NUM.text, 64)
        if err != nil{
            fmt.Println(err)
        }
        $p = expresion.NewPrimitivo(num, interfaces.FLOAT)
    }
    |op=(TRUE|FALSE) {
        num, err:= strconv.ParseBool($op.text)
        if err != nil{
            fmt.Println(err)
        }
        $p = expresion.NewPrimitivo(num, interfaces.BOOLEAN)
    }
    | CADENA { 
        str:= $CADENA.text[1:len($CADENA.text)-1]
        $p = expresion.NewPrimitivo(str, interfaces.STR)
     }
    | CHAR_2 {
        str:= $CHAR_2.text[1:len($CHAR_2.text)-1]
        $p = expresion.NewPrimitivo(str, interfaces.CHAR)
    } 
    | list_array { $p = $list_array.p }
    ;
list_array returns [ interfaces.Expresion p ]
    : li = list_array CORCHA expression CORCHC { $p = arrays.NewArrayAccess($li.p, $expression.p, $CORCHA.line, $CORCHC.pos) } 
    | ID {  $p = expresion.NewCallVariable($ID.text,$ID.line,$ID.pos) }
    ;

llamadas_structs returns [ interfaces.Expresion p ]
    :   li = llamadas_structs PNT id2=ID { $p = structs.NewStruct_Acces( $li.p, $id2.text, $PNT.line, $PNT.pos ) }
    | ID  {  $p = expresion.NewCallVariable($ID.text,$ID.line,$ID.pos) }
    ;   
// Generated from d:\Compi 2\Proyecto2\Lab1\Interprete.g4 by ANTLR 4.8
 
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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Interprete extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, FLOAT_NUM=2, CHAR_2=3, CADENA=4, CMT=5, EXCLA=6, PARA=7, PARC=8, 
		LLAVEA=9, LLAVEC=10, CORCHA=11, CORCHC=12, PYC=13, DPTS=14, COMA=15, DEFAUL=16, 
		OR_MATCH=17, PNT=18, PUNTERO=19, MUL=20, SUM=21, DIV=22, REST=23, POW=24, 
		POWF=25, MODUL=26, DIFERENCIACION=27, IGUALACION=28, MAYORIGUAL=29, MENORIGUAL=30, 
		MAYOR=31, MENOR=32, IGUAL=33, AND=34, OR=35, TRUE=36, FALSE=37, INT=38, 
		FLOAT=39, BOOLEAN=40, CHAR=41, STR=42, STRING=43, USIZE=44, PRINT=45, 
		LET=46, MUT=47, IF=48, ELSE=49, LOOP=50, WHILE=51, MATCH=52, FOR=53, IN=54, 
		BRE=55, STRUCT=56, VEC=57, NEWI=58, WITH_CAP=59, PUSH=60, INSERT=61, REMOVE=62, 
		CONTAINS=63, LEN=64, TOCHARS=65, TOSTRING=66, TOOWNED=67, CASTEO=68, CONTINIU=69, 
		ABOSLU=70, RAIZITA=71, CLONATION=72, FUNCT=73, RETURNASO=74, PUBLI=75, 
		MODULO=76, ID=77, WS=78;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_sent_Modulos = 3, 
		RULE_intructions_modulos = 4, RULE_instruct_modulos = 5, RULE_sent_struct = 6, 
		RULE_atributos_struct = 7, RULE_atributos_struct_decl = 8, RULE_sent_funcion = 9, 
		RULE_params_funcion = 10, RULE_params_funcion_decl = 11, RULE_sent_Llamada = 12, 
		RULE_params_llamada = 13, RULE_funciones_Trans = 14, RULE_declaracion = 15, 
		RULE_array_decl = 16, RULE_array_decl_array = 17, RULE_vector_decl = 18, 
		RULE_vector_expr = 19, RULE_sent_funciones_Vec = 20, RULE_sentencias_expr = 21, 
		RULE_sent_matchexpr = 22, RULE_matchexpr_listbrazos = 23, RULE_list_brazosexpr = 24, 
		RULE_matchexpr_listbrazosexpr_listexpr = 25, RULE_el_defaultexpr = 26, 
		RULE_tipo = 27, RULE_asignacion = 28, RULE_sent_if_expr = 29, RULE_sent_loop_expr = 30, 
		RULE_printaso = 31, RULE_list_expre_print = 32, RULE_list_expre_vec_arr = 33, 
		RULE_sent_if = 34, RULE_sent_match = 35, RULE_match_listbrazos = 36, RULE_list_brazos = 37, 
		RULE_match_listbrazos_listexpr = 38, RULE_el_default = 39, RULE_sent_loop = 40, 
		RULE_sent_while = 41, RULE_sent_ForIn = 42, RULE_expression_vec_Arr = 43, 
		RULE_atributos_struct_exp = 44, RULE_atributos_struct_decl_exp = 45, RULE_expression = 46, 
		RULE_llamada_expre = 47, RULE_primitivo = 48, RULE_list_array = 49, RULE_llamadas_structs = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "sent_Modulos", "intructions_modulos", 
			"instruct_modulos", "sent_struct", "atributos_struct", "atributos_struct_decl", 
			"sent_funcion", "params_funcion", "params_funcion_decl", "sent_Llamada", 
			"params_llamada", "funciones_Trans", "declaracion", "array_decl", "array_decl_array", 
			"vector_decl", "vector_expr", "sent_funciones_Vec", "sentencias_expr", 
			"sent_matchexpr", "matchexpr_listbrazos", "list_brazosexpr", "matchexpr_listbrazosexpr_listexpr", 
			"el_defaultexpr", "tipo", "asignacion", "sent_if_expr", "sent_loop_expr", 
			"printaso", "list_expre_print", "list_expre_vec_arr", "sent_if", "sent_match", 
			"match_listbrazos", "list_brazos", "match_listbrazos_listexpr", "el_default", 
			"sent_loop", "sent_while", "sent_ForIn", "expression_vec_Arr", "atributos_struct_exp", 
			"atributos_struct_decl_exp", "expression", "llamada_expre", "primitivo", 
			"list_array", "llamadas_structs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'!'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "':'", "','", "'_'", "'|'", "'.'", "'&'", "'*'", 
			"'+'", "'/'", "'-'", "'pow'", "'powf'", "'%'", "'!='", "'=='", "'>='", 
			"'<='", "'>'", "'<'", "'='", "'&&'", "'||'", "'true'", "'false'", "'i64'", 
			"'f64'", "'bool'", "'char'", "'&str'", "'String'", "'usize'", "'println'", 
			"'let'", "'mut'", "'if'", "'else'", "'loop'", "'while'", "'match'", "'for'", 
			"'in'", "'break'", "'struct'", null, "'new'", "'with_capacity'", "'push'", 
			"'insert'", "'remove'", "'contains'", "'len'", "'chars'", "'to_string'", 
			"'to_owned'", "'as'", "'continue'", "'abs'", "'sqrt'", "'clone'", "'fn'", 
			"'return'", "'pub'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "FLOAT_NUM", "CHAR_2", "CADENA", "CMT", "EXCLA", "PARA", 
			"PARC", "LLAVEA", "LLAVEC", "CORCHA", "CORCHC", "PYC", "DPTS", "COMA", 
			"DEFAUL", "OR_MATCH", "PNT", "PUNTERO", "MUL", "SUM", "DIV", "REST", 
			"POW", "POWF", "MODUL", "DIFERENCIACION", "IGUALACION", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "IGUAL", "AND", "OR", "TRUE", "FALSE", 
			"INT", "FLOAT", "BOOLEAN", "CHAR", "STR", "STRING", "USIZE", "PRINT", 
			"LET", "MUT", "IF", "ELSE", "LOOP", "WHILE", "MATCH", "FOR", "IN", "BRE", 
			"STRUCT", "VEC", "NEWI", "WITH_CAP", "PUSH", "INSERT", "REMOVE", "CONTAINS", 
			"LEN", "TOCHARS", "TOSTRING", "TOOWNED", "CASTEO", "CONTINIU", "ABOSLU", 
			"RAIZITA", "CLONATION", "FUNCT", "RETURNASO", "PUBLI", "MODULO", "ID", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Interprete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Interprete(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayList.List lista;
		public InstruccionesContext instrucciones;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((StartContext)_localctx).instrucciones = instrucciones();
			_localctx.lista = ((StartContext)_localctx).instrucciones.l
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);

		        _localctx.l = arrayList.New()   
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (PRINT - 45)) | (1L << (LET - 45)) | (1L << (IF - 45)) | (1L << (LOOP - 45)) | (1L << (WHILE - 45)) | (1L << (MATCH - 45)) | (1L << (FOR - 45)) | (1L << (BRE - 45)) | (1L << (STRUCT - 45)) | (1L << (CONTINIU - 45)) | (1L << (FUNCT - 45)) | (1L << (RETURNASO - 45)) | (1L << (PUBLI - 45)) | (1L << (MODULO - 45)) | (1L << (ID - 45)))) != 0)) {
				{
				{
				setState(105);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            listInt := localctx.(*InstruccionesContext).GetE()
			                for _, e := range listInt { 
			                    _localctx.l.Add(e.GetInstr())
			                 }
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public PrintasoContext printaso;
		public DeclaracionContext declaracion;
		public Vector_declContext vector_decl;
		public Array_declContext array_decl;
		public AsignacionContext asignacion;
		public Sent_ifContext sent_if;
		public Sent_loopContext sent_loop;
		public Sent_whileContext sent_while;
		public Sent_matchContext sent_match;
		public Sent_funciones_VecContext sent_funciones_Vec;
		public Sent_ForInContext sent_ForIn;
		public Funciones_TransContext funciones_Trans;
		public Sent_funcionContext sent_funcion;
		public Sent_LlamadaContext sent_Llamada;
		public Sent_structContext sent_struct;
		public Sent_ModulosContext sent_Modulos;
		public PrintasoContext printaso() {
			return getRuleContext(PrintasoContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Vector_declContext vector_decl() {
			return getRuleContext(Vector_declContext.class,0);
		}
		public Array_declContext array_decl() {
			return getRuleContext(Array_declContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Sent_ifContext sent_if() {
			return getRuleContext(Sent_ifContext.class,0);
		}
		public Sent_loopContext sent_loop() {
			return getRuleContext(Sent_loopContext.class,0);
		}
		public Sent_whileContext sent_while() {
			return getRuleContext(Sent_whileContext.class,0);
		}
		public Sent_matchContext sent_match() {
			return getRuleContext(Sent_matchContext.class,0);
		}
		public Sent_funciones_VecContext sent_funciones_Vec() {
			return getRuleContext(Sent_funciones_VecContext.class,0);
		}
		public Sent_ForInContext sent_ForIn() {
			return getRuleContext(Sent_ForInContext.class,0);
		}
		public Funciones_TransContext funciones_Trans() {
			return getRuleContext(Funciones_TransContext.class,0);
		}
		public Sent_funcionContext sent_funcion() {
			return getRuleContext(Sent_funcionContext.class,0);
		}
		public Sent_LlamadaContext sent_Llamada() {
			return getRuleContext(Sent_LlamadaContext.class,0);
		}
		public Sent_structContext sent_struct() {
			return getRuleContext(Sent_structContext.class,0);
		}
		public Sent_ModulosContext sent_Modulos() {
			return getRuleContext(Sent_ModulosContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((InstruccionContext)_localctx).printaso = printaso();
				setState(114);
				match(PYC);
				 _localctx.instr = ((InstruccionContext)_localctx).printaso.instr 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				((InstruccionContext)_localctx).printaso = printaso();
				 _localctx.instr = ((InstruccionContext)_localctx).printaso.instr 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((InstruccionContext)_localctx).declaracion = declaracion();
				 _localctx.instr = ((InstruccionContext)_localctx).declaracion.instr 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				((InstruccionContext)_localctx).vector_decl = vector_decl();
				 _localctx.instr = ((InstruccionContext)_localctx).vector_decl.instr 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				((InstruccionContext)_localctx).array_decl = array_decl();
				 _localctx.instr = ((InstruccionContext)_localctx).array_decl.instr 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				((InstruccionContext)_localctx).asignacion = asignacion();
				 _localctx.instr = ((InstruccionContext)_localctx).asignacion.instr 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				((InstruccionContext)_localctx).sent_if = sent_if();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_if.instr 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				((InstruccionContext)_localctx).sent_loop = sent_loop();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_loop.instr 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				((InstruccionContext)_localctx).sent_while = sent_while();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_while.instr 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				((InstruccionContext)_localctx).sent_match = sent_match();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_match.instr 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				((InstruccionContext)_localctx).sent_funciones_Vec = sent_funciones_Vec();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_funciones_Vec.instr 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				((InstruccionContext)_localctx).sent_ForIn = sent_ForIn();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_ForIn.instr 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(150);
				((InstruccionContext)_localctx).funciones_Trans = funciones_Trans();
				 _localctx.instr = ((InstruccionContext)_localctx).funciones_Trans.instr 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(153);
				((InstruccionContext)_localctx).sent_funcion = sent_funcion();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_funcion.instr 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(156);
				((InstruccionContext)_localctx).sent_Llamada = sent_Llamada();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_Llamada.instr 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(159);
				((InstruccionContext)_localctx).sent_struct = sent_struct();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_struct.instr 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				((InstruccionContext)_localctx).sent_Modulos = sent_Modulos();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_Modulos.instr 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_ModulosContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token MODULO;
		public Token ID;
		public Intructions_modulosContext li;
		public TerminalNode PUBLI() { return getToken(Interprete.PUBLI, 0); }
		public TerminalNode MODULO() { return getToken(Interprete.MODULO, 0); }
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Intructions_modulosContext intructions_modulos() {
			return getRuleContext(Intructions_modulosContext.class,0);
		}
		public Sent_ModulosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_Modulos; }
	}

	public final Sent_ModulosContext sent_Modulos() throws RecognitionException {
		Sent_ModulosContext _localctx = new Sent_ModulosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sent_Modulos);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLI:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(PUBLI);
				setState(168);
				((Sent_ModulosContext)_localctx).MODULO = match(MODULO);
				setState(169);
				((Sent_ModulosContext)_localctx).ID = match(ID);
				setState(170);
				match(LLAVEA);
				setState(171);
				((Sent_ModulosContext)_localctx).li = intructions_modulos(0);
				setState(172);
				match(LLAVEC);
				 _localctx.instr = modulos.NewModulos((((Sent_ModulosContext)_localctx).ID!=null?((Sent_ModulosContext)_localctx).ID.getText():null), interfaces.PUBLICO, ((Sent_ModulosContext)_localctx).li.l, (((Sent_ModulosContext)_localctx).MODULO!=null?((Sent_ModulosContext)_localctx).MODULO.getLine():0), (((Sent_ModulosContext)_localctx).MODULO!=null?((Sent_ModulosContext)_localctx).MODULO.getCharPositionInLine():0)) 
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((Sent_ModulosContext)_localctx).MODULO = match(MODULO);
				setState(176);
				((Sent_ModulosContext)_localctx).ID = match(ID);
				setState(177);
				match(LLAVEA);
				setState(178);
				((Sent_ModulosContext)_localctx).li = intructions_modulos(0);
				setState(179);
				match(LLAVEC);
				 _localctx.instr = modulos.NewModulos((((Sent_ModulosContext)_localctx).ID!=null?((Sent_ModulosContext)_localctx).ID.getText():null), interfaces.PRIVADO, ((Sent_ModulosContext)_localctx).li.l, (((Sent_ModulosContext)_localctx).MODULO!=null?((Sent_ModulosContext)_localctx).MODULO.getLine():0), (((Sent_ModulosContext)_localctx).MODULO!=null?((Sent_ModulosContext)_localctx).MODULO.getCharPositionInLine():0)) 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Intructions_modulosContext extends ParserRuleContext {
		public *arrayList.List l;
		public Intructions_modulosContext li;
		public Instruct_modulosContext instruct_modulos;
		public Instruct_modulosContext instruct_modulos() {
			return getRuleContext(Instruct_modulosContext.class,0);
		}
		public Intructions_modulosContext intructions_modulos() {
			return getRuleContext(Intructions_modulosContext.class,0);
		}
		public Intructions_modulosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intructions_modulos; }
	}

	public final Intructions_modulosContext intructions_modulos() throws RecognitionException {
		return intructions_modulos(0);
	}

	private Intructions_modulosContext intructions_modulos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Intructions_modulosContext _localctx = new Intructions_modulosContext(_ctx, _parentState);
		Intructions_modulosContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_intructions_modulos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			((Intructions_modulosContext)_localctx).instruct_modulos = instruct_modulos();
			 
			        a := arrayList.New() 
			        a.Add(((Intructions_modulosContext)_localctx).instruct_modulos.instr)
			        _localctx.l = a
			     
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Intructions_modulosContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_intructions_modulos);
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
					((Intructions_modulosContext)_localctx).instruct_modulos = instruct_modulos();
					 
					                  ((Intructions_modulosContext)_localctx).li.l.Add(((Intructions_modulosContext)_localctx).instruct_modulos.instr)  
					                  _localctx.l = ((Intructions_modulosContext)_localctx).li.l
					               
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Instruct_modulosContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Sent_ModulosContext sent_Modulos;
		public Token PUBLI;
		public Sent_funcionContext sent_funcion;
		public Sent_funcionContext sf;
		public Sent_structContext sent_struct;
		public Sent_structContext ss;
		public Sent_ModulosContext sent_Modulos() {
			return getRuleContext(Sent_ModulosContext.class,0);
		}
		public TerminalNode PUBLI() { return getToken(Interprete.PUBLI, 0); }
		public Sent_funcionContext sent_funcion() {
			return getRuleContext(Sent_funcionContext.class,0);
		}
		public Sent_structContext sent_struct() {
			return getRuleContext(Sent_structContext.class,0);
		}
		public Instruct_modulosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruct_modulos; }
	}

	public final Instruct_modulosContext instruct_modulos() throws RecognitionException {
		Instruct_modulosContext _localctx = new Instruct_modulosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruct_modulos);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((Instruct_modulosContext)_localctx).sent_Modulos = sent_Modulos();
				 _localctx.instr = ((Instruct_modulosContext)_localctx).sent_Modulos.instr 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((Instruct_modulosContext)_localctx).PUBLI = match(PUBLI);
				setState(201);
				((Instruct_modulosContext)_localctx).sent_funcion = sent_funcion();
				 _localctx.instr = modulos.NewFuncion_Mod( ((Instruct_modulosContext)_localctx).sent_funcion.instr, interfaces.PUBLICO, (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getLine():0), (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getCharPositionInLine():0) ) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((Instruct_modulosContext)_localctx).sf = sent_funcion();
				 _localctx.instr = modulos.NewFuncion_Mod( ((Instruct_modulosContext)_localctx).sf.instr, interfaces.PRIVADO, 0, 0 ) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				((Instruct_modulosContext)_localctx).PUBLI = match(PUBLI);
				setState(208);
				((Instruct_modulosContext)_localctx).sent_struct = sent_struct();
				 _localctx.instr = modulos.NewStruct_Mod( ((Instruct_modulosContext)_localctx).sent_struct.instr, interfaces.PUBLICO , (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getLine():0), (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getCharPositionInLine():0) ) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				((Instruct_modulosContext)_localctx).ss = sent_struct();
				 _localctx.instr = modulos.NewStruct_Mod( ((Instruct_modulosContext)_localctx).ss.instr, interfaces.PUBLICO , 0, 0 ) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_structContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token STRUCT;
		public Token ID;
		public Atributos_structContext atributos_struct;
		public TerminalNode STRUCT() { return getToken(Interprete.STRUCT, 0); }
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public Atributos_structContext atributos_struct() {
			return getRuleContext(Atributos_structContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Sent_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_struct; }
	}

	public final Sent_structContext sent_struct() throws RecognitionException {
		Sent_structContext _localctx = new Sent_structContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sent_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((Sent_structContext)_localctx).STRUCT = match(STRUCT);
			setState(217);
			((Sent_structContext)_localctx).ID = match(ID);
			setState(218);
			match(LLAVEA);
			setState(219);
			((Sent_structContext)_localctx).atributos_struct = atributos_struct(0);
			setState(220);
			match(LLAVEC);
			 _localctx.instr = structs.NewStruct((((Sent_structContext)_localctx).ID!=null?((Sent_structContext)_localctx).ID.getText():null), ((Sent_structContext)_localctx).atributos_struct.l,(((Sent_structContext)_localctx).STRUCT!=null?((Sent_structContext)_localctx).STRUCT.getLine():0),(((Sent_structContext)_localctx).STRUCT!=null?((Sent_structContext)_localctx).STRUCT.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atributos_structContext extends ParserRuleContext {
		public *arrayList.List l;
		public Atributos_structContext li;
		public Atributos_struct_declContext atributos_struct_decl;
		public Atributos_struct_declContext asd;
		public Atributos_struct_declContext atributos_struct_decl() {
			return getRuleContext(Atributos_struct_declContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public Atributos_structContext atributos_struct() {
			return getRuleContext(Atributos_structContext.class,0);
		}
		public Atributos_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_struct; }
	}

	public final Atributos_structContext atributos_struct() throws RecognitionException {
		return atributos_struct(0);
	}

	private Atributos_structContext atributos_struct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Atributos_structContext _localctx = new Atributos_structContext(_ctx, _parentState);
		Atributos_structContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_atributos_struct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			((Atributos_structContext)_localctx).atributos_struct_decl = atributos_struct_decl();

			        a := arrayList.New()
			        a.Add(((Atributos_structContext)_localctx).atributos_struct_decl.s)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Atributos_structContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_atributos_struct);
					setState(227);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(228);
					match(COMA);
					setState(229);
					((Atributos_structContext)_localctx).asd = ((Atributos_structContext)_localctx).atributos_struct_decl = atributos_struct_decl();

					                  ((Atributos_structContext)_localctx).li.l.Add(((Atributos_structContext)_localctx).asd.s)
					                  _localctx.l = ((Atributos_structContext)_localctx).li.l
					              
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Atributos_struct_declContext extends ParserRuleContext {
		public interfaces.Symbol s;
		public Token ID;
		public TipoContext tipo;
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(Interprete.ID); }
		public TerminalNode ID(int i) {
			return getToken(Interprete.ID, i);
		}
		public TerminalNode DPTS() { return getToken(Interprete.DPTS, 0); }
		public Array_decl_arrayContext array_decl_array() {
			return getRuleContext(Array_decl_arrayContext.class,0);
		}
		public Vector_declContext vector_decl() {
			return getRuleContext(Vector_declContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Atributos_struct_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_struct_decl; }
	}

	public final Atributos_struct_declContext atributos_struct_decl() throws RecognitionException {
		Atributos_struct_declContext _localctx = new Atributos_struct_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atributos_struct_decl);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((Atributos_struct_declContext)_localctx).ID = match(ID);
				setState(238);
				match(DPTS);
				setState(239);
				array_decl_array();
				_localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).ID!=null?((Atributos_struct_declContext)_localctx).ID.getText():null), Tipo: 6}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((Atributos_struct_declContext)_localctx).ID = match(ID);
				setState(243);
				match(DPTS);
				setState(244);
				vector_decl();
				 _localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).ID!=null?((Atributos_struct_declContext)_localctx).ID.getText():null), Tipo: 10} 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				((Atributos_struct_declContext)_localctx).ID = match(ID);
				setState(248);
				match(DPTS);
				setState(249);
				((Atributos_struct_declContext)_localctx).tipo = tipo();
				 _localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).ID!=null?((Atributos_struct_declContext)_localctx).ID.getText():null), Tipo: ((Atributos_struct_declContext)_localctx).tipo.te} 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				((Atributos_struct_declContext)_localctx).id1 = match(ID);
				setState(253);
				match(DPTS);
				setState(254);
				((Atributos_struct_declContext)_localctx).id2 = match(ID);
				 _localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).id1!=null?((Atributos_struct_declContext)_localctx).id1.getText():null), Tipo: 9, Valor: (((Atributos_struct_declContext)_localctx).id2!=null?((Atributos_struct_declContext)_localctx).id2.getText():null)} 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_funcionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token FUNCT;
		public Token ID;
		public InstruccionesContext instrucciones;
		public Params_funcionContext params_funcion;
		public TipoContext tipo;
		public Token id1;
		public Token id2;
		public TerminalNode FUNCT() { return getToken(Interprete.FUNCT, 0); }
		public List<TerminalNode> ID() { return getTokens(Interprete.ID); }
		public TerminalNode ID(int i) {
			return getToken(Interprete.ID, i);
		}
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Params_funcionContext params_funcion() {
			return getRuleContext(Params_funcionContext.class,0);
		}
		public TerminalNode REST() { return getToken(Interprete.REST, 0); }
		public List<TerminalNode> MAYOR() { return getTokens(Interprete.MAYOR); }
		public TerminalNode MAYOR(int i) {
			return getToken(Interprete.MAYOR, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Array_decl_arrayContext array_decl_array() {
			return getRuleContext(Array_decl_arrayContext.class,0);
		}
		public TerminalNode VEC() { return getToken(Interprete.VEC, 0); }
		public TerminalNode MENOR() { return getToken(Interprete.MENOR, 0); }
		public Sent_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_funcion; }
	}

	public final Sent_funcionContext sent_funcion() throws RecognitionException {
		Sent_funcionContext _localctx = new Sent_funcionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sent_funcion);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(259);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(260);
				match(PARA);
				setState(261);
				match(PARC);
				setState(262);
				match(LLAVEA);
				setState(263);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(264);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(268);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(269);
				match(PARA);
				setState(270);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(271);
				match(PARC);
				setState(272);
				match(LLAVEA);
				setState(273);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(274);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(278);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(279);
				match(PARA);
				setState(280);
				match(PARC);
				setState(281);
				match(REST);
				setState(282);
				match(MAYOR);
				setState(283);
				((Sent_funcionContext)_localctx).tipo = tipo();
				setState(284);
				match(LLAVEA);
				setState(285);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(286);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), ((Sent_funcionContext)_localctx).tipo.te, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(290);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(291);
				match(PARA);
				setState(292);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(293);
				match(PARC);
				setState(294);
				match(REST);
				setState(295);
				match(MAYOR);
				setState(296);
				((Sent_funcionContext)_localctx).tipo = tipo();
				setState(297);
				match(LLAVEA);
				setState(298);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(299);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, ((Sent_funcionContext)_localctx).tipo.te, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(303);
				((Sent_funcionContext)_localctx).id1 = match(ID);
				setState(304);
				match(PARA);
				setState(305);
				match(PARC);
				setState(306);
				match(REST);
				setState(307);
				match(MAYOR);
				setState(308);
				((Sent_funcionContext)_localctx).id2 = match(ID);
				setState(309);
				match(LLAVEA);
				setState(310);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(311);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).id1!=null?((Sent_funcionContext)_localctx).id1.getText():null), arrayList.New(), interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(315);
				((Sent_funcionContext)_localctx).id1 = match(ID);
				setState(316);
				match(PARA);
				setState(317);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(318);
				match(PARC);
				setState(319);
				match(REST);
				setState(320);
				match(MAYOR);
				setState(321);
				((Sent_funcionContext)_localctx).id2 = match(ID);
				setState(322);
				match(LLAVEA);
				setState(323);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(324);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).id1!=null?((Sent_funcionContext)_localctx).id1.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(328);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(329);
				match(PARA);
				setState(330);
				match(PARC);
				setState(331);
				match(REST);
				setState(332);
				match(MAYOR);
				setState(333);
				array_decl_array();
				setState(334);
				match(LLAVEA);
				setState(335);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(336);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), interfaces.ARRAY, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(340);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(341);
				match(PARA);
				setState(342);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(343);
				match(PARC);
				setState(344);
				match(REST);
				setState(345);
				match(MAYOR);
				setState(346);
				array_decl_array();
				setState(347);
				match(LLAVEA);
				setState(348);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(349);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.ARRAY, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(352);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(353);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(354);
				match(PARA);
				setState(355);
				match(PARC);
				setState(356);
				match(REST);
				setState(357);
				match(MAYOR);
				setState(358);
				match(VEC);
				setState(359);
				match(MENOR);
				setState(360);
				tipo();
				setState(361);
				match(MAYOR);
				setState(362);
				match(LLAVEA);
				setState(363);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(364);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), interfaces.VECTOR, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(367);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(368);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(369);
				match(PARA);
				setState(370);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(371);
				match(PARC);
				setState(372);
				match(REST);
				setState(373);
				match(MAYOR);
				setState(374);
				match(VEC);
				setState(375);
				match(MENOR);
				setState(376);
				tipo();
				setState(377);
				match(MAYOR);
				setState(378);
				match(LLAVEA);
				setState(379);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(380);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.VECTOR, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Params_funcionContext extends ParserRuleContext {
		public *arrayList.List l;
		public Params_funcionContext li;
		public Params_funcion_declContext params_funcion_decl;
		public Params_funcion_declContext params_funcion_decl() {
			return getRuleContext(Params_funcion_declContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public Params_funcionContext params_funcion() {
			return getRuleContext(Params_funcionContext.class,0);
		}
		public Params_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_funcion; }
	}

	public final Params_funcionContext params_funcion() throws RecognitionException {
		return params_funcion(0);
	}

	private Params_funcionContext params_funcion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Params_funcionContext _localctx = new Params_funcionContext(_ctx, _parentState);
		Params_funcionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_params_funcion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			((Params_funcionContext)_localctx).params_funcion_decl = params_funcion_decl();
			 
			        a := arrayList.New()
			        a.Add(((Params_funcionContext)_localctx).params_funcion_decl.s)
			        _localctx.l = a
			     
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Params_funcionContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_params_funcion);
					setState(389);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(390);
					match(COMA);
					setState(391);
					((Params_funcionContext)_localctx).params_funcion_decl = params_funcion_decl();

					                  ((Params_funcionContext)_localctx).li.l.Add(((Params_funcionContext)_localctx).params_funcion_decl.s)  
					                  _localctx.l = ((Params_funcionContext)_localctx).li.l
					              
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Params_funcion_declContext extends ParserRuleContext {
		public interfaces.Symbol s;
		public Token ID;
		public TipoContext tipo;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode DPTS() { return getToken(Interprete.DPTS, 0); }
		public TerminalNode PUNTERO() { return getToken(Interprete.PUNTERO, 0); }
		public TerminalNode MUT() { return getToken(Interprete.MUT, 0); }
		public Array_decl_arrayContext array_decl_array() {
			return getRuleContext(Array_decl_arrayContext.class,0);
		}
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Params_funcion_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_funcion_decl; }
	}

	public final Params_funcion_declContext params_funcion_decl() throws RecognitionException {
		Params_funcion_declContext _localctx = new Params_funcion_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params_funcion_decl);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(400);
				match(DPTS);
				setState(401);
				match(PUNTERO);
				setState(402);
				match(MUT);
				setState(403);
				array_decl_array();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 6, IsMut: true} 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(407);
				match(DPTS);
				setState(408);
				match(PUNTERO);
				setState(409);
				array_decl_array();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 6, IsMut: false} 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(413);
				match(DPTS);
				setState(414);
				match(PUNTERO);
				setState(415);
				match(MUT);
				setState(416);
				vector_expr();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 10, IsMut: true} 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(420);
				match(DPTS);
				setState(421);
				match(PUNTERO);
				setState(422);
				vector_expr();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 10, IsMut: false} 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(426);
				match(DPTS);
				setState(427);
				match(MUT);
				setState(428);
				((Params_funcion_declContext)_localctx).tipo = tipo();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: ((Params_funcion_declContext)_localctx).tipo.te, IsMut: true} 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(432);
				match(DPTS);
				setState(433);
				((Params_funcion_declContext)_localctx).tipo = tipo();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: ((Params_funcion_declContext)_localctx).tipo.te, IsMut: false} 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_LlamadaContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public Token PARA;
		public Params_llamadaContext li;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public Params_llamadaContext params_llamada() {
			return getRuleContext(Params_llamadaContext.class,0);
		}
		public Sent_LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_Llamada; }
	}

	public final Sent_LlamadaContext sent_Llamada() throws RecognitionException {
		Sent_LlamadaContext _localctx = new Sent_LlamadaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sent_Llamada);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				((Sent_LlamadaContext)_localctx).ID = match(ID);
				setState(439);
				((Sent_LlamadaContext)_localctx).PARA = match(PARA);
				setState(440);
				match(PARC);
				setState(441);
				match(PYC);
				 _localctx.instr = instruction.NewLlamada((((Sent_LlamadaContext)_localctx).ID!=null?((Sent_LlamadaContext)_localctx).ID.getText():null), arrayList.New(), (((Sent_LlamadaContext)_localctx).PARA!=null?((Sent_LlamadaContext)_localctx).PARA.getLine():0), (((Sent_LlamadaContext)_localctx).PARA!=null?((Sent_LlamadaContext)_localctx).PARA.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				((Sent_LlamadaContext)_localctx).ID = match(ID);
				setState(444);
				((Sent_LlamadaContext)_localctx).PARA = match(PARA);
				setState(445);
				((Sent_LlamadaContext)_localctx).li = params_llamada(0);
				setState(446);
				match(PARC);
				setState(447);
				match(PYC);
				 _localctx.instr = instruction.NewLlamada((((Sent_LlamadaContext)_localctx).ID!=null?((Sent_LlamadaContext)_localctx).ID.getText():null), ((Sent_LlamadaContext)_localctx).li.l, (((Sent_LlamadaContext)_localctx).PARA!=null?((Sent_LlamadaContext)_localctx).PARA.getLine():0), (((Sent_LlamadaContext)_localctx).PARA!=null?((Sent_LlamadaContext)_localctx).PARA.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Params_llamadaContext extends ParserRuleContext {
		public *arrayList.List l;
		public Params_llamadaContext li;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PUNTERO() { return getToken(Interprete.PUNTERO, 0); }
		public TerminalNode MUT() { return getToken(Interprete.MUT, 0); }
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public Params_llamadaContext params_llamada() {
			return getRuleContext(Params_llamadaContext.class,0);
		}
		public Params_llamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_llamada; }
	}

	public final Params_llamadaContext params_llamada() throws RecognitionException {
		return params_llamada(0);
	}

	private Params_llamadaContext params_llamada(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Params_llamadaContext _localctx = new Params_llamadaContext(_ctx, _parentState);
		Params_llamadaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_params_llamada, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case FLOAT_NUM:
			case CHAR_2:
			case CADENA:
			case EXCLA:
			case PARA:
			case REST:
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case ID:
				{
				setState(453);
				((Params_llamadaContext)_localctx).expression = expression(0);

				        a := arrayList.New()
				        a.Add(((Params_llamadaContext)_localctx).expression.p)
				        _localctx.l = a
				    
				}
				break;
			case PUNTERO:
				{
				setState(456);
				match(PUNTERO);
				setState(457);
				match(MUT);
				setState(458);
				((Params_llamadaContext)_localctx).expression = expression(0);

				        a := arrayList.New()
				        a.Add(((Params_llamadaContext)_localctx).expression.p)
				        _localctx.l = a
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(475);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Params_llamadaContext(_parentctx, _parentState);
						_localctx.li = _prevctx;
						_localctx.li = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_params_llamada);
						setState(463);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(464);
						match(COMA);
						setState(465);
						((Params_llamadaContext)_localctx).expression = expression(0);
						 
						                  ((Params_llamadaContext)_localctx).li.l.Add(((Params_llamadaContext)_localctx).expression.p)  
						                  _localctx.l = ((Params_llamadaContext)_localctx).li.l
						                  
						}
						break;
					case 2:
						{
						_localctx = new Params_llamadaContext(_parentctx, _parentState);
						_localctx.li = _prevctx;
						_localctx.li = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_params_llamada);
						setState(468);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(469);
						match(COMA);
						setState(470);
						match(PUNTERO);
						setState(471);
						match(MUT);
						setState(472);
						((Params_llamadaContext)_localctx).expression = expression(0);
						 
						                  ((Params_llamadaContext)_localctx).li.l.Add(((Params_llamadaContext)_localctx).expression.p)  
						                  _localctx.l = ((Params_llamadaContext)_localctx).li.l
						                  
						}
						break;
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Funciones_TransContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token BRE;
		public ExpressionContext expression;
		public Token CONTINIU;
		public Token RETURNASO;
		public Expression_vec_ArrContext expression_vec_Arr;
		public TerminalNode BRE() { return getToken(Interprete.BRE, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONTINIU() { return getToken(Interprete.CONTINIU, 0); }
		public TerminalNode RETURNASO() { return getToken(Interprete.RETURNASO, 0); }
		public Expression_vec_ArrContext expression_vec_Arr() {
			return getRuleContext(Expression_vec_ArrContext.class,0);
		}
		public Funciones_TransContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones_Trans; }
	}

	public final Funciones_TransContext funciones_Trans() throws RecognitionException {
		Funciones_TransContext _localctx = new Funciones_TransContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funciones_Trans);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				((Funciones_TransContext)_localctx).BRE = match(BRE);
				setState(481);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewBreak( nil, (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getLine():0), (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getCharPositionInLine():0) ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				((Funciones_TransContext)_localctx).BRE = match(BRE);
				setState(484);
				((Funciones_TransContext)_localctx).expression = expression(0);
				setState(485);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewBreak( ((Funciones_TransContext)_localctx).expression.p, (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getLine():0), (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getCharPositionInLine():0) ) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				((Funciones_TransContext)_localctx).CONTINIU = match(CONTINIU);
				setState(489);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewContinue((((Funciones_TransContext)_localctx).CONTINIU!=null?((Funciones_TransContext)_localctx).CONTINIU.getLine():0), (((Funciones_TransContext)_localctx).CONTINIU!=null?((Funciones_TransContext)_localctx).CONTINIU.getCharPositionInLine():0)) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				((Funciones_TransContext)_localctx).RETURNASO = match(RETURNASO);
				setState(492);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewReturnaso(nil, (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getLine():0), (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getCharPositionInLine():0)) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				((Funciones_TransContext)_localctx).RETURNASO = match(RETURNASO);
				setState(495);
				((Funciones_TransContext)_localctx).expression = expression(0);
				setState(496);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewReturnaso(((Funciones_TransContext)_localctx).expression.p, (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getLine():0), (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getCharPositionInLine():0)) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				((Funciones_TransContext)_localctx).RETURNASO = match(RETURNASO);
				setState(500);
				((Funciones_TransContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(501);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewReturnaso(((Funciones_TransContext)_localctx).expression_vec_Arr.p, (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getLine():0), (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public TipoContext tipo;
		public Token IGUAL;
		public ExpressionContext expression;
		public Sentencias_exprContext sentencias_expr;
		public TerminalNode LET() { return getToken(Interprete.LET, 0); }
		public TerminalNode MUT() { return getToken(Interprete.MUT, 0); }
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode DPTS() { return getToken(Interprete.DPTS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public Sentencias_exprContext sentencias_expr() {
			return getRuleContext(Sentencias_exprContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracion);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(LET);
				setState(507);
				match(MUT);
				setState(508);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(509);
				match(DPTS);
				setState(510);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(511);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(512);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(513);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).expression.p, true ,(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(LET);
				setState(517);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(518);
				match(DPTS);
				setState(519);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(520);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(521);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(522);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).expression.p, false,  (((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(LET);
				setState(526);
				match(MUT);
				setState(527);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(528);
				match(DPTS);
				setState(529);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(530);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(531);
				((DeclaracionContext)_localctx).sentencias_expr = sentencias_expr();
				setState(532);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).sentencias_expr.p, true,(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(LET);
				setState(536);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(537);
				match(DPTS);
				setState(538);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(539);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(540);
				((DeclaracionContext)_localctx).sentencias_expr = sentencias_expr();
				setState(541);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).sentencias_expr.p, false, (((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token LET;
		public Token ID;
		public Array_decl_arrayContext tr;
		public Expression_vec_ArrContext ea;
		public TerminalNode LET() { return getToken(Interprete.LET, 0); }
		public TerminalNode MUT() { return getToken(Interprete.MUT, 0); }
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode DPTS() { return getToken(Interprete.DPTS, 0); }
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public Array_decl_arrayContext array_decl_array() {
			return getRuleContext(Array_decl_arrayContext.class,0);
		}
		public Expression_vec_ArrContext expression_vec_Arr() {
			return getRuleContext(Expression_vec_ArrContext.class,0);
		}
		public Array_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl; }
	}

	public final Array_declContext array_decl() throws RecognitionException {
		Array_declContext _localctx = new Array_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_decl);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				((Array_declContext)_localctx).LET = match(LET);
				setState(547);
				match(MUT);
				setState(548);
				((Array_declContext)_localctx).ID = match(ID);
				setState(549);
				match(DPTS);
				setState(550);
				((Array_declContext)_localctx).tr = array_decl_array();
				setState(551);
				match(IGUAL);
				setState(552);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(553);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), ((Array_declContext)_localctx).tr.at, ((Array_declContext)_localctx).ea.p, true, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				((Array_declContext)_localctx).LET = match(LET);
				setState(557);
				match(MUT);
				setState(558);
				((Array_declContext)_localctx).ID = match(ID);
				setState(559);
				match(IGUAL);
				setState(560);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(561);
				match(PYC);

				        var a *structsinter.Array_type
				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), a, ((Array_declContext)_localctx).ea.p, true, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				((Array_declContext)_localctx).LET = match(LET);
				setState(565);
				((Array_declContext)_localctx).ID = match(ID);
				setState(566);
				match(DPTS);
				setState(567);
				((Array_declContext)_localctx).tr = array_decl_array();
				setState(568);
				match(IGUAL);
				setState(569);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(570);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), ((Array_declContext)_localctx).tr.at, ((Array_declContext)_localctx).ea.p, false, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				((Array_declContext)_localctx).LET = match(LET);
				setState(574);
				((Array_declContext)_localctx).ID = match(ID);
				setState(575);
				match(IGUAL);
				setState(576);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(577);
				match(PYC);

				        var a *structsinter.Array_type
				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), a, ((Array_declContext)_localctx).ea.p, false, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_decl_arrayContext extends ParserRuleContext {
		public *structsinter.Array_type at;
		public Array_decl_arrayContext stru;
		public Expression_vec_ArrContext expression_vec_Arr;
		public TipoContext tipo;
		public TerminalNode CORCHA() { return getToken(Interprete.CORCHA, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public Expression_vec_ArrContext expression_vec_Arr() {
			return getRuleContext(Expression_vec_ArrContext.class,0);
		}
		public TerminalNode CORCHC() { return getToken(Interprete.CORCHC, 0); }
		public Array_decl_arrayContext array_decl_array() {
			return getRuleContext(Array_decl_arrayContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Array_decl_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl_array; }
	}

	public final Array_decl_arrayContext array_decl_array() throws RecognitionException {
		Array_decl_arrayContext _localctx = new Array_decl_arrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_decl_array);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(CORCHA);
				setState(583);
				((Array_decl_arrayContext)_localctx).stru = array_decl_array();
				setState(584);
				match(PYC);
				setState(585);
				((Array_decl_arrayContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(586);
				match(CORCHC);

				        a:= &structsinter.Array_type{
				                Tipo: ((Array_decl_arrayContext)_localctx).stru.at.Tipo,
				                Size: ((Array_decl_arrayContext)_localctx).expression_vec_Arr.p,
				                Array_Son: ((Array_decl_arrayContext)_localctx).stru.at,
					        }
				        _localctx.at = a 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(CORCHA);
				setState(590);
				((Array_decl_arrayContext)_localctx).tipo = tipo();
				setState(591);
				match(PYC);
				setState(592);
				((Array_decl_arrayContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(593);
				match(CORCHC);

				        a:= &structsinter.Array_type{
				                Tipo: ((Array_decl_arrayContext)_localctx).tipo.te,
				                Size: ((Array_decl_arrayContext)_localctx).expression_vec_Arr.p,
				                Array_Son: nil,
					        }
				        _localctx.at = a
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector_declContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token LET;
		public Token ID;
		public TipoContext tipo;
		public Vector_exprContext ea;
		public Token id1;
		public Token id2;
		public TerminalNode LET() { return getToken(Interprete.LET, 0); }
		public TerminalNode MUT() { return getToken(Interprete.MUT, 0); }
		public List<TerminalNode> ID() { return getTokens(Interprete.ID); }
		public TerminalNode ID(int i) {
			return getToken(Interprete.ID, i);
		}
		public TerminalNode DPTS() { return getToken(Interprete.DPTS, 0); }
		public TerminalNode VEC() { return getToken(Interprete.VEC, 0); }
		public TerminalNode MENOR() { return getToken(Interprete.MENOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public Vector_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_decl; }
	}

	public final Vector_declContext vector_decl() throws RecognitionException {
		Vector_declContext _localctx = new Vector_declContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_vector_decl);
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(599);
				match(MUT);
				setState(600);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(601);
				match(DPTS);
				setState(602);
				match(VEC);
				setState(603);
				match(MENOR);
				setState(604);
				((Vector_declContext)_localctx).tipo = tipo();
				setState(605);
				match(MAYOR);
				setState(606);
				match(IGUAL);
				setState(607);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(608);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), ((Vector_declContext)_localctx).tipo.te, ((Vector_declContext)_localctx).ea.p, "" ,true, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(612);
				match(MUT);
				setState(613);
				((Vector_declContext)_localctx).id1 = match(ID);
				setState(614);
				match(DPTS);
				setState(615);
				match(VEC);
				setState(616);
				match(MENOR);
				setState(617);
				((Vector_declContext)_localctx).id2 = match(ID);
				setState(618);
				match(MAYOR);
				setState(619);
				match(IGUAL);
				setState(620);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(621);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).id1!=null?((Vector_declContext)_localctx).id1.getText():null), interfaces.STRUCT, ((Vector_declContext)_localctx).ea.p, (((Vector_declContext)_localctx).id2!=null?((Vector_declContext)_localctx).id2.getText():null) ,true, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(625);
				match(MUT);
				setState(626);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(627);
				match(IGUAL);
				setState(628);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(629);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), 4, ((Vector_declContext)_localctx).ea.p, "" ,true, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(633);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(634);
				match(DPTS);
				setState(635);
				match(VEC);
				setState(636);
				match(MENOR);
				setState(637);
				((Vector_declContext)_localctx).tipo = tipo();
				setState(638);
				match(MAYOR);
				setState(639);
				match(IGUAL);
				setState(640);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(641);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), ((Vector_declContext)_localctx).tipo.te, ((Vector_declContext)_localctx).ea.p, "" ,false, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(645);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(646);
				match(IGUAL);
				setState(647);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(648);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), 4, ((Vector_declContext)_localctx).ea.p, "" ,false, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(651);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(652);
				((Vector_declContext)_localctx).id1 = match(ID);
				setState(653);
				match(DPTS);
				setState(654);
				match(VEC);
				setState(655);
				match(MENOR);
				setState(656);
				((Vector_declContext)_localctx).id2 = match(ID);
				setState(657);
				match(MAYOR);
				setState(658);
				match(IGUAL);
				setState(659);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(660);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).id1!=null?((Vector_declContext)_localctx).id1.getText():null), interfaces.STRUCT, ((Vector_declContext)_localctx).ea.p, (((Vector_declContext)_localctx).id2!=null?((Vector_declContext)_localctx).id2.getText():null) ,false, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector_exprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token CORCHA;
		public List_expre_vec_arrContext list_expre_vec_arr;
		public Expression_vec_ArrContext exp1;
		public Expression_vec_ArrContext exp2;
		public Token NEWI;
		public Token WITH_CAP;
		public Expression_vec_ArrContext expression_vec_Arr;
		public TerminalNode VEC() { return getToken(Interprete.VEC, 0); }
		public TerminalNode EXCLA() { return getToken(Interprete.EXCLA, 0); }
		public TerminalNode CORCHA() { return getToken(Interprete.CORCHA, 0); }
		public List_expre_vec_arrContext list_expre_vec_arr() {
			return getRuleContext(List_expre_vec_arrContext.class,0);
		}
		public TerminalNode CORCHC() { return getToken(Interprete.CORCHC, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public List<Expression_vec_ArrContext> expression_vec_Arr() {
			return getRuleContexts(Expression_vec_ArrContext.class);
		}
		public Expression_vec_ArrContext expression_vec_Arr(int i) {
			return getRuleContext(Expression_vec_ArrContext.class,i);
		}
		public List<TerminalNode> DPTS() { return getTokens(Interprete.DPTS); }
		public TerminalNode DPTS(int i) {
			return getToken(Interprete.DPTS, i);
		}
		public TerminalNode NEWI() { return getToken(Interprete.NEWI, 0); }
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode WITH_CAP() { return getToken(Interprete.WITH_CAP, 0); }
		public Vector_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_expr; }
	}

	public final Vector_exprContext vector_expr() throws RecognitionException {
		Vector_exprContext _localctx = new Vector_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vector_expr);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(VEC);
				setState(666);
				match(EXCLA);
				setState(667);
				((Vector_exprContext)_localctx).CORCHA = match(CORCHA);
				setState(668);
				((Vector_exprContext)_localctx).list_expre_vec_arr = list_expre_vec_arr(0);
				setState(669);
				match(CORCHC);
				 
				        var a,b,c interfaces.Expresion
				        _localctx.p = vector.NewVector( ((Vector_exprContext)_localctx).list_expre_vec_arr.l, a , b , false,c,(((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getLine():0), (((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getCharPositionInLine():0)  ) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(VEC);
				setState(673);
				match(EXCLA);
				setState(674);
				((Vector_exprContext)_localctx).CORCHA = match(CORCHA);
				setState(675);
				((Vector_exprContext)_localctx).exp1 = expression_vec_Arr(0);
				setState(676);
				match(PYC);
				setState(677);
				((Vector_exprContext)_localctx).exp2 = expression_vec_Arr(0);
				setState(678);
				match(CORCHC);
				 
				        var a interfaces.Expresion
				        _localctx.p = vector.NewVector( arrayList.New(), ((Vector_exprContext)_localctx).exp1.p, ((Vector_exprContext)_localctx).exp2.p ,false, a ,(((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getLine():0), (((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getCharPositionInLine():0)) 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				match(VEC);
				setState(682);
				match(DPTS);
				setState(683);
				match(DPTS);
				setState(684);
				((Vector_exprContext)_localctx).NEWI = match(NEWI);
				setState(685);
				match(PARA);
				setState(686);
				match(PARC);
				 
				        var a,b,c interfaces.Expresion
				        _localctx.p =  vector.NewVector(arrayList.New(),a,b,true,c,(((Vector_exprContext)_localctx).NEWI!=null?((Vector_exprContext)_localctx).NEWI.getLine():0),(((Vector_exprContext)_localctx).NEWI!=null?((Vector_exprContext)_localctx).NEWI.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				match(VEC);
				setState(689);
				match(EXCLA);
				setState(690);
				match(DPTS);
				setState(691);
				match(DPTS);
				setState(692);
				((Vector_exprContext)_localctx).WITH_CAP = match(WITH_CAP);
				setState(693);
				match(PARA);
				setState(694);
				((Vector_exprContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(695);
				match(PARC);
				 
				        var a,b interfaces.Expresion
				        _localctx.p =  vector.NewVector(arrayList.New(),a,b,false,((Vector_exprContext)_localctx).expression_vec_Arr.p,(((Vector_exprContext)_localctx).WITH_CAP!=null?((Vector_exprContext)_localctx).WITH_CAP.getLine():0),(((Vector_exprContext)_localctx).WITH_CAP!=null?((Vector_exprContext)_localctx).WITH_CAP.getCharPositionInLine():0)) 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_funciones_VecContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public Token PUSH;
		public ExpressionContext expression;
		public Token INSERT;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public Token REMOVE;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode PNT() { return getToken(Interprete.PNT, 0); }
		public TerminalNode PUSH() { return getToken(Interprete.PUSH, 0); }
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public TerminalNode INSERT() { return getToken(Interprete.INSERT, 0); }
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public TerminalNode REMOVE() { return getToken(Interprete.REMOVE, 0); }
		public Sent_funciones_VecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_funciones_Vec; }
	}

	public final Sent_funciones_VecContext sent_funciones_Vec() throws RecognitionException {
		Sent_funciones_VecContext _localctx = new Sent_funciones_VecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sent_funciones_Vec);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				((Sent_funciones_VecContext)_localctx).ID = match(ID);
				setState(701);
				match(PNT);
				setState(702);
				((Sent_funciones_VecContext)_localctx).PUSH = match(PUSH);
				setState(703);
				match(PARA);
				setState(704);
				((Sent_funciones_VecContext)_localctx).expression = expression(0);
				setState(705);
				match(PARC);
				setState(706);
				match(PYC);
				 _localctx.instr = funcionesvectores.NewPush((((Sent_funciones_VecContext)_localctx).ID!=null?((Sent_funciones_VecContext)_localctx).ID.getText():null), ((Sent_funciones_VecContext)_localctx).expression.p, (((Sent_funciones_VecContext)_localctx).PUSH!=null?((Sent_funciones_VecContext)_localctx).PUSH.getLine():0), (((Sent_funciones_VecContext)_localctx).PUSH!=null?((Sent_funciones_VecContext)_localctx).PUSH.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				((Sent_funciones_VecContext)_localctx).ID = match(ID);
				setState(710);
				match(PNT);
				setState(711);
				((Sent_funciones_VecContext)_localctx).INSERT = match(INSERT);
				setState(712);
				match(PARA);
				setState(713);
				((Sent_funciones_VecContext)_localctx).exp1 = expression(0);
				setState(714);
				match(COMA);
				setState(715);
				((Sent_funciones_VecContext)_localctx).exp2 = expression(0);
				setState(716);
				match(PARC);
				setState(717);
				match(PYC);
				 
				        _localctx.instr = funcionesvectores.NewInsert((((Sent_funciones_VecContext)_localctx).ID!=null?((Sent_funciones_VecContext)_localctx).ID.getText():null), ((Sent_funciones_VecContext)_localctx).exp1.p, ((Sent_funciones_VecContext)_localctx).exp2.p, (((Sent_funciones_VecContext)_localctx).INSERT!=null?((Sent_funciones_VecContext)_localctx).INSERT.getLine():0), (((Sent_funciones_VecContext)_localctx).INSERT!=null?((Sent_funciones_VecContext)_localctx).INSERT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				((Sent_funciones_VecContext)_localctx).ID = match(ID);
				setState(721);
				match(PNT);
				setState(722);
				((Sent_funciones_VecContext)_localctx).REMOVE = match(REMOVE);
				setState(723);
				match(PARA);
				setState(724);
				((Sent_funciones_VecContext)_localctx).expression = expression(0);
				setState(725);
				match(PARC);
				setState(726);
				match(PYC);
				 
				        _localctx.instr = funcionesvectores.NewRemove_instr((((Sent_funciones_VecContext)_localctx).ID!=null?((Sent_funciones_VecContext)_localctx).ID.getText():null), ((Sent_funciones_VecContext)_localctx).expression.p, (((Sent_funciones_VecContext)_localctx).REMOVE!=null?((Sent_funciones_VecContext)_localctx).REMOVE.getLine():0), (((Sent_funciones_VecContext)_localctx).REMOVE!=null?((Sent_funciones_VecContext)_localctx).REMOVE.getCharPositionInLine():0)) 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencias_exprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Sent_if_exprContext sent_if_expr;
		public Sent_loop_exprContext sent_loop_expr;
		public Sent_matchexprContext sent_matchexpr;
		public Sent_if_exprContext sent_if_expr() {
			return getRuleContext(Sent_if_exprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public Sent_loop_exprContext sent_loop_expr() {
			return getRuleContext(Sent_loop_exprContext.class,0);
		}
		public Sent_matchexprContext sent_matchexpr() {
			return getRuleContext(Sent_matchexprContext.class,0);
		}
		public Sentencias_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias_expr; }
	}

	public final Sentencias_exprContext sentencias_expr() throws RecognitionException {
		Sentencias_exprContext _localctx = new Sentencias_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentencias_expr);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				((Sentencias_exprContext)_localctx).sent_if_expr = sent_if_expr();
				setState(732);
				match(PYC);
				 _localctx.p = ((Sentencias_exprContext)_localctx).sent_if_expr.p 
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				((Sentencias_exprContext)_localctx).sent_loop_expr = sent_loop_expr();
				 _localctx.p = ((Sentencias_exprContext)_localctx).sent_loop_expr.p 
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				((Sentencias_exprContext)_localctx).sent_matchexpr = sent_matchexpr();
				 _localctx.p = ((Sentencias_exprContext)_localctx).sent_matchexpr.p 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_matchexprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token MATCH;
		public ExpressionContext expression;
		public Matchexpr_listbrazosContext matchexpr_listbrazos;
		public El_defaultexprContext el_defaultexpr;
		public TerminalNode MATCH() { return getToken(Interprete.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public Matchexpr_listbrazosContext matchexpr_listbrazos() {
			return getRuleContext(Matchexpr_listbrazosContext.class,0);
		}
		public El_defaultexprContext el_defaultexpr() {
			return getRuleContext(El_defaultexprContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Sent_matchexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_matchexpr; }
	}

	public final Sent_matchexprContext sent_matchexpr() throws RecognitionException {
		Sent_matchexprContext _localctx = new Sent_matchexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent_matchexpr);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				((Sent_matchexprContext)_localctx).MATCH = match(MATCH);
				setState(744);
				((Sent_matchexprContext)_localctx).expression = expression(0);
				setState(745);
				match(LLAVEA);
				setState(746);
				((Sent_matchexprContext)_localctx).matchexpr_listbrazos = matchexpr_listbrazos(0);
				setState(747);
				((Sent_matchexprContext)_localctx).el_defaultexpr = el_defaultexpr();
				setState(748);
				match(LLAVEC);
				 
				        _localctx.p = matchexpr.NewMatch_Expr(((Sent_matchexprContext)_localctx).expression.p, ((Sent_matchexprContext)_localctx).matchexpr_listbrazos.l, ((Sent_matchexprContext)_localctx).el_defaultexpr.p, (((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getLine():0),(((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getCharPositionInLine():0)) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				((Sent_matchexprContext)_localctx).MATCH = match(MATCH);
				setState(752);
				((Sent_matchexprContext)_localctx).expression = expression(0);
				setState(753);
				match(LLAVEA);
				setState(754);
				((Sent_matchexprContext)_localctx).matchexpr_listbrazos = matchexpr_listbrazos(0);
				setState(755);
				match(LLAVEC);

				        var a interfaces.Expresion
				        _localctx.p = matchexpr.NewMatch_Expr(((Sent_matchexprContext)_localctx).expression.p, ((Sent_matchexprContext)_localctx).matchexpr_listbrazos.l, a, (((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getLine():0),(((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getCharPositionInLine():0))
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				((Sent_matchexprContext)_localctx).MATCH = match(MATCH);
				setState(759);
				((Sent_matchexprContext)_localctx).expression = expression(0);
				setState(760);
				match(LLAVEA);
				setState(761);
				((Sent_matchexprContext)_localctx).el_defaultexpr = el_defaultexpr();
				setState(762);
				match(LLAVEC);

				        _localctx.p = matchexpr.NewMatch_Expr(((Sent_matchexprContext)_localctx).expression.p, arrayList.New(), ((Sent_matchexprContext)_localctx).el_defaultexpr.p, (((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getLine():0),(((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getCharPositionInLine():0)) 
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matchexpr_listbrazosContext extends ParserRuleContext {
		public *arrayList.List l;
		public Matchexpr_listbrazosContext brz;
		public List_brazosexprContext list_brazosexpr;
		public List_brazosexprContext list_brazosexpr() {
			return getRuleContext(List_brazosexprContext.class,0);
		}
		public Matchexpr_listbrazosContext matchexpr_listbrazos() {
			return getRuleContext(Matchexpr_listbrazosContext.class,0);
		}
		public Matchexpr_listbrazosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchexpr_listbrazos; }
	}

	public final Matchexpr_listbrazosContext matchexpr_listbrazos() throws RecognitionException {
		return matchexpr_listbrazos(0);
	}

	private Matchexpr_listbrazosContext matchexpr_listbrazos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Matchexpr_listbrazosContext _localctx = new Matchexpr_listbrazosContext(_ctx, _parentState);
		Matchexpr_listbrazosContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_matchexpr_listbrazos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(768);
			((Matchexpr_listbrazosContext)_localctx).list_brazosexpr = list_brazosexpr();

			        a := arrayList.New()
			        a.Add(((Matchexpr_listbrazosContext)_localctx).list_brazosexpr.p)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Matchexpr_listbrazosContext(_parentctx, _parentState);
					_localctx.brz = _prevctx;
					_localctx.brz = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_matchexpr_listbrazos);
					setState(771);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(772);
					((Matchexpr_listbrazosContext)_localctx).list_brazosexpr = list_brazosexpr();

					                  ((Matchexpr_listbrazosContext)_localctx).brz.l.Add(((Matchexpr_listbrazosContext)_localctx).list_brazosexpr.p)
					                  _localctx.l = ((Matchexpr_listbrazosContext)_localctx).brz.l
					              
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class List_brazosexprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ExpressionContext po;
		public Token IGUAL;
		public ExpressionContext pi;
		public Matchexpr_listbrazosexpr_listexprContext exp;
		public ExpressionContext expression;
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Matchexpr_listbrazosexpr_listexprContext matchexpr_listbrazosexpr_listexpr() {
			return getRuleContext(Matchexpr_listbrazosexpr_listexprContext.class,0);
		}
		public List_brazosexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_brazosexpr; }
	}

	public final List_brazosexprContext list_brazosexpr() throws RecognitionException {
		List_brazosexprContext _localctx = new List_brazosexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list_brazosexpr);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				((List_brazosexprContext)_localctx).po = expression(0);
				setState(781);
				((List_brazosexprContext)_localctx).IGUAL = match(IGUAL);
				setState(782);
				match(MAYOR);
				setState(783);
				((List_brazosexprContext)_localctx).pi = expression(0);
				setState(784);
				match(COMA);
				 
				        a := arrayList.New()
				        a.Add(((List_brazosexprContext)_localctx).po.p)
				        _localctx.p = matchexpr.NewBrazo_expr(a, ((List_brazosexprContext)_localctx).pi.p, (((List_brazosexprContext)_localctx).IGUAL!=null?((List_brazosexprContext)_localctx).IGUAL.getLine():0) , (((List_brazosexprContext)_localctx).IGUAL!=null?((List_brazosexprContext)_localctx).IGUAL.getCharPositionInLine():0))
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				((List_brazosexprContext)_localctx).exp = matchexpr_listbrazosexpr_listexpr();
				setState(788);
				((List_brazosexprContext)_localctx).IGUAL = match(IGUAL);
				setState(789);
				match(MAYOR);
				setState(790);
				((List_brazosexprContext)_localctx).expression = expression(0);
				setState(791);
				match(COMA);
				 _localctx.p = matchexpr.NewBrazo_expr( ((List_brazosexprContext)_localctx).exp.l , ((List_brazosexprContext)_localctx).expression.p ,(((List_brazosexprContext)_localctx).IGUAL!=null?((List_brazosexprContext)_localctx).IGUAL.getLine():0), (((List_brazosexprContext)_localctx).IGUAL!=null?((List_brazosexprContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matchexpr_listbrazosexpr_listexprContext extends ParserRuleContext {
		public *arrayList.List l;
		public Match_listbrazos_listexprContext g;
		public ExpressionContext expression;
		public TerminalNode OR_MATCH() { return getToken(Interprete.OR_MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Match_listbrazos_listexprContext match_listbrazos_listexpr() {
			return getRuleContext(Match_listbrazos_listexprContext.class,0);
		}
		public Matchexpr_listbrazosexpr_listexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchexpr_listbrazosexpr_listexpr; }
	}

	public final Matchexpr_listbrazosexpr_listexprContext matchexpr_listbrazosexpr_listexpr() throws RecognitionException {
		Matchexpr_listbrazosexpr_listexprContext _localctx = new Matchexpr_listbrazosexpr_listexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_matchexpr_listbrazosexpr_listexpr);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				((Matchexpr_listbrazosexpr_listexprContext)_localctx).g = match_listbrazos_listexpr(0);
				setState(797);
				match(OR_MATCH);
				setState(798);
				((Matchexpr_listbrazosexpr_listexprContext)_localctx).expression = expression(0);

				        ((Matchexpr_listbrazosexpr_listexprContext)_localctx).g.l.Add(((Matchexpr_listbrazosexpr_listexprContext)_localctx).expression.p)
				        _localctx.l = ((Matchexpr_listbrazosexpr_listexprContext)_localctx).g.l
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				((Matchexpr_listbrazosexpr_listexprContext)_localctx).expression = expression(0);

				        a := arrayList.New()
				        a.Add(((Matchexpr_listbrazosexpr_listexprContext)_localctx).expression.p)
				        _localctx.l = a
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class El_defaultexprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token DEFAUL;
		public ExpressionContext expression;
		public TerminalNode DEFAUL() { return getToken(Interprete.DEFAUL, 0); }
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public El_defaultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el_defaultexpr; }
	}

	public final El_defaultexprContext el_defaultexpr() throws RecognitionException {
		El_defaultexprContext _localctx = new El_defaultexprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_el_defaultexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			((El_defaultexprContext)_localctx).DEFAUL = match(DEFAUL);
			setState(807);
			match(IGUAL);
			setState(808);
			match(MAYOR);
			setState(809);
			((El_defaultexprContext)_localctx).expression = expression(0);
			setState(810);
			match(COMA);
			 _localctx.p = matchexpr.NewDefault_Expr(((El_defaultexprContext)_localctx).expression.p, (((El_defaultexprContext)_localctx).DEFAUL!=null?((El_defaultexprContext)_localctx).DEFAUL.getLine():0), (((El_defaultexprContext)_localctx).DEFAUL!=null?((El_defaultexprContext)_localctx).DEFAUL.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public interfaces.TipoExpresion te;
		public TerminalNode INT() { return getToken(Interprete.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Interprete.FLOAT, 0); }
		public TerminalNode STR() { return getToken(Interprete.STR, 0); }
		public TerminalNode BOOLEAN() { return getToken(Interprete.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(Interprete.CHAR, 0); }
		public TerminalNode STRING() { return getToken(Interprete.STRING, 0); }
		public TerminalNode USIZE() { return getToken(Interprete.USIZE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipo);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(INT);
				 _localctx.te = 0 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(FLOAT);
				 _localctx.te = 1 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				match(STR);
				 _localctx.te = 2 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				match(BOOLEAN);
				 _localctx.te = 3
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(821);
				match(CHAR);
				 _localctx.te = 7 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				match(STRING);
				 _localctx.te = 8 
				}
				break;
			case USIZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				match(USIZE);
				 _localctx.te = 13 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public ExpressionContext expression;
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(Interprete.ID); }
		public TerminalNode ID(int i) {
			return getToken(Interprete.ID, i);
		}
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public TerminalNode PNT() { return getToken(Interprete.PNT, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asignacion);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				((AsignacionContext)_localctx).ID = match(ID);
				setState(830);
				match(IGUAL);
				setState(831);
				((AsignacionContext)_localctx).expression = expression(0);
				setState(832);
				match(PYC);
				 _localctx.instr = instruction.NewAsignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expression.p, "" ,(((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getLine():0), (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				((AsignacionContext)_localctx).id1 = match(ID);
				setState(836);
				match(PNT);
				setState(837);
				((AsignacionContext)_localctx).id2 = match(ID);
				setState(838);
				match(IGUAL);
				setState(839);
				((AsignacionContext)_localctx).expression = expression(0);
				setState(840);
				match(PYC);
				 _localctx.instr = instruction.NewAsignacion((((AsignacionContext)_localctx).id1!=null?((AsignacionContext)_localctx).id1.getText():null), ((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).id2!=null?((AsignacionContext)_localctx).id2.getText():null) ,(((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getLine():0), (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_if_exprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token IF;
		public ExpressionContext ini;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public Sent_if_exprContext sent;
		public TerminalNode IF() { return getToken(Interprete.IF, 0); }
		public List<TerminalNode> LLAVEA() { return getTokens(Interprete.LLAVEA); }
		public TerminalNode LLAVEA(int i) {
			return getToken(Interprete.LLAVEA, i);
		}
		public List<TerminalNode> LLAVEC() { return getTokens(Interprete.LLAVEC); }
		public TerminalNode LLAVEC(int i) {
			return getToken(Interprete.LLAVEC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Interprete.ELSE, 0); }
		public Sent_if_exprContext sent_if_expr() {
			return getRuleContext(Sent_if_exprContext.class,0);
		}
		public Sent_if_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_if_expr; }
	}

	public final Sent_if_exprContext sent_if_expr() throws RecognitionException {
		Sent_if_exprContext _localctx = new Sent_if_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sent_if_expr);
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				((Sent_if_exprContext)_localctx).IF = match(IF);
				setState(846);
				((Sent_if_exprContext)_localctx).ini = expression(0);
				setState(847);
				match(LLAVEA);
				setState(848);
				((Sent_if_exprContext)_localctx).exp1 = expression(0);
				setState(849);
				match(LLAVEC);
				 
				        var a interfaces.Expresion
				        _localctx.p = sentenciasexpr.NewIf_expr(((Sent_if_exprContext)_localctx).ini.p, ((Sent_if_exprContext)_localctx).exp1.p,a, (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getLine():0), (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getCharPositionInLine():0)   ) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				((Sent_if_exprContext)_localctx).IF = match(IF);
				setState(853);
				((Sent_if_exprContext)_localctx).ini = expression(0);
				setState(854);
				match(LLAVEA);
				setState(855);
				((Sent_if_exprContext)_localctx).exp1 = expression(0);
				setState(856);
				match(LLAVEC);
				setState(857);
				match(ELSE);
				setState(858);
				match(LLAVEA);
				setState(859);
				((Sent_if_exprContext)_localctx).exp2 = expression(0);
				setState(860);
				match(LLAVEC);
				 _localctx.p = sentenciasexpr.NewIf_expr(((Sent_if_exprContext)_localctx).ini.p, ((Sent_if_exprContext)_localctx).exp1.p, ((Sent_if_exprContext)_localctx).exp2.p, (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getLine():0), (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getCharPositionInLine():0) ) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				((Sent_if_exprContext)_localctx).IF = match(IF);
				setState(864);
				((Sent_if_exprContext)_localctx).ini = expression(0);
				setState(865);
				match(LLAVEA);
				setState(866);
				((Sent_if_exprContext)_localctx).exp1 = expression(0);
				setState(867);
				match(LLAVEC);
				setState(868);
				match(ELSE);
				setState(869);
				((Sent_if_exprContext)_localctx).sent = sent_if_expr();
				 _localctx.p = sentenciasexpr.NewIf_expr(((Sent_if_exprContext)_localctx).ini.p, ((Sent_if_exprContext)_localctx).exp1.p,((Sent_if_exprContext)_localctx).sent.p, (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getLine():0), (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getCharPositionInLine():0)   )  
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_loop_exprContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token LOOP;
		public InstruccionesContext instrucciones;
		public TerminalNode LOOP() { return getToken(Interprete.LOOP, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Sent_loop_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_loop_expr; }
	}

	public final Sent_loop_exprContext sent_loop_expr() throws RecognitionException {
		Sent_loop_exprContext _localctx = new Sent_loop_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sent_loop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			((Sent_loop_exprContext)_localctx).LOOP = match(LOOP);
			setState(875);
			match(LLAVEA);
			setState(876);
			((Sent_loop_exprContext)_localctx).instrucciones = instrucciones();
			setState(877);
			match(LLAVEC);
			 _localctx.p = sentenciasexpr.NewLoop_expr(((Sent_loop_exprContext)_localctx).instrucciones.l,(((Sent_loop_exprContext)_localctx).LOOP!=null?((Sent_loop_exprContext)_localctx).LOOP.getLine():0),(((Sent_loop_exprContext)_localctx).LOOP!=null?((Sent_loop_exprContext)_localctx).LOOP.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintasoContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token PRINT;
		public ExpressionContext expression;
		public List_expre_printContext li;
		public TerminalNode PRINT() { return getToken(Interprete.PRINT, 0); }
		public TerminalNode EXCLA() { return getToken(Interprete.EXCLA, 0); }
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public List_expre_printContext list_expre_print() {
			return getRuleContext(List_expre_printContext.class,0);
		}
		public PrintasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printaso; }
	}

	public final PrintasoContext printaso() throws RecognitionException {
		PrintasoContext _localctx = new PrintasoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_printaso);
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				((PrintasoContext)_localctx).PRINT = match(PRINT);
				setState(881);
				match(EXCLA);
				setState(882);
				match(PARA);
				setState(883);
				((PrintasoContext)_localctx).expression = expression(0);
				setState(884);
				match(PARC);
				 
				         a := arrayList.New()
				        _localctx.instr = instruction.NewImprimir(((PrintasoContext)_localctx).expression.p, a, (((PrintasoContext)_localctx).PRINT!=null?((PrintasoContext)_localctx).PRINT.getLine():0), (((PrintasoContext)_localctx).PRINT!=null?((PrintasoContext)_localctx).PRINT.getCharPositionInLine():0)) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				((PrintasoContext)_localctx).PRINT = match(PRINT);
				setState(888);
				match(EXCLA);
				setState(889);
				match(PARA);
				setState(890);
				((PrintasoContext)_localctx).expression = expression(0);
				setState(891);
				match(COMA);
				setState(892);
				((PrintasoContext)_localctx).li = list_expre_print(0);
				setState(893);
				match(PARC);
				  _localctx.instr = instruction.NewImprimir(((PrintasoContext)_localctx).expression.p, ((PrintasoContext)_localctx).li.l, (((PrintasoContext)_localctx).PRINT!=null?((PrintasoContext)_localctx).PRINT.getLine():0), (((PrintasoContext)_localctx).PRINT!=null?((PrintasoContext)_localctx).PRINT.getCharPositionInLine():0))  
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_expre_printContext extends ParserRuleContext {
		public *arrayList.List l;
		public List_expre_printContext li;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public List_expre_printContext list_expre_print() {
			return getRuleContext(List_expre_printContext.class,0);
		}
		public List_expre_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expre_print; }
	}

	public final List_expre_printContext list_expre_print() throws RecognitionException {
		return list_expre_print(0);
	}

	private List_expre_printContext list_expre_print(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_expre_printContext _localctx = new List_expre_printContext(_ctx, _parentState);
		List_expre_printContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_list_expre_print, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(899);
			((List_expre_printContext)_localctx).expression = expression(0);

			        a := arrayList.New()
			        a.Add(((List_expre_printContext)_localctx).expression.p)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_expre_printContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_expre_print);
					setState(902);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(903);
					match(COMA);
					setState(904);
					((List_expre_printContext)_localctx).expression = expression(0);
					 
					                  ((List_expre_printContext)_localctx).li.l.Add(((List_expre_printContext)_localctx).expression.p)  
					                  _localctx.l = ((List_expre_printContext)_localctx).li.l
					                  
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class List_expre_vec_arrContext extends ParserRuleContext {
		public *arrayList.List l;
		public List_expre_vec_arrContext li;
		public Expression_vec_ArrContext expression_vec_Arr;
		public Expression_vec_ArrContext expression_vec_Arr() {
			return getRuleContext(Expression_vec_ArrContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public List_expre_vec_arrContext list_expre_vec_arr() {
			return getRuleContext(List_expre_vec_arrContext.class,0);
		}
		public List_expre_vec_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expre_vec_arr; }
	}

	public final List_expre_vec_arrContext list_expre_vec_arr() throws RecognitionException {
		return list_expre_vec_arr(0);
	}

	private List_expre_vec_arrContext list_expre_vec_arr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_expre_vec_arrContext _localctx = new List_expre_vec_arrContext(_ctx, _parentState);
		List_expre_vec_arrContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_list_expre_vec_arr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913);
			((List_expre_vec_arrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);

			        a := arrayList.New()
			        a.Add(((List_expre_vec_arrContext)_localctx).expression_vec_Arr.p)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_expre_vec_arrContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_expre_vec_arr);
					setState(916);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(917);
					match(COMA);
					setState(918);
					((List_expre_vec_arrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
					 
					                  ((List_expre_vec_arrContext)_localctx).li.l.Add(((List_expre_vec_arrContext)_localctx).expression_vec_Arr.p)  
					                  _localctx.l = ((List_expre_vec_arrContext)_localctx).li.l
					                  
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sent_ifContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token IF;
		public ExpressionContext expression;
		public InstruccionesContext instrucciones;
		public InstruccionesContext ins1;
		public InstruccionesContext ins2;
		public Sent_ifContext sent;
		public TerminalNode IF() { return getToken(Interprete.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LLAVEA() { return getTokens(Interprete.LLAVEA); }
		public TerminalNode LLAVEA(int i) {
			return getToken(Interprete.LLAVEA, i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<TerminalNode> LLAVEC() { return getTokens(Interprete.LLAVEC); }
		public TerminalNode LLAVEC(int i) {
			return getToken(Interprete.LLAVEC, i);
		}
		public TerminalNode ELSE() { return getToken(Interprete.ELSE, 0); }
		public Sent_ifContext sent_if() {
			return getRuleContext(Sent_ifContext.class,0);
		}
		public Sent_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_if; }
	}

	public final Sent_ifContext sent_if() throws RecognitionException {
		Sent_ifContext _localctx = new Sent_ifContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sent_if);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				((Sent_ifContext)_localctx).IF = match(IF);
				setState(927);
				((Sent_ifContext)_localctx).expression = expression(0);
				setState(928);
				match(LLAVEA);
				setState(929);
				((Sent_ifContext)_localctx).instrucciones = instrucciones();
				setState(930);
				match(LLAVEC);
				 _localctx.instr = sentenciacontrol.NewIf(((Sent_ifContext)_localctx).expression.p, ((Sent_ifContext)_localctx).instrucciones.l, arrayList.New(), (((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getLine():0),(((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				((Sent_ifContext)_localctx).IF = match(IF);
				setState(934);
				((Sent_ifContext)_localctx).expression = expression(0);
				setState(935);
				match(LLAVEA);
				setState(936);
				((Sent_ifContext)_localctx).ins1 = instrucciones();
				setState(937);
				match(LLAVEC);
				setState(938);
				match(ELSE);
				setState(939);
				match(LLAVEA);
				setState(940);
				((Sent_ifContext)_localctx).ins2 = instrucciones();
				setState(941);
				match(LLAVEC);
				 _localctx.instr = sentenciacontrol.NewIf(((Sent_ifContext)_localctx).expression.p, ((Sent_ifContext)_localctx).ins1.l, ((Sent_ifContext)_localctx).ins2.l, (((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getLine():0),(((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getCharPositionInLine():0)) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				((Sent_ifContext)_localctx).IF = match(IF);
				setState(945);
				((Sent_ifContext)_localctx).expression = expression(0);
				setState(946);
				match(LLAVEA);
				setState(947);
				((Sent_ifContext)_localctx).ins1 = instrucciones();
				setState(948);
				match(LLAVEC);
				setState(949);
				match(ELSE);
				setState(950);
				((Sent_ifContext)_localctx).sent = sent_if();
				 
				        a := arrayList.New()
				        a.Add(((Sent_ifContext)_localctx).sent.instr)
				        _localctx.instr = sentenciacontrol.NewIf(((Sent_ifContext)_localctx).expression.p, ((Sent_ifContext)_localctx).ins1.l, a , (((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getLine():0),(((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_matchContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token MATCH;
		public ExpressionContext expression;
		public Match_listbrazosContext match_listbrazos;
		public El_defaultContext el_default;
		public TerminalNode MATCH() { return getToken(Interprete.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public Match_listbrazosContext match_listbrazos() {
			return getRuleContext(Match_listbrazosContext.class,0);
		}
		public El_defaultContext el_default() {
			return getRuleContext(El_defaultContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Sent_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_match; }
	}

	public final Sent_matchContext sent_match() throws RecognitionException {
		Sent_matchContext _localctx = new Sent_matchContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sent_match);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				((Sent_matchContext)_localctx).MATCH = match(MATCH);
				setState(956);
				((Sent_matchContext)_localctx).expression = expression(0);
				setState(957);
				match(LLAVEA);
				setState(958);
				((Sent_matchContext)_localctx).match_listbrazos = match_listbrazos(0);
				setState(959);
				((Sent_matchContext)_localctx).el_default = el_default();
				setState(960);
				match(LLAVEC);
				 _localctx.instr = match.NewMatch(((Sent_matchContext)_localctx).expression.p, ((Sent_matchContext)_localctx).match_listbrazos.l, ((Sent_matchContext)_localctx).el_default.instr, (((Sent_matchContext)_localctx).MATCH!=null?((Sent_matchContext)_localctx).MATCH.getLine():0), (((Sent_matchContext)_localctx).MATCH!=null?((Sent_matchContext)_localctx).MATCH.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				((Sent_matchContext)_localctx).MATCH = match(MATCH);
				setState(964);
				((Sent_matchContext)_localctx).expression = expression(0);
				setState(965);
				match(LLAVEA);
				setState(966);
				((Sent_matchContext)_localctx).el_default = el_default();
				setState(967);
				match(LLAVEC);
				_localctx.instr = match.NewMatch(((Sent_matchContext)_localctx).expression.p, arrayList.New(), ((Sent_matchContext)_localctx).el_default.instr, (((Sent_matchContext)_localctx).MATCH!=null?((Sent_matchContext)_localctx).MATCH.getLine():0), (((Sent_matchContext)_localctx).MATCH!=null?((Sent_matchContext)_localctx).MATCH.getCharPositionInLine():0))
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_listbrazosContext extends ParserRuleContext {
		public *arrayList.List l;
		public Match_listbrazosContext braz;
		public List_brazosContext list_brazos;
		public List_brazosContext list_brazos() {
			return getRuleContext(List_brazosContext.class,0);
		}
		public Match_listbrazosContext match_listbrazos() {
			return getRuleContext(Match_listbrazosContext.class,0);
		}
		public Match_listbrazosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_listbrazos; }
	}

	public final Match_listbrazosContext match_listbrazos() throws RecognitionException {
		return match_listbrazos(0);
	}

	private Match_listbrazosContext match_listbrazos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Match_listbrazosContext _localctx = new Match_listbrazosContext(_ctx, _parentState);
		Match_listbrazosContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_match_listbrazos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(973);
			((Match_listbrazosContext)_localctx).list_brazos = list_brazos();

			        a := arrayList.New()
			        a.Add(((Match_listbrazosContext)_localctx).list_brazos.instr)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Match_listbrazosContext(_parentctx, _parentState);
					_localctx.braz = _prevctx;
					_localctx.braz = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_match_listbrazos);
					setState(976);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(977);
					((Match_listbrazosContext)_localctx).list_brazos = list_brazos();
					 
					              ((Match_listbrazosContext)_localctx).braz.l.Add(((Match_listbrazosContext)_localctx).list_brazos.instr)
					               _localctx.l = ((Match_listbrazosContext)_localctx).braz.l
					               
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class List_brazosContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public ExpressionContext expression;
		public Token IGUAL;
		public InstruccionesContext instrucciones;
		public Match_listbrazos_listexprContext exprs;
		public InstruccionContext instruccion;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Match_listbrazos_listexprContext match_listbrazos_listexpr() {
			return getRuleContext(Match_listbrazos_listexprContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public List_brazosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_brazos; }
	}

	public final List_brazosContext list_brazos() throws RecognitionException {
		List_brazosContext _localctx = new List_brazosContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list_brazos);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				((List_brazosContext)_localctx).expression = expression(0);
				setState(986);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(987);
				match(MAYOR);
				setState(988);
				match(LLAVEA);
				setState(989);
				((List_brazosContext)_localctx).instrucciones = instrucciones();
				setState(990);
				match(LLAVEC);
				 
				        a := arrayList.New()
				        a.Add(((List_brazosContext)_localctx).expression.p)
				        _localctx.instr = match.NewBrazo(a, ((List_brazosContext)_localctx).instrucciones.l, (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getLine():0), (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getCharPositionInLine():0)) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				((List_brazosContext)_localctx).exprs = match_listbrazos_listexpr(0);
				setState(994);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(995);
				match(MAYOR);
				setState(996);
				match(LLAVEA);
				setState(997);
				((List_brazosContext)_localctx).instrucciones = instrucciones();
				setState(998);
				match(LLAVEC);
				 _localctx.instr = match.NewBrazo(((List_brazosContext)_localctx).exprs.l, ((List_brazosContext)_localctx).instrucciones.l, (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getLine():0), (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getCharPositionInLine():0))  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				((List_brazosContext)_localctx).expression = expression(0);
				setState(1002);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(1003);
				match(MAYOR);
				setState(1004);
				((List_brazosContext)_localctx).instruccion = instruccion();
				setState(1005);
				match(COMA);

				        a := arrayList.New()
				        a.Add(((List_brazosContext)_localctx).expression.p)
				        b := arrayList.New()
				        b.Add(((List_brazosContext)_localctx).instruccion.instr)
				        _localctx.instr = match.NewBrazo(a, b, (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getLine():0), (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getCharPositionInLine():0)) 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				((List_brazosContext)_localctx).exprs = match_listbrazos_listexpr(0);
				setState(1009);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(1010);
				match(MAYOR);
				setState(1011);
				((List_brazosContext)_localctx).instruccion = instruccion();
				setState(1012);
				match(COMA);

				        b := arrayList.New()
				        b.Add(((List_brazosContext)_localctx).instruccion.instr)
				        _localctx.instr = match.NewBrazo(((List_brazosContext)_localctx).exprs.l, b, (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getLine():0), (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getCharPositionInLine():0))
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_listbrazos_listexprContext extends ParserRuleContext {
		public *arrayList.List l;
		public Match_listbrazos_listexprContext h;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR_MATCH() { return getToken(Interprete.OR_MATCH, 0); }
		public Match_listbrazos_listexprContext match_listbrazos_listexpr() {
			return getRuleContext(Match_listbrazos_listexprContext.class,0);
		}
		public Match_listbrazos_listexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_listbrazos_listexpr; }
	}

	public final Match_listbrazos_listexprContext match_listbrazos_listexpr() throws RecognitionException {
		return match_listbrazos_listexpr(0);
	}

	private Match_listbrazos_listexprContext match_listbrazos_listexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Match_listbrazos_listexprContext _localctx = new Match_listbrazos_listexprContext(_ctx, _parentState);
		Match_listbrazos_listexprContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_match_listbrazos_listexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1018);
			((Match_listbrazos_listexprContext)_localctx).expression = expression(0);

			        a := arrayList.New()
			        a.Add(((Match_listbrazos_listexprContext)_localctx).expression.p)
			        _localctx.l = a
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(1028);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Match_listbrazos_listexprContext(_parentctx, _parentState);
					_localctx.h = _prevctx;
					_localctx.h = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_match_listbrazos_listexpr);
					setState(1021);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1022);
					match(OR_MATCH);
					setState(1023);
					((Match_listbrazos_listexprContext)_localctx).expression = expression(0);
					 
					                  ((Match_listbrazos_listexprContext)_localctx).h.l.Add(((Match_listbrazos_listexprContext)_localctx).expression.p)
					                  _localctx.l = ((Match_listbrazos_listexprContext)_localctx).h.l
					               
					}
					} 
				}
				setState(1030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class El_defaultContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token DEFAUL;
		public InstruccionesContext instrucciones;
		public InstruccionContext instruccion;
		public TerminalNode DEFAUL() { return getToken(Interprete.DEFAUL, 0); }
		public TerminalNode IGUAL() { return getToken(Interprete.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public El_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el_default; }
	}

	public final El_defaultContext el_default() throws RecognitionException {
		El_defaultContext _localctx = new El_defaultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_el_default);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031);
				((El_defaultContext)_localctx).DEFAUL = match(DEFAUL);
				setState(1032);
				match(IGUAL);
				setState(1033);
				match(MAYOR);
				setState(1034);
				match(LLAVEA);
				setState(1035);
				((El_defaultContext)_localctx).instrucciones = instrucciones();
				setState(1036);
				match(LLAVEC);
				 _localctx.instr = match.NewDefault(((El_defaultContext)_localctx).instrucciones.l , (((El_defaultContext)_localctx).DEFAUL!=null?((El_defaultContext)_localctx).DEFAUL.getLine():0), (((El_defaultContext)_localctx).DEFAUL!=null?((El_defaultContext)_localctx).DEFAUL.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				((El_defaultContext)_localctx).DEFAUL = match(DEFAUL);
				setState(1040);
				match(IGUAL);
				setState(1041);
				match(MAYOR);
				setState(1042);
				((El_defaultContext)_localctx).instruccion = instruccion();
				setState(1043);
				match(COMA);
				 
				        a := arrayList.New()
				        a.Add(((El_defaultContext)_localctx).instruccion.instr)
				        _localctx.instr = match.NewDefault(a , (((El_defaultContext)_localctx).DEFAUL!=null?((El_defaultContext)_localctx).DEFAUL.getLine():0), (((El_defaultContext)_localctx).DEFAUL!=null?((El_defaultContext)_localctx).DEFAUL.getCharPositionInLine():0))  
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_loopContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token LOOP;
		public InstruccionesContext instrucciones;
		public TerminalNode LOOP() { return getToken(Interprete.LOOP, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Sent_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_loop; }
	}

	public final Sent_loopContext sent_loop() throws RecognitionException {
		Sent_loopContext _localctx = new Sent_loopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sent_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			((Sent_loopContext)_localctx).LOOP = match(LOOP);
			setState(1049);
			match(LLAVEA);
			setState(1050);
			((Sent_loopContext)_localctx).instrucciones = instrucciones();
			setState(1051);
			match(LLAVEC);
			 _localctx.instr = sentenciaciclica.NewLoop(((Sent_loopContext)_localctx).instrucciones.l,(((Sent_loopContext)_localctx).LOOP!=null?((Sent_loopContext)_localctx).LOOP.getLine():0),(((Sent_loopContext)_localctx).LOOP!=null?((Sent_loopContext)_localctx).LOOP.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_whileContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token WHILE;
		public ExpressionContext expression;
		public InstruccionesContext instrucciones;
		public TerminalNode WHILE() { return getToken(Interprete.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Sent_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_while; }
	}

	public final Sent_whileContext sent_while() throws RecognitionException {
		Sent_whileContext _localctx = new Sent_whileContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sent_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			((Sent_whileContext)_localctx).WHILE = match(WHILE);
			setState(1055);
			((Sent_whileContext)_localctx).expression = expression(0);
			setState(1056);
			match(LLAVEA);
			setState(1057);
			((Sent_whileContext)_localctx).instrucciones = instrucciones();
			setState(1058);
			match(LLAVEC);
			 _localctx.instr = sentenciaciclica.NewWhile(((Sent_whileContext)_localctx).expression.p , ((Sent_whileContext)_localctx).instrucciones.l , (((Sent_whileContext)_localctx).WHILE!=null?((Sent_whileContext)_localctx).WHILE.getLine():0), (((Sent_whileContext)_localctx).WHILE!=null?((Sent_whileContext)_localctx).WHILE.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent_ForInContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public Token IN;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public InstruccionesContext instrucciones;
		public Expression_vec_ArrContext exp;
		public TerminalNode FOR() { return getToken(Interprete.FOR, 0); }
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode IN() { return getToken(Interprete.IN, 0); }
		public List<TerminalNode> PNT() { return getTokens(Interprete.PNT); }
		public TerminalNode PNT(int i) {
			return getToken(Interprete.PNT, i);
		}
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_vec_ArrContext expression_vec_Arr() {
			return getRuleContext(Expression_vec_ArrContext.class,0);
		}
		public Sent_ForInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_ForIn; }
	}

	public final Sent_ForInContext sent_ForIn() throws RecognitionException {
		Sent_ForInContext _localctx = new Sent_ForInContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sent_ForIn);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(FOR);
				setState(1062);
				((Sent_ForInContext)_localctx).ID = match(ID);
				setState(1063);
				((Sent_ForInContext)_localctx).IN = match(IN);
				setState(1064);
				((Sent_ForInContext)_localctx).exp1 = expression(0);
				setState(1065);
				match(PNT);
				setState(1066);
				match(PNT);
				setState(1067);
				((Sent_ForInContext)_localctx).exp2 = expression(0);
				setState(1068);
				match(LLAVEA);
				setState(1069);
				((Sent_ForInContext)_localctx).instrucciones = instrucciones();
				setState(1070);
				match(LLAVEC);

				        var a interfaces.Expresion
				        _localctx.instr = sentenciaciclica.NewForIn( (((Sent_ForInContext)_localctx).ID!=null?((Sent_ForInContext)_localctx).ID.getText():null), ((Sent_ForInContext)_localctx).exp1.p, ((Sent_ForInContext)_localctx).exp2.p,a, ((Sent_ForInContext)_localctx).instrucciones.l, (((Sent_ForInContext)_localctx).IN!=null?((Sent_ForInContext)_localctx).IN.getLine():0), (((Sent_ForInContext)_localctx).IN!=null?((Sent_ForInContext)_localctx).IN.getCharPositionInLine():0) )
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(FOR);
				setState(1074);
				((Sent_ForInContext)_localctx).ID = match(ID);
				setState(1075);
				((Sent_ForInContext)_localctx).IN = match(IN);
				setState(1076);
				((Sent_ForInContext)_localctx).exp = expression_vec_Arr(0);
				setState(1077);
				match(LLAVEA);
				setState(1078);
				((Sent_ForInContext)_localctx).instrucciones = instrucciones();
				setState(1079);
				match(LLAVEC);

				        var a,b interfaces.Expresion
				        _localctx.instr = sentenciaciclica.NewForIn( (((Sent_ForInContext)_localctx).ID!=null?((Sent_ForInContext)_localctx).ID.getText():null), a,b, ((Sent_ForInContext)_localctx).exp.p , ((Sent_ForInContext)_localctx).instrucciones.l, (((Sent_ForInContext)_localctx).IN!=null?((Sent_ForInContext)_localctx).IN.getLine():0), (((Sent_ForInContext)_localctx).IN!=null?((Sent_ForInContext)_localctx).IN.getCharPositionInLine():0) )
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_vec_ArrContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expression_vec_ArrContext opIz;
		public Token INT;
		public Token op;
		public Expression_vec_ArrContext expression_vec_Arr;
		public Expression_vec_ArrContext opDe;
		public Token FLOAT;
		public Expression_vec_ArrContext operador;
		public Token CORCHA;
		public List_expre_vec_arrContext list_expre_vec_arr;
		public Expression_vec_ArrContext exp1;
		public Expression_vec_ArrContext exp2;
		public ExpressionContext exp4;
		public Token TOCHARS;
		public Vector_exprContext vector_expr;
		public PrimitivoContext primitivo;
		public Token ope;
		public TerminalNode INT() { return getToken(Interprete.INT, 0); }
		public List<TerminalNode> DPTS() { return getTokens(Interprete.DPTS); }
		public TerminalNode DPTS(int i) {
			return getToken(Interprete.DPTS, i);
		}
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode POW() { return getToken(Interprete.POW, 0); }
		public List<Expression_vec_ArrContext> expression_vec_Arr() {
			return getRuleContexts(Expression_vec_ArrContext.class);
		}
		public Expression_vec_ArrContext expression_vec_Arr(int i) {
			return getRuleContext(Expression_vec_ArrContext.class,i);
		}
		public TerminalNode FLOAT() { return getToken(Interprete.FLOAT, 0); }
		public TerminalNode POWF() { return getToken(Interprete.POWF, 0); }
		public TerminalNode EXCLA() { return getToken(Interprete.EXCLA, 0); }
		public TerminalNode CORCHA() { return getToken(Interprete.CORCHA, 0); }
		public List_expre_vec_arrContext list_expre_vec_arr() {
			return getRuleContext(List_expre_vec_arrContext.class,0);
		}
		public TerminalNode CORCHC() { return getToken(Interprete.CORCHC, 0); }
		public TerminalNode PYC() { return getToken(Interprete.PYC, 0); }
		public TerminalNode PNT() { return getToken(Interprete.PNT, 0); }
		public TerminalNode TOCHARS() { return getToken(Interprete.TOCHARS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Vector_exprContext vector_expr() {
			return getRuleContext(Vector_exprContext.class,0);
		}
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode MODUL() { return getToken(Interprete.MODUL, 0); }
		public TerminalNode MUL() { return getToken(Interprete.MUL, 0); }
		public TerminalNode DIV() { return getToken(Interprete.DIV, 0); }
		public TerminalNode SUM() { return getToken(Interprete.SUM, 0); }
		public TerminalNode REST() { return getToken(Interprete.REST, 0); }
		public TerminalNode MENOR() { return getToken(Interprete.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Interprete.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Interprete.MAYORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public TerminalNode IGUALACION() { return getToken(Interprete.IGUALACION, 0); }
		public TerminalNode DIFERENCIACION() { return getToken(Interprete.DIFERENCIACION, 0); }
		public TerminalNode AND() { return getToken(Interprete.AND, 0); }
		public TerminalNode OR() { return getToken(Interprete.OR, 0); }
		public Expression_vec_ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_vec_Arr; }
	}

	public final Expression_vec_ArrContext expression_vec_Arr() throws RecognitionException {
		return expression_vec_Arr(0);
	}

	private Expression_vec_ArrContext expression_vec_Arr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_vec_ArrContext _localctx = new Expression_vec_ArrContext(_ctx, _parentState);
		Expression_vec_ArrContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression_vec_Arr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(1085);
				((Expression_vec_ArrContext)_localctx).INT = match(INT);
				setState(1086);
				match(DPTS);
				setState(1087);
				match(DPTS);
				setState(1088);
				((Expression_vec_ArrContext)_localctx).op = match(POW);
				setState(1089);
				match(PARA);
				setState(1090);
				((Expression_vec_ArrContext)_localctx).opIz = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1091);
				match(COMA);
				setState(1092);
				((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1093);
				match(PARC);
				_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).INT!=null?((Expression_vec_ArrContext)_localctx).INT.getLine():0),(((Expression_vec_ArrContext)_localctx).INT!=null?((Expression_vec_ArrContext)_localctx).INT.getCharPositionInLine():0))
				}
				break;
			case 2:
				{
				setState(1096);
				((Expression_vec_ArrContext)_localctx).FLOAT = match(FLOAT);
				setState(1097);
				match(DPTS);
				setState(1098);
				match(DPTS);
				setState(1099);
				((Expression_vec_ArrContext)_localctx).op = match(POWF);
				setState(1100);
				match(PARA);
				setState(1101);
				((Expression_vec_ArrContext)_localctx).opIz = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1102);
				match(COMA);
				setState(1103);
				((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1104);
				match(PARC);
				_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).FLOAT!=null?((Expression_vec_ArrContext)_localctx).FLOAT.getLine():0),(((Expression_vec_ArrContext)_localctx).FLOAT!=null?((Expression_vec_ArrContext)_localctx).FLOAT.getCharPositionInLine():0))
				}
				break;
			case 3:
				{
				setState(1107);
				match(PARA);
				setState(1108);
				((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1109);
				match(PARC);
				 _localctx.p = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr.p
				}
				break;
			case 4:
				{
				setState(1112);
				((Expression_vec_ArrContext)_localctx).op = match(EXCLA);
				setState(1113);
				((Expression_vec_ArrContext)_localctx).operador = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(6);
				_localctx.p = Operacion.NewOperacion_Logica(((Expression_vec_ArrContext)_localctx).operador.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),nil,true,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getLine():0),(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getCharPositionInLine():0))
				}
				break;
			case 5:
				{
				setState(1116);
				((Expression_vec_ArrContext)_localctx).CORCHA = match(CORCHA);
				setState(1117);
				((Expression_vec_ArrContext)_localctx).list_expre_vec_arr = list_expre_vec_arr(0);
				setState(1118);
				match(CORCHC);
				 
				        var a interfaces.Expresion
				        var b interfaces.Expresion
				        _localctx.p = arrays.NewArray( ((Expression_vec_ArrContext)_localctx).list_expre_vec_arr.l, a , b , (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getLine():0), (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getCharPositionInLine():0)  ) 
				        
				}
				break;
			case 6:
				{
				setState(1121);
				((Expression_vec_ArrContext)_localctx).CORCHA = match(CORCHA);
				setState(1122);
				((Expression_vec_ArrContext)_localctx).exp1 = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1123);
				match(PYC);
				setState(1124);
				((Expression_vec_ArrContext)_localctx).exp2 = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1125);
				match(CORCHC);
				 _localctx.p = arrays.NewArray( arrayList.New(), ((Expression_vec_ArrContext)_localctx).exp1.p, ((Expression_vec_ArrContext)_localctx).exp2.p , (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getLine():0), (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getCharPositionInLine():0)) 
				}
				break;
			case 7:
				{
				setState(1128);
				((Expression_vec_ArrContext)_localctx).exp4 = expression(0);
				setState(1129);
				match(PNT);
				setState(1130);
				((Expression_vec_ArrContext)_localctx).TOCHARS = match(TOCHARS);
				setState(1131);
				match(PARA);
				setState(1132);
				match(PARC);
				 _localctx.p = funcionesnativas.NewToChar(((Expression_vec_ArrContext)_localctx).exp4.p, (((Expression_vec_ArrContext)_localctx).TOCHARS!=null?((Expression_vec_ArrContext)_localctx).TOCHARS.getLine():0), (((Expression_vec_ArrContext)_localctx).TOCHARS!=null?((Expression_vec_ArrContext)_localctx).TOCHARS.getCharPositionInLine():0)) 
				}
				break;
			case 8:
				{
				setState(1135);
				((Expression_vec_ArrContext)_localctx).vector_expr = vector_expr();
				 _localctx.p = ((Expression_vec_ArrContext)_localctx).vector_expr.p 
				}
				break;
			case 9:
				{
				setState(1138);
				((Expression_vec_ArrContext)_localctx).primitivo = primitivo();
				 _localctx.p = ((Expression_vec_ArrContext)_localctx).primitivo.p 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_vec_ArrContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression_vec_Arr);
						setState(1143);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1144);
						((Expression_vec_ArrContext)_localctx).op = match(MODUL);
						setState(1145);
						((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(13);
						_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getLine():0),(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getCharPositionInLine():0))
						}
						break;
					case 2:
						{
						_localctx = new Expression_vec_ArrContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression_vec_Arr);
						setState(1148);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1149);
						((Expression_vec_ArrContext)_localctx).ope = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((Expression_vec_ArrContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1150);
						((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(12);
						_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getLine():0),(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 3:
						{
						_localctx = new Expression_vec_ArrContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression_vec_Arr);
						setState(1153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1154);
						((Expression_vec_ArrContext)_localctx).ope = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==REST) ) {
							((Expression_vec_ArrContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1155);
						((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(11);
						_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getLine():0),(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 4:
						{
						_localctx = new Expression_vec_ArrContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression_vec_Arr);
						setState(1158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1159);
						((Expression_vec_ArrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFERENCIACION) | (1L << IGUALACION) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
							((Expression_vec_ArrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1160);
						((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(10);
						_localctx.p = Operacion.NewOperacion_Relacional(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getLine():0),(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getCharPositionInLine():0))
						}
						break;
					case 5:
						{
						_localctx = new Expression_vec_ArrContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression_vec_Arr);
						setState(1163);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1164);
						((Expression_vec_ArrContext)_localctx).ope = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((Expression_vec_ArrContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1165);
						((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(8);
						_localctx.p = Operacion.NewOperacion_Logica(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getLine():0),(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Atributos_struct_expContext extends ParserRuleContext {
		public *arrayList.List l;
		public Atributos_struct_expContext li;
		public Atributos_struct_decl_expContext atributos_struct_decl_exp;
		public Atributos_struct_decl_expContext asd;
		public Atributos_struct_decl_expContext atributos_struct_decl_exp() {
			return getRuleContext(Atributos_struct_decl_expContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public Atributos_struct_expContext atributos_struct_exp() {
			return getRuleContext(Atributos_struct_expContext.class,0);
		}
		public Atributos_struct_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_struct_exp; }
	}

	public final Atributos_struct_expContext atributos_struct_exp() throws RecognitionException {
		return atributos_struct_exp(0);
	}

	private Atributos_struct_expContext atributos_struct_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Atributos_struct_expContext _localctx = new Atributos_struct_expContext(_ctx, _parentState);
		Atributos_struct_expContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_atributos_struct_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1174);
			((Atributos_struct_expContext)_localctx).atributos_struct_decl_exp = atributos_struct_decl_exp();

			        a := arrayList.New()
			        a.Add(((Atributos_struct_expContext)_localctx).atributos_struct_decl_exp.s)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(1184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Atributos_struct_expContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_atributos_struct_exp);
					setState(1177);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1178);
					match(COMA);
					setState(1179);
					((Atributos_struct_expContext)_localctx).asd = ((Atributos_struct_expContext)_localctx).atributos_struct_decl_exp = atributos_struct_decl_exp();

					                  ((Atributos_struct_expContext)_localctx).li.l.Add(((Atributos_struct_expContext)_localctx).asd.s)
					                  _localctx.l = ((Atributos_struct_expContext)_localctx).li.l
					              
					}
					} 
				}
				setState(1186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Atributos_struct_decl_expContext extends ParserRuleContext {
		public interfaces.Symbol s;
		public Token ID;
		public ExpressionContext exp2;
		public Expression_vec_ArrContext exp;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode DPTS() { return getToken(Interprete.DPTS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_vec_ArrContext expression_vec_Arr() {
			return getRuleContext(Expression_vec_ArrContext.class,0);
		}
		public Atributos_struct_decl_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_struct_decl_exp; }
	}

	public final Atributos_struct_decl_expContext atributos_struct_decl_exp() throws RecognitionException {
		Atributos_struct_decl_expContext _localctx = new Atributos_struct_decl_expContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atributos_struct_decl_exp);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				((Atributos_struct_decl_expContext)_localctx).ID = match(ID);
				setState(1188);
				match(DPTS);
				setState(1189);
				((Atributos_struct_decl_expContext)_localctx).exp2 = expression(0);
				_localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_decl_expContext)_localctx).ID!=null?((Atributos_struct_decl_expContext)_localctx).ID.getText():null), Valor: ((Atributos_struct_decl_expContext)_localctx).exp2.p } 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				((Atributos_struct_decl_expContext)_localctx).ID = match(ID);
				setState(1193);
				match(DPTS);
				setState(1194);
				((Atributos_struct_decl_expContext)_localctx).exp = expression_vec_Arr(0);
				_localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_decl_expContext)_localctx).ID!=null?((Atributos_struct_decl_expContext)_localctx).ID.getText():null),  Valor:((Atributos_struct_decl_expContext)_localctx).exp.p }
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ExpressionContext exp8;
		public ExpressionContext opIz;
		public ExpressionContext exp4;
		public ExpressionContext exp5;
		public ExpressionContext exp6;
		public ExpressionContext exp7;
		public ExpressionContext exp9;
		public Token INT;
		public Token op;
		public ExpressionContext expression;
		public ExpressionContext opDe;
		public Token FLOAT;
		public Token ope;
		public ExpressionContext operador;
		public Token ID;
		public Token REMOVE;
		public Token LLAVEA;
		public Atributos_struct_expContext li;
		public Llamadas_structsContext llamadas_structs;
		public Llamada_expreContext llamada_expre;
		public PrimitivoContext primitivo;
		public Token LEN;
		public Token CONTAINS;
		public Token TOCHARS;
		public Token TOSTRING;
		public Token TOOWNED;
		public Token CASTEO;
		public TipoContext tipo;
		public Token ABOSLU;
		public Token CLONATION;
		public TerminalNode INT() { return getToken(Interprete.INT, 0); }
		public List<TerminalNode> DPTS() { return getTokens(Interprete.DPTS); }
		public TerminalNode DPTS(int i) {
			return getToken(Interprete.DPTS, i);
		}
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public TerminalNode COMA() { return getToken(Interprete.COMA, 0); }
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public TerminalNode POW() { return getToken(Interprete.POW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FLOAT() { return getToken(Interprete.FLOAT, 0); }
		public TerminalNode POWF() { return getToken(Interprete.POWF, 0); }
		public TerminalNode REST() { return getToken(Interprete.REST, 0); }
		public TerminalNode EXCLA() { return getToken(Interprete.EXCLA, 0); }
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode PNT() { return getToken(Interprete.PNT, 0); }
		public TerminalNode REMOVE() { return getToken(Interprete.REMOVE, 0); }
		public TerminalNode LLAVEA() { return getToken(Interprete.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(Interprete.LLAVEC, 0); }
		public Atributos_struct_expContext atributos_struct_exp() {
			return getRuleContext(Atributos_struct_expContext.class,0);
		}
		public Llamadas_structsContext llamadas_structs() {
			return getRuleContext(Llamadas_structsContext.class,0);
		}
		public Llamada_expreContext llamada_expre() {
			return getRuleContext(Llamada_expreContext.class,0);
		}
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode MODUL() { return getToken(Interprete.MODUL, 0); }
		public TerminalNode MUL() { return getToken(Interprete.MUL, 0); }
		public TerminalNode DIV() { return getToken(Interprete.DIV, 0); }
		public TerminalNode SUM() { return getToken(Interprete.SUM, 0); }
		public TerminalNode MENOR() { return getToken(Interprete.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Interprete.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Interprete.MAYORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Interprete.MAYOR, 0); }
		public TerminalNode IGUALACION() { return getToken(Interprete.IGUALACION, 0); }
		public TerminalNode DIFERENCIACION() { return getToken(Interprete.DIFERENCIACION, 0); }
		public TerminalNode AND() { return getToken(Interprete.AND, 0); }
		public TerminalNode OR() { return getToken(Interprete.OR, 0); }
		public TerminalNode LEN() { return getToken(Interprete.LEN, 0); }
		public TerminalNode CONTAINS() { return getToken(Interprete.CONTAINS, 0); }
		public TerminalNode PUNTERO() { return getToken(Interprete.PUNTERO, 0); }
		public TerminalNode TOCHARS() { return getToken(Interprete.TOCHARS, 0); }
		public TerminalNode TOSTRING() { return getToken(Interprete.TOSTRING, 0); }
		public TerminalNode TOOWNED() { return getToken(Interprete.TOOWNED, 0); }
		public TerminalNode CASTEO() { return getToken(Interprete.CASTEO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ABOSLU() { return getToken(Interprete.ABOSLU, 0); }
		public TerminalNode RAIZITA() { return getToken(Interprete.RAIZITA, 0); }
		public TerminalNode CLONATION() { return getToken(Interprete.CLONATION, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(1200);
				((ExpressionContext)_localctx).INT = match(INT);
				setState(1201);
				match(DPTS);
				setState(1202);
				match(DPTS);
				setState(1203);
				((ExpressionContext)_localctx).op = match(POW);
				setState(1204);
				match(PARA);
				setState(1205);
				((ExpressionContext)_localctx).opIz = ((ExpressionContext)_localctx).expression = expression(0);
				setState(1206);
				match(COMA);
				setState(1207);
				((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(0);
				setState(1208);
				match(PARC);
				_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getLine():0),(((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getCharPositionInLine():0))
				}
				break;
			case 2:
				{
				setState(1211);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				setState(1212);
				match(DPTS);
				setState(1213);
				match(DPTS);
				setState(1214);
				((ExpressionContext)_localctx).op = match(POWF);
				setState(1215);
				match(PARA);
				setState(1216);
				((ExpressionContext)_localctx).opIz = ((ExpressionContext)_localctx).expression = expression(0);
				setState(1217);
				match(COMA);
				setState(1218);
				((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(0);
				setState(1219);
				match(PARC);
				_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getLine():0),(((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getCharPositionInLine():0))
				}
				break;
			case 3:
				{
				setState(1222);
				((ExpressionContext)_localctx).ope = match(REST);
				setState(1223);
				((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(19);
				_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opDe.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),nil,true,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
				}
				break;
			case 4:
				{
				setState(1226);
				match(PARA);
				setState(1227);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(1228);
				match(PARC);
				 _localctx.p = ((ExpressionContext)_localctx).expression.p
				}
				break;
			case 5:
				{
				setState(1231);
				match(PARA);
				setState(1232);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(1233);
				match(PARC);
				 _localctx.p = ((ExpressionContext)_localctx).expression.p
				}
				break;
			case 6:
				{
				setState(1236);
				((ExpressionContext)_localctx).op = match(EXCLA);
				setState(1237);
				((ExpressionContext)_localctx).operador = ((ExpressionContext)_localctx).expression = expression(14);
				_localctx.p = Operacion.NewOperacion_Logica(((ExpressionContext)_localctx).operador.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),nil,true,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0),(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getCharPositionInLine():0))
				}
				break;
			case 7:
				{
				setState(1240);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(1241);
				match(PNT);
				setState(1242);
				((ExpressionContext)_localctx).REMOVE = match(REMOVE);
				setState(1243);
				match(PARA);
				setState(1244);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(1245);
				match(PARC);
				 _localctx.p = funcionesvectores.NewRemove_exp((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expression.p, (((ExpressionContext)_localctx).REMOVE!=null?((ExpressionContext)_localctx).REMOVE.getLine():0), (((ExpressionContext)_localctx).REMOVE!=null?((ExpressionContext)_localctx).REMOVE.getCharPositionInLine():0)) 
				}
				break;
			case 8:
				{
				setState(1248);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(1249);
				((ExpressionContext)_localctx).LLAVEA = match(LLAVEA);
				setState(1250);
				((ExpressionContext)_localctx).li = atributos_struct_exp(0);
				setState(1251);
				match(LLAVEC);
				 _localctx.p = structs.NewStruct( (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).li.l, (((ExpressionContext)_localctx).LLAVEA!=null?((ExpressionContext)_localctx).LLAVEA.getLine():0), (((ExpressionContext)_localctx).LLAVEA!=null?((ExpressionContext)_localctx).LLAVEA.getCharPositionInLine():0) ) 
				}
				break;
			case 9:
				{
				setState(1254);
				((ExpressionContext)_localctx).llamadas_structs = llamadas_structs(0);
				 _localctx.p =  ((ExpressionContext)_localctx).llamadas_structs.p 
				}
				break;
			case 10:
				{
				setState(1257);
				((ExpressionContext)_localctx).llamada_expre = llamada_expre();
				 _localctx.p = ((ExpressionContext)_localctx).llamada_expre.p 
				}
				break;
			case 11:
				{
				setState(1260);
				((ExpressionContext)_localctx).primitivo = primitivo();
				 _localctx.p = ((ExpressionContext)_localctx).primitivo.p 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1265);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1266);
						((ExpressionContext)_localctx).op = match(MODUL);
						setState(1267);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(23);
						_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0),(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getCharPositionInLine():0))
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1270);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1271);
						((ExpressionContext)_localctx).ope = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExpressionContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1272);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(22);
						_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1275);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1276);
						((ExpressionContext)_localctx).ope = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==REST) ) {
							((ExpressionContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1277);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(21);
						_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1280);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1281);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFERENCIACION) | (1L << IGUALACION) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1282);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(18);
						_localctx.p = Operacion.NewOperacion_Relacional(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0),(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getCharPositionInLine():0))
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1285);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1286);
						((ExpressionContext)_localctx).ope = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).ope = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1287);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(16);
						_localctx.p = Operacion.NewOperacion_Logica(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp8 = _prevctx;
						_localctx.exp8 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1290);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1291);
						match(PNT);
						setState(1292);
						((ExpressionContext)_localctx).LEN = match(LEN);
						setState(1293);
						match(PARA);
						setState(1294);
						match(PARC);
						 _localctx.p = funcionesvectores.NewLen(((ExpressionContext)_localctx).exp8.p, (((ExpressionContext)_localctx).LEN!=null?((ExpressionContext)_localctx).LEN.getLine():0), (((ExpressionContext)_localctx).LEN!=null?((ExpressionContext)_localctx).LEN.getCharPositionInLine():0)) 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp8 = _prevctx;
						_localctx.exp8 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1296);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1297);
						match(PNT);
						setState(1298);
						((ExpressionContext)_localctx).CONTAINS = match(CONTAINS);
						setState(1299);
						match(PARA);
						setState(1300);
						match(PUNTERO);
						setState(1301);
						((ExpressionContext)_localctx).expression = expression(0);
						setState(1302);
						match(PARC);
						 _localctx.p = funcionesvectores.NewContains(((ExpressionContext)_localctx).exp8.p, ((ExpressionContext)_localctx).expression.p, (((ExpressionContext)_localctx).CONTAINS!=null?((ExpressionContext)_localctx).CONTAINS.getLine():0), (((ExpressionContext)_localctx).CONTAINS!=null?((ExpressionContext)_localctx).CONTAINS.getCharPositionInLine():0) ) 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp4 = _prevctx;
						_localctx.exp4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1305);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1306);
						match(PNT);
						setState(1307);
						((ExpressionContext)_localctx).TOCHARS = match(TOCHARS);
						setState(1308);
						match(PARA);
						setState(1309);
						match(PARC);
						 _localctx.p = funcionesnativas.NewToChar(((ExpressionContext)_localctx).exp4.p, (((ExpressionContext)_localctx).TOCHARS!=null?((ExpressionContext)_localctx).TOCHARS.getLine():0), (((ExpressionContext)_localctx).TOCHARS!=null?((ExpressionContext)_localctx).TOCHARS.getCharPositionInLine():0)) 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp4 = _prevctx;
						_localctx.exp4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1311);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1312);
						match(PNT);
						setState(1313);
						((ExpressionContext)_localctx).TOSTRING = match(TOSTRING);
						setState(1314);
						match(PARA);
						setState(1315);
						match(PARC);
						 _localctx.p = funcionesnativas.NewToString(((ExpressionContext)_localctx).exp4.p, (((ExpressionContext)_localctx).TOSTRING!=null?((ExpressionContext)_localctx).TOSTRING.getLine():0), (((ExpressionContext)_localctx).TOSTRING!=null?((ExpressionContext)_localctx).TOSTRING.getCharPositionInLine():0)) 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp4 = _prevctx;
						_localctx.exp4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1317);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1318);
						match(PNT);
						setState(1319);
						((ExpressionContext)_localctx).TOOWNED = match(TOOWNED);
						setState(1320);
						match(PARA);
						setState(1321);
						match(PARC);
						 _localctx.p = funcionesnativas.NewToString(((ExpressionContext)_localctx).exp4.p, (((ExpressionContext)_localctx).TOOWNED!=null?((ExpressionContext)_localctx).TOOWNED.getLine():0), (((ExpressionContext)_localctx).TOOWNED!=null?((ExpressionContext)_localctx).TOOWNED.getCharPositionInLine():0)) 
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp5 = _prevctx;
						_localctx.exp5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1323);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1324);
						((ExpressionContext)_localctx).CASTEO = match(CASTEO);
						setState(1325);
						((ExpressionContext)_localctx).tipo = tipo();
						 _localctx.p = casteos.NewCasteo(((ExpressionContext)_localctx).exp5.p, ((ExpressionContext)_localctx).tipo.te, (((ExpressionContext)_localctx).CASTEO!=null?((ExpressionContext)_localctx).CASTEO.getLine():0) , (((ExpressionContext)_localctx).CASTEO!=null?((ExpressionContext)_localctx).CASTEO.getCharPositionInLine():0) ) 
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp6 = _prevctx;
						_localctx.exp6 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1329);
						match(PNT);
						setState(1330);
						((ExpressionContext)_localctx).ABOSLU = match(ABOSLU);
						setState(1331);
						match(PARA);
						setState(1332);
						match(PARC);
						 _localctx.p = funcionesnativas.NewAbsoluto(((ExpressionContext)_localctx).exp6.p, (((ExpressionContext)_localctx).ABOSLU!=null?((ExpressionContext)_localctx).ABOSLU.getLine():0), (((ExpressionContext)_localctx).ABOSLU!=null?((ExpressionContext)_localctx).ABOSLU.getCharPositionInLine():0)) 
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp7 = _prevctx;
						_localctx.exp7 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1334);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1335);
						match(PNT);
						setState(1336);
						match(RAIZITA);
						setState(1337);
						match(PARA);
						setState(1338);
						match(PARC);
						 _localctx.p = funcionesnativas.NewRaizCuadrada(((ExpressionContext)_localctx).exp7.p, (((ExpressionContext)_localctx).ABOSLU!=null?((ExpressionContext)_localctx).ABOSLU.getLine():0), (((ExpressionContext)_localctx).ABOSLU!=null?((ExpressionContext)_localctx).ABOSLU.getCharPositionInLine():0)) 
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp9 = _prevctx;
						_localctx.exp9 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1340);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1341);
						match(PNT);
						setState(1342);
						((ExpressionContext)_localctx).CLONATION = match(CLONATION);
						setState(1343);
						match(PARA);
						setState(1344);
						match(PARC);
						 _localctx.p = funcionesnativas.NewClone(((ExpressionContext)_localctx).exp9.p, (((ExpressionContext)_localctx).CLONATION!=null?((ExpressionContext)_localctx).CLONATION.getLine():0), (((ExpressionContext)_localctx).CLONATION!=null?((ExpressionContext)_localctx).CLONATION.getCharPositionInLine():0)) 
						}
						break;
					}
					} 
				}
				setState(1350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Llamada_expreContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token ID;
		public Token PARA;
		public Params_llamadaContext li;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode PARA() { return getToken(Interprete.PARA, 0); }
		public TerminalNode PARC() { return getToken(Interprete.PARC, 0); }
		public Params_llamadaContext params_llamada() {
			return getRuleContext(Params_llamadaContext.class,0);
		}
		public Llamada_expreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_expre; }
	}

	public final Llamada_expreContext llamada_expre() throws RecognitionException {
		Llamada_expreContext _localctx = new Llamada_expreContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_llamada_expre);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				((Llamada_expreContext)_localctx).ID = match(ID);
				setState(1352);
				((Llamada_expreContext)_localctx).PARA = match(PARA);
				setState(1353);
				match(PARC);
				 _localctx.p = instruction.NewLlamada((((Llamada_expreContext)_localctx).ID!=null?((Llamada_expreContext)_localctx).ID.getText():null), arrayList.New(), (((Llamada_expreContext)_localctx).PARA!=null?((Llamada_expreContext)_localctx).PARA.getLine():0), (((Llamada_expreContext)_localctx).PARA!=null?((Llamada_expreContext)_localctx).PARA.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				((Llamada_expreContext)_localctx).ID = match(ID);
				setState(1356);
				((Llamada_expreContext)_localctx).PARA = match(PARA);
				setState(1357);
				((Llamada_expreContext)_localctx).li = params_llamada(0);
				setState(1358);
				match(PARC);
				 _localctx.p = instruction.NewLlamada((((Llamada_expreContext)_localctx).ID!=null?((Llamada_expreContext)_localctx).ID.getText():null), ((Llamada_expreContext)_localctx).li.l, (((Llamada_expreContext)_localctx).PARA!=null?((Llamada_expreContext)_localctx).PARA.getLine():0), (((Llamada_expreContext)_localctx).PARA!=null?((Llamada_expreContext)_localctx).PARA.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitivoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token NUMBER;
		public Token FLOAT_NUM;
		public Token op;
		public Token CADENA;
		public Token CHAR_2;
		public List_arrayContext list_array;
		public TerminalNode NUMBER() { return getToken(Interprete.NUMBER, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(Interprete.FLOAT_NUM, 0); }
		public TerminalNode TRUE() { return getToken(Interprete.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Interprete.FALSE, 0); }
		public TerminalNode CADENA() { return getToken(Interprete.CADENA, 0); }
		public TerminalNode CHAR_2() { return getToken(Interprete.CHAR_2, 0); }
		public List_arrayContext list_array() {
			return getRuleContext(List_arrayContext.class,0);
		}
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primitivo);
		int _la;
		try {
			setState(1376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);
				 
				            num, err:= strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				            if err !=nil{ 
				                fmt.Println(err)
				            }   
				            _localctx.p = expresion.NewPrimitivo (num, interfaces.INTEGER)
				     
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				((PrimitivoContext)_localctx).FLOAT_NUM = match(FLOAT_NUM);

				        num, err:= strconv.ParseFloat((((PrimitivoContext)_localctx).FLOAT_NUM!=null?((PrimitivoContext)_localctx).FLOAT_NUM.getText():null), 64)
				        if err != nil{
				            fmt.Println(err)
				        }
				        _localctx.p = expresion.NewPrimitivo(num, interfaces.FLOAT)
				    
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1367);
				((PrimitivoContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((PrimitivoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        num, err:= strconv.ParseBool((((PrimitivoContext)_localctx).op!=null?((PrimitivoContext)_localctx).op.getText():null))
				        if err != nil{
				            fmt.Println(err)
				        }
				        _localctx.p = expresion.NewPrimitivo(num, interfaces.BOOLEAN)
				    
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 4);
				{
				setState(1369);
				((PrimitivoContext)_localctx).CADENA = match(CADENA);
				 
				        str:= (((PrimitivoContext)_localctx).CADENA!=null?((PrimitivoContext)_localctx).CADENA.getText():null)[1:len((((PrimitivoContext)_localctx).CADENA!=null?((PrimitivoContext)_localctx).CADENA.getText():null))-1]
				        _localctx.p = expresion.NewPrimitivo(str, interfaces.STR)
				     
				}
				break;
			case CHAR_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(1371);
				((PrimitivoContext)_localctx).CHAR_2 = match(CHAR_2);

				        str:= (((PrimitivoContext)_localctx).CHAR_2!=null?((PrimitivoContext)_localctx).CHAR_2.getText():null)[1:len((((PrimitivoContext)_localctx).CHAR_2!=null?((PrimitivoContext)_localctx).CHAR_2.getText():null))-1]
				        _localctx.p = expresion.NewPrimitivo(str, interfaces.CHAR)
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(1373);
				((PrimitivoContext)_localctx).list_array = list_array(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list_array.p 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_arrayContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public List_arrayContext li;
		public Token ID;
		public Token CORCHA;
		public ExpressionContext expression;
		public Token CORCHC;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode CORCHA() { return getToken(Interprete.CORCHA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORCHC() { return getToken(Interprete.CORCHC, 0); }
		public List_arrayContext list_array() {
			return getRuleContext(List_arrayContext.class,0);
		}
		public List_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_array; }
	}

	public final List_arrayContext list_array() throws RecognitionException {
		return list_array(0);
	}

	private List_arrayContext list_array(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_arrayContext _localctx = new List_arrayContext(_ctx, _parentState);
		List_arrayContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_list_array, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1379);
			((List_arrayContext)_localctx).ID = match(ID);
			  _localctx.p = expresion.NewCallVariable((((List_arrayContext)_localctx).ID!=null?((List_arrayContext)_localctx).ID.getText():null),(((List_arrayContext)_localctx).ID!=null?((List_arrayContext)_localctx).ID.getLine():0),(((List_arrayContext)_localctx).ID!=null?((List_arrayContext)_localctx).ID.getCharPositionInLine():0)) 
			}
			_ctx.stop = _input.LT(-1);
			setState(1390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_arrayContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_array);
					setState(1382);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1383);
					((List_arrayContext)_localctx).CORCHA = match(CORCHA);
					setState(1384);
					((List_arrayContext)_localctx).expression = expression(0);
					setState(1385);
					((List_arrayContext)_localctx).CORCHC = match(CORCHC);
					 _localctx.p = arrays.NewArrayAccess(((List_arrayContext)_localctx).li.p, ((List_arrayContext)_localctx).expression.p, (((List_arrayContext)_localctx).CORCHA!=null?((List_arrayContext)_localctx).CORCHA.getLine():0), (((List_arrayContext)_localctx).CORCHC!=null?((List_arrayContext)_localctx).CORCHC.getCharPositionInLine():0)) 
					}
					} 
				}
				setState(1392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Llamadas_structsContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Llamadas_structsContext li;
		public Token ID;
		public Token PNT;
		public Token id2;
		public TerminalNode ID() { return getToken(Interprete.ID, 0); }
		public TerminalNode PNT() { return getToken(Interprete.PNT, 0); }
		public Llamadas_structsContext llamadas_structs() {
			return getRuleContext(Llamadas_structsContext.class,0);
		}
		public Llamadas_structsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadas_structs; }
	}

	public final Llamadas_structsContext llamadas_structs() throws RecognitionException {
		return llamadas_structs(0);
	}

	private Llamadas_structsContext llamadas_structs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Llamadas_structsContext _localctx = new Llamadas_structsContext(_ctx, _parentState);
		Llamadas_structsContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_llamadas_structs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1394);
			((Llamadas_structsContext)_localctx).ID = match(ID);
			  _localctx.p = expresion.NewCallVariable((((Llamadas_structsContext)_localctx).ID!=null?((Llamadas_structsContext)_localctx).ID.getText():null),(((Llamadas_structsContext)_localctx).ID!=null?((Llamadas_structsContext)_localctx).ID.getLine():0),(((Llamadas_structsContext)_localctx).ID!=null?((Llamadas_structsContext)_localctx).ID.getCharPositionInLine():0)) 
			}
			_ctx.stop = _input.LT(-1);
			setState(1403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Llamadas_structsContext(_parentctx, _parentState);
					_localctx.li = _prevctx;
					_localctx.li = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_llamadas_structs);
					setState(1397);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1398);
					((Llamadas_structsContext)_localctx).PNT = match(PNT);
					setState(1399);
					((Llamadas_structsContext)_localctx).id2 = match(ID);
					 _localctx.p = structs.NewStruct_Acces( ((Llamadas_structsContext)_localctx).li.p, (((Llamadas_structsContext)_localctx).id2!=null?((Llamadas_structsContext)_localctx).id2.getText():null), (((Llamadas_structsContext)_localctx).PNT!=null?((Llamadas_structsContext)_localctx).PNT.getLine():0), (((Llamadas_structsContext)_localctx).PNT!=null?((Llamadas_structsContext)_localctx).PNT.getCharPositionInLine():0) ) 
					}
					} 
				}
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return intructions_modulos_sempred((Intructions_modulosContext)_localctx, predIndex);
		case 7:
			return atributos_struct_sempred((Atributos_structContext)_localctx, predIndex);
		case 10:
			return params_funcion_sempred((Params_funcionContext)_localctx, predIndex);
		case 13:
			return params_llamada_sempred((Params_llamadaContext)_localctx, predIndex);
		case 23:
			return matchexpr_listbrazos_sempred((Matchexpr_listbrazosContext)_localctx, predIndex);
		case 32:
			return list_expre_print_sempred((List_expre_printContext)_localctx, predIndex);
		case 33:
			return list_expre_vec_arr_sempred((List_expre_vec_arrContext)_localctx, predIndex);
		case 36:
			return match_listbrazos_sempred((Match_listbrazosContext)_localctx, predIndex);
		case 38:
			return match_listbrazos_listexpr_sempred((Match_listbrazos_listexprContext)_localctx, predIndex);
		case 43:
			return expression_vec_Arr_sempred((Expression_vec_ArrContext)_localctx, predIndex);
		case 44:
			return atributos_struct_exp_sempred((Atributos_struct_expContext)_localctx, predIndex);
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 49:
			return list_array_sempred((List_arrayContext)_localctx, predIndex);
		case 50:
			return llamadas_structs_sempred((Llamadas_structsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intructions_modulos_sempred(Intructions_modulosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean atributos_struct_sempred(Atributos_structContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean params_funcion_sempred(Params_funcionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean params_llamada_sempred(Params_llamadaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean matchexpr_listbrazos_sempred(Matchexpr_listbrazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_expre_print_sempred(List_expre_printContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_expre_vec_arr_sempred(List_expre_vec_arrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_listbrazos_sempred(Match_listbrazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_listbrazos_listexpr_sempred(Match_listbrazos_listexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_vec_Arr_sempred(Expression_vec_ArrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean atributos_struct_exp_sempred(Atributos_struct_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		case 18:
			return precpred(_ctx, 20);
		case 19:
			return precpred(_ctx, 17);
		case 20:
			return precpred(_ctx, 15);
		case 21:
			return precpred(_ctx, 23);
		case 22:
			return precpred(_ctx, 12);
		case 23:
			return precpred(_ctx, 11);
		case 24:
			return precpred(_ctx, 10);
		case 25:
			return precpred(_ctx, 9);
		case 26:
			return precpred(_ctx, 8);
		case 27:
			return precpred(_ctx, 7);
		case 28:
			return precpred(_ctx, 6);
		case 29:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean list_array_sempred(List_arrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean llamadas_structs_sempred(Llamadas_structsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0581\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a8\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b9\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c3\n\6\f\6\16\6\u00c6\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d9"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00eb\n\t\f\t\16\t\u00ee\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0103\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0182\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u018d\n\f\f\f\16\f\u0190\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u01b7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u01c5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u01d0\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u01de\n\17\f\17\16\17\u01e1\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u01fb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0223\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0247"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0257\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u029a\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02bd\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02dc\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02e8\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0300\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u030a\n\31\f\31\16\31\u030d\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u031d"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0327\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u033e\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u034e\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u036b\n\37\3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0383"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u038e\n\"\f\"\16\"\u0391\13"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u039c\n#\f#\16#\u039f\13#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u03bc\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03cd\n"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\7&\u03d7\n&\f&\16&\u03da\13&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03fa\n\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\7(\u0405\n(\f(\16(\u0408\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u0419\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u043d\n,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0478\n-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0493\n-\f-\16-\u0496"+
		"\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u04a1\n.\f.\16.\u04a4\13.\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\5/\u04b0\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u04f2\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u0545\n\60\f\60\16\60\u0548\13\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u0554\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0563\n\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u056f\n\63\f\63\16\63\u0572\13\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u057c\n\64\f\64\16\64\u057f"+
		"\13\64\3\64\2\20\n\20\26\34\60BDJNXZ^df\65\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\7\4\2\26"+
		"\26\30\30\4\2\27\27\31\31\3\2\35\"\3\2$%\3\2&\'\2\u05dd\2h\3\2\2\2\4n"+
		"\3\2\2\2\6\u00a7\3\2\2\2\b\u00b8\3\2\2\2\n\u00ba\3\2\2\2\f\u00d8\3\2\2"+
		"\2\16\u00da\3\2\2\2\20\u00e1\3\2\2\2\22\u0102\3\2\2\2\24\u0181\3\2\2\2"+
		"\26\u0183\3\2\2\2\30\u01b6\3\2\2\2\32\u01c4\3\2\2\2\34\u01cf\3\2\2\2\36"+
		"\u01fa\3\2\2\2 \u0222\3\2\2\2\"\u0246\3\2\2\2$\u0256\3\2\2\2&\u0299\3"+
		"\2\2\2(\u02bc\3\2\2\2*\u02db\3\2\2\2,\u02e7\3\2\2\2.\u02ff\3\2\2\2\60"+
		"\u0301\3\2\2\2\62\u031c\3\2\2\2\64\u0326\3\2\2\2\66\u0328\3\2\2\28\u033d"+
		"\3\2\2\2:\u034d\3\2\2\2<\u036a\3\2\2\2>\u036c\3\2\2\2@\u0382\3\2\2\2B"+
		"\u0384\3\2\2\2D\u0392\3\2\2\2F\u03bb\3\2\2\2H\u03cc\3\2\2\2J\u03ce\3\2"+
		"\2\2L\u03f9\3\2\2\2N\u03fb\3\2\2\2P\u0418\3\2\2\2R\u041a\3\2\2\2T\u0420"+
		"\3\2\2\2V\u043c\3\2\2\2X\u0477\3\2\2\2Z\u0497\3\2\2\2\\\u04af\3\2\2\2"+
		"^\u04f1\3\2\2\2`\u0553\3\2\2\2b\u0562\3\2\2\2d\u0564\3\2\2\2f\u0573\3"+
		"\2\2\2hi\5\4\3\2ij\b\2\1\2j\3\3\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\b\3\1\2r\5\3\2\2\2st\5@!\2tu"+
		"\7\17\2\2uv\b\4\1\2v\u00a8\3\2\2\2wx\5@!\2xy\b\4\1\2y\u00a8\3\2\2\2z{"+
		"\5 \21\2{|\b\4\1\2|\u00a8\3\2\2\2}~\5&\24\2~\177\b\4\1\2\177\u00a8\3\2"+
		"\2\2\u0080\u0081\5\"\22\2\u0081\u0082\b\4\1\2\u0082\u00a8\3\2\2\2\u0083"+
		"\u0084\5:\36\2\u0084\u0085\b\4\1\2\u0085\u00a8\3\2\2\2\u0086\u0087\5F"+
		"$\2\u0087\u0088\b\4\1\2\u0088\u00a8\3\2\2\2\u0089\u008a\5R*\2\u008a\u008b"+
		"\b\4\1\2\u008b\u00a8\3\2\2\2\u008c\u008d\5T+\2\u008d\u008e\b\4\1\2\u008e"+
		"\u00a8\3\2\2\2\u008f\u0090\5H%\2\u0090\u0091\b\4\1\2\u0091\u00a8\3\2\2"+
		"\2\u0092\u0093\5*\26\2\u0093\u0094\b\4\1\2\u0094\u00a8\3\2\2\2\u0095\u0096"+
		"\5V,\2\u0096\u0097\b\4\1\2\u0097\u00a8\3\2\2\2\u0098\u0099\5\36\20\2\u0099"+
		"\u009a\b\4\1\2\u009a\u00a8\3\2\2\2\u009b\u009c\5\24\13\2\u009c\u009d\b"+
		"\4\1\2\u009d\u00a8\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\b\4\1\2\u00a0"+
		"\u00a8\3\2\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\b\4\1\2\u00a3\u00a8\3"+
		"\2\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\b\4\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"s\3\2\2\2\u00a7w\3\2\2\2\u00a7z\3\2\2\2\u00a7}\3\2\2\2\u00a7\u0080\3\2"+
		"\2\2\u00a7\u0083\3\2\2\2\u00a7\u0086\3\2\2\2\u00a7\u0089\3\2\2\2\u00a7"+
		"\u008c\3\2\2\2\u00a7\u008f\3\2\2\2\u00a7\u0092\3\2\2\2\u00a7\u0095\3\2"+
		"\2\2\u00a7\u0098\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7"+
		"\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\7\3\2\2\2\u00a9\u00aa\7M\2\2"+
		"\u00aa\u00ab\7N\2\2\u00ab\u00ac\7O\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae"+
		"\5\n\6\2\u00ae\u00af\7\f\2\2\u00af\u00b0\b\5\1\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b2\7N\2\2\u00b2\u00b3\7O\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5\n"+
		"\6\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\b\5\1\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00a9\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b9\t\3\2\2\2\u00ba\u00bb\b\6\1\2"+
		"\u00bb\u00bc\5\f\7\2\u00bc\u00bd\b\6\1\2\u00bd\u00c4\3\2\2\2\u00be\u00bf"+
		"\f\4\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\b\6\1\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\13\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5\b\5\2\u00c8\u00c9"+
		"\b\7\1\2\u00c9\u00d9\3\2\2\2\u00ca\u00cb\7M\2\2\u00cb\u00cc\5\24\13\2"+
		"\u00cc\u00cd\b\7\1\2\u00cd\u00d9\3\2\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0"+
		"\b\7\1\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\7M\2\2\u00d2\u00d3\5\16\b\2\u00d3"+
		"\u00d4\b\7\1\2\u00d4\u00d9\3\2\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\b"+
		"\7\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00c7\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8"+
		"\u00ce\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\r\3\2\2\2"+
		"\u00da\u00db\7:\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de"+
		"\5\20\t\2\u00de\u00df\7\f\2\2\u00df\u00e0\b\b\1\2\u00e0\17\3\2\2\2\u00e1"+
		"\u00e2\b\t\1\2\u00e2\u00e3\5\22\n\2\u00e3\u00e4\b\t\1\2\u00e4\u00ec\3"+
		"\2\2\2\u00e5\u00e6\f\4\2\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\5\22\n\2\u00e8"+
		"\u00e9\b\t\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\21\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f0\7O\2\2\u00f0\u00f1\7\20\2\2\u00f1\u00f2\5$\23\2\u00f2"+
		"\u00f3\b\n\1\2\u00f3\u0103\3\2\2\2\u00f4\u00f5\7O\2\2\u00f5\u00f6\7\20"+
		"\2\2\u00f6\u00f7\5&\24\2\u00f7\u00f8\b\n\1\2\u00f8\u0103\3\2\2\2\u00f9"+
		"\u00fa\7O\2\2\u00fa\u00fb\7\20\2\2\u00fb\u00fc\58\35\2\u00fc\u00fd\b\n"+
		"\1\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\7O\2\2\u00ff\u0100\7\20\2\2\u0100"+
		"\u0101\7O\2\2\u0101\u0103\b\n\1\2\u0102\u00ef\3\2\2\2\u0102\u00f4\3\2"+
		"\2\2\u0102\u00f9\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\23\3\2\2\2\u0104\u0105"+
		"\7K\2\2\u0105\u0106\7O\2\2\u0106\u0107\7\t\2\2\u0107\u0108\7\n\2\2\u0108"+
		"\u0109\7\13\2\2\u0109\u010a\5\4\3\2\u010a\u010b\7\f\2\2\u010b\u010c\b"+
		"\13\1\2\u010c\u0182\3\2\2\2\u010d\u010e\7K\2\2\u010e\u010f\7O\2\2\u010f"+
		"\u0110\7\t\2\2\u0110\u0111\5\26\f\2\u0111\u0112\7\n\2\2\u0112\u0113\7"+
		"\13\2\2\u0113\u0114\5\4\3\2\u0114\u0115\7\f\2\2\u0115\u0116\b\13\1\2\u0116"+
		"\u0182\3\2\2\2\u0117\u0118\7K\2\2\u0118\u0119\7O\2\2\u0119\u011a\7\t\2"+
		"\2\u011a\u011b\7\n\2\2\u011b\u011c\7\31\2\2\u011c\u011d\7!\2\2\u011d\u011e"+
		"\58\35\2\u011e\u011f\7\13\2\2\u011f\u0120\5\4\3\2\u0120\u0121\7\f\2\2"+
		"\u0121\u0122\b\13\1\2\u0122\u0182\3\2\2\2\u0123\u0124\7K\2\2\u0124\u0125"+
		"\7O\2\2\u0125\u0126\7\t\2\2\u0126\u0127\5\26\f\2\u0127\u0128\7\n\2\2\u0128"+
		"\u0129\7\31\2\2\u0129\u012a\7!\2\2\u012a\u012b\58\35\2\u012b\u012c\7\13"+
		"\2\2\u012c\u012d\5\4\3\2\u012d\u012e\7\f\2\2\u012e\u012f\b\13\1\2\u012f"+
		"\u0182\3\2\2\2\u0130\u0131\7K\2\2\u0131\u0132\7O\2\2\u0132\u0133\7\t\2"+
		"\2\u0133\u0134\7\n\2\2\u0134\u0135\7\31\2\2\u0135\u0136\7!\2\2\u0136\u0137"+
		"\7O\2\2\u0137\u0138\7\13\2\2\u0138\u0139\5\4\3\2\u0139\u013a\7\f\2\2\u013a"+
		"\u013b\b\13\1\2\u013b\u0182\3\2\2\2\u013c\u013d\7K\2\2\u013d\u013e\7O"+
		"\2\2\u013e\u013f\7\t\2\2\u013f\u0140\5\26\f\2\u0140\u0141\7\n\2\2\u0141"+
		"\u0142\7\31\2\2\u0142\u0143\7!\2\2\u0143\u0144\7O\2\2\u0144\u0145\7\13"+
		"\2\2\u0145\u0146\5\4\3\2\u0146\u0147\7\f\2\2\u0147\u0148\b\13\1\2\u0148"+
		"\u0182\3\2\2\2\u0149\u014a\7K\2\2\u014a\u014b\7O\2\2\u014b\u014c\7\t\2"+
		"\2\u014c\u014d\7\n\2\2\u014d\u014e\7\31\2\2\u014e\u014f\7!\2\2\u014f\u0150"+
		"\5$\23\2\u0150\u0151\7\13\2\2\u0151\u0152\5\4\3\2\u0152\u0153\7\f\2\2"+
		"\u0153\u0154\b\13\1\2\u0154\u0182\3\2\2\2\u0155\u0156\7K\2\2\u0156\u0157"+
		"\7O\2\2\u0157\u0158\7\t\2\2\u0158\u0159\5\26\f\2\u0159\u015a\7\n\2\2\u015a"+
		"\u015b\7\31\2\2\u015b\u015c\7!\2\2\u015c\u015d\5$\23\2\u015d\u015e\7\13"+
		"\2\2\u015e\u015f\5\4\3\2\u015f\u0160\7\f\2\2\u0160\u0161\b\13\1\2\u0161"+
		"\u0182\3\2\2\2\u0162\u0163\7K\2\2\u0163\u0164\7O\2\2\u0164\u0165\7\t\2"+
		"\2\u0165\u0166\7\n\2\2\u0166\u0167\7\31\2\2\u0167\u0168\7!\2\2\u0168\u0169"+
		"\7;\2\2\u0169\u016a\7\"\2\2\u016a\u016b\58\35\2\u016b\u016c\7!\2\2\u016c"+
		"\u016d\7\13\2\2\u016d\u016e\5\4\3\2\u016e\u016f\7\f\2\2\u016f\u0170\b"+
		"\13\1\2\u0170\u0182\3\2\2\2\u0171\u0172\7K\2\2\u0172\u0173\7O\2\2\u0173"+
		"\u0174\7\t\2\2\u0174\u0175\5\26\f\2\u0175\u0176\7\n\2\2\u0176\u0177\7"+
		"\31\2\2\u0177\u0178\7!\2\2\u0178\u0179\7;\2\2\u0179\u017a\7\"\2\2\u017a"+
		"\u017b\58\35\2\u017b\u017c\7!\2\2\u017c\u017d\7\13\2\2\u017d\u017e\5\4"+
		"\3\2\u017e\u017f\7\f\2\2\u017f\u0180\b\13\1\2\u0180\u0182\3\2\2\2\u0181"+
		"\u0104\3\2\2\2\u0181\u010d\3\2\2\2\u0181\u0117\3\2\2\2\u0181\u0123\3\2"+
		"\2\2\u0181\u0130\3\2\2\2\u0181\u013c\3\2\2\2\u0181\u0149\3\2\2\2\u0181"+
		"\u0155\3\2\2\2\u0181\u0162\3\2\2\2\u0181\u0171\3\2\2\2\u0182\25\3\2\2"+
		"\2\u0183\u0184\b\f\1\2\u0184\u0185\5\30\r\2\u0185\u0186\b\f\1\2\u0186"+
		"\u018e\3\2\2\2\u0187\u0188\f\4\2\2\u0188\u0189\7\21\2\2\u0189\u018a\5"+
		"\30\r\2\u018a\u018b\b\f\1\2\u018b\u018d\3\2\2\2\u018c\u0187\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\27\3\2\2"+
		"\2\u0190\u018e\3\2\2\2\u0191\u0192\7O\2\2\u0192\u0193\7\20\2\2\u0193\u0194"+
		"\7\25\2\2\u0194\u0195\7\61\2\2\u0195\u0196\5$\23\2\u0196\u0197\b\r\1\2"+
		"\u0197\u01b7\3\2\2\2\u0198\u0199\7O\2\2\u0199\u019a\7\20\2\2\u019a\u019b"+
		"\7\25\2\2\u019b\u019c\5$\23\2\u019c\u019d\b\r\1\2\u019d\u01b7\3\2\2\2"+
		"\u019e\u019f\7O\2\2\u019f\u01a0\7\20\2\2\u01a0\u01a1\7\25\2\2\u01a1\u01a2"+
		"\7\61\2\2\u01a2\u01a3\5(\25\2\u01a3\u01a4\b\r\1\2\u01a4\u01b7\3\2\2\2"+
		"\u01a5\u01a6\7O\2\2\u01a6\u01a7\7\20\2\2\u01a7\u01a8\7\25\2\2\u01a8\u01a9"+
		"\5(\25\2\u01a9\u01aa\b\r\1\2\u01aa\u01b7\3\2\2\2\u01ab\u01ac\7O\2\2\u01ac"+
		"\u01ad\7\20\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01af\58\35\2\u01af\u01b0\b"+
		"\r\1\2\u01b0\u01b7\3\2\2\2\u01b1\u01b2\7O\2\2\u01b2\u01b3\7\20\2\2\u01b3"+
		"\u01b4\58\35\2\u01b4\u01b5\b\r\1\2\u01b5\u01b7\3\2\2\2\u01b6\u0191\3\2"+
		"\2\2\u01b6\u0198\3\2\2\2\u01b6\u019e\3\2\2\2\u01b6\u01a5\3\2\2\2\u01b6"+
		"\u01ab\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b7\31\3\2\2\2\u01b8\u01b9\7O\2\2"+
		"\u01b9\u01ba\7\t\2\2\u01ba\u01bb\7\n\2\2\u01bb\u01bc\7\17\2\2\u01bc\u01c5"+
		"\b\16\1\2\u01bd\u01be\7O\2\2\u01be\u01bf\7\t\2\2\u01bf\u01c0\5\34\17\2"+
		"\u01c0\u01c1\7\n\2\2\u01c1\u01c2\7\17\2\2\u01c2\u01c3\b\16\1\2\u01c3\u01c5"+
		"\3\2\2\2\u01c4\u01b8\3\2\2\2\u01c4\u01bd\3\2\2\2\u01c5\33\3\2\2\2\u01c6"+
		"\u01c7\b\17\1\2\u01c7\u01c8\5^\60\2\u01c8\u01c9\b\17\1\2\u01c9\u01d0\3"+
		"\2\2\2\u01ca\u01cb\7\25\2\2\u01cb\u01cc\7\61\2\2\u01cc\u01cd\5^\60\2\u01cd"+
		"\u01ce\b\17\1\2\u01ce\u01d0\3\2\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01ca\3"+
		"\2\2\2\u01d0\u01df\3\2\2\2\u01d1\u01d2\f\6\2\2\u01d2\u01d3\7\21\2\2\u01d3"+
		"\u01d4\5^\60\2\u01d4\u01d5\b\17\1\2\u01d5\u01de\3\2\2\2\u01d6\u01d7\f"+
		"\5\2\2\u01d7\u01d8\7\21\2\2\u01d8\u01d9\7\25\2\2\u01d9\u01da\7\61\2\2"+
		"\u01da\u01db\5^\60\2\u01db\u01dc\b\17\1\2\u01dc\u01de\3\2\2\2\u01dd\u01d1"+
		"\3\2\2\2\u01dd\u01d6\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\35\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\79\2\2"+
		"\u01e3\u01e4\7\17\2\2\u01e4\u01fb\b\20\1\2\u01e5\u01e6\79\2\2\u01e6\u01e7"+
		"\5^\60\2\u01e7\u01e8\7\17\2\2\u01e8\u01e9\b\20\1\2\u01e9\u01fb\3\2\2\2"+
		"\u01ea\u01eb\7G\2\2\u01eb\u01ec\7\17\2\2\u01ec\u01fb\b\20\1\2\u01ed\u01ee"+
		"\7L\2\2\u01ee\u01ef\7\17\2\2\u01ef\u01fb\b\20\1\2\u01f0\u01f1\7L\2\2\u01f1"+
		"\u01f2\5^\60\2\u01f2\u01f3\7\17\2\2\u01f3\u01f4\b\20\1\2\u01f4\u01fb\3"+
		"\2\2\2\u01f5\u01f6\7L\2\2\u01f6\u01f7\5X-\2\u01f7\u01f8\7\17\2\2\u01f8"+
		"\u01f9\b\20\1\2\u01f9\u01fb\3\2\2\2\u01fa\u01e2\3\2\2\2\u01fa\u01e5\3"+
		"\2\2\2\u01fa\u01ea\3\2\2\2\u01fa\u01ed\3\2\2\2\u01fa\u01f0\3\2\2\2\u01fa"+
		"\u01f5\3\2\2\2\u01fb\37\3\2\2\2\u01fc\u01fd\7\60\2\2\u01fd\u01fe\7\61"+
		"\2\2\u01fe\u01ff\7O\2\2\u01ff\u0200\7\20\2\2\u0200\u0201\58\35\2\u0201"+
		"\u0202\7#\2\2\u0202\u0203\5^\60\2\u0203\u0204\7\17\2\2\u0204\u0205\b\21"+
		"\1\2\u0205\u0223\3\2\2\2\u0206\u0207\7\60\2\2\u0207\u0208\7O\2\2\u0208"+
		"\u0209\7\20\2\2\u0209\u020a\58\35\2\u020a\u020b\7#\2\2\u020b\u020c\5^"+
		"\60\2\u020c\u020d\7\17\2\2\u020d\u020e\b\21\1\2\u020e\u0223\3\2\2\2\u020f"+
		"\u0210\7\60\2\2\u0210\u0211\7\61\2\2\u0211\u0212\7O\2\2\u0212\u0213\7"+
		"\20\2\2\u0213\u0214\58\35\2\u0214\u0215\7#\2\2\u0215\u0216\5,\27\2\u0216"+
		"\u0217\7\17\2\2\u0217\u0218\b\21\1\2\u0218\u0223\3\2\2\2\u0219\u021a\7"+
		"\60\2\2\u021a\u021b\7O\2\2\u021b\u021c\7\20\2\2\u021c\u021d\58\35\2\u021d"+
		"\u021e\7#\2\2\u021e\u021f\5,\27\2\u021f\u0220\7\17\2\2\u0220\u0221\b\21"+
		"\1\2\u0221\u0223\3\2\2\2\u0222\u01fc\3\2\2\2\u0222\u0206\3\2\2\2\u0222"+
		"\u020f\3\2\2\2\u0222\u0219\3\2\2\2\u0223!\3\2\2\2\u0224\u0225\7\60\2\2"+
		"\u0225\u0226\7\61\2\2\u0226\u0227\7O\2\2\u0227\u0228\7\20\2\2\u0228\u0229"+
		"\5$\23\2\u0229\u022a\7#\2\2\u022a\u022b\5X-\2\u022b\u022c\7\17\2\2\u022c"+
		"\u022d\b\22\1\2\u022d\u0247\3\2\2\2\u022e\u022f\7\60\2\2\u022f\u0230\7"+
		"\61\2\2\u0230\u0231\7O\2\2\u0231\u0232\7#\2\2\u0232\u0233\5X-\2\u0233"+
		"\u0234\7\17\2\2\u0234\u0235\b\22\1\2\u0235\u0247\3\2\2\2\u0236\u0237\7"+
		"\60\2\2\u0237\u0238\7O\2\2\u0238\u0239\7\20\2\2\u0239\u023a\5$\23\2\u023a"+
		"\u023b\7#\2\2\u023b\u023c\5X-\2\u023c\u023d\7\17\2\2\u023d\u023e\b\22"+
		"\1\2\u023e\u0247\3\2\2\2\u023f\u0240\7\60\2\2\u0240\u0241\7O\2\2\u0241"+
		"\u0242\7#\2\2\u0242\u0243\5X-\2\u0243\u0244\7\17\2\2\u0244\u0245\b\22"+
		"\1\2\u0245\u0247\3\2\2\2\u0246\u0224\3\2\2\2\u0246\u022e\3\2\2\2\u0246"+
		"\u0236\3\2\2\2\u0246\u023f\3\2\2\2\u0247#\3\2\2\2\u0248\u0249\7\r\2\2"+
		"\u0249\u024a\5$\23\2\u024a\u024b\7\17\2\2\u024b\u024c\5X-\2\u024c\u024d"+
		"\7\16\2\2\u024d\u024e\b\23\1\2\u024e\u0257\3\2\2\2\u024f\u0250\7\r\2\2"+
		"\u0250\u0251\58\35\2\u0251\u0252\7\17\2\2\u0252\u0253\5X-\2\u0253\u0254"+
		"\7\16\2\2\u0254\u0255\b\23\1\2\u0255\u0257\3\2\2\2\u0256\u0248\3\2\2\2"+
		"\u0256\u024f\3\2\2\2\u0257%\3\2\2\2\u0258\u0259\7\60\2\2\u0259\u025a\7"+
		"\61\2\2\u025a\u025b\7O\2\2\u025b\u025c\7\20\2\2\u025c\u025d\7;\2\2\u025d"+
		"\u025e\7\"\2\2\u025e\u025f\58\35\2\u025f\u0260\7!\2\2\u0260\u0261\7#\2"+
		"\2\u0261\u0262\5(\25\2\u0262\u0263\7\17\2\2\u0263\u0264\b\24\1\2\u0264"+
		"\u029a\3\2\2\2\u0265\u0266\7\60\2\2\u0266\u0267\7\61\2\2\u0267\u0268\7"+
		"O\2\2\u0268\u0269\7\20\2\2\u0269\u026a\7;\2\2\u026a\u026b\7\"\2\2\u026b"+
		"\u026c\7O\2\2\u026c\u026d\7!\2\2\u026d\u026e\7#\2\2\u026e\u026f\5(\25"+
		"\2\u026f\u0270\7\17\2\2\u0270\u0271\b\24\1\2\u0271\u029a\3\2\2\2\u0272"+
		"\u0273\7\60\2\2\u0273\u0274\7\61\2\2\u0274\u0275\7O\2\2\u0275\u0276\7"+
		"#\2\2\u0276\u0277\5(\25\2\u0277\u0278\7\17\2\2\u0278\u0279\b\24\1\2\u0279"+
		"\u029a\3\2\2\2\u027a\u027b\7\60\2\2\u027b\u027c\7O\2\2\u027c\u027d\7\20"+
		"\2\2\u027d\u027e\7;\2\2\u027e\u027f\7\"\2\2\u027f\u0280\58\35\2\u0280"+
		"\u0281\7!\2\2\u0281\u0282\7#\2\2\u0282\u0283\5(\25\2\u0283\u0284\7\17"+
		"\2\2\u0284\u0285\b\24\1\2\u0285\u029a\3\2\2\2\u0286\u0287\7\60\2\2\u0287"+
		"\u0288\7O\2\2\u0288\u0289\7#\2\2\u0289\u028a\5(\25\2\u028a\u028b\7\17"+
		"\2\2\u028b\u028c\b\24\1\2\u028c\u029a\3\2\2\2\u028d\u028e\7\60\2\2\u028e"+
		"\u028f\7O\2\2\u028f\u0290\7\20\2\2\u0290\u0291\7;\2\2\u0291\u0292\7\""+
		"\2\2\u0292\u0293\7O\2\2\u0293\u0294\7!\2\2\u0294\u0295\7#\2\2\u0295\u0296"+
		"\5(\25\2\u0296\u0297\7\17\2\2\u0297\u0298\b\24\1\2\u0298\u029a\3\2\2\2"+
		"\u0299\u0258\3\2\2\2\u0299\u0265\3\2\2\2\u0299\u0272\3\2\2\2\u0299\u027a"+
		"\3\2\2\2\u0299\u0286\3\2\2\2\u0299\u028d\3\2\2\2\u029a\'\3\2\2\2\u029b"+
		"\u029c\7;\2\2\u029c\u029d\7\b\2\2\u029d\u029e\7\r\2\2\u029e\u029f\5D#"+
		"\2\u029f\u02a0\7\16\2\2\u02a0\u02a1\b\25\1\2\u02a1\u02bd\3\2\2\2\u02a2"+
		"\u02a3\7;\2\2\u02a3\u02a4\7\b\2\2\u02a4\u02a5\7\r\2\2\u02a5\u02a6\5X-"+
		"\2\u02a6\u02a7\7\17\2\2\u02a7\u02a8\5X-\2\u02a8\u02a9\7\16\2\2\u02a9\u02aa"+
		"\b\25\1\2\u02aa\u02bd\3\2\2\2\u02ab\u02ac\7;\2\2\u02ac\u02ad\7\20\2\2"+
		"\u02ad\u02ae\7\20\2\2\u02ae\u02af\7<\2\2\u02af\u02b0\7\t\2\2\u02b0\u02b1"+
		"\7\n\2\2\u02b1\u02bd\b\25\1\2\u02b2\u02b3\7;\2\2\u02b3\u02b4\7\b\2\2\u02b4"+
		"\u02b5\7\20\2\2\u02b5\u02b6\7\20\2\2\u02b6\u02b7\7=\2\2\u02b7\u02b8\7"+
		"\t\2\2\u02b8\u02b9\5X-\2\u02b9\u02ba\7\n\2\2\u02ba\u02bb\b\25\1\2\u02bb"+
		"\u02bd\3\2\2\2\u02bc\u029b\3\2\2\2\u02bc\u02a2\3\2\2\2\u02bc\u02ab\3\2"+
		"\2\2\u02bc\u02b2\3\2\2\2\u02bd)\3\2\2\2\u02be\u02bf\7O\2\2\u02bf\u02c0"+
		"\7\24\2\2\u02c0\u02c1\7>\2\2\u02c1\u02c2\7\t\2\2\u02c2\u02c3\5^\60\2\u02c3"+
		"\u02c4\7\n\2\2\u02c4\u02c5\7\17\2\2\u02c5\u02c6\b\26\1\2\u02c6\u02dc\3"+
		"\2\2\2\u02c7\u02c8\7O\2\2\u02c8\u02c9\7\24\2\2\u02c9\u02ca\7?\2\2\u02ca"+
		"\u02cb\7\t\2\2\u02cb\u02cc\5^\60\2\u02cc\u02cd\7\21\2\2\u02cd\u02ce\5"+
		"^\60\2\u02ce\u02cf\7\n\2\2\u02cf\u02d0\7\17\2\2\u02d0\u02d1\b\26\1\2\u02d1"+
		"\u02dc\3\2\2\2\u02d2\u02d3\7O\2\2\u02d3\u02d4\7\24\2\2\u02d4\u02d5\7@"+
		"\2\2\u02d5\u02d6\7\t\2\2\u02d6\u02d7\5^\60\2\u02d7\u02d8\7\n\2\2\u02d8"+
		"\u02d9\7\17\2\2\u02d9\u02da\b\26\1\2\u02da\u02dc\3\2\2\2\u02db\u02be\3"+
		"\2\2\2\u02db\u02c7\3\2\2\2\u02db\u02d2\3\2\2\2\u02dc+\3\2\2\2\u02dd\u02de"+
		"\5<\37\2\u02de\u02df\7\17\2\2\u02df\u02e0\b\27\1\2\u02e0\u02e8\3\2\2\2"+
		"\u02e1\u02e2\5> \2\u02e2\u02e3\b\27\1\2\u02e3\u02e8\3\2\2\2\u02e4\u02e5"+
		"\5.\30\2\u02e5\u02e6\b\27\1\2\u02e6\u02e8\3\2\2\2\u02e7\u02dd\3\2\2\2"+
		"\u02e7\u02e1\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e8-\3\2\2\2\u02e9\u02ea\7"+
		"\66\2\2\u02ea\u02eb\5^\60\2\u02eb\u02ec\7\13\2\2\u02ec\u02ed\5\60\31\2"+
		"\u02ed\u02ee\5\66\34\2\u02ee\u02ef\7\f\2\2\u02ef\u02f0\b\30\1\2\u02f0"+
		"\u0300\3\2\2\2\u02f1\u02f2\7\66\2\2\u02f2\u02f3\5^\60\2\u02f3\u02f4\7"+
		"\13\2\2\u02f4\u02f5\5\60\31\2\u02f5\u02f6\7\f\2\2\u02f6\u02f7\b\30\1\2"+
		"\u02f7\u0300\3\2\2\2\u02f8\u02f9\7\66\2\2\u02f9\u02fa\5^\60\2\u02fa\u02fb"+
		"\7\13\2\2\u02fb\u02fc\5\66\34\2\u02fc\u02fd\7\f\2\2\u02fd\u02fe\b\30\1"+
		"\2\u02fe\u0300\3\2\2\2\u02ff\u02e9\3\2\2\2\u02ff\u02f1\3\2\2\2\u02ff\u02f8"+
		"\3\2\2\2\u0300/\3\2\2\2\u0301\u0302\b\31\1\2\u0302\u0303\5\62\32\2\u0303"+
		"\u0304\b\31\1\2\u0304\u030b\3\2\2\2\u0305\u0306\f\4\2\2\u0306\u0307\5"+
		"\62\32\2\u0307\u0308\b\31\1\2\u0308\u030a\3\2\2\2\u0309\u0305\3\2\2\2"+
		"\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\61"+
		"\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u030f\5^\60\2\u030f\u0310\7#\2\2\u0310"+
		"\u0311\7!\2\2\u0311\u0312\5^\60\2\u0312\u0313\7\21\2\2\u0313\u0314\b\32"+
		"\1\2\u0314\u031d\3\2\2\2\u0315\u0316\5\64\33\2\u0316\u0317\7#\2\2\u0317"+
		"\u0318\7!\2\2\u0318\u0319\5^\60\2\u0319\u031a\7\21\2\2\u031a\u031b\b\32"+
		"\1\2\u031b\u031d\3\2\2\2\u031c\u030e\3\2\2\2\u031c\u0315\3\2\2\2\u031d"+
		"\63\3\2\2\2\u031e\u031f\5N(\2\u031f\u0320\7\23\2\2\u0320\u0321\5^\60\2"+
		"\u0321\u0322\b\33\1\2\u0322\u0327\3\2\2\2\u0323\u0324\5^\60\2\u0324\u0325"+
		"\b\33\1\2\u0325\u0327\3\2\2\2\u0326\u031e\3\2\2\2\u0326\u0323\3\2\2\2"+
		"\u0327\65\3\2\2\2\u0328\u0329\7\22\2\2\u0329\u032a\7#\2\2\u032a\u032b"+
		"\7!\2\2\u032b\u032c\5^\60\2\u032c\u032d\7\21\2\2\u032d\u032e\b\34\1\2"+
		"\u032e\67\3\2\2\2\u032f\u0330\7(\2\2\u0330\u033e\b\35\1\2\u0331\u0332"+
		"\7)\2\2\u0332\u033e\b\35\1\2\u0333\u0334\7,\2\2\u0334\u033e\b\35\1\2\u0335"+
		"\u0336\7*\2\2\u0336\u033e\b\35\1\2\u0337\u0338\7+\2\2\u0338\u033e\b\35"+
		"\1\2\u0339\u033a\7-\2\2\u033a\u033e\b\35\1\2\u033b\u033c\7.\2\2\u033c"+
		"\u033e\b\35\1\2\u033d\u032f\3\2\2\2\u033d\u0331\3\2\2\2\u033d\u0333\3"+
		"\2\2\2\u033d\u0335\3\2\2\2\u033d\u0337\3\2\2\2\u033d\u0339\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033e9\3\2\2\2\u033f\u0340\7O\2\2\u0340\u0341\7#\2\2\u0341"+
		"\u0342\5^\60\2\u0342\u0343\7\17\2\2\u0343\u0344\b\36\1\2\u0344\u034e\3"+
		"\2\2\2\u0345\u0346\7O\2\2\u0346\u0347\7\24\2\2\u0347\u0348\7O\2\2\u0348"+
		"\u0349\7#\2\2\u0349\u034a\5^\60\2\u034a\u034b\7\17\2\2\u034b\u034c\b\36"+
		"\1\2\u034c\u034e\3\2\2\2\u034d\u033f\3\2\2\2\u034d\u0345\3\2\2\2\u034e"+
		";\3\2\2\2\u034f\u0350\7\62\2\2\u0350\u0351\5^\60\2\u0351\u0352\7\13\2"+
		"\2\u0352\u0353\5^\60\2\u0353\u0354\7\f\2\2\u0354\u0355\b\37\1\2\u0355"+
		"\u036b\3\2\2\2\u0356\u0357\7\62\2\2\u0357\u0358\5^\60\2\u0358\u0359\7"+
		"\13\2\2\u0359\u035a\5^\60\2\u035a\u035b\7\f\2\2\u035b\u035c\7\63\2\2\u035c"+
		"\u035d\7\13\2\2\u035d\u035e\5^\60\2\u035e\u035f\7\f\2\2\u035f\u0360\b"+
		"\37\1\2\u0360\u036b\3\2\2\2\u0361\u0362\7\62\2\2\u0362\u0363\5^\60\2\u0363"+
		"\u0364\7\13\2\2\u0364\u0365\5^\60\2\u0365\u0366\7\f\2\2\u0366\u0367\7"+
		"\63\2\2\u0367\u0368\5<\37\2\u0368\u0369\b\37\1\2\u0369\u036b\3\2\2\2\u036a"+
		"\u034f\3\2\2\2\u036a\u0356\3\2\2\2\u036a\u0361\3\2\2\2\u036b=\3\2\2\2"+
		"\u036c\u036d\7\64\2\2\u036d\u036e\7\13\2\2\u036e\u036f\5\4\3\2\u036f\u0370"+
		"\7\f\2\2\u0370\u0371\b \1\2\u0371?\3\2\2\2\u0372\u0373\7/\2\2\u0373\u0374"+
		"\7\b\2\2\u0374\u0375\7\t\2\2\u0375\u0376\5^\60\2\u0376\u0377\7\n\2\2\u0377"+
		"\u0378\b!\1\2\u0378\u0383\3\2\2\2\u0379\u037a\7/\2\2\u037a\u037b\7\b\2"+
		"\2\u037b\u037c\7\t\2\2\u037c\u037d\5^\60\2\u037d\u037e\7\21\2\2\u037e"+
		"\u037f\5B\"\2\u037f\u0380\7\n\2\2\u0380\u0381\b!\1\2\u0381\u0383\3\2\2"+
		"\2\u0382\u0372\3\2\2\2\u0382\u0379\3\2\2\2\u0383A\3\2\2\2\u0384\u0385"+
		"\b\"\1\2\u0385\u0386\5^\60\2\u0386\u0387\b\"\1\2\u0387\u038f\3\2\2\2\u0388"+
		"\u0389\f\4\2\2\u0389\u038a\7\21\2\2\u038a\u038b\5^\60\2\u038b\u038c\b"+
		"\"\1\2\u038c\u038e\3\2\2\2\u038d\u0388\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390C\3\2\2\2\u0391\u038f\3\2\2\2"+
		"\u0392\u0393\b#\1\2\u0393\u0394\5X-\2\u0394\u0395\b#\1\2\u0395\u039d\3"+
		"\2\2\2\u0396\u0397\f\4\2\2\u0397\u0398\7\21\2\2\u0398\u0399\5X-\2\u0399"+
		"\u039a\b#\1\2\u039a\u039c\3\2\2\2\u039b\u0396\3\2\2\2\u039c\u039f\3\2"+
		"\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039eE\3\2\2\2\u039f\u039d"+
		"\3\2\2\2\u03a0\u03a1\7\62\2\2\u03a1\u03a2\5^\60\2\u03a2\u03a3\7\13\2\2"+
		"\u03a3\u03a4\5\4\3\2\u03a4\u03a5\7\f\2\2\u03a5\u03a6\b$\1\2\u03a6\u03bc"+
		"\3\2\2\2\u03a7\u03a8\7\62\2\2\u03a8\u03a9\5^\60\2\u03a9\u03aa\7\13\2\2"+
		"\u03aa\u03ab\5\4\3\2\u03ab\u03ac\7\f\2\2\u03ac\u03ad\7\63\2\2\u03ad\u03ae"+
		"\7\13\2\2\u03ae\u03af\5\4\3\2\u03af\u03b0\7\f\2\2\u03b0\u03b1\b$\1\2\u03b1"+
		"\u03bc\3\2\2\2\u03b2\u03b3\7\62\2\2\u03b3\u03b4\5^\60\2\u03b4\u03b5\7"+
		"\13\2\2\u03b5\u03b6\5\4\3\2\u03b6\u03b7\7\f\2\2\u03b7\u03b8\7\63\2\2\u03b8"+
		"\u03b9\5F$\2\u03b9\u03ba\b$\1\2\u03ba\u03bc\3\2\2\2\u03bb\u03a0\3\2\2"+
		"\2\u03bb\u03a7\3\2\2\2\u03bb\u03b2\3\2\2\2\u03bcG\3\2\2\2\u03bd\u03be"+
		"\7\66\2\2\u03be\u03bf\5^\60\2\u03bf\u03c0\7\13\2\2\u03c0\u03c1\5J&\2\u03c1"+
		"\u03c2\5P)\2\u03c2\u03c3\7\f\2\2\u03c3\u03c4\b%\1\2\u03c4\u03cd\3\2\2"+
		"\2\u03c5\u03c6\7\66\2\2\u03c6\u03c7\5^\60\2\u03c7\u03c8\7\13\2\2\u03c8"+
		"\u03c9\5P)\2\u03c9\u03ca\7\f\2\2\u03ca\u03cb\b%\1\2\u03cb\u03cd\3\2\2"+
		"\2\u03cc\u03bd\3\2\2\2\u03cc\u03c5\3\2\2\2\u03cdI\3\2\2\2\u03ce\u03cf"+
		"\b&\1\2\u03cf\u03d0\5L\'\2\u03d0\u03d1\b&\1\2\u03d1\u03d8\3\2\2\2\u03d2"+
		"\u03d3\f\4\2\2\u03d3\u03d4\5L\'\2\u03d4\u03d5\b&\1\2\u03d5\u03d7\3\2\2"+
		"\2\u03d6\u03d2\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9K\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\5^\60\2\u03dc"+
		"\u03dd\7#\2\2\u03dd\u03de\7!\2\2\u03de\u03df\7\13\2\2\u03df\u03e0\5\4"+
		"\3\2\u03e0\u03e1\7\f\2\2\u03e1\u03e2\b\'\1\2\u03e2\u03fa\3\2\2\2\u03e3"+
		"\u03e4\5N(\2\u03e4\u03e5\7#\2\2\u03e5\u03e6\7!\2\2\u03e6\u03e7\7\13\2"+
		"\2\u03e7\u03e8\5\4\3\2\u03e8\u03e9\7\f\2\2\u03e9\u03ea\b\'\1\2\u03ea\u03fa"+
		"\3\2\2\2\u03eb\u03ec\5^\60\2\u03ec\u03ed\7#\2\2\u03ed\u03ee\7!\2\2\u03ee"+
		"\u03ef\5\6\4\2\u03ef\u03f0\7\21\2\2\u03f0\u03f1\b\'\1\2\u03f1\u03fa\3"+
		"\2\2\2\u03f2\u03f3\5N(\2\u03f3\u03f4\7#\2\2\u03f4\u03f5\7!\2\2\u03f5\u03f6"+
		"\5\6\4\2\u03f6\u03f7\7\21\2\2\u03f7\u03f8\b\'\1\2\u03f8\u03fa\3\2\2\2"+
		"\u03f9\u03db\3\2\2\2\u03f9\u03e3\3\2\2\2\u03f9\u03eb\3\2\2\2\u03f9\u03f2"+
		"\3\2\2\2\u03faM\3\2\2\2\u03fb\u03fc\b(\1\2\u03fc\u03fd\5^\60\2\u03fd\u03fe"+
		"\b(\1\2\u03fe\u0406\3\2\2\2\u03ff\u0400\f\4\2\2\u0400\u0401\7\23\2\2\u0401"+
		"\u0402\5^\60\2\u0402\u0403\b(\1\2\u0403\u0405\3\2\2\2\u0404\u03ff\3\2"+
		"\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"O\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040a\7\22\2\2\u040a\u040b\7#\2\2"+
		"\u040b\u040c\7!\2\2\u040c\u040d\7\13\2\2\u040d\u040e\5\4\3\2\u040e\u040f"+
		"\7\f\2\2\u040f\u0410\b)\1\2\u0410\u0419\3\2\2\2\u0411\u0412\7\22\2\2\u0412"+
		"\u0413\7#\2\2\u0413\u0414\7!\2\2\u0414\u0415\5\6\4\2\u0415\u0416\7\21"+
		"\2\2\u0416\u0417\b)\1\2\u0417\u0419\3\2\2\2\u0418\u0409\3\2\2\2\u0418"+
		"\u0411\3\2\2\2\u0419Q\3\2\2\2\u041a\u041b\7\64\2\2\u041b\u041c\7\13\2"+
		"\2\u041c\u041d\5\4\3\2\u041d\u041e\7\f\2\2\u041e\u041f\b*\1\2\u041fS\3"+
		"\2\2\2\u0420\u0421\7\65\2\2\u0421\u0422\5^\60\2\u0422\u0423\7\13\2\2\u0423"+
		"\u0424\5\4\3\2\u0424\u0425\7\f\2\2\u0425\u0426\b+\1\2\u0426U\3\2\2\2\u0427"+
		"\u0428\7\67\2\2\u0428\u0429\7O\2\2\u0429\u042a\78\2\2\u042a\u042b\5^\60"+
		"\2\u042b\u042c\7\24\2\2\u042c\u042d\7\24\2\2\u042d\u042e\5^\60\2\u042e"+
		"\u042f\7\13\2\2\u042f\u0430\5\4\3\2\u0430\u0431\7\f\2\2\u0431\u0432\b"+
		",\1\2\u0432\u043d\3\2\2\2\u0433\u0434\7\67\2\2\u0434\u0435\7O\2\2\u0435"+
		"\u0436\78\2\2\u0436\u0437\5X-\2\u0437\u0438\7\13\2\2\u0438\u0439\5\4\3"+
		"\2\u0439\u043a\7\f\2\2\u043a\u043b\b,\1\2\u043b\u043d\3\2\2\2\u043c\u0427"+
		"\3\2\2\2\u043c\u0433\3\2\2\2\u043dW\3\2\2\2\u043e\u043f\b-\1\2\u043f\u0440"+
		"\7(\2\2\u0440\u0441\7\20\2\2\u0441\u0442\7\20\2\2\u0442\u0443\7\32\2\2"+
		"\u0443\u0444\7\t\2\2\u0444\u0445\5X-\2\u0445\u0446\7\21\2\2\u0446\u0447"+
		"\5X-\2\u0447\u0448\7\n\2\2\u0448\u0449\b-\1\2\u0449\u0478\3\2\2\2\u044a"+
		"\u044b\7)\2\2\u044b\u044c\7\20\2\2\u044c\u044d\7\20\2\2\u044d\u044e\7"+
		"\33\2\2\u044e\u044f\7\t\2\2\u044f\u0450\5X-\2\u0450\u0451\7\21\2\2\u0451"+
		"\u0452\5X-\2\u0452\u0453\7\n\2\2\u0453\u0454\b-\1\2\u0454\u0478\3\2\2"+
		"\2\u0455\u0456\7\t\2\2\u0456\u0457\5X-\2\u0457\u0458\7\n\2\2\u0458\u0459"+
		"\b-\1\2\u0459\u0478\3\2\2\2\u045a\u045b\7\b\2\2\u045b\u045c\5X-\b\u045c"+
		"\u045d\b-\1\2\u045d\u0478\3\2\2\2\u045e\u045f\7\r\2\2\u045f\u0460\5D#"+
		"\2\u0460\u0461\7\16\2\2\u0461\u0462\b-\1\2\u0462\u0478\3\2\2\2\u0463\u0464"+
		"\7\r\2\2\u0464\u0465\5X-\2\u0465\u0466\7\17\2\2\u0466\u0467\5X-\2\u0467"+
		"\u0468\7\16\2\2\u0468\u0469\b-\1\2\u0469\u0478\3\2\2\2\u046a\u046b\5^"+
		"\60\2\u046b\u046c\7\24\2\2\u046c\u046d\7C\2\2\u046d\u046e\7\t\2\2\u046e"+
		"\u046f\7\n\2\2\u046f\u0470\b-\1\2\u0470\u0478\3\2\2\2\u0471\u0472\5(\25"+
		"\2\u0472\u0473\b-\1\2\u0473\u0478\3\2\2\2\u0474\u0475\5b\62\2\u0475\u0476"+
		"\b-\1\2\u0476\u0478\3\2\2\2\u0477\u043e\3\2\2\2\u0477\u044a\3\2\2\2\u0477"+
		"\u0455\3\2\2\2\u0477\u045a\3\2\2\2\u0477\u045e\3\2\2\2\u0477\u0463\3\2"+
		"\2\2\u0477\u046a\3\2\2\2\u0477\u0471\3\2\2\2\u0477\u0474\3\2\2\2\u0478"+
		"\u0494\3\2\2\2\u0479\u047a\f\16\2\2\u047a\u047b\7\34\2\2\u047b\u047c\5"+
		"X-\17\u047c\u047d\b-\1\2\u047d\u0493\3\2\2\2\u047e\u047f\f\r\2\2\u047f"+
		"\u0480\t\2\2\2\u0480\u0481\5X-\16\u0481\u0482\b-\1\2\u0482\u0493\3\2\2"+
		"\2\u0483\u0484\f\f\2\2\u0484\u0485\t\3\2\2\u0485\u0486\5X-\r\u0486\u0487"+
		"\b-\1\2\u0487\u0493\3\2\2\2\u0488\u0489\f\13\2\2\u0489\u048a\t\4\2\2\u048a"+
		"\u048b\5X-\f\u048b\u048c\b-\1\2\u048c\u0493\3\2\2\2\u048d\u048e\f\t\2"+
		"\2\u048e\u048f\t\5\2\2\u048f\u0490\5X-\n\u0490\u0491\b-\1\2\u0491\u0493"+
		"\3\2\2\2\u0492\u0479\3\2\2\2\u0492\u047e\3\2\2\2\u0492\u0483\3\2\2\2\u0492"+
		"\u0488\3\2\2\2\u0492\u048d\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2"+
		"\2\2\u0494\u0495\3\2\2\2\u0495Y\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498"+
		"\b.\1\2\u0498\u0499\5\\/\2\u0499\u049a\b.\1\2\u049a\u04a2\3\2\2\2\u049b"+
		"\u049c\f\4\2\2\u049c\u049d\7\21\2\2\u049d\u049e\5\\/\2\u049e\u049f\b."+
		"\1\2\u049f\u04a1\3\2\2\2\u04a0\u049b\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2"+
		"\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3[\3\2\2\2\u04a4\u04a2\3\2\2\2"+
		"\u04a5\u04a6\7O\2\2\u04a6\u04a7\7\20\2\2\u04a7\u04a8\5^\60\2\u04a8\u04a9"+
		"\b/\1\2\u04a9\u04b0\3\2\2\2\u04aa\u04ab\7O\2\2\u04ab\u04ac\7\20\2\2\u04ac"+
		"\u04ad\5X-\2\u04ad\u04ae\b/\1\2\u04ae\u04b0\3\2\2\2\u04af\u04a5\3\2\2"+
		"\2\u04af\u04aa\3\2\2\2\u04b0]\3\2\2\2\u04b1\u04b2\b\60\1\2\u04b2\u04b3"+
		"\7(\2\2\u04b3\u04b4\7\20\2\2\u04b4\u04b5\7\20\2\2\u04b5\u04b6\7\32\2\2"+
		"\u04b6\u04b7\7\t\2\2\u04b7\u04b8\5^\60\2\u04b8\u04b9\7\21\2\2\u04b9\u04ba"+
		"\5^\60\2\u04ba\u04bb\7\n\2\2\u04bb\u04bc\b\60\1\2\u04bc\u04f2\3\2\2\2"+
		"\u04bd\u04be\7)\2\2\u04be\u04bf\7\20\2\2\u04bf\u04c0\7\20\2\2\u04c0\u04c1"+
		"\7\33\2\2\u04c1\u04c2\7\t\2\2\u04c2\u04c3\5^\60\2\u04c3\u04c4\7\21\2\2"+
		"\u04c4\u04c5\5^\60\2\u04c5\u04c6\7\n\2\2\u04c6\u04c7\b\60\1\2\u04c7\u04f2"+
		"\3\2\2\2\u04c8\u04c9\7\31\2\2\u04c9\u04ca\5^\60\25\u04ca\u04cb\b\60\1"+
		"\2\u04cb\u04f2\3\2\2\2\u04cc\u04cd\7\t\2\2\u04cd\u04ce\5^\60\2\u04ce\u04cf"+
		"\7\n\2\2\u04cf\u04d0\b\60\1\2\u04d0\u04f2\3\2\2\2\u04d1\u04d2\7\t\2\2"+
		"\u04d2\u04d3\5^\60\2\u04d3\u04d4\7\n\2\2\u04d4\u04d5\b\60\1\2\u04d5\u04f2"+
		"\3\2\2\2\u04d6\u04d7\7\b\2\2\u04d7\u04d8\5^\60\20\u04d8\u04d9\b\60\1\2"+
		"\u04d9\u04f2\3\2\2\2\u04da\u04db\7O\2\2\u04db\u04dc\7\24\2\2\u04dc\u04dd"+
		"\7@\2\2\u04dd\u04de\7\t\2\2\u04de\u04df\5^\60\2\u04df\u04e0\7\n\2\2\u04e0"+
		"\u04e1\b\60\1\2\u04e1\u04f2\3\2\2\2\u04e2\u04e3\7O\2\2\u04e3\u04e4\7\13"+
		"\2\2\u04e4\u04e5\5Z.\2\u04e5\u04e6\7\f\2\2\u04e6\u04e7\b\60\1\2\u04e7"+
		"\u04f2\3\2\2\2\u04e8\u04e9\5f\64\2\u04e9\u04ea\b\60\1\2\u04ea\u04f2\3"+
		"\2\2\2\u04eb\u04ec\5`\61\2\u04ec\u04ed\b\60\1\2\u04ed\u04f2\3\2\2\2\u04ee"+
		"\u04ef\5b\62\2\u04ef\u04f0\b\60\1\2\u04f0\u04f2\3\2\2\2\u04f1\u04b1\3"+
		"\2\2\2\u04f1\u04bd\3\2\2\2\u04f1\u04c8\3\2\2\2\u04f1\u04cc\3\2\2\2\u04f1"+
		"\u04d1\3\2\2\2\u04f1\u04d6\3\2\2\2\u04f1\u04da\3\2\2\2\u04f1\u04e2\3\2"+
		"\2\2\u04f1\u04e8\3\2\2\2\u04f1\u04eb\3\2\2\2\u04f1\u04ee\3\2\2\2\u04f2"+
		"\u0546\3\2\2\2\u04f3\u04f4\f\30\2\2\u04f4\u04f5\7\34\2\2\u04f5\u04f6\5"+
		"^\60\31\u04f6\u04f7\b\60\1\2\u04f7\u0545\3\2\2\2\u04f8\u04f9\f\27\2\2"+
		"\u04f9\u04fa\t\2\2\2\u04fa\u04fb\5^\60\30\u04fb\u04fc\b\60\1\2\u04fc\u0545"+
		"\3\2\2\2\u04fd\u04fe\f\26\2\2\u04fe\u04ff\t\3\2\2\u04ff\u0500\5^\60\27"+
		"\u0500\u0501\b\60\1\2\u0501\u0545\3\2\2\2\u0502\u0503\f\23\2\2\u0503\u0504"+
		"\t\4\2\2\u0504\u0505\5^\60\24\u0505\u0506\b\60\1\2\u0506\u0545\3\2\2\2"+
		"\u0507\u0508\f\21\2\2\u0508\u0509\t\5\2\2\u0509\u050a\5^\60\22\u050a\u050b"+
		"\b\60\1\2\u050b\u0545\3\2\2\2\u050c\u050d\f\31\2\2\u050d\u050e\7\24\2"+
		"\2\u050e\u050f\7B\2\2\u050f\u0510\7\t\2\2\u0510\u0511\7\n\2\2\u0511\u0545"+
		"\b\60\1\2\u0512\u0513\f\16\2\2\u0513\u0514\7\24\2\2\u0514\u0515\7A\2\2"+
		"\u0515\u0516\7\t\2\2\u0516\u0517\7\25\2\2\u0517\u0518\5^\60\2\u0518\u0519"+
		"\7\n\2\2\u0519\u051a\b\60\1\2\u051a\u0545\3\2\2\2\u051b\u051c\f\r\2\2"+
		"\u051c\u051d\7\24\2\2\u051d\u051e\7C\2\2\u051e\u051f\7\t\2\2\u051f\u0520"+
		"\7\n\2\2\u0520\u0545\b\60\1\2\u0521\u0522\f\f\2\2\u0522\u0523\7\24\2\2"+
		"\u0523\u0524\7D\2\2\u0524\u0525\7\t\2\2\u0525\u0526\7\n\2\2\u0526\u0545"+
		"\b\60\1\2\u0527\u0528\f\13\2\2\u0528\u0529\7\24\2\2\u0529\u052a\7E\2\2"+
		"\u052a\u052b\7\t\2\2\u052b\u052c\7\n\2\2\u052c\u0545\b\60\1\2\u052d\u052e"+
		"\f\n\2\2\u052e\u052f\7F\2\2\u052f\u0530\58\35\2\u0530\u0531\b\60\1\2\u0531"+
		"\u0545\3\2\2\2\u0532\u0533\f\t\2\2\u0533\u0534\7\24\2\2\u0534\u0535\7"+
		"H\2\2\u0535\u0536\7\t\2\2\u0536\u0537\7\n\2\2\u0537\u0545\b\60\1\2\u0538"+
		"\u0539\f\b\2\2\u0539\u053a\7\24\2\2\u053a\u053b\7I\2\2\u053b\u053c\7\t"+
		"\2\2\u053c\u053d\7\n\2\2\u053d\u0545\b\60\1\2\u053e\u053f\f\7\2\2\u053f"+
		"\u0540\7\24\2\2\u0540\u0541\7J\2\2\u0541\u0542\7\t\2\2\u0542\u0543\7\n"+
		"\2\2\u0543\u0545\b\60\1\2\u0544\u04f3\3\2\2\2\u0544\u04f8\3\2\2\2\u0544"+
		"\u04fd\3\2\2\2\u0544\u0502\3\2\2\2\u0544\u0507\3\2\2\2\u0544\u050c\3\2"+
		"\2\2\u0544\u0512\3\2\2\2\u0544\u051b\3\2\2\2\u0544\u0521\3\2\2\2\u0544"+
		"\u0527\3\2\2\2\u0544\u052d\3\2\2\2\u0544\u0532\3\2\2\2\u0544\u0538\3\2"+
		"\2\2\u0544\u053e\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546"+
		"\u0547\3\2\2\2\u0547_\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054a\7O\2\2\u054a"+
		"\u054b\7\t\2\2\u054b\u054c\7\n\2\2\u054c\u0554\b\61\1\2\u054d\u054e\7"+
		"O\2\2\u054e\u054f\7\t\2\2\u054f\u0550\5\34\17\2\u0550\u0551\7\n\2\2\u0551"+
		"\u0552\b\61\1\2\u0552\u0554\3\2\2\2\u0553\u0549\3\2\2\2\u0553\u054d\3"+
		"\2\2\2\u0554a\3\2\2\2\u0555\u0556\7\3\2\2\u0556\u0563\b\62\1\2\u0557\u0558"+
		"\7\4\2\2\u0558\u0563\b\62\1\2\u0559\u055a\t\6\2\2\u055a\u0563\b\62\1\2"+
		"\u055b\u055c\7\6\2\2\u055c\u0563\b\62\1\2\u055d\u055e\7\5\2\2\u055e\u0563"+
		"\b\62\1\2\u055f\u0560\5d\63\2\u0560\u0561\b\62\1\2\u0561\u0563\3\2\2\2"+
		"\u0562\u0555\3\2\2\2\u0562\u0557\3\2\2\2\u0562\u0559\3\2\2\2\u0562\u055b"+
		"\3\2\2\2\u0562\u055d\3\2\2\2\u0562\u055f\3\2\2\2\u0563c\3\2\2\2\u0564"+
		"\u0565\b\63\1\2\u0565\u0566\7O\2\2\u0566\u0567\b\63\1\2\u0567\u0570\3"+
		"\2\2\2\u0568\u0569\f\4\2\2\u0569\u056a\7\r\2\2\u056a\u056b\5^\60\2\u056b"+
		"\u056c\7\16\2\2\u056c\u056d\b\63\1\2\u056d\u056f\3\2\2\2\u056e\u0568\3"+
		"\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"e\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u0574\b\64\1\2\u0574\u0575\7O\2\2"+
		"\u0575\u0576\b\64\1\2\u0576\u057d\3\2\2\2\u0577\u0578\f\4\2\2\u0578\u0579"+
		"\7\24\2\2\u0579\u057a\7O\2\2\u057a\u057c\b\64\1\2\u057b\u0577\3\2\2\2"+
		"\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057eg\3"+
		"\2\2\2\u057f\u057d\3\2\2\2\65n\u00a7\u00b8\u00c4\u00d8\u00ec\u0102\u0181"+
		"\u018e\u01b6\u01c4\u01cf\u01dd\u01df\u01fa\u0222\u0246\u0256\u0299\u02bc"+
		"\u02db\u02e7\u02ff\u030b\u031c\u0326\u033d\u034d\u036a\u0382\u038f\u039d"+
		"\u03bb\u03cc\u03d8\u03f9\u0406\u0418\u043c\u0477\u0492\u0494\u04a2\u04af"+
		"\u04f1\u0544\u0546\u0553\u0562\u0570\u057d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
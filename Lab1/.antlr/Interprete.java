// Generated from d:\Github\OCL2_Proyecto2_201900528\Lab1\Interprete.g4 by ANTLR 4.8
 
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
		RULE_tipo = 27, RULE_asignacion = 28, RULE_sent_if_expr = 29, RULE_sent_instru_if_expre = 30, 
		RULE_sent_loop_expr = 31, RULE_printaso = 32, RULE_list_expre_print = 33, 
		RULE_list_expre_vec_arr = 34, RULE_sent_if = 35, RULE_sent_match = 36, 
		RULE_match_listbrazos = 37, RULE_list_brazos = 38, RULE_match_listbrazos_listexpr = 39, 
		RULE_el_default = 40, RULE_sent_loop = 41, RULE_sent_while = 42, RULE_sent_ForIn = 43, 
		RULE_expression_vec_Arr = 44, RULE_atributos_struct_exp = 45, RULE_atributos_struct_decl_exp = 46, 
		RULE_expression = 47, RULE_llamada_expre = 48, RULE_primitivo = 49, RULE_list_array = 50, 
		RULE_llamadas_structs = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "sent_Modulos", "intructions_modulos", 
			"instruct_modulos", "sent_struct", "atributos_struct", "atributos_struct_decl", 
			"sent_funcion", "params_funcion", "params_funcion_decl", "sent_Llamada", 
			"params_llamada", "funciones_Trans", "declaracion", "array_decl", "array_decl_array", 
			"vector_decl", "vector_expr", "sent_funciones_Vec", "sentencias_expr", 
			"sent_matchexpr", "matchexpr_listbrazos", "list_brazosexpr", "matchexpr_listbrazosexpr_listexpr", 
			"el_defaultexpr", "tipo", "asignacion", "sent_if_expr", "sent_instru_if_expre", 
			"sent_loop_expr", "printaso", "list_expre_print", "list_expre_vec_arr", 
			"sent_if", "sent_match", "match_listbrazos", "list_brazos", "match_listbrazos_listexpr", 
			"el_default", "sent_loop", "sent_while", "sent_ForIn", "expression_vec_Arr", 
			"atributos_struct_exp", "atributos_struct_decl_exp", "expression", "llamada_expre", 
			"primitivo", "list_array", "llamadas_structs"
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
			setState(104);
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
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					((InstruccionesContext)_localctx).instruccion = instruccion();
					((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((InstruccionContext)_localctx).printaso = printaso();
				setState(116);
				match(PYC);
				 _localctx.instr = ((InstruccionContext)_localctx).printaso.instr 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((InstruccionContext)_localctx).printaso = printaso();
				 _localctx.instr = ((InstruccionContext)_localctx).printaso.instr 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((InstruccionContext)_localctx).declaracion = declaracion();
				 _localctx.instr = ((InstruccionContext)_localctx).declaracion.instr 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				((InstruccionContext)_localctx).vector_decl = vector_decl();
				 _localctx.instr = ((InstruccionContext)_localctx).vector_decl.instr 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				((InstruccionContext)_localctx).array_decl = array_decl();
				 _localctx.instr = ((InstruccionContext)_localctx).array_decl.instr 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				((InstruccionContext)_localctx).asignacion = asignacion();
				 _localctx.instr = ((InstruccionContext)_localctx).asignacion.instr 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				((InstruccionContext)_localctx).sent_if = sent_if();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_if.instr 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				((InstruccionContext)_localctx).sent_loop = sent_loop();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_loop.instr 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				((InstruccionContext)_localctx).sent_while = sent_while();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_while.instr 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				((InstruccionContext)_localctx).sent_match = sent_match();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_match.instr 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				((InstruccionContext)_localctx).sent_funciones_Vec = sent_funciones_Vec();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_funciones_Vec.instr 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(149);
				((InstruccionContext)_localctx).sent_ForIn = sent_ForIn();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_ForIn.instr 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(152);
				((InstruccionContext)_localctx).funciones_Trans = funciones_Trans();
				 _localctx.instr = ((InstruccionContext)_localctx).funciones_Trans.instr 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(155);
				((InstruccionContext)_localctx).sent_funcion = sent_funcion();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_funcion.instr 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(158);
				((InstruccionContext)_localctx).sent_Llamada = sent_Llamada();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_Llamada.instr 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(161);
				((InstruccionContext)_localctx).sent_struct = sent_struct();
				 _localctx.instr = ((InstruccionContext)_localctx).sent_struct.instr 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(164);
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
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLI:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(PUBLI);
				setState(170);
				((Sent_ModulosContext)_localctx).MODULO = match(MODULO);
				setState(171);
				((Sent_ModulosContext)_localctx).ID = match(ID);
				setState(172);
				match(LLAVEA);
				setState(173);
				((Sent_ModulosContext)_localctx).li = intructions_modulos(0);
				setState(174);
				match(LLAVEC);
				 _localctx.instr = modulos.NewModulos((((Sent_ModulosContext)_localctx).ID!=null?((Sent_ModulosContext)_localctx).ID.getText():null), interfaces.PUBLICO, ((Sent_ModulosContext)_localctx).li.l, (((Sent_ModulosContext)_localctx).MODULO!=null?((Sent_ModulosContext)_localctx).MODULO.getLine():0), (((Sent_ModulosContext)_localctx).MODULO!=null?((Sent_ModulosContext)_localctx).MODULO.getCharPositionInLine():0)) 
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				((Sent_ModulosContext)_localctx).MODULO = match(MODULO);
				setState(178);
				((Sent_ModulosContext)_localctx).ID = match(ID);
				setState(179);
				match(LLAVEA);
				setState(180);
				((Sent_ModulosContext)_localctx).li = intructions_modulos(0);
				setState(181);
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
			setState(187);
			((Intructions_modulosContext)_localctx).instruct_modulos = instruct_modulos();
			 
			        a := arrayList.New() 
			        a.Add(((Intructions_modulosContext)_localctx).instruct_modulos.instr)
			        _localctx.l = a
			     
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
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
					setState(190);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(191);
					((Intructions_modulosContext)_localctx).instruct_modulos = instruct_modulos();
					 
					                  ((Intructions_modulosContext)_localctx).li.l.Add(((Intructions_modulosContext)_localctx).instruct_modulos.instr)  
					                  _localctx.l = ((Intructions_modulosContext)_localctx).li.l
					               
					}
					} 
				}
				setState(198);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((Instruct_modulosContext)_localctx).sent_Modulos = sent_Modulos();
				 _localctx.instr = ((Instruct_modulosContext)_localctx).sent_Modulos.instr 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((Instruct_modulosContext)_localctx).PUBLI = match(PUBLI);
				setState(203);
				((Instruct_modulosContext)_localctx).sent_funcion = sent_funcion();
				 _localctx.instr = modulos.NewFuncion_Mod( ((Instruct_modulosContext)_localctx).sent_funcion.instr, interfaces.PUBLICO, (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getLine():0), (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getCharPositionInLine():0) ) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				((Instruct_modulosContext)_localctx).sf = sent_funcion();
				 _localctx.instr = modulos.NewFuncion_Mod( ((Instruct_modulosContext)_localctx).sf.instr, interfaces.PRIVADO, 0, 0 ) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				((Instruct_modulosContext)_localctx).PUBLI = match(PUBLI);
				setState(210);
				((Instruct_modulosContext)_localctx).sent_struct = sent_struct();
				 _localctx.instr = modulos.NewStruct_Mod( ((Instruct_modulosContext)_localctx).sent_struct.instr, interfaces.PUBLICO , (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getLine():0), (((Instruct_modulosContext)_localctx).PUBLI!=null?((Instruct_modulosContext)_localctx).PUBLI.getCharPositionInLine():0) ) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
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
			setState(218);
			((Sent_structContext)_localctx).STRUCT = match(STRUCT);
			setState(219);
			((Sent_structContext)_localctx).ID = match(ID);
			setState(220);
			match(LLAVEA);
			setState(221);
			((Sent_structContext)_localctx).atributos_struct = atributos_struct(0);
			setState(222);
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
			setState(226);
			((Atributos_structContext)_localctx).atributos_struct_decl = atributos_struct_decl();

			        a := arrayList.New()
			        a.Add(((Atributos_structContext)_localctx).atributos_struct_decl.s)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
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
					setState(229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(230);
					match(COMA);
					setState(231);
					((Atributos_structContext)_localctx).asd = ((Atributos_structContext)_localctx).atributos_struct_decl = atributos_struct_decl();

					                  ((Atributos_structContext)_localctx).li.l.Add(((Atributos_structContext)_localctx).asd.s)
					                  _localctx.l = ((Atributos_structContext)_localctx).li.l
					              
					}
					} 
				}
				setState(238);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((Atributos_struct_declContext)_localctx).ID = match(ID);
				setState(240);
				match(DPTS);
				setState(241);
				array_decl_array();
				_localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).ID!=null?((Atributos_struct_declContext)_localctx).ID.getText():null), Tipo: 6}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((Atributos_struct_declContext)_localctx).ID = match(ID);
				setState(245);
				match(DPTS);
				setState(246);
				vector_decl();
				 _localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).ID!=null?((Atributos_struct_declContext)_localctx).ID.getText():null), Tipo: 10} 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((Atributos_struct_declContext)_localctx).ID = match(ID);
				setState(250);
				match(DPTS);
				setState(251);
				((Atributos_struct_declContext)_localctx).tipo = tipo();
				 _localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_declContext)_localctx).ID!=null?((Atributos_struct_declContext)_localctx).ID.getText():null), Tipo: ((Atributos_struct_declContext)_localctx).tipo.te} 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				((Atributos_struct_declContext)_localctx).id1 = match(ID);
				setState(255);
				match(DPTS);
				setState(256);
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
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(261);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(262);
				match(PARA);
				setState(263);
				match(PARC);
				setState(264);
				match(LLAVEA);
				setState(265);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(266);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(270);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(271);
				match(PARA);
				setState(272);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(273);
				match(PARC);
				setState(274);
				match(LLAVEA);
				setState(275);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(276);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(280);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(281);
				match(PARA);
				setState(282);
				match(PARC);
				setState(283);
				match(REST);
				setState(284);
				match(MAYOR);
				setState(285);
				((Sent_funcionContext)_localctx).tipo = tipo();
				setState(286);
				match(LLAVEA);
				setState(287);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(288);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), ((Sent_funcionContext)_localctx).tipo.te, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(292);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(293);
				match(PARA);
				setState(294);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(295);
				match(PARC);
				setState(296);
				match(REST);
				setState(297);
				match(MAYOR);
				setState(298);
				((Sent_funcionContext)_localctx).tipo = tipo();
				setState(299);
				match(LLAVEA);
				setState(300);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(301);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, ((Sent_funcionContext)_localctx).tipo.te, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(305);
				((Sent_funcionContext)_localctx).id1 = match(ID);
				setState(306);
				match(PARA);
				setState(307);
				match(PARC);
				setState(308);
				match(REST);
				setState(309);
				match(MAYOR);
				setState(310);
				((Sent_funcionContext)_localctx).id2 = match(ID);
				setState(311);
				match(LLAVEA);
				setState(312);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(313);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).id1!=null?((Sent_funcionContext)_localctx).id1.getText():null), arrayList.New(), interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(317);
				((Sent_funcionContext)_localctx).id1 = match(ID);
				setState(318);
				match(PARA);
				setState(319);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(320);
				match(PARC);
				setState(321);
				match(REST);
				setState(322);
				match(MAYOR);
				setState(323);
				((Sent_funcionContext)_localctx).id2 = match(ID);
				setState(324);
				match(LLAVEA);
				setState(325);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(326);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).id1!=null?((Sent_funcionContext)_localctx).id1.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.NULL, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(330);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(331);
				match(PARA);
				setState(332);
				match(PARC);
				setState(333);
				match(REST);
				setState(334);
				match(MAYOR);
				setState(335);
				array_decl_array();
				setState(336);
				match(LLAVEA);
				setState(337);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(338);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), interfaces.ARRAY, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(342);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(343);
				match(PARA);
				setState(344);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(345);
				match(PARC);
				setState(346);
				match(REST);
				setState(347);
				match(MAYOR);
				setState(348);
				array_decl_array();
				setState(349);
				match(LLAVEA);
				setState(350);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(351);
				match(LLAVEC);

				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), ((Sent_funcionContext)_localctx).params_funcion.l, interfaces.ARRAY, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(354);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(355);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(356);
				match(PARA);
				setState(357);
				match(PARC);
				setState(358);
				match(REST);
				setState(359);
				match(MAYOR);
				setState(360);
				match(VEC);
				setState(361);
				match(MENOR);
				setState(362);
				tipo();
				setState(363);
				match(MAYOR);
				setState(364);
				match(LLAVEA);
				setState(365);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(366);
				match(LLAVEC);
				 
				        _localctx.instr = instruction.NewFuncion((((Sent_funcionContext)_localctx).ID!=null?((Sent_funcionContext)_localctx).ID.getText():null), arrayList.New(), interfaces.VECTOR, ((Sent_funcionContext)_localctx).instrucciones.l, (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getLine():0), (((Sent_funcionContext)_localctx).FUNCT!=null?((Sent_funcionContext)_localctx).FUNCT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(369);
				((Sent_funcionContext)_localctx).FUNCT = match(FUNCT);
				setState(370);
				((Sent_funcionContext)_localctx).ID = match(ID);
				setState(371);
				match(PARA);
				setState(372);
				((Sent_funcionContext)_localctx).params_funcion = params_funcion(0);
				setState(373);
				match(PARC);
				setState(374);
				match(REST);
				setState(375);
				match(MAYOR);
				setState(376);
				match(VEC);
				setState(377);
				match(MENOR);
				setState(378);
				tipo();
				setState(379);
				match(MAYOR);
				setState(380);
				match(LLAVEA);
				setState(381);
				((Sent_funcionContext)_localctx).instrucciones = instrucciones();
				setState(382);
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
			setState(388);
			((Params_funcionContext)_localctx).params_funcion_decl = params_funcion_decl();
			 
			        a := arrayList.New()
			        a.Add(((Params_funcionContext)_localctx).params_funcion_decl.s)
			        _localctx.l = a
			     
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
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
					setState(391);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(392);
					match(COMA);
					setState(393);
					((Params_funcionContext)_localctx).params_funcion_decl = params_funcion_decl();

					                  ((Params_funcionContext)_localctx).li.l.Add(((Params_funcionContext)_localctx).params_funcion_decl.s)  
					                  _localctx.l = ((Params_funcionContext)_localctx).li.l
					              
					}
					} 
				}
				setState(400);
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
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(402);
				match(DPTS);
				setState(403);
				match(PUNTERO);
				setState(404);
				match(MUT);
				setState(405);
				array_decl_array();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 6, IsMut: true} 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(409);
				match(DPTS);
				setState(410);
				match(PUNTERO);
				setState(411);
				array_decl_array();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 6, IsMut: false} 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(415);
				match(DPTS);
				setState(416);
				match(PUNTERO);
				setState(417);
				match(MUT);
				setState(418);
				vector_expr();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 10, IsMut: true} 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(422);
				match(DPTS);
				setState(423);
				match(PUNTERO);
				setState(424);
				vector_expr();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: 10, IsMut: false} 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(428);
				match(DPTS);
				setState(429);
				match(MUT);
				setState(430);
				((Params_funcion_declContext)_localctx).tipo = tipo();
				 _localctx.s = interfaces.Symbol{ Id: (((Params_funcion_declContext)_localctx).ID!=null?((Params_funcion_declContext)_localctx).ID.getText():null), Tipo: ((Params_funcion_declContext)_localctx).tipo.te, IsMut: true} 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				((Params_funcion_declContext)_localctx).ID = match(ID);
				setState(434);
				match(DPTS);
				setState(435);
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
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				((Sent_LlamadaContext)_localctx).ID = match(ID);
				setState(441);
				((Sent_LlamadaContext)_localctx).PARA = match(PARA);
				setState(442);
				match(PARC);
				setState(443);
				match(PYC);
				 _localctx.instr = instruction.NewLlamada((((Sent_LlamadaContext)_localctx).ID!=null?((Sent_LlamadaContext)_localctx).ID.getText():null), arrayList.New(), (((Sent_LlamadaContext)_localctx).PARA!=null?((Sent_LlamadaContext)_localctx).PARA.getLine():0), (((Sent_LlamadaContext)_localctx).PARA!=null?((Sent_LlamadaContext)_localctx).PARA.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				((Sent_LlamadaContext)_localctx).ID = match(ID);
				setState(446);
				((Sent_LlamadaContext)_localctx).PARA = match(PARA);
				setState(447);
				((Sent_LlamadaContext)_localctx).li = params_llamada(0);
				setState(448);
				match(PARC);
				setState(449);
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
			setState(463);
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
				setState(455);
				((Params_llamadaContext)_localctx).expression = expression(0);

				        a := arrayList.New()
				        a.Add(((Params_llamadaContext)_localctx).expression.p)
				        _localctx.l = a
				    
				}
				break;
			case PUNTERO:
				{
				setState(458);
				match(PUNTERO);
				setState(459);
				match(MUT);
				setState(460);
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
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(477);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Params_llamadaContext(_parentctx, _parentState);
						_localctx.li = _prevctx;
						_localctx.li = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_params_llamada);
						setState(465);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(466);
						match(COMA);
						setState(467);
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
						setState(470);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(471);
						match(COMA);
						setState(472);
						match(PUNTERO);
						setState(473);
						match(MUT);
						setState(474);
						((Params_llamadaContext)_localctx).expression = expression(0);
						 
						                  ((Params_llamadaContext)_localctx).li.l.Add(((Params_llamadaContext)_localctx).expression.p)  
						                  _localctx.l = ((Params_llamadaContext)_localctx).li.l
						                  
						}
						break;
					}
					} 
				}
				setState(481);
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
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				((Funciones_TransContext)_localctx).BRE = match(BRE);
				setState(483);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewBreak( nil, (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getLine():0), (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getCharPositionInLine():0) ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				((Funciones_TransContext)_localctx).BRE = match(BRE);
				setState(486);
				((Funciones_TransContext)_localctx).expression = expression(0);
				setState(487);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewBreak( ((Funciones_TransContext)_localctx).expression.p, (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getLine():0), (((Funciones_TransContext)_localctx).BRE!=null?((Funciones_TransContext)_localctx).BRE.getCharPositionInLine():0) ) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				((Funciones_TransContext)_localctx).CONTINIU = match(CONTINIU);
				setState(491);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewContinue((((Funciones_TransContext)_localctx).CONTINIU!=null?((Funciones_TransContext)_localctx).CONTINIU.getLine():0), (((Funciones_TransContext)_localctx).CONTINIU!=null?((Funciones_TransContext)_localctx).CONTINIU.getCharPositionInLine():0)) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				((Funciones_TransContext)_localctx).RETURNASO = match(RETURNASO);
				setState(494);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewReturnaso(nil, (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getLine():0), (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getCharPositionInLine():0)) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496);
				((Funciones_TransContext)_localctx).RETURNASO = match(RETURNASO);
				setState(497);
				((Funciones_TransContext)_localctx).expression = expression(0);
				setState(498);
				match(PYC);
				 _localctx.instr = sentenciatransferencia.NewReturnaso(((Funciones_TransContext)_localctx).expression.p, (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getLine():0), (((Funciones_TransContext)_localctx).RETURNASO!=null?((Funciones_TransContext)_localctx).RETURNASO.getCharPositionInLine():0)) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				((Funciones_TransContext)_localctx).RETURNASO = match(RETURNASO);
				setState(502);
				((Funciones_TransContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(503);
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
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(LET);
				setState(509);
				match(MUT);
				setState(510);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(511);
				match(DPTS);
				setState(512);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(513);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(514);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(515);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).expression.p, true ,(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(LET);
				setState(519);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(520);
				match(DPTS);
				setState(521);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(522);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(523);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(524);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).expression.p, false,  (((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				match(LET);
				setState(528);
				match(MUT);
				setState(529);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(530);
				match(DPTS);
				setState(531);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(532);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(533);
				((DeclaracionContext)_localctx).sentencias_expr = sentencias_expr();
				setState(534);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).tipo.te, ((DeclaracionContext)_localctx).sentencias_expr.p, true,(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getLine():0),(((DeclaracionContext)_localctx).IGUAL!=null?((DeclaracionContext)_localctx).IGUAL.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				match(LET);
				setState(538);
				((DeclaracionContext)_localctx).ID = match(ID);
				setState(539);
				match(DPTS);
				setState(540);
				((DeclaracionContext)_localctx).tipo = tipo();
				setState(541);
				((DeclaracionContext)_localctx).IGUAL = match(IGUAL);
				setState(542);
				((DeclaracionContext)_localctx).sentencias_expr = sentencias_expr();
				setState(543);
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
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				((Array_declContext)_localctx).LET = match(LET);
				setState(549);
				match(MUT);
				setState(550);
				((Array_declContext)_localctx).ID = match(ID);
				setState(551);
				match(DPTS);
				setState(552);
				((Array_declContext)_localctx).tr = array_decl_array();
				setState(553);
				match(IGUAL);
				setState(554);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(555);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), ((Array_declContext)_localctx).tr.at, ((Array_declContext)_localctx).ea.p, true, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				((Array_declContext)_localctx).LET = match(LET);
				setState(559);
				match(MUT);
				setState(560);
				((Array_declContext)_localctx).ID = match(ID);
				setState(561);
				match(IGUAL);
				setState(562);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(563);
				match(PYC);

				        var a *structsinter.Array_type
				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), a, ((Array_declContext)_localctx).ea.p, true, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				((Array_declContext)_localctx).LET = match(LET);
				setState(567);
				((Array_declContext)_localctx).ID = match(ID);
				setState(568);
				match(DPTS);
				setState(569);
				((Array_declContext)_localctx).tr = array_decl_array();
				setState(570);
				match(IGUAL);
				setState(571);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(572);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Array((((Array_declContext)_localctx).ID!=null?((Array_declContext)_localctx).ID.getText():null), ((Array_declContext)_localctx).tr.at, ((Array_declContext)_localctx).ea.p, false, (((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getLine():0),(((Array_declContext)_localctx).LET!=null?((Array_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				((Array_declContext)_localctx).LET = match(LET);
				setState(576);
				((Array_declContext)_localctx).ID = match(ID);
				setState(577);
				match(IGUAL);
				setState(578);
				((Array_declContext)_localctx).ea = expression_vec_Arr(0);
				setState(579);
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
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(CORCHA);
				setState(585);
				((Array_decl_arrayContext)_localctx).stru = array_decl_array();
				setState(586);
				match(PYC);
				setState(587);
				((Array_decl_arrayContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(588);
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
				setState(591);
				match(CORCHA);
				setState(592);
				((Array_decl_arrayContext)_localctx).tipo = tipo();
				setState(593);
				match(PYC);
				setState(594);
				((Array_decl_arrayContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(595);
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
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(601);
				match(MUT);
				setState(602);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(603);
				match(DPTS);
				setState(604);
				match(VEC);
				setState(605);
				match(MENOR);
				setState(606);
				((Vector_declContext)_localctx).tipo = tipo();
				setState(607);
				match(MAYOR);
				setState(608);
				match(IGUAL);
				setState(609);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(610);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), ((Vector_declContext)_localctx).tipo.te, ((Vector_declContext)_localctx).ea.p, "" ,true, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(614);
				match(MUT);
				setState(615);
				((Vector_declContext)_localctx).id1 = match(ID);
				setState(616);
				match(DPTS);
				setState(617);
				match(VEC);
				setState(618);
				match(MENOR);
				setState(619);
				((Vector_declContext)_localctx).id2 = match(ID);
				setState(620);
				match(MAYOR);
				setState(621);
				match(IGUAL);
				setState(622);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(623);
				match(PYC);
				 
				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).id1!=null?((Vector_declContext)_localctx).id1.getText():null), interfaces.STRUCT, ((Vector_declContext)_localctx).ea.p, (((Vector_declContext)_localctx).id2!=null?((Vector_declContext)_localctx).id2.getText():null) ,true, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(627);
				match(MUT);
				setState(628);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(629);
				match(IGUAL);
				setState(630);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(631);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), 4, ((Vector_declContext)_localctx).ea.p, "" ,true, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(635);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(636);
				match(DPTS);
				setState(637);
				match(VEC);
				setState(638);
				match(MENOR);
				setState(639);
				((Vector_declContext)_localctx).tipo = tipo();
				setState(640);
				match(MAYOR);
				setState(641);
				match(IGUAL);
				setState(642);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(643);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), ((Vector_declContext)_localctx).tipo.te, ((Vector_declContext)_localctx).ea.p, "" ,false, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(647);
				((Vector_declContext)_localctx).ID = match(ID);
				setState(648);
				match(IGUAL);
				setState(649);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(650);
				match(PYC);

				        _localctx.instr = instruction.NewDeclaration_Vector((((Vector_declContext)_localctx).ID!=null?((Vector_declContext)_localctx).ID.getText():null), 4, ((Vector_declContext)_localctx).ea.p, "" ,false, (((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getLine():0),(((Vector_declContext)_localctx).LET!=null?((Vector_declContext)_localctx).LET.getCharPositionInLine():0)) 
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				((Vector_declContext)_localctx).LET = match(LET);
				setState(654);
				((Vector_declContext)_localctx).id1 = match(ID);
				setState(655);
				match(DPTS);
				setState(656);
				match(VEC);
				setState(657);
				match(MENOR);
				setState(658);
				((Vector_declContext)_localctx).id2 = match(ID);
				setState(659);
				match(MAYOR);
				setState(660);
				match(IGUAL);
				setState(661);
				((Vector_declContext)_localctx).ea = vector_expr();
				setState(662);
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
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(VEC);
				setState(668);
				match(EXCLA);
				setState(669);
				((Vector_exprContext)_localctx).CORCHA = match(CORCHA);
				setState(670);
				((Vector_exprContext)_localctx).list_expre_vec_arr = list_expre_vec_arr(0);
				setState(671);
				match(CORCHC);
				 
				        var a,b,c interfaces.Expresion
				        _localctx.p = vector.NewVector( ((Vector_exprContext)_localctx).list_expre_vec_arr.l, a , b , false,c,(((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getLine():0), (((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getCharPositionInLine():0)  ) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(VEC);
				setState(675);
				match(EXCLA);
				setState(676);
				((Vector_exprContext)_localctx).CORCHA = match(CORCHA);
				setState(677);
				((Vector_exprContext)_localctx).exp1 = expression_vec_Arr(0);
				setState(678);
				match(PYC);
				setState(679);
				((Vector_exprContext)_localctx).exp2 = expression_vec_Arr(0);
				setState(680);
				match(CORCHC);
				 
				        var a interfaces.Expresion
				        _localctx.p = vector.NewVector( arrayList.New(), ((Vector_exprContext)_localctx).exp1.p, ((Vector_exprContext)_localctx).exp2.p ,false, a ,(((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getLine():0), (((Vector_exprContext)_localctx).CORCHA!=null?((Vector_exprContext)_localctx).CORCHA.getCharPositionInLine():0)) 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				match(VEC);
				setState(684);
				match(DPTS);
				setState(685);
				match(DPTS);
				setState(686);
				((Vector_exprContext)_localctx).NEWI = match(NEWI);
				setState(687);
				match(PARA);
				setState(688);
				match(PARC);
				 
				        var a,b,c interfaces.Expresion
				        _localctx.p =  vector.NewVector(arrayList.New(),a,b,true,c,(((Vector_exprContext)_localctx).NEWI!=null?((Vector_exprContext)_localctx).NEWI.getLine():0),(((Vector_exprContext)_localctx).NEWI!=null?((Vector_exprContext)_localctx).NEWI.getCharPositionInLine():0)) 
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				match(VEC);
				setState(691);
				match(EXCLA);
				setState(692);
				match(DPTS);
				setState(693);
				match(DPTS);
				setState(694);
				((Vector_exprContext)_localctx).WITH_CAP = match(WITH_CAP);
				setState(695);
				match(PARA);
				setState(696);
				((Vector_exprContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(697);
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
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				((Sent_funciones_VecContext)_localctx).ID = match(ID);
				setState(703);
				match(PNT);
				setState(704);
				((Sent_funciones_VecContext)_localctx).PUSH = match(PUSH);
				setState(705);
				match(PARA);
				setState(706);
				((Sent_funciones_VecContext)_localctx).expression = expression(0);
				setState(707);
				match(PARC);
				setState(708);
				match(PYC);
				 _localctx.instr = funcionesvectores.NewPush((((Sent_funciones_VecContext)_localctx).ID!=null?((Sent_funciones_VecContext)_localctx).ID.getText():null), ((Sent_funciones_VecContext)_localctx).expression.p, (((Sent_funciones_VecContext)_localctx).PUSH!=null?((Sent_funciones_VecContext)_localctx).PUSH.getLine():0), (((Sent_funciones_VecContext)_localctx).PUSH!=null?((Sent_funciones_VecContext)_localctx).PUSH.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				((Sent_funciones_VecContext)_localctx).ID = match(ID);
				setState(712);
				match(PNT);
				setState(713);
				((Sent_funciones_VecContext)_localctx).INSERT = match(INSERT);
				setState(714);
				match(PARA);
				setState(715);
				((Sent_funciones_VecContext)_localctx).exp1 = expression(0);
				setState(716);
				match(COMA);
				setState(717);
				((Sent_funciones_VecContext)_localctx).exp2 = expression(0);
				setState(718);
				match(PARC);
				setState(719);
				match(PYC);
				 
				        _localctx.instr = funcionesvectores.NewInsert((((Sent_funciones_VecContext)_localctx).ID!=null?((Sent_funciones_VecContext)_localctx).ID.getText():null), ((Sent_funciones_VecContext)_localctx).exp1.p, ((Sent_funciones_VecContext)_localctx).exp2.p, (((Sent_funciones_VecContext)_localctx).INSERT!=null?((Sent_funciones_VecContext)_localctx).INSERT.getLine():0), (((Sent_funciones_VecContext)_localctx).INSERT!=null?((Sent_funciones_VecContext)_localctx).INSERT.getCharPositionInLine():0)) 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				((Sent_funciones_VecContext)_localctx).ID = match(ID);
				setState(723);
				match(PNT);
				setState(724);
				((Sent_funciones_VecContext)_localctx).REMOVE = match(REMOVE);
				setState(725);
				match(PARA);
				setState(726);
				((Sent_funciones_VecContext)_localctx).expression = expression(0);
				setState(727);
				match(PARC);
				setState(728);
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
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				((Sentencias_exprContext)_localctx).sent_if_expr = sent_if_expr();
				setState(734);
				match(PYC);
				 _localctx.p = ((Sentencias_exprContext)_localctx).sent_if_expr.p 
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				((Sentencias_exprContext)_localctx).sent_loop_expr = sent_loop_expr();
				 _localctx.p = ((Sentencias_exprContext)_localctx).sent_loop_expr.p 
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
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
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				((Sent_matchexprContext)_localctx).MATCH = match(MATCH);
				setState(746);
				((Sent_matchexprContext)_localctx).expression = expression(0);
				setState(747);
				match(LLAVEA);
				setState(748);
				((Sent_matchexprContext)_localctx).matchexpr_listbrazos = matchexpr_listbrazos(0);
				setState(749);
				((Sent_matchexprContext)_localctx).el_defaultexpr = el_defaultexpr();
				setState(750);
				match(LLAVEC);
				 
				        _localctx.p = matchexpr.NewMatch_Expr(((Sent_matchexprContext)_localctx).expression.p, ((Sent_matchexprContext)_localctx).matchexpr_listbrazos.l, ((Sent_matchexprContext)_localctx).el_defaultexpr.p, (((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getLine():0),(((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getCharPositionInLine():0)) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				((Sent_matchexprContext)_localctx).MATCH = match(MATCH);
				setState(754);
				((Sent_matchexprContext)_localctx).expression = expression(0);
				setState(755);
				match(LLAVEA);
				setState(756);
				((Sent_matchexprContext)_localctx).matchexpr_listbrazos = matchexpr_listbrazos(0);
				setState(757);
				match(LLAVEC);

				        var a interfaces.Expresion
				        _localctx.p = matchexpr.NewMatch_Expr(((Sent_matchexprContext)_localctx).expression.p, ((Sent_matchexprContext)_localctx).matchexpr_listbrazos.l, a, (((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getLine():0),(((Sent_matchexprContext)_localctx).MATCH!=null?((Sent_matchexprContext)_localctx).MATCH.getCharPositionInLine():0))
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				((Sent_matchexprContext)_localctx).MATCH = match(MATCH);
				setState(761);
				((Sent_matchexprContext)_localctx).expression = expression(0);
				setState(762);
				match(LLAVEA);
				setState(763);
				((Sent_matchexprContext)_localctx).el_defaultexpr = el_defaultexpr();
				setState(764);
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
			setState(770);
			((Matchexpr_listbrazosContext)_localctx).list_brazosexpr = list_brazosexpr();

			        a := arrayList.New()
			        a.Add(((Matchexpr_listbrazosContext)_localctx).list_brazosexpr.p)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(779);
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
					setState(773);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(774);
					((Matchexpr_listbrazosContext)_localctx).list_brazosexpr = list_brazosexpr();

					                  ((Matchexpr_listbrazosContext)_localctx).brz.l.Add(((Matchexpr_listbrazosContext)_localctx).list_brazosexpr.p)
					                  _localctx.l = ((Matchexpr_listbrazosContext)_localctx).brz.l
					              
					}
					} 
				}
				setState(781);
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
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				((List_brazosexprContext)_localctx).po = expression(0);
				setState(783);
				((List_brazosexprContext)_localctx).IGUAL = match(IGUAL);
				setState(784);
				match(MAYOR);
				setState(785);
				((List_brazosexprContext)_localctx).pi = expression(0);
				setState(786);
				match(COMA);
				 
				        a := arrayList.New()
				        a.Add(((List_brazosexprContext)_localctx).po.p)
				        _localctx.p = matchexpr.NewBrazo_expr(a, ((List_brazosexprContext)_localctx).pi.p, (((List_brazosexprContext)_localctx).IGUAL!=null?((List_brazosexprContext)_localctx).IGUAL.getLine():0) , (((List_brazosexprContext)_localctx).IGUAL!=null?((List_brazosexprContext)_localctx).IGUAL.getCharPositionInLine():0))
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				((List_brazosexprContext)_localctx).exp = matchexpr_listbrazosexpr_listexpr();
				setState(790);
				((List_brazosexprContext)_localctx).IGUAL = match(IGUAL);
				setState(791);
				match(MAYOR);
				setState(792);
				((List_brazosexprContext)_localctx).expression = expression(0);
				setState(793);
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
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				((Matchexpr_listbrazosexpr_listexprContext)_localctx).g = match_listbrazos_listexpr(0);
				setState(799);
				match(OR_MATCH);
				setState(800);
				((Matchexpr_listbrazosexpr_listexprContext)_localctx).expression = expression(0);

				        ((Matchexpr_listbrazosexpr_listexprContext)_localctx).g.l.Add(((Matchexpr_listbrazosexpr_listexprContext)_localctx).expression.p)
				        _localctx.l = ((Matchexpr_listbrazosexpr_listexprContext)_localctx).g.l
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
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
			setState(808);
			((El_defaultexprContext)_localctx).DEFAUL = match(DEFAUL);
			setState(809);
			match(IGUAL);
			setState(810);
			match(MAYOR);
			setState(811);
			((El_defaultexprContext)_localctx).expression = expression(0);
			setState(812);
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
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(INT);
				 _localctx.te = 0 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(FLOAT);
				 _localctx.te = 1 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(819);
				match(STR);
				 _localctx.te = 2 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(BOOLEAN);
				 _localctx.te = 3
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				match(CHAR);
				 _localctx.te = 7 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(825);
				match(STRING);
				 _localctx.te = 8 
				}
				break;
			case USIZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(827);
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
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				((AsignacionContext)_localctx).ID = match(ID);
				setState(832);
				match(IGUAL);
				setState(833);
				((AsignacionContext)_localctx).expression = expression(0);
				setState(834);
				match(PYC);
				 _localctx.instr = instruction.NewAsignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expression.p, "" ,(((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getLine():0), (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				((AsignacionContext)_localctx).id1 = match(ID);
				setState(838);
				match(PNT);
				setState(839);
				((AsignacionContext)_localctx).id2 = match(ID);
				setState(840);
				match(IGUAL);
				setState(841);
				((AsignacionContext)_localctx).expression = expression(0);
				setState(842);
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
		public Sent_instru_if_expreContext instru;
		public Sent_instru_if_expreContext instru2;
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Sent_instru_if_expreContext> sent_instru_if_expre() {
			return getRuleContexts(Sent_instru_if_expreContext.class);
		}
		public Sent_instru_if_expreContext sent_instru_if_expre(int i) {
			return getRuleContext(Sent_instru_if_expreContext.class,i);
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
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				((Sent_if_exprContext)_localctx).IF = match(IF);
				setState(848);
				((Sent_if_exprContext)_localctx).ini = expression(0);
				setState(849);
				match(LLAVEA);
				setState(850);
				((Sent_if_exprContext)_localctx).instru = sent_instru_if_expre();
				setState(851);
				match(LLAVEC);
				 
				        b := arrayList.New()
				        _localctx.p = sentenciasexpr.NewIf_expr(((Sent_if_exprContext)_localctx).ini.p, ((Sent_if_exprContext)_localctx).instru.l,b, (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getLine():0), (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getCharPositionInLine():0)   ) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				((Sent_if_exprContext)_localctx).IF = match(IF);
				setState(855);
				((Sent_if_exprContext)_localctx).ini = expression(0);
				setState(856);
				match(LLAVEA);
				setState(857);
				((Sent_if_exprContext)_localctx).instru = sent_instru_if_expre();
				setState(858);
				match(LLAVEC);
				setState(859);
				match(ELSE);
				setState(860);
				match(LLAVEA);
				setState(861);
				((Sent_if_exprContext)_localctx).instru2 = sent_instru_if_expre();
				setState(862);
				match(LLAVEC);
				 
				        _localctx.p = sentenciasexpr.NewIf_expr(((Sent_if_exprContext)_localctx).ini.p, ((Sent_if_exprContext)_localctx).instru.l, ((Sent_if_exprContext)_localctx).instru2.l , (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getLine():0), (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getCharPositionInLine():0) ) 
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(865);
				((Sent_if_exprContext)_localctx).IF = match(IF);
				setState(866);
				((Sent_if_exprContext)_localctx).ini = expression(0);
				setState(867);
				match(LLAVEA);
				setState(868);
				((Sent_if_exprContext)_localctx).instru = sent_instru_if_expre();
				setState(869);
				match(LLAVEC);
				setState(870);
				match(ELSE);
				setState(871);
				((Sent_if_exprContext)_localctx).sent = sent_if_expr();
				 
				        a := arrayList.New()
				        a.Add(((Sent_if_exprContext)_localctx).sent.p)
				        _localctx.p = sentenciasexpr.NewIf_expr(((Sent_if_exprContext)_localctx).ini.p,((Sent_if_exprContext)_localctx).instru.l,a, (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getLine():0), (((Sent_if_exprContext)_localctx).IF!=null?((Sent_if_exprContext)_localctx).IF.getCharPositionInLine():0)   )  
				        
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

	public static class Sent_instru_if_expreContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionesContext in;
		public ExpressionContext ex;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Sent_instru_if_expreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_instru_if_expre; }
	}

	public final Sent_instru_if_expreContext sent_instru_if_expre() throws RecognitionException {
		Sent_instru_if_expreContext _localctx = new Sent_instru_if_expreContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sent_instru_if_expre);
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				((Sent_instru_if_expreContext)_localctx).in = instrucciones();
				setState(877);
				((Sent_instru_if_expreContext)_localctx).ex = expression(0);
				 
				        ((Sent_instru_if_expreContext)_localctx).in.l.Add(((Sent_instru_if_expreContext)_localctx).ex.p)
				        _localctx.l = ((Sent_instru_if_expreContext)_localctx).in.l
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				((Sent_instru_if_expreContext)_localctx).ex = expression(0);

				        a := arrayList.New()
				        a.Add(((Sent_instru_if_expreContext)_localctx).ex.p)
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
		enterRule(_localctx, 62, RULE_sent_loop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			((Sent_loop_exprContext)_localctx).LOOP = match(LOOP);
			setState(886);
			match(LLAVEA);
			setState(887);
			((Sent_loop_exprContext)_localctx).instrucciones = instrucciones();
			setState(888);
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
		enterRule(_localctx, 64, RULE_printaso);
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				((PrintasoContext)_localctx).PRINT = match(PRINT);
				setState(892);
				match(EXCLA);
				setState(893);
				match(PARA);
				setState(894);
				((PrintasoContext)_localctx).expression = expression(0);
				setState(895);
				match(PARC);
				 
				         a := arrayList.New()
				        _localctx.instr = instruction.NewImprimir(((PrintasoContext)_localctx).expression.p, a, (((PrintasoContext)_localctx).PRINT!=null?((PrintasoContext)_localctx).PRINT.getLine():0), (((PrintasoContext)_localctx).PRINT!=null?((PrintasoContext)_localctx).PRINT.getCharPositionInLine():0)) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				((PrintasoContext)_localctx).PRINT = match(PRINT);
				setState(899);
				match(EXCLA);
				setState(900);
				match(PARA);
				setState(901);
				((PrintasoContext)_localctx).expression = expression(0);
				setState(902);
				match(COMA);
				setState(903);
				((PrintasoContext)_localctx).li = list_expre_print(0);
				setState(904);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_list_expre_print, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(910);
			((List_expre_printContext)_localctx).expression = expression(0);

			        a := arrayList.New()
			        a.Add(((List_expre_printContext)_localctx).expression.p)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
					setState(913);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(914);
					match(COMA);
					setState(915);
					((List_expre_printContext)_localctx).expression = expression(0);
					 
					                  ((List_expre_printContext)_localctx).li.l.Add(((List_expre_printContext)_localctx).expression.p)  
					                  _localctx.l = ((List_expre_printContext)_localctx).li.l
					                  
					}
					} 
				}
				setState(922);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_list_expre_vec_arr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(924);
			((List_expre_vec_arrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);

			        a := arrayList.New()
			        a.Add(((List_expre_vec_arrContext)_localctx).expression_vec_Arr.p)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
					setState(927);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(928);
					match(COMA);
					setState(929);
					((List_expre_vec_arrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
					 
					                  ((List_expre_vec_arrContext)_localctx).li.l.Add(((List_expre_vec_arrContext)_localctx).expression_vec_Arr.p)  
					                  _localctx.l = ((List_expre_vec_arrContext)_localctx).li.l
					                  
					}
					} 
				}
				setState(936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 70, RULE_sent_if);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				((Sent_ifContext)_localctx).IF = match(IF);
				setState(938);
				((Sent_ifContext)_localctx).expression = expression(0);
				setState(939);
				match(LLAVEA);
				setState(940);
				((Sent_ifContext)_localctx).instrucciones = instrucciones();
				setState(941);
				match(LLAVEC);
				 _localctx.instr = sentenciacontrol.NewIf(((Sent_ifContext)_localctx).expression.p, ((Sent_ifContext)_localctx).instrucciones.l, arrayList.New(), (((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getLine():0),(((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(LLAVEA);
				setState(951);
				((Sent_ifContext)_localctx).ins2 = instrucciones();
				setState(952);
				match(LLAVEC);
				 _localctx.instr = sentenciacontrol.NewIf(((Sent_ifContext)_localctx).expression.p, ((Sent_ifContext)_localctx).ins1.l, ((Sent_ifContext)_localctx).ins2.l, (((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getLine():0),(((Sent_ifContext)_localctx).IF!=null?((Sent_ifContext)_localctx).IF.getCharPositionInLine():0)) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				((Sent_ifContext)_localctx).IF = match(IF);
				setState(956);
				((Sent_ifContext)_localctx).expression = expression(0);
				setState(957);
				match(LLAVEA);
				setState(958);
				((Sent_ifContext)_localctx).ins1 = instrucciones();
				setState(959);
				match(LLAVEC);
				setState(960);
				match(ELSE);
				setState(961);
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
		enterRule(_localctx, 72, RULE_sent_match);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				((Sent_matchContext)_localctx).MATCH = match(MATCH);
				setState(967);
				((Sent_matchContext)_localctx).expression = expression(0);
				setState(968);
				match(LLAVEA);
				setState(969);
				((Sent_matchContext)_localctx).match_listbrazos = match_listbrazos(0);
				setState(970);
				((Sent_matchContext)_localctx).el_default = el_default();
				setState(971);
				match(LLAVEC);
				 _localctx.instr = match.NewMatch(((Sent_matchContext)_localctx).expression.p, ((Sent_matchContext)_localctx).match_listbrazos.l, ((Sent_matchContext)_localctx).el_default.instr, (((Sent_matchContext)_localctx).MATCH!=null?((Sent_matchContext)_localctx).MATCH.getLine():0), (((Sent_matchContext)_localctx).MATCH!=null?((Sent_matchContext)_localctx).MATCH.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				((Sent_matchContext)_localctx).MATCH = match(MATCH);
				setState(975);
				((Sent_matchContext)_localctx).expression = expression(0);
				setState(976);
				match(LLAVEA);
				setState(977);
				((Sent_matchContext)_localctx).el_default = el_default();
				setState(978);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_match_listbrazos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(984);
			((Match_listbrazosContext)_localctx).list_brazos = list_brazos();

			        a := arrayList.New()
			        a.Add(((Match_listbrazosContext)_localctx).list_brazos.instr)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					setState(987);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(988);
					((Match_listbrazosContext)_localctx).list_brazos = list_brazos();
					 
					              ((Match_listbrazosContext)_localctx).braz.l.Add(((Match_listbrazosContext)_localctx).list_brazos.instr)
					               _localctx.l = ((Match_listbrazosContext)_localctx).braz.l
					               
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 76, RULE_list_brazos);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				((List_brazosContext)_localctx).expression = expression(0);
				setState(997);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(998);
				match(MAYOR);
				setState(999);
				match(LLAVEA);
				setState(1000);
				((List_brazosContext)_localctx).instrucciones = instrucciones();
				setState(1001);
				match(LLAVEC);
				 
				        a := arrayList.New()
				        a.Add(((List_brazosContext)_localctx).expression.p)
				        _localctx.instr = match.NewBrazo(a, ((List_brazosContext)_localctx).instrucciones.l, (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getLine():0), (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getCharPositionInLine():0)) 
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				((List_brazosContext)_localctx).exprs = match_listbrazos_listexpr(0);
				setState(1005);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(1006);
				match(MAYOR);
				setState(1007);
				match(LLAVEA);
				setState(1008);
				((List_brazosContext)_localctx).instrucciones = instrucciones();
				setState(1009);
				match(LLAVEC);
				 _localctx.instr = match.NewBrazo(((List_brazosContext)_localctx).exprs.l, ((List_brazosContext)_localctx).instrucciones.l, (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getLine():0), (((List_brazosContext)_localctx).IGUAL!=null?((List_brazosContext)_localctx).IGUAL.getCharPositionInLine():0))  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				((List_brazosContext)_localctx).expression = expression(0);
				setState(1013);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(1014);
				match(MAYOR);
				setState(1015);
				((List_brazosContext)_localctx).instruccion = instruccion();
				setState(1016);
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
				setState(1019);
				((List_brazosContext)_localctx).exprs = match_listbrazos_listexpr(0);
				setState(1020);
				((List_brazosContext)_localctx).IGUAL = match(IGUAL);
				setState(1021);
				match(MAYOR);
				setState(1022);
				((List_brazosContext)_localctx).instruccion = instruccion();
				setState(1023);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_match_listbrazos_listexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1029);
			((Match_listbrazos_listexprContext)_localctx).expression = expression(0);

			        a := arrayList.New()
			        a.Add(((Match_listbrazos_listexprContext)_localctx).expression.p)
			        _localctx.l = a
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(1039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
					setState(1032);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1033);
					match(OR_MATCH);
					setState(1034);
					((Match_listbrazos_listexprContext)_localctx).expression = expression(0);
					 
					                  ((Match_listbrazos_listexprContext)_localctx).h.l.Add(((Match_listbrazos_listexprContext)_localctx).expression.p)
					                  _localctx.l = ((Match_listbrazos_listexprContext)_localctx).h.l
					               
					}
					} 
				}
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 80, RULE_el_default);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				((El_defaultContext)_localctx).DEFAUL = match(DEFAUL);
				setState(1043);
				match(IGUAL);
				setState(1044);
				match(MAYOR);
				setState(1045);
				match(LLAVEA);
				setState(1046);
				((El_defaultContext)_localctx).instrucciones = instrucciones();
				setState(1047);
				match(LLAVEC);
				 _localctx.instr = match.NewDefault(((El_defaultContext)_localctx).instrucciones.l , (((El_defaultContext)_localctx).DEFAUL!=null?((El_defaultContext)_localctx).DEFAUL.getLine():0), (((El_defaultContext)_localctx).DEFAUL!=null?((El_defaultContext)_localctx).DEFAUL.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				((El_defaultContext)_localctx).DEFAUL = match(DEFAUL);
				setState(1051);
				match(IGUAL);
				setState(1052);
				match(MAYOR);
				setState(1053);
				((El_defaultContext)_localctx).instruccion = instruccion();
				setState(1054);
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
		enterRule(_localctx, 82, RULE_sent_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			((Sent_loopContext)_localctx).LOOP = match(LOOP);
			setState(1060);
			match(LLAVEA);
			setState(1061);
			((Sent_loopContext)_localctx).instrucciones = instrucciones();
			setState(1062);
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
		enterRule(_localctx, 84, RULE_sent_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			((Sent_whileContext)_localctx).WHILE = match(WHILE);
			setState(1066);
			((Sent_whileContext)_localctx).expression = expression(0);
			setState(1067);
			match(LLAVEA);
			setState(1068);
			((Sent_whileContext)_localctx).instrucciones = instrucciones();
			setState(1069);
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
		enterRule(_localctx, 86, RULE_sent_ForIn);
		try {
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(FOR);
				setState(1073);
				((Sent_ForInContext)_localctx).ID = match(ID);
				setState(1074);
				((Sent_ForInContext)_localctx).IN = match(IN);
				setState(1075);
				((Sent_ForInContext)_localctx).exp1 = expression(0);
				setState(1076);
				match(PNT);
				setState(1077);
				match(PNT);
				setState(1078);
				((Sent_ForInContext)_localctx).exp2 = expression(0);
				setState(1079);
				match(LLAVEA);
				setState(1080);
				((Sent_ForInContext)_localctx).instrucciones = instrucciones();
				setState(1081);
				match(LLAVEC);

				        var a interfaces.Expresion
				        _localctx.instr = sentenciaciclica.NewForIn( (((Sent_ForInContext)_localctx).ID!=null?((Sent_ForInContext)_localctx).ID.getText():null), ((Sent_ForInContext)_localctx).exp1.p, ((Sent_ForInContext)_localctx).exp2.p,a, ((Sent_ForInContext)_localctx).instrucciones.l, (((Sent_ForInContext)_localctx).IN!=null?((Sent_ForInContext)_localctx).IN.getLine():0), (((Sent_ForInContext)_localctx).IN!=null?((Sent_ForInContext)_localctx).IN.getCharPositionInLine():0) )
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(FOR);
				setState(1085);
				((Sent_ForInContext)_localctx).ID = match(ID);
				setState(1086);
				((Sent_ForInContext)_localctx).IN = match(IN);
				setState(1087);
				((Sent_ForInContext)_localctx).exp = expression_vec_Arr(0);
				setState(1088);
				match(LLAVEA);
				setState(1089);
				((Sent_ForInContext)_localctx).instrucciones = instrucciones();
				setState(1090);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression_vec_Arr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(1096);
				((Expression_vec_ArrContext)_localctx).INT = match(INT);
				setState(1097);
				match(DPTS);
				setState(1098);
				match(DPTS);
				setState(1099);
				((Expression_vec_ArrContext)_localctx).op = match(POW);
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
				_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).INT!=null?((Expression_vec_ArrContext)_localctx).INT.getLine():0),(((Expression_vec_ArrContext)_localctx).INT!=null?((Expression_vec_ArrContext)_localctx).INT.getCharPositionInLine():0))
				}
				break;
			case 2:
				{
				setState(1107);
				((Expression_vec_ArrContext)_localctx).FLOAT = match(FLOAT);
				setState(1108);
				match(DPTS);
				setState(1109);
				match(DPTS);
				setState(1110);
				((Expression_vec_ArrContext)_localctx).op = match(POWF);
				setState(1111);
				match(PARA);
				setState(1112);
				((Expression_vec_ArrContext)_localctx).opIz = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1113);
				match(COMA);
				setState(1114);
				((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1115);
				match(PARC);
				_localctx.p=Operacion.NewOperacion_Arit(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).FLOAT!=null?((Expression_vec_ArrContext)_localctx).FLOAT.getLine():0),(((Expression_vec_ArrContext)_localctx).FLOAT!=null?((Expression_vec_ArrContext)_localctx).FLOAT.getCharPositionInLine():0))
				}
				break;
			case 3:
				{
				setState(1118);
				match(PARA);
				setState(1119);
				((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1120);
				match(PARC);
				 _localctx.p = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr.p
				}
				break;
			case 4:
				{
				setState(1123);
				((Expression_vec_ArrContext)_localctx).op = match(EXCLA);
				setState(1124);
				((Expression_vec_ArrContext)_localctx).operador = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(6);
				_localctx.p = Operacion.NewOperacion_Logica(((Expression_vec_ArrContext)_localctx).operador.p,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getText():null),nil,true,(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getLine():0),(((Expression_vec_ArrContext)_localctx).op!=null?((Expression_vec_ArrContext)_localctx).op.getCharPositionInLine():0))
				}
				break;
			case 5:
				{
				setState(1127);
				((Expression_vec_ArrContext)_localctx).CORCHA = match(CORCHA);
				setState(1128);
				((Expression_vec_ArrContext)_localctx).list_expre_vec_arr = list_expre_vec_arr(0);
				setState(1129);
				match(CORCHC);
				 
				        var a interfaces.Expresion
				        var b interfaces.Expresion
				        _localctx.p = arrays.NewArray( ((Expression_vec_ArrContext)_localctx).list_expre_vec_arr.l, a , b , (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getLine():0), (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getCharPositionInLine():0)  ) 
				        
				}
				break;
			case 6:
				{
				setState(1132);
				((Expression_vec_ArrContext)_localctx).CORCHA = match(CORCHA);
				setState(1133);
				((Expression_vec_ArrContext)_localctx).exp1 = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1134);
				match(PYC);
				setState(1135);
				((Expression_vec_ArrContext)_localctx).exp2 = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(0);
				setState(1136);
				match(CORCHC);
				 _localctx.p = arrays.NewArray( arrayList.New(), ((Expression_vec_ArrContext)_localctx).exp1.p, ((Expression_vec_ArrContext)_localctx).exp2.p , (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getLine():0), (((Expression_vec_ArrContext)_localctx).CORCHA!=null?((Expression_vec_ArrContext)_localctx).CORCHA.getCharPositionInLine():0)) 
				}
				break;
			case 7:
				{
				setState(1139);
				((Expression_vec_ArrContext)_localctx).exp4 = expression(0);
				setState(1140);
				match(PNT);
				setState(1141);
				((Expression_vec_ArrContext)_localctx).TOCHARS = match(TOCHARS);
				setState(1142);
				match(PARA);
				setState(1143);
				match(PARC);
				 _localctx.p = funcionesnativas.NewToChar(((Expression_vec_ArrContext)_localctx).exp4.p, (((Expression_vec_ArrContext)_localctx).TOCHARS!=null?((Expression_vec_ArrContext)_localctx).TOCHARS.getLine():0), (((Expression_vec_ArrContext)_localctx).TOCHARS!=null?((Expression_vec_ArrContext)_localctx).TOCHARS.getCharPositionInLine():0)) 
				}
				break;
			case 8:
				{
				setState(1146);
				((Expression_vec_ArrContext)_localctx).vector_expr = vector_expr();
				 _localctx.p = ((Expression_vec_ArrContext)_localctx).vector_expr.p 
				}
				break;
			case 9:
				{
				setState(1149);
				((Expression_vec_ArrContext)_localctx).primitivo = primitivo();
				 _localctx.p = ((Expression_vec_ArrContext)_localctx).primitivo.p 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_vec_ArrContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression_vec_Arr);
						setState(1154);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1155);
						((Expression_vec_ArrContext)_localctx).op = match(MODUL);
						setState(1156);
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
						setState(1159);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1160);
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
						setState(1161);
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
						setState(1164);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1165);
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
						setState(1166);
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
						setState(1169);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1170);
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
						setState(1171);
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
						setState(1174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1175);
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
						setState(1176);
						((Expression_vec_ArrContext)_localctx).opDe = ((Expression_vec_ArrContext)_localctx).expression_vec_Arr = expression_vec_Arr(8);
						_localctx.p = Operacion.NewOperacion_Logica(((Expression_vec_ArrContext)_localctx).opIz.p,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getText():null),((Expression_vec_ArrContext)_localctx).opDe.p,false,(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getLine():0),(((Expression_vec_ArrContext)_localctx).ope!=null?((Expression_vec_ArrContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					}
					} 
				}
				setState(1183);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_atributos_struct_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1185);
			((Atributos_struct_expContext)_localctx).atributos_struct_decl_exp = atributos_struct_decl_exp();

			        a := arrayList.New()
			        a.Add(((Atributos_struct_expContext)_localctx).atributos_struct_decl_exp.s)
			        _localctx.l = a
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(1195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
					setState(1188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1189);
					match(COMA);
					setState(1190);
					((Atributos_struct_expContext)_localctx).asd = ((Atributos_struct_expContext)_localctx).atributos_struct_decl_exp = atributos_struct_decl_exp();

					                  ((Atributos_struct_expContext)_localctx).li.l.Add(((Atributos_struct_expContext)_localctx).asd.s)
					                  _localctx.l = ((Atributos_struct_expContext)_localctx).li.l
					              
					}
					} 
				}
				setState(1197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 92, RULE_atributos_struct_decl_exp);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				((Atributos_struct_decl_expContext)_localctx).ID = match(ID);
				setState(1199);
				match(DPTS);
				setState(1200);
				((Atributos_struct_decl_expContext)_localctx).exp2 = expression(0);
				_localctx.s = interfaces.Symbol{ Id: (((Atributos_struct_decl_expContext)_localctx).ID!=null?((Atributos_struct_decl_expContext)_localctx).ID.getText():null), Valor: ((Atributos_struct_decl_expContext)_localctx).exp2.p } 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				((Atributos_struct_decl_expContext)_localctx).ID = match(ID);
				setState(1204);
				match(DPTS);
				setState(1205);
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
		public ExpressionContext exp4;
		public ExpressionContext exp8;
		public ExpressionContext opIz;
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
		public Token TOSTRING;
		public Token LEN;
		public Token CONTAINS;
		public Token TOCHARS;
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
		public TerminalNode TOSTRING() { return getToken(Interprete.TOSTRING, 0); }
		public TerminalNode LEN() { return getToken(Interprete.LEN, 0); }
		public TerminalNode CONTAINS() { return getToken(Interprete.CONTAINS, 0); }
		public TerminalNode PUNTERO() { return getToken(Interprete.PUNTERO, 0); }
		public TerminalNode TOCHARS() { return getToken(Interprete.TOCHARS, 0); }
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(1211);
				((ExpressionContext)_localctx).INT = match(INT);
				setState(1212);
				match(DPTS);
				setState(1213);
				match(DPTS);
				setState(1214);
				((ExpressionContext)_localctx).op = match(POW);
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
				_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getLine():0),(((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getCharPositionInLine():0))
				}
				break;
			case 2:
				{
				setState(1222);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				setState(1223);
				match(DPTS);
				setState(1224);
				match(DPTS);
				setState(1225);
				((ExpressionContext)_localctx).op = match(POWF);
				setState(1226);
				match(PARA);
				setState(1227);
				((ExpressionContext)_localctx).opIz = ((ExpressionContext)_localctx).expression = expression(0);
				setState(1228);
				match(COMA);
				setState(1229);
				((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(0);
				setState(1230);
				match(PARC);
				_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getLine():0),(((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getCharPositionInLine():0))
				}
				break;
			case 3:
				{
				setState(1233);
				((ExpressionContext)_localctx).ope = match(REST);
				setState(1234);
				((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(18);
				_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opDe.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),nil,true,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
				}
				break;
			case 4:
				{
				setState(1237);
				match(PARA);
				setState(1238);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(1239);
				match(PARC);
				 _localctx.p = ((ExpressionContext)_localctx).expression.p
				}
				break;
			case 5:
				{
				setState(1242);
				match(PARA);
				setState(1243);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(1244);
				match(PARC);
				 _localctx.p = ((ExpressionContext)_localctx).expression.p
				}
				break;
			case 6:
				{
				setState(1247);
				((ExpressionContext)_localctx).op = match(EXCLA);
				setState(1248);
				((ExpressionContext)_localctx).operador = ((ExpressionContext)_localctx).expression = expression(13);
				_localctx.p = Operacion.NewOperacion_Logica(((ExpressionContext)_localctx).operador.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),nil,true,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0),(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getCharPositionInLine():0))
				}
				break;
			case 7:
				{
				setState(1251);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(1252);
				match(PNT);
				setState(1253);
				((ExpressionContext)_localctx).REMOVE = match(REMOVE);
				setState(1254);
				match(PARA);
				setState(1255);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(1256);
				match(PARC);
				 _localctx.p = funcionesvectores.NewRemove_exp((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expression.p, (((ExpressionContext)_localctx).REMOVE!=null?((ExpressionContext)_localctx).REMOVE.getLine():0), (((ExpressionContext)_localctx).REMOVE!=null?((ExpressionContext)_localctx).REMOVE.getCharPositionInLine():0)) 
				}
				break;
			case 8:
				{
				setState(1259);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(1260);
				((ExpressionContext)_localctx).LLAVEA = match(LLAVEA);
				setState(1261);
				((ExpressionContext)_localctx).li = atributos_struct_exp(0);
				setState(1262);
				match(LLAVEC);
				 _localctx.p = structs.NewStruct( (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).li.l, (((ExpressionContext)_localctx).LLAVEA!=null?((ExpressionContext)_localctx).LLAVEA.getLine():0), (((ExpressionContext)_localctx).LLAVEA!=null?((ExpressionContext)_localctx).LLAVEA.getCharPositionInLine():0) ) 
				}
				break;
			case 9:
				{
				setState(1265);
				((ExpressionContext)_localctx).llamadas_structs = llamadas_structs(0);
				 _localctx.p =  ((ExpressionContext)_localctx).llamadas_structs.p 
				}
				break;
			case 10:
				{
				setState(1268);
				((ExpressionContext)_localctx).llamada_expre = llamada_expre();
				 _localctx.p = ((ExpressionContext)_localctx).llamada_expre.p 
				}
				break;
			case 11:
				{
				setState(1271);
				((ExpressionContext)_localctx).primitivo = primitivo();
				 _localctx.p = ((ExpressionContext)_localctx).primitivo.p 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1276);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1277);
						((ExpressionContext)_localctx).op = match(MODUL);
						setState(1278);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(22);
						_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0),(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getCharPositionInLine():0))
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1281);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1282);
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
						setState(1283);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(21);
						_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1286);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1287);
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
						setState(1288);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(20);
						_localctx.p=Operacion.NewOperacion_Arit(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1291);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1292);
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
						setState(1293);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(17);
						_localctx.p = Operacion.NewOperacion_Relacional(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0),(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getCharPositionInLine():0))
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1296);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1297);
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
						setState(1298);
						((ExpressionContext)_localctx).opDe = ((ExpressionContext)_localctx).expression = expression(15);
						_localctx.p = Operacion.NewOperacion_Logica(((ExpressionContext)_localctx).opIz.p,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getText():null),((ExpressionContext)_localctx).opDe.p,false,(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getLine():0),(((ExpressionContext)_localctx).ope!=null?((ExpressionContext)_localctx).ope.getCharPositionInLine():0))
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp4 = _prevctx;
						_localctx.exp4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1301);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1302);
						match(PNT);
						setState(1303);
						((ExpressionContext)_localctx).TOSTRING = match(TOSTRING);
						setState(1304);
						match(PARA);
						setState(1305);
						match(PARC);
						 _localctx.p = funcionesnativas.NewToString(((ExpressionContext)_localctx).exp4.p, (((ExpressionContext)_localctx).TOSTRING!=null?((ExpressionContext)_localctx).TOSTRING.getLine():0), (((ExpressionContext)_localctx).TOSTRING!=null?((ExpressionContext)_localctx).TOSTRING.getCharPositionInLine():0)) 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp8 = _prevctx;
						_localctx.exp8 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1307);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1308);
						match(PNT);
						setState(1309);
						((ExpressionContext)_localctx).LEN = match(LEN);
						setState(1310);
						match(PARA);
						setState(1311);
						match(PARC);
						 _localctx.p = funcionesvectores.NewLen(((ExpressionContext)_localctx).exp8.p, (((ExpressionContext)_localctx).LEN!=null?((ExpressionContext)_localctx).LEN.getLine():0), (((ExpressionContext)_localctx).LEN!=null?((ExpressionContext)_localctx).LEN.getCharPositionInLine():0)) 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp8 = _prevctx;
						_localctx.exp8 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1313);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1314);
						match(PNT);
						setState(1315);
						((ExpressionContext)_localctx).CONTAINS = match(CONTAINS);
						setState(1316);
						match(PARA);
						setState(1317);
						match(PUNTERO);
						setState(1318);
						((ExpressionContext)_localctx).expression = expression(0);
						setState(1319);
						match(PARC);
						 _localctx.p = funcionesvectores.NewContains(((ExpressionContext)_localctx).exp8.p, ((ExpressionContext)_localctx).expression.p, (((ExpressionContext)_localctx).CONTAINS!=null?((ExpressionContext)_localctx).CONTAINS.getLine():0), (((ExpressionContext)_localctx).CONTAINS!=null?((ExpressionContext)_localctx).CONTAINS.getCharPositionInLine():0) ) 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp4 = _prevctx;
						_localctx.exp4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1322);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1323);
						match(PNT);
						setState(1324);
						((ExpressionContext)_localctx).TOCHARS = match(TOCHARS);
						setState(1325);
						match(PARA);
						setState(1326);
						match(PARC);
						 _localctx.p = funcionesnativas.NewToChar(((ExpressionContext)_localctx).exp4.p, (((ExpressionContext)_localctx).TOCHARS!=null?((ExpressionContext)_localctx).TOCHARS.getLine():0), (((ExpressionContext)_localctx).TOCHARS!=null?((ExpressionContext)_localctx).TOCHARS.getCharPositionInLine():0)) 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp4 = _prevctx;
						_localctx.exp4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1328);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1329);
						match(PNT);
						setState(1330);
						((ExpressionContext)_localctx).TOOWNED = match(TOOWNED);
						setState(1331);
						match(PARA);
						setState(1332);
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
						setState(1334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1335);
						((ExpressionContext)_localctx).CASTEO = match(CASTEO);
						setState(1336);
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
						setState(1339);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1340);
						match(PNT);
						setState(1341);
						((ExpressionContext)_localctx).ABOSLU = match(ABOSLU);
						setState(1342);
						match(PARA);
						setState(1343);
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
						setState(1345);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1346);
						match(PNT);
						setState(1347);
						match(RAIZITA);
						setState(1348);
						match(PARA);
						setState(1349);
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
						setState(1351);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1352);
						match(PNT);
						setState(1353);
						((ExpressionContext)_localctx).CLONATION = match(CLONATION);
						setState(1354);
						match(PARA);
						setState(1355);
						match(PARC);
						 _localctx.p = funcionesnativas.NewClone(((ExpressionContext)_localctx).exp9.p, (((ExpressionContext)_localctx).CLONATION!=null?((ExpressionContext)_localctx).CLONATION.getLine():0), (((ExpressionContext)_localctx).CLONATION!=null?((ExpressionContext)_localctx).CLONATION.getCharPositionInLine():0)) 
						}
						break;
					}
					} 
				}
				setState(1361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 96, RULE_llamada_expre);
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				((Llamada_expreContext)_localctx).ID = match(ID);
				setState(1363);
				((Llamada_expreContext)_localctx).PARA = match(PARA);
				setState(1364);
				match(PARC);
				 _localctx.p = instruction.NewLlamada((((Llamada_expreContext)_localctx).ID!=null?((Llamada_expreContext)_localctx).ID.getText():null), arrayList.New(), (((Llamada_expreContext)_localctx).PARA!=null?((Llamada_expreContext)_localctx).PARA.getLine():0), (((Llamada_expreContext)_localctx).PARA!=null?((Llamada_expreContext)_localctx).PARA.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				((Llamada_expreContext)_localctx).ID = match(ID);
				setState(1367);
				((Llamada_expreContext)_localctx).PARA = match(PARA);
				setState(1368);
				((Llamada_expreContext)_localctx).li = params_llamada(0);
				setState(1369);
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
		enterRule(_localctx, 98, RULE_primitivo);
		int _la;
		try {
			setState(1387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
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
				setState(1376);
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
				setState(1378);
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
				setState(1380);
				((PrimitivoContext)_localctx).CADENA = match(CADENA);
				 
				        str:= (((PrimitivoContext)_localctx).CADENA!=null?((PrimitivoContext)_localctx).CADENA.getText():null)[1:len((((PrimitivoContext)_localctx).CADENA!=null?((PrimitivoContext)_localctx).CADENA.getText():null))-1]
				        _localctx.p = expresion.NewPrimitivo(str, interfaces.STR)
				     
				}
				break;
			case CHAR_2:
				enterOuterAlt(_localctx, 5);
				{
				setState(1382);
				((PrimitivoContext)_localctx).CHAR_2 = match(CHAR_2);

				        str:= (((PrimitivoContext)_localctx).CHAR_2!=null?((PrimitivoContext)_localctx).CHAR_2.getText():null)[1:len((((PrimitivoContext)_localctx).CHAR_2!=null?((PrimitivoContext)_localctx).CHAR_2.getText():null))-1]
				        _localctx.p = expresion.NewPrimitivo(str, interfaces.CHAR)
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(1384);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_list_array, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1390);
			((List_arrayContext)_localctx).ID = match(ID);
			  _localctx.p = expresion.NewCallVariable((((List_arrayContext)_localctx).ID!=null?((List_arrayContext)_localctx).ID.getText():null),(((List_arrayContext)_localctx).ID!=null?((List_arrayContext)_localctx).ID.getLine():0),(((List_arrayContext)_localctx).ID!=null?((List_arrayContext)_localctx).ID.getCharPositionInLine():0)) 
			}
			_ctx.stop = _input.LT(-1);
			setState(1401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
					setState(1393);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1394);
					((List_arrayContext)_localctx).CORCHA = match(CORCHA);
					setState(1395);
					((List_arrayContext)_localctx).expression = expression(0);
					setState(1396);
					((List_arrayContext)_localctx).CORCHC = match(CORCHC);
					 _localctx.p = arrays.NewArrayAccess(((List_arrayContext)_localctx).li.p, ((List_arrayContext)_localctx).expression.p, (((List_arrayContext)_localctx).CORCHA!=null?((List_arrayContext)_localctx).CORCHA.getLine():0), (((List_arrayContext)_localctx).CORCHC!=null?((List_arrayContext)_localctx).CORCHC.getCharPositionInLine():0)) 
					}
					} 
				}
				setState(1403);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_llamadas_structs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1405);
			((Llamadas_structsContext)_localctx).ID = match(ID);
			  _localctx.p = expresion.NewCallVariable((((Llamadas_structsContext)_localctx).ID!=null?((Llamadas_structsContext)_localctx).ID.getText():null),(((Llamadas_structsContext)_localctx).ID!=null?((Llamadas_structsContext)_localctx).ID.getLine():0),(((Llamadas_structsContext)_localctx).ID!=null?((Llamadas_structsContext)_localctx).ID.getCharPositionInLine():0)) 
			}
			_ctx.stop = _input.LT(-1);
			setState(1414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
					setState(1408);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1409);
					((Llamadas_structsContext)_localctx).PNT = match(PNT);
					setState(1410);
					((Llamadas_structsContext)_localctx).id2 = match(ID);
					 _localctx.p = structs.NewStruct_Acces( ((Llamadas_structsContext)_localctx).li.p, (((Llamadas_structsContext)_localctx).id2!=null?((Llamadas_structsContext)_localctx).id2.getText():null), (((Llamadas_structsContext)_localctx).PNT!=null?((Llamadas_structsContext)_localctx).PNT.getLine():0), (((Llamadas_structsContext)_localctx).PNT!=null?((Llamadas_structsContext)_localctx).PNT.getCharPositionInLine():0) ) 
					}
					} 
				}
				setState(1416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		case 33:
			return list_expre_print_sempred((List_expre_printContext)_localctx, predIndex);
		case 34:
			return list_expre_vec_arr_sempred((List_expre_vec_arrContext)_localctx, predIndex);
		case 37:
			return match_listbrazos_sempred((Match_listbrazosContext)_localctx, predIndex);
		case 39:
			return match_listbrazos_listexpr_sempred((Match_listbrazos_listexprContext)_localctx, predIndex);
		case 44:
			return expression_vec_Arr_sempred((Expression_vec_ArrContext)_localctx, predIndex);
		case 45:
			return atributos_struct_exp_sempred((Atributos_struct_expContext)_localctx, predIndex);
		case 47:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return list_array_sempred((List_arrayContext)_localctx, predIndex);
		case 51:
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
			return precpred(_ctx, 21);
		case 17:
			return precpred(_ctx, 20);
		case 18:
			return precpred(_ctx, 19);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 14);
		case 21:
			return precpred(_ctx, 24);
		case 22:
			return precpred(_ctx, 22);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u058c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00aa"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00bb"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c5\n\6\f\6\16\6\u00c8\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00db\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00ed\n\t\f\t\16\t\u00f0\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0105\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0184\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u018f\n\f\f\f\16\f\u0192\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u01b9\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u01c7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u01d2\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u01e0\n\17\f\17\16\17\u01e3\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01fd\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0225\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0249\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0259\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u029c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02bf\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u02de\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02ea"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0302\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u030c\n\31\f\31\16\31\u030f\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u031f\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0329\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0340\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0350\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u036d\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0376\n \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u038e\n\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0399\n#\f#\16#\u039c\13#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\7$\u03a7\n$\f$\16$\u03aa\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03c7\n%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u03d8\n&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\7\'\u03e2\n\'\f\'\16\'\u03e5\13\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u0405\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0410\n)\f)\16)\u0413\13)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0424\n*\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\5-\u0448\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u0483\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\7.\u049e\n.\f.\16.\u04a1\13.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\7/\u04ac\n/\f/\16/\u04af\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u04bb\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u04fd\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u0550\n\61\f\61\16\61\u0553\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u055f\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u056e\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u057a\n\64\f\64\16\64\u057d\13\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0587\n\65\f\65\16\65\u058a\13\65"+
		"\3\65\2\20\n\20\26\34\60DFLPZ\\`fh\66\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\7\4\2\26\26\30"+
		"\30\4\2\27\27\31\31\3\2\35\"\3\2$%\3\2&\'\2\u05e8\2j\3\2\2\2\4p\3\2\2"+
		"\2\6\u00a9\3\2\2\2\b\u00ba\3\2\2\2\n\u00bc\3\2\2\2\f\u00da\3\2\2\2\16"+
		"\u00dc\3\2\2\2\20\u00e3\3\2\2\2\22\u0104\3\2\2\2\24\u0183\3\2\2\2\26\u0185"+
		"\3\2\2\2\30\u01b8\3\2\2\2\32\u01c6\3\2\2\2\34\u01d1\3\2\2\2\36\u01fc\3"+
		"\2\2\2 \u0224\3\2\2\2\"\u0248\3\2\2\2$\u0258\3\2\2\2&\u029b\3\2\2\2(\u02be"+
		"\3\2\2\2*\u02dd\3\2\2\2,\u02e9\3\2\2\2.\u0301\3\2\2\2\60\u0303\3\2\2\2"+
		"\62\u031e\3\2\2\2\64\u0328\3\2\2\2\66\u032a\3\2\2\28\u033f\3\2\2\2:\u034f"+
		"\3\2\2\2<\u036c\3\2\2\2>\u0375\3\2\2\2@\u0377\3\2\2\2B\u038d\3\2\2\2D"+
		"\u038f\3\2\2\2F\u039d\3\2\2\2H\u03c6\3\2\2\2J\u03d7\3\2\2\2L\u03d9\3\2"+
		"\2\2N\u0404\3\2\2\2P\u0406\3\2\2\2R\u0423\3\2\2\2T\u0425\3\2\2\2V\u042b"+
		"\3\2\2\2X\u0447\3\2\2\2Z\u0482\3\2\2\2\\\u04a2\3\2\2\2^\u04ba\3\2\2\2"+
		"`\u04fc\3\2\2\2b\u055e\3\2\2\2d\u056d\3\2\2\2f\u056f\3\2\2\2h\u057e\3"+
		"\2\2\2jk\5\4\3\2kl\b\2\1\2l\3\3\2\2\2mo\5\6\4\2nm\3\2\2\2or\3\2\2\2pn"+
		"\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\3\1\2t\5\3\2\2\2uv\5B\"\2v"+
		"w\7\17\2\2wx\b\4\1\2x\u00aa\3\2\2\2yz\5B\"\2z{\b\4\1\2{\u00aa\3\2\2\2"+
		"|}\5 \21\2}~\b\4\1\2~\u00aa\3\2\2\2\177\u0080\5&\24\2\u0080\u0081\b\4"+
		"\1\2\u0081\u00aa\3\2\2\2\u0082\u0083\5\"\22\2\u0083\u0084\b\4\1\2\u0084"+
		"\u00aa\3\2\2\2\u0085\u0086\5:\36\2\u0086\u0087\b\4\1\2\u0087\u00aa\3\2"+
		"\2\2\u0088\u0089\5H%\2\u0089\u008a\b\4\1\2\u008a\u00aa\3\2\2\2\u008b\u008c"+
		"\5T+\2\u008c\u008d\b\4\1\2\u008d\u00aa\3\2\2\2\u008e\u008f\5V,\2\u008f"+
		"\u0090\b\4\1\2\u0090\u00aa\3\2\2\2\u0091\u0092\5J&\2\u0092\u0093\b\4\1"+
		"\2\u0093\u00aa\3\2\2\2\u0094\u0095\5*\26\2\u0095\u0096\b\4\1\2\u0096\u00aa"+
		"\3\2\2\2\u0097\u0098\5X-\2\u0098\u0099\b\4\1\2\u0099\u00aa\3\2\2\2\u009a"+
		"\u009b\5\36\20\2\u009b\u009c\b\4\1\2\u009c\u00aa\3\2\2\2\u009d\u009e\5"+
		"\24\13\2\u009e\u009f\b\4\1\2\u009f\u00aa\3\2\2\2\u00a0\u00a1\5\32\16\2"+
		"\u00a1\u00a2\b\4\1\2\u00a2\u00aa\3\2\2\2\u00a3\u00a4\5\16\b\2\u00a4\u00a5"+
		"\b\4\1\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\b\4\1\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9u\3\2\2\2\u00a9y\3\2\2\2\u00a9|\3\2\2\2\u00a9\177"+
		"\3\2\2\2\u00a9\u0082\3\2\2\2\u00a9\u0085\3\2\2\2\u00a9\u0088\3\2\2\2\u00a9"+
		"\u008b\3\2\2\2\u00a9\u008e\3\2\2\2\u00a9\u0091\3\2\2\2\u00a9\u0094\3\2"+
		"\2\2\u00a9\u0097\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u00a0\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\7\3\2\2\2"+
		"\u00ab\u00ac\7M\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7O\2\2\u00ae\u00af"+
		"\7\13\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\b\5\1\2"+
		"\u00b2\u00bb\3\2\2\2\u00b3\u00b4\7N\2\2\u00b4\u00b5\7O\2\2\u00b5\u00b6"+
		"\7\13\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\b\5\1\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bb\t\3"+
		"\2\2\2\u00bc\u00bd\b\6\1\2\u00bd\u00be\5\f\7\2\u00be\u00bf\b\6\1\2\u00bf"+
		"\u00c6\3\2\2\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\5\f\7\2\u00c2\u00c3\b\6"+
		"\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\13\3\2\2\2\u00c8\u00c6\3\2\2"+
		"\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\b\7\1\2\u00cb\u00db\3\2\2\2\u00cc\u00cd"+
		"\7M\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\b\7\1\2\u00cf\u00db\3\2\2\2"+
		"\u00d0\u00d1\5\24\13\2\u00d1\u00d2\b\7\1\2\u00d2\u00db\3\2\2\2\u00d3\u00d4"+
		"\7M\2\2\u00d4\u00d5\5\16\b\2\u00d5\u00d6\b\7\1\2\u00d6\u00db\3\2\2\2\u00d7"+
		"\u00d8\5\16\b\2\u00d8\u00d9\b\7\1\2\u00d9\u00db\3\2\2\2\u00da\u00c9\3"+
		"\2\2\2\u00da\u00cc\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d3\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00db\r\3\2\2\2\u00dc\u00dd\7:\2\2\u00dd\u00de\7O\2\2\u00de"+
		"\u00df\7\13\2\2\u00df\u00e0\5\20\t\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\b"+
		"\b\1\2\u00e2\17\3\2\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00e5\5\22\n\2\u00e5"+
		"\u00e6\b\t\1\2\u00e6\u00ee\3\2\2\2\u00e7\u00e8\f\4\2\2\u00e8\u00e9\7\21"+
		"\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\b\t\1\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e7\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\21\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7O\2\2\u00f2\u00f3"+
		"\7\20\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\b\n\1\2\u00f5\u0105\3\2\2\2"+
		"\u00f6\u00f7\7O\2\2\u00f7\u00f8\7\20\2\2\u00f8\u00f9\5&\24\2\u00f9\u00fa"+
		"\b\n\1\2\u00fa\u0105\3\2\2\2\u00fb\u00fc\7O\2\2\u00fc\u00fd\7\20\2\2\u00fd"+
		"\u00fe\58\35\2\u00fe\u00ff\b\n\1\2\u00ff\u0105\3\2\2\2\u0100\u0101\7O"+
		"\2\2\u0101\u0102\7\20\2\2\u0102\u0103\7O\2\2\u0103\u0105\b\n\1\2\u0104"+
		"\u00f1\3\2\2\2\u0104\u00f6\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u0100\3\2"+
		"\2\2\u0105\23\3\2\2\2\u0106\u0107\7K\2\2\u0107\u0108\7O\2\2\u0108\u0109"+
		"\7\t\2\2\u0109\u010a\7\n\2\2\u010a\u010b\7\13\2\2\u010b\u010c\5\4\3\2"+
		"\u010c\u010d\7\f\2\2\u010d\u010e\b\13\1\2\u010e\u0184\3\2\2\2\u010f\u0110"+
		"\7K\2\2\u0110\u0111\7O\2\2\u0111\u0112\7\t\2\2\u0112\u0113\5\26\f\2\u0113"+
		"\u0114\7\n\2\2\u0114\u0115\7\13\2\2\u0115\u0116\5\4\3\2\u0116\u0117\7"+
		"\f\2\2\u0117\u0118\b\13\1\2\u0118\u0184\3\2\2\2\u0119\u011a\7K\2\2\u011a"+
		"\u011b\7O\2\2\u011b\u011c\7\t\2\2\u011c\u011d\7\n\2\2\u011d\u011e\7\31"+
		"\2\2\u011e\u011f\7!\2\2\u011f\u0120\58\35\2\u0120\u0121\7\13\2\2\u0121"+
		"\u0122\5\4\3\2\u0122\u0123\7\f\2\2\u0123\u0124\b\13\1\2\u0124\u0184\3"+
		"\2\2\2\u0125\u0126\7K\2\2\u0126\u0127\7O\2\2\u0127\u0128\7\t\2\2\u0128"+
		"\u0129\5\26\f\2\u0129\u012a\7\n\2\2\u012a\u012b\7\31\2\2\u012b\u012c\7"+
		"!\2\2\u012c\u012d\58\35\2\u012d\u012e\7\13\2\2\u012e\u012f\5\4\3\2\u012f"+
		"\u0130\7\f\2\2\u0130\u0131\b\13\1\2\u0131\u0184\3\2\2\2\u0132\u0133\7"+
		"K\2\2\u0133\u0134\7O\2\2\u0134\u0135\7\t\2\2\u0135\u0136\7\n\2\2\u0136"+
		"\u0137\7\31\2\2\u0137\u0138\7!\2\2\u0138\u0139\7O\2\2\u0139\u013a\7\13"+
		"\2\2\u013a\u013b\5\4\3\2\u013b\u013c\7\f\2\2\u013c\u013d\b\13\1\2\u013d"+
		"\u0184\3\2\2\2\u013e\u013f\7K\2\2\u013f\u0140\7O\2\2\u0140\u0141\7\t\2"+
		"\2\u0141\u0142\5\26\f\2\u0142\u0143\7\n\2\2\u0143\u0144\7\31\2\2\u0144"+
		"\u0145\7!\2\2\u0145\u0146\7O\2\2\u0146\u0147\7\13\2\2\u0147\u0148\5\4"+
		"\3\2\u0148\u0149\7\f\2\2\u0149\u014a\b\13\1\2\u014a\u0184\3\2\2\2\u014b"+
		"\u014c\7K\2\2\u014c\u014d\7O\2\2\u014d\u014e\7\t\2\2\u014e\u014f\7\n\2"+
		"\2\u014f\u0150\7\31\2\2\u0150\u0151\7!\2\2\u0151\u0152\5$\23\2\u0152\u0153"+
		"\7\13\2\2\u0153\u0154\5\4\3\2\u0154\u0155\7\f\2\2\u0155\u0156\b\13\1\2"+
		"\u0156\u0184\3\2\2\2\u0157\u0158\7K\2\2\u0158\u0159\7O\2\2\u0159\u015a"+
		"\7\t\2\2\u015a\u015b\5\26\f\2\u015b\u015c\7\n\2\2\u015c\u015d\7\31\2\2"+
		"\u015d\u015e\7!\2\2\u015e\u015f\5$\23\2\u015f\u0160\7\13\2\2\u0160\u0161"+
		"\5\4\3\2\u0161\u0162\7\f\2\2\u0162\u0163\b\13\1\2\u0163\u0184\3\2\2\2"+
		"\u0164\u0165\7K\2\2\u0165\u0166\7O\2\2\u0166\u0167\7\t\2\2\u0167\u0168"+
		"\7\n\2\2\u0168\u0169\7\31\2\2\u0169\u016a\7!\2\2\u016a\u016b\7;\2\2\u016b"+
		"\u016c\7\"\2\2\u016c\u016d\58\35\2\u016d\u016e\7!\2\2\u016e\u016f\7\13"+
		"\2\2\u016f\u0170\5\4\3\2\u0170\u0171\7\f\2\2\u0171\u0172\b\13\1\2\u0172"+
		"\u0184\3\2\2\2\u0173\u0174\7K\2\2\u0174\u0175\7O\2\2\u0175\u0176\7\t\2"+
		"\2\u0176\u0177\5\26\f\2\u0177\u0178\7\n\2\2\u0178\u0179\7\31\2\2\u0179"+
		"\u017a\7!\2\2\u017a\u017b\7;\2\2\u017b\u017c\7\"\2\2\u017c\u017d\58\35"+
		"\2\u017d\u017e\7!\2\2\u017e\u017f\7\13\2\2\u017f\u0180\5\4\3\2\u0180\u0181"+
		"\7\f\2\2\u0181\u0182\b\13\1\2\u0182\u0184\3\2\2\2\u0183\u0106\3\2\2\2"+
		"\u0183\u010f\3\2\2\2\u0183\u0119\3\2\2\2\u0183\u0125\3\2\2\2\u0183\u0132"+
		"\3\2\2\2\u0183\u013e\3\2\2\2\u0183\u014b\3\2\2\2\u0183\u0157\3\2\2\2\u0183"+
		"\u0164\3\2\2\2\u0183\u0173\3\2\2\2\u0184\25\3\2\2\2\u0185\u0186\b\f\1"+
		"\2\u0186\u0187\5\30\r\2\u0187\u0188\b\f\1\2\u0188\u0190\3\2\2\2\u0189"+
		"\u018a\f\4\2\2\u018a\u018b\7\21\2\2\u018b\u018c\5\30\r\2\u018c\u018d\b"+
		"\f\1\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\27\3\2\2\2\u0192\u0190\3\2\2"+
		"\2\u0193\u0194\7O\2\2\u0194\u0195\7\20\2\2\u0195\u0196\7\25\2\2\u0196"+
		"\u0197\7\61\2\2\u0197\u0198\5$\23\2\u0198\u0199\b\r\1\2\u0199\u01b9\3"+
		"\2\2\2\u019a\u019b\7O\2\2\u019b\u019c\7\20\2\2\u019c\u019d\7\25\2\2\u019d"+
		"\u019e\5$\23\2\u019e\u019f\b\r\1\2\u019f\u01b9\3\2\2\2\u01a0\u01a1\7O"+
		"\2\2\u01a1\u01a2\7\20\2\2\u01a2\u01a3\7\25\2\2\u01a3\u01a4\7\61\2\2\u01a4"+
		"\u01a5\5(\25\2\u01a5\u01a6\b\r\1\2\u01a6\u01b9\3\2\2\2\u01a7\u01a8\7O"+
		"\2\2\u01a8\u01a9\7\20\2\2\u01a9\u01aa\7\25\2\2\u01aa\u01ab\5(\25\2\u01ab"+
		"\u01ac\b\r\1\2\u01ac\u01b9\3\2\2\2\u01ad\u01ae\7O\2\2\u01ae\u01af\7\20"+
		"\2\2\u01af\u01b0\7\61\2\2\u01b0\u01b1\58\35\2\u01b1\u01b2\b\r\1\2\u01b2"+
		"\u01b9\3\2\2\2\u01b3\u01b4\7O\2\2\u01b4\u01b5\7\20\2\2\u01b5\u01b6\58"+
		"\35\2\u01b6\u01b7\b\r\1\2\u01b7\u01b9\3\2\2\2\u01b8\u0193\3\2\2\2\u01b8"+
		"\u019a\3\2\2\2\u01b8\u01a0\3\2\2\2\u01b8\u01a7\3\2\2\2\u01b8\u01ad\3\2"+
		"\2\2\u01b8\u01b3\3\2\2\2\u01b9\31\3\2\2\2\u01ba\u01bb\7O\2\2\u01bb\u01bc"+
		"\7\t\2\2\u01bc\u01bd\7\n\2\2\u01bd\u01be\7\17\2\2\u01be\u01c7\b\16\1\2"+
		"\u01bf\u01c0\7O\2\2\u01c0\u01c1\7\t\2\2\u01c1\u01c2\5\34\17\2\u01c2\u01c3"+
		"\7\n\2\2\u01c3\u01c4\7\17\2\2\u01c4\u01c5\b\16\1\2\u01c5\u01c7\3\2\2\2"+
		"\u01c6\u01ba\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c7\33\3\2\2\2\u01c8\u01c9"+
		"\b\17\1\2\u01c9\u01ca\5`\61\2\u01ca\u01cb\b\17\1\2\u01cb\u01d2\3\2\2\2"+
		"\u01cc\u01cd\7\25\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01cf\5`\61\2\u01cf\u01d0"+
		"\b\17\1\2\u01d0\u01d2\3\2\2\2\u01d1\u01c8\3\2\2\2\u01d1\u01cc\3\2\2\2"+
		"\u01d2\u01e1\3\2\2\2\u01d3\u01d4\f\6\2\2\u01d4\u01d5\7\21\2\2\u01d5\u01d6"+
		"\5`\61\2\u01d6\u01d7\b\17\1\2\u01d7\u01e0\3\2\2\2\u01d8\u01d9\f\5\2\2"+
		"\u01d9\u01da\7\21\2\2\u01da\u01db\7\25\2\2\u01db\u01dc\7\61\2\2\u01dc"+
		"\u01dd\5`\61\2\u01dd\u01de\b\17\1\2\u01de\u01e0\3\2\2\2\u01df\u01d3\3"+
		"\2\2\2\u01df\u01d8\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\35\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\79\2\2"+
		"\u01e5\u01e6\7\17\2\2\u01e6\u01fd\b\20\1\2\u01e7\u01e8\79\2\2\u01e8\u01e9"+
		"\5`\61\2\u01e9\u01ea\7\17\2\2\u01ea\u01eb\b\20\1\2\u01eb\u01fd\3\2\2\2"+
		"\u01ec\u01ed\7G\2\2\u01ed\u01ee\7\17\2\2\u01ee\u01fd\b\20\1\2\u01ef\u01f0"+
		"\7L\2\2\u01f0\u01f1\7\17\2\2\u01f1\u01fd\b\20\1\2\u01f2\u01f3\7L\2\2\u01f3"+
		"\u01f4\5`\61\2\u01f4\u01f5\7\17\2\2\u01f5\u01f6\b\20\1\2\u01f6\u01fd\3"+
		"\2\2\2\u01f7\u01f8\7L\2\2\u01f8\u01f9\5Z.\2\u01f9\u01fa\7\17\2\2\u01fa"+
		"\u01fb\b\20\1\2\u01fb\u01fd\3\2\2\2\u01fc\u01e4\3\2\2\2\u01fc\u01e7\3"+
		"\2\2\2\u01fc\u01ec\3\2\2\2\u01fc\u01ef\3\2\2\2\u01fc\u01f2\3\2\2\2\u01fc"+
		"\u01f7\3\2\2\2\u01fd\37\3\2\2\2\u01fe\u01ff\7\60\2\2\u01ff\u0200\7\61"+
		"\2\2\u0200\u0201\7O\2\2\u0201\u0202\7\20\2\2\u0202\u0203\58\35\2\u0203"+
		"\u0204\7#\2\2\u0204\u0205\5`\61\2\u0205\u0206\7\17\2\2\u0206\u0207\b\21"+
		"\1\2\u0207\u0225\3\2\2\2\u0208\u0209\7\60\2\2\u0209\u020a\7O\2\2\u020a"+
		"\u020b\7\20\2\2\u020b\u020c\58\35\2\u020c\u020d\7#\2\2\u020d\u020e\5`"+
		"\61\2\u020e\u020f\7\17\2\2\u020f\u0210\b\21\1\2\u0210\u0225\3\2\2\2\u0211"+
		"\u0212\7\60\2\2\u0212\u0213\7\61\2\2\u0213\u0214\7O\2\2\u0214\u0215\7"+
		"\20\2\2\u0215\u0216\58\35\2\u0216\u0217\7#\2\2\u0217\u0218\5,\27\2\u0218"+
		"\u0219\7\17\2\2\u0219\u021a\b\21\1\2\u021a\u0225\3\2\2\2\u021b\u021c\7"+
		"\60\2\2\u021c\u021d\7O\2\2\u021d\u021e\7\20\2\2\u021e\u021f\58\35\2\u021f"+
		"\u0220\7#\2\2\u0220\u0221\5,\27\2\u0221\u0222\7\17\2\2\u0222\u0223\b\21"+
		"\1\2\u0223\u0225\3\2\2\2\u0224\u01fe\3\2\2\2\u0224\u0208\3\2\2\2\u0224"+
		"\u0211\3\2\2\2\u0224\u021b\3\2\2\2\u0225!\3\2\2\2\u0226\u0227\7\60\2\2"+
		"\u0227\u0228\7\61\2\2\u0228\u0229\7O\2\2\u0229\u022a\7\20\2\2\u022a\u022b"+
		"\5$\23\2\u022b\u022c\7#\2\2\u022c\u022d\5Z.\2\u022d\u022e\7\17\2\2\u022e"+
		"\u022f\b\22\1\2\u022f\u0249\3\2\2\2\u0230\u0231\7\60\2\2\u0231\u0232\7"+
		"\61\2\2\u0232\u0233\7O\2\2\u0233\u0234\7#\2\2\u0234\u0235\5Z.\2\u0235"+
		"\u0236\7\17\2\2\u0236\u0237\b\22\1\2\u0237\u0249\3\2\2\2\u0238\u0239\7"+
		"\60\2\2\u0239\u023a\7O\2\2\u023a\u023b\7\20\2\2\u023b\u023c\5$\23\2\u023c"+
		"\u023d\7#\2\2\u023d\u023e\5Z.\2\u023e\u023f\7\17\2\2\u023f\u0240\b\22"+
		"\1\2\u0240\u0249\3\2\2\2\u0241\u0242\7\60\2\2\u0242\u0243\7O\2\2\u0243"+
		"\u0244\7#\2\2\u0244\u0245\5Z.\2\u0245\u0246\7\17\2\2\u0246\u0247\b\22"+
		"\1\2\u0247\u0249\3\2\2\2\u0248\u0226\3\2\2\2\u0248\u0230\3\2\2\2\u0248"+
		"\u0238\3\2\2\2\u0248\u0241\3\2\2\2\u0249#\3\2\2\2\u024a\u024b\7\r\2\2"+
		"\u024b\u024c\5$\23\2\u024c\u024d\7\17\2\2\u024d\u024e\5Z.\2\u024e\u024f"+
		"\7\16\2\2\u024f\u0250\b\23\1\2\u0250\u0259\3\2\2\2\u0251\u0252\7\r\2\2"+
		"\u0252\u0253\58\35\2\u0253\u0254\7\17\2\2\u0254\u0255\5Z.\2\u0255\u0256"+
		"\7\16\2\2\u0256\u0257\b\23\1\2\u0257\u0259\3\2\2\2\u0258\u024a\3\2\2\2"+
		"\u0258\u0251\3\2\2\2\u0259%\3\2\2\2\u025a\u025b\7\60\2\2\u025b\u025c\7"+
		"\61\2\2\u025c\u025d\7O\2\2\u025d\u025e\7\20\2\2\u025e\u025f\7;\2\2\u025f"+
		"\u0260\7\"\2\2\u0260\u0261\58\35\2\u0261\u0262\7!\2\2\u0262\u0263\7#\2"+
		"\2\u0263\u0264\5(\25\2\u0264\u0265\7\17\2\2\u0265\u0266\b\24\1\2\u0266"+
		"\u029c\3\2\2\2\u0267\u0268\7\60\2\2\u0268\u0269\7\61\2\2\u0269\u026a\7"+
		"O\2\2\u026a\u026b\7\20\2\2\u026b\u026c\7;\2\2\u026c\u026d\7\"\2\2\u026d"+
		"\u026e\7O\2\2\u026e\u026f\7!\2\2\u026f\u0270\7#\2\2\u0270\u0271\5(\25"+
		"\2\u0271\u0272\7\17\2\2\u0272\u0273\b\24\1\2\u0273\u029c\3\2\2\2\u0274"+
		"\u0275\7\60\2\2\u0275\u0276\7\61\2\2\u0276\u0277\7O\2\2\u0277\u0278\7"+
		"#\2\2\u0278\u0279\5(\25\2\u0279\u027a\7\17\2\2\u027a\u027b\b\24\1\2\u027b"+
		"\u029c\3\2\2\2\u027c\u027d\7\60\2\2\u027d\u027e\7O\2\2\u027e\u027f\7\20"+
		"\2\2\u027f\u0280\7;\2\2\u0280\u0281\7\"\2\2\u0281\u0282\58\35\2\u0282"+
		"\u0283\7!\2\2\u0283\u0284\7#\2\2\u0284\u0285\5(\25\2\u0285\u0286\7\17"+
		"\2\2\u0286\u0287\b\24\1\2\u0287\u029c\3\2\2\2\u0288\u0289\7\60\2\2\u0289"+
		"\u028a\7O\2\2\u028a\u028b\7#\2\2\u028b\u028c\5(\25\2\u028c\u028d\7\17"+
		"\2\2\u028d\u028e\b\24\1\2\u028e\u029c\3\2\2\2\u028f\u0290\7\60\2\2\u0290"+
		"\u0291\7O\2\2\u0291\u0292\7\20\2\2\u0292\u0293\7;\2\2\u0293\u0294\7\""+
		"\2\2\u0294\u0295\7O\2\2\u0295\u0296\7!\2\2\u0296\u0297\7#\2\2\u0297\u0298"+
		"\5(\25\2\u0298\u0299\7\17\2\2\u0299\u029a\b\24\1\2\u029a\u029c\3\2\2\2"+
		"\u029b\u025a\3\2\2\2\u029b\u0267\3\2\2\2\u029b\u0274\3\2\2\2\u029b\u027c"+
		"\3\2\2\2\u029b\u0288\3\2\2\2\u029b\u028f\3\2\2\2\u029c\'\3\2\2\2\u029d"+
		"\u029e\7;\2\2\u029e\u029f\7\b\2\2\u029f\u02a0\7\r\2\2\u02a0\u02a1\5F$"+
		"\2\u02a1\u02a2\7\16\2\2\u02a2\u02a3\b\25\1\2\u02a3\u02bf\3\2\2\2\u02a4"+
		"\u02a5\7;\2\2\u02a5\u02a6\7\b\2\2\u02a6\u02a7\7\r\2\2\u02a7\u02a8\5Z."+
		"\2\u02a8\u02a9\7\17\2\2\u02a9\u02aa\5Z.\2\u02aa\u02ab\7\16\2\2\u02ab\u02ac"+
		"\b\25\1\2\u02ac\u02bf\3\2\2\2\u02ad\u02ae\7;\2\2\u02ae\u02af\7\20\2\2"+
		"\u02af\u02b0\7\20\2\2\u02b0\u02b1\7<\2\2\u02b1\u02b2\7\t\2\2\u02b2\u02b3"+
		"\7\n\2\2\u02b3\u02bf\b\25\1\2\u02b4\u02b5\7;\2\2\u02b5\u02b6\7\b\2\2\u02b6"+
		"\u02b7\7\20\2\2\u02b7\u02b8\7\20\2\2\u02b8\u02b9\7=\2\2\u02b9\u02ba\7"+
		"\t\2\2\u02ba\u02bb\5Z.\2\u02bb\u02bc\7\n\2\2\u02bc\u02bd\b\25\1\2\u02bd"+
		"\u02bf\3\2\2\2\u02be\u029d\3\2\2\2\u02be\u02a4\3\2\2\2\u02be\u02ad\3\2"+
		"\2\2\u02be\u02b4\3\2\2\2\u02bf)\3\2\2\2\u02c0\u02c1\7O\2\2\u02c1\u02c2"+
		"\7\24\2\2\u02c2\u02c3\7>\2\2\u02c3\u02c4\7\t\2\2\u02c4\u02c5\5`\61\2\u02c5"+
		"\u02c6\7\n\2\2\u02c6\u02c7\7\17\2\2\u02c7\u02c8\b\26\1\2\u02c8\u02de\3"+
		"\2\2\2\u02c9\u02ca\7O\2\2\u02ca\u02cb\7\24\2\2\u02cb\u02cc\7?\2\2\u02cc"+
		"\u02cd\7\t\2\2\u02cd\u02ce\5`\61\2\u02ce\u02cf\7\21\2\2\u02cf\u02d0\5"+
		"`\61\2\u02d0\u02d1\7\n\2\2\u02d1\u02d2\7\17\2\2\u02d2\u02d3\b\26\1\2\u02d3"+
		"\u02de\3\2\2\2\u02d4\u02d5\7O\2\2\u02d5\u02d6\7\24\2\2\u02d6\u02d7\7@"+
		"\2\2\u02d7\u02d8\7\t\2\2\u02d8\u02d9\5`\61\2\u02d9\u02da\7\n\2\2\u02da"+
		"\u02db\7\17\2\2\u02db\u02dc\b\26\1\2\u02dc\u02de\3\2\2\2\u02dd\u02c0\3"+
		"\2\2\2\u02dd\u02c9\3\2\2\2\u02dd\u02d4\3\2\2\2\u02de+\3\2\2\2\u02df\u02e0"+
		"\5<\37\2\u02e0\u02e1\7\17\2\2\u02e1\u02e2\b\27\1\2\u02e2\u02ea\3\2\2\2"+
		"\u02e3\u02e4\5@!\2\u02e4\u02e5\b\27\1\2\u02e5\u02ea\3\2\2\2\u02e6\u02e7"+
		"\5.\30\2\u02e7\u02e8\b\27\1\2\u02e8\u02ea\3\2\2\2\u02e9\u02df\3\2\2\2"+
		"\u02e9\u02e3\3\2\2\2\u02e9\u02e6\3\2\2\2\u02ea-\3\2\2\2\u02eb\u02ec\7"+
		"\66\2\2\u02ec\u02ed\5`\61\2\u02ed\u02ee\7\13\2\2\u02ee\u02ef\5\60\31\2"+
		"\u02ef\u02f0\5\66\34\2\u02f0\u02f1\7\f\2\2\u02f1\u02f2\b\30\1\2\u02f2"+
		"\u0302\3\2\2\2\u02f3\u02f4\7\66\2\2\u02f4\u02f5\5`\61\2\u02f5\u02f6\7"+
		"\13\2\2\u02f6\u02f7\5\60\31\2\u02f7\u02f8\7\f\2\2\u02f8\u02f9\b\30\1\2"+
		"\u02f9\u0302\3\2\2\2\u02fa\u02fb\7\66\2\2\u02fb\u02fc\5`\61\2\u02fc\u02fd"+
		"\7\13\2\2\u02fd\u02fe\5\66\34\2\u02fe\u02ff\7\f\2\2\u02ff\u0300\b\30\1"+
		"\2\u0300\u0302\3\2\2\2\u0301\u02eb\3\2\2\2\u0301\u02f3\3\2\2\2\u0301\u02fa"+
		"\3\2\2\2\u0302/\3\2\2\2\u0303\u0304\b\31\1\2\u0304\u0305\5\62\32\2\u0305"+
		"\u0306\b\31\1\2\u0306\u030d\3\2\2\2\u0307\u0308\f\4\2\2\u0308\u0309\5"+
		"\62\32\2\u0309\u030a\b\31\1\2\u030a\u030c\3\2\2\2\u030b\u0307\3\2\2\2"+
		"\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\61"+
		"\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\5`\61\2\u0311\u0312\7#\2\2\u0312"+
		"\u0313\7!\2\2\u0313\u0314\5`\61\2\u0314\u0315\7\21\2\2\u0315\u0316\b\32"+
		"\1\2\u0316\u031f\3\2\2\2\u0317\u0318\5\64\33\2\u0318\u0319\7#\2\2\u0319"+
		"\u031a\7!\2\2\u031a\u031b\5`\61\2\u031b\u031c\7\21\2\2\u031c\u031d\b\32"+
		"\1\2\u031d\u031f\3\2\2\2\u031e\u0310\3\2\2\2\u031e\u0317\3\2\2\2\u031f"+
		"\63\3\2\2\2\u0320\u0321\5P)\2\u0321\u0322\7\23\2\2\u0322\u0323\5`\61\2"+
		"\u0323\u0324\b\33\1\2\u0324\u0329\3\2\2\2\u0325\u0326\5`\61\2\u0326\u0327"+
		"\b\33\1\2\u0327\u0329\3\2\2\2\u0328\u0320\3\2\2\2\u0328\u0325\3\2\2\2"+
		"\u0329\65\3\2\2\2\u032a\u032b\7\22\2\2\u032b\u032c\7#\2\2\u032c\u032d"+
		"\7!\2\2\u032d\u032e\5`\61\2\u032e\u032f\7\21\2\2\u032f\u0330\b\34\1\2"+
		"\u0330\67\3\2\2\2\u0331\u0332\7(\2\2\u0332\u0340\b\35\1\2\u0333\u0334"+
		"\7)\2\2\u0334\u0340\b\35\1\2\u0335\u0336\7,\2\2\u0336\u0340\b\35\1\2\u0337"+
		"\u0338\7*\2\2\u0338\u0340\b\35\1\2\u0339\u033a\7+\2\2\u033a\u0340\b\35"+
		"\1\2\u033b\u033c\7-\2\2\u033c\u0340\b\35\1\2\u033d\u033e\7.\2\2\u033e"+
		"\u0340\b\35\1\2\u033f\u0331\3\2\2\2\u033f\u0333\3\2\2\2\u033f\u0335\3"+
		"\2\2\2\u033f\u0337\3\2\2\2\u033f\u0339\3\2\2\2\u033f\u033b\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u03409\3\2\2\2\u0341\u0342\7O\2\2\u0342\u0343\7#\2\2\u0343"+
		"\u0344\5`\61\2\u0344\u0345\7\17\2\2\u0345\u0346\b\36\1\2\u0346\u0350\3"+
		"\2\2\2\u0347\u0348\7O\2\2\u0348\u0349\7\24\2\2\u0349\u034a\7O\2\2\u034a"+
		"\u034b\7#\2\2\u034b\u034c\5`\61\2\u034c\u034d\7\17\2\2\u034d\u034e\b\36"+
		"\1\2\u034e\u0350\3\2\2\2\u034f\u0341\3\2\2\2\u034f\u0347\3\2\2\2\u0350"+
		";\3\2\2\2\u0351\u0352\7\62\2\2\u0352\u0353\5`\61\2\u0353\u0354\7\13\2"+
		"\2\u0354\u0355\5> \2\u0355\u0356\7\f\2\2\u0356\u0357\b\37\1\2\u0357\u036d"+
		"\3\2\2\2\u0358\u0359\7\62\2\2\u0359\u035a\5`\61\2\u035a\u035b\7\13\2\2"+
		"\u035b\u035c\5> \2\u035c\u035d\7\f\2\2\u035d\u035e\7\63\2\2\u035e\u035f"+
		"\7\13\2\2\u035f\u0360\5> \2\u0360\u0361\7\f\2\2\u0361\u0362\b\37\1\2\u0362"+
		"\u036d\3\2\2\2\u0363\u0364\7\62\2\2\u0364\u0365\5`\61\2\u0365\u0366\7"+
		"\13\2\2\u0366\u0367\5> \2\u0367\u0368\7\f\2\2\u0368\u0369\7\63\2\2\u0369"+
		"\u036a\5<\37\2\u036a\u036b\b\37\1\2\u036b\u036d\3\2\2\2\u036c\u0351\3"+
		"\2\2\2\u036c\u0358\3\2\2\2\u036c\u0363\3\2\2\2\u036d=\3\2\2\2\u036e\u036f"+
		"\5\4\3\2\u036f\u0370\5`\61\2\u0370\u0371\b \1\2\u0371\u0376\3\2\2\2\u0372"+
		"\u0373\5`\61\2\u0373\u0374\b \1\2\u0374\u0376\3\2\2\2\u0375\u036e\3\2"+
		"\2\2\u0375\u0372\3\2\2\2\u0376?\3\2\2\2\u0377\u0378\7\64\2\2\u0378\u0379"+
		"\7\13\2\2\u0379\u037a\5\4\3\2\u037a\u037b\7\f\2\2\u037b\u037c\b!\1\2\u037c"+
		"A\3\2\2\2\u037d\u037e\7/\2\2\u037e\u037f\7\b\2\2\u037f\u0380\7\t\2\2\u0380"+
		"\u0381\5`\61\2\u0381\u0382\7\n\2\2\u0382\u0383\b\"\1\2\u0383\u038e\3\2"+
		"\2\2\u0384\u0385\7/\2\2\u0385\u0386\7\b\2\2\u0386\u0387\7\t\2\2\u0387"+
		"\u0388\5`\61\2\u0388\u0389\7\21\2\2\u0389\u038a\5D#\2\u038a\u038b\7\n"+
		"\2\2\u038b\u038c\b\"\1\2\u038c\u038e\3\2\2\2\u038d\u037d\3\2\2\2\u038d"+
		"\u0384\3\2\2\2\u038eC\3\2\2\2\u038f\u0390\b#\1\2\u0390\u0391\5`\61\2\u0391"+
		"\u0392\b#\1\2\u0392\u039a\3\2\2\2\u0393\u0394\f\4\2\2\u0394\u0395\7\21"+
		"\2\2\u0395\u0396\5`\61\2\u0396\u0397\b#\1\2\u0397\u0399\3\2\2\2\u0398"+
		"\u0393\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039bE\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\b$\1\2\u039e\u039f"+
		"\5Z.\2\u039f\u03a0\b$\1\2\u03a0\u03a8\3\2\2\2\u03a1\u03a2\f\4\2\2\u03a2"+
		"\u03a3\7\21\2\2\u03a3\u03a4\5Z.\2\u03a4\u03a5\b$\1\2\u03a5\u03a7\3\2\2"+
		"\2\u03a6\u03a1\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9G\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03ac\7\62\2\2\u03ac"+
		"\u03ad\5`\61\2\u03ad\u03ae\7\13\2\2\u03ae\u03af\5\4\3\2\u03af\u03b0\7"+
		"\f\2\2\u03b0\u03b1\b%\1\2\u03b1\u03c7\3\2\2\2\u03b2\u03b3\7\62\2\2\u03b3"+
		"\u03b4\5`\61\2\u03b4\u03b5\7\13\2\2\u03b5\u03b6\5\4\3\2\u03b6\u03b7\7"+
		"\f\2\2\u03b7\u03b8\7\63\2\2\u03b8\u03b9\7\13\2\2\u03b9\u03ba\5\4\3\2\u03ba"+
		"\u03bb\7\f\2\2\u03bb\u03bc\b%\1\2\u03bc\u03c7\3\2\2\2\u03bd\u03be\7\62"+
		"\2\2\u03be\u03bf\5`\61\2\u03bf\u03c0\7\13\2\2\u03c0\u03c1\5\4\3\2\u03c1"+
		"\u03c2\7\f\2\2\u03c2\u03c3\7\63\2\2\u03c3\u03c4\5H%\2\u03c4\u03c5\b%\1"+
		"\2\u03c5\u03c7\3\2\2\2\u03c6\u03ab\3\2\2\2\u03c6\u03b2\3\2\2\2\u03c6\u03bd"+
		"\3\2\2\2\u03c7I\3\2\2\2\u03c8\u03c9\7\66\2\2\u03c9\u03ca\5`\61\2\u03ca"+
		"\u03cb\7\13\2\2\u03cb\u03cc\5L\'\2\u03cc\u03cd\5R*\2\u03cd\u03ce\7\f\2"+
		"\2\u03ce\u03cf\b&\1\2\u03cf\u03d8\3\2\2\2\u03d0\u03d1\7\66\2\2\u03d1\u03d2"+
		"\5`\61\2\u03d2\u03d3\7\13\2\2\u03d3\u03d4\5R*\2\u03d4\u03d5\7\f\2\2\u03d5"+
		"\u03d6\b&\1\2\u03d6\u03d8\3\2\2\2\u03d7\u03c8\3\2\2\2\u03d7\u03d0\3\2"+
		"\2\2\u03d8K\3\2\2\2\u03d9\u03da\b\'\1\2\u03da\u03db\5N(\2\u03db\u03dc"+
		"\b\'\1\2\u03dc\u03e3\3\2\2\2\u03dd\u03de\f\4\2\2\u03de\u03df\5N(\2\u03df"+
		"\u03e0\b\'\1\2\u03e0\u03e2\3\2\2\2\u03e1\u03dd\3\2\2\2\u03e2\u03e5\3\2"+
		"\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4M\3\2\2\2\u03e5\u03e3"+
		"\3\2\2\2\u03e6\u03e7\5`\61\2\u03e7\u03e8\7#\2\2\u03e8\u03e9\7!\2\2\u03e9"+
		"\u03ea\7\13\2\2\u03ea\u03eb\5\4\3\2\u03eb\u03ec\7\f\2\2\u03ec\u03ed\b"+
		"(\1\2\u03ed\u0405\3\2\2\2\u03ee\u03ef\5P)\2\u03ef\u03f0\7#\2\2\u03f0\u03f1"+
		"\7!\2\2\u03f1\u03f2\7\13\2\2\u03f2\u03f3\5\4\3\2\u03f3\u03f4\7\f\2\2\u03f4"+
		"\u03f5\b(\1\2\u03f5\u0405\3\2\2\2\u03f6\u03f7\5`\61\2\u03f7\u03f8\7#\2"+
		"\2\u03f8\u03f9\7!\2\2\u03f9\u03fa\5\6\4\2\u03fa\u03fb\7\21\2\2\u03fb\u03fc"+
		"\b(\1\2\u03fc\u0405\3\2\2\2\u03fd\u03fe\5P)\2\u03fe\u03ff\7#\2\2\u03ff"+
		"\u0400\7!\2\2\u0400\u0401\5\6\4\2\u0401\u0402\7\21\2\2\u0402\u0403\b("+
		"\1\2\u0403\u0405\3\2\2\2\u0404\u03e6\3\2\2\2\u0404\u03ee\3\2\2\2\u0404"+
		"\u03f6\3\2\2\2\u0404\u03fd\3\2\2\2\u0405O\3\2\2\2\u0406\u0407\b)\1\2\u0407"+
		"\u0408\5`\61\2\u0408\u0409\b)\1\2\u0409\u0411\3\2\2\2\u040a\u040b\f\4"+
		"\2\2\u040b\u040c\7\23\2\2\u040c\u040d\5`\61\2\u040d\u040e\b)\1\2\u040e"+
		"\u0410\3\2\2\2\u040f\u040a\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2"+
		"\2\2\u0411\u0412\3\2\2\2\u0412Q\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0415"+
		"\7\22\2\2\u0415\u0416\7#\2\2\u0416\u0417\7!\2\2\u0417\u0418\7\13\2\2\u0418"+
		"\u0419\5\4\3\2\u0419\u041a\7\f\2\2\u041a\u041b\b*\1\2\u041b\u0424\3\2"+
		"\2\2\u041c\u041d\7\22\2\2\u041d\u041e\7#\2\2\u041e\u041f\7!\2\2\u041f"+
		"\u0420\5\6\4\2\u0420\u0421\7\21\2\2\u0421\u0422\b*\1\2\u0422\u0424\3\2"+
		"\2\2\u0423\u0414\3\2\2\2\u0423\u041c\3\2\2\2\u0424S\3\2\2\2\u0425\u0426"+
		"\7\64\2\2\u0426\u0427\7\13\2\2\u0427\u0428\5\4\3\2\u0428\u0429\7\f\2\2"+
		"\u0429\u042a\b+\1\2\u042aU\3\2\2\2\u042b\u042c\7\65\2\2\u042c\u042d\5"+
		"`\61\2\u042d\u042e\7\13\2\2\u042e\u042f\5\4\3\2\u042f\u0430\7\f\2\2\u0430"+
		"\u0431\b,\1\2\u0431W\3\2\2\2\u0432\u0433\7\67\2\2\u0433\u0434\7O\2\2\u0434"+
		"\u0435\78\2\2\u0435\u0436\5`\61\2\u0436\u0437\7\24\2\2\u0437\u0438\7\24"+
		"\2\2\u0438\u0439\5`\61\2\u0439\u043a\7\13\2\2\u043a\u043b\5\4\3\2\u043b"+
		"\u043c\7\f\2\2\u043c\u043d\b-\1\2\u043d\u0448\3\2\2\2\u043e\u043f\7\67"+
		"\2\2\u043f\u0440\7O\2\2\u0440\u0441\78\2\2\u0441\u0442\5Z.\2\u0442\u0443"+
		"\7\13\2\2\u0443\u0444\5\4\3\2\u0444\u0445\7\f\2\2\u0445\u0446\b-\1\2\u0446"+
		"\u0448\3\2\2\2\u0447\u0432\3\2\2\2\u0447\u043e\3\2\2\2\u0448Y\3\2\2\2"+
		"\u0449\u044a\b.\1\2\u044a\u044b\7(\2\2\u044b\u044c\7\20\2\2\u044c\u044d"+
		"\7\20\2\2\u044d\u044e\7\32\2\2\u044e\u044f\7\t\2\2\u044f\u0450\5Z.\2\u0450"+
		"\u0451\7\21\2\2\u0451\u0452\5Z.\2\u0452\u0453\7\n\2\2\u0453\u0454\b.\1"+
		"\2\u0454\u0483\3\2\2\2\u0455\u0456\7)\2\2\u0456\u0457\7\20\2\2\u0457\u0458"+
		"\7\20\2\2\u0458\u0459\7\33\2\2\u0459\u045a\7\t\2\2\u045a\u045b\5Z.\2\u045b"+
		"\u045c\7\21\2\2\u045c\u045d\5Z.\2\u045d\u045e\7\n\2\2\u045e\u045f\b.\1"+
		"\2\u045f\u0483\3\2\2\2\u0460\u0461\7\t\2\2\u0461\u0462\5Z.\2\u0462\u0463"+
		"\7\n\2\2\u0463\u0464\b.\1\2\u0464\u0483\3\2\2\2\u0465\u0466\7\b\2\2\u0466"+
		"\u0467\5Z.\b\u0467\u0468\b.\1\2\u0468\u0483\3\2\2\2\u0469\u046a\7\r\2"+
		"\2\u046a\u046b\5F$\2\u046b\u046c\7\16\2\2\u046c\u046d\b.\1\2\u046d\u0483"+
		"\3\2\2\2\u046e\u046f\7\r\2\2\u046f\u0470\5Z.\2\u0470\u0471\7\17\2\2\u0471"+
		"\u0472\5Z.\2\u0472\u0473\7\16\2\2\u0473\u0474\b.\1\2\u0474\u0483\3\2\2"+
		"\2\u0475\u0476\5`\61\2\u0476\u0477\7\24\2\2\u0477\u0478\7C\2\2\u0478\u0479"+
		"\7\t\2\2\u0479\u047a\7\n\2\2\u047a\u047b\b.\1\2\u047b\u0483\3\2\2\2\u047c"+
		"\u047d\5(\25\2\u047d\u047e\b.\1\2\u047e\u0483\3\2\2\2\u047f\u0480\5d\63"+
		"\2\u0480\u0481\b.\1\2\u0481\u0483\3\2\2\2\u0482\u0449\3\2\2\2\u0482\u0455"+
		"\3\2\2\2\u0482\u0460\3\2\2\2\u0482\u0465\3\2\2\2\u0482\u0469\3\2\2\2\u0482"+
		"\u046e\3\2\2\2\u0482\u0475\3\2\2\2\u0482\u047c\3\2\2\2\u0482\u047f\3\2"+
		"\2\2\u0483\u049f\3\2\2\2\u0484\u0485\f\16\2\2\u0485\u0486\7\34\2\2\u0486"+
		"\u0487\5Z.\17\u0487\u0488\b.\1\2\u0488\u049e\3\2\2\2\u0489\u048a\f\r\2"+
		"\2\u048a\u048b\t\2\2\2\u048b\u048c\5Z.\16\u048c\u048d\b.\1\2\u048d\u049e"+
		"\3\2\2\2\u048e\u048f\f\f\2\2\u048f\u0490\t\3\2\2\u0490\u0491\5Z.\r\u0491"+
		"\u0492\b.\1\2\u0492\u049e\3\2\2\2\u0493\u0494\f\13\2\2\u0494\u0495\t\4"+
		"\2\2\u0495\u0496\5Z.\f\u0496\u0497\b.\1\2\u0497\u049e\3\2\2\2\u0498\u0499"+
		"\f\t\2\2\u0499\u049a\t\5\2\2\u049a\u049b\5Z.\n\u049b\u049c\b.\1\2\u049c"+
		"\u049e\3\2\2\2\u049d\u0484\3\2\2\2\u049d\u0489\3\2\2\2\u049d\u048e\3\2"+
		"\2\2\u049d\u0493\3\2\2\2\u049d\u0498\3\2\2\2\u049e\u04a1\3\2\2\2\u049f"+
		"\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0[\3\2\2\2\u04a1\u049f\3\2\2\2"+
		"\u04a2\u04a3\b/\1\2\u04a3\u04a4\5^\60\2\u04a4\u04a5\b/\1\2\u04a5\u04ad"+
		"\3\2\2\2\u04a6\u04a7\f\4\2\2\u04a7\u04a8\7\21\2\2\u04a8\u04a9\5^\60\2"+
		"\u04a9\u04aa\b/\1\2\u04aa\u04ac\3\2\2\2\u04ab\u04a6\3\2\2\2\u04ac\u04af"+
		"\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae]\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04b0\u04b1\7O\2\2\u04b1\u04b2\7\20\2\2\u04b2\u04b3\5`"+
		"\61\2\u04b3\u04b4\b\60\1\2\u04b4\u04bb\3\2\2\2\u04b5\u04b6\7O\2\2\u04b6"+
		"\u04b7\7\20\2\2\u04b7\u04b8\5Z.\2\u04b8\u04b9\b\60\1\2\u04b9\u04bb\3\2"+
		"\2\2\u04ba\u04b0\3\2\2\2\u04ba\u04b5\3\2\2\2\u04bb_\3\2\2\2\u04bc\u04bd"+
		"\b\61\1\2\u04bd\u04be\7(\2\2\u04be\u04bf\7\20\2\2\u04bf\u04c0\7\20\2\2"+
		"\u04c0\u04c1\7\32\2\2\u04c1\u04c2\7\t\2\2\u04c2\u04c3\5`\61\2\u04c3\u04c4"+
		"\7\21\2\2\u04c4\u04c5\5`\61\2\u04c5\u04c6\7\n\2\2\u04c6\u04c7\b\61\1\2"+
		"\u04c7\u04fd\3\2\2\2\u04c8\u04c9\7)\2\2\u04c9\u04ca\7\20\2\2\u04ca\u04cb"+
		"\7\20\2\2\u04cb\u04cc\7\33\2\2\u04cc\u04cd\7\t\2\2\u04cd\u04ce\5`\61\2"+
		"\u04ce\u04cf\7\21\2\2\u04cf\u04d0\5`\61\2\u04d0\u04d1\7\n\2\2\u04d1\u04d2"+
		"\b\61\1\2\u04d2\u04fd\3\2\2\2\u04d3\u04d4\7\31\2\2\u04d4\u04d5\5`\61\24"+
		"\u04d5\u04d6\b\61\1\2\u04d6\u04fd\3\2\2\2\u04d7\u04d8\7\t\2\2\u04d8\u04d9"+
		"\5`\61\2\u04d9\u04da\7\n\2\2\u04da\u04db\b\61\1\2\u04db\u04fd\3\2\2\2"+
		"\u04dc\u04dd\7\t\2\2\u04dd\u04de\5`\61\2\u04de\u04df\7\n\2\2\u04df\u04e0"+
		"\b\61\1\2\u04e0\u04fd\3\2\2\2\u04e1\u04e2\7\b\2\2\u04e2\u04e3\5`\61\17"+
		"\u04e3\u04e4\b\61\1\2\u04e4\u04fd\3\2\2\2\u04e5\u04e6\7O\2\2\u04e6\u04e7"+
		"\7\24\2\2\u04e7\u04e8\7@\2\2\u04e8\u04e9\7\t\2\2\u04e9\u04ea\5`\61\2\u04ea"+
		"\u04eb\7\n\2\2\u04eb\u04ec\b\61\1\2\u04ec\u04fd\3\2\2\2\u04ed\u04ee\7"+
		"O\2\2\u04ee\u04ef\7\13\2\2\u04ef\u04f0\5\\/\2\u04f0\u04f1\7\f\2\2\u04f1"+
		"\u04f2\b\61\1\2\u04f2\u04fd\3\2\2\2\u04f3\u04f4\5h\65\2\u04f4\u04f5\b"+
		"\61\1\2\u04f5\u04fd\3\2\2\2\u04f6\u04f7\5b\62\2\u04f7\u04f8\b\61\1\2\u04f8"+
		"\u04fd\3\2\2\2\u04f9\u04fa\5d\63\2\u04fa\u04fb\b\61\1\2\u04fb\u04fd\3"+
		"\2\2\2\u04fc\u04bc\3\2\2\2\u04fc\u04c8\3\2\2\2\u04fc\u04d3\3\2\2\2\u04fc"+
		"\u04d7\3\2\2\2\u04fc\u04dc\3\2\2\2\u04fc\u04e1\3\2\2\2\u04fc\u04e5\3\2"+
		"\2\2\u04fc\u04ed\3\2\2\2\u04fc\u04f3\3\2\2\2\u04fc\u04f6\3\2\2\2\u04fc"+
		"\u04f9\3\2\2\2\u04fd\u0551\3\2\2\2\u04fe\u04ff\f\27\2\2\u04ff\u0500\7"+
		"\34\2\2\u0500\u0501\5`\61\30\u0501\u0502\b\61\1\2\u0502\u0550\3\2\2\2"+
		"\u0503\u0504\f\26\2\2\u0504\u0505\t\2\2\2\u0505\u0506\5`\61\27\u0506\u0507"+
		"\b\61\1\2\u0507\u0550\3\2\2\2\u0508\u0509\f\25\2\2\u0509\u050a\t\3\2\2"+
		"\u050a\u050b\5`\61\26\u050b\u050c\b\61\1\2\u050c\u0550\3\2\2\2\u050d\u050e"+
		"\f\22\2\2\u050e\u050f\t\4\2\2\u050f\u0510\5`\61\23\u0510\u0511\b\61\1"+
		"\2\u0511\u0550\3\2\2\2\u0512\u0513\f\20\2\2\u0513\u0514\t\5\2\2\u0514"+
		"\u0515\5`\61\21\u0515\u0516\b\61\1\2\u0516\u0550\3\2\2\2\u0517\u0518\f"+
		"\32\2\2\u0518\u0519\7\24\2\2\u0519\u051a\7D\2\2\u051a\u051b\7\t\2\2\u051b"+
		"\u051c\7\n\2\2\u051c\u0550\b\61\1\2\u051d\u051e\f\30\2\2\u051e\u051f\7"+
		"\24\2\2\u051f\u0520\7B\2\2\u0520\u0521\7\t\2\2\u0521\u0522\7\n\2\2\u0522"+
		"\u0550\b\61\1\2\u0523\u0524\f\r\2\2\u0524\u0525\7\24\2\2\u0525\u0526\7"+
		"A\2\2\u0526\u0527\7\t\2\2\u0527\u0528\7\25\2\2\u0528\u0529\5`\61\2\u0529"+
		"\u052a\7\n\2\2\u052a\u052b\b\61\1\2\u052b\u0550\3\2\2\2\u052c\u052d\f"+
		"\f\2\2\u052d\u052e\7\24\2\2\u052e\u052f\7C\2\2\u052f\u0530\7\t\2\2\u0530"+
		"\u0531\7\n\2\2\u0531\u0550\b\61\1\2\u0532\u0533\f\13\2\2\u0533\u0534\7"+
		"\24\2\2\u0534\u0535\7E\2\2\u0535\u0536\7\t\2\2\u0536\u0537\7\n\2\2\u0537"+
		"\u0550\b\61\1\2\u0538\u0539\f\n\2\2\u0539\u053a\7F\2\2\u053a\u053b\58"+
		"\35\2\u053b\u053c\b\61\1\2\u053c\u0550\3\2\2\2\u053d\u053e\f\t\2\2\u053e"+
		"\u053f\7\24\2\2\u053f\u0540\7H\2\2\u0540\u0541\7\t\2\2\u0541\u0542\7\n"+
		"\2\2\u0542\u0550\b\61\1\2\u0543\u0544\f\b\2\2\u0544\u0545\7\24\2\2\u0545"+
		"\u0546\7I\2\2\u0546\u0547\7\t\2\2\u0547\u0548\7\n\2\2\u0548\u0550\b\61"+
		"\1\2\u0549\u054a\f\7\2\2\u054a\u054b\7\24\2\2\u054b\u054c\7J\2\2\u054c"+
		"\u054d\7\t\2\2\u054d\u054e\7\n\2\2\u054e\u0550\b\61\1\2\u054f\u04fe\3"+
		"\2\2\2\u054f\u0503\3\2\2\2\u054f\u0508\3\2\2\2\u054f\u050d\3\2\2\2\u054f"+
		"\u0512\3\2\2\2\u054f\u0517\3\2\2\2\u054f\u051d\3\2\2\2\u054f\u0523\3\2"+
		"\2\2\u054f\u052c\3\2\2\2\u054f\u0532\3\2\2\2\u054f\u0538\3\2\2\2\u054f"+
		"\u053d\3\2\2\2\u054f\u0543\3\2\2\2\u054f\u0549\3\2\2\2\u0550\u0553\3\2"+
		"\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552a\3\2\2\2\u0553\u0551"+
		"\3\2\2\2\u0554\u0555\7O\2\2\u0555\u0556\7\t\2\2\u0556\u0557\7\n\2\2\u0557"+
		"\u055f\b\62\1\2\u0558\u0559\7O\2\2\u0559\u055a\7\t\2\2\u055a\u055b\5\34"+
		"\17\2\u055b\u055c\7\n\2\2\u055c\u055d\b\62\1\2\u055d\u055f\3\2\2\2\u055e"+
		"\u0554\3\2\2\2\u055e\u0558\3\2\2\2\u055fc\3\2\2\2\u0560\u0561\7\3\2\2"+
		"\u0561\u056e\b\63\1\2\u0562\u0563\7\4\2\2\u0563\u056e\b\63\1\2\u0564\u0565"+
		"\t\6\2\2\u0565\u056e\b\63\1\2\u0566\u0567\7\6\2\2\u0567\u056e\b\63\1\2"+
		"\u0568\u0569\7\5\2\2\u0569\u056e\b\63\1\2\u056a\u056b\5f\64\2\u056b\u056c"+
		"\b\63\1\2\u056c\u056e\3\2\2\2\u056d\u0560\3\2\2\2\u056d\u0562\3\2\2\2"+
		"\u056d\u0564\3\2\2\2\u056d\u0566\3\2\2\2\u056d\u0568\3\2\2\2\u056d\u056a"+
		"\3\2\2\2\u056ee\3\2\2\2\u056f\u0570\b\64\1\2\u0570\u0571\7O\2\2\u0571"+
		"\u0572\b\64\1\2\u0572\u057b\3\2\2\2\u0573\u0574\f\4\2\2\u0574\u0575\7"+
		"\r\2\2\u0575\u0576\5`\61\2\u0576\u0577\7\16\2\2\u0577\u0578\b\64\1\2\u0578"+
		"\u057a\3\2\2\2\u0579\u0573\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2"+
		"\2\2\u057b\u057c\3\2\2\2\u057cg\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u057f"+
		"\b\65\1\2\u057f\u0580\7O\2\2\u0580\u0581\b\65\1\2\u0581\u0588\3\2\2\2"+
		"\u0582\u0583\f\4\2\2\u0583\u0584\7\24\2\2\u0584\u0585\7O\2\2\u0585\u0587"+
		"\b\65\1\2\u0586\u0582\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2"+
		"\u0588\u0589\3\2\2\2\u0589i\3\2\2\2\u058a\u0588\3\2\2\2\66p\u00a9\u00ba"+
		"\u00c6\u00da\u00ee\u0104\u0183\u0190\u01b8\u01c6\u01d1\u01df\u01e1\u01fc"+
		"\u0224\u0248\u0258\u029b\u02be\u02dd\u02e9\u0301\u030d\u031e\u0328\u033f"+
		"\u034f\u036c\u0375\u038d\u039a\u03a8\u03c6\u03d7\u03e3\u0404\u0411\u0423"+
		"\u0447\u0482\u049d\u049f\u04ad\u04ba\u04fc\u054f\u0551\u055e\u056d\u057b"+
		"\u0588";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
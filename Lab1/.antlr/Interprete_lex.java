// Generated from d:\Github\OCL2_Proyecto2_201900528\Lab1\Interprete_lex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Interprete_lex extends Lexer {
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
		MODULO=76, CAPACITY=77, ID=78, WS=79;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "FLOAT_NUM", "CHAR_2", "CADENA", "CMT", "EXCLA", "PARA", "PARC", 
			"LLAVEA", "LLAVEC", "CORCHA", "CORCHC", "PYC", "DPTS", "COMA", "DEFAUL", 
			"OR_MATCH", "PNT", "PUNTERO", "MUL", "SUM", "DIV", "REST", "POW", "POWF", 
			"MODUL", "DIFERENCIACION", "IGUALACION", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "IGUAL", "AND", "OR", "TRUE", "FALSE", "INT", "FLOAT", 
			"BOOLEAN", "CHAR", "STR", "STRING", "USIZE", "PRINT", "LET", "MUT", "IF", 
			"ELSE", "LOOP", "WHILE", "MATCH", "FOR", "IN", "BRE", "STRUCT", "VEC", 
			"NEWI", "WITH_CAP", "PUSH", "INSERT", "REMOVE", "CONTAINS", "LEN", "TOCHARS", 
			"TOSTRING", "TOOWNED", "CASTEO", "CONTINIU", "ABOSLU", "RAIZITA", "CLONATION", 
			"FUNCT", "RETURNASO", "PUBLI", "MODULO", "CAPACITY", "ID", "WS"
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
			"'return'", "'pub'", "'mod'", "'capacity'"
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
			"RAIZITA", "CLONATION", "FUNCT", "RETURNASO", "PUBLI", "MODULO", "CAPACITY", 
			"ID", "WS"
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


	public Interprete_lex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interprete_lex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u0217\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\6\2\u00a3\n\2\r\2\16"+
		"\2\u00a4\3\3\6\3\u00a8\n\3\r\3\16\3\u00a9\3\3\3\3\6\3\u00ae\n\3\r\3\16"+
		"\3\u00af\5\3\u00b2\n\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00ba\n\5\f\5\16\5"+
		"\u00bd\13\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u00c5\n\6\r\6\16\6\u00c6\3\6\5"+
		"\6\u00ca\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\5:\u0187"+
		"\n:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3="+
		"\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L"+
		"\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\7O\u020c\nO\fO\16"+
		"O\u020f\13O\3P\6P\u0212\nP\rP\16P\u0213\3P\3P\3\u00c6\2Q\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\3\2\b\3\2\62;\3\2$"+
		"$\3\3\f\f\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\2\u021f\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\3\u00a2\3\2\2\2\5\u00a7\3\2\2\2\7\u00b3\3\2\2\2\t\u00b7\3\2\2\2\13"+
		"\u00c0\3\2\2\2\r\u00cd\3\2\2\2\17\u00cf\3\2\2\2\21\u00d1\3\2\2\2\23\u00d3"+
		"\3\2\2\2\25\u00d5\3\2\2\2\27\u00d7\3\2\2\2\31\u00d9\3\2\2\2\33\u00db\3"+
		"\2\2\2\35\u00dd\3\2\2\2\37\u00df\3\2\2\2!\u00e1\3\2\2\2#\u00e3\3\2\2\2"+
		"%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3"+
		"\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2\63\u00f5\3\2\2\2\65\u00fa\3\2\2"+
		"\2\67\u00fc\3\2\2\29\u00ff\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2?\u0108"+
		"\3\2\2\2A\u010a\3\2\2\2C\u010c\3\2\2\2E\u010e\3\2\2\2G\u0111\3\2\2\2I"+
		"\u0114\3\2\2\2K\u0119\3\2\2\2M\u011f\3\2\2\2O\u0123\3\2\2\2Q\u0127\3\2"+
		"\2\2S\u012c\3\2\2\2U\u0131\3\2\2\2W\u0136\3\2\2\2Y\u013d\3\2\2\2[\u0143"+
		"\3\2\2\2]\u014b\3\2\2\2_\u014f\3\2\2\2a\u0153\3\2\2\2c\u0156\3\2\2\2e"+
		"\u015b\3\2\2\2g\u0160\3\2\2\2i\u0166\3\2\2\2k\u016c\3\2\2\2m\u0170\3\2"+
		"\2\2o\u0173\3\2\2\2q\u0179\3\2\2\2s\u0186\3\2\2\2u\u0188\3\2\2\2w\u018c"+
		"\3\2\2\2y\u019a\3\2\2\2{\u019f\3\2\2\2}\u01a6\3\2\2\2\177\u01ad\3\2\2"+
		"\2\u0081\u01b6\3\2\2\2\u0083\u01ba\3\2\2\2\u0085\u01c0\3\2\2\2\u0087\u01ca"+
		"\3\2\2\2\u0089\u01d3\3\2\2\2\u008b\u01d6\3\2\2\2\u008d\u01df\3\2\2\2\u008f"+
		"\u01e3\3\2\2\2\u0091\u01e8\3\2\2\2\u0093\u01ee\3\2\2\2\u0095\u01f1\3\2"+
		"\2\2\u0097\u01f8\3\2\2\2\u0099\u01fc\3\2\2\2\u009b\u0200\3\2\2\2\u009d"+
		"\u0209\3\2\2\2\u009f\u0211\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\4\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ad"+
		"\7\60\2\2\u00ac\u00ae\t\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7)\2\2\u00b4"+
		"\u00b5\n\3\2\2\u00b5\u00b6\7)\2\2\u00b6\b\3\2\2\2\u00b7\u00bb\7$\2\2\u00b8"+
		"\u00ba\n\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7$\2\2\u00bf\n\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2\7\61\2"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\6\2\2\u00cc\f\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce\16\3\2\2\2\u00cf"+
		"\u00d0\7*\2\2\u00d0\20\3\2\2\2\u00d1\u00d2\7+\2\2\u00d2\22\3\2\2\2\u00d3"+
		"\u00d4\7}\2\2\u00d4\24\3\2\2\2\u00d5\u00d6\7\177\2\2\u00d6\26\3\2\2\2"+
		"\u00d7\u00d8\7]\2\2\u00d8\30\3\2\2\2\u00d9\u00da\7_\2\2\u00da\32\3\2\2"+
		"\2\u00db\u00dc\7=\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7<\2\2\u00de\36\3\2"+
		"\2\2\u00df\u00e0\7.\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7a\2\2\u00e2\"\3\2"+
		"\2\2\u00e3\u00e4\7~\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6&\3\2"+
		"\2\2\u00e7\u00e8\7(\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea*\3\2\2"+
		"\2\u00eb\u00ec\7-\2\2\u00ec,\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee.\3\2\2"+
		"\2\u00ef\u00f0\7/\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7y\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\u00f8\7y\2\2\u00f8\u00f9\7h\2\2\u00f9\64\3\2\2\2\u00fa\u00fb"+
		"\7\'\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\7?\2\2\u00fe"+
		"8\3\2\2\2\u00ff\u0100\7?\2\2\u0100\u0101\7?\2\2\u0101:\3\2\2\2\u0102\u0103"+
		"\7@\2\2\u0103\u0104\7?\2\2\u0104<\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107"+
		"\7?\2\2\u0107>\3\2\2\2\u0108\u0109\7@\2\2\u0109@\3\2\2\2\u010a\u010b\7"+
		">\2\2\u010bB\3\2\2\2\u010c\u010d\7?\2\2\u010dD\3\2\2\2\u010e\u010f\7("+
		"\2\2\u010f\u0110\7(\2\2\u0110F\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113"+
		"\7~\2\2\u0113H\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117"+
		"\7w\2\2\u0117\u0118\7g\2\2\u0118J\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b"+
		"\7c\2\2\u011b\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2\u011e"+
		"L\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\78\2\2\u0121\u0122\7\66\2\2\u0122"+
		"N\3\2\2\2\u0123\u0124\7h\2\2\u0124\u0125\78\2\2\u0125\u0126\7\66\2\2\u0126"+
		"P\3\2\2\2\u0127\u0128\7d\2\2\u0128\u0129\7q\2\2\u0129\u012a\7q\2\2\u012a"+
		"\u012b\7n\2\2\u012bR\3\2\2\2\u012c\u012d\7e\2\2\u012d\u012e\7j\2\2\u012e"+
		"\u012f\7c\2\2\u012f\u0130\7t\2\2\u0130T\3\2\2\2\u0131\u0132\7(\2\2\u0132"+
		"\u0133\7u\2\2\u0133\u0134\7v\2\2\u0134\u0135\7t\2\2\u0135V\3\2\2\2\u0136"+
		"\u0137\7U\2\2\u0137\u0138\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a\7k\2\2"+
		"\u013a\u013b\7p\2\2\u013b\u013c\7i\2\2\u013cX\3\2\2\2\u013d\u013e\7w\2"+
		"\2\u013e\u013f\7u\2\2\u013f\u0140\7k\2\2\u0140\u0141\7|\2\2\u0141\u0142"+
		"\7g\2\2\u0142Z\3\2\2\2\u0143\u0144\7r\2\2\u0144\u0145\7t\2\2\u0145\u0146"+
		"\7k\2\2\u0146\u0147\7p\2\2\u0147\u0148\7v\2\2\u0148\u0149\7n\2\2\u0149"+
		"\u014a\7p\2\2\u014a\\\3\2\2\2\u014b\u014c\7n\2\2\u014c\u014d\7g\2\2\u014d"+
		"\u014e\7v\2\2\u014e^\3\2\2\2\u014f\u0150\7o\2\2\u0150\u0151\7w\2\2\u0151"+
		"\u0152\7v\2\2\u0152`\3\2\2\2\u0153\u0154\7k\2\2\u0154\u0155\7h\2\2\u0155"+
		"b\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158\7n\2\2\u0158\u0159\7u\2\2\u0159"+
		"\u015a\7g\2\2\u015ad\3\2\2\2\u015b\u015c\7n\2\2\u015c\u015d\7q\2\2\u015d"+
		"\u015e\7q\2\2\u015e\u015f\7r\2\2\u015ff\3\2\2\2\u0160\u0161\7y\2\2\u0161"+
		"\u0162\7j\2\2\u0162\u0163\7k\2\2\u0163\u0164\7n\2\2\u0164\u0165\7g\2\2"+
		"\u0165h\3\2\2\2\u0166\u0167\7o\2\2\u0167\u0168\7c\2\2\u0168\u0169\7v\2"+
		"\2\u0169\u016a\7e\2\2\u016a\u016b\7j\2\2\u016bj\3\2\2\2\u016c\u016d\7"+
		"h\2\2\u016d\u016e\7q\2\2\u016e\u016f\7t\2\2\u016fl\3\2\2\2\u0170\u0171"+
		"\7k\2\2\u0171\u0172\7p\2\2\u0172n\3\2\2\2\u0173\u0174\7d\2\2\u0174\u0175"+
		"\7t\2\2\u0175\u0176\7g\2\2\u0176\u0177\7c\2\2\u0177\u0178\7m\2\2\u0178"+
		"p\3\2\2\2\u0179\u017a\7u\2\2\u017a\u017b\7v\2\2\u017b\u017c\7t\2\2\u017c"+
		"\u017d\7w\2\2\u017d\u017e\7e\2\2\u017e\u017f\7v\2\2\u017fr\3\2\2\2\u0180"+
		"\u0181\7X\2\2\u0181\u0182\7g\2\2\u0182\u0187\7e\2\2\u0183\u0184\7x\2\2"+
		"\u0184\u0185\7g\2\2\u0185\u0187\7e\2\2\u0186\u0180\3\2\2\2\u0186\u0183"+
		"\3\2\2\2\u0187t\3\2\2\2\u0188\u0189\7p\2\2\u0189\u018a\7g\2\2\u018a\u018b"+
		"\7y\2\2\u018bv\3\2\2\2\u018c\u018d\7y\2\2\u018d\u018e\7k\2\2\u018e\u018f"+
		"\7v\2\2\u018f\u0190\7j\2\2\u0190\u0191\7a\2\2\u0191\u0192\7e\2\2\u0192"+
		"\u0193\7c\2\2\u0193\u0194\7r\2\2\u0194\u0195\7c\2\2\u0195\u0196\7e\2\2"+
		"\u0196\u0197\7k\2\2\u0197\u0198\7v\2\2\u0198\u0199\7{\2\2\u0199x\3\2\2"+
		"\2\u019a\u019b\7r\2\2\u019b\u019c\7w\2\2\u019c\u019d\7u\2\2\u019d\u019e"+
		"\7j\2\2\u019ez\3\2\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2"+
		"\7u\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7v\2\2\u01a5"+
		"|\3\2\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7o\2\2\u01a9"+
		"\u01aa\7q\2\2\u01aa\u01ab\7x\2\2\u01ab\u01ac\7g\2\2\u01ac~\3\2\2\2\u01ad"+
		"\u01ae\7e\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7v\2\2"+
		"\u01b1\u01b2\7c\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5"+
		"\7u\2\2\u01b5\u0080\3\2\2\2\u01b6\u01b7\7n\2\2\u01b7\u01b8\7g\2\2\u01b8"+
		"\u01b9\7p\2\2\u01b9\u0082\3\2\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7j\2"+
		"\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7t\2\2\u01be\u01bf\7u\2\2\u01bf\u0084"+
		"\3\2\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7a\2\2\u01c3"+
		"\u01c4\7u\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7k\2\2"+
		"\u01c7\u01c8\7p\2\2\u01c8\u01c9\7i\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb"+
		"\7v\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7a\2\2\u01cd\u01ce\7q\2\2\u01ce"+
		"\u01cf\7y\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7f\2\2"+
		"\u01d2\u0088\3\2\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7u\2\2\u01d5\u008a"+
		"\3\2\2\2\u01d6\u01d7\7e\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7p\2\2\u01d9"+
		"\u01da\7v\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7w\2\2"+
		"\u01dd\u01de\7g\2\2\u01de\u008c\3\2\2\2\u01df\u01e0\7c\2\2\u01e0\u01e1"+
		"\7d\2\2\u01e1\u01e2\7u\2\2\u01e2\u008e\3\2\2\2\u01e3\u01e4\7u\2\2\u01e4"+
		"\u01e5\7s\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7v\2\2\u01e7\u0090\3\2\2"+
		"\2\u01e8\u01e9\7e\2\2\u01e9\u01ea\7n\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec"+
		"\7p\2\2\u01ec\u01ed\7g\2\2\u01ed\u0092\3\2\2\2\u01ee\u01ef\7h\2\2\u01ef"+
		"\u01f0\7p\2\2\u01f0\u0094\3\2\2\2\u01f1\u01f2\7t\2\2\u01f2\u01f3\7g\2"+
		"\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7w\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7"+
		"\7p\2\2\u01f7\u0096\3\2\2\2\u01f8\u01f9\7r\2\2\u01f9\u01fa\7w\2\2\u01fa"+
		"\u01fb\7d\2\2\u01fb\u0098\3\2\2\2\u01fc\u01fd\7o\2\2\u01fd\u01fe\7q\2"+
		"\2\u01fe\u01ff\7f\2\2\u01ff\u009a\3\2\2\2\u0200\u0201\7e\2\2\u0201\u0202"+
		"\7c\2\2\u0202\u0203\7r\2\2\u0203\u0204\7c\2\2\u0204\u0205\7e\2\2\u0205"+
		"\u0206\7k\2\2\u0206\u0207\7v\2\2\u0207\u0208\7{\2\2\u0208\u009c\3\2\2"+
		"\2\u0209\u020d\t\5\2\2\u020a\u020c\t\6\2\2\u020b\u020a\3\2\2\2\u020c\u020f"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u009e\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0212\t\7\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\bP\2\2\u0216\u00a0\3\2\2\2\r\2\u00a4\u00a9\u00af\u00b1\u00bb\u00c6"+
		"\u00c9\u0186\u020d\u0213\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
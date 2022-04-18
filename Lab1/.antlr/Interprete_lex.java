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
		MODULO=76, ID=77, WS=78;
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
			"FUNCT", "RETURNASO", "PUBLI", "MODULO", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u020c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\6\2\u00a1\n\2\r\2\16\2\u00a2"+
		"\3\3\6\3\u00a6\n\3\r\3\16\3\u00a7\3\3\3\3\6\3\u00ac\n\3\r\3\16\3\u00ad"+
		"\5\3\u00b0\n\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00b8\n\5\f\5\16\5\u00bb\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u00c3\n\6\r\6\16\6\u00c4\3\6\5\6\u00c8"+
		"\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\5:\u0185\n:\3;\3"+
		";\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3"+
		"H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3"+
		"M\3M\3M\3M\3N\3N\7N\u0201\nN\fN\16N\u0204\13N\3O\6O\u0207\nO\rO\16O\u0208"+
		"\3O\3O\3\u00c4\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\3\2\b\3\2\62;\3\2$$\3\3\f\f\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17"+
		"\"\"^^\2\u0214\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\3\u00a0\3\2\2\2\5\u00a5\3\2\2\2\7\u00b1\3\2\2\2\t\u00b5\3\2\2\2\13"+
		"\u00be\3\2\2\2\r\u00cb\3\2\2\2\17\u00cd\3\2\2\2\21\u00cf\3\2\2\2\23\u00d1"+
		"\3\2\2\2\25\u00d3\3\2\2\2\27\u00d5\3\2\2\2\31\u00d7\3\2\2\2\33\u00d9\3"+
		"\2\2\2\35\u00db\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2\2#\u00e1\3\2\2\2"+
		"%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9\3\2\2\2-\u00eb\3"+
		"\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63\u00f3\3\2\2\2\65\u00f8\3\2\2"+
		"\2\67\u00fa\3\2\2\29\u00fd\3\2\2\2;\u0100\3\2\2\2=\u0103\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G\u010f\3\2\2\2I"+
		"\u0112\3\2\2\2K\u0117\3\2\2\2M\u011d\3\2\2\2O\u0121\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u012a\3\2\2\2U\u012f\3\2\2\2W\u0134\3\2\2\2Y\u013b\3\2\2\2[\u0141"+
		"\3\2\2\2]\u0149\3\2\2\2_\u014d\3\2\2\2a\u0151\3\2\2\2c\u0154\3\2\2\2e"+
		"\u0159\3\2\2\2g\u015e\3\2\2\2i\u0164\3\2\2\2k\u016a\3\2\2\2m\u016e\3\2"+
		"\2\2o\u0171\3\2\2\2q\u0177\3\2\2\2s\u0184\3\2\2\2u\u0186\3\2\2\2w\u018a"+
		"\3\2\2\2y\u0198\3\2\2\2{\u019d\3\2\2\2}\u01a4\3\2\2\2\177\u01ab\3\2\2"+
		"\2\u0081\u01b4\3\2\2\2\u0083\u01b8\3\2\2\2\u0085\u01be\3\2\2\2\u0087\u01c8"+
		"\3\2\2\2\u0089\u01d1\3\2\2\2\u008b\u01d4\3\2\2\2\u008d\u01dd\3\2\2\2\u008f"+
		"\u01e1\3\2\2\2\u0091\u01e6\3\2\2\2\u0093\u01ec\3\2\2\2\u0095\u01ef\3\2"+
		"\2\2\u0097\u01f6\3\2\2\2\u0099\u01fa\3\2\2\2\u009b\u01fe\3\2\2\2\u009d"+
		"\u0206\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\4\3\2\2\2\u00a4\u00a6"+
		"\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00af\3\2\2\2\u00a9\u00ab\7\60\2\2\u00aa\u00ac\t"+
		"\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\6\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b3\n\3\2\2\u00b3\u00b4"+
		"\7)\2\2\u00b4\b\3\2\2\2\u00b5\u00b9\7$\2\2\u00b6\u00b8\n\3\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\n\3\2\2\2"+
		"\u00be\u00bf\7\61\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3"+
		"\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\t\4\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\6\2\2\u00ca\f\3\2\2\2\u00cb"+
		"\u00cc\7#\2\2\u00cc\16\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce\20\3\2\2\2\u00cf"+
		"\u00d0\7+\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7}\2\2\u00d2\24\3\2\2\2\u00d3"+
		"\u00d4\7\177\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\7]\2\2\u00d6\30\3\2\2\2"+
		"\u00d7\u00d8\7_\2\2\u00d8\32\3\2\2\2\u00d9\u00da\7=\2\2\u00da\34\3\2\2"+
		"\2\u00db\u00dc\7<\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7.\2\2\u00de \3\2\2"+
		"\2\u00df\u00e0\7a\2\2\u00e0\"\3\2\2\2\u00e1\u00e2\7~\2\2\u00e2$\3\2\2"+
		"\2\u00e3\u00e4\7\60\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7(\2\2\u00e6(\3\2\2"+
		"\2\u00e7\u00e8\7,\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea,\3\2\2\2"+
		"\u00eb\u00ec\7\61\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\60\3\2\2"+
		"\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7y\2\2\u00f2\62\3"+
		"\2\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7y\2\2\u00f6"+
		"\u00f7\7h\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7\'\2\2\u00f9\66\3\2\2\2\u00fa"+
		"\u00fb\7#\2\2\u00fb\u00fc\7?\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe"+
		"\u00ff\7?\2\2\u00ff:\3\2\2\2\u0100\u0101\7@\2\2\u0101\u0102\7?\2\2\u0102"+
		"<\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105\7?\2\2\u0105>\3\2\2\2\u0106\u0107"+
		"\7@\2\2\u0107@\3\2\2\2\u0108\u0109\7>\2\2\u0109B\3\2\2\2\u010a\u010b\7"+
		"?\2\2\u010bD\3\2\2\2\u010c\u010d\7(\2\2\u010d\u010e\7(\2\2\u010eF\3\2"+
		"\2\2\u010f\u0110\7~\2\2\u0110\u0111\7~\2\2\u0111H\3\2\2\2\u0112\u0113"+
		"\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115\u0116\7g\2\2\u0116"+
		"J\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7c\2\2\u0119\u011a\7n\2\2\u011a"+
		"\u011b\7u\2\2\u011b\u011c\7g\2\2\u011cL\3\2\2\2\u011d\u011e\7k\2\2\u011e"+
		"\u011f\78\2\2\u011f\u0120\7\66\2\2\u0120N\3\2\2\2\u0121\u0122\7h\2\2\u0122"+
		"\u0123\78\2\2\u0123\u0124\7\66\2\2\u0124P\3\2\2\2\u0125\u0126\7d\2\2\u0126"+
		"\u0127\7q\2\2\u0127\u0128\7q\2\2\u0128\u0129\7n\2\2\u0129R\3\2\2\2\u012a"+
		"\u012b\7e\2\2\u012b\u012c\7j\2\2\u012c\u012d\7c\2\2\u012d\u012e\7t\2\2"+
		"\u012eT\3\2\2\2\u012f\u0130\7(\2\2\u0130\u0131\7u\2\2\u0131\u0132\7v\2"+
		"\2\u0132\u0133\7t\2\2\u0133V\3\2\2\2\u0134\u0135\7U\2\2\u0135\u0136\7"+
		"v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a"+
		"\7i\2\2\u013aX\3\2\2\2\u013b\u013c\7w\2\2\u013c\u013d\7u\2\2\u013d\u013e"+
		"\7k\2\2\u013e\u013f\7|\2\2\u013f\u0140\7g\2\2\u0140Z\3\2\2\2\u0141\u0142"+
		"\7r\2\2\u0142\u0143\7t\2\2\u0143\u0144\7k\2\2\u0144\u0145\7p\2\2\u0145"+
		"\u0146\7v\2\2\u0146\u0147\7n\2\2\u0147\u0148\7p\2\2\u0148\\\3\2\2\2\u0149"+
		"\u014a\7n\2\2\u014a\u014b\7g\2\2\u014b\u014c\7v\2\2\u014c^\3\2\2\2\u014d"+
		"\u014e\7o\2\2\u014e\u014f\7w\2\2\u014f\u0150\7v\2\2\u0150`\3\2\2\2\u0151"+
		"\u0152\7k\2\2\u0152\u0153\7h\2\2\u0153b\3\2\2\2\u0154\u0155\7g\2\2\u0155"+
		"\u0156\7n\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158d\3\2\2\2\u0159"+
		"\u015a\7n\2\2\u015a\u015b\7q\2\2\u015b\u015c\7q\2\2\u015c\u015d\7r\2\2"+
		"\u015df\3\2\2\2\u015e\u015f\7y\2\2\u015f\u0160\7j\2\2\u0160\u0161\7k\2"+
		"\2\u0161\u0162\7n\2\2\u0162\u0163\7g\2\2\u0163h\3\2\2\2\u0164\u0165\7"+
		"o\2\2\u0165\u0166\7c\2\2\u0166\u0167\7v\2\2\u0167\u0168\7e\2\2\u0168\u0169"+
		"\7j\2\2\u0169j\3\2\2\2\u016a\u016b\7h\2\2\u016b\u016c\7q\2\2\u016c\u016d"+
		"\7t\2\2\u016dl\3\2\2\2\u016e\u016f\7k\2\2\u016f\u0170\7p\2\2\u0170n\3"+
		"\2\2\2\u0171\u0172\7d\2\2\u0172\u0173\7t\2\2\u0173\u0174\7g\2\2\u0174"+
		"\u0175\7c\2\2\u0175\u0176\7m\2\2\u0176p\3\2\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0179\7v\2\2\u0179\u017a\7t\2\2\u017a\u017b\7w\2\2\u017b\u017c\7e\2\2"+
		"\u017c\u017d\7v\2\2\u017dr\3\2\2\2\u017e\u017f\7X\2\2\u017f\u0180\7g\2"+
		"\2\u0180\u0185\7e\2\2\u0181\u0182\7x\2\2\u0182\u0183\7g\2\2\u0183\u0185"+
		"\7e\2\2\u0184\u017e\3\2\2\2\u0184\u0181\3\2\2\2\u0185t\3\2\2\2\u0186\u0187"+
		"\7p\2\2\u0187\u0188\7g\2\2\u0188\u0189\7y\2\2\u0189v\3\2\2\2\u018a\u018b"+
		"\7y\2\2\u018b\u018c\7k\2\2\u018c\u018d\7v\2\2\u018d\u018e\7j\2\2\u018e"+
		"\u018f\7a\2\2\u018f\u0190\7e\2\2\u0190\u0191\7c\2\2\u0191\u0192\7r\2\2"+
		"\u0192\u0193\7c\2\2\u0193\u0194\7e\2\2\u0194\u0195\7k\2\2\u0195\u0196"+
		"\7v\2\2\u0196\u0197\7{\2\2\u0197x\3\2\2\2\u0198\u0199\7r\2\2\u0199\u019a"+
		"\7w\2\2\u019a\u019b\7u\2\2\u019b\u019c\7j\2\2\u019cz\3\2\2\2\u019d\u019e"+
		"\7k\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7g\2\2\u01a1"+
		"\u01a2\7t\2\2\u01a2\u01a3\7v\2\2\u01a3|\3\2\2\2\u01a4\u01a5\7t\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6\u01a7\7o\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7x\2\2"+
		"\u01a9\u01aa\7g\2\2\u01aa~\3\2\2\2\u01ab\u01ac\7e\2\2\u01ac\u01ad\7q\2"+
		"\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1"+
		"\7k\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7u\2\2\u01b3\u0080\3\2\2\2\u01b4"+
		"\u01b5\7n\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7p\2\2\u01b7\u0082\3\2\2"+
		"\2\u01b8\u01b9\7e\2\2\u01b9\u01ba\7j\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc"+
		"\7t\2\2\u01bc\u01bd\7u\2\2\u01bd\u0084\3\2\2\2\u01be\u01bf\7v\2\2\u01bf"+
		"\u01c0\7q\2\2\u01c0\u01c1\7a\2\2\u01c1\u01c2\7u\2\2\u01c2\u01c3\7v\2\2"+
		"\u01c3\u01c4\7t\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7"+
		"\7i\2\2\u01c7\u0086\3\2\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7q\2\2\u01ca"+
		"\u01cb\7a\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7y\2\2\u01cd\u01ce\7p\2\2"+
		"\u01ce\u01cf\7g\2\2\u01cf\u01d0\7f\2\2\u01d0\u0088\3\2\2\2\u01d1\u01d2"+
		"\7c\2\2\u01d2\u01d3\7u\2\2\u01d3\u008a\3\2\2\2\u01d4\u01d5\7e\2\2\u01d5"+
		"\u01d6\7q\2\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7k\2\2"+
		"\u01d9\u01da\7p\2\2\u01da\u01db\7w\2\2\u01db\u01dc\7g\2\2\u01dc\u008c"+
		"\3\2\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7d\2\2\u01df\u01e0\7u\2\2\u01e0"+
		"\u008e\3\2\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3\7s\2\2\u01e3\u01e4\7t\2"+
		"\2\u01e4\u01e5\7v\2\2\u01e5\u0090\3\2\2\2\u01e6\u01e7\7e\2\2\u01e7\u01e8"+
		"\7n\2\2\u01e8\u01e9\7q\2\2\u01e9\u01ea\7p\2\2\u01ea\u01eb\7g\2\2\u01eb"+
		"\u0092\3\2\2\2\u01ec\u01ed\7h\2\2\u01ed\u01ee\7p\2\2\u01ee\u0094\3\2\2"+
		"\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3"+
		"\7w\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7p\2\2\u01f5\u0096\3\2\2\2\u01f6"+
		"\u01f7\7r\2\2\u01f7\u01f8\7w\2\2\u01f8\u01f9\7d\2\2\u01f9\u0098\3\2\2"+
		"\2\u01fa\u01fb\7o\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7f\2\2\u01fd\u009a"+
		"\3\2\2\2\u01fe\u0202\t\5\2\2\u01ff\u0201\t\6\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u009c\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0207\t\7\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\bO\2\2\u020b\u009e\3\2\2\2\r\2\u00a2\u00a7\u00ad\u00af"+
		"\u00b9\u00c4\u00c7\u0184\u0202\u0208\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package main.antlr4.generatecode;// Generated from BSharp.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BSharpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WHITESPACE=20, WORD=21, WRITE=22, DOUBLEVALUE=23, 
		BOOLVALUE=24, DOUBLE=25, BOOL=26, SEMICOLON=27, EQUAL=28, IF=29, ELSE=30, 
		WHILE=31, VARIABLE=32, NEWLINE=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "DIGIT", "LOWERCASE", "UPPERCASE", "TRUE", "FALSE", 
		"WHITESPACE", "WORD", "WRITE", "DOUBLEVALUE", "BOOLVALUE", "DOUBLE", "BOOL", 
		"SEMICOLON", "EQUAL", "IF", "ELSE", "WHILE", "VARIABLE", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'end'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", 
		"' '", null, "'write'", null, null, "'double'", "'bool'", "';'", "'='", 
		"'if'", "'else'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "WHITESPACE", "WORD", 
		"WRITE", "DOUBLEVALUE", "BOOLVALUE", "DOUBLE", "BOOL", "SEMICOLON", "EQUAL", 
		"IF", "ELSE", "WHILE", "VARIABLE", "NEWLINE"
	};
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


	public BSharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BSharp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\6\33\u009a\n\33\r\33\16\33\u009b\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00a7\n\35\r\35\16\35\u00a8"+
		"\3\35\3\35\6\35\u00ad\n\35\r\35\16\35\u00ae\3\36\3\36\5\36\u00b3\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\6&\u00d6\n&\r&\16&\u00d7"+
		"\3\'\5\'\u00db\n\'\3\'\3\'\6\'\u00df\n\'\r\'\16\'\u00e0\2\2(\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26\65\27\67\309\31;\32=\33?\34A\35C"+
		"\36E\37G I!K\"M#\3\2\5\3\2\62;\3\2c|\3\2C\\\2\u00e9\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7Y\3\2\2\2\t[\3\2"+
		"\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25h\3"+
		"\2\2\2\27k\3\2\2\2\31n\3\2\2\2\33q\3\2\2\2\35t\3\2\2\2\37w\3\2\2\2!y\3"+
		"\2\2\2#{\3\2\2\2%}\3\2\2\2\'\177\3\2\2\2)\u0081\3\2\2\2+\u0083\3\2\2\2"+
		"-\u0085\3\2\2\2/\u0087\3\2\2\2\61\u008c\3\2\2\2\63\u0092\3\2\2\2\65\u0094"+
		"\3\2\2\2\67\u009f\3\2\2\29\u00a6\3\2\2\2;\u00b2\3\2\2\2=\u00b4\3\2\2\2"+
		"?\u00bb\3\2\2\2A\u00c0\3\2\2\2C\u00c2\3\2\2\2E\u00c4\3\2\2\2G\u00c7\3"+
		"\2\2\2I\u00cc\3\2\2\2K\u00d5\3\2\2\2M\u00de\3\2\2\2OP\7u\2\2PQ\7v\2\2"+
		"QR\7c\2\2RS\7t\2\2ST\7v\2\2T\4\3\2\2\2UV\7g\2\2VW\7p\2\2WX\7f\2\2X\6\3"+
		"\2\2\2YZ\7*\2\2Z\b\3\2\2\2[\\\7+\2\2\\\n\3\2\2\2]^\7}\2\2^\f\3\2\2\2_"+
		"`\7\177\2\2`\16\3\2\2\2ab\7>\2\2b\20\3\2\2\2cd\7@\2\2d\22\3\2\2\2ef\7"+
		">\2\2fg\7?\2\2g\24\3\2\2\2hi\7@\2\2ij\7?\2\2j\26\3\2\2\2kl\7?\2\2lm\7"+
		"?\2\2m\30\3\2\2\2no\7#\2\2op\7?\2\2p\32\3\2\2\2qr\7(\2\2rs\7(\2\2s\34"+
		"\3\2\2\2tu\7~\2\2uv\7~\2\2v\36\3\2\2\2wx\7#\2\2x \3\2\2\2yz\7-\2\2z\""+
		"\3\2\2\2{|\7/\2\2|$\3\2\2\2}~\7,\2\2~&\3\2\2\2\177\u0080\7\61\2\2\u0080"+
		"(\3\2\2\2\u0081\u0082\t\2\2\2\u0082*\3\2\2\2\u0083\u0084\t\3\2\2\u0084"+
		",\3\2\2\2\u0085\u0086\t\4\2\2\u0086.\3\2\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2\u008b\60\3\2\2\2\u008c"+
		"\u008d\7H\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7g\2\2\u0091\62\3\2\2\2\u0092\u0093\7\"\2\2\u0093\64\3\2"+
		"\2\2\u0094\u0099\7$\2\2\u0095\u009a\5+\26\2\u0096\u009a\5-\27\2\u0097"+
		"\u009a\7a\2\2\u0098\u009a\5\63\32\2\u0099\u0095\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7$"+
		"\2\2\u009e\66\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a48\3\2\2\2\u00a5\u00a7"+
		"\5)\25\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00ad\5"+
		")\25\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af:\3\2\2\2\u00b0\u00b3\5/\30\2\u00b1\u00b3\5\61\31"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3<\3\2\2\2\u00b4\u00b5"+
		"\7f\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7d\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7d\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7n\2\2\u00bf@\3\2\2\2\u00c0"+
		"\u00c1\7=\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3D\3\2\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7h\2\2\u00c6F\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7n\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cbH\3\2\2\2\u00cc\u00cd"+
		"\7y\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7n\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1J\3\2\2\2\u00d2\u00d6\5+\26\2\u00d3\u00d6\5-\27\2\u00d4"+
		"\u00d6\7a\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"L\3\2\2\2\u00d9\u00db\7\17\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00df\7\f\2\2\u00dd\u00df\7\17\2\2\u00de\u00da"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1N\3\2\2\2\r\2\u0099\u009b\u00a8\u00ae\u00b2\u00d5"+
		"\u00d7\u00da\u00de\u00e0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
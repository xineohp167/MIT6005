// Generated from Expr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, OP_LT=3, OP_GT=4, OP_LE=5, OP_GE=6, OP_EQ=7, OP_NE=8, 
		OP_AND=9, OP_OR=10, OP_NOT=11, OP_ADD=12, OP_SUB=13, OP_MUL=14, OP_DIV=15, 
		OP_MOD=16, BOOLEAN_LITERAL=17, NUMERIC_LITERAL=18, STRING_LITERAL=19, 
		WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "OP_LT", "OP_GT", "OP_LE", "OP_GE", "OP_EQ", "OP_NE", 
		"OP_AND", "OP_OR", "OP_NOT", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_MOD", 
		"BOOLEAN_LITERAL", "NUMERIC_LITERAL", "STRING_LITERAL", "WS", "DIGIT", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, null, null, null, null, null, null, null, 
		"'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "OP_LT", "OP_GT", "OP_LE", "OP_GE", "OP_EQ", "OP_NE", 
		"OP_AND", "OP_OR", "OP_NOT", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_MOD", 
		"BOOLEAN_LITERAL", "NUMERIC_LITERAL", "STRING_LITERAL", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4j\n\4\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6\3\6\5\6w\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\5\b\u0087\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a3\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c3\n\22\3\23\6\23\u00c6\n\23\r\23\16\23\u00c7\3\23\3\23"+
		"\7\23\u00cc\n\23\f\23\16\23\u00cf\13\23\5\23\u00d1\n\23\3\23\3\23\5\23"+
		"\u00d5\n\23\3\23\6\23\u00d8\n\23\r\23\16\23\u00d9\5\23\u00dc\n\23\3\23"+
		"\3\23\6\23\u00e0\n\23\r\23\16\23\u00e1\3\23\3\23\5\23\u00e6\n\23\3\23"+
		"\6\23\u00e9\n\23\r\23\16\23\u00ea\5\23\u00ed\n\23\5\23\u00ef\n\23\3\24"+
		"\3\24\3\24\3\24\7\24\u00f5\n\24\f\24\16\24\u00f8\13\24\3\24\3\24\3\25"+
		"\6\25\u00fd\n\25\r\25\16\25\u00fe\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2"+
		"O\2Q\2S\2U\2W\2Y\2[\2]\2_\2\3\2 \4\2--//\3\2))\5\2\13\f\17\17\"\"\3\2"+
		"\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4"+
		"\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSs"+
		"s\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2"+
		"\\\\||\2\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3a\3\2\2\2\5c\3\2"+
		"\2\2\7i\3\2\2\2\to\3\2\2\2\13v\3\2\2\2\r}\3\2\2\2\17\u0086\3\2\2\2\21"+
		"\u0093\3\2\2\2\23\u009b\3\2\2\2\25\u00a2\3\2\2\2\27\u00a9\3\2\2\2\31\u00ab"+
		"\3\2\2\2\33\u00ad\3\2\2\2\35\u00af\3\2\2\2\37\u00b1\3\2\2\2!\u00b3\3\2"+
		"\2\2#\u00c2\3\2\2\2%\u00ee\3\2\2\2\'\u00f0\3\2\2\2)\u00fc\3\2\2\2+\u0102"+
		"\3\2\2\2-\u0104\3\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2\63\u010a\3\2\2"+
		"\2\65\u010c\3\2\2\2\67\u010e\3\2\2\29\u0110\3\2\2\2;\u0112\3\2\2\2=\u0114"+
		"\3\2\2\2?\u0116\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E\u011c\3\2\2\2G"+
		"\u011e\3\2\2\2I\u0120\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2\2\2O\u0126\3\2"+
		"\2\2Q\u0128\3\2\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2W\u012e\3\2\2\2Y\u0130"+
		"\3\2\2\2[\u0132\3\2\2\2]\u0134\3\2\2\2_\u0136\3\2\2\2ab\7*\2\2b\4\3\2"+
		"\2\2cd\7+\2\2d\6\3\2\2\2ef\5C\"\2fg\5S*\2gj\3\2\2\2hj\7>\2\2ie\3\2\2\2"+
		"ih\3\2\2\2j\b\3\2\2\2kl\59\35\2lm\5S*\2mp\3\2\2\2np\7@\2\2ok\3\2\2\2o"+
		"n\3\2\2\2p\n\3\2\2\2qr\5C\"\2rs\5\65\33\2sw\3\2\2\2tu\7>\2\2uw\7?\2\2"+
		"vq\3\2\2\2vt\3\2\2\2w\f\3\2\2\2xy\59\35\2yz\5\65\33\2z~\3\2\2\2{|\7@\2"+
		"\2|~\7?\2\2}x\3\2\2\2}{\3\2\2\2~\16\3\2\2\2\177\u0080\5\65\33\2\u0080"+
		"\u0081\5M\'\2\u0081\u0087\3\2\2\2\u0082\u0084\7?\2\2\u0083\u0085\7?\2"+
		"\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\177"+
		"\3\2\2\2\u0086\u0082\3\2\2\2\u0087\20\3\2\2\2\u0088\u0089\5G$\2\u0089"+
		"\u008a\5\65\33\2\u008a\u0094\3\2\2\2\u008b\u008c\5G$\2\u008c\u008d\5\65"+
		"\33\2\u008d\u008e\5M\'\2\u008e\u0094\3\2\2\2\u008f\u0090\7#\2\2\u0090"+
		"\u0094\7?\2\2\u0091\u0092\7>\2\2\u0092\u0094\7@\2\2\u0093\u0088\3\2\2"+
		"\2\u0093\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\22"+
		"\3\2\2\2\u0095\u0096\5-\27\2\u0096\u0097\5G$\2\u0097\u0098\5\63\32\2\u0098"+
		"\u009c\3\2\2\2\u0099\u009a\7(\2\2\u009a\u009c\7(\2\2\u009b\u0095\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009c\24\3\2\2\2\u009d\u009e\5I%\2\u009e\u009f"+
		"\5O(\2\u009f\u00a3\3\2\2\2\u00a0\u00a1\7~\2\2\u00a1\u00a3\7~\2\2\u00a2"+
		"\u009d\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\5G$\2"+
		"\u00a5\u00a6\5I%\2\u00a6\u00a7\5S*\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\7"+
		"#\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\30\3\2\2\2\u00ab\u00ac"+
		"\7-\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\34\3\2\2\2\u00af\u00b0"+
		"\7,\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2 \3\2\2\2\u00b3\u00b4"+
		"\7\'\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\5S*\2\u00b6\u00b7\5O(\2\u00b7\u00b8"+
		"\5U+\2\u00b8\u00b9\5\65\33\2\u00b9\u00c3\3\2\2\2\u00ba\u00c3\5S*\2\u00bb"+
		"\u00bc\5\67\34\2\u00bc\u00bd\5-\27\2\u00bd\u00be\5C\"\2\u00be\u00bf\5"+
		"Q)\2\u00bf\u00c0\5\65\33\2\u00c0\u00c3\3\2\2\2\u00c1\u00c3\5\67\34\2\u00c2"+
		"\u00b5\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3$\3\2\2\2\u00c4\u00c6\5+\26\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d0\3\2\2\2\u00c9"+
		"\u00cd\7\60\2\2\u00ca\u00cc\5+\26\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00db\3\2"+
		"\2\2\u00d2\u00d4\5\65\33\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5+\26\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00ef\3\2"+
		"\2\2\u00dd\u00df\7\60\2\2\u00de\u00e0\5+\26\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ec\3\2"+
		"\2\2\u00e3\u00e5\5\65\33\2\u00e4\u00e6\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5+\26\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00c5\3\2\2\2\u00ee\u00dd\3\2\2\2\u00ef&\3\2\2\2\u00f0\u00f6"+
		"\7)\2\2\u00f1\u00f5\n\3\2\2\u00f2\u00f3\7)\2\2\u00f3\u00f5\7)\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7)\2\2\u00fa(\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\b\25\2\2\u0101*\3\2\2\2\u0102\u0103\t\5\2\2\u0103,\3"+
		"\2\2\2\u0104\u0105\t\6\2\2\u0105.\3\2\2\2\u0106\u0107\t\7\2\2\u0107\60"+
		"\3\2\2\2\u0108\u0109\t\b\2\2\u0109\62\3\2\2\2\u010a\u010b\t\t\2\2\u010b"+
		"\64\3\2\2\2\u010c\u010d\t\n\2\2\u010d\66\3\2\2\2\u010e\u010f\t\13\2\2"+
		"\u010f8\3\2\2\2\u0110\u0111\t\f\2\2\u0111:\3\2\2\2\u0112\u0113\t\r\2\2"+
		"\u0113<\3\2\2\2\u0114\u0115\t\16\2\2\u0115>\3\2\2\2\u0116\u0117\t\17\2"+
		"\2\u0117@\3\2\2\2\u0118\u0119\t\20\2\2\u0119B\3\2\2\2\u011a\u011b\t\21"+
		"\2\2\u011bD\3\2\2\2\u011c\u011d\t\22\2\2\u011dF\3\2\2\2\u011e\u011f\t"+
		"\23\2\2\u011fH\3\2\2\2\u0120\u0121\t\24\2\2\u0121J\3\2\2\2\u0122\u0123"+
		"\t\25\2\2\u0123L\3\2\2\2\u0124\u0125\t\26\2\2\u0125N\3\2\2\2\u0126\u0127"+
		"\t\27\2\2\u0127P\3\2\2\2\u0128\u0129\t\30\2\2\u0129R\3\2\2\2\u012a\u012b"+
		"\t\31\2\2\u012bT\3\2\2\2\u012c\u012d\t\32\2\2\u012dV\3\2\2\2\u012e\u012f"+
		"\t\33\2\2\u012fX\3\2\2\2\u0130\u0131\t\34\2\2\u0131Z\3\2\2\2\u0132\u0133"+
		"\t\35\2\2\u0133\\\3\2\2\2\u0134\u0135\t\36\2\2\u0135^\3\2\2\2\u0136\u0137"+
		"\t\37\2\2\u0137`\3\2\2\2\34\2iov}\u0084\u0086\u0093\u009b\u00a2\u00a9"+
		"\u00c2\u00c7\u00cd\u00d0\u00d4\u00d9\u00db\u00e1\u00e5\u00ea\u00ec\u00ee"+
		"\u00f4\u00f6\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
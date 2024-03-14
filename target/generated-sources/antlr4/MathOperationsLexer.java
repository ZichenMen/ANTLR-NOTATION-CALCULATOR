// Generated from MathOperations.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MathOperationsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FLOAT=9, 
		INT=10, SCI_NUM=11, PI=12, E=13, LOG=14, LN=15, SIN=16, COS=17, TAN=18, 
		ASIN=19, ACOS=20, ATAN=21, SINH=22, COSH=23, TANH=24, DIGIT=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "FLOAT", 
			"INT", "SCI_NUM", "PI", "E", "LOG", "LN", "SIN", "COS", "TAN", "ASIN", 
			"ACOS", "ATAN", "SINH", "COSH", "TANH", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'!'", "'**'", "'('", "')'", null, 
			null, null, "'pi'", "'e'", "'log'", "'ln'", "'sin'", "'cos'", "'tan'", 
			"'asin'", "'acos'", "'atan'", "'sinh'", "'cosh'", "'tanh'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "FLOAT", "INT", 
			"SCI_NUM", "PI", "E", "LOG", "LN", "SIN", "COS", "TAN", "ASIN", "ACOS", 
			"ATAN", "SINH", "COSH", "TANH", "DIGIT", "WS"
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


	public MathOperationsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathOperations.g4"; }

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
		"\u0004\u0000\u001a\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bH\b\b\u000b\b\f\b"+
		"I\u0001\b\u0001\b\u0005\bN\b\b\n\b\f\bQ\t\b\u0001\b\u0001\b\u0004\bU\b"+
		"\b\u000b\b\f\bV\u0003\bY\b\b\u0001\t\u0004\t\\\b\t\u000b\t\f\t]\u0001"+
		"\n\u0004\na\b\n\u000b\n\f\nb\u0001\n\u0001\n\u0003\ng\b\n\u0001\n\u0004"+
		"\nj\b\n\u000b\n\f\nk\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00a7\b\u0019\u000b\u0019"+
		"\f\u0019\u00a8\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"\u0001\u0000\u0003\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r"+
		"  \u00b4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00037\u0001\u0000"+
		"\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000"+
		"\t=\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rB\u0001\u0000"+
		"\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000"+
		"\u0013[\u0001\u0000\u0000\u0000\u0015`\u0001\u0000\u0000\u0000\u0017m"+
		"\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001br\u0001\u0000"+
		"\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000"+
		"!}\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%\u0085\u0001"+
		"\u0000\u0000\u0000\'\u008a\u0001\u0000\u0000\u0000)\u008f\u0001\u0000"+
		"\u0000\u0000+\u0094\u0001\u0000\u0000\u0000-\u0099\u0001\u0000\u0000\u0000"+
		"/\u009e\u0001\u0000\u0000\u00001\u00a3\u0001\u0000\u0000\u00003\u00a6"+
		"\u0001\u0000\u0000\u000056\u0005+\u0000\u00006\u0002\u0001\u0000\u0000"+
		"\u000078\u0005-\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005*\u0000"+
		"\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005/\u0000\u0000<\b\u0001\u0000"+
		"\u0000\u0000=>\u0005!\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005*"+
		"\u0000\u0000@A\u0005*\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005("+
		"\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005)\u0000\u0000E\u0010"+
		"\u0001\u0000\u0000\u0000FH\u00031\u0018\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KO\u0005.\u0000\u0000LN\u00031\u0018\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PY\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RT\u0005.\u0000\u0000SU\u00031\u0018\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XG\u0001\u0000\u0000\u0000XR\u0001"+
		"\u0000\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Z\\\u00031\u0018\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u0014\u0001\u0000\u0000\u0000_a\u0003"+
		"1\u0018\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"df\u0007\u0000\u0000\u0000eg\u0007\u0001\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hj\u00031\u0018"+
		"\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0016\u0001\u0000\u0000\u0000"+
		"mn\u0005p\u0000\u0000no\u0005i\u0000\u0000o\u0018\u0001\u0000\u0000\u0000"+
		"pq\u0005e\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005l\u0000\u0000"+
		"st\u0005o\u0000\u0000tu\u0005g\u0000\u0000u\u001c\u0001\u0000\u0000\u0000"+
		"vw\u0005l\u0000\u0000wx\u0005n\u0000\u0000x\u001e\u0001\u0000\u0000\u0000"+
		"yz\u0005s\u0000\u0000z{\u0005i\u0000\u0000{|\u0005n\u0000\u0000| \u0001"+
		"\u0000\u0000\u0000}~\u0005c\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f"+
		"\u0080\u0005s\u0000\u0000\u0080\"\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005t\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005n"+
		"\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u0086\u0005a\u0000\u0000"+
		"\u0086\u0087\u0005s\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088\u0089"+
		"\u0005n\u0000\u0000\u0089&\u0001\u0000\u0000\u0000\u008a\u008b\u0005a"+
		"\u0000\u0000\u008b\u008c\u0005c\u0000\u0000\u008c\u008d\u0005o\u0000\u0000"+
		"\u008d\u008e\u0005s\u0000\u0000\u008e(\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005a\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092\u0005a"+
		"\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093*\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005s\u0000\u0000\u0095\u0096\u0005i\u0000\u0000\u0096\u0097"+
		"\u0005n\u0000\u0000\u0097\u0098\u0005h\u0000\u0000\u0098,\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005c\u0000\u0000\u009a\u009b\u0005o\u0000\u0000"+
		"\u009b\u009c\u0005s\u0000\u0000\u009c\u009d\u0005h\u0000\u0000\u009d."+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005"+
		"a\u0000\u0000\u00a0\u00a1\u0005n\u0000\u0000\u00a1\u00a2\u0005h\u0000"+
		"\u0000\u00a20\u0001\u0000\u0000\u0000\u00a3\u00a4\u000209\u0000\u00a4"+
		"2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0007\u0002\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u0019\u0000\u0000\u00ab4\u0001"+
		"\u0000\u0000\u0000\n\u0000IOVX]bfk\u00a8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
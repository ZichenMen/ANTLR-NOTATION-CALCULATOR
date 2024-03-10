// Generated from /Users/zmen/Documents/demo/src/main/antlr4/MathOperations.g4 by ANTLR 4.13.1
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
			null, "'*'", "'/'", "'+'", "'-'", "'**'", "'('", "')'", "'!'", null, 
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
		"\u0004\u0000\u001a\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bH\b\b\u000b\b\f\b"+
		"I\u0001\b\u0001\b\u0004\bN\b\b\u000b\b\f\bO\u0001\t\u0004\tS\b\t\u000b"+
		"\t\f\tT\u0001\n\u0004\nX\b\n\u000b\n\f\nY\u0001\n\u0001\n\u0003\n^\b\n"+
		"\u0001\n\u0004\na\b\n\u000b\n\f\nb\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u009e\b\u0019"+
		"\u000b\u0019\f\u0019\u009f\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a\u0001\u0000\u0003\u0002\u0000EEee\u0002\u0000++-"+
		"-\u0003\u0000\t\n\r\r  \u00a9\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000"+
		"\u00037\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;"+
		"\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b@\u0001\u0000"+
		"\u0000\u0000\rB\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000"+
		"\u0011G\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015W"+
		"\u0001\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019g\u0001\u0000"+
		"\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000"+
		"\u001fp\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000\u0000#x\u0001\u0000"+
		"\u0000\u0000%|\u0001\u0000\u0000\u0000\'\u0081\u0001\u0000\u0000\u0000"+
		")\u0086\u0001\u0000\u0000\u0000+\u008b\u0001\u0000\u0000\u0000-\u0090"+
		"\u0001\u0000\u0000\u0000/\u0095\u0001\u0000\u0000\u00001\u009a\u0001\u0000"+
		"\u0000\u00003\u009d\u0001\u0000\u0000\u000056\u0005*\u0000\u00006\u0002"+
		"\u0001\u0000\u0000\u000078\u0005/\u0000\u00008\u0004\u0001\u0000\u0000"+
		"\u00009:\u0005+\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005-\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=>\u0005*\u0000\u0000>?\u0005*\u0000"+
		"\u0000?\n\u0001\u0000\u0000\u0000@A\u0005(\u0000\u0000A\f\u0001\u0000"+
		"\u0000\u0000BC\u0005)\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005"+
		"!\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FH\u00031\u0018\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0005.\u0000\u0000"+
		"LN\u00031\u0018\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0012\u0001\u0000"+
		"\u0000\u0000QS\u00031\u0018\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0014"+
		"\u0001\u0000\u0000\u0000VX\u00031\u0018\u0000WV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0007\u0000\u0000\u0000\\^\u0007\u0001"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001"+
		"\u0000\u0000\u0000_a\u00031\u0018\u0000`_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c\u0016\u0001\u0000\u0000\u0000de\u0005p\u0000\u0000ef\u0005i\u0000\u0000"+
		"f\u0018\u0001\u0000\u0000\u0000gh\u0005e\u0000\u0000h\u001a\u0001\u0000"+
		"\u0000\u0000ij\u0005l\u0000\u0000jk\u0005o\u0000\u0000kl\u0005g\u0000"+
		"\u0000l\u001c\u0001\u0000\u0000\u0000mn\u0005l\u0000\u0000no\u0005n\u0000"+
		"\u0000o\u001e\u0001\u0000\u0000\u0000pq\u0005s\u0000\u0000qr\u0005i\u0000"+
		"\u0000rs\u0005n\u0000\u0000s \u0001\u0000\u0000\u0000tu\u0005c\u0000\u0000"+
		"uv\u0005o\u0000\u0000vw\u0005s\u0000\u0000w\"\u0001\u0000\u0000\u0000"+
		"xy\u0005t\u0000\u0000yz\u0005a\u0000\u0000z{\u0005n\u0000\u0000{$\u0001"+
		"\u0000\u0000\u0000|}\u0005a\u0000\u0000}~\u0005s\u0000\u0000~\u007f\u0005"+
		"i\u0000\u0000\u007f\u0080\u0005n\u0000\u0000\u0080&\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005a\u0000\u0000\u0082\u0083\u0005c\u0000\u0000\u0083"+
		"\u0084\u0005o\u0000\u0000\u0084\u0085\u0005s\u0000\u0000\u0085(\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087\u0088\u0005t\u0000"+
		"\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005n\u0000\u0000\u008a"+
		"*\u0001\u0000\u0000\u0000\u008b\u008c\u0005s\u0000\u0000\u008c\u008d\u0005"+
		"i\u0000\u0000\u008d\u008e\u0005n\u0000\u0000\u008e\u008f\u0005h\u0000"+
		"\u0000\u008f,\u0001\u0000\u0000\u0000\u0090\u0091\u0005c\u0000\u0000\u0091"+
		"\u0092\u0005o\u0000\u0000\u0092\u0093\u0005s\u0000\u0000\u0093\u0094\u0005"+
		"h\u0000\u0000\u0094.\u0001\u0000\u0000\u0000\u0095\u0096\u0005t\u0000"+
		"\u0000\u0096\u0097\u0005a\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098"+
		"\u0099\u0005h\u0000\u0000\u00990\u0001\u0000\u0000\u0000\u009a\u009b\u0002"+
		"09\u0000\u009b2\u0001\u0000\u0000\u0000\u009c\u009e\u0007\u0002\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006\u0019\u0000"+
		"\u0000\u00a24\u0001\u0000\u0000\u0000\b\u0000IOTY]b\u009f\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
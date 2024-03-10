// Generated from /Users/zmen/Documents/demo/src/main/antlr4/MathOperations.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MathOperationsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FLOAT=9, 
		INT=10, SCI_NUM=11, PI=12, E=13, LOG=14, LN=15, SIN=16, COS=17, TAN=18, 
		ASIN=19, ACOS=20, ATAN=21, SINH=22, COSH=23, TANH=24, DIGIT=25, WS=26;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_trig_function = 2, RULE_hyperbolic_function = 3, 
		RULE_number = 4, RULE_special_number = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "trig_function", "hyperbolic_function", "number", "special_number"
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

	@Override
	public String getGrammarFileName() { return "MathOperations.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathOperationsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MathOperationsParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33553984L) != 0)) {
				{
				{
				setState(12);
				expr(0);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorialContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorialContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaturalLogarithmContext extends ExprContext {
		public TerminalNode LN() { return getToken(MathOperationsParser.LN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NaturalLogarithmContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogarithmBase10Context extends ExprContext {
		public TerminalNode LOG() { return getToken(MathOperationsParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogarithmBase10Context(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrigFunctionsContext extends ExprContext {
		public Trig_functionContext trig_function() {
			return getRuleContext(Trig_functionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TrigFunctionsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HyperbolicFunctionsContext extends ExprContext {
		public Hyperbolic_functionContext hyperbolic_function() {
			return getRuleContext(Hyperbolic_functionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HyperbolicFunctionsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOG:
				{
				_localctx = new LogarithmBase10Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(21);
				match(LOG);
				setState(22);
				match(T__5);
				setState(23);
				expr(0);
				setState(24);
				match(T__6);
				}
				break;
			case LN:
				{
				_localctx = new NaturalLogarithmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(LN);
				setState(27);
				match(T__5);
				setState(28);
				expr(0);
				setState(29);
				match(T__6);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case ASIN:
			case ACOS:
			case ATAN:
				{
				_localctx = new TrigFunctionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				trig_function();
				setState(32);
				match(T__5);
				setState(33);
				expr(0);
				setState(34);
				match(T__6);
				}
				break;
			case SINH:
			case COSH:
			case TANH:
				{
				_localctx = new HyperbolicFunctionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				hyperbolic_function();
				setState(37);
				match(T__5);
				setState(38);
				expr(0);
				setState(39);
				match(T__6);
				}
				break;
			case T__5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__5);
				setState(42);
				expr(0);
				setState(43);
				match(T__6);
				}
				break;
			case FLOAT:
			case INT:
			case SCI_NUM:
			case PI:
			case E:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(49);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(52);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(55);
						match(T__4);
						setState(56);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new FactorialContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(58);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(63);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trig_functionContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(MathOperationsParser.SIN, 0); }
		public TerminalNode COS() { return getToken(MathOperationsParser.COS, 0); }
		public TerminalNode TAN() { return getToken(MathOperationsParser.TAN, 0); }
		public TerminalNode ASIN() { return getToken(MathOperationsParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(MathOperationsParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(MathOperationsParser.ATAN, 0); }
		public Trig_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trig_function; }
	}

	public final Trig_functionContext trig_function() throws RecognitionException {
		Trig_functionContext _localctx = new Trig_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trig_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Hyperbolic_functionContext extends ParserRuleContext {
		public TerminalNode SINH() { return getToken(MathOperationsParser.SINH, 0); }
		public TerminalNode COSH() { return getToken(MathOperationsParser.COSH, 0); }
		public TerminalNode TANH() { return getToken(MathOperationsParser.TANH, 0); }
		public Hyperbolic_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperbolic_function; }
	}

	public final Hyperbolic_functionContext hyperbolic_function() throws RecognitionException {
		Hyperbolic_functionContext _localctx = new Hyperbolic_functionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hyperbolic_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(MathOperationsParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(MathOperationsParser.INT, 0); }
		public TerminalNode SCI_NUM() { return getToken(MathOperationsParser.SCI_NUM, 0); }
		public Special_numberContext special_number() {
			return getRuleContext(Special_numberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(FLOAT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(INT);
				}
				break;
			case SCI_NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(SCI_NUM);
				}
				break;
			case PI:
			case E:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				special_number();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Special_numberContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(MathOperationsParser.PI, 0); }
		public TerminalNode E() { return getToken(MathOperationsParser.E, 0); }
		public Special_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_number; }
	}

	public final Special_numberContext special_number() throws RecognitionException {
		Special_numberContext _localctx = new Special_numberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_special_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==PI || _la==E) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001aM\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"/\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004I\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0001"+
		"\u0002\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0005\u0001\u0000\u0001"+
		"\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0010\u0015\u0001\u0000\u0016"+
		"\u0018\u0001\u0000\f\rS\u0000\u000f\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000"+
		"\u0000\bH\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\f\u000e\u0003"+
		"\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0006\u0001\uffff\uffff\u0000\u0015\u0016\u0005\u000e"+
		"\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000\u0017\u0018\u0003\u0002"+
		"\u0001\u0000\u0018\u0019\u0005\u0007\u0000\u0000\u0019/\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u000f\u0000\u0000\u001b\u001c\u0005\u0006\u0000"+
		"\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0007\u0000"+
		"\u0000\u001e/\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 "+
		"!\u0005\u0006\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0005\u0007\u0000"+
		"\u0000#/\u0001\u0000\u0000\u0000$%\u0003\u0006\u0003\u0000%&\u0005\u0006"+
		"\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005\u0007\u0000\u0000(/\u0001"+
		"\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0003\u0002\u0001\u0000"+
		"+,\u0005\u0007\u0000\u0000,/\u0001\u0000\u0000\u0000-/\u0003\b\u0004\u0000"+
		".\u0014\u0001\u0000\u0000\u0000.\u001a\u0001\u0000\u0000\u0000.\u001f"+
		"\u0001\u0000\u0000\u0000.$\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000"+
		"\u0000.-\u0001\u0000\u0000\u0000/=\u0001\u0000\u0000\u000001\n\n\u0000"+
		"\u000012\u0007\u0000\u0000\u00002<\u0003\u0002\u0001\u000b34\n\t\u0000"+
		"\u000045\u0007\u0001\u0000\u00005<\u0003\u0002\u0001\n67\n\b\u0000\u0000"+
		"78\u0005\u0005\u0000\u00008<\u0003\u0002\u0001\t9:\n\u0003\u0000\u0000"+
		":<\u0005\b\u0000\u0000;0\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000\u0000"+
		";6\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0003\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0007\u0002\u0000\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000BC\u0007\u0003\u0000\u0000C\u0007\u0001"+
		"\u0000\u0000\u0000DI\u0005\t\u0000\u0000EI\u0005\n\u0000\u0000FI\u0005"+
		"\u000b\u0000\u0000GI\u0003\n\u0005\u0000HD\u0001\u0000\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"I\t\u0001\u0000\u0000\u0000JK\u0007\u0004\u0000\u0000K\u000b\u0001\u0000"+
		"\u0000\u0000\u0005\u000f.;=H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
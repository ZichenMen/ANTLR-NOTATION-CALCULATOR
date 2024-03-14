// Generated from MathOperations.g4 by ANTLR 4.13.1
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
		RULE_prog = 0, RULE_expr = 1, RULE_addSubExpr = 2, RULE_mulDivExpr = 3, 
		RULE_factorialExpr = 4, RULE_factorialOp = 5, RULE_powerExpr = 6, RULE_unaryExpr = 7, 
		RULE_atom = 8, RULE_function = 9, RULE_logarithmic_function = 10, RULE_trigonometric_function = 11, 
		RULE_hyperbolic_function = 12, RULE_number = 13, RULE_special_number = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "addSubExpr", "mulDivExpr", "factorialExpr", "factorialOp", 
			"powerExpr", "unaryExpr", "atom", "function", "logarithmic_function", 
			"trigonometric_function", "hyperbolic_function", "number", "special_number"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554054L) != 0)) {
				{
				{
				setState(30);
				expr();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public AddSubExprContext addSubExpr() {
			return getRuleContext(AddSubExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			addSubExpr();
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
	public static class AddSubExprContext extends ParserRuleContext {
		public Token op;
		public List<MulDivExprContext> mulDivExpr() {
			return getRuleContexts(MulDivExprContext.class);
		}
		public MulDivExprContext mulDivExpr(int i) {
			return getRuleContext(MulDivExprContext.class,i);
		}
		public AddSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitAddSubExpr(this);
		}
	}

	public final AddSubExprContext addSubExpr() throws RecognitionException {
		AddSubExprContext _localctx = new AddSubExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addSubExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			mulDivExpr();
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					((AddSubExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
						((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(42);
					mulDivExpr();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class MulDivExprContext extends ParserRuleContext {
		public Token op;
		public List<FactorialExprContext> factorialExpr() {
			return getRuleContexts(FactorialExprContext.class);
		}
		public FactorialExprContext factorialExpr(int i) {
			return getRuleContext(FactorialExprContext.class,i);
		}
		public MulDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitMulDivExpr(this);
		}
	}

	public final MulDivExprContext mulDivExpr() throws RecognitionException {
		MulDivExprContext _localctx = new MulDivExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mulDivExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			factorialExpr();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(49);
				((MulDivExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
					((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(50);
				factorialExpr();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FactorialExprContext extends ParserRuleContext {
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public FactorialOpContext factorialOp() {
			return getRuleContext(FactorialOpContext.class,0);
		}
		public FactorialExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorialExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterFactorialExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitFactorialExpr(this);
		}
	}

	public final FactorialExprContext factorialExpr() throws RecognitionException {
		FactorialExprContext _localctx = new FactorialExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factorialExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			powerExpr();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(57);
				factorialOp();
				}
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
	public static class FactorialOpContext extends ParserRuleContext {
		public FactorialExprContext factorialExpr() {
			return getRuleContext(FactorialExprContext.class,0);
		}
		public FactorialOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorialOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterFactorialOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitFactorialOp(this);
		}
	}

	public final FactorialOpContext factorialOp() throws RecognitionException {
		FactorialOpContext _localctx = new FactorialOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factorialOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__4);
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(61);
				factorialExpr();
				}
				break;
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
	public static class PowerExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public PowerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitPowerExpr(this);
		}
	}

	public final PowerExprContext powerExpr() throws RecognitionException {
		PowerExprContext _localctx = new PowerExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_powerExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			unaryExpr();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(65);
				match(T__5);
				setState(66);
				unaryExpr();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(75);
			atom();
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
	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Special_numberContext special_number() {
			return getRuleContext(Special_numberContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case SCI_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				number();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__6);
				setState(79);
				expr();
				setState(80);
				match(T__7);
				}
				break;
			case LOG:
			case LN:
			case SIN:
			case COS:
			case TAN:
			case ASIN:
			case ACOS:
			case ATAN:
			case SINH:
			case COSH:
			case TANH:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				function();
				}
				break;
			case PI:
			case E:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
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
	public static class FunctionContext extends ParserRuleContext {
		public Logarithmic_functionContext logarithmic_function() {
			return getRuleContext(Logarithmic_functionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Trigonometric_functionContext trigonometric_function() {
			return getRuleContext(Trigonometric_functionContext.class,0);
		}
		public Hyperbolic_functionContext hyperbolic_function() {
			return getRuleContext(Hyperbolic_functionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOG:
			case LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				logarithmic_function();
				setState(87);
				match(T__6);
				setState(88);
				expr();
				setState(89);
				match(T__7);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case ASIN:
			case ACOS:
			case ATAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				trigonometric_function();
				setState(92);
				match(T__6);
				setState(93);
				expr();
				setState(94);
				match(T__7);
				}
				break;
			case SINH:
			case COSH:
			case TANH:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				hyperbolic_function();
				setState(97);
				match(T__6);
				setState(98);
				expr();
				setState(99);
				match(T__7);
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
	public static class Logarithmic_functionContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(MathOperationsParser.LOG, 0); }
		public TerminalNode LN() { return getToken(MathOperationsParser.LN, 0); }
		public Logarithmic_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logarithmic_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterLogarithmic_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitLogarithmic_function(this);
		}
	}

	public final Logarithmic_functionContext logarithmic_function() throws RecognitionException {
		Logarithmic_functionContext _localctx = new Logarithmic_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logarithmic_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==LOG || _la==LN) ) {
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
	public static class Trigonometric_functionContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(MathOperationsParser.SIN, 0); }
		public TerminalNode COS() { return getToken(MathOperationsParser.COS, 0); }
		public TerminalNode TAN() { return getToken(MathOperationsParser.TAN, 0); }
		public TerminalNode ASIN() { return getToken(MathOperationsParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(MathOperationsParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(MathOperationsParser.ATAN, 0); }
		public Trigonometric_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigonometric_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterTrigonometric_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitTrigonometric_function(this);
		}
	}

	public final Trigonometric_functionContext trigonometric_function() throws RecognitionException {
		Trigonometric_functionContext _localctx = new Trigonometric_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_trigonometric_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterHyperbolic_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitHyperbolic_function(this);
		}
	}

	public final Hyperbolic_functionContext hyperbolic_function() throws RecognitionException {
		Hyperbolic_functionContext _localctx = new Hyperbolic_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hyperbolic_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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
	public static class Special_numberContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(MathOperationsParser.PI, 0); }
		public TerminalNode E() { return getToken(MathOperationsParser.E, 0); }
		public Special_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).enterSpecial_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathOperationsListener ) ((MathOperationsListener)listener).exitSpecial_number(this);
		}
	}

	public final Special_numberContext special_number() throws RecognitionException {
		Special_numberContext _localctx = new Special_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_special_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001ar\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002,\b\u0002"+
		"\n\u0002\f\u0002/\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"4\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		";\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005?\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001"+
		"\u0007\u0003\u0007J\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bU\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tf\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0007\u0001\u0000\u0001\u0002\u0001\u0000"+
		"\u0003\u0004\u0001\u0000\u000e\u000f\u0001\u0000\u0010\u0015\u0001\u0000"+
		"\u0016\u0018\u0001\u0000\t\u000b\u0001\u0000\f\rn\u0000!\u0001\u0000\u0000"+
		"\u0000\u0002&\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000"+
		"\u0000\f@\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010"+
		"T\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014g\u0001"+
		"\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000\u0018k\u0001\u0000\u0000"+
		"\u0000\u001am\u0001\u0000\u0000\u0000\u001co\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000"+
		"\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0003\u0004\u0002\u0000"+
		"\'\u0003\u0001\u0000\u0000\u0000(-\u0003\u0006\u0003\u0000)*\u0007\u0000"+
		"\u0000\u0000*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".\u0005\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000005\u0003\b\u0004"+
		"\u000012\u0007\u0001\u0000\u000024\u0003\b\u0004\u000031\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0007\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"8:\u0003\f\u0006\u00009;\u0003\n\u0005\u0000:9\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000<>\u0005\u0005\u0000"+
		"\u0000=?\u0003\b\u0004\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?\u000b\u0001\u0000\u0000\u0000@E\u0003\u000e\u0007\u0000AB\u0005"+
		"\u0006\u0000\u0000BD\u0003\u000e\u0007\u0000CA\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000F\r\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0007\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0003\u0010\b\u0000L\u000f\u0001\u0000\u0000\u0000"+
		"MU\u0003\u001a\r\u0000NO\u0005\u0007\u0000\u0000OP\u0003\u0002\u0001\u0000"+
		"PQ\u0005\b\u0000\u0000QU\u0001\u0000\u0000\u0000RU\u0003\u0012\t\u0000"+
		"SU\u0003\u001c\u000e\u0000TM\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0011\u0001"+
		"\u0000\u0000\u0000VW\u0003\u0014\n\u0000WX\u0005\u0007\u0000\u0000XY\u0003"+
		"\u0002\u0001\u0000YZ\u0005\b\u0000\u0000Zf\u0001\u0000\u0000\u0000[\\"+
		"\u0003\u0016\u000b\u0000\\]\u0005\u0007\u0000\u0000]^\u0003\u0002\u0001"+
		"\u0000^_\u0005\b\u0000\u0000_f\u0001\u0000\u0000\u0000`a\u0003\u0018\f"+
		"\u0000ab\u0005\u0007\u0000\u0000bc\u0003\u0002\u0001\u0000cd\u0005\b\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000eV\u0001\u0000\u0000\u0000e[\u0001\u0000"+
		"\u0000\u0000e`\u0001\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000"+
		"gh\u0007\u0002\u0000\u0000h\u0015\u0001\u0000\u0000\u0000ij\u0007\u0003"+
		"\u0000\u0000j\u0017\u0001\u0000\u0000\u0000kl\u0007\u0004\u0000\u0000"+
		"l\u0019\u0001\u0000\u0000\u0000mn\u0007\u0005\u0000\u0000n\u001b\u0001"+
		"\u0000\u0000\u0000op\u0007\u0006\u0000\u0000p\u001d\u0001\u0000\u0000"+
		"\u0000\t!-5:>EITe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
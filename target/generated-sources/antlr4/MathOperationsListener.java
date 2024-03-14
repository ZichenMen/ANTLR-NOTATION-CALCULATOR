// Generated from MathOperations.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathOperationsParser}.
 */
public interface MathOperationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MathOperationsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MathOperationsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MathOperationsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MathOperationsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MathOperationsParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MathOperationsParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#mulDivExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(MathOperationsParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#mulDivExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(MathOperationsParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#factorialExpr}.
	 * @param ctx the parse tree
	 */
	void enterFactorialExpr(MathOperationsParser.FactorialExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#factorialExpr}.
	 * @param ctx the parse tree
	 */
	void exitFactorialExpr(MathOperationsParser.FactorialExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#factorialOp}.
	 * @param ctx the parse tree
	 */
	void enterFactorialOp(MathOperationsParser.FactorialOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#factorialOp}.
	 * @param ctx the parse tree
	 */
	void exitFactorialOp(MathOperationsParser.FactorialOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(MathOperationsParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(MathOperationsParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MathOperationsParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MathOperationsParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MathOperationsParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MathOperationsParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MathOperationsParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MathOperationsParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#logarithmic_function}.
	 * @param ctx the parse tree
	 */
	void enterLogarithmic_function(MathOperationsParser.Logarithmic_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#logarithmic_function}.
	 * @param ctx the parse tree
	 */
	void exitLogarithmic_function(MathOperationsParser.Logarithmic_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#trigonometric_function}.
	 * @param ctx the parse tree
	 */
	void enterTrigonometric_function(MathOperationsParser.Trigonometric_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#trigonometric_function}.
	 * @param ctx the parse tree
	 */
	void exitTrigonometric_function(MathOperationsParser.Trigonometric_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#hyperbolic_function}.
	 * @param ctx the parse tree
	 */
	void enterHyperbolic_function(MathOperationsParser.Hyperbolic_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#hyperbolic_function}.
	 * @param ctx the parse tree
	 */
	void exitHyperbolic_function(MathOperationsParser.Hyperbolic_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MathOperationsParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MathOperationsParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#special_number}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_number(MathOperationsParser.Special_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#special_number}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_number(MathOperationsParser.Special_numberContext ctx);
}
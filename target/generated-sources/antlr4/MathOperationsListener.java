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
	 * Enter a parse tree produced by the {@code Factorial}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactorial(MathOperationsParser.FactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Factorial}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactorial(MathOperationsParser.FactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNaturalLogarithm(MathOperationsParser.NaturalLogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNaturalLogarithm(MathOperationsParser.NaturalLogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MathOperationsParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MathOperationsParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MathOperationsParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MathOperationsParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MathOperationsParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MathOperationsParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogarithmBase10}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogarithmBase10(MathOperationsParser.LogarithmBase10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LogarithmBase10}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogarithmBase10(MathOperationsParser.LogarithmBase10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigFunctions}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrigFunctions(MathOperationsParser.TrigFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigFunctions}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrigFunctions(MathOperationsParser.TrigFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HyperbolicFunctions}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterHyperbolicFunctions(MathOperationsParser.HyperbolicFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HyperbolicFunctions}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitHyperbolicFunctions(MathOperationsParser.HyperbolicFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(MathOperationsParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(MathOperationsParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(MathOperationsParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MathOperationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(MathOperationsParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOperationsParser#trig_function}.
	 * @param ctx the parse tree
	 */
	void enterTrig_function(MathOperationsParser.Trig_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOperationsParser#trig_function}.
	 * @param ctx the parse tree
	 */
	void exitTrig_function(MathOperationsParser.Trig_functionContext ctx);
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
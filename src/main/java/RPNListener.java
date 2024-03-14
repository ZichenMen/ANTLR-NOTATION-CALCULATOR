import java.util.Stack;

public class RPNListener extends MathOperationsBaseListener {
    private Stack<String> stack = new Stack<>();

    // Retrieves the final RPN expression from the stack
    public String getResult() {
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(stack.pop());
        }
        return result.toString();
    }

    @Override
    public void exitNumber(MathOperationsParser.NumberContext ctx) {
        stack.push(ctx.getText());
    }

    @Override
    public void exitSpecial_number(MathOperationsParser.Special_numberContext ctx) {
        stack.push(ctx.getText());
    }

    @Override
    public void exitFunction(MathOperationsParser.FunctionContext ctx) {
        String function = ctx.start.getText();
        String argument = stack.pop();
        stack.push(argument + " " + function);
    }

    @Override
    public void exitAddSubExpr(MathOperationsParser.AddSubExprContext ctx) {
        if (ctx.op != null && ctx.mulDivExpr().size() > 1) { 
            String right = stack.pop();
            String left = stack.pop();
            stack.push(left + " " + right + " " + ctx.op.getText());
        }
    }

    @Override
    public void exitMulDivExpr(MathOperationsParser.MulDivExprContext ctx) {
        if (ctx.op != null && ctx.factorialExpr().size() > 1) {
            String right = stack.pop();
            String left = stack.pop();
            stack.push(left + " " + right + " " + ctx.op.getText());
        }
    }

    @Override
    public void exitFactorialExpr(MathOperationsParser.FactorialExprContext ctx) {
        if (ctx.factorialOp() != null) {
            String operand = stack.pop();
            stack.push(operand + " !");
        }
    }

    @Override
    public void exitFactorialOp(MathOperationsParser.FactorialOpContext ctx) {
    }

    @Override
    public void exitPowerExpr(MathOperationsParser.PowerExprContext ctx) {
        if (ctx.getChildCount() > 1) { // There's a power operation
            String right = stack.pop();
            String left = stack.pop();
            stack.push(left + " " + right + " **");
        }
    }

    @Override
    public void exitUnaryExpr(MathOperationsParser.UnaryExprContext ctx) {
        // Unary operations (+ or - applied directly to a number or atom)
        if (ctx.getChildCount() > 1) {
            String operand = stack.pop();
            stack.push(ctx.start.getText() + operand); // Prepend the unary operator to the operand
        }
    }

    @Override
    public void exitAtom(MathOperationsParser.AtomContext ctx) {
    }
}

import java.util.Stack;

public class RPNListener extends MathOperationsBaseListener {
    private Stack<String> stack = new Stack<>();

    public String getRPNExpression() {
        StringBuilder rpn = new StringBuilder();
        while (!stack.isEmpty()) {
            rpn.insert(0, stack.pop() + " ");
        }
        return rpn.toString().trim();
    }

    @Override
    public void exitAddSub(MathOperationsParser.AddSubContext ctx) {
        if (stack.size() >= 2) {
            String right = stack.pop();
            String left = stack.pop();
            stack.push(left + " " + right + " " + ctx.op.getText());
        }
    }

    @Override
    public void exitMulDiv(MathOperationsParser.MulDivContext ctx) {
        if (stack.size() >= 2) {
            String right = stack.pop();
            String left = stack.pop();
            stack.push(left + " " + right + " " + ctx.op.getText());
        }
    }

    @Override
    public void exitPower(MathOperationsParser.PowerContext ctx) {
        if (stack.size() >= 2) {
            String right = stack.pop();
            String left = stack.pop();
            // Correctly reflect the precedence by ensuring this operation's result is immediately combined
            stack.push(left + " " + right + " **");
        }
    }

    // Include overrides for other operations similarly, ensuring correct operand order and operation representation

    @Override
    public void exitFactorial(MathOperationsParser.FactorialContext ctx) {
        if (!stack.isEmpty()) {
            String operand = stack.pop();
            stack.push(operand + " !");
        }
    }
    
    @Override
    public void exitLogarithmBase10(MathOperationsParser.LogarithmBase10Context ctx) {
        handleUnaryOperation("log");
    }

    @Override
    public void exitNaturalLogarithm(MathOperationsParser.NaturalLogarithmContext ctx) {
        handleUnaryOperation("ln");
    }

    @Override
    public void exitTrigFunctions(MathOperationsParser.TrigFunctionsContext ctx) {
        handleUnaryOperation(ctx.trig_function().getText());
    }

    @Override
    public void exitHyperbolicFunctions(MathOperationsParser.HyperbolicFunctionsContext ctx) {
        handleUnaryOperation(ctx.hyperbolic_function().getText());
    }
    
    @Override
    public void exitNumberLiteral(MathOperationsParser.NumberLiteralContext ctx) {
        stack.push(ctx.getText());
    }
    
    // Helper method to handle binary operations
    private void handleBinaryOperation(String op) {
        String right = stack.pop();
        String left = stack.pop();
        stack.push(left + " " + right + " " + op);
    }
    
    // Helper method to handle unary operations
    private void handleUnaryOperation(String op) {
        String operand = stack.pop();
        stack.push(operand + " " + op);
    }
}

import java.util.Stack;

public class RPNEvaluator {

    public static double evaluate(String rpnExpression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = rpnExpression.split(" ");
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double subtrahend = stack.pop();
                    stack.push(stack.pop() - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "**":
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                case "!":
                    stack.push(factorial(stack.pop().intValue()));
                    break;
                case "sin":
                    stack.push(Math.sin(Math.toRadians(stack.pop())));
                    break;
                case "cos":
                    stack.push(Math.cos(Math.toRadians(stack.pop())));
                    break;
                case "tan":
                    stack.push(Math.tan(Math.toRadians(stack.pop())));
                    break;
                case "ln":
                    stack.push(Math.log(stack.pop()));
                    break;
                case "log":
                    stack.push(Math.log10(stack.pop()));
                    break;
                case "pi":
                    stack.push(Math.PI);
                    break;
                case "e":
                    stack.push(Math.E);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        
        return stack.pop();
    }

    private static double factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        double result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

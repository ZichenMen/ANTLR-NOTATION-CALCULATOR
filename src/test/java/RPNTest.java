import org.junit.Assert;
import org.junit.Test;

public class RPNTest {

    @Test
    public void testAddition() {
        String rpnExpression = "3 4 +";
        double expectedResult = 7.0;
        double result = RPNEvaluator.evaluate(rpnExpression);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testTrigonometricFunctionSin() {
        // sin(pi/6) should equal 0.5
        // The RPN expression for sin(pi/6) is "pi 6 / sin"
        String rpnExpression = "pi 6 / sin";
        double expectedResult = 0.5;
        double result = RPNEvaluator.evaluate(rpnExpression);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testFactorial() {
        // 5! should equal 120
        // The RPN expression for 5! is "5 !"
        String rpnExpression = "5 !";
        double expectedResult = 120.0;
        double result = RPNEvaluator.evaluate(rpnExpression);
        Assert.assertEquals(expectedResult, result, 0.001);
    }
}

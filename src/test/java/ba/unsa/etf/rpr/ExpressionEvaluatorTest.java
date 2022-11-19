package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaluatorTest {

    /**
     * Correctly written expression
     * Test for operators "+" and "*"
     */
    @Test
    public void Test1(){
        assertEquals(ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"), 101.0);
    }

    /**
     * Correctly written expression
     * Test for "sqrt"
     */
    @Test
    public void Test2(){
        assertEquals(ExpressionEvaluator.evaluate("( 1 + sqrt ( 4 ) )"), 3.0);
    }

    /**
     * Correctly written expression
     * Test for operator "/"
     */
    @Test
    public void Test3(){
        assertEquals(ExpressionEvaluator.evaluate("( 1 + ( 18 / 2 ) )"), 10.0);
    }

    /**
     * Invalid expression
     * Test for when there are no spaces between characters
     */
    @Test
    public void Test4(){
        assertThrows(RuntimeException.class, () -> ExpressionEvaluator.evaluate("(2+3)"));
    }

    /**
     * Invalid expression
     * Test for when there's an extra bracket
     */
    @Test
    public void Test5(){
        assertThrows(RuntimeException.class, () -> ExpressionEvaluator.evaluate("( 2 + 3 ) )"));
    }

    /**
     * Invalid expression
     * Test for an invalid character in expression
     */
    @Test
    public void Test6(){
        assertThrows(RuntimeException.class, () -> ExpressionEvaluator.evaluate("( 2 + a )"));
    }
}
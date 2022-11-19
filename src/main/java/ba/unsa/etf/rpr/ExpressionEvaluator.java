package ba.unsa.etf.rpr;

import java.util.Stack;

/**
 * ExpressionEvaluator class for arithmetic expression evaluation
 * Uses Dijkstra's Two-Stack Algorithm
 * The expressions are written in format ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
 * @author Ilma Husić
 * @version 1.0
 */
public class ExpressionEvaluator
{
    /**
     * evaluate method calculates the given expression
     * uses Dijkstra's Two-Stack Algorithm
     * @param string the expression to evaluate
     * @return the result of the given expression
     * @throws RuntimeException if the expression is not written in given format / contains invalid characters
     */
    public static Double evaluate(String string)
    {

            Stack<String> ops = new Stack<String>();
            Stack<Double> vals = new Stack<Double>();

            String[] str = string.split(" ");

            for (String i : str) {

                if (i.equals("(")) { }

                else if (i.equals("+")) { ops.push(i);}

                else if (i.equals("-")) { ops.push(i);}

                else if (i.equals("*")) { ops.push(i);}

                else if (i.equals("/")) { ops.push(i);}

                else if (i.equals("sqrt")) { ops.push(i);}

                else if (i.equals(")"))
                {
                   String op = ops.pop();
                   double val = vals.pop();

                   if (op.equals("+")) { val = vals.pop() + val;}

                   else if (op.equals("-")) { val = vals.pop() - val;}

                   else if (op.equals("*")) { val = vals.pop() * val;}

                   else if (op.equals("/")) { val = vals.pop() / val;}

                   else if (op.equals("sqrt")) { val = Math.sqrt(val);}

                   vals.push(val);
                }

                else
                {
                    try
                    {
                        vals.push(Double.parseDouble(i));
                    }
                    catch (RuntimeException e)
                    {
                        throw new RuntimeException("Invalid expression!");
                    }
                }
            }

        return vals.pop();

    }
}

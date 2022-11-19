package ba.unsa.etf.rpr;

import java.util.Scanner;

/**
 * Entry point for ExpressionEvaluator
 * @author Ilma Husić
 */
public class App
{
    /**
     * main method
     * @param args String array
     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        String arg = input.nextLine();

         try
         {
             double rez = ExpressionEvaluator.evaluate(arg);
            System.out.println("Result: " + rez);
         }
         catch(RuntimeException e)
         {
            System.out.println(e.getMessage());
         }
    }
}



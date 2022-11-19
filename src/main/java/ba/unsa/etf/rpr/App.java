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
    public static void main(String[] args) throws RuntimeException
    {

        Scanner input = new Scanner(System.in);

        String arg = input.nextLine();

         try
         {
            System.out.println("Rezultat za Dijkstrin algoritam je: " + ExpressionEvaluator.evaluate(arg));
         }
         catch(RuntimeException e)
         {
            System.out.println(e.getMessage());
         }
    }
}



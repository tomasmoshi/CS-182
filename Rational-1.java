import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 * void method rational is used to set the variables to 0
 * the method doRational() is used to see what the user inputs to divide it out and how many times he wants to run it
 * the method setUserInput() is used to have the user input a variable and have it returned
 * the method calcRational() is used to test the denom and divide it out between the num and denom 
 * and then converted it to a string in order to format it to 3 dp and have it be returned as a double.
 * 
 * 
 * @author Tomas Moshi
 * @version v1.0
 * @since 12/3/22
 */
public class Rational implements RationalInterface
{
    private int numerator, denom; 
    private double result;
    Scanner keyboard = new Scanner(System.in);
    /**
     * void method rational is used to set the variables to 0
     */
    public void Rational(){
        numerator = 0;
        denom = 0;
        result = 0;
    }

    /**
     * the method doRational() is used to see what the user inputs to divide it out
     * and how many times he wants to run it
     * @exception InputMismatchException passes the buck to the calling method
     * @exception DivideByZeroException tests to see if theres a 0 in denom
     */
    public void doRational() throws InputMismatchException, DivideByZeroException{
        String continueProgram = "y";
        result = 0;
        do{
            //Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter an int (whole number) for the numerator (ie 3):");
            numerator = setUserInput();
            System.out.println("Enter an int (whole number) for the denominator, but don't enter 0:");
            denom = setUserInput();
            
            result = calcRational();
            System.out.println("With numerator " + numerator +" and denominator " + denom + " the result is: " + String.format("%.3f",result));
            System.out.println("do you want to calculate another number (enter y for yes or n for no).");
            continueProgram = keyboard.next().toUpperCase();

        } while(continueProgram.equals("Y"));
    }

    /**
     * the method setUserInput() is used to have the user input a variable and have it returned
     * @exception InputMismatchException passes the buck to the calling method
     * @return the user input 
     */
    public int setUserInput() throws InputMismatchException{
        return keyboard.nextInt();

    }

    /**
     * the method calcRational() is used to test the denom and divide it out between the num and denom 
     * and then converted it to a string in order to format it to 3 dp and have it be returned as a double.
     * @exception DivideByZeroException tests to see if theres a 0 in denom
     * @return the answer of the result
     */
    public double calcRational() throws DivideByZeroException{
        if(denom == 0){
            throw new DivideByZeroException("That’s not kewl,dont divide by zero");
        }
        return (double)numerator/denom;
    }
}
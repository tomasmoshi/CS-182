import java.util.*;

/**
 * create a try,catch,& finally for the object and exception to test if the 
 * create an object and test it inside Rational class under the doRational method.
 * tests the exceptions in case the user inputs an error in the denom
 * create a final message when the program is finished.
 *
 * @author Tomas Moshi
 * @version v1.0
 */
public class RationalDemo
{ 
    public static void main(String[] args){
       // Rational rat1 = new Rational();
       /**
        * @exception InputMismatchException passes the bucks
        * DivideByZeroException runs in the rational and calc rational methods in case the user inputs a 0 in the denom.
        */
        try
        {
            Rational rat1 = new Rational();
            rat1.doRational();
            //System.out.println("Thanks for using RationalDemo, CU soon");
        }
        catch(InputMismatchException e)
        {
            System.out.println("try running the program again, this time use integers for num and denom"); 
           // System.out.println("Thanks for using RationalDemo, CU soon");

        }
        catch(DivideByZeroException e)
        {
            System.out.println(e.getMessage());
           // System.out.println("Thanks for using RationalDemo, CU soon");

        }
        finally
        {
            System.out.println("Thanks for using RationalDemo, CU soon");
        }
    }

}

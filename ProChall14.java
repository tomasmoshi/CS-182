
import java.util.Scanner;
/**
 * ProChall13 class does the following:
 * 1) create double variables for meal, total, taxAmount, & tipAmount.
 * 2) create a final constant for TIP to which it is 20%.
 * 3) create a scanner object to get the keyboard to input variables.
 * 4) create a meal variable from the scanner object double.
 * 5) create a taxAmount variable through the price of the meal * TIP
 * 6) create a tipAmount varibable through adding meal price + taxAmount * TIP
 * 7) add the total of everything
 * @author Tomas Moshi
 * @version v1.0
 * @since 9/6/22
 */
public class ProChall14{
    public static void main (String[] args){
        //double vars for meal, total, taxAmount, tipAmount
        double meal, total, taxAmount, tipAmount;
        final double TAX = 0.0675;
        //create a double constant for TIP as well that is 20%
        final double TIP = 0.2;
        //Create a Scanner object to get keyboard input
        Scanner keyboard = new Scanner (System.in);
        //Get input
        System.out.print("Enter meal amount: $");
        meal = keyboard.nextDouble();
        taxAmount = meal * TAX;
        tipAmount = (meal+ taxAmount) * TIP;
        total = meal + taxAmount + tipAmount;
        
        //assign meal var with a double from the Scanner object;
        //assign taxAmount var with a double from meal * ???
        //assign tipAmount var with a double from (meal+???) * ???
        //assign total var with the sum of ???
        
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);
    }
}
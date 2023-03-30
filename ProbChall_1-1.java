
import java.util.Scanner;

/**
 * ProbChall_1 asks...(fill in)
 * 1) Import scanner
 * 2)added int number
 * 3) created keyboard scanner
 * 4) asked user to input number
 * 5) created switch program
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 9/13/2022
 */
public class ProbChall_1{
public static void main (String[] args){
int number;

Scanner keyboard = new Scanner(System.in);

 System.out.print("Enter a number between 1 and 3: ");
 number = keyboard.nextInt();
 
        switch(number){
            case 1:
                System.out.println(number + " converted to Roman Numeral is I");
                break;
                
                case 2:
                    System.out.println(number + " converted to Roman Numeral is II");
                break;
                
                case 3:
                    System.out.println(number + " converted to Roman Numeral is III");
                break;
                
                default:
                    System.out.println(number + " Input that was entered is incorrect " 
                                       + "must be between 1 & 3");
                break;
        }
    }
}

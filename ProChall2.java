import java.util.Scanner;

/**
 * Prochall2 Class does the following:
 * 1) create a import java.util.Scanner;
 * 2) create String Vars
 * 3) Char intials
 * 4) get input
 * 5) create initials
 * 6) print output
 * @author Tomas Moshi 
 * @version v1.0
 * @since 9/6/22
 */
public class ProChall2 {
    public static void main(String [] args){
        //add three String vars (ie firstName, middleName, lastName)
        String firstName, middleName,lastName;
        char firstInit, middleInit, lastInit;

        Scanner keyboard = new Scanner (System.in);
        
        //Get input
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();
        System.out.print("Enter your middle name: ");
        middleName = keyboard.next();
        System.out.print("Enter your last name: ");
        lastName = keyboard.next();
        //Repeat the above for middleName and LastName
        
        //create initials
        firstInit = firstName.charAt(0);
        middleInit = middleName.charAt(0);
        lastInit = lastName.charAt(0);
        //Repeat above for middleInit and LastInit
        
        //Print Output
        System.out.println("\nMy name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);
        
    }

}

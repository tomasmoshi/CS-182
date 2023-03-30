import java.util.Scanner;

/**
 * ProChall12 class does the following:
 * 1) Fill in steps here
 * 2) add the string variables
 * 3) add char to get the citys length
 * 4) and scanner keyboard
 * 5) create input
 * 6) print out lines
 * @author Tomas Moshi,
 * @version v1.0
 * @since 9/6/22
 */
public class ProChall12 {
    public static void main (String[] args){
        
        String city;
       
        
        Scanner keyboard = new Scanner (System.in);
        
        //Get input
        System.out.print("Enter a city: ");
        city = keyboard.nextLine();
        
        System.out.println("The city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));
    }
}


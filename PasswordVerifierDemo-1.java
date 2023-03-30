import java.util.Scanner;
/**
 * this demo is used to check from the user if the password is correct or not.
 * make a string and set to no if the user doesn't want the code to keep going
 * create a do while loop for the user input and testing if the passwords meet the requirements
 * 
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/19/22
 */
public class PasswordVerifierDemo
{
    public static void main(String[] args){
        String keepIt = "NO";
        do {
            String answer;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a password, to check. \nValid passwords are 8 chars long, upper case, lower case, and have a number: ");
            answer = keyboard.nextLine();
            PasswordVerifier passwords = new PasswordVerifier(answer);
            if(passwords.testPassword(answer)){
                System.out.println("Password is valid");
            }
            else{
                System.out.println("Password is not valid");
            }
            System.out.print("Enter yes to check another password: ");
            keepIt = keyboard.nextLine().toUpperCase();
        }while(keepIt.equals("YES"));
    }
}
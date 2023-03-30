import java.util.Scanner;
/**
 * Sorting asks the user to sort numbers
 * 1) create sccanner
 * 2) create ints
 * 3) scanner keyboard
 * 4) if else if statement
 * 5) get the print statement
 * 
 * @author Tomas Moshi
 * @version v1.0
 * @since 9/17/22
 */
public class Sorting{
    public static void main (String[] args){

        int n1, n2, n3;
        int low, med, high;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 integers to sort: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();

        if ((n1<=n2) && (n1<=n3)){ 
            low = n1;
            if(n2<=n3){
                med = n2;
                high = n3;
            }
            else{
            med = n3;
            high = n2;
        }

        }

        else if (n2<=n3) { 
            low = n2;
            if (n1<=n3){
            med = n1;
            high = n3;
            }
            else{
            med = n3;
            high = n1;
        }
        }

        else { 
            low = n3;
            if (n1<=n2){
            med = n1;
            high = n2;
            }
            else{
            med = n2;
            high = n1;
        }
        }        
        System.out.print("inputs sorted small to big are: " +
            " " + low + " " + med + " " + high);

        
    }
}
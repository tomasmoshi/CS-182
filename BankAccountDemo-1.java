import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *1) Main method to do a while loop for whether the user will use console or GUI
 *2) useConsole or useGUI will run depending on what I call
 *3) Ask the user to input the variables he wants to run to find out how much he spends
 *4) calculate the interest to find out the variables.
 *5) @author Tomas Moshi
 *6) version v1.0
 *7) Since 10/15/22
 * 
 */
public class BankAccountDemo{
    public static void main (String[] args){
        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 to useConsole or 2 to use GUI");
        userInput = scanner.nextInt();
        while(!(userInput == 1 || userInput == 2)){//Create necessary code that forces a 1 or 2 input
            System.out.println("press 1 to useConsole or 2 to use GUI");
            userInput = scanner.nextInt();
        }
        if (userInput == 1){//if user selects 1, call useConsole()
            useConsole();
        }
        else {//else call useGUI()
            useGUI();

        }

        System.exit(0);//required to close out JOptionPane thread
    }
    //used for menu option 1
    /**
     * useConsole asks the user for the starting balance, the interest, 
    and the number of months to
     * process.  A BankAccount object is created with balance and 
    interest rates as args.
     * A loop runs based on number of months to process.  For each month 
    deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending 
    balance, total deposits,
     * total withdraws, and total interest is displayed.
     */
    public static void useConsole(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   
        //formatting
        BankAccount bankAccount = new BankAccount(balance, intRate);  
        //creates new BankAccount object to use BankAccount methods
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance());
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
    } //end useConsole()
    //used for menu option 2
    /**
     * useGUI asks the user for the starting balance, the interest, and 
    the number of months to
     * process.  A BankAccount object is created with balance and 
    interest rates as args.
     * A loop runs based on number of months to process.  For each month 
    deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending 
    balance, total deposits,
     * total withdraws, and total interest is displayed.
     */
    public static void useGUI(){
        String temp;        //used for deposit and withdraw method calls
        String origBal = JOptionPane.showInputDialog("What is your starting balance");
        String intRate = JOptionPane.showInputDialog("What is your interest rate? (ie enter 3.5 for 3.5%)");
        String strCtr = JOptionPane.showInputDialog("How many months do you want to calculate?");
        int counter = Integer.parseInt(strCtr);
        BankAccount bankAccount = new BankAccount(origBal, intRate);
        for(int i=1;i<=counter;i++){
            temp = JOptionPane.showInputDialog("Enter Month" + i + " deposits");
            bankAccount.makeDeposit(temp);      //could have used 
            //bankAccount.makeDeposit(JOptionPane.showInputDialog("Enter Month" + i + " deposits"));
            //to combine previous 2 steps of code
            temp = JOptionPane.showInputDialog("Enter Month" + i + " withdraws");
            bankAccount.makeWithdraw(temp);
            bankAccount.calcInterest();  //calculates interest each month
        }
        JOptionPane.showMessageDialog(null,String.format("Ending balance: $%,.2f",bankAccount.getBalance()) +
            String.format("\nTotal deposits: $%,.2f",bankAccount.getDeposit()) +
            String.format("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw()) +
            String.format("\nTotal interest: $%,.2f",bankAccount.getInterest()));
    }
}
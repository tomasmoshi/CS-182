
/**
 * 1)BankAccount creates double variables to do the calculations to return the correct variables
 * 2)BankAccount constructor does the math for interest
 * 3)BankAccount method assigns balance and monthlyIntRate
 * 4)makeDeposit methods adds deposit to balance through double and string types.
 * 5)makeWithdraw method uses sub as a subtraction assigned to withdraw and methods through double and string types
 * 6)method calcInterest uses an if elese method to calculate interest on BankAccount
 * 7)double method getBalance returns balance after calculation
 * 8)double method getDeposit returns deposit after calculation
 * 9)double method getWithdraw returns variable withdraw after calculation
 * 10)double method getInterest returns variabe interest after calculation
 * @author Tomas Moshi
 * @version 1.0
 * @sincce 10/23/22
 */
public class BankAccount
{
    private double balance;  //updated based on monthly deposits, withdraw, and interest 
    private double deposit; //tracks total amount deposited over the months  
    private double withdraw; //tracks total amount withdrawn over the months 
    private double interest; //tracks total interest over the months 
    private double monthlyIntRate;//monthly vs annual (APR) rate.  Users provide APR
    /*
     * BankAccount constructor sets interest rate to 0.035
     */
    public BankAccount(){
        //set monthlyIntRate to 0.035/12 (monthly vs annual interest rate). Java sets all others to 0 
        monthlyIntRate = (0.035/12.00);
    }

    /*
     * BankAccount method assigns balance and monthlyIntRate
     * @param inBalance is assigned to balance
     * @param IntRate is assigned to monthlyIntRate to do interest rate variable
     */
    public BankAccount(double inBalance, double intRate){//divide intRate by 100, then by 12 to set monthlyIntRate
        balance = inBalance;
        monthlyIntRate = (intRate/100)/12;
    } 

    /*
     * BankAccount methods assigns balance and monthlyIntRate
     * @param inBalance is assigned to inBalance through String Method
     * @param IntRate is assigned to monthlyIntRate through String Method
     */
    public BankAccount(String inBalance, String intRate){// divide intRate by 100, then by 12 to set monthlyIntRate
        balance = Double.parseDouble(inBalance);
        monthlyIntRate = Double.parseDouble(intRate)/100/12;
    }

    /*
     * makeDeposit methods adds deposit to balance
     * @param add double is assigned to deposit
     * @param add double is assigned to balance
     */
    public void makeDeposit(double add){
        deposit += add;
        balance += add;
    }

    /*
     * makeDeposit methods adds deposit to balance
     * @param deposit is assigned to the string add
     * @param balance is assigned to the string add
     * 
     */
    public void makeDeposit(String add){
        deposit += Double.parseDouble(add);
        balance += Double.parseDouble(add);
    }

    /*
     * makeWithdraw method uses sub as a subtraction assigned to withdraw and methods
     * @param withdraw is assigned to sub to see how much gets taken out
     * @param balance is assigned to sub to subtract the balance in the account
     * 
     */
    public void makeWithdraw(double sub){
        withdraw += sub;
        balance -= sub;
    }

    /*
     * makeWithdraw method uses sub as a subtraction assigned to withdraw and methods
     * @param withdraw uses sub String to get the withdraw
     * @param balance to uses sub String to find the remaining balance.
     * 
     */
    public void makeWithdraw(String sub){
        withdraw += Double.parseDouble(sub);
        balance -= Double.parseDouble(sub);

    }

    /*
     * method calcInterest uses an if elese method to calculate interest on BankAccount
     * 
     */
    public void calcInterest(){//Do not include negative interest.  If balance is greater than 0, calculate interest 
        if(balance>0){ 
            interest += balance * monthlyIntRate; 
            balance += balance * monthlyIntRate; 
        }

    }

    /*
     * double method getBalance returns balance after calculation
     * @return balance to return new balance
     */
    public double getBalance(){
        return balance;

    }

    /*
     * double method getDeposit returns deposit after calculation
     * @return deposit to all the deposits made
     */
    public double getDeposit(){
        return deposit;

    }

    /*
     * double method getWithdraw returns variable withdraw after calculation
     * @return withdraw to all the withdraws made
     */
    public double getWithdraw(){
        return withdraw;
    }

    /*
     * double method getInterest returns variabe interest after calculation
     * @return interest to return all the interest accumulated.
     */
    public double getInterest(){
        return interest;
    }
}
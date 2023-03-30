
/**
 * create private variables
 * use a super() constructor to bring in private fields
 * create constants for hours and hrRate
 * use getters and setters for hours and hrRate
 * print out the persons hourly and salary information in a formatted way
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/27/22
 */
public class Adjunct extends Employee
{
    // instance variables - replace the example below with your own
    private double hours;
    private double hrRate;

    /**
     * Constructor for objects of class Adjunct
     */
    public Adjunct()
    {
        super();
        hours = 0;
        hrRate = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param name is used from the person class
     * @param hireYear is used from the employee clas
     * @param idNum is used from the employee class
     * @param hours is used as a constant for the amount of time they work
     * @param hrRate is used as a constant for their pay
     */
    public Adjunct(String name,int HireYear, String idNum, double hours, double hrRate)
    {
        super(name,HireYear,idNum);
        this.hours = hours;
        this.hrRate = hrRate;

    }

    /**
     *
     * @return the employees salary
     */
    public double getSalary(){
        return hours * hrRate;
    }

    /**
     * the method toString is used to format the amount of hours and adjunct person works and earns
     * @return the persons salary and hourly information
     */
    public String toString(){
        String str;
        str = super.toString() + 
        "Hours:" + hours +
        " Hourly Rate:" + hrRate + 
        " Salary:$" + String.format("%.2f",getSalary()) + "\n";
        return str;
    }
}

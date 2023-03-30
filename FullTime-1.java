
/**
 * FulltTime method is used to extend employee class
 * create a default constructor called super to bring name, idNum, and hireyear
 * use getters and setters for salary
 * print out the salary in a formatted way
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/27/22
 */
public class FullTime extends Employee
{

    private double salary;

    /**
     * Constructor for objects of class FullTime
     */
    public FullTime()
    {
        super();
        salary = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param name is used from the person class
     * @param hireYear is used from the employee clas
     * @param idNum is used from the employee class
     * @param salary is used as a constant
     */
    public FullTime(String name,int hireYear, String idNum, double salary)
    {
        super(name, hireYear, idNum);
        this.salary = salary;
    }

    /**
     * setter
     * @param salary is used as a constant
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * getter
     * @return the employees salary
     */
    public double getSalary(){
        return salary;
    }

    /**
     * this method is used to format the salary of the employee
     * @return the persons salary in a formatted decimal point.
     */
    public String toString(){
        String str;
        str = super.toString() + 
        "Salary:$" + String.format("%.2f",salary) + "\n";
        return str;
    }
}

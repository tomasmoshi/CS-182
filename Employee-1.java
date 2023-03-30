
/**
 * create constants, int, and num for the employees to find out when they were hired and how long theyve work for
 * copy based on idNum - a unique entry in a fictional database
 * Employee method is used for the setters and getters
 * getServiceYears() returns the difference between constant and hireYear. 
 * create setters and getters
 * create a toString to print out their idnumber and how long they've been employed for
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/27/22
 */
public class Employee extends Person //implements PersonInterface
{
    // instance variables - replace the example below with your own
    public static final int CURRENT_YEAR = 2022;
    private int hireYear;
    private String idNum;
    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "onboarding";
    }

    /**
     * Employee method is used for the setters and getters
     *
     * @param name is used for the employees names
     * @param hireYear is used for the year they were hired
     * @param idNum is used for the identifying the number of the employee
     */
    public Employee(String name, int hireYear, String idNum)
    {
        //setName(name);
       super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }
        /**
         * copy based on idNum - a unique entry in a fictional database
         * @param object o is used to test the database
         */
        public boolean equals (Object o){ 
        boolean isEqual = false; 
        if (o != null && getClass()==o.getClass()){ 
            Employee copy = (Employee)o; 
            if (idNum.equalsIgnoreCase(copy.idNum)) 
                isEqual = true; 
        } 
        return isEqual; 
    } 

    /**
     * getServiceYears() returns the difference between constant and hireYear. 
     * @return serviceYear returns the amount of years the employee served
     */
    public int getServiceYears(){
        return CURRENT_YEAR - hireYear;
        
        }

    /**
     * getter
     * @param hireYear is used as a constant for the year the employee was hired
     */
    public void setHireYear(int hireYear){
        this.hireYear = hireYear;
    }

    /**
     * create setter
     * @return the year they were hired
     */
    public int getHireYear(){
        return hireYear;
    }

    /**
     * create getter
     * @param idNum is used as a constant for the employees idnumber
     */
    public void setIDNum(String idNum){
        this.idNum = idNum;
    }

    /**
     * 
     * @return the idnumber of the employee
     */
    public String getIDNum(){
        return idNum;
    }

    /**
     * this method returns the employees information
     * @return the employees information, salary, and service
     */
    public String toString(){
        String str;
        str = super.toString() +  
        "ID Number: " + idNum + "\n" +
        "Year Hired: " + hireYear +
        " Years of Service: " + getServiceYears() + "\n";
        return str;
    }

}

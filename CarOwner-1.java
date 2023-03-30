import java.io.*;
/**
 * create a super to import strings from citizen class
 * create constructors for the persons registration
 * create setters and getters
 * print out the output
 *
 * @author Tomas Moshi
 * @version v1.0
 */
public class CarOwner extends Citizen implements CarOwnerInterface, Serializable
{
    // instance variables - replace the example below with your own
    private String license;
    private int month;
    private int year;
    /**
     * constructor
     */
    public CarOwner(){
        super("no first name","no last name");
        license = "no license";
        month = 0;
        year = 0;

    }

    /**
     * constructor
     * @param inFirstName called from the citizen class
     * @param inLastName called from the citizen class
     * @param inLicense is set to License
     * @param inMonth is set to Month
     * @param inYear is set to Year
     */
    public CarOwner(String inFirstName, String inLastName, String inLicense, int inMonth, int inYear){

        super(inFirstName,inLastName);
        license = inLicense;
        month = inMonth;
        year = inYear;

    }

    /**
     * setter
     * @param inLicense is set to license
     */
    public void setLicense(String inLicense)
    {
        license = inLicense;
    }

    /**
     * getter
     * @return the persons license number
     */
    public String getLicense()
    {
        return license;
    }

    /**
     * setter
     * @param inMonth is set to month
     */
    public void setmonth(int inMonth)
    {
        month = inMonth;
    }

    /**
     * @return the license number month expiration
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * setter
     * @param inYear is set the persons year on license
     */
    public void setYear(int inYear)
    {
        year = inYear;
    }

    /**
     * getter
     * @return the persons year
     */
    public int getYear()
    {
        return year;
    }

    /** 
     * overrides compareTo to sort CarOwners based on chronological 
     * of month and year car was last.  If param is null or not CarOwner 
    class, returns -1 
     * if object total months < param total months, temp is -1, object total 
    months > param total months, temp is 1 
     * otherwise the same and temp is 0 
     * @return temp 
     */ 
    public int compareTo(Object o){ 
        int temp = -1; 
        if(o != null && this.getClass() == o.getClass()){ 
            CarOwner copy = (CarOwner)o; 
            if((year*12+this.month) < (copy.year*12+copy.month)) 
                temp = -1; 
            else if ((year*12+this.month) > (copy.year*12+copy.month)) 
                temp = 1; 
            else //the same 
                temp = 0; 
        } 
        return temp; 
    } 

    /**
     * @return the formatted output for the persons record 
     */
    public String toString()
    {
        String output = String.format("%-20s %-10s %-3s", super.toString(),license, (month + "/" + year));
        return output;
        //String str;
        //str = String.format("%-30s,%-20s,%-10s", super.toString() + "\t" + license + "\t" + (month + "/" + year));
        //return str;

    }
}


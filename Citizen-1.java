import java.io.*;
/**
 * the point of the citizen class is to use setters and getters 
 * and print out the persons first and last name.
 *
 * @author Tomas Moshi
 * @version v1.0
 */
public class Citizen implements CitizenInterface, Serializable
{
    private String firstName;
    private String lastName;
    /**
     * constructor to set the persons name to an undenfined name
     */
    public Citizen()
    {
        firstName = "no name";
        lastName = "no name";
    }

    /**
     * constructor
     * @param inFirst set to firstName
     * @param inLast set to lastName
     */
    public Citizen(String inFirst, String inLast)
    {
        firstName = inFirst;
        lastName = inLast;
    }

    /**
     * setter
     * @param inFirst is set to firstName
     */
    public void setFirstName(String inFirst)
    {
        firstName = inFirst;
    }

    /**
     * getter
     * @return the persons first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * setter
     * @param inLast is set to lastName
     */
    public void setLastName(String inLast)
    {
        lastName = inLast;
    }

    /**
     * getter
     * @return the persons last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * printing out the persons name
     * @return the persons first and last name.
     */
    public String toString()
    {
        String str = firstName + " " + lastName;
        return str;
    }

}


/**
 * This program is to search for the name the width and height of a certain room
 * 1)create private variables that can be used to not create security breaches
 * 2)Assign RoomSize to new double and string refrences.
 * 3)getArea method is used to find the area by multiplying length * width.
 * 4)toString method helps return our values that we assign for the dimensions.
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/11/22
 */
public class RoomSize
{
    private String name; 
    private double length; 
    private double width;
    /**
     * method RoomSize assigns the private strings and doubles to the params.
     * @param inName is assigned to private string name.
     * @param inLen is assigned to private double length.
     * @param inWidth is assigned to private double width.
     */
    public RoomSize(String inName, double inLen, double inWidth){
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * copy constructor sets length and width to 0
     * @param roomsize object to copy
     */
    public RoomSize(RoomSize roomsize)
    {
        this.name = roomsize.name;
        this.length = roomsize.length;
        this.width = roomsize.width;
    }

    /**
     * getArea method is used to find the area by multiplying length * width.
     * @return the area of the room
     */
    public double getArea(){
        return length * width;
    }

    /**
     * toString method is used to return the values.
     * @return name returns the right variables for the class.
     */

    public String toString(){
        String str = ("\nRoom name: " + name + "\nLength: " + length + "\nWidth: " + width + "\nArea: " + String.format("%.2f",getArea()));
        return str;
    }
}
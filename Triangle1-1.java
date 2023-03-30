
import java.util.Scanner;
/**
 * Create a triangle program:
 * 1) create public class triangle to set variables and strings
 * 2) public triangle created for starting method
 * 3) set new variables and strings to public Triangle
 * 4) create a output for all the variables and strings
 * 5) get the input from the user to test their variables
 * 6) youre going to get the values from name, base, and height
 * 7) find the area using the formula
 * @Author Tomas Moshi
 * Version 1.0
 * @Since 10/4/22
 */
public class Triangle1{
    private String name;
    private double base;
    private double height;
    /**
     *  Triangle sets name to unkown, base to 0, and height to 0.
     *
     */
    public Triangle1()
    {
        //sets name to Unknown, base to 0.0, and height to 0.0 
        name = "unkown";
        base = 0.0;
        height = 0.0;

    } 

    /**
     *  setting values for name, base, and height.
     *  @param inName stored for string name
     *  @param inBase stored for String base
     *  @param inHeight stored for String height
     */
    public Triangle1 (String inName, double inBase, double inHeight){
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     *  writeOutput does the following:
     *  sets name, base, and height to their values
     *  
     */
    public void writeOutput(){
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.println("Traingle area is: " + String.format("%.1f",getArea()));

    }

    /**
     * readiInput does the following:
     * asks the name and dimension of the triangle from the user.
     */
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is the triangle name? ");
        name = keyboard.nextLine();
        System.out.println("what is the base dimension? ");
        base = keyboard.nextDouble();
        System.out.println("What is the height dimension? ");
        height = keyboard.nextDouble();
    }

    /**
     * @param newName set to name to store new string
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     *  @param newBase set to Base to find the base of the triangle
     */
    public void setBase(double newBase){
        base = newBase;
    }

    /**
     * @param newHeight set to height to find the height of triangle.
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }

    /**
     * the method getArea finds the area of the triangle
     * @return area of the triangle
     */
    public double getArea(){
        double area;
        area = 0.5*base*height;
        return area;
    }
}

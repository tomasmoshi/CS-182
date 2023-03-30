/**
 * this class is used to find the cost in making the area of the room
 * 1)create a copy constructor
 * 2)the method Carpet cost helps assign the private variables to the params
 * 3)multiply create a double var cost by using private var and the roomsize of the area 
 * 4)and convert it to a string then return it as a double.
 * 5)method toString helps structure the cost of the carpet
 * 
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/11/22
 */
public class CarpetCost{
    private double costPerSqFt;
    private RoomSize size;
    /**
     * copy constructor 
     */
    public CarpetCost()
    {

    }

    /**
     * the method Carpet cost helps assign the private variables to the params
     * create a new RoomSize object passing area as an argument to the copy constructor
     * @param area the size of the room
     * @param cost price per SqFt
     */
    public CarpetCost(RoomSize area, double cost){
        costPerSqFt = cost;
        size = new RoomSize(area);
    }

    /**
     * Copy Constructor intializes the object
     * @param object2 the object to copy
     */
    public CarpetCost(CarpetCost object2){
        costPerSqFt = object2.costPerSqFt;
        size = object2.size;
    }

    /**
     * multiply create a double var cost by using private var and the roomsize of the area 
     * and convert it to a string then return it as a double.
     */
    public double getCost(){//HINT-Use size.getArea() for part of this
        double cost = costPerSqFt * size.getArea();
        String Cost = String.format("%.2f",cost);
        return Double.parseDouble(Cost);
    } 

    /**
     * method toString helps structure the cost of the carpet
     * @return str returns the values of the cost and size.
     */
    public String toString(){
        String str =  size + String.format("\nThe cost per sq ft is:$%.2f ", costPerSqFt) + String.format("\nThe total cost is: $%.2f", getCost());
        return str;
    }
}
import java.util.Arrays;
import java.util.Scanner;
/**
 * the demo helps print out the carpetCost and RoomSize classes
 * input the name of the room, length, width, and cost per square foot
 * create a RoomSize object called temp.
 * create a CarpetCost object or call the RoomSize constructor with cost
 * then print CarpetCost with its string element
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/11/22
 */
public class CarpetCostDemo
{

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        double length, width, cost;

        System.out.print("enter the name of the room: ");
        name = keyboard.nextLine();
        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();

        RoomSize myRoomSize = new RoomSize(name, length, width);
        CarpetCost myCarpetCost = new CarpetCost(myRoomSize,cost);
        System.out.println(myCarpetCost.toString());

    }
}

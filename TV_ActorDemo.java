import java.util.ArrayList;
/**
 * Write a description of class TV_ActorDemo here.
 * 1) import Arraylist and use its array to create list
 * 2)adding actors, 
 * 3)removing the first array, 
 * 4)setting to a new character
 * 5)adding a new character to array 1 and then removing index[0]
 * 6) printing the final list.
 * 
 * @author Tomas Moshi,
 * @version v1.0
 * @since 11/5/22
 */
public class TV_ActorDemo{
    public static void main(String[] args) {
        ArrayList<TV_Actor> list = new ArrayList<>();
        //create TV_Actor ArrayList called list
        list.add(new TV_Actor("Bart", "The Simpsons"));
        list.add(new TV_Actor("maggie", "The Simpsons"));
        list.add(new TV_Actor("Lisa", "The Simpsons"));
        printArrayList(list);
        list.remove(1);
        printArrayList(list);
        list.set(1, new TV_Actor("Butthead,", "B&B"));
        printArrayList(list);
        list.add(1, new TV_Actor("Beavis,", "B&B"));
        printArrayList(list);
        list.remove(0);
        printArrayList(list);
    }//end main()

    public static void printArrayList(ArrayList<TV_Actor> inList){
        System.out.println("Printing ArrayList<TV_Actor> list");
        int actorNumber=0;
        for (TV_Actor entry:inList){
            System.out.println("Actor " + actorNumber + " " + entry);
            actorNumber++;
        }
        System.out.println();
    }//end printArrayList
}//end TCV_ActorDemo
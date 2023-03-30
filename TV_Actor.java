import java.util.ArrayList;
/**
 * TV_Actor program is used to write names and the shows they appeared on
 * 1) import Arraylist and implement its method
 * 2) have private strings to be used in other methods
 * 3) the method TV_Actor is used for assigning new the actors name and their role in the show.
 * 4) copy code to input for the object.
 *
 * @author Tomas Moshi
 * @version v1.0
 */
public class TV_Actor
{
    ArrayList<String> list = new ArrayList<>();
    private String name;
    private String show;
    /**
     * getter
     * @return name returns the String show
     */
    public String getName(){
        return name;
    }

    /**
     * setter
     * @param newName is the constant for name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * getter
     * @return show returns the String show
     */
    public String getShow(){
        return show;
    }

    /**
     * Setter
     * @param newShow is the constant for show
     */
    public void setShow(String show){
        this.show = show;
    }

    /**
     * method TV_Actor is create to set the private Strings to unknown.
     */
    public TV_Actor(){
        name = "Unkown Name";
        show = "Unknown Show";

    }

    /**
     * the method TV_Actor is used for assigning new the actors name and their role in the show.
     * @param inName A string used to hold for Private String name
     * @param inShow A string used to hold for Private String show
     */
    public TV_Actor(String inName, String inShow){
        list.add("Name: , " + inName + "Show: " + inShow);
        name = inName;
        show = inShow;
    }

    /**
     * 
     * @return output gives the name and show
     */
    public String toString(){ 
        String output = "Name: " + name + ", Show: " + show; 
        return output; 
    } 
}


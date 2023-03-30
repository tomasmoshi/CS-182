
/**
 * Class person is used to implement personInterface
 * create a private string called name
 * set name to an unkown name
 * use getters and setters for the name
 * create a toString to print out the correct name
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/22/22
 */
public class Person implements PersonInterface
{
    private String name;
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        name = "No Name yet";
    }

    /**
     * @param name is used as a getter
     */
    public Person(String name){
        this.name = name;
    }

    /**
     * @param name is used as a setter
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * this method is used to return the name
     * @return the name of the characters
     */
    public String getName(){
        return name;
    }

    /**
     * this method is used to print out the output
     * @return the correct name of the character
     */
    public String toString(){
        String output;
        output = "name: " + name + "\n";
        return output;
    }

}

import java.util.ArrayList;
/**
 * create objects for fulltime and adjunct employees
 * use the appropiate set objects for wilma
 * create an arraylist from the person class and add all the employees
 * create an advanced for loop that prints out every employee on the list
 * use an if-else statement to compare the two wilmas
 * use the same advanced for loop to print out every employee
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/27/22
 */
public class HRDemo
{
    public HRDemo(){

        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);

        FullTime wilma = new FullTime();
        wilma.setName("Flintstone, Wilma");
        wilma.setIDNum("BR-3");
        wilma.setHireYear(2015);
        wilma.setSalary(78123.2468);

        Employee betty = new Employee("Rubble, Betty", 2017, "BR-4");
        FullTime wilma2 = new FullTime("Slate, Wilma", 2015, "BR-3", 78123.2468);

        ArrayList<Person> staff = new ArrayList<>();
        staff.add(fred);
        staff.add(barney);
        staff.add(wilma);
        staff.add(betty);
        staff.add(wilma2);

        int i=1;
        for (Person list: staff) {
            System.out.println("\n" + "Employee: " + i);
            System.out.println(list);
            i++;
        }
        i=1;
        if (wilma.equals(wilma2)) {
            System.out.println("wilma and wilma2 are the same person: true\n");
        } else {
            System.out.println("wilma and wilma2 are the same person: false\n");
        }
        wilma.setName("Slate, Wilma");
        System.out.println();
        staff.remove(4);
        for (Person list: staff) {
            System.out.println("Employee: " + i);
            System.out.println(list);
            i++;
        }
    }
}
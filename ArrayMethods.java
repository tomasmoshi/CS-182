import java.util.Arrays;

/**
 * ArrayMethods helps do the following:
 * 1)the method count creates an int for a for loop and runs it as long as its less than numbers
 * 2)the method sum creates a int set to 0 and runs a for loop which returns the value.
 * 3)the method average calculates the two prior methods
 * 4)the method findMax finds the values of largest numbers
 * 5)the method findIndexOfMax does a for loop that finds the largest integer in an array 
 * 6)the method findlast returns the index of the las values of the largest integer in the array
 * 7)the method findAll creates and returns a new array of every target value
 * 8)the method getArray returns the numbers
 * 9)the method copyArray creates a new array and gets the numebrs and length of them
 * 10)int[] a helps print the array in a formatted method
 * 11)SortArray Method helps sort the numbers in order
 * 12)the method genFiveByFiveRows generates a 5x5 row and column with numbers 1-5
 * 13)the method genFiveByFivecols generates a 5x5 row and column with letters from A to E
 * 
 * @author Tomas Moshi
 * @version v1.0
 * since 10/29/22
 */

public class ArrayMethods{
    private int[] numbers = {7, 8, 8, 3, 4, 9, 8, 7};
    /*
     * the method count creates an int for a for loop and runs it as long as its less than numbers
     * 
     * @return count to return the numbers in the for loop
     */
    public int count (){
        int count = 0;
        for(int i: numbers){
            count++;
        }
        return count;

    }

    /*
     * the method sum creates a int set to 0 and runs a for loop which returns the value.
     * 
     * @return count to return the numbers in the for loop
     */
    public int sum (){
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        return sum;
    }

    /*
     * the method average calculates the two prior methods
     * @return the values that is divided by sum and count.
     */
    public double average (){
        return (double)sum()/count();
    }

    /*
     * the method findMax finds the values of largest numbers
     * 
     * @return the max amount of numbers as long as numbers is greater than max
     */
    public int findMax (){
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if (max<numbers[i])
                max = numbers[i];
        }
        return max;
    }

    /*
     * the method findIndexOfMax does a for loop that finds the largest integer in an array 
     * @return index return the index of the largest max
     */
    public int findIndexOfMax (){
        int index = 0;
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]==findMax()){
                index = i;
            }
        }
        return index;
    }

    /*
     * the method findlast returns the index of the las values of the largest integer in the array
     * @param key tests the index of the numebers and length of it
     * @return index of the key and tests to see if its value is true.
     */
    public int findLast (int key){
        int index = 0;
        boolean answer = false;
        for(int i = numbers.length-1; i>0; i--){
            if(numbers[i] == key){
                index = i;
                answer = true;
                break;
            }
        }
        if(!answer){
            index = -1;
        }
        return index;
    }

    /*
     * the method findAll creates and returns a new array of every target value
     * @param key showcases adds is the value that will add to count
     * @return allNumbers returns all the numbers.
     */
    public int[] findAll(int key){
        int count = 0;
        int num = 0;
        boolean answer = false;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                count = count + 1;
            }
        }
        int[] allNumbers = new int[count];
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                allNumbers[num] = i;
                ++num;
            }
        }
        return allNumbers;
    }

    /*
     * the method getArray returns the numbers
     * @return numbers showcases all the numbers
     */
    public int[] getArray(){
        return numbers;
    }

    /*
     * the method copyArray creates a new array and gets the numebrs and length of them
     * @return copy returns the array
     */
    public int[] copyArray (){//(Note: Use Arrays.copyOf()) (2pts)
        int[] copy = Arrays.copyOf(numbers,numbers.length);
        return copy;    
    }

    /*
     * helps print the array in a formatted method
     * @param int [a] helps bring all the variables in a formatted way
     * 
     */ 

    public void print(int[] a){
        System.out.print("{");
        int i;
        for(i = 0; i<numbers.length - 1; ++i)
            System.out.print((numbers[i] + ", "));
        if(numbers.length>0)
            System.out.print(numbers[i]);
        System.out.println("}");

    }//provided below
    /*

    /*
     * SortArray Method helps sort the numbers in order
     * @param inArray is used to sort through arrays
     */
    public void sortArray (int[] copyOfA)
    {
    /* if the value index[innerLoop] is 
    less than value index[0], set a temp var to the value of index[innerLoop], set 
    index[innerLoop] to value index[outerLoop], then set index[outerLoop] to temp var value. 
    */
    int startScan, index;//minIndex, minValue;
    int temp;
    //int[] array = new int[copyOfA.length];

    for (startScan = 0; startScan < (copyOfA.length-1); startScan++)
    {
    //minIndex = startScan;
    //minValue = inArray[startScan];

    for(index = startScan + 1; index < copyOfA.length; index++)
    {
    if (copyOfA[index] < copyOfA[startScan])
    {
    temp = copyOfA[index];
    copyOfA[index] = copyOfA[startScan];
    copyOfA[startScan] = temp;
    // startScan = minValue;
    }
    }
    // inArray[index] = inArray[startScan];
    // inArray[index] = temp;
    }
    // return copyOfA;
    }

    /*
     * reverseArray method does the opposite order
     * @param inArray is used for the objects used to sort through the arrays
     * 
     */
    public int[] reverseArray(int[] inArray){
        int temp, end;
        end = inArray.length-1;
        for(int start = 0; start<=end; start++){
            temp = inArray[start];
            inArray[start] = inArray[end];
            inArray[end] = temp;
            end--;
        }
        return inArray;
    }

    /*
     * the method genFiveByFiveRows generates a 5x5 row and column with numbers 1-5
     *
     */
    public void genFiveByFiveRows(){//generates int[5][5] and then prints int[ ][ ] (2pts) 
        int rows = 5;
        int columns = 6;
        int[][] array = new int[rows][columns];
        int numbers = 1;
        System.out.println("  A B C D E");
        for(int a = 0; a<rows; a++){
            for(int b = 0; b<columns; b++){
                System.out.print(numbers + " ");
            }
            numbers++;
            System.out.println();
        }
    }

    /*
     * the method genFiveByFivecols generates a 5x5 row and column with letters from A to E
     */
    public void genFiveByFiveCols(){
        int rows = 5;
        int columns = 5;
        int[][] array = new int[rows][columns];
        int numbers = 0;
        System.out.println("  A B C D E");
        for(int a=0; a<rows; a++){
            System.out.print(a + 1 + " ");
            for(int I = 0; I< columns; I++){
                System.out.print((char)('A' + numbers) + " ");
                numbers ++;
            }
            numbers = 0;
            System.out.println();
        }
    }
}

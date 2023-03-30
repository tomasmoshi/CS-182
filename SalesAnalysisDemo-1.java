import java.util.Scanner;
import java.io.*;
/**
 * sales demo is used to print out the sales for the weeks, months, and days and figure out how much was made 
 * create a constructor called SalesAnaylsisDemo()
 * create objects 
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/19/22
 */
public class SalesAnalysisDemo
{
    /**
     * Constructor for objects of class SalesAnalysisDemo
     * deploy a scanner and a IO exception
     * create objects, scanners, and strings to get the file to test
     * create a while loop to test if file exists
     * get the processFile and output to be given back
     * 
     */
    public SalesAnalysisDemo() throws IOException
    {
        SalesAnalysis sales = new SalesAnalysis();
        String exists;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the path to the SalesData.txt file:");
        exists = keyboard.nextLine();
        File file = new File(exists);
        while(!file.exists()){
            System.out.println("Enter the path to the SalesData.txt file:");
            exists = keyboard.nextLine();
            file = new File(exists);

        }
        sales.processFile(exists);
        sales.writeOutput();
    }

}

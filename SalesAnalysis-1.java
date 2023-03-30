import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 * class SalesAnalysis helps find out the profits created during the following days, weeks, and months.
 * The constructor opens a file name to the sales data
 * method setArraylistElement is used to find the sales and profits made
 * The writeOutput() method is used to provide the information for the sales for the following days, weeks, and months to estimate which had the most profit
 *
 * @author Tomas Moshi
 * @version v1.0
 * @since 11/19/22
 */
public class SalesAnalysis
{
    ArrayList<Double> weeklyNumber = new ArrayList<Double>();
    private Scanner inputFile;
    public static final int DAYS_OF_WEEK = 7;
    String line;
    /*
     * The constructor opens a file name to the sales data 
     * @param filename the file to open
     *
     */
    public void processFile(String filename)throws IOException{
        File file = new File(filename);
        inputFile = new Scanner(file);
        while(inputFile.hasNextLine()){
            line = inputFile.nextLine();
            String[] tokens = line.split(",");
            setArrayListElement(tokens);

        }
        inputFile.close();
    }

    /*
     * method setArraylistElement is used to find the sales and profits made
     * @param inArray is used for the enhanced for loop
     */
    private void setArrayListElement(String[] inArray){
        double total = 0;
        
        for (String s:inArray){
            total += Double.parseDouble(s);
        }
        weeklyNumber.add(total);
    }

    /*
     * The writeOutput() method is used to provide the information for the sales for the following days, weeks, and months to estimate which had the most profit
     */
    public void writeOutput()throws IOException{
        double dailySales;
        double totalSales = 0;
        double max = 0;
        int minWeek = 1;
        int maxWeek = 1;
        int weekCount = 1;
        double min = weeklyNumber.get(weekCount);
        double total = 0;
        for(double weekTotal : weeklyNumber){
            System.out.println("Week " + weekCount + " Info");
            System.out.println("Total Sales: $" + String.format("%,.2f", weekTotal));
            System.out.println("Average Daily Sales for Week: $" + String.format("%,.2f", weekTotal/DAYS_OF_WEEK) + "\n");
            dailySales = weekTotal;
            if(dailySales>totalSales){
                totalSales = dailySales;
                maxWeek = weekCount;
            }
            if(dailySales<min){
                min = dailySales;
                minWeek = weekCount;
            }
            total += weekTotal;
            weekTotal++;
        }
        System.out.println("Total sales for all Weeks: $" + String.format("%,.2f", total));
        System.out.println("Avg Weekly Sales: $" + String.format("%,.2f", total/weeklyNumber.size()));
        System.out.println("Week " + maxWeek + " had the highest amount of sales");
        System.out.println("Week " + minWeek + " had the lowest amount of sales");

    }
}

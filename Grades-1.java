import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*; //Note - Since we are using multiple classes from java.io, we can use the * wildcard vs listing each individually.  Any 2+, it is best to use *
/**
 * Grades class does the following:
 * 1) create strings
 * 2) use getInfFile() method
 * 3) use getOutFile() method
 * 4) processFile for the input and output
 * 
 * @author Tomas Moshi
 * @version v1.0
 * @since 10/1/2022
 */

public class Grades{
    public static void main (String[] args) throws IOException{  //look how small main() is when we divide and conquer into (resusable) methods!  Only 4 lines!!!
        String  inFile, outFile;
        inFile = getInFile();
        outFile = getOutFile();
        processFile(inFile, outFile);

    }

    /**
     * 
     * Uses JOptionPane to get and return input file name
     * @return Tomas; user file from JOptionPane 
     */
    public static String getInFile() throws IOException{ //Requires throws IOException since File throws IOException

        String tomas;
        File file;
        tomas = JOptionPane.showInputDialog("Enter the name of the input file"); //JOptionPane with message to user like-Enter the name of the input file (ie input.txt).  Assign to String var from above
        file = new File(tomas); //create a new File object with String var from above as argument and assign to File var from above
        while (!file.exists()){ //create a while loop pit to ensure that file .exists (remember if it exists, you don't need to be in the pit.  Think ! here
            tomas = JOptionPane.showInputDialog("Enter the name of the input file"); //repeat JOptionPane with message to user like-Enter the name of the input file (ie input.txt).  Assign to String var from above
            file = new File(tomas); //repeat create a new File object with temp as argument and assign to File var from above
        }
        return tomas;
    }

    /**
     * use string getOutFile() for the output of file name while using JOptionPane dialog
     * <@return fileName;
     */
    public static String getOutFile(){
        String fileName;
        File outFile;
        fileName = JOptionPane.showInputDialog("Enter the name of the output file");
        outFile = new File(fileName);
        return fileName;
    }

    /**
     * processFile does:
     * 1) processes each line
     * 2) calculates grades , average, min, and max
     * 3) shows information in a new file
     * 4) @param inFiles to get input
     * 5) @param outFiles to get output
     * 
     */
    public static void processFile(String inFileName, String outFileName)throws IOException{ //create a void processFile method with 2 String parameters.  Since working with File, will need throws IOException
        ////vars section

        int number; //to assign from Scanner input
        int As,Bs,Cs,Ds,Fs,min,max;
        int total,count;
        double average;   
        int set = 1;
        int exit = -1;
        ////Scanner and PrintWriter streams section
        //create File object to create a file from inFileName param
        File inFile = new File(inFileName);
        Scanner keyboard = new Scanner(inFile);//create Scanner object with File object from above.  NOTE-You know this will work based on while pit in getInFile()
        File outFile = new File(outFileName);//create PrintWriter object with inOutFile from method param.  NOTE-PrintWriter creates a new file or overwrites an 
        //    existing file if using FileWriter.
        PrintWriter outputFile = new PrintWriter(outFile);
        while(keyboard.hasNextLine()){ //outer while loop to test if Scanner object .hasNextLine()
            As=Bs=Cs=Ds=Fs=count=0;
            average= 0.0;
            number = keyboard.nextInt();
            min=max=number;
            total=count=0;
            while(number !=-1){
                count++;
                total += number;
                if (number<min){
                    min = number;
                }
                else if (number>max){
                    max = number;
                }
                if(number>=90){
                    As++;
                }
                else if (number>=80){
                    Bs++;
                }
                else if (number>=70){
                    Cs++;
                }
                else if (number>=60){
                    Ds++;
                }
                else{
                    Fs++;
                }
                number = keyboard.nextInt();
            }
            outputFile.println("Set " + set + " of grades calculated");
            set++;
            if(min == -1) {
                count = 0;
                outputFile.println("No grades to average");
            }
            else{
                outputFile.println("Number of As: " + As);//print to PrintWriter object, Number of As: along with the value in the As accumulator repeat above for Bs, Cs,Ds, and Fs
                outputFile.println("Number of Bs: " + Bs);
                outputFile.println("Number of Cs: " + Cs);
                outputFile.println("Number of Ds: " + Ds);
                outputFile.println("Number of As: " + Fs);
                outputFile.println("The lowest score was: " + min);
                outputFile.println("The Highest score was: " + max);
                average = (double)total/count;
                outputFile.println("The avg score is: " + String.format("%.1f",average));

            }
            count = total = 0;
        }
        System.out.println("Grade processing is completed");
        System.out.println("You can retrieve the outputfile at, " + outFile);
        keyboard.close();
        outputFile.close();
    }
}
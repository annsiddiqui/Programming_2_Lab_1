import java.util.Scanner;  // import the Scanner Class
import java.io.*;  // Needed for File and IO Exception
/**
 * This is the solution to the class example of file I/O
 * 
 * @author  ryumol
 * @version date
 */
/*
 * Instructor: 
 * Assumptions: 
 * Known errors: File not found exception
 *
 * 
*/
public class Average0
{
    /**
     *  Reads data from a file into arrays and processes the array
     */
    public void run()throws IOException
    {
        /*
         * Data is read from the file using the Scanner class
         * As data is read, the average of the grades is calculated
         * 
         */

        // Declare the arrays and variables
        double grade;   // grades of students
        String ID;      // ID of students
        int count;      // count of students
        double sum;     // sum of the grades
        double ave;     // average of the grades
        
        Scanner inputFile = new Scanner (new File ("marks.txt"));
    
      // reading the data from the file and calculating the average
        count = 0;
        sum = 0;
        while (inputFile.hasNext())
        {
            ID = inputFile.next();
            grade = inputFile.nextDouble();
            System.out.println (ID + "\t" + grade);
            sum = sum + grade;
            count++;
        }
        ave = sum / count;
        System.out.println ("The average grade of " + count + " students is " + ave);
        inputFile.close();    // closes the file
      
      
      
       
    }
}

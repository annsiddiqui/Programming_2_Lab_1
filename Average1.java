import java.util.Scanner;  // import the Scanner Class
import java.io.*;  // Needed for File and IO Exception
/*
 * Instructor: Rubel Yumol
 * Assumptions: 
 * Known errors: File not found exception
 *
 * 
 */
public class Average1
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

        int count;      // count of students
        double sum;     // sum of the grades
        double ave;  
        String [] IDs = new String [20];
        Double [] grades = new Double [20];

        Scanner inputFile = new Scanner (new File ("marks.txt"));
        // reading the data from the file and calculating the average
        int i = 0;  
        count = 0;
        sum = 0;
        while(inputFile.hasNext()) {
            IDs [i] = inputFile.next();
            grades [i] = inputFile.nextDouble();

            
            i++;

        }

        while (count < i) {
            sum+= grades[count];
            count++;
        }
        ave = sum / count;
        int i2 = 0;
        while (i2 < i) {
            System.out.println (IDs[i2] + "\t" + grades[i2]);
            if (grades[i2] < ave) {
                System.out.println("Below average");
            }else{
                if (grades[i2] == ave) {
                    System.out.println("average");
                } else {
                    System.out.println("Above average");
                }
            }
            i2++;
        }
        System.out.println ("The average grade of " + count + " students is " + ave);
        inputFile.close();    // closes the file

      
    }
}
//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 4
//   9/19/22
//***************************************** 

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.*;

 /**
    This program reads grades
    from a file then displays
    the number of different letter
    grades as well as the average,
    highest, and lowest of grades.
 */

public class GradeStats  //Class name and header
{
   public static void main(String[] args) throws IOException  //Main header
   {
      
      getGrades("grades.txt");  //Method call, file name as argument
      
   }

      /**
       method: getGrades() -- reads grade 
       values from file then displays
       all letter grades, average, highest,
       and lowest grade
       @param filename
       returns number of grades 
      */
      public static double getGrades(String filename) throws IOException
      {
      
         File infile = new File(filename);  //Creates infile object from File
         
         //If statement for if file doesn't exist
         
         if (!infile.exists())
         {
            System.out.println("File not found.");
            System.exit(0);
         }
         
         Scanner filescan = new Scanner(infile);  //Object filescan created from Scanner class
         
         //Local variables
         
         double num = 0.0;
         int sum = 0;
         int a = 0;
         int b = 0;
         int c = 0;
         int d = 0;
         int f = 0;
         double low = 0.0;
         double high = 0.0;
         double average = 0.0;
         double max = 0.0;
         double min = 0.0;
         
            //While loop
            
            while (filescan.hasNext())
            {
            
             num = filescan.nextDouble();
             max = Double.MAX_VALUE;
             min = Double.MIN_VALUE;
             
             if (num >= 90)
               a++;
             else if (num < 90 && num >= 80)
               b++;
             else if (num < 80 && num >= 70)
               c++;
             else if (num < 70 && num >= 60)
               d++;
             else if (num < 60)
               f++;
             
             sum = (a + b + c + d + f);  //Gets total number of grades
             
               //For loops to calculate average, highest, and lowest
               
               for (int i = 0; i <= filename.length(); i++)
               {   
                  num += (num / sum);
                  average = num;
              
                     if (num >= max)
                        high = num;
                     if (num <= min)
                        low = num;
                       
               }
             }     
             
            //Output
             
            System.out.println("The total number of grades: " + sum);
            System.out.println("The total number of As: " + a);
            System.out.println("The total number of Bs: " + b);
            System.out.println("The total number of Cs: " + c);
            System.out.println("The total number of Ds: " + d);
            System.out.println("The total number of Fs: " + f);
            System.out.printf("The average grade is: " + "%.2f" + "%n", average);
            System.out.println("The highest grade is: " + high);
            System.out.println("The lowest grade is: " + low);
            
            filescan.close(); //Closes file
      
           return num;
           
   } //End main

}  //End class

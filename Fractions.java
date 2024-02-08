//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 4
//   9/19/22
//***************************************** 

import java.util.*;

/**
 This program displays frations from 1/2 through 1/25 
 as decimal numbers with five decimal places.
*/

public class Fractions  //Class name and header
{
   public static void main(String [] args)  //Main header
   {
      for (double i = 2; i <= 25; i++)  //For loop
      {
         double total = 1 / i;
         System.out.printf("%.5f%n", total);  //Output
        
      }  //End loop
   }  //End main
}  //End class
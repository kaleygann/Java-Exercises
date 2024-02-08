//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 1
//   9/3/22
//***************************************** 


import java.util.Scanner;  //Allows for keyboard input
import java.text.DecimalFormat;  //Allows for decimal formatting

   /**This program will calculate, break down, and
      display all costs associated with taking an
      Uber or a Lyft based on user's input of 
      mileage and minutes
   */
   
   public class UberAndLyft  //Class name and header
   {   
      public static void main(String[] args)  //Main header
      {
         double miles;  //Total miles 
         double minutes;  //Total minutes
         double UBERMILE = 1.75;  //Price per Uber mile
         double UBERMIN = .35;  //Price per Uber minute
         double UBERFEE = 2.55;  //Uber base fee
         double LYFTMILE = .90;  //Price per Lyft mile
         double LYFTMIN = .09;  //Price per Lyft minute
         double LYFTINITIAL = .90;  //Lyft initial cost
         double LYFTFEE = 1.90;  //Lyft base fee
         double uberMileTotal;  //Total Uber mileage cost
         double lyftMileTotal;  //Total Lyft mileage cost
         double uberMinTotal;  //Total Uber minutes cost
         double lyftMinTotal;  //Total Lyft minutes cost
         double uberTotal;  //Total Uber cost
         double lyftTotal;  //Total Lyft cost
            
            //Creates kb object from Scanner class for user input
            Scanner kb = new Scanner(System.in);
            
               //Get total miles needed to be travelled
               System.out.print("How many miles will you be traveling? ");
               miles = kb.nextDouble();
               
               //Get total travel time in minutes
               System.out.print("How many minutes will you be traveling? ");
               minutes = kb.nextDouble();
               
               System.out.println();  //blank space, added line
               
                  //Creates df object from DecimalFormat class
                  DecimalFormat df = new DecimalFormat("0.00");
                  
                     /**Calculate total cost for miles,
                        minutes, and calculate grand
                        totals for both Uber and Lyft
                     */
                     
                     uberMileTotal = UBERMILE * miles;
                     lyftMileTotal = LYFTMILE * miles;
                     uberMinTotal = UBERMIN * minutes;
                     lyftMinTotal = LYFTMIN * minutes;
                     uberTotal = uberMileTotal + uberMinTotal + UBERFEE;
                     lyftTotal = lyftMileTotal + lyftMinTotal + LYFTINITIAL + LYFTFEE;
                        
                        //Display all information on costs for user
                        System.out.printf("MILEAGE COST%n                      UBER       LYFT%nPrice per mile:       $" + 
                                          df.format(UBERMILE) + "      $" + df.format(LYFTMILE) + "%nTotal milege cost:    $" + 
                                          df.format(uberMileTotal) + "     $" + df.format(lyftMileTotal) + "%n%n");
                                          
                        System.out.printf("MINUTES COST%n                      UBER       LYFT%nPrice per minute:     $" + 
                                          df.format(UBERMIN) + "      $" + df.format(LYFTMIN) + "%nTotal minutes cost:   $" + 
                                          df.format(uberMinTotal) + "     $" + df.format(lyftMinTotal) + "%n%n");
                                          
                        System.out.printf("ADDITIONAL FEES%n                      UBER       LYFT%nInitial cost:         $0.00      $" + 
                                          df.format(LYFTINITIAL) + "%nService/base fee:     $" + df.format(UBERFEE) + "      $" + df.format(LYFTFEE) + "%n%n");
         
                        System.out.printf("TOTAL COST%n                      UBER       LYFT%nTrip total:           $" + 
                                          df.format(uberTotal) + "     $" + df.format(lyftTotal) + "%n%n");
         
         
         
         
         
      }  //End main
    }  //End class
//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 1
//   9/3/22
//***************************************** 

import java.util.Scanner;   //allows for keyboard input
import java.text.DecimalFormat;   //allows for decimal formatting

/**This program will allow the user to calculate how much
   each party member should pay for a meal based on
   varying tip percentages
*/

   public class TipCalculator   //class name
   {
      public static void main(String[] args)   //main header
      {
         String restaurant;   //Restaurant name
         String server;   //Server name
         double bill;   //Total bill before tip
         int people;   //How many people in the party
         double tenTip;   //price after 10% tip
         double fifteenTip;   //price after 15% tip
         double twentyTip;   //price after 20% tip
         
         //Creates kb scanner object for keyboard input
         Scanner kb = new Scanner(System.in);
         
            //Get the name of the restaurant
            System.out.print("Which restaurant? ");
            restaurant = kb.nextLine();
            
            //Get the name of ther server
            System.out.print("What is your server's name? ");
            server = kb.nextLine();
            
            //Get the total bill amount
            System.out.print("What is your bill amount? ");
            bill = kb.nextDouble();
            
            //Get the number of people in the party
            System.out.print("How many people are in your party? ");
            people = kb.nextInt();
            
            System.out.println();   //adds line for spacing
            
            //Output displays restaurant, server, and original bill amount
            System.out.println("Restaurant: " + restaurant);
            System.out.println("Server: " + server);
            System.out.println("Original bill: " + bill + "\n");
            
               //Calculates 10%, 15%, and 20% tip by setting variables
               tenTip = bill + (bill * .10);
               fifteenTip = bill + (bill * .15);
               twentyTip = bill + (bill * .20);
            
                  //Create object from DecimalFormat class
                  DecimalFormat df = new DecimalFormat("#.##");
            
                     //Output displays total bill with tip percentages and cost per party member
                     System.out.println("With 10% tip: $" + df.format(tenTip));
                     System.out.println("Everyone pays: $" + df.format(tenTip / people) + "\n");
            
                     System.out.println("With 15% tip: $" + df.format(fifteenTip));
                     System.out.println("Everyone pays: $" + df.format(fifteenTip / people) + "\n");
            
                     System.out.println("With 20% tip: $" + df.format(twentyTip));
                     System.out.println("Everyone pays: $" + df.format(twentyTip / people) + "\n");
            
         
      } //End main
   } //End class
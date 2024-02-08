//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 1
//   9/3/22
//***************************************** 

import java.util.Scanner;  //Allows for keyboard input
import java.text.DecimalFormat;  //Allows for decimal formatting

   /**
    This program will allow a user to input two
    items' prices then calculate the total price
    after tax in Maryland, California, and Wyoming
   */

   public class TaxCalculator  //Class name and header
   {
      public static void main(String[] args)  //Main header
      {
         String item1;  //Name of first item
         String item2;  //Name of second item
         double price1;  //Price of first item
         double price2;  //Price of second item
         double MDTAX = .06;  //Maryland sales tax
         double CATAX = .0725;  //California sales tax
         double WYTAX = .04;  //Wyoming sales tax
         double mdTotal;  //Total price in MD after tax
         double caTotal;  //Total price in CA after tax
         double wyTotal;  //Total price in WY after tax
         
            //Creates kb object from Scanner class
            Scanner kb = new Scanner(System.in);
         
               System.out.print("What are you buying? ");  //Asks user to input the first item name
               item1 = kb.nextLine();
         
               System.out.print("What is the price of the " + item1 + "? ");  //Asks user to input price of first item
               price1 = kb.nextDouble();
         
               System.out.print("What is the second item you are buying? ");  //Asks user to input name of second item
               item2 = kb.next();
            
               System.out.print("What is the price of the " + item2 + "? ");  //Asks user to input price of second item
               price2 = kb.nextDouble();
            
               System.out.println();  //Blank space
                  
                  //Calculate grand total after tax for MD, CA, and WY 
                  mdTotal = ((price1 + price2) * MDTAX + (price1 + price2));
                  caTotal = ((price1 + price2) * CATAX + (price1 + price2));
                  wyTotal = ((price1 + price2) * WYTAX + (price1 + price2));
                     
                     //Creates df object from DecimalFormat class
                     DecimalFormat df = new DecimalFormat("0.00");
                        
                        /**Display pricing, tax, and grand total for both
                          items in all three states
                        */
                        
                        System.out.printf("Leather jacket%n%n          Maryland       California       Wyoming%n%nPrice: " 
                         + "   " + df.format(price1) + "         " + df.format(price1) + "          " + df.format(price1) + "%nTax:       " + 
                        df.format(price1 * MDTAX) + "          " + df.format(price1 * CATAX) + "            " + df.format(price1 * WYTAX) + "%n%n");
                  
                        System.out.printf("Book%n          Maryland       California       Wyoming%n%nPrice:  " 
                        + "   " + df.format(price2) + "         " + df.format(price2) + "            " + df.format(price2) + "%nTax:        " + 
                        df.format(price2 * MDTAX) + "          " + df.format(price2 * CATAX) + "             " + df.format(price2 * WYTAX) + "%n%n");
                  
                        System.out.printf("Grand total due:%n%nMaryland      California     Wyoming%n$" + df.format(mdTotal) + "       " 
                        + "$" + df.format(caTotal) + "         " + "$" + df.format(wyTotal));
         
         
      
      }  //End main
   }  //End class
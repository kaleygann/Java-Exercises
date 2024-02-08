//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 2
//   9/9/22
//***************************************** 

import java.util.*;  //Imports utility class for access to various classes and keyboard input
import java.text.DecimalFormat;  //Allows for use of DecimalFormat class

 /**
    This program asks the user to input information about 
    theircompany stock name and symbol, current share price, 
    and past share price then displays the information and 
    calculates the percent change between
    the present and past share prices
 */
    

public class Stock  //Class header
{
   
      public static void main(String[] args)  //Main header
      {
         Scanner kb = new Scanner(System.in);  //Only Scanner object
         
         //Identifier declarations
         String name = " ";
         String symbol = " ";
         int shares;
         double price2day,
                price6mo,
                totalValue,
                total6moValue,
                percentChange;
                  
                  //Calls methods for keyboard input and calculations
                  name = getName(kb);
                  symbol = getSymbol(kb);
                  shares = getShares(kb);
                  price2day = getPrice(kb, symbol);
                  price6mo = get6moPrice(kb, symbol);
                  totalValue = calStockValue(shares, price2day);
                  total6moValue = calStockVal6Mo(shares, price6mo);
                  percentChange = calPercentChange(price2day, price6mo);
                  
                  //Output
                  System.out.printf("Stock name: " + name + "%n%n");
                  System.out.printf("Stock symbol: " + symbol.toUpperCase() + "%n%n");
                  System.out.printf("Number of shares: " + shares + "%n%n");
                  
                  //Output
                  DecimalFormat df = new DecimalFormat("#.00");
                  
                  System.out.printf("                   Today:           6 months ago:%n%nStock price:       $" + df.format(price2day) + "          $" + price6mo +
                                    "%n%nStock value:       $" + df.format(totalValue) + "        $" + df.format(total6moValue) + "%n%nApple percent change: " +
                                    df.format(percentChange) + "%%"); 
         
         
      }  //End main
                   
                           /**
                           method: getName() -- asks user to
                           input stock name of the company
                           @param kb
                           returns name of company 
                           */ 
                           public static String getName(Scanner kb)
                           {
                              String newName = "";
                              System.out.print("Enter your stock name: ");
                              newName = kb.nextLine();
                              System.out.println();
                              return newName;
                           }  
                            
                           /**
                           method: getSymbol() -- asks user to
                           input stock symbol of the company
                           @param kb
                           returns symbol
                           */ 
                           public static String getSymbol(Scanner kb)
                           { 
                              String newSymbol = "";
                              System.out.print("Enter your stock symbol: ");
                              newSymbol = kb.nextLine();
                              System.out.println();
                              return newSymbol;
                           }
                           
                           /**
                           method: getShares() -- asks user to
                           input number of shares they own of
                           the company
                           @param kb
                           returns number of shares 
                           */ 
                           public static int getShares(Scanner kb)
                           {
                              int newShares;
                              System.out.print("How many shares do you own? ");
                              newShares = kb.nextInt();
                              System.out.println();
                              return newShares;
                           }
                           
                           /**
                           method: getPrice() -- asks user to
                           input current share price of the
                           company today
                           @param kb, symbol
                           returns share price of company
                           */ 
                           public static double getPrice(Scanner kb, String symbol)
                           {
                              double newPrice;
                              System.out.print("What is the price of " + symbol.toUpperCase() + " today? ");
                              newPrice = kb.nextDouble();
                              System.out.println();
                              return newPrice;
                           }
                           
                           /**
                           method: get6moPrice() -- asks user to
                           input share price of the company 
                           six months ago
                           @param kb, symbol
                           returns share price of company six months ago
                           */ 
                           public static double get6moPrice(Scanner kb, String symbol)
                           {
                              double new6MoPrice;
                              System.out.print("What was the price of " + symbol.toUpperCase() + " 6 months ago? ");
                              new6MoPrice = kb.nextDouble();
                              System.out.println();
                              return new6MoPrice;
                           }
                           
                           /**
                           method: calStockValue() -- calculates
                           the stock value of the company today
                           by multiplying the number of shares
                           by today's share price
                           @param shares, price2day
                           returns current stock value
                           */ 
                           public static double calStockValue(int shares, double price2day)
                           {
                              double value = (shares * price2day);
                              return value;
                           }
                           
                           /**
                           method: calStockValue6Mo() -- calculates
                           the stock value of the company six months 
                           ago by multiplying the number of shares
                           by the share price six months ago
                           @param shares, price6mo
                           returns stock value 6 months ago
                           */ 
                           public static double calStockVal6Mo(int shares, double price6mo)
                           {
                              double value6mo = (shares * price6mo);
                              return value6mo;
                           }
                           
                           /**
                           method: calPercentChange() -- calculates
                           the total percentage change between today's
                           stock value and the stock value six months
                           ago by subtracting the past price from today's 
                           price then dividing by the past price -- 
                           multiply everyting by 100
                           @param price2day, price6mo
                           returns percentage change
                           */ 
                           public static double calPercentChange(double price2day, double price6mo)
                           {
                              double percent = (((price2day - price6mo) / price6mo) * 100);
                              return percent;
                           }
         
}  //End class
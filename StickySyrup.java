//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 2
//   9/9/22
//***************************************** 

import java.util.*;  //Utilities class, allows keyboard input 
import java.text.DecimalFormat;  //DecimalFormat class, allows for decimal formatting

  /**
    This program calculates the total amount of gallons, pricing, and amount
    of gallons per truck load for molasses, maple syrup, and honey.
  */
  
  public class StickySyrup  //Class header
  {
    //Constants declared outside of main so methods can access them
    public static final double MOLASSES_PRICE = 25.90,
                               MAPLE_PRICE = 75.09,
                               HONEY_PRICE = 20.48,
                               MOLASSES_WEIGHT = 11.46,
                               MAPLE_WEIGHT = 11.00,
                               HONEY_WEIGHT = 12.00,
                               TRAILER_WEIGHT = 7540.00;
                        
                                   
                                    public static void main(String[] args)  //Main header
                                    {
                                       //Identifier declarations
                                       double totalMolGal,
                                              totalMapGal,
                                              totalHonGal,
                                              totalMolPrice,
                                              totalMapPrice,
                                              totalHonPrice,
                                              totalMolWeight,
                                              totalMapWeight,
                                              totalHonWeight,
                                              finalGals,
                                              finalPrice,
                                              finalSyrupWeight,
                                              finalWeight;
         
      
                                                   //Create a Scanner object for keyboard input
                                                   Scanner kb = new Scanner(System.in);
                                          
                                                   //Get the total gallons of molasses
                                                   System.out.print("Number of gallons of molasses: ");
                                                   totalMolGal = kb.nextDouble();
                                                   
                                                   //Get the total gallons of maple syrup
                                                   System.out.print("Number of gallons of maple syrup: ");
                                                   totalMapGal = kb.nextDouble();
                                                   
                                                   //Get the total gallons of honey
                                                   System.out.print("Number of gallons of honey:   ");
                                                   totalHonGal = kb.nextDouble();
                                                   
                                                   System.out.println();  //Line for spacing
                                                   
                                                   //Method calls
                                                   totalMolPrice = calMolassesPrice(totalMolGal);  
                                                   totalMapPrice = calMaplePrice(totalMapGal);  
                                                   totalHonPrice = calHoneyPrice(totalHonGal);
                                                   
                                                   //Method calls
                                                   totalMolWeight = calMolassesWeight(totalMolGal);
                                                   totalMapWeight = calMapleWeight(totalMapGal);
                                                   totalHonWeight = calHoneyWeight(totalHonGal);
                                                   
                                                   //Method calls
                                                   finalPrice = calTotalValue(totalMolPrice, totalMapPrice, totalHonPrice);
                                                   finalSyrupWeight = calSyrupWeight(totalMolWeight, totalMapWeight, totalHonWeight);
                                                   finalWeight = calTotalWeight(finalSyrupWeight);
                                                   
                                                   DecimalFormat df = new DecimalFormat("#.00");  //Creates df object from DecimalFormat class
               
                                                   //Output
                                                   System.out.printf("Sticky Syrup Delivery:%n%n");
                                                   
                                                   System.out.printf("Syrup         Number of gallons          Value                Weight%n%nMolasses           " 
                                                   + df.format(totalMolGal) + 
                                                                     "                   $" + df.format(totalMolPrice) + "               " + df.format(totalMolWeight) 
                                                                     + "%n%nMaple Syrup        " + df.format(totalMapGal) + "                  $" + df.format(totalMapPrice) + "              " 
                                                                     + df.format(totalMapWeight) + "%n%nHoney              " + df.format(totalHonGal) + "                 $" + df.format(totalHonPrice) + 
                                                                     "              " 
                                                                     + df.format(totalHonWeight) + "%n%n");
                                                   System.out.printf("Total value of syrup:  $" + df.format(finalPrice) + "%n%nTotal weight of syrup: " + df.format(finalSyrupWeight) + 
                                                                     " lbs%n%nTotal weight of trailer: " + df.format(finalWeight) + " lbs");
                                                   
                                                   
                                      }  //End main        
              
                                                           /**
                                                            method: calMolassesPrice() -- calculates total 
                                                            price of molasses syrup by multiplying
                                                            the # of gallons by price per gallon
                                                            @param totalMolGal
                                                            returns total price of molasses 
                                                           */
                                                           public static double calMolassesPrice(double totalMolGal)
                                                           {
                                                            double molPrice = totalMolGal * MOLASSES_PRICE;
                                                            return molPrice;
                                                           }
                                                           
                                                           /**
                                                            method: calMaplesPrice() -- calculates total 
                                                            price of maple syrup by multiplying
                                                            the # of gallons by price per gallon
                                                            @param totalMapGal
                                                            returns total price of maple syrup
                                                           */
                                                           public static double calMaplePrice(double totalMapGal)
                                                           {
                                                            double mapPrice = totalMapGal * MAPLE_PRICE;
                                                            return mapPrice;
                                                           }
                                                           
                                                           /**
                                                            method: calHoneyPrice() -- calculates total 
                                                            price of honey by multiplyingthe # of gallons 
                                                            by price per gallon
                                                            @param totalHonGal
                                                            returns total price of honey 
                                                           */
                                                           public static double calHoneyPrice(double totalHonGal)
                                                           {
                                                            double honPrice = totalHonGal * HONEY_PRICE;
                                                            return honPrice;
                                                           }
                                                           
                                                           /**
                                                            method: calMolassesWeight() -- calculates total 
                                                            weight of molasses syrup by multiplying
                                                            the # of gallons by weight per gallon
                                                            @param totalMolGal
                                                            returns total weight of molasses 
                                                           */
                                                           public static double calMolassesWeight(double totalMolGal)
                                                           {
                                                            double molWeight = totalMolGal * MOLASSES_WEIGHT;
                                                            return molWeight;
                                                           }
                                                           
                                                           /**
                                                            method: calMapleWeight() -- calculates total 
                                                            weight of maple syrup by multiplying
                                                            the # of gallons by weight per gallon
                                                            @param totalMapGal
                                                            returns total weight of maple syrup
                                                           */
                                                           public static double calMapleWeight(double totalMapGal)
                                                           {
                                                            double mapWeight = totalMapGal * MAPLE_WEIGHT;
                                                            return mapWeight;
                                                           }
                                                           
                                                           /**
                                                            method: calHoneyWeight() -- calculates total 
                                                            weight of honey by multiplying
                                                            the # of gallons by weight per gallon
                                                            @param totalHonGal
                                                            returns total weight of honey
                                                           */
                                                           public static double calHoneyWeight(double totalHonGal)
                                                           {
                                                            double honWeight = totalHonGal * HONEY_WEIGHT;
                                                            return honWeight;
                                                           }
                                                           
                                                           /**
                                                            method: calTotalValue() -- calculates total 
                                                            price of all syrups by adding all the prices
                                                            of each individual syrup
                                                            @param totalMolPrice, totalMapPrice, totalHonPrice
                                                            returns total price of all syrups 
                                                           */
                                                           public static double calTotalValue(double totalMolPrice, double totalMapPrice, double totalHonPrice)
                                                           {
                                                            double price = (totalMolPrice + totalMapPrice + totalHonPrice);
                                                            return price;
                                                           }
                                                           
                                                           /**
                                                            method: calSyrupWeight() -- calculates total 
                                                            weight of all syrups by adding
                                                            the total weight of each syrup
                                                            @param totalMolWeight, totalMapWeight, totalHonWeight
                                                            returns total weight of all syrups
                                                           */
                                                           public static double calSyrupWeight(double totalMolWeight, double totalMapWeight, double totalHonWeight)
                                                           {
                                                            double syrupWeight = (totalMolWeight + totalMapWeight + totalHonWeight);
                                                            return syrupWeight;
                                                           }
                                                           
                                                           /**
                                                            method: calTotalWeight() -- calculates total 
                                                            weight of trailer by adding the weight of
                                                            all the syrups to the weight of the truck
                                                            @param finalSyrupWeight
                                                            returns total weight of trailer
                                                           */
                                                           public static double calTotalWeight(double finalSyrupWeight)
                                                           {
                                                            double weight = (finalSyrupWeight + TRAILER_WEIGHT);
                                                            return weight;
                                                           }
                                                           
}  //End class
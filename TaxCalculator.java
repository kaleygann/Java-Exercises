//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 3
//   9/15/22
//***************************************** 

import java.util.*;  //Utilities class for access to Scanner class and java.lang
import java.text.NumberFormat;  //Allows for the use of currency formatting
import java.util.Locale;  //Allows for access to Locale for getting US currency format


public class TaxCalculator  //Class name and header
{

   public static void main(String[] args)  //Main header
   {
   
      //Identifier declarations and initializations
      
      char maritalStat = ' ';
      double salary = 0.0;
      
      Scanner kb = new Scanner(System.in);  //Creates kb object from Scanner class -- only kb object is in main  
      NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); //Creates nf object from NumberFormat class
          
      //Initialize varibles to methods for input
      
      maritalStat = getStatus(kb);
      salary = getSalary(kb);
      
      displayAll(maritalStat, salary, nf); //Calls displayAll() method
   
   }  //End main

         
        /**
         method: getStatus() -- 
         prompts user to input which
         their marital status 
         @param kb
         returns user's marital status
        */ 
         public static char getStatus(Scanner kb)
         {
            char status = ' ';
            
            System.out.print("Enter marital status: ");
            status = kb.next().charAt(0);
            
            return status;
         }
         
        /**
         method: getSalary() -- 
         prompts user to input 
         their salary
         @param kb
         returns user's salary
        */ 
         public static double getSalary(Scanner kb)
         {
            double sal = 0.0;
            
            System.out.printf("%nEnter salary: ");
            sal = kb.nextDouble();
            
            return sal;
         }
         
        /**
         method: calcSingleTax() -- 
         calculates tax bracket
         based off of user's salary
         and single marital status
         @param salary
         returns single user's tax
        */ 
         
         public static double calcSingleTax(double salary)
         {
            double singleTax = 0.0;
               if (salary <= 3200)
                  singleTax = 0.0;
                  
               else if (salary > 32000)
                  singleTax = 3200 + (.25 * (salary -32000));
                  
            return singleTax;
         }
         
        /**
         method: calcMarriedTax() -- 
         calculates tax bracket
         based off of user's salary
         and married marital status
         @param salary
         returns married user's tax
        */ 
         
         public static double calcMarriedTax(double salary)
         {
            double marriedTax = 0.0;
               if (salary <= 64000) 
                  marriedTax = (.10 * salary);
                  
               else if (salary > 64000)
                  marriedTax = 6400 + (.25 * (salary - 64000));
                  
            return marriedTax;
         }
         
        /**
         method: displayAll() -- 
         displays a statement for
         the user -- shows marital
         status, salary, and amount
         of tax taken from salary
         @param maritalStat, salary, nf
        */ 
         
         public static void displayAll(char maritalStat, double salary, NumberFormat nf)
         {
             
            if (maritalStat == 's' || maritalStat == 'S')
               System.out.printf("%nGiven your single marital status and your base salary of " 
               + nf.format(salary) +  ", your tax is: " + nf.format(calcSingleTax(salary)));
               
            else if (maritalStat == 'm' || maritalStat == 'M')
               System.out.printf("%nGiven your married marital status and your base salary of " 
               + nf.format(salary) + ", your tax is: " + nf.format(calcMarriedTax(salary)));
         }
            
         
}  //End class     
            
            
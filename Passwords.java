//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 4
//   9/19/22
//***************************************** 

import java.util.*;  //Utilities class for access to various classes
import java.util.Random;  //Random class allows for random character generation

/**
 This program randomly generates 8 - 10 character
 passwords from a string of characters
*/

public class Passwords  //Class name and header
{
   public static void main(String[] args)  //Main header
  {
   
   //Local variables
   
   String characters = "abcdefghijklmnopqrstuvwxyz)!@#$%^&*(ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
   int length = 10;
   String pw = " ";
   pw = getPW(length, characters);
   
   //Output
   
   System.out.println("Your temporary passwords are: " + pw);
   
   
  }
  
  /**
   method: getPW() -- generates
   random password as String
   from list of characters
   @param length, characters
   returns password as string 
  */
   public static String getPW(int length, String characters)
   {
  
   Random r = new Random();  //r object from Random class
   
   StringBuilder s = new StringBuilder(length);  //s object from StringBuilder class
   
      //For loop
   
      for (int i = 0; i <= length; i++)
      {
			
        s.append(characters.charAt(r.nextInt(characters.length())));
        
		}
      
      return s.toString(); //Returns s object as String
      
   
   }  //End main
   
   
   
 }  //End class


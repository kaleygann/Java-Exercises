//*****************************************
//   Programmer: Kaley Stephan
//   CTP 150 Section#: 200
//   Homework 3
//   9/15/22
//***************************************** 

import java.util.*;  //Utilities class, allows access to Scanner class and java.lang

/**
    This program presents a menu to the user with two 
    options: speed indicator and rock, paper, scissors. 
    Speed limit indicator will tell the user whether
    they are going too fast, too slow, or driving 
    within the speed limit. Rock, paper, scissors
    will allow for two players to input rock, paper
    or scissors then the game will say who won.
 */

public class Menu_FunFunctions  //Class name and header
{
   public static void main(String [] args)  //Main header
   {
      
      Scanner kb = new Scanner(System.in);  //Creates kb object from Scanner class -- only kb object is in main
      
      //Method calls
      
      displaymenu();
      getChoice(kb);
      
   }  //End main
         
         
         /**
          method: displayMenu() -- 
          display menu to user
          no @param
          no return
         */ 
         
         public static void displaymenu()
         {
            System.out.println("******** MAIN MENU ********");
            System.out.println("*");
            System.out.println("** S - Speed Limit Indicator");
            System.out.println("** G - Rock, Paper, Scissors");
            System.out.println("** Q - Quit");
            System.out.println("*");
            System.out.println("****************************");
         }
         
         /**
          method: getChoice() -- 
          allows user to input which
          function they want to perform
          from menu
          @param kb
          returns user's choice
         */ 
         
         public static char getChoice(Scanner kb)
         {
            char choice = ' ';
            System.out.print("Please enter your choice: ");
            choice = kb.nextLine().charAt(0);
         
       
           
               if (choice == 'S' || choice == 's')
                  {
                  System.out.printf("%n%nSPEED LIMIT INDICATOR%n%n");
                  getSpeed(kb);
                  }
               else if (choice == 'G' || choice == 'g')
                  {
                  System.out.printf("%n%nROCK, PAPER, SCISSORS%n%n");
                  playGame(kb);
                  }
               else if (choice == 'Q' || choice == 'q')
                  System.out.printf("%n%nQUIT"); 
                  
               displaymenu();
              
               return choice;
           
         }
         
         /**
          method: getSpeed() -- 
          runs when user chooses the
          speed indicator option from 
          menu -- asks user for speed
          then will display specific
          output based off keyboard input
          @param kb
          returns user's speed
         */ 
         
         public static int getSpeed(Scanner kb)
         {
            int speed = 0;
            System.out.print("What is the speed? ");
            speed = kb.nextInt();
            
               if (speed > 75)
                  System.out.printf("SLOW DOWN. You are too fast!%n%n");
               else if (speed < 35)
                  System.out.printf("You are too slow.%n%n");
               else if (speed >= 35 && speed <= 75)
                  System.out.printf("Good job. Drive safely.%n%n");
                  
            return speed;
         }
         
         /**
          method: playGame() -- 
          asks two users to enter
          rock, paper, or scissors
          then displays which user
          one based off what they choose
          (ideally, this would work better
          if the two users did not see each
          other's inputs)
          @param kb
          returns a player's choice
         */ 
         
         public static String playGame(Scanner kb)
         {
              String player1 = " ";
              String player2 = " ";
              
              System.out.print("Player 1, please enter rock, paper, or scissors: ");
              player1 = kb.nextLine();
              
              System.out.print("Player 2, please enter rock, paper, or scissors: ");
              player2 = kb.nextLine();
               
               if (player1.equalsIgnoreCase(player2))
               {
                  System.out.printf("%nTie! Try again.%n%n");
                  playGame(kb);
               }   
               
               else if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors"))
               
                  System.out.printf("%nPlayer 1 wins!%n%n");
                 
               else if (player2.equalsIgnoreCase("rock") && player1.equalsIgnoreCase("scissors"))
               
                  System.out.printf("%nPlayer 2 wins!%n%n");
               
                  
               else if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("paper"))
               
                  System.out.printf("%nPlayer 2 wins!%n%n");
                  
               
               else if (player2.equalsIgnoreCase("rock") && player1.equalsIgnoreCase("paper"))
               
                  System.out.printf("%nPlayer 1 wins!%n%n");
                  
               
               
               else if (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper"))
               
                  System.out.printf("%nPlayer 1 wins!%n%n");
                 
                  
               else if (player2.equalsIgnoreCase("scissors") && player1.equalsIgnoreCase("paper"))
               
                  System.out.printf("%nPlayer 2 wins!%n%n");
                  
               
                  
               else 
               {
                  System.out.printf("%nInvalid input. Please try again.%n%n");
                  playGame(kb);
               }   
               
                
            return player1;
           
          } 
         
               
}  //End class
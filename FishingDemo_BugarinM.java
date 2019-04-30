/** Mathew Bugarin
   Zhang T/Th 11:00-12:30
   12 April 2018
**/
   /** This demo program simulates a fishing game. This program will not run properly without
   Fishing_BugarinM.class. The program will prompt the user to play and keep playing
   until the user is finished. The items fished will be randomly based on a 6 sided
   die, with the value of '1' being the best item, and the value of '6' being the
   worst item. Each item will amount to a certain amount of points, and the users
   points will be totaled throughout the loop. At the end of the program, it will
   display how many times the user fished, and a message depending on the total
   points earned by the user. **/

import java.util.Scanner;  //imported scanner class

public class FishingDemo_BugarinM
{
   public static void main(String[] args)
   {
      String startGame;
      String playAgain = "yes";  //initialized playAgain variable to 'yes'
      String item = "";          //initialized the fished item
      int totalPoints = 0;       //initialized running total to 0
      int timesFished = 0;       //initialized timesFished to 0
      Scanner input = new Scanner(System.in);   //created new Scanner
      
      System.out.println("Welcome to this Fishing Game!");
      System.out.println("Would you like to play? (Enter 'yes' or 'no)");
      startGame = input.nextLine(); //prompt user to begin playing
      
      while (startGame.equals(playAgain)) //will loop as long as playAgain = 'yes')
      {
         int points = 0;   
         int diceSides = 6;      //simulates 6-sided die
         Fishing_BugarinM fish = new Fishing_BugarinM(diceSides);    //created new object from Fishing_BugarinM.class
         int value = fish.getValue();     //initialized value to getter method from Fishing_BugarinM.class
         if (value == 1)      //series of if loops that determine the item that is caught
         {                    //and the amount of points gained
            item = "a Huge Fish.";
            points = 50;
         }
         if (value == 2)
         {
            item = "a Cat Fish.";
            points = 40;
         }
         if (value == 3)
         {
            item = "a Small Fish.";
            points = 30;
         }
         if (value == 4)
         {
            item = "an Old Boot.";
            points = 20;
         }
         if (value == 5)
         {
            item = "some Sea Weed.";
            points = 10;
         }
         if (value == 6)
         {
            item = "nothing.";
            points = 0;
         }
         
         timesFished++;    //timesFished will increment for every loop
         totalPoints = totalPoints + points;    //totalPoints is added every loop and remains hidden
         System.out.println("");
         System.out.println("You cast out the fishing line.");
         System.out.println("...");
         System.out.println("The fishing line comes up with " + item);
         System.out.println("Fish again? (Enter 'yes' or 'no')");
         playAgain = input.nextLine();    //prompt user to fish again
      }
      
      System.out.println("");    //display the amount of times fished
      System.out.println("You fished " + timesFished + " times.");
      
      //totalPoints is revealed and a series of loops will display a message
      //based on the totalPoints earned
      if (totalPoints >= 200)
      {
         System.out.println("Congratulations, you earned " + totalPoints + " points.");
      }
      else if (totalPoints >= 150)
      {
         System.out.println("Good job, you earned " + totalPoints + " points.");
      }
      else if (totalPoints >= 100)
      {
         System.out.println("Not bad, you earned " + totalPoints + " points.");
      }
      else
      {
         System.out.println("Better luck next time, you earned " + totalPoints + " points.");
      }
      System.out.println("");
      System.out.println("Thanks for playing!");
   }
}
         
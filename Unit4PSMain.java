package edu.psu.ist140.unit4ps;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class Unit4PSMain {
     public static void main(String[] args) {
        
        //Problem #1
        //Currency conversion
        //  Write some code that first asks the user to type the current
        //  conversion rate for 1 U.S. Dollar (USD) to 1 Euro. Next, in a while
        //  loop, ask users for an amount in USD, read it in, and convert it to
        //  Euro, printing as you go. Use 0 as a sentinel (i.e.: a signal to
        //  stop the loop).
        //  Here's a sample run:
        //    Whats the current conversion rate for 1 USD to 1 Euro:
        //    .85
        //    Enter an amount in USD:
        //    10.0
        //    10.0 in USD is equal to 8.5 Euro
        //    Enter an amount in USD:
        //    2.0
        //    2.0 in USD is equal to 1.7 Euro
        //    Enter an amount in USD:
        //    0
        //    Quitting...
       
        Scanner scnr = new Scanner(System.in);
        
        
        System.out.println("Type the current conversion rate for 1 U.S. "
                + "Dollar (USD) to 1 Euro: ");
        double conversionRate = scnr.nextDouble();
        
        double value;
        double theResult;
        
        boolean done = false;
        while (!done)   {
            System.out.println("Enter an amount in USD: ");
            value = scnr.nextDouble();
            if (value == 0) {
                done = true;
            }
            else    {
                theResult = conversionRate * value;
                System.out.println(value + " in USD is equal to " + 
                        theResult + " Euro");
            }
               
        }
        

         

        //Problem #2
        //Password checker
        //  Write code to read a string (a password) from the user and then
        //  check that the password conforms to the following password policy:
        //        1) the password must be at least 8 characters
        //        2) the password must contain at least two upper case letters
        //        3) the password must contain at least one digit
        //        4) the password cannot begin with a digit
        //
        //  Use a while loop to step through the string to check these policy
        //  conditions. Output "Password OK" if the password conforms,
        //  otherwise output "Password does not conform to the policy."
      
        
        System.out.println("Enter a password: ");
        String password = scnr.next();
        final int ITS_LENGTH = 8;
        final int MINNUM_OFLETTERS = 2;
        int letterCount = 0;
        int numberCount = 0;
        
        boolean result4 = Character.isDigit(password.charAt(0));
            
        if (password.length() == ITS_LENGTH && result4 == false )   {
            int i = 0;
            while (i <= password.length())   {
            i++;
            
            boolean result1 = Character.isLetter(password.charAt(i));
            boolean result2 = Character.isUpperCase(password.charAt(i)); 
            boolean result3 = Character.isDigit(password.charAt(i));
                if (result3 = true)   { 
                    numberCount++;
                     if (numberCount >= 1) {
                         if ((result1 = true) && (result2 = true))   { 
                                letterCount ++; 
                     
                            if (letterCount >= MINNUM_OFLETTERS)   {
                            System.out.println("Password OK.");
                            break;
                                }
                            else {                       
                                continue;
                            }
                    }
                    else {  
                        System.out.println("Password does not conform to the policy.");
                        break;
                         } 
                     }
                     else {System.out.println("Password does not conform to the policy.");
                        break;  
                     }
                } 
                else {  
                    System.out.println("Password does not conform to the policy.");
                    break;
                     }
        }
        }
        else {      
            System.out.println("Password does not conform to the policy.");
                
             }
               
          
  
        
        //Problem #3
             //Question 3: Movie-ticket-tracker
        //  Write some code to pre-sell a limited number of movie tickets. Each
        //  buyer can buy as many as 6 tickets. No more than 20 tickets can be
        //  sold. Prompt the user for the desired number of tickets and then
        //  display the number of remaining tickets. Repeat until all tickets
        //  have been sold, and then display the total number of buyers.
        
        
        final int ALL_TICKETS = 20;
        final int TICKETS_PER_PERSON = 6;
     
        int tickets = ALL_TICKETS; 
        int buyers = 0;        
     
        while (tickets > 0)  {
            System.out.println("Enter the number of tickets to purchase: ");
            int numTickets = scnr.nextInt();
            
            if (tickets < numTickets )  {
                System.out.println("There are only " + tickets + " ticket(s) left.");
                continue;
            }
            
            if (numTickets >= 0 && numTickets <= TICKETS_PER_PERSON) {  
                tickets = tickets - numTickets;
                buyers++;
                System.out.println("The number of remaining tickets: " + tickets);
                
                } 
            
            else    {
                System.out.println("Invalid input. Each buyer can only buy as many as 6 tickets.");
            }
        
        }
            System.out.println("The total number of buyers:" + buyers);
        
        
 
        
        //Problem #4
        // Restaurant-simulation
        //  You need to control the maximum number of people who can be in a
        //  restaurant at any given time. A group cannot enter the restaurant
        //  if they would make the number of people exceed 100 occupants. Use
        //  random numbers between 1 and 20 to simulate groups arriving to the
        //  restaurant. After each random number, display the size of the group
        //  trying to enter and the number of current occupants. As soon as the
        //  restaurant holds the maximum number, output that the restaurant is
        //  full and quit. NOTE: Use the java.util.Random to generate the arriving
        //  group size (don't have the user enter anything)
        //
        //  Here is a sample run of mine:
        //      Party of 13 arriving..
        //          (current occupancy is: 0)
        //      Party of 7 arriving..
        //          (current occupancy is: 13)
        //      Party of 2 arriving..
        //          (current occupancy is: 20)
        //      Party of 11 arriving..
        //          (current occupancy is: 22)
        //
        //      * .. SKIPPING TO THE END HERE .. *
        //
        //      Party of 6 arriving..
        //          (current occupancy is: 99)
        //          (arriving party too big.. turning them away)
        //      Party of 1 arriving..
        //          (current occupancy is: 99)
        //          (restaurant is now at full occupancy)
        //          (quitting...)
        
        
        
        final int MAX_OCCUPANTS = 100;
  
        Random rn = new Random();
        int currentOccupants = 0;
        
        while (currentOccupants < MAX_OCCUPANTS) {
            int numInGroup = rn.nextInt(20) + 1; 
            System.out.println("The size of the group trying to enter is " + numInGroup);
            System.out.println("The number of current occupants is " + currentOccupants); 
            
            int remainingNum = MAX_OCCUPANTS - currentOccupants;
            if (remainingNum < numInGroup)  {
                System.out.println("arriving party too big...turning them away");
                numInGroup = remainingNum;
                continue;
            }
            else    {
            currentOccupants = currentOccupants + numInGroup;
            }
            }
  
        System.out.println("The restaurant is now at full occupancy");
        
        
        
    }
}

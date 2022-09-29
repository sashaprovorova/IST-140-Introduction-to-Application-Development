package ist140.ps1;

import java.util.Scanner;


/**
 *
 * @author aleksandraprovorova
 */
public class Unit1PSMain {
    public static void main(String [] args) {
        //Problem 1:
        //1. Write Java code that prints the months of the year on separate lines.(3 pts)

        System.out.println("The months of the year:");
        System.out.println("1.January");
        System.out.println("2.February");
        System.out.println("3.March");
        System.out.println("4.April");
        System.out.println("5.May");
        System.out.println("6.June");
        System.out.println("7.July");
        System.out.println("8.August");
        System.out.println("9.September");
        System.out.println("10.October");
        System.out.println("11.November");
        System.out.println("12.December");
        
        //Problem 2:
        //2. Write Java code that prints your initials (at least 3) in large letters 
        //(e.g. 7 lines high) using asterisks. (4 pts)
        System.out.println("Author's initials:");
        System.out.println("       *         **            **    *******     ");
        System.out.println("      ***         **          **     **     **   ");
        System.out.println("     ** **         **        **      **      **  ");
        System.out.println("    **   **         **      **       **     **   ");
        System.out.println("   *********         **    **        *******     ");
        System.out.println("  ***     ***         **  **         **          ");
        System.out.println(" ***       ***  *      ****       *  **         *");
        
        //Problem 3:
      //3. Write a Java program that gets the user’s first name and age from standard 
      //input and then prints them like this: (5 pts)

      //Your name is (print user’s name here, without parentheses).
      //Your age is (print user’s age here, without parentheses). 

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = scnr.next();
        
        System.out.println("Please enter your age: ");
        int age = scnr.nextInt();
        
        System.out.println("Your name is " + name + ".");
        System.out.println("Your age is " + age + ".");
        
        /*Problem 4:
        4. You want to decide whether you should drive your car to work or take the 
        train. You know the one-way distance from your home to your place of work, 
         and the fuel efficiency of your car (in miles per gallon). You also know the
         one-way price of a train ticket. You assume the cost of gas at $3 per gallon, 
         and car maintenance at 5 cents per mile. Write an algorithm to decide which 
         commute is cheaper. (8 pts)
         (note 1: remember, 0.05 = 5 cents, 0.1 = 10cents, 0.2 = 20 cents, etc.)
        (note 2: you can provide answers to these in comment form in your main() method)

         a. List the  information that you know (1.5 pts)
         b. Write an algorithm to determine the cost of the car (4 pts)
         c. Write an algorithm to determine the cost of the train ride (.5 pt)
         d. Write an algorithm to decide which commute is cheaper (2 pts)


         *a)The information I know: 
         *-one-way distance from H to W = numMiles
         *-the fuel efficiency of the car = fuelEff
         *-one-way price of a train ticket = ticketTrain
         *
         *b)An algorithm to determine the cost of the car:
         * 1.1wayCost = fuelCost + maintCost;
         * 2.maintCost = .05 * numMiles;
         * fuelCost = 3 * fuelGallons;
         * fuelGallons = numMiles / fuelEff;
         * 3.fuelCost = 3 * numMiles / fuelEff;
         * 4.carCost = 2 * 1wayCost;
         *
         *c)An algorithm to determine the cost of the train ride: 
         * trainCost = 2 * ticketTrain
         *
         *d)
         * if carCost < trainCost, then carCost is cheaper
         * if carCost == trainCost, then carCost = trainCost
         * if carCost > trainCost, then trainCost is cheaper
         *
         * I also tried to write the complete algorithm:
        
         *Scanner scnr = new Scanner(System.in);
        
         *System.out.println("Please enter the number of miles from your home to your place of work: ");
         *int numMiles = scnr.nextInt();
        
         *System.out.println("Please enter the fuel efficiency of your car: ");
         *int fuelEff = scnr.nextInt();
        
         *System.out.println("Please enter the one-way price of a train ticket: ");
         *int ticketTrain = scnr.nextInt();
        
         *double maintCost = .05 * numMiles;
         *double fuelCost = 3 * numMiles / fuelEff;
         *double onewayCost = fuelCost + maintCost;
         *double carCost = 2 * onewayCost;
        
         *double trainCost = 2 * ticketTrain;
        
   
         *if (carCost < trainCost) {
            System.out.println("Driving a car is cheaper.");
         *}
         *else if (carCost == trainCost) { 
         *System.out.println("The cost of driving a car is equal to the cost of taking a train.");
         *}
        
         *else {
               System.out.println("Taking a train is cheaper.");
         *}
         *
         */
        
        
    }
    
}

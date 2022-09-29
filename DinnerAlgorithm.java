
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleksandraprovorova
 */
public class DinnerAlgorithm {
    
    public static void main(String [] args) {
    //int totalBill;   
     //Scanner in = new Scanner(System.in);
      //totalBill = in.nextInt();    
       //System.out.println("The amount to pay is: "  + totalBill);
       
       /*Problem 4:
         *a)The information I know: 
         *-one-way distance from H to W = numMiles
         *-the fuel efficiency of the car = fuelEff
         *-one-way price of a train ticket = ticketTrain
         *
         *b)An algorithm to determine the cost of the car:
         * 1.onewayCost = fuelCost + maintCost;
         * 2.maintCost = .05 * numMiles;
         * fuelCost = 3 * fuelGallons;
         * fuelGallons = numMiles / fuelEff;
         * 3.fuelCost = 3 * numMiles / fuelEff;
         * 4.carCost = 2 * onewayCost;
         *
         *c)An algorithm to determine the cost of the train ride: 
         * trainCost = 2 * ticketTrain;
         *
         *d)
         * if carCost < trainCost, then carCost is cheaper
         * if carCost == trainCost, then carCost = trainCost
         * if carCost > trainCost, then trainCost is cheaper
         */
       Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the number of miles from your home to your place of work: ");
        int numMiles = scnr.nextInt();
        
        System.out.println("Please enter the fuel efficiency of your car: ");
        int fuelEff = scnr.nextInt();
        
        System.out.println("Please enter the one-way price of a train ticket: ");
        int ticketTrain = scnr.nextInt();
        
        double maintCost = .05 * numMiles;
        double fuelCost = 3 * numMiles / fuelEff;
        double onewayCost = fuelCost + maintCost;
        double carCost = 2 * onewayCost;
        
        double trainCost = 2 * ticketTrain;
        
   
        if (carCost < trainCost) {
            System.out.println("Driving a car is cheaper.");
        }
        else if (carCost == trainCost) { 
        System.out.println("The cost of driving a car is equal to the cost of taking a train.");
        }
        
        else {
               System.out.println("Taking a train is cheaper.");
        }
        
        }
    
    }
     
        

        
    }
        
}

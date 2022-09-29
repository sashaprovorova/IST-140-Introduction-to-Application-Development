package edu.psu.ist140.unitquiz2;

import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class UnitQuiz2 {
     public static void main(String[] args) {
    
     /*
         Question 1. 

         Name one benefit of static type systems. Would a type error in Java be 
         considered a compile-time or run-time error? Why? 
         Write your answer in this comment.
        */
     
        //Answer1:One benefit of static type systems is that they help 
        //the programer to avoid mistakes and write the program that will work.  
        //A type error is considered to be run-time error because 
        //Java is not able to identify this type of error and successfully runs
        //the program even with this problem in it. 

        /*
         Question 2.
         
         Write a program that asks the user to input 2 different side lengths of
         a rectangle. The user can input doubles.

         Calculate:
         -> area (length x width)
         -> perimeter (the total of the length of all 4 sides)
         -> length of the diagonal 
            Hint 1: use the Pythagorean theorem: a^2 + b^2 = c^2
                    where a is one side; b is the other side;
                    solve for c which is the diagonal
            Hint 2: when solving for c, recall that for some number x,
                    sqrt(x^2) = x (and remember whatever is done to one 
                                   side of an equation must be done to 
                                   the other)
         Use at least one method from the Java Math library in your calculation. 

         Print the output aligned using format strings via printf with padding 
         and only one decimal place rendered.

         Here's an example of the output (with made up values):
             Area:      46.4
             Perimeter: 100.6
             Diagonal:  30.9  
        */
        
    Scanner scnr = new Scanner(System.in);
   
    System.out.println("Please enter the 1st side length of a rectangle: ");
    double firstLength = scnr.nextDouble();
    
    System.out.println("Please enter the 2nd side length of a rectangle: ");
    double secondLength = scnr.nextDouble();
    
    double theArea = firstLength * secondLength;
    double thePerimeter = firstLength * 2  + secondLength * 2;
    double diagonalLngth = Math.sqrt(Math.pow(firstLength, 2) + Math.pow(secondLength, 2));
    
    System.out.printf("Area: %9.1f\n", theArea);
    System.out.printf("Perimeter: %1.1f\n", thePerimeter);
    System.out.printf("Diagonal: %5.1f\n", diagonalLngth);
    
    
    
        /*
         Question 3.

         You have been asked to develop an algorithm to calculate the total cost 
         of a purchase order that contains 4 t-shirts. Here is the cost of each 
         t-shirt in the order:
           t-shirt1 is $10.75
           t-shirt2 is $15.00
           t-shirt3 is $9.50
           t-shirt4 is $20.10

         The cost of an individual t-shirt may change based on demand per 
         week, though you can assume these are the costs for this problem.

         A constant tax of 6% is applied once to the entire purchase order. 
         Shipping is also a constant that costs $5 and is applied once to the 
         entire order. 

         Using appropriate datatypes and constants, write code that computes the 
         total cost of this purchase order (including taxes and shipping). 
         
         Print out the final cost as:
         Total: c 
         where c is substituted with the resulting total cost (use of println is fine here) 
        */
      
        double tshirt1 = 10.75;
        double tshirt2 = 15.00;
        double tshirt3 = 9.50;
        double tshirt4 = 20.10;
        double purchaseOrder = tshirt1 + tshirt2 + tshirt3 + tshirt4;
        final double THE_TAX = purchaseOrder * .06;
        final int SHIP_COST = 5;
        double totalCost = purchaseOrder + THE_TAX + SHIP_COST;
        System.out.println("Total: " + totalCost);
       
        
        /* 
         Question 4. 

         Write a code snippet that prompts the user to enter a word then
         prints the first character, the last character, the characters 
         in the middle, and the length of the input string. For example, 
         if the input is Christopher, the program should print the following:
          C 
          r 
          hristophe
          11
        */
     
      System.out.println("Please enter a word: ");
      String theWord= scnr.next(); 
    
      String first = theWord.substring(0, 1);
  
      System.out.println(first);
      
      String last = theWord.substring(theWord.length() - 1, theWord.length());
      System.out.println(last);
      
      String middle = theWord.substring(1, theWord.length() - 1);
      System.out.println(middle);
       
      System.out.println(theWord.length());
      
     }
}
             
             
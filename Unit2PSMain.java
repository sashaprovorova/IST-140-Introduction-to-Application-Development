//Unit Two Problem Set
package edu.psu.ist140.unit2ps;

import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class Unit2PSMain {
    public static void main(String [] args) {
           
    Scanner scnr = new Scanner(System.in);
   
  //Problem 1:
    /*

  1. Write a code snippet that prompts the user for a number and displays the square, 
   cube, and fourth power with the appropriate label. The number entered may be 
   fractional. Use the Math.pow method only for the fourth power. For example, your 
   output should look like this if the enters 2.0:
        number entered: 2.0
        number squared: 4.0
        number cubed: 8.0
        number to the 4th power: 16.0
    */
  
  System.out.println("Enter any number: ");
  double anyNum = scnr.nextDouble();
   
  double theSquare = anyNum * anyNum;
  double theCube = anyNum * anyNum * anyNum;
  double fourthPower = Math.pow(anyNum, 4);
   
  System.out.println("Number squared: " + theSquare);
  System.out.println("Number cubed: " + theCube);
  System.out.println("Number to the 4th power: " + fourthPower);
  
        
  //Problem 2:
  /*
  2. The following pseudocode describes how a bookstore computes the price
   of an order given the cost of an individual book and the number of total books 
   that were ordered.
     Prompt the user for the individual book price and the number of books ordered.
     Compute the tax (5% percent of the total book price). 
     Compute the shipping charge ($2 per book). 

   The price of the order is the sum of the total book price, the tax, and the 
   shipping charge. Use constants where appropriate. Print the price of the 
   order to the console. 
  */
  
  System.out.println("Please enter the individual book price in $: ");
  final double BOOK_PRICE = scnr.nextDouble();
   
  System.out.println("Please enter the number of books ordered: ");
  final int BOOK_NUM = scnr.nextInt();
   
  double totalBookPrice = BOOK_PRICE * BOOK_NUM;
  double theTax = totalBookPrice * .05;
  double shipCharge = 2.0 * BOOK_NUM;
  double orderPrice = totalBookPrice + theTax + shipCharge;
   
  System.out.println("The price of the order is $" + orderPrice);
  
   
  //Problem 3:
  /*
  3. Write a program that asks the user to input 
     The number of gallons of gas in the tank (integer)
     The fuel efficiency in miles per gallon (integer)
     The price of gas per gallon (double)

   Then print the cost per 100 miles and how far the car can go with the gas in 
   the tank.
  */
  
  System.out.println("Please enter the number of gallons of gas in the tank: ");
  int gasNum = scnr.nextInt();
   
  System.out.println("Please enter the fuel efficiency in miles per gallon: ");
  int fuelEff = scnr.nextInt();
   
  System.out.println("Please enter the price of gas per gallon in $: ");
  double gasPrice = scnr.nextDouble();
  
  double costPer100 = gasPrice * 100 / fuelEff; 
  double theDistance = gasNum * fuelEff;
  
  System.out.println("The cost of gas per 100 miles: " + costPer100);
  System.out.println("The distance in miles the car can go with the gas "
          + "in the tank: " + theDistance);       
   
  
  //Problem 4:
  /*
  4. The following pseudocode describes how to turn a string containing a 
  ten-digit phone number (such as "8148675309") into a more readable string
  with parentheses and dashes, like this: "(814)867-5309" . 

    Take the substring consisting of the first three characters and surround it 
    with "(" and ") ". This is the area code. 

    Concatenate the area code, a space, the substring consisting of the next three 
    characters, a hyphen, and the substring consisting of the last four 
    characters. This is the formatted number. 

  Translate this pseudocode into a Java program that reads a telephone number 
  into a string variable, computes the formatted number, and prints it.
  */
  
  System.out.println("Please enter a ten-digit phone number: ");
  String phoneNum= scnr.next();
  
  String first = phoneNum.substring(0, 0);

  String third = phoneNum.substring(0, phoneNum.length() - 7 );
  
  String result1 = first + "(" + third + ") ";
  
  String seventh = phoneNum.substring(3, phoneNum.length() - 4);
  
  String result2 = seventh + "-";
  
  String lastFour = phoneNum.substring(phoneNum.length() - 4, phoneNum.length());
          
  System.out.println("The formatted number: " + result1 + result2 + lastFour);
  
  
    }  
}

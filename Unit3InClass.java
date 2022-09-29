/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist140.inclass3;

import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class Unit3InClass {
  
    /*
1. Prompt the user to enter two values of type double: price and weight.

2. Decide the shipping cost based on the following rules:
When the price is more than 100 ($) and the weight is more than 10 (lbs) shipping is $20
When the price is less than or equal to 100 ($) and the weight is more than 10 (lbs) shipping is $15
When the price is more than 100 ($) and the weight is less than or equal to 10 (lbs) shipping is $10
When the price is less than or equal to 100 ($) and the weight is less than or equal to 10 (lbs) shipping is $5

3. Sum the price and the shipping cost and output: “Your total price is X” where X is the total price.
*/
    
 public static void main(String [] args) {
           
    Scanner scnr = new Scanner(System.in);
    
    int shippingPrice = 0;
    
    System.out.println("Please enter the price in $: ");
    double itsPrice = scnr.nextDouble();
    
    System.out.println("Please enter the weight in ibs: ");
    double itsWeight = scnr.nextDouble();
    
    if ((itsPrice > 100) && (itsWeight > 10))   {
        shippingPrice = 20;
    }
    else if ((itsPrice <= 100) && (itsWeight > 10))   {
        shippingPrice = 15;
    }
    else if ((itsPrice > 100) && (itsWeight <= 10))   {
        shippingPrice = 10;
    }
    else if ((itsPrice <= 100) && (itsWeight <= 10))   {
        shippingPrice = 5;
    }
    
    double theSum = shippingPrice + itsPrice;
    System.out.println("Your total price is $" + theSum);
 }
}

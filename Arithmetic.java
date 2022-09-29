package edu.psu.ist140.arithmetic;

import java.util.Scanner;
/**
 *
 * Write a program that prompts the user for two integers and then prints the
 * sum, difference, product, average, maximum, and minimum. Align the 
 * numbers in a column using Java's string formatting notation. For example,
 * here is a sample run:
 * <pre>
 *  Please enter the first integer: 
 *  12
 *  Please enter the second integer: 
 *  15
 *
 *  Sum:              27
 *  Difference:       -3
 *  Product:          180
 *  Average:          13.50
 *  Maximum:          15
 *  Minimum:          12
 * </pre>
 * <p>
 * <b>Hint:</b> <code>max</code> and <code>min</code> functions can be found in 
 * Java's Math library.
 *
 * @author aleksandraprovorova
 */
public class Arithmetic {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        int firstInteger = scnr.nextInt();
        
        System.out.println("Please enter the second integer: ");
        int secondInteger = scnr.nextInt();
        
        int theSum = firstInteger + secondInteger;
        int theDifference = firstInteger - secondInteger;
        int theProduct = firstInteger * secondInteger;
        double theAverage = (firstInteger + secondInteger) / 2.0;
        int theMax = Math.max(firstInteger, secondInteger);
        int theMin = Math.min(firstInteger, secondInteger);
        
        System.out.printf("Sum:%12d\n", theSum);
        System.out.printf("Difference:%5d\n", theDifference);
        System.out.printf("Product: %8d\n", theProduct);
        System.out.printf("Average: %9.1f\n", theAverage);
        System.out.printf("Maximum: %7d\n", theMax);
        System.out.printf("Minimum: %7d\n", theMin);
    }
}

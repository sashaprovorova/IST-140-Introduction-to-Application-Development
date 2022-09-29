package edu.psu.ist140.inclass7;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class InClass7 {
/*    Problem 

Write a method called getNumbers that takes no parameters and returns 
an ArrayList of integers. In the method, write a loop that allows the user 
to enter as many integers as they like.  Store the entered ints in an 
ArrayList<Integer> called nums and return the list when finished.
*/
    
//Method 1
 public static ArrayList<Integer> getNumbers(){ 
    ArrayList<Integer> thisList = new ArrayList<Integer>();
    System.out.println("Enter a list of integers: ");
    Scanner scnr = new Scanner(System.in);
    while (scnr.hasNextInt())  {
       int num = scnr.nextInt();
       thisList.add (num); 
    }
    return thisList; 
 }  
    
/*
Write a method calcAverage that takes an ArrayList<Integer> 
as a parameter and returns a double. Compute the average of the integers in 
the ArrayList<Integer> passed and return this value.
*/  
 
//Method 2
 public static double calcAverage(ArrayList<Integer>numbers){ 
    double sum = 0;  
    for (int i : numbers) {
            sum = sum + i;
      }
    double finalAverage = sum / numbers.size();
    
   return finalAverage;
 }  
    
    
    
  public static void main(String[] args) {  
    ArrayList<Integer> numbers = getNumbers();
    System.out.println("The average of the numbers is: " + calcAverage(numbers)); 
  }  
}

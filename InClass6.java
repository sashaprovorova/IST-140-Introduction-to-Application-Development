
package edu.psu.ist140.inclass6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class InClass6 {
 /* Problem
This method prints a simple graph based on user-provided data.

Write a complete Java program with the following methods:

A method that takes no parameters and returns a String.
Request a String from the user to be used for the title of the graph.

A method that takes no parameters and returns an ArrayList of Integers.
Ask the user to enter a list of integers. They can enter as many integers as they like.
The method returns these in the ArrayList.

A method that takes a String (the graph title) and an ArrayList of Integers as parameters.
This method prints the title and a graph to the command line using the ArrayList of Integers as data.
Each value in the ArrayList is the number of stars to print on that line.
Each element in the ArrayList is a separate line in the graph.
See the example below.

The user enters “My Graph” as the title
The user enters: 3, 5, 6, 2 as the data
The app outputs the following:

My Graph
***
*****
******
**

Call all three methods from the main method using appropriate parameter passing. 
*/    
    
//Method 1
public static String theTitle() {
    System.out.println("Enter the title of the graph: ");
    Scanner scnr = new Scanner(System.in);
    String theTitle = scnr.nextLine();
    return theTitle;

}
//Method 2
 public static ArrayList<Integer> theList(){
    ArrayList<Integer> thisList = new ArrayList<Integer>();
    System.out.println("Enter a list of integers: ");
    Scanner scnr = new Scanner(System.in);
    while (scnr.hasNextInt())  {
       int num = scnr.nextInt();
       thisList.add (num);
       
    }
    return thisList; 
 }
//Method3

 public static ArrayList<String> theGraph (String title, ArrayList<Integer> ints)   {
    System.out.println(title);
    
    String something = "";
    ArrayList<String> result = new ArrayList<>();
    
    for (int i = 0; i < ints.size(); i++)  {
        int justNum = ints.get(i);
        for (int i2 = 0; i2 < justNum; i2++) {
            something = something + "*";
            } 
            result.add (something);
            something = "";
 
    
    }
    for (int i3 = 0; i3 < result.size(); i3++ ) {
       System.out.println(result.get(i3)); 
    }
    
   return result;
  
} 
//Main
public static void main(String[] args) {
   
 String title = theTitle();
 ArrayList<Integer> ints = theList();
 
 ArrayList<String> smth = theGraph(title, ints);
 
    
    
}
}

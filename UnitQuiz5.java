
package edu.psu.ist140.unitquiz5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author aleksandraprovorova
 */
public class UnitQuiz5 {
      public static void main(String[] args) {
    //Question 1 (5pts total).
    //  a. What is wrong with the following line of code:   (1pt)
    //      ArrayList<int> vals = new ArrayList<int>();
    //  b. What is an index, what are legal index values, and what is a
    //     bounds error? (2pts)
    //  c. Suppose A is an array of 10 elements and B is an ArrayList
    //     containing some unknown number of elements.
    //     What is the distinction between saying data.length and B.size()? (2pts)

    /*
    Answer 1:
    a. int is a primitive type, which we cannot use for ArrayList. In this situation, 
    we are supposted to use wrapped class, Integer.
    
    b.An index is used to accesss individual elements in the array. Basocally, it is 
    refers the position in the ArrayList.
    Legal index values are values that are at least 0 and less than the size of an array.
    A bounds error is an error that occurs if I supply an invalid 
    array index, causing my program to terminate.
    
    c.
    data.length is used for array while B.size() is used for ArrayList to measure
    the total number of elements. 
    Since data.length can only measure the number of currently filled elements and 
    not all the possible elements, it is better to use it in case A when we know 
    that there is 10 elemets in an array. In case B, since we do not know the number of 
    stored elements, we can use B.size() to find out. 
    */
    
    
    // Question 2 (5pts).
    // Create a one-dimensional array (type double, size 6) to store
    // numeric quiz grades. Initialize the array with the following grades:
    //  5.2, 8.9, 1.2, 3.67, 3.6, 9.4
    // Now sort the array and compute the final quiz score with the lowest
    // two scores dropped (i.e. don't compute them in the total). Output
    // the total.

    double finalScore = 0;
    double[] onediArray;
    
    onediArray = new double [] {5.2, 8.9, 1.2, 3.67, 3.6, 9.4};
    
    Arrays.sort(onediArray);   
    
    for (int i = 2; i < onediArray.length; i ++)  {
            finalScore = finalScore + onediArray[i];
            }
        
        System.out.println(finalScore); 
    
   
    
    // Question 3 (5pts).
    // Create a one-dimensional array (type String, size 4) to store pet
    // owners names and initialize it to contain the following names:
    //  Moe    May   Oli    Bob
    // Now create and initialize a two-dimensional array (type integer) to
    // store the number of dogs and cats owned, respectively. The 2d
    // 'pet' array should have 4 rows and 2 columns and should match the
    // one shown below:     (you can ignore the Dog Cat header -- it's just
    //                       there for clarity)
    //          Dog Cat
    //   Moe     0  4
    //   May     1  2
    //   Oli     0  0
    //   Bob     5  4
    //
    // First, print the table shown above using a nested loop (owners names
    // should be included on the left as shown).
    //
    // Now compute the total number of dogs and cats in the 2d array and print
    // this out AFTER the nested loop (feel free to compute this sum in the
    // same nested loop where you do the printing).
    //
    // Here's some sample output:
    //
    //   Moe  0  4
    //   May  1  2
    //   Oli  0  0
    //   Bob  5  4
    //
    //  There are 16 pets total
    
    
    
    //I didnt have time for it


    // Question 4 (2pts):
    // Part 1: Write a Java code snippet to declare an ArrayList of String.
    // Next, add the values: "Jill" and "Jack" to the ArrayList.
    // Part 2: Afterwards, declare a string variable called moo and
    // USE AN ARRAYLIST METHOD to initialize it to the very first string
    // in the ArrayList from part 1.


    ArrayList<String> newList = new ArrayList<String>();
    newList.add("Jill");
    newList.add("Jack");
    
    String moo =  "moo";
    
    
            newList.set(0, "Jill");
            newList.set(1, "Jack");
           
 
    
    
    
    // Question 5 (3pts):
    // Declare an array, data, containing the following (integer) elements:
    //  22, 33, 44, 55, 66, 77, 88
    // as you can see, the array should have a maximum length of 7.
    // Now write a for loop erases all the elements (sets them to 0). You
    // MUST use a loop in your solution (do not manually set each and every
    // index)
          
          
          
          
          
    
    
    
    
    
      }
}

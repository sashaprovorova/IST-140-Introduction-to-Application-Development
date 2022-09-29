package edu.psu.ist140.inclass5;
import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class InClass5 {
    public static void main(String[] args) {
      // In this assignment, you are to write a program that does the following:
// 1. Prompt the user for how many lines of text they wish to enter, call this 
//    integer variable linesOfText
//
// 2. Declare and initialize an array of strings to hold the user's input. 
//
// 3. Write a while loop that iterates linesOfText number of times. 
//    And each iteration, you prompt the user to enter a sentence. Read this 
//    sentence in using the scanner method nextLine(). Once the sentence 
//    is read in, put it into the array declared in step (2) at the 
//    appropriate index 
//    (i.e.: this should be whatever iteration number the loop is on)
//
// 4. After the strings have been read, use a for loop to step through the array 
//    of sentences and concatenate a number to the beginning of each sentence. 
//    E.g.: Suppose we have the following strings in our array 
//              {"A big cat..", "A big dog..", "A big mountainlion!"}
//          after the loop it should look like:
//              {"1 A big cat..1", "2 A big dog..", "3 A big mountainlion!"}
//
// 5. Lastly, use a foreach loop to print out the (numbered) sentences. 
        

    Scanner scnr = new Scanner(System.in);
         
    System.out.println("Enter a number of lines of text: ");
    int linesOfText = scnr.nextInt();
    scnr.nextLine();
    
    
    String []usersInput = new String[linesOfText];
    
    int i=0;
    while (i<linesOfText)   {
        System.out.println("Enter a sentence: ");
        String sentence = scnr.nextLine();
        usersInput[i]= sentence;
        i++;   
    }
    for (int i2 = 0; i2 < linesOfText; i2++)   {
            String currentString = usersInput[i2];
            currentString = (i2 + 1) + " " + currentString;
            usersInput [i2] = currentString;
            
    }
    for (String element : usersInput) {
           System.out.println("Here's the numbered sentence: " + element);
    } 
        
  
        
   } 
}

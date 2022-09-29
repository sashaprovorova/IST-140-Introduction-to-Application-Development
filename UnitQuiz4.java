
package edu.psu.ist140.unitquiz4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class UnitQuiz4 {
     public static void main(String[] args) {
       
        // Question 1 (2pts):
        // Rewrite the following code to use a while loop instead of a for loop:
        // int count = 0;
        // for (int i = 1; i <= 10; i++) {
        //    count = count + i;
        // }
        
        //Answer #1:
        
        /*
        int count = 0;
        int i = 1; 
        while (i <= 10)    {
         i++;
         count = count + i;
        }
        */
        
        // Question 2 (3pts):
        // Write a program that reads a word (using the Scanner) and prints the
        // number of vowels in the word. For this question, assume that
        // a e i o u y are vowels. For example, if the user provides the word
        // "Harry", the program should print: "there are 2 vowels". Use a while
        // loop for this.

        //Answer #2:
       /*
        Scanner scnr = new Scanner(System.in);
         
        System.out.println("Enter a word: ");
        String aWord = scnr.next();
        
        int numVowels;
        
        int i = 0;
            while (i <= aWord.length())   {
            i++;
            if (aWord.charAt(i) == 'a') {
                numVowels++ ;
                continue;
            }
            if (aWord.charAt(i) == 'e') {
                numVowels++ ;
                continue;
            }
            
            ....
            
            }
*/
        // Question 3 (5pts):
        // Write some code that reads in a string (via the scanner). Next,
        // declare a string variable called 'strReversed' and initialize it to
        // "". Now, using a while or for loop, write some code that
        // reverses the original string one char at a time, storing it in the
        // 'strReversed' variable.
        // Hint: You can concatenate strings to individual chars using '+'
        //
        // Here's some sample output: "The reverse of Cat is taC"
        
        //Answer #3:
        /*
        System.out.println("Enter a string: ");
        String aString = scnr.next();   
        String strReversed = " ";
        
        for (int i = 0; i < aString.length(); i++)   {
            char current = aString.charAt(i);
            strReversed = current + strReversed;
         
            }
        System.out.println("The reverse of" + aString + " is " + strReversed);   
     
         */   
        
        
      
        
        // Question 4 (5pts):
        // Write some code that uses a nested for loop to
        // print 3 rows of 6 random integers between 1 and 9 inclusive.
        // Hint: you'll need a new instance of a random number generator for
        //       this problem; it can be instantiated by saying:
        //       Random rand = new Random();
        // Here's some sample output:
        //  3 5 2 1 4 9
        //  1 1 9 7 4 2
        //  8 5 5 2 8 1
/*
        final int MAX_NUM = 6;
        Random rn = new Random();
        int someNum = 0;
        
        while (someNum < MAX_NUM) {
            int numInGroup = rn.nextInt(9) + 1; 
            if ...
            */
            
            
            
            

        // Question 5 (3pts):
        // Write some code that finds and returns the index of the first
        // occurrence of a char (key) in a sentence. Use a sentinel or a break
        // statement to exit the loop once the first occurrence is found.
        //
        // Use the scanner to read in both the sentence being searched the
        // character that you want to find the first index / occurrence of.
        //
        // Here's a sample run:
        //  Enter a sentence: "the quick brown fox jumped"
        //  Enter a key char: "o"
        //  o occurs at index 12
        
        //Answer #5:
        /*
        System.out.println("Enter a sentence: ");
        String aSentence = scnr.next();
        
        char index = 'o';
        
        int i = 1;
        while (i <= aSentence.length())  {
            char current = aSentence.charAt(i);
            
            if (current == index)   {
                break;
            }
            i++;  
        }
        System.out.println("o occurs at index: " + i);
        */


        // Question 6 (2pts):
        // When should a do-while loop be used? Write your answer in the comment
        // below.
        
        //Answer #6:
        //It is appropriate to use a do-while loop when you want it to execute 
        //at least ones an perform the loop test after th ebody is executed.
     }
}

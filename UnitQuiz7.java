
package edu.psu.ist140.unitquiz7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author aleksandraprovorova
 */
public class UnitQuiz7 {
  // Question 1: 6pts
    //
    //  Write a method called getLatestTestGrades that takes an integer,
    //  classSize, and returns an arraylist of string. The method should first
    //  check if the classSize passed is 0 or negative (if so, throw an
    //  IllegalArgumentException).
    //
    //  Inside the method, declare an array list of string called result and a
    //  random number generator. Next create a loop that iterates classSize
    //  number of times. Inside the loop, generate a random number between
    //  0..5 (exclusive) and convert this number to a string letter grade,
    //  where:
    //      0 means "A"
    //      1 means "B"
    //      2 means "C"
    //      3 means "D"
    //      4 means "F"
    // You can use a switch statement or an if-elseif statement to do this. Once
    // the number is converted to a string, add it to the result arraylist. Return
    // the arraylist.
    
    public static ArrayList<String>getLatestTestGrades(int classSize)    {
        if (classSize<=0)   {
            throw new IllegalArgumentException("The parameter cannot be negative");
        }
            ArrayList<String>result = new ArrayList<String>();
            Random rand = new Random();
          
            for(int i = 0; i < classSize; i++)   {
                result.add(rand.nextInt(5) + 1);
                
            }
            if ()   {
             ///   
            }
            else if () {
            //
            }
        
            return result;
    }

    
    
    
    // Question 2: (5pts)
    //
    // Write a method called writeGrades that takes a string, fileName, and an
    // arraylist of string containing letter grades. The method returns nothing,
    // but should write the lettergrades to a file called fileName. Catch any
    // exception that might be thrown in the process of doing this.

    public static void writeGrades(String fileName, ArrayList<String>letterGrades)  {
        PrintWriter out= null;
        try {
            out = new PrintWriter(fileName);
            for (String data : letterGrades)    {
                out.println(data);
            }
        }
        catch  (FileNotFoundException exc) {
        System.out.println(exc.getMessage());   
        }
        finally     {
            if (out!=null)  {
                out.close();
            }
        }
    }
    

    // Question 3: (5pts)
    //
    // Write a method, readGrades, that takes a string, fileName, and reads the
    // letter grades in fileName into an arraylist of string and returns it.
    // Thus the method should return an arraylist of string.
    //
    // Your method should also catch any exceptions that may arise
    // (namely: a FileNotFoundException).

    public static ArrayList<String>readGrades(String fileName)  {
       ArrayList<String>newArrayList = new ArrayList<String>();
       File fileToRead = new File (fileName);
       Scanner in = null;
       try  {
           in = new Scanner (fileToRead);
           while (in.hasNextLine()) {
               String letters = in.nextLine();
               newArrayList.add(letters);
           }
       } 
       catch  (FileNotFoundException exception) {
        System.out.println(exception.getMessage());
       }
       finally     {
            if (in!=null)  {
                in.close();
            }
        }
       return newArrayList;
    }
    
    // Question 4: (4pts)
    //
    // Why does java not require you (the programmer) to add a "throws" clause
    // to the method header for getLatestTestGrades(..) even though it can
    // potentially throw an IllegalArgumentException?
    
    //IllegalArgumentException is an unchecked exception, which means that 
    //the program itself can handle this exception even without me using "throws"
    

    public static void main(String[] args) {
        String gradesFilename = "recentgrades.txt";

        //TODO: Uncomment the code below as you complete your methods
        ArrayList<String> grades = getLatestTestGrades(10);
        writeGrades(gradesFilename, grades);
        ArrayList<String> latestGrades = readGrades(gradesFilename);

        System.out.println("Latest test grades (sorted): ");
        Collections.sort(latestGrades);
        System.out.println(latestGrades);
        
        
        
        
    }
     
    
    
}

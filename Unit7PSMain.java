
package edu.psu.ist140.unit7ps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author aleksandraprovorova
 */
public class Unit7PSMain {
    
/*
1. Write a method called getSongsArray that takes an integer parameter (numSongs),
returns an array of Strings, and is declared to throw an IllegalArgumentException. If the
parameter passed is a negative value, throw an IllegalArgumentException. Otherwise,
loop numSongs times prompting the user to enter another name each pass through
the loop. Return this array of names.
*/
    
//Answer 1: For some reason, my program did not run when I tried to use 
//IllegalArgumentException. So, to make it work, I had to use the exception 
//that my laptop suggested as the correct one. I hope it is not a problem.
    
public static String[]getSongsArray (int numSongs)    {
    Scanner in = new Scanner(System.in);
    String[] songs = new String[numSongs];
    
    if (numSongs < 0)   {
        throw new NegativeArraySizeException();
    }
    else    {
            for (int i=0; i < numSongs; i++)  {
                System.out.println("The title of the " + (i+1) + " song: "); 
                String temporary = in.nextLine(); 
                    songs[i]=temporary;
            }  
    }
    return songs;
} 
    
/*    
2. Write a method called writeSongs that takes two parameters: an array of
Strings (songsArray) and a String (fileName), and returns nothing. Write the
array of Strings (songs) to a text file named using the fileName parameter.
Make sure to catch any Exception that might be thrown.
*/

//Answer 2:
public static void writeSongs (String[] songsArray, String fileName)    {
    PrintWriter out = null;
    try {
        out = new PrintWriter (fileName);
        for (String data : songsArray)    {
            out.println(data);
        }
     }
     catch (FileNotFoundException except){
         String errorMsg = except.getMessage();
         System.out.println(errorMsg);
     }
     finally {
         if (out != null)   {
             out.close();
         }
     }    
}


/*    
3. Write a method called readSongs that takes a String parameter (fileName) and
returns an ArrayList of Strings (songsArrayList). The method reads the text file
(fileName) and populates the ArrayList with an element for each line in the
file. The method returns the populated ArrayList. Make sure to catch any
Exception that might be thrown.
*/

//Answer 3:
public static ArrayList<String> readSongs (String fileName)   {
    ArrayList<String>songsArrayList = new ArrayList<String>(); 
    File fileToRead = new File(fileName);
    Scanner in = null;
    try     {
        in = new Scanner(fileToRead);
        while(in.hasNextLine())    {
           String song = in.nextLine();
           songsArrayList.add(song);
         }
    }
    catch  (FileNotFoundException exception) {
        System.out.println(exception.getMessage());
    }
    finally  {
        if (in != null)    {
            in.close();
        }
     } 
    return songsArrayList;
}

/*
4. Write a method called printSongs that takes an ArrayList of Strings and
prints the contents of the ArrayList to the command line, each on a separate
line. 
*/

//Answer 4:
public static void printSongs(ArrayList<String>songsArrayList2)  {
    System.out.println("List of songs: ");
    for(String song : songsArrayList2)  {
        System.out.println(song);
    }
}

public static void main(String[] args) { 
/*    
5. Call each of the methods above from the main method.
The pseudocode for the main method is as given below.
Make sure to catch any Exception that might be thrown.

Call getSongsArray passing the size of the array (any integer) that you want returned
Pass the array and a file name to the writeSongs method
Pass the file name to the readSongs method and return the ArrayList
Pass the ArrayList to the printSongs method.
*/  

//Answer 5:
Scanner in = new Scanner(System.in);

boolean currectNumSongs = false;
while (!currectNumSongs)    {
    try     {
        System.out.println("Enter the number of songs: ");
        int pass = in.nextInt(); 
        String[]mySongsArray = getSongsArray(pass);
        
        System.out.println("Enter the name of the file to store titles:");
        String temp = in.next();
        writeSongs(mySongsArray, temp);
        ArrayList<String>mySongsArrayList = readSongs(temp);
        printSongs(mySongsArrayList);
        currectNumSongs = true;
    }
    catch (NegativeArraySizeException ex)  {
        System.out.println("Invalid number of songs: ");
        System.out.println("\tIt cannot be negative... try again");
    }     
} 

 }
}
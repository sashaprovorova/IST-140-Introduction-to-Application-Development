package edu.psu.ist140.finalexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author aleksandraprovorova
 */
public class FinalExam {
/*1. generateScoresArray Method:
This method takes no parameters.It generates 3 random integers 
(one for each period) between 1 and 5 which represent the goals scored in each 
period. Add the randomly generated numbers to an integer array. The method must
return the array.
*/    
public static int[]generateScoresArray(){
    int[] scores = new int[3];
    Random rand = new Random();
    for (int i = 0; i<scores.length; i++)   {
        int randNum = rand.nextInt(5) + 1;
        scores[i]=randNum; 
        //System.out.print(scores[i] + " ");
    }
 return scores;        
}     
/*
2. writeToFile Method:
This method requires a parameter, an integer array with goals scored, and writes
the scores in the array to a file. The method must catch a file not found 
exception. Return the name of file as a string.
*/
public static String writeToFile(int[]goalsScored)  {
    PrintWriter out = null;
    String fileName = "score.txt";
    try     {
        out = new PrintWriter (fileName);
        for (int i = 0; i<goalsScored.length; i++)  {
            out.println(goalsScored[i]);
        }
    }
    catch  (FileNotFoundException ex) {
        System.out.print(ex.getMessage());
    }
    finally {
        if (out !=null)   {
            out.close();
        }
    }
    
 return fileName;   
} 

/*3. readFile Method:
This method takes a string with the filename as a parameter. It reads the goals
scored values from the file created in the writeToFile method (#2 above). 
Add the goal data values to an integer arraylist which the method returns. 
The method must catch a file not found exception. It returns the integer 
arraylist with the goal data values read from the file.
*/

public static ArrayList<Integer>readFile(String thisFileName)  {
    ArrayList<Integer>newArrayList = new ArrayList<Integer>();
    File fileToRead = new File (thisFileName);
    Scanner in = null;
    try {
        in = new Scanner (fileToRead);
        while(in.hasNext()) {
            int goalData = in.nextInt();
            newArrayList.add(goalData);
        }
    }
    catch  (FileNotFoundException exception) {
        System.out.print(exception.getMessage());
    }
    finally {
        if (in !=null)   {
            in.close();
        }
    }
   return  newArrayList;
}

/*4. printChart Method
This method takes an integer arraylist that contains the goals scored and 
returns nothing. The method prints a chart to the console formatted like 
the example at the beginning. Use an asterisk to represent each goal 
scored –-> one * for each goal scored. Also output the number of the period 
(i.e. 1, 2, or 3) with the highest number of goals scored.
Example:
Period Goals 
1      **
2      **** 
3      *
Period 2 has the highest number of goals scored.
*/

public static void printChart(ArrayList<Integer> data)  {
    
    System.out.printf("Period %2s", "Goals");
    System.out.println();
    
    for (int i1 = 0; i1 < data.size(); i1++ ) {
        System.out.printf("%-7d", i1 + 1);
        for (int i2 = 0; i2 < data.get(i1); i2++)    {
        System.out.print("*");   
        } 
        System.out.println();
    }
    
    int temporaryMax = data.get(0);
    int result = 1;
    for (int i3 = 1; i3 < data.size(); i3++)    {
        if (data.get(i3)> temporaryMax) {
           temporaryMax = data.get(i3);
           result = i3 + 1;
        }
    }
   System.out.println("Period " + result + " has the highest number of goals scored." ); 
}

    
public static void main(String[] args) {
int scoreVals[] = generateScoresArray();
 
String fileName = writeToFile(scoreVals);
ArrayList<Integer> dataVals = readFile(fileName);
printChart(dataVals); 
}  
    
}

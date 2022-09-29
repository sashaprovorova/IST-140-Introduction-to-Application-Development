
package edu.psu.ist140.inclass8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author aleksandraprovorova
 */
public class InClass8 {
   
 public static ArrayList<String> readFile ()    {
    ArrayList<String>versesList = new ArrayList<String>();
    String fileName = "alma-mater.txt";
    File fileToRead = new File(fileName);
    Scanner in = null;
     try {
         in = new Scanner(fileToRead);
         while(in.hasNextLine())    {
           String line = in.nextLine();
           versesList.add(line);
         }
         completeAlmaMaterFirstVerse(versesList);

     } 
     catch (FileNotFoundException ex) {
         String errorMsg = ex.getMessage();
         System.out.println(errorMsg);
     }
     finally  {
         if (in != null)    {
             in.close();
         }
     }
    
    
    return versesList;
 }
 
public static ArrayList<String>completeAlmaMaterFirstVerse(
        ArrayList<String>existingVerses) {
    existingVerses.add("For the future that we wait,");
    existingVerses.add("Raise the song, raise the song.");
    return existingVerses;
}
   
public static void writeFile(ArrayList<String>writeData) {
    PrintWriter out = null;
     try {
        String fileName2 = "alma-mater-out.txt";
        out = new PrintWriter (fileName2);
        for (String data : writeData)    {
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
   
 public static void main(String[] args) { 
   ArrayList<String> almaMaterVerse = readFile();
   writeFile(almaMaterVerse);
     
 }    
    
}

package edu.psu.ist140.methodinclass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author aleksandraprovorova
 */
/**
 * Write a method, fillWithRandom, that takes an integer parameter, 
 * {@code upper}, holding an upper bound for the random numbers generated 
 * and returns an array of random integers between 1..{@code upper}. The array 
 * returned should have a max length of 7. 
 * 
 * @param upper an upper bound for the random numbers generated
 * @return an integer array of length 7 filled with random numbers
 */

/**
 * Write a method, printArray, that takes an integer array {@code arr} and 
 * prints the contents of the array. Your method should output a newline 
 * once you've printed the contents.
 * 
 * @param arr The array of integer to be printed
 */




public class WebMethodsInClass {
    public static int[] fillWithRandom (int upperNum)  {

   int []randomNum = new int[upperNum];
     Random rn = new Random();
        for(int i = 0; i < randomNum.length; i++)   {
           randomNum[i] = rn.nextInt(upperNum) + 1; 
           
        }
    return randomNum;
    }

    public static void printArray (int[] arrayContent)   {
        for (int i1 = 0; i1 <  arrayContent.length; i1 ++) {
              System.out.print(arrayContent[i1] + " "); 
        
    } 
    System.out.println();
    }
    
    public static void main(String[] args) {
        int[] values = fillWithRandom(7);
        printArray(values);
        Arrays.sort(values);
        printArray(values);
    }    
    
}

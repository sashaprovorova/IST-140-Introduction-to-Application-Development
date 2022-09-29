package edu.psu.ist140.unit6ps;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aleksandraprovorova
 */
public class Unit6PSMain {
    
    /**
     * Question 1: warm up
     * <p>
     * Write a method, allSame, that takes three integers x, y, and z and
     * returns {@code true} if they are all exactly equal; {@code false} 
     * otherwise. Try to implement this method in exactly one line.
     * <p>
     * Write a method, inAscOrd, that takes an array list a of integer and
     * returns {@code true} if each element is <em>STRICTLY LESS THAN</em> the
     * next one; {@code false} otherwise. 
     */
    
    
    //Answer 1:
    
    
    
    public static boolean allSame (int x, int y, int z)    {
        if (x == y && y == z)    {
            return true; 
        }
        return false;
    }
    
    public static boolean inAscOrd (ArrayList<Integer>a)  {
        int currentNum = a.get(0);
        for (int i = 1; i < a.size(); i++ )   {
            if (currentNum < a.get(i)) {
                currentNum = a.get(i);
            }
            else    {
                return false;
            }
        }
        return true;
    }
    
    
    
    /**
     * Question 2: leavin' nums
     * <p>
     * Write a method called ileave that takes an array list a of Integer, and
     * an array list b of Integer and returns a new list with the contents of 
     * lists a and b alternated. For example, if a holds
     *   <pre>1,  4,  9,  16</pre>
     * and b holds:
     *   <pre>10,  8,  12,  17,  20,  0</pre>
     * then the method should return a new list containing:
     *   <pre>1,  10,  4,  8,  9,  12,  16,  17,  20,  0</pre>
     * You'll need to use a loop for this problem.
     * <p>
     * <strong>NOTE:</strong> do not modify the input array lists; rather,
     * build up a new array list and return that. To give you a rough estimate of
     * how much work this method should be: it can be implemented in less
     * than ~14 lines of code counting blank lines.
     */

    //Answer 2:
    
    
    public static ArrayList<Integer> ileave(ArrayList<Integer>a, ArrayList<Integer>b)  {
        ArrayList<Integer> newList = new ArrayList<Integer>();
              
        for (int i = 0; i < a.size() * 2 ; i++) {
            if (i%2==0) {
               newList.add(a.get(i/2));
            }
            else  {
              newList.add(b.get(i/2));
            }
        }   
                
        for (int j = b.size()- a.size() - 1; j >= 0; j--) {
               int num = b.size() - j - 1;
               newList.add(b.get(num));
 
        }
       return newList; 
    }
   
    
    
    /**
     * Question 3: matching contents
     * <p>
     * Write a method, occMatch, that takes two array lists of integer a and b.
     * Each list may only contain numbers from 1..7. The method should return
     * true if each list contains the same number of occurrences of the integers
     * 1..7 (return false otherwise).
     * <p>
     * For example:
     * if  a contains 1,  4,  2,  1,  1,  7,  4  and
     *     b contains 1,  1,  4,  1,  7,  4,  2
     * then the method should return true (as a and b each contain three 1's,
     * one 7, two 4's, etc). Return false if there is a mismatch.
     * <p>
     * <strong>NOTE:</strong> you may only use the array list methods "get" and
     * "size" to implement this (you can also declare and use normal arrays).
     */
    
    
    //Answer 3:
    
    
    public static boolean occMatch(ArrayList<Integer>a, ArrayList<Integer>b)  {
        for (int i = 0; i<a.size(); i++ )  {
            for (int j = i+1; j<a.size(); j++ )  {
                if (a.get(i)<=7 && a.get(i)>0 && a.get(j)<=7 && a.get(j)>0) {
                    if (a.get(i)>a.get(j))  {
                        int temporary = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j,temporary);
                    }
                }
                else   {
                     System.out.println("ERROR: Invalid input"); 
                     System.exit(0);
                }
            }
        }
       //System.out.println(a);

       for (int i2 = 0; i2<b.size(); i2++ )  {
            for (int j2 = i2+1; j2<b.size(); j2++ )  {
                if (b.get(i2)<=7 && b.get(i2)>0 && b.get(j2)<=7 && b.get(j2)>0) {
                    if (b.get(i2)>b.get(j2))  {
                        int temporary2 = b.get(i2);
                        b.set(i2, b.get(j2));
                        b.set(j2,temporary2 );
                    }
                }
                else    {
                     System.out.println("ERROR: Invalid input"); 
                     System.exit(0);
                }
            }
        }
        //System.out.println(b);
       
        
        if (a.equals(b))   {
            return true;
        }
        else    {
            return false; 
        }
    }
    
    
    
      /**
     * Question 4: jumbling
     * <p>
     * Write a method, jumble, that takes a string, sentence (i.e. it can
     * contain white space), and returns a jumbled version where every word in
     * the sentence has correct (unchanged) first and last chars, but two
     * randomly chosen chars in the middle flipped.
     * <p>
     * Here's an example. Suppose the sentence passed is:
     * <pre>"I don't give a damn for a man that can only spell a word one way."</pre>
     * your method should return a jumbled string like this:
     * <pre>"I dn'ot gvie a dman for a man taht can olny sepll a wrod one way."</pre>
     * <p>
     * Notice that the jumbled version remains (somewhat) still readable! Anyways,
     * as shown, your method should randomly select two chars out of each word
     * of appropriate length and swap their positions in the string (you should
     * be able to infer the appropriate length from the above example).
     * <p>
     * <strong><b>NOTE:</b></strong> A good first step to this problem would be to
     * break up the sentence into its individual words and store them in an
     * ArrayList (call it words). We can use the {@link String#split(String)}
     * method to accomplish this.
     * <p>
     * Use enhanced for loops in this problem. Here's some rough pseudocode
     * (also shows you how to call split in the first enhanced loop).
     * <pre>
     * jumble(string sentence)
     *    declare a new arraylist of string called words
     *    declare a new arraylist of string called jumbledWords
     *    declare a new random number generator, rand
     *
     *    foreach string s in sentence.split(" "), do     //split sentence on " "
     *        words.add(s) //store each individual word
     *    end
     *    foreach w in words, do
     *        if w is an appropriate size then
     *           set first to be the first char of w
     *           set last to be the last char of w
     *           set a string middle to be the 'middle' of w
     *              (ignoring first and last chars)
     *           generate two rand integers i, j such that
     *                                      0 <= i, j < middle.length()
     *           //note that if i == j, middle won't be permuted (this is ok)
     *           jumbled.add(first + swapCharsIn(middle, i, j) + last);
     *       else
     *          jumbled.add(w);
     *       end
     *   end
     *
     *   declare a string, result, and initialize it to the empty string
     *   foreach w in jumbled, do
     *      result = result + w
     *   end
     *
     *   return result
     * </pre>
     */
    
    
    //Answer 4:
    
    public static String jumble (String sentence)  {
 
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> jumbledWords = new ArrayList<String>();
        Random rand = new Random();
   
        for (String s : sentence.split(" "))  {
            words.add(s);
        }
        
        for(String w : words)   {
            if (w.length() > 3)   {   
                char first = w.charAt(0);
                char last = w.charAt(w.length()-1);   
                String middle = w.substring(1, w.length()-1);
                
                int i = rand.nextInt(middle.length());
                int j = rand.nextInt(middle.length());
 
                jumbledWords.add(first + swapCharsIn(middle, i, j) + last);
                }
            else    {
                jumbledWords.add(w);
            }    
        }
        
        
        String result = " ";
        for(String w : jumbledWords)    {
            result = result + w + " ";
        }
  
        return result;
        
    }
    
    
    
    /**
     * A helper method that takes a string {@code s} and swaps the characters
     * for it located at indices {@code i} and {@code j}
     * (it's ok if {@code i == j}).
     *
     * @param s the source string
     * @param i, j indices for the characters to be swapped
     * @return a copy of s with the specified chars swapped
     */
   
    
    public static String swapCharsIn(String s, int i, int j) {

        if (i < 0 || j < 0) {
            throw new IllegalArgumentException("Can only pass positive " +
                    "(or zero) indices for i and j");
            
        }

        StringBuilder result = new StringBuilder(s);
        result.setCharAt(i, s.charAt(j));
        result.setCharAt(j, s.charAt(i));

        return result.toString();
    }
    
    
    
  public static void main(String[] args) { 
      
        //TODO: call question 1 methods(s) with test input here
        
        
        
        boolean firstResult = allSame(4, 4, 4);
        ArrayList<Integer>myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        boolean secondResult = inAscOrd(myList);
        
        System.out.println(firstResult + " and " + secondResult);
        
        
        
        //TODO: call question 2 methods(s) with test input here
        
        
        
        ArrayList<Integer>firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(4);
        firstList.add(9);
        firstList.add(16);
        
        ArrayList<Integer>secondList = new ArrayList<>();
        secondList.add(10);
        secondList.add(8);
        secondList.add(12);
        secondList.add(17);
        secondList.add(20);
        secondList.add(0);
        
        ArrayList<Integer> finalList = ileave(firstList, secondList);
        System.out.println(finalList);
        
        
        
        //TODO: call question 3 methods(s) with test input here

        
        
        ArrayList<Integer>thirdList = new ArrayList<>();
        thirdList.add(1);
        thirdList.add(4);
        thirdList.add(2);
        thirdList.add(1);
        thirdList.add(1);
        thirdList.add(7);
        thirdList.add(4);
        
         ArrayList<Integer>fourthList = new ArrayList<>();
        fourthList.add(1);
        fourthList.add(1);
        fourthList.add(4);
        fourthList.add(1);
        fourthList.add(7);
        fourthList.add(4);
        fourthList.add(2);
        
        boolean thirdResult = occMatch(thirdList, fourthList);
        System.out.println(thirdResult);
        
        
                
        //TODO: call question 4 methods(s) with test input here
        
        String thisSentence = "I don't give a damn for a man that can "
                + "only spell a word one way.";
        
        String fourthResult = jumble(thisSentence);
        System.out.println(fourthResult);
        
        
  }
}

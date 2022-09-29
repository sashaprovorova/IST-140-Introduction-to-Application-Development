
package edu.psu.ist140.unitquiz6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aleksandraprovorova
 */

public class UnitQuiz6 {
    
    //Answer #2
    public static String mid (String str) {
        
        int temporary; 
        int length;
        
        if (str.length() % 2 == 0)  {
            temporary = str.length() / 2 - 1;
            length = 2;
        }
        else    {
            temporary = str.length() / 2;
            length = 1;
        }
                
       return str.substring(temporary, temporary + length); 
    }
    
    //Answer #3
    
    public static boolean mystery(int x)    {
        boolean theAnswer = false;
        ArrayList<Integer> theList = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)    {
            theList.add(rand.nextInt(4) + 1);
            if (x==theList.get(i))    {
               theAnswer = true;
            }   
        }
        //System.out.println(theList);
        return theAnswer;

    }
    
    
    
    
    
    public static void main(String[] args) { 
     // Question 1 (5pts):
    //
    // a. for the code:
    //          public static boolean moo(int x, int y) {..}
    //          public static void main(..) {
    //              moo(5, 8);
    //          }
    //    answer the following:
    //      - what is the return type of the moo method?
    //      - how many formal parameters does the moo method have and what are they named?
    //      - list the types of the formal parameter(s).
    //      
    //      Answers:
    //      -he terurn method is boolean
    //      -it has 2 formal parameters (their hames are x and y)
    //      -both parameters are integer type
    //
    // b. as a caller of some method F, name two things that you need to know
    //    about method F in order to call it successfully (assume that you
    //    already know the name is F).
    //
    //      - the number and the type of the formal parameters  
    //      - the type of the F method
    //
    //
    // c. name the type in Java indicating that a method has no return
    //
    //      -void method has no a return 
    //
    


    // Question 2 (6pts):
    //
    // Write a method called mid that takes a string parameter, str, and
    // returns a string containing the middle character of str if it is an
    // odd length string. In the case of an even length str, return a string
    // containing the middle two chars.
    //
    // Here's are two examples:
    //      mid("noodle"); //returns "od"
    //      mid("mayor");  //returns "y"
    //
    // The method you write for this should be placed above main() where
    // it says: "Write method for question 2 here" (after you write the
    // method, call it here on some sample input, just like you did in the problem set)
    //
    // Hint: recall that str.length() % 2 == 0 will be true if the length of str
    //       is even; false if the length of str is odd


    //asnwer #2
    
    String answer = mid ("noodle");
    System.out.println("Here's the answer#2: " + answer);
    
    String answer2 = mid ("mayor");
    System.out.println("Here's the answer#2: " + answer2);
    
    // Question 3 (6pts):
    //
    // Write a method called mystery. INSIDE the method, declare an
    // ArrayList of Integer and fill it with 10 randomly generated
    // integers ranging from 1..4. The mystery method should take a
    // integer parameter, x, and return true if x happens to appear in the
    // randomly filled ArrayList; false otherwise.
    //
    // Write your mystery method above main() where it says:
    // "Write method for question 3 here";
    //
    // print the result of calling mystery in your main; (after you write the
    // method, call it here on some sample input, just like you did in the problem set)


    //asnwer #3
    
    boolean asnwer3 = mystery (2);
    System.out.println("Here's the answer#3: " + asnwer3);
    
    
    
    // Question 4 (3pts):
    //
    // Explain the role methods play in enabling black box abstraction (2 or 3 sentences)
    
    //asnwer #4
    //Methods play an important role in enabling black box abstraction. They redirect its users  
    //from one method to the another in the black box and allow them access it without having the
    //prior knowledge of the actual code/internal structure of the method. 
    
    
    }
    
}

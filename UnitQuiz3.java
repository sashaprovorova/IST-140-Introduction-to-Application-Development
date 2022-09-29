package edu.psu.ist140.unitquiz3;
import java.util.Scanner;
/**
 *
 * @author aleksandraprovorova
 */
public class UnitQuiz3 {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        /*
         Question 1 (5pts). 

         Write some Java code that prompts the user to enter a non-empty string.
         Read the string in and store it in a string variable. Then declare a
         boolean variable and set it to true if the first character of the read
         in string is upper case. Once you're done, output:
            "Is the first character in upper case?"
         then print value of your boolean variable. 
       
         */
        
        //Answer:
        
        System.out.println("Enter a non-emprty string: ");
        String str =scnr.next();
        
        char x = str.charAt(0);
        boolean result = Character.isUpperCase(x);
        System.out.println("Is the first character in upper case? " + result);
        
        
        
        /*
         Question 2 (3pts):
         
         What does the following boolean expression evaluate to: true or false?

          ( ( ((40 < 200) && (110 < 100)) || (250 >= 250) )  && !!true ) && !false

         In order to receive partial credit if your answer is wrong, break the
         overall expression down into sub-expressions and show the true or
         false value for each sub-expression.

         For example: (40 < 200) is a sub-expression with a true/false value
         of ___ <- write (true or false) here; do this until the value of the
         entire expression is known.
        
        
        1)(40 < 200) is true
        2)(110 < 100) is false
        3)(250 >= 250) is true
        4)((40 < 200) && (110 < 100)) is false
        5)( ((40 < 200) && (110 < 100)) || (250 >= 250) ) is true
        6)!!true = true
        7)( ( ((40 < 200) && (110 < 100)) || (250 >= 250) )  && !!true ) is true
        8)true && !false = true 
        
        Final answer is true
        
         */
        
        /*
         Question 3 (2pts):
         
         Point out the problem with the following (useless) code fragment.
         Assume here that str is a string, x is an int and both have been
         initialized:
           if (str == "Jerry") {
               System.out.println("MOOO");
           }
           else if (x == 46) { ..
               System.out.println("GOOO");
           }
         How should one go about fixing it? Write your answer in this comment.
         */
        
        /*
        Answer:
        If we want to compare strings, we cannot use ==.
        
        String str2 = "Jerry";
        if (str.equals(str2)) {
               System.out.println("MOOO");
           }
        
        */
        

        /*
         Question 4 (5pts)
         
         First declare three integer variables x, y, z and initialize each of
         them to zero. Next, prompt the user to enter values for x, y, and z
         using the scanner. You should validate that the user indeed entered
         integers using the appropriate scanner method.

         If the user entered invalid input: print an error, else:
         write an algorithm to find the minimum among the inputs x, y, and z
         and print a message when finished: "Minimum is: m" where 'm' is the min
         Note: don't use Math.min(..) or Math.max(..) for this problem.
         */
        
        //Answer:
        
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        System.out.println("Enter the first integer: ");
        
         if (scnr.hasNextInt()) {
            x = scnr.nextInt();
        }
        else {
            System.out.println("ERROR: Please enter an integer");
            System.exit(0);
        }
        
        System.out.println("Enter the second integer: ");

         if (scnr.hasNextInt()) {
            y = scnr.nextInt();
        }
        else {
            System.out.println("ERROR: Please enter an integer");
            System.exit(0);
        } 
        
        System.out.println("Enter the third integer: ");

         if (scnr.hasNextInt()) {
            z = scnr.nextInt();
        }
        else {
            System.out.println("ERROR: Please enter an integer");
            System.exit(0);
        } 
        
        if ((x < z) && (x < y)) {
            System.out.println("Minimum is:" + x);
        }
        else if ((z < x) && (z < y)) {
            System.out.println("Minimum is:" + z);
        }    
        else if ((y < x) && (y < z)) {
            System.out.println("Minimum is:" + y);
        }    
         
        
        /*
         Question 5 (2pts).

         Prompt the user to enter an integer from 1 to 3. Use a switch/case
         statement to determine the month starting, where January is one, etc.
         (You can store the month in a string). Use April as the default.

         Output "The month is: " followed by the month.
         */ 
        
        //Answer:
        
        System.out.println("Enter any number (1-3): ");
        
        int month = scnr.nextInt();
        String month1 = " ";
        
        switch(month) {
        case 1: month1 = "January"; break;
        case 2: month1 = "February"; break;
        case 3: month1 = "March"; break;
        default: month1 = "April"; break;
        }
        System.out.println("The month is: " + month1);
        
               
        /*
         Question 6 (3pts).

         Prompt the user to read in 3 integers x2, y2, and z2.
         Print "all the same" if they are all equal, "all different" if they are
         all different, and "neither" otherwise.
         */
        
        //Answer:
        
        int x2 = 0;
        int y2 = 0;
        int z2 = 0;
        
        System.out.println("Enter the first integer: ");
        
         if (scnr.hasNextInt()) {
            x2 = scnr.nextInt();
        }
        else {
            System.out.println("ERROR: Please enter an integer");
            System.exit(0);
        }
        
        System.out.println("Enter the second integer: ");

         if (scnr.hasNextInt()) {
            y2 = scnr.nextInt();
        }
        else {
            System.out.println("ERROR: Please enter an integer");
            System.exit(0);
        } 
        
        System.out.println("Enter the third integer: ");

         if (scnr.hasNextInt()) {
            z2 = scnr.nextInt();
        }
        else {
            System.out.println("ERROR: Please enter an integer");
            System.exit(0);
        } 
        
        if ((x2 == z2) && (x2 == y2) && (z2 == y2)) {
            System.out.println("all the same");
        }
        else if ((x2 != z2) && (x2 != y2) && (z2 != y2)) {
            System.out.println("all different");
        }    
        else  {
            System.out.println("neither");
        }    
        
        
    
        
        
}
}

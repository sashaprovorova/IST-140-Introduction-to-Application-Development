package edu.psu.ist140.unit3ps;
import java.util.Scanner;
/**
 * @author aleksandraprovorova
 */
public class Unit3PSMain {
    public static void main(String [] args) {
           
    Scanner scnr = new Scanner(System.in);
    
    //Problem 1
     /* 
        Write a program that translates a number between 0 and 4 into the
        closest letter grade. For example, the number 2.9 (which might
        have been the average of several grades) would be converted to C+.
        Use the grade ranges in the course syllabus. 
        
        For the sake of simplicity, consider an A to just be 4.0 
        (don't worry about A+, A-, etc.), further since the syllabus doesn't 
        consider C-, don't worry about it either.
        */
        
    
    System.out.println("Enter any number (0-4): ");
    double anyNum = 0;
    String letterGrade = " ";
    
    if (scnr.hasNextDouble()) {
        anyNum = scnr.nextDouble();
    }
    else {
        System.out.println("ERROR: Please enter a number");
        System.exit(0);
    }
    
    if (anyNum <= 4 && anyNum >= 3.67)    {
        letterGrade = "A";
    }
    else if (anyNum < 3.67 && anyNum >= 3.33)    {
        letterGrade = "B+";
    }
    else if (anyNum < 3.33 && anyNum >= 3)    {
        letterGrade = "B";
    }
    else if (anyNum < 3 && anyNum >= 2.67)    {
        letterGrade = "B-";
    }
    else if (anyNum < 2.67 && anyNum >= 2.33)    {
        letterGrade = "C+";
    }
    else if (anyNum < 2.33 && anyNum >= 1.67)    {
        letterGrade = "C";
    }
    else if (anyNum < 1.67 && anyNum >= 0.67)    {
        letterGrade = "D";
    }
    else if (anyNum < 0.67 && anyNum >= 0)    {
        letterGrade = "F";
    }
    else {
        letterGrade = "ERROR: Please enter any number from 0 to 4";
    }
    
    System.out.println("Closest grade letter is " + letterGrade);
    
    
    
    //Problem 2
    /* Question 2.
        Write code that request's a value of type integer from the user
        (call it selection)--then validate that the user has entered an integer.
        If they have, use a switch-case statement to branch on the value using
        the following rules. If the value equals 1, output "First"; if the value
        equals 2, output "Second", otherwise output "Invalid entry".
    */
        
    
    System.out.println("Enter an integer: ");
    int selection = 0;
    String itsValue = " ";
    
     if (scnr.hasNextInt()) {
        selection = scnr.nextInt();
    }
    else {
        System.out.println("ERROR: Please enter an integer");
        System.exit(0);
    }
    
     switch (selection)   {
         case 1: itsValue = "First"; break;
         case 2: itsValue = "Second"; break;
         default: itsValue = "Invalid entry"; break;
     }
     System.out.println(itsValue);
     
     
     
    //Problem 3
     /*
     When you use an automated teller machine (ATM) with your bank card,
        you need to use a personal identification number (PIN) to access your
        account. If a user fails more than three times when entering the PIN,
        the machine will block the card.

        Assume that the user’s PIN is “1234” and write a program that asks the
        user for the PIN no more than three times, and does the following:
        -> If the user enters the right number, print a message saying,
           "Your PIN is correct", and end the program.
        -> If the user enters a wrong number, print a message saying,
           "Your PIN is incorrect" and, if you have asked for the PIN less than
           three times, ask for it again.
        -> If the user enters a wrong number three times, print a message
           saying "Your bank card is blocked" and end the program.
    */
     
    
    System.out.println("Enter your card PIN (4 digit number): ");
    int yourPin = scnr.nextInt();
    
    if (yourPin == 1234) {
        System.out.println("Your PIN is correct");
    }
    else if (yourPin != 1234)  {
        System.out.println("Your PIN is incorrect");
        System.out.println("Please enter the PIN again: ");
        yourPin = scnr.nextInt();
        if (yourPin== 1234)   {
            System.out.println("Your PIN is correct");
        }
        else if (yourPin != 1234)   {
            System.out.println("Your PIN is incorrect");
            System.out.println("Please enter the PIN one more time: ");
            yourPin = scnr.nextInt();
            if (yourPin== 1234) {
                 System.out.println("Your PIN is correct");
            }
            else if (yourPin != 1234)   {
            System.out.println("Your bank card is blocked");
            }
        }
  
    }
    
    
    
    
    //Problem 4
    /* 
        Write a Java snippet to accept a single character from the user.
        Output all of the statements that are true about the character X:
        X is a letter, X is a digit, X is white space, X is upper case, X is
        lower case, X is unknown.

        Hint 1: there is no scanner method that reads and produces a single
                character from the keyboard. Instead, use next() to obtain a
                string containing the desired character, then retrieve the
                character using an appropriate method from the String class..
        Hint 2: the Character class (with a capital C) has static methods that
                you can call that will tell you if a given char is a letter,
                digit, whitespace, etc.
        Hint 3: A good way of determining whether a character c is unknown or
                not is via Character.isDefined(..)
        */
     
    System.out.println("Enter something: ");
    String str = scnr.next();
    char X = str.charAt(0);
     
    boolean result1 = Character.isLetter(X);
    boolean result2 = Character.isDigit(X);
    boolean result3 = Character.isWhitespace(X);
    boolean result4 = Character.isUpperCase(X);
    boolean result5 = Character.isLowerCase(X);
    boolean result6 = Character.isDefined(X);
     
    if (result1 == true)   {
         System.out.println(X + " is a letter");
     }
    if (result2 == true)  {
         System.out.println(X + " is a digit");
     }
    if (result3 == true)  {
         System.out.println(X + " is white space");
     }
    if (result4 == true)  {
         System.out.println(X + " is upper case");
     }
    if (result5 == true)  {
         System.out.println(X + " is lower case");
     }
    if (result6 == false)  {
         System.out.println(X + " is unknown");
     }
     
    }
}

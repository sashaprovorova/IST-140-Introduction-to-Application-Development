package edu.psu.ist140.unit5ps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author aleksandraprovorova
 */
public class Unit5PSMain {
    public static void main(String[] args) {
       
        // Question 1: Warm up
        //
        // Write a code snippet that initializes an array with ten random
        // integers (between 1..20) and then prints the following output:
        //   a. every element (on a single line)
        //   b. every element at an even index (on a single line)
        //   c. every even element (on a single line)
        //   d. all elements in reverse order (on a single line)
        //   e. only the first and last elements (on a single line)
        //
        // Here's some sample output from my run:
        //  a:  4 20 1 19 12 8 20 9 18 2
        //  b:  4 1 12 20 18
        //  c:  4 20 12 8 20 18 2
        //  d:  2 18 9 20 8 12 19 1 20 4
        //  e:  4 2
        
        
        
        int []randomNum = new int[10];
        int tempVal;
       
        Random rn = new Random();
        
        System.out.print("a. ");
        for (int i = 0; i < randomNum.length; i ++)  {
            randomNum[i] = rn.nextInt(20) + 1; 
            System.out.print(randomNum[i] + " "); 
            
            }
         System.out.println();
         
        System.out.print("b. ");
        for (int i = 0; i < randomNum.length; i ++)  {
        if (i%2 == 0)   {
            System.out.print(randomNum[i] + " "); 
            }
        }
        System.out.println();
         
        System.out.print("c. ");
        for (int i = 0; i < randomNum.length; i ++)  {
        if (randomNum[i]%2 == 0)   {
            System.out.print(randomNum[i] + " "); 
            }

        }
         System.out.println();
         
        System.out.print("d. ");
        
        for (int i = 0; i < (randomNum.length/2); i ++)  {
            tempVal = randomNum[i];
            randomNum[i] = randomNum[randomNum.length - 1 - i];
            randomNum[randomNum.length - 1 - i] = tempVal;
            
            }
        for (int i = 0; i < randomNum.length; i ++) {
             System.out.print(randomNum[i] + " ");
        }
         System.out.println();
        
        System.out.print("e. ");
        System.out.print(randomNum[9] + " " + randomNum[0]);
        
        
 
        // Question 2: Tagging runs
        //
        // A run is a sequence of adjacent repeated values. Write a code
        // snippet that generates a sequence of 20 random die tosses in an
        // array and that prints the die values, marking the runs by including
        // them in parentheses, like this:
        //  1 2 ( 5 5 ) 3 1 2 4 3 ( 2 2 2 2 ) 3 6 ( 5 5 ) 6 ( 3 3 )
        //
        // To get started: first, declare an array called values of length 20
        // and fill each slot with a random number between 1..6 inclusive
        // (use Random() for this).
        //
        // Next, to mark runs, use the following pseudocode:
        //
        // inRun = false
        // for each valid index i in the array do
        //    if inRun
        //       if values[i] is different from the preceding value
        //          print ")"
        //          inRun = false
        //       end
        //    end
        //    if not inRun
        //      if i + 1 is less than values.length()
        //             AND values[i] is the same as the following value
        //          print "("
        //          inRun = true
        //       end
        //    end
        //    print " " + values[i] + " "
        // end
        // if inRun then print ")" end
        
        
        
        
        int []values = new int[20]; 
        Random rn2 = new Random();
       
        for (int i = 1; i < values.length; i ++)  {
            values[i] = rn2.nextInt(6) + 1; 
            }
        
        boolean inRun = false;
        
        for (int i = 1; i < values.length; i ++)  {
             if (inRun) {
                if (values[i] != values[i-1])   {
                System.out.print(")");
                inRun = false;
                }     
            }
            if (!inRun)    {
                if (i + 1 < values.length && values[i] == values[i+1])  {
                    System.out.print("(");
                    inRun=true;
                    }
            }
            System.out.print(" " + values[i] + " ");
        }
        if (inRun)  {
            System.out.print(")");
                inRun = true; 
            }
                
        
        
        
    
        // Question 3: Seating price chart
        //
        // Implement a theater seating chart as a two-dimensional array of
        // seat prices, like this:
        //    {10, 10, 10, 10, 10}
        //    {10, 10, 20, 20, 20}
        //    {20, 40, 40, 40, 50}
        //    {50, 50, 40, 30, 50}
        //
        // First initialize this 2d array and print it out (render the grid
        // with 3 spaces of padding between each seat price).
        //
        // Next, initialize a flag lookingForSeat and set it to true
        // Next, write a while loop following this general procedure:
        // while true do:
        //    Prompt the user to enter an integer 1 or 2.
        //    If they chose 1, prompt them to choose a specific row 1..4
        //    and a seat number 1..5 (within the row). First check that the
        //    seat identified is valid (i.e.: that row and column typed are non-negative, etc.)
        //    If the seat they identified is already purchased (i.e.: grid[row][seat #] == 0) then
        //    tell them the seat is filled, otherwise seat them and mark the
        //    seat as sold by setting its cell to zero.
        //
        //    If they choose 2, prompt them for the price they wish to spend on
        //    a seat ($10, $20, $30, $40, or $50) then find the (row, col) index
        //    of an available seat at the price specified and mark it as
        //    sold. If there is no such seat available at that price,
        //    print "no seats remaining at that price"
        //
        //    If they choose a number greater than 2, print invalid option
        //
        //    If they enter 0 or any negative number stop the loop
        //
        //    At the end of each iteration, render the grid with 3 spaces of
        //    padding between each seat price (to show the current state of 
        //    the seating area)
        //
        // Here is a sample run:
        //   10 10 10 10 10
        //   10 10 20 20 20
        //   20 40 40 40 50
        //   50 50 40 30 50
        // Do you wish to choose a seat by location (1) or price (2)?
        // 1
        // Enter a row (1..4) and seat number (1..5)
        // 1
        // 1
        // Here's your seat
        //   0 10 10 10 10
        //  10 10 20 20 20
        //  20 40 40 40 50
        //  50 50 40 30 50
        // Do you wish to choose a seat by location (1) or price (2)?
        // 2
        // Enter the price of a seat you'd like: 10, 20, 30, 40, or 50
        // 40
        // finding seat...
        // Found one at row: 3 seat num: 2
        //   0 10 10 10 10
        //  10 10 20 20 20
        //  20  0 40 40 50
        //  50 50 40 30 50
  
       Scanner scnr = new Scanner(System.in);
       int answer;
       int answer2;
       int answer3;
       int answer4;
       
        int[][] seatingChart =  {
            {10, 10, 10, 10, 10},
            {10, 10, 20, 20, 20},
            {20, 40, 40, 40, 50},
            {50, 50, 40, 30, 50}
        };
       
        for (int i = 0; i < seatingChart.length; i++)  {
            for (int j = 0; j < seatingChart[i].length; j++) {
                System.out.printf("%3d", seatingChart[i][j]);   
            } 
             System.out.println(); 
        }
        
        boolean lookingForSeat = true;
        
        while (lookingForSeat = true)   {
           System.out.println( "Do you wish to choose a seat by location (1) or price (2)?");
           answer = scnr.nextInt();
           if (answer == 1)  {
               System.out.println("Enter a row (1..4) and seat number (1..5)");
               answer2 = scnr.nextInt();
               answer3 = scnr.nextInt();
               if (answer2 > 0 && answer3 > 0) {
                  if (seatingChart[answer2][answer3] == 0)  {
                     System.out.println("The seat is filled");
                  }
                  else  {
                      System.out.println("Here's your seat ");
                      answer2 = answer2 - 1;
                      answer3 = answer3 - 1;
                      seatingChart[answer2][answer3] = 0;
                  }
                }
               else {
               System.out.println("ERROR: Invalid input");
               System.exit(0);
               }
           }
            if (answer == 2) {
               System.out.println("Enter the price of a seat you'd like: 10, 20, 30, 40, or 50");
               answer4 = scnr.nextInt();
                for (int i = 0; i <  seatingChart.length; i ++) {
                    for (int j = 0; j < seatingChart[i].length; j++) {
                        if (seatingChart[i][j] == answer4 && seatingChart[i][j]!=0)  {
                           System.out.println("Found one at row: " + (i + 1)  + " seat num: " + (j+ 1));
                            seatingChart[i][j] = 0;
                                for (int i2 = 0; i2 < seatingChart.length; i2++)  {
                                    for (int j2 = 0; j2 < seatingChart[i2].length; j2++) {
                                            System.out.printf("%3d", seatingChart[i2][j2]);   
                                                } 
                                            System.out.println(); 
                                              }
                             System.exit(0);
                        }
                   }  
               }
               for (int i = 0; i <  seatingChart.length; i ++) {
                    for (int j = 0; j < seatingChart[i].length; j++) {
                        if (seatingChart[i][j] != answer4 || seatingChart[i][j] == 0)  {
                            System.out.println("no seats remaining at that price");
                            System.exit(0);
                        } 
                    }       
           }     
           }
           if (answer > 2) {
               System.out.println("ERROR: Invalid input");
               System.exit(0);
           }
           if  (answer <= 0) {
               System.out.println("ERROR: Invalid input");
               System.exit(0);
           }
           
           for (int i = 0; i < seatingChart.length; i++)  {
            for (int j = 0; j < seatingChart[i].length; j++) {
                System.out.printf("%3d", seatingChart[i][j]);   
            } 
             System.out.println(); 
            }
        
        }
        
        // Question 4: arrays, arraylists, and reversal
        //
        // Write some code which, given an array a of integers, copies its
        // elements in reverse order (with 5 added to each) into an ArrayList.
        // So, given the following array, arr, and an initially empty 
        // ArrayList named 'reversalList', declared as follows:
        //
        //   int[] arr = {1, 2, 3, 4};
        //   ArrayList<Integer> reversalList = new ArrayList<>();
        //
        // your algorithm after being run should print the following: 
        //     System.out.println(reversalList);
        // which should output: [9, 8, 7, 6]
        // (as this is the reverse of arr with 5 added to each element)
 
        
        
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> reversalList = new ArrayList<Integer>();
        int tempVal2;
    
        for (int i = 0; i < (arr.length/2); i ++)  {
            tempVal2 = arr[i];
             arr[i] =  arr[ arr.length - 1 - i];
             arr[ arr.length - 1 - i] = tempVal2;
            
            }
        for (int i = 0; i <  arr.length; i ++) {
              reversalList.add(arr[i]+5);
              
        }
         System.out.print(reversalList);
    
        
    }
  
}

package edu.psu.ist140.inclass4;

import java.util.Random;

/**
 *
 * @author aleksandraprovorova
 */
public class InClass4 {
    public static void main(String [] args) {
                                
  final int MAX_DECISIONS = 100;
 
  int x = 0;
  int y = 0;
  
  int decisionCount = 0;
  Random rand = new Random();
  
  while (decisionCount < MAX_DECISIONS) {
  //1 = North, 2 = South, 3 = West, 4 = East
  int dir = rand.nextInt(4) + 1; 
  
  switch (dir)  {
        case 1: y = y + 1; break;
        case 2: y = y - 1; break;
        case 3: x = x - 1; break;
        default: x = x + 1; break;
  }
  
  decisionCount++;
    
}
  System.out.println("Drunk gets to coordinate: " + "(" + x + ", " + y + ")");
  double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  System.out.printf("Distance stumbled: %.2f\n", distance);
  
          
          
          
    }
}

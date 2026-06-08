/*This program calculates the energy needed to heat water from an initial temperature to a final temperature*/
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class calculatingEnergy {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        // prompt users to enter the water in kilograms, the initial temperature 
        // and the final temperature
        
        System.out.print(" Enter the amount of water in Kilograms: ");
        double kilograms = input.nextDouble();
        System.out.print(" Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print(" Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        
        //calculate the energy needed
        double Q = kilograms * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println(" The energy needed is " + Q);
    }
    
}

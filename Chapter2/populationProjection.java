/*this program is been rewritten to add an upgrade to the former population projection in exercise 1.11 */
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class populationProjection {
    public static void main (String[] args){
   
        final int currentPopulation = 312032486;
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to Enter the number of years
        System.out.print(" Enter the number of years: ");
        int numberOfYears = input.nextInt();
        
        //solve using the information from exercise 1.11.
         double yearsInSeconds = 365 * 24 * 60 * 60;
         
        // one birthRate every 7secs
        double birthRate = yearsInSeconds / 7.0;
        
        //one deathRate every 13secs
        double deathRate = yearsInSeconds / 13.0;
        
        // one immigrant every 45ssecs
       double immigrantRate = yearsInSeconds / 45.0;
        
        //calculate the yearly change
        double yearlyChange = ( birthRate + immigrantRate) - deathRate ;
        
        
        double yearlyIncrease = currentPopulation + (yearlyChange * numberOfYears);
        
        System.out.println(" the population in " + numberOfYears + " years is " + (int) yearlyIncrease);
        
        
        
        
        
        
        
        
    }
    
}

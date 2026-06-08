/* This program computes the BMI by taking your weight in kilograms and dividing by the square of your height in meteres*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class computingBMI {
    public static void main (String[] args){
        
        double onePound = 0.45359237;
        double oneInch = 0.0254;
                
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter weight in pounds
        System.out.print(" Enter weight in pounds: ");
        double pounds = input.nextDouble();
        
        // prompt users to enter height in inches
        System.out.print(" Enter height in inches: ");
        double inches = input.nextDouble();
        
        //solve for weight
        double weight = pounds * onePound ;
        
        //solve for height
        double height = inches * oneInch;
        
        double BMI = weight / (Math.pow(height, 2));
        
        System.out.println(" Your BMI is " + BMI);
    }
    
}

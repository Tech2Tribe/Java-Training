/*this is revision of Listing 3.4, to let the user enter weight, feet and inches */
package Selection$chapter3;
import java.util.Scanner;
public class computingBMIRevise {
    public static void main (String[] args){
       double onePound = 0.45359237;
       double oneInch = 0.0254;
       
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter their weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        
        //prompt user to enter their feet
        System.out.print(" Enter feet: ");
        double feet = input.nextDouble();
        
        //prompt user to enter height in inches
        System.out.print(" Enter height in inches: ");
        double inches = input.nextDouble();
        
        //calculate weight and height
        double weight = pounds * onePound;
        //(feet * 12) is used because there are 12 inches in one foot
        double height = (feet * 12 +  inches) * oneInch;
        

        //solve for BMI
        double BMI = (weight / (Math.pow(height, 2))) ;
        
        //using multiway if else
        if (BMI < 18.5){
            System.out.println(" BMI is " + BMI );
            System.out.println(" Underweight");
        }else if (BMI < 25.0){
            System.out.println(" BMI is " + BMI);
            System.out.println(" Normal");
        }else if (BMI < 30.0){
            System.out.println(" BMI is " + BMI);
            System.out.println(" Overweight");
        }else {
            System.out.println(" BMI is " + BMI);
            System.out.println(" Obese");
        }
      
    }
    
}

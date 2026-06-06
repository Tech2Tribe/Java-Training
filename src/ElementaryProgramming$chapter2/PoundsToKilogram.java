/* this program helps to convert pounds to kilogram using the users input*/
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class PoundsToKilogram {
    public static void main (String[] args){
        //create the Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter a number in pounds
        System.out.print(" Enter a number in pounds: ");
        double pounds = input.nextDouble();
        
        //change pounds to kilogram
        double kilogram = pounds * 0.454;
        
        System.out.println(" When you change " + pounds + " pounds to kilogram , you get " + kilogram + " kilogram ");
        
    }
    
}

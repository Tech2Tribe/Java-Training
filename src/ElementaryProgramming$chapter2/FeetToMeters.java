/* this code helps to convert feet into meters using the data from the user*/
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class FeetToMeters {
    public static void main (String[] args){
        //create the scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter the feet
        System.out.print(" Enter the value for feet: ");
        double feet = input.nextDouble();
        
        //convert feet to meters
        double meters = feet * 0.305;
        
        System.out.println(" When you convert " + feet + " to meters, you have " + meters + " meters");
    }
}

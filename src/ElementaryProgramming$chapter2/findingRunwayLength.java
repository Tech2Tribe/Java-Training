/* this code helps to find the minimum runway length needed for an airplane to take off*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class findingRunwayLength {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        // prompt users to enter the speed and acceleration in (m/s)
        System.out.print(" Enter the speed in (m/s) and acceleration in (m/s^2): ");
        int speed = input.nextInt();
        double acceleration = input.nextDouble();
        
        // solve for length
       double length = Math.pow(speed, 2 ) / ( 2 * acceleration) ;
       
        System.out.println(" The minimum runway length for this airplane is " + length);
    } 
}

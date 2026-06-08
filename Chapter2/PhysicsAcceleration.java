/*this program is used to calculate the average acceleration in meters/seconds */
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class PhysicsAcceleration {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the values for v0, v1 and t
        System.out.print(" Enter the values for v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        //calculate the Average acceleration
        double averageAcceleration = (v1 - v0) / t ;
        
        System.out.println(" The average acceleration is " + averageAcceleration);
    }
}

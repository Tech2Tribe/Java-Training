/* this program prompt the user to enter two points and displays the distance between them*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class distanceOfTwoPoints {
    public static void main (String[] args){
        //create a scanner
        Scanner input = new Scanner(System.in);
       
        //prompt users to enter two points x1 and y1
        System.out.print(" Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
       // prompt user to enter two points x2 and y2
        System.out.print(" Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        //now solve for distance
        // to make it more readable, i will create two variable that would contain
        // the formula for calculating x and y
        
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1) , 2);
        
        //solve for distance
        double distance = Math.sqrt( x + y );
        
        System.out.println("The distance between the points is " + distance);
    }
    
}

/*This program prompts the user to enter a point(x,y) and checks whether the point
is within the circle centered at (0,0) with radius 10*/
package Selection$chapter3;
import java.util.Scanner;
public class pointInACircle {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt user to point x and y
        System.out.print(" Enter a point with two coordinates: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        //solve for the distance of x and y
        double x = Math.sqrt(Math.pow (x1 - 0, 2));
        double y = Math.sqrt(Math.pow(y1 - 0, 2));
     
        //calculate distance
        /* the correct formula for this is Math.sqrt(Math.pow((x2 - x1, 2) + (y2 - y1, 2)) */
        double distance = x + y;
        
        //create radius variable
        int radius = 10;
        
        //check if point is inside the circle
        if ((distance <= radius)){
            System.out.println("Point (" + x + " , " +  y + ") is in the circle");
        } else
            System.out.println("Point (" + x + " , " +  y + ") is not in the circle");
        
        
    }
    
}

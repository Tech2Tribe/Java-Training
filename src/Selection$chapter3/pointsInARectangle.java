/*This program prompts the user to enter a point and checks whether the point is within the 
rectangle centered at (0,0) with width 10 and height 5*/
package Selection$chapter3;
import java.util.Scanner;
public class pointsInARectangle {
    public static void main(String[] args){
        int width = 10;
        int height = 5;
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a point x and y
        System.out.print(" Enter a point with two coordinates: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        //calculate from the center
        double x1 = Math.sqrt(Math.pow(x - 0, 2));
        double y1 = Math.sqrt(Math.pow(y - 0, 2));
        
        // solve for the distances using width and height
        double horizontalDistance = width / 2;
        double verticalDistance = height / 2.0;
        
        if ((x <= horizontalDistance) && (y <= verticalDistance)){
            System.out.println(" Point ( " + x1 + " , " + y1 + " ) is in the rectangle");
        }else
            System.out.println(" Point ( " + x1 + " , " + y1 + " ) is not in the rectangle");
    }
    
}

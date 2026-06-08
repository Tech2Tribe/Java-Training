/*This program prompts the user to enter the side of a hexagon and display it area*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class areaOfAHexagon {
    public static void main (String[] args){
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //prompt the user to enter the side of the hexagon
        System.out.print(" Enter the side of the hexagon: ");
        double side = input.nextDouble();
        
        //solve for the area
        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
        
        System.out.println(" The area of the hexagon is " + area);
        
        
    }
    
}

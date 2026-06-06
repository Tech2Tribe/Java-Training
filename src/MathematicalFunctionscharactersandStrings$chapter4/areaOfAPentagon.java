/*This program is to calculate the area of a pentagon using the length from the center */
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class areaOfAPentagon {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the length from the center of the pentagon
        System.out.print(" Enter the length from the center to a vertex: ");
        double length = input.nextDouble(); 
        
        //calculate the sides using the formula
        double sides = (2 * length) * Math.sin( Math.PI / 5);
        
        //calculate the area of the pentagon
        double area = (5 * Math.pow(sides, 2)) / (4 * Math.tan(Math.PI / 5));
        
        //display results using formatted print and round up to two digits after the decimal point
        System.out.printf(" The area of the pentagon is %2.2f\n ", area);
        
        
        
    }
}

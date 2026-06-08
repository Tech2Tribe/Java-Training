/* This program calculates the area of a hexagon*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class areaOfHexagon {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the side of a hexagon
        System.out.print(" Enter the sides: ");
        String side = input.next();
        
       
        //convert the string into a double
        double s = Double.parseDouble(side);
        
        //safeguarding against incorrect input
        if (s <= 0){
            System.out.println(" Sides must be a positive number greater than 0 ");
            return;
        } 
        
      
        //calculate the area 
        double area = 6 * Math.pow(s , 2) / (4 * (Math.tan(Math.PI / 6)));
        
        System.out.printf(" The area of the hexagon is %.2f %n" , area);
           
        //close input.
        input.close();
        
    }
    
}

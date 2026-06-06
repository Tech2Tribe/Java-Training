/* the code below computes the volume of a cylinder and the area */
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class VolumeOfACylinder {
    public static void main (String[] args){
        //create the scanner
        Scanner input = new Scanner (System.in);
        
        //prompt the user to enter the radius and lenght of the cylinder
        System.out.print(" Enter the radius and the lenght of the cylinder: "); 
        double radius= input.nextDouble();
        double length = input.nextDouble();
        
        //solve for area and volume
        double area = radius * radius * Math.PI;
        double volume = area * length;
        
        System.out.println(" the area is " + area);
        System.out.println(" the volume is " + volume);
     
    }
    
}

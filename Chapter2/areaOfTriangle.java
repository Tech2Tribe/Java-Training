/* This program prompts user to enter three points of a triangle and display its area */
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class areaOfTriangle {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner (System.in); 
        double x1 = 1.5;
        double x2 = 4.6;
        double x3 = 9.5;
        double y1 = -3.4;
        double y2 = 5;
        double y3 = -3.4;
        
        
        //prompt user to enter the point for x1 and y1
        //System.out.print(" Enter the point for x1 and y1: ");
       // double x1 = input.nextDouble();
       // double y1 = input.nextDouble();
        
        //prompt user to enter the point for x2 and y2
       // System.out.print(" Enter the point for x2 and y2: ");
       // double x2 = input.nextDouble();
        //double y2 = input.nextDouble();
        
        //prompt user to enter the point for x3 and y3
        //System.out.print(" Enter the point for x3 and y3: ");
        //double x3 = input.nextDouble();
        //double y3 = input.nextDouble();
        
        // group each side
        
        double side1 = (x1 + y1);
        double side2 = (x2 + y2);
        double side3 = (x3 + y3);
        
        double side = ((side1 + side2 + side3 ) / 2);
        
        //solve for area
        double area = (Math.sqrt( side * ((side - side1) * (side - side2) * (side - side3))));
       
        System.out.println("the area of the triangle is  " + (int)area);
        
    }
    
}
//i am going to skip this
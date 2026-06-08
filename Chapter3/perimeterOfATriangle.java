/*This program reads three edges of a triangle and computes the perimeter */
package Selection$chapter3;
import java.util.Scanner;
public class perimeterOfATriangle {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the three edges of a triangle
        System.out.println(" Enter the edges of the triange: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int perimeter = a + b + c;
        
        // calculate the perimeter
        if (((a + b) >= c) || ((a + c) >= b) || ((b + a) >= c) || ((b + c) >= a) ||
                ((c + a) >= b) || ((c + b) >= b)){
            System.out.println( " The perimeter is " + perimeter);
        } else if(((a + b) <= c) || ((a + c) <= b) || ((b + a) <=  c) || ((b + c) <= a) ||
                ((c + a) <= b) || ((c + b) <= b)){
            System.out.println(" input is invalid");
        }
    }
}

/*This program prompt the user to enter an integer and determines if it divisible*/
package Selection$chapter3;
import java.util.Scanner;
public class usingOperators {
    public static void main(String[] args){
        // create a Scaanner
        Scanner input = new Scanner (System.in);
        
        //prompt user to enter an integer
        System.out.print(" Enter an integer: ");
        int number = input.nextInt();
        
        //using &&, || and ^ to determine divisibility
        System.out.println("Is " + number + " divisible by 5 and 6? " + ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("Is " + number + " divisible by 5 and 6? " + ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is " + number + " divisible by 5 and 6?, but not both? " + ((number % 5 == 0) ^ (number % 6 == 0)));
    }
    
}

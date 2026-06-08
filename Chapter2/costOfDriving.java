/*this program calculates the cost of driving*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class costOfDriving {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt user to enter driving distance
        System.out.print(" Enter the driving distance: ");
        double distance = input.nextDouble();
        
        //prompt user to enter the miles per gallon
        System.out.print(" Enter the miles per gallon: ");
        double miles = input.nextDouble();
        
        //prompt the user to price per gallon
        System.out.print(" Enter the price per gallon: ");
        double price = input.nextDouble(); 
       
 
       //solve for cost
       double cost = (distance / miles) * price;
       
        System.out.println(" The cost of driving is "  + cost);
    }
    
}

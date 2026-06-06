/*The following program helps in calculating the subtotal and gratuity rate*/
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class calculateTips {
    public static void main (String[] args){
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        // prompt users to enter subtotal amd gratuity rate
        System.out.print(" Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        // solve for gratuity
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        
        System.out.println(" The gratuity is " + gratuity + " and total is " + total);
    }
    
}

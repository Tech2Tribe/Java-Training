/*This code reads balance and annual percentage and displays the interest for the next month*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class calculateInterest {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter balance and interest rate
        System.out.print(" Enter balance and interest rate (e.g 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        

       
        double interest = balance * ( annualInterestRate / 1200);
        
     
        System.out.println(" The interest is " + interest);
    }
    
}

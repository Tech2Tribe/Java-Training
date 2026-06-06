/*This program calculates future investment value*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class calculateFutureInvestmentValue {
    public static void main (String[] args){
        //create the scanner
        Scanner input = new Scanner (System.in);
        
        //prompt the user to enter the investment amount
        System.out.print(" Enter investment amount: ");
        double investment = input.nextDouble();
        
        // prompt user to enter the annual interest rate in percentage
        System.out.print(" Enter the annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        
        //prompt the user to enter the number of years
        System.out.print(" Enter the number of years: ");
        double years = input.nextDouble();


     double monthlyInterestRate = interestRate / 1200;
     // calculate for future years
     double futureInvestmentValue = investment *   Math.pow ((1 + monthlyInterestRate), (years * 12));
     
        System.out.println(" The accumulated value is $" + futureInvestmentValue);
    }
    
}

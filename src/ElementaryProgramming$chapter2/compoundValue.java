/* This code prompts users to enter a monthly saving amount and display the account value after 6 months*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class compoundValue {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        // prompt users to enter the monthly saving amount
        System.out.print(" Enter the monthly saving amount: ");
        int savings = input.nextInt();
        
        //calculate the annual interest rate
        double annualInterest =  (5.0 / 100) / 12;
        
        // calculate interest for each month
        double firstMonth = savings * (1 + annualInterest) ;
        
        //calculate interest for the second month
        double secondMonth = (savings + firstMonth) * ( 1 + annualInterest);
        
        //calculate interesr for the third month
        double thirdMonth = (savings + secondMonth ) * (1 + annualInterest);
        
        //calculate interest for the fourth month
        double fourthMonth = (savings + thirdMonth ) * (1 + annualInterest);
        
        //calculate interest for the fifth month
        double fifthMonth = (savings + fourthMonth ) * ( 1 + annualInterest);
        
        //calculate interest for the sixth month
        double sixthMonth = (savings + fifthMonth ) * ( 1 + annualInterest );
        
        System.out.println(" After the sixth month, the account value is $" + sixthMonth);
        
        
        /* the (savings + perMonth) helps to increase the savings monthly  and 
        (1 + annualInterest) increases the interest per month by 1
        */
        
        
       
        
        
    }
    
}

/*This program rewrites ComputeChange in chapter2 and reads the user's input as strings.
such that it extracts the dollar amount before the decimal point and cents after the decimal amount using the indexOf and substring methods*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class MonetaryUnits {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter the amount
        System.out.print(" Enter the amount: ");
        String amount = input.next();
        
        //find the index of the decimal point
        int index = amount.indexOf(".");
        
        //extract dollars and cents using substring
        int dollars = Integer.parseInt(amount.substring(0, index));
        int cents = Integer.parseInt(amount.substring(index + 1));
        
        //convert everything to cents
        int totalCents = dollars * 100 + cents;
        
        //find one dollar
        int oneDollar = totalCents / 100;
        totalCents = totalCents % 100;
        
        //find the quarters in the cents
        int quarters = totalCents / 25;
        totalCents = totalCents % 25;
        
        //find the dimes in the cent
        int dimes = totalCents / 10;
        totalCents = totalCents % 10;
        
        //find the nickels
        int nickels = totalCents / 5;
        totalCents = totalCents % 5;
        
        //find the penny
        int pennies = totalCents;
        
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + oneDollar + " dollars");
        System.out.println(" " + quarters + " quarters ");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickels + " nickels");
        System.out.println(" " + pennies + " pennies");
    }
}
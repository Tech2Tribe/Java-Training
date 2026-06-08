/*this program reads an integer between 0 and 1000 and add all the digits in the integer*/
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class SumOfInteger0to1000 {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        // prompt users to enter a number between 0 and 1000
        System.out.print(" Enter a number between 0 and 1000; ");
        double number = input.nextDouble();
        
        // extract digits with % and / and add all
        double digit1 = number % 10;
        
        double digit2 = number / 10;
        double totalDigit2 = (int)digit2 % 10;
       
        
        double digit3 = number / 10;
        double totalDigit3 = digit3 / 10;
        
        double sumOfDigits = digit1 + totalDigit2 + totalDigit3;
        
        System.out.println(" The sum of the digits is " + (int)sumOfDigits);
        
       
      
          
        
        
        
        
    }
    
}

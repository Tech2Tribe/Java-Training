/*This proram prompts the user to enter a three digit integer and determines whether the number is a palindrome or not*/
package Selection$chapter3;
import java.util.Scanner;
public class palindromeNumber {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter a three-digit number
        System.out.print(" Enter a three-digit integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        //using if statement to check for palindrome
        if (number1 == number3)
            System.out.println(number1 + "" +  number2 + "" + number3 + " is a palindrome ");
        else
            System.out.println( number1 + "" + number2 + "" + number3 + " is not a palindrome");
    }
    
}

/*this proram converts hex digit and displays it in binary*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class hexToBinary {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a hex digit number
        System.out.print(" Enter a hex digit number: ");
        String hexdigit = input.next().toUpperCase();
        
        //get the character of the string
        char digit = hexdigit.charAt(0);
        
        //guard against wrong input
        if ((digit < 0 || digit > 9) && (digit < 'A' || digit > 'F' )){
            System.out.println(hexdigit + " is an invalid input");
            return;
        }
    
        
        //checks if the string's lenght is more than 1
        if (hexdigit.length() > 1) {
        System.out.print("Please enter a single hex digit.");
          return;
        }
        
        
        //16 is the base value for hexadecimal 
        int value = Integer.parseInt(hexdigit, 16);
        
        //converts  value to binary 
        String binary = Integer.toBinaryString(value);
        
        //display result
        System.out.println(" The binary for hex digit " + hexdigit.toUpperCase() + " is " + binary);
        
    }
}

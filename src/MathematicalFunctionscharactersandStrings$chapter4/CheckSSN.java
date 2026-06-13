/*This progrram prompts users to enter a Social Security Number and checks whether the input is Valid */
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class CheckSSN {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a SSN
        System.out.print(" Enter a SSN: (DDD-DD-DDDD): ");
        String SSN = input.nextLine();
        
        
        // using boolean to evaluate users SSN to make sure its all digits and it 11
        boolean isValid = SSN.length() == 11 &&
            Character.isDigit(SSN.charAt(0)) &&
            Character.isDigit(SSN.charAt(1)) &&
            Character.isDigit(SSN.charAt(2)) &&
            SSN.charAt(3) == '-' &&
            Character.isDigit(SSN.charAt(4)) &&
            Character.isDigit(SSN.charAt(5)) &&
            SSN.charAt(6) == '-' &&
            Character.isDigit(SSN.charAt(7)) &&
            Character.isDigit(SSN.charAt(8)) &&
            Character.isDigit(SSN.charAt(9)) &&
            Character.isDigit(SSN.charAt(10));

        if (isValid)
            System.out.println(SSN + " is a valid social security number");
        else
            System.out.println(SSN + " is an invalid social security number");
    }
}

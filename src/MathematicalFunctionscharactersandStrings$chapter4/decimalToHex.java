/* this program converts integer to hexnumber*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class decimalToHex {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter a decimal value between 0 and 15
        System.out.print(" Enter a decimal value (0 to 15): ");
        String hex = input.next();
        
        //converting String hex to integer
        int value = Integer.parseInt(hex);
        
        //guard against wrong input
        if (value < 0 || value > 15) {
        System.out.println( hex + " is an invalid input");
        System.exit(1);
        }
        
        //convert to hex
       String hexvalue = Integer.toHexString(value);
        
        System.out.println(" The hex value is " + hexvalue.toUpperCase());
    }
}

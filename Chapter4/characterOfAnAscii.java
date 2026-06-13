/* this program receives an ASCII code and displays it character*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class characterOfAnAscii {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the ASCII code
        System.out.print(" Enter an ASCII code (integer between 0 and 127): ");
        String code = input.next();
        
        //change String code to int
        int asciiCode = Integer.parseInt(code);
       
        //cast integer to char to get the character
        char ch = (char) asciiCode;
        
        //display 
        System.out.println(" the character for the ASCII code " + code + " is " + ch);
    }
    
}

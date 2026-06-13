/*this program prompts users to enter a string and display the length of the string and it's first character */
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class ProcessString {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a string
        System.out.print(" Enter a string: ");
        String entry = input.nextLine().trim();
        
        //get the first character of the string
        char firstCharacter = entry.charAt(0);
        
        int length = entry.length();
        
        System.out.printf(" the length of the string %s is %d and the first character is %c \n " , entry ,length,firstCharacter );
    }
    
}

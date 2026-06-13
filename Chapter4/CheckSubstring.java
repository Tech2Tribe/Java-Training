/*this program  prompts the user to enter two strings and checks if the second string is a substring
of the first*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class CheckSubstring {
    public static void main (String[] args){
        //create a Scannert 
        Scanner input = new Scanner(System.in);
        String sub;
        //prompt users to enter the first string
        System.out.print("Enter the first string: ");
        String s1 = input.next();
        
        //prompt users to enter the second string
        System.out.print("Enter the second string:");
        String s2 =input.next();
        
        //checking if s1 contains s2
        if (s1.contains(s2))
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);
        
    }
}
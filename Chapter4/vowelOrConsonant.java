/* This program prompts users to enter a letter and checks if the letter is a vowel or a consonant*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class vowelOrConsonant {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a letter grade
        System.out.print(" Enter a letter grade: ");
        String letter = input.next();
        
        //check if the letter is beyond a single character
        if (letter.length() > 1){
            System.out.print(" Enter a valid letter.\n");
            return;
        }
        
       
     //   check for vowel and consonant
        String consonant = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String vowel = "AEIOUaeiou";
        if (vowel.contains(letter)){
            System.out.printf(" %s is a vowel \n" ,letter);     
        } else if (consonant.contains(letter)){
            System.out.printf(" %s is a consonant\n" , letter);
        }else 
            System.out.printf(" %s is not a valid input \n" , letter);
        
        //close input
        input.close();
     
    }
    
}

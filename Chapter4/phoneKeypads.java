/* the program prompts users to enter a letter and displays it's corresponding number*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class phoneKeypads {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a letter
        System.out.print("Enter a letter(Aa - Zz): ");
        String letter = input.next();
        
        //checking if letter is more than the length required
        if(letter.length() > 1){
            System.out.print(" Enter a letter (Aa - Zz): \n ");
            return;
        }
        
        
        //declaring different Strings for each number
        String two = "AaBbCc";
        String three = "DdEeFf";
        String four = "GgHhIi";
        String five = "JjKkLl";
        String six = "MmNnOo";
        String seven = "PpQqRr";
        String eight = "TtUuVv";
        String nine = " WwXxYyZz";
        
        //using nested if-else statement
        if (two.contains(letter)){
            System.out.print(" The corresponding number is 2 \n" );
        } else if (three.contains(letter)){
            System.out.print(" The corresponding number is 3 \n");
        } else if (four.contains(letter)){
            System.out.print(" The corresponding number is 4 \n");
        } else if(five.contains(letter)){
            System.out.print(" The corresponding number is 5 \n");
        } else if (six.contains(letter)){
            System.out.print(" The corresponding number is 6 \n");
        } else if (seven.contains(letter)){
            System.out.print(" The corresponding number is 7 \n");
        } else if (eight.contains(letter)){
            System.out.print(" The corresponding number is 8 \n");
        } else if (nine.contains(letter)){
            System.out.print(" The corresponding number is 9 \n");
        } else
            System.out.print( letter + " is an invalid input \n");
        
        //close input
        input.close();
    }
    
}

/* This program converts the letter grade (A,B,C,C or D and displays 4,3,2,1 or 0*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class letterGradetoNumber {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a letter grade
        System.out.print(" Enter a letter grade (A - F): ");
        String letter = input.next().toUpperCase();
        
        //check for string length
        if(letter.length() > 1){
            System.out.print("Error, Enter a letter grade (A - F) \n");
            return;
        }
        
        //get the characters from String letters
        char grade = letter.charAt(0);
   
        //using switch statement to display corresponding value
        switch(grade){
            case 'A': System.out.print("The numeric value for grade " + letter + " is 4 \n"); break;
            case 'B': System.out.print("The numeric value for grade " + letter + " is 3 \n"); break;
            case 'C': System.out.print("The numeric value for grade " + letter + " is 2 \n"); break;
            case 'D': System.out.print("The numeric value for grade " + letter + " is 1 \n"); break;
            case 'F': System.out.print("The numeric value for grade " + letter + " is 0 \n"); break;
            default: System.out.print( letter + " is an invalid grade\n");
        }
        //close input
        input.close(); 
    }
}

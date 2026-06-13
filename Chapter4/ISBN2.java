/*this program checks the ISBN-1,the ISBN is entered as a string*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class ISBN2 {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the first 9 digits
        System.out.print("Enter the first 9 digits of an ISBN as a string: ");
        String ISBN = input.next();
        
        //getting each character from the string
        char one = ISBN.charAt(0);
        char two = ISBN.charAt(1);
        char three = ISBN.charAt(2);
        char four = ISBN.charAt(3);
        char five  = ISBN.charAt(4);
        char six = ISBN.charAt(5);
        char seven = ISBN.charAt(6);
        char eight = ISBN.charAt(7);
        char nine = ISBN.charAt(8);
        
        //coverting each character from the string to an int
        int d1 = one - '0';
        int d2 = two - '0';
        int d3 = three - '0';
        int d4 = four - '0';
        int d5 = five - '0';
        int d6 = six - '0';
        int d7 = seven - '0';
        int d8 = eight - '0';
        int d9 = nine - '0';
        
        //calculate check sum 
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        //using if statements
        if (checksum >= 10){
            System.out.print("The ISBN number is " + ISBN + "X \n");
        } else
            System.out.print("The ISBN number is " + ISBN + checksum + "\n");
  
    }
}

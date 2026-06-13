/* This program prompts the user to enter two characters and displays the major and status represented in the characters.*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class MajorAndStatus {
    public static void main (String[] args){
           Scanner input = new Scanner(System.in);
       System.out.print("Enter two characters (e.g M1): ");
        String entry = input.next().toUpperCase();

        char majorChar = entry.charAt(0);
        char statusChar = entry.charAt(1);

        // Determine major
        String major;
        switch (majorChar) {
            case 'M': major = "Mathematics"; break;
            case 'C': major = "Computer Science"; break;
            case 'I': major = "Information Technology"; break;
            default:  major = "Unknown Major"; break;
        }

        // Determine status
        String status;
        switch (statusChar) {
            case '1': status = "Freshman"; break;
            case '2': status = "Sophomore"; break;
            case '3': status = "Junior"; break;
            case '4': status = "Senior"; break;
            default:  status = "Unknown Status"; break;
        }

        System.out.println(major + " " + status);
    }
}
/*This program prompts the user to enter a year and the first three letters 
of a month's name and displays the numbers of days in the month*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class DaysOfAMonth {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter a year
        System.out.print(" Enter a year: ");
       int year = input.nextInt();
        
        
        //getting the month
        System.out.print(" Enter the month(i.e Jan): ");
        String month = input.next();
        
         // Leap year check
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        
        switch(month){
            case "Jan": System.out.println(month + "," +  year + " has 31 days"); break;
            case "Feb": int febDays = isLeapYear ? 29 : 28;
                System.out.println(month + ", " + year + " has " + febDays + " days");
                break;
            case "Mar": System.out.println(month + "," +  year + " has 31 days"); break;
            case "Apr": System.out.println(month + "," +  year + " has 30 days"); break;
            case "May": System.out.println(month + "," +  year + " has 31 days"); break;
            case "Jun": System.out.println(month + "," +  year + " has 30 days"); break;
            case "Jul": System.out.println(month + "," +  year + " has 31 days"); break;
            case "Aug": System.out.println(month + "," +  year + " has 31 days"); break;
            case "Sep": System.out.println(month + "," +  year + " has 30 days"); break;
            case "Oct": System.out.println(month + "," +  year + " has 31 days"); break;
            case "Nov": System.out.println(month + "," +  year + " has 30 days"); break;
            case "Dec": System.out.println(month + "," +  year + " has 31 days"); break;
            default: System.out.println(" Invalid month entered.");
             }

      
       
    }
    
}

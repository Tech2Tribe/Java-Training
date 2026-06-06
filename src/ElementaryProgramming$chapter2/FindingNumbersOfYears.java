/* This program prompts users to enter the minutes and displays the number of years and days */
package ElementaryProgramming$chapter2;

import java.util.Scanner;
public class FindingNumbersOfYears {
    public static void main (String[] args){
        //create the Scanner
        Scanner input = new Scanner (System.in);

        
        //prompt users to enter the numbers of minutes
        System.out.print(" Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        //solve for minutes
        int hours = minutes / 60;
        int days = hours / 24;
        int totalDays = days % 365;
   
        
        
        int years = days /365;
      int totalYears = years % 365;
        
        System.out.println( minutes + " minutes is approximately " + years + " years and " + totalDays + " days");
    
        
    }
    
}

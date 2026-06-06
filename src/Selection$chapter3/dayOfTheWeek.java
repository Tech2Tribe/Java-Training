/*this program calculates the day of the week using Zeller's congruence (developed by Christain Zeller)*/
package Selection$chapter3;
import java.util.Scanner;
public class dayOfTheWeek {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter the year
        System.out.print(" enter the year: ");
        int year = input.nextInt();
        
        //prompt the user to enter the month
        System.out.print(" Enter the month 1 - 12: ");
        int m = input.nextInt();
        
        int originalMonth = m ;
        if(m == 1){
            m = 13;
            year--;
        } else if (m == 2){
            m = 14;
            year--;
        }
        
         //calcualte the year
        int k = year % 100;
        //calculate the century
        int j = year / 100;
            
        
        //using switch to assign the month
        String month = " ";
        switch (originalMonth){
            case 1: month = "January";  break;
            case 2: month = "February"; break;
            case 3: month = "March";    break;
            case 4: month = "April";    break;
            case 5: month = "May";      break;
            case 6: month = "June";     break;
            case 7: month = "July";     break;
            case 8: month = "August";   break;
            case 9: month = "September";break;
            case 10:month = "October";  break;
            case 11:month = "November"; break;
            case 12:month = "December"; break;
        }
        
        //prompt user to enter the day of the month
        System.out.print(" Enter the day of the month(1-31): ");
        int q = input.nextInt();
       
        // using Zellers congruence
      int dayoftheWeek = (int)((q + 26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
      
        //using switch to assign the day of week to a number
        String h = "";
        switch (dayoftheWeek){
            case 0: h = "Saturday";  break;
            case 1: h = "Sunday";  break;
            case 2: h = "Monday"; break;
            case 3: h = "Tuesday";  break;
            case 4: h = "Wednesday";break;
            case 5: h = "Thursday";  break;
            case 6: h = "Friday";break;
        }
                 
         
        
        System.out.println("Day of the week is " + h);
       

        
    }
    
}

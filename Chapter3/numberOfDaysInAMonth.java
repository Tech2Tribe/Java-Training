/*this program promptuser to enter the month and years and displays the numbers of days in the month*/
package Selection$chapter3;
import java.util.Scanner;
public class numberOfDaysInAMonth {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the month 
        System.out.print(" Enter the Month's number: ");
        int month = input.nextInt();
        
        //prompt user to enter the year
        System.out.print(" Enter the year: ");
        int year = input.nextInt();
        
        //using switch to assign the months to a number
        String realMonth = "";
        int days = 0;
        switch(month){
            case 1: realMonth = " January";    days = 31;  break;
            case 2: realMonth = " February";   days = 28;  break;
            case 3: realMonth = " March";      days = 31;  break;
            case 4: realMonth = " April";      days = 30;  break;
            case 5: realMonth = " May";        days = 31;  break;
            case 6: realMonth = " June";       days = 30;  break;
            case 7: realMonth = " July";       days = 31;  break;
            case 8: realMonth = " August";     days = 31;  break;
            case 9: realMonth = " September";  days = 30;  break;
            case 10: realMonth = " October";   days = 31;  break;
            case 11: realMonth = " November";  days = 30;  break;
            case 12: realMonth = " December";  days = 31;  break;
        }
        
       //leap year check for february
       if (month == 2){
           if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
               days = 29;
           }
       }
       
        System.out.println(realMonth + " " + year + " has " + days + " days" );
        
    }
    
}

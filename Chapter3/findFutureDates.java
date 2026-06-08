/* This program prompt users to enter the numbers of days after today and for a future day 
and display the future day of the week*/
package Selection$chapter3;
import java.util.Scanner;
public class findFutureDates {
    public static void main (String[] args){
        // create a scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter today's day
        System.out.print(" Enter today's day (Sunday is 0, Monday is 1..): ");
        int todayDay = input.nextInt();
        
        //prompt users to enter the numbers of days elasped since today
        System.out.print(" Enter the numbers of days elasped since today: ");
        int numberOfDays = input.nextInt();
        
        int futureDay = (todayDay + numberOfDays)% 7;
        
       
        //use switch statement to get todaysName
        String todayName = ""; // String todayName = ""; is an empty string and it was later called in the switch statement and was assigned values in the case
        switch(todayDay){
            case 0: todayName = "Sunday"; break;
            case 1: todayName = "Monday"; break;
            case 2: todayName = "Tuesday"; break;
            case 3: todayName = "Wednesday"; break;
            case 4: todayName = "Thursday"; break;
            case 5: todayName = "Friday"; break;
            case 6: todayName = "Saturday";    
        }
        
        //use switch statement to get futureName
        String futureName = "";
        switch (futureDay){
            case 0: futureName = "Sunday"; break;
            case 1: futureName = "Monday"; break;
            case 2: futureName = "Tuesday"; break;
            case 3: futureName = "Wednesday"; break;
            case 4: futureName = "Thursday"; break;
            case 5: futureName = "Friday"; break;
            case 6: futureName = "Saturday"; break;
        }
        
        System.out.println( " Today is " + todayName + " and the future day is " + futureName);
    }
    
}

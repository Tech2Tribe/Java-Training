/*This profram displays the current time in GMT,the user enters a time zone offset to GMT and displays the time
in the specified time zone*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class currentTime {
    public static void main (String[] args){
        //create the Scanner
        Scanner input = new Scanner (System.in);
        
       
        //prompt the users to enter a timezone offset to GMT
        System.out.print(" Enter a time zone that is offset to GMT: ");
         int usersTime = input.nextInt();
        
         //use System.currentTimeMillis() to get the actual time since the unix epoch in 1970
        long milliSeconds = System.currentTimeMillis() + (1000 * 60 * 60 * usersTime);
        
        // now get the current Time
        long seconds = milliSeconds / 1000;
        long totalSeconds = seconds % 60;
        
        long minutes = seconds / 60;
        long totalMinutes = minutes % 60;
        
        long hours = minutes / 60;
        long totalHours = hours % 24;
        
       // long localHours = (totalHours + usersTime + 24)% 24;
        
        System.out.println(" The current time is " + totalHours + ":" + totalMinutes + ":" + totalSeconds + ":");
        
        
    }
    
}

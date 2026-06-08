/*This code is to help get the current time using System.currentTimeMillis() */

package ElementaryProgramming$chapter2;

/**
 *
 * @author USER
 */
public class AccurateTime {
    public static void main (String[] args){
        //get the total millisecs
        long totalMilliSeconds = System.currentTimeMillis() + (1000 * 60 * 60);
        //the (1000 * 60 * 60)was added because UTC (coordinated Universal Time ) isnt nigeria's local time and the output was 1hr behind, so i added it so 
        // it can meet up to the nigerian time.
        
        //get total seconds
        long totalSeconds = totalMilliSeconds / 1000 ;
        
        // get current seconds
        long currentSeconds = totalSeconds % 60;
        
        // get total minutes
        long totalMinutes = totalSeconds / 60;
        
        // get current minutes
        long currentMinutes = totalMinutes % 60;
        
        // get total hours
        long totalHours = totalMinutes / 60 ;
        
        // get current hours
        long currentHour = totalHours % 24;
        
     
        
        System.out.println(" The time is " + currentHour + "hours " + currentMinutes + "minutes " + currentSeconds + "seconds");
        
        
    }
    
}

/* This program helps to calculate the Average speed in kilometers*/
package IntroductionToJava$chapter1;

/**
 *
 * @author USER
 */
public class AverageSpeedInKilometer {
    public static void main (String[] args){
        double mile = 1.6;
        double distance = 24;
        double time = 1.6764; // this was gotten by changing 1hr, 40 min and 35secs into hours
        // divide 40 by 60 andivide 35 by 3600(1hour in secs)
        
        //solve for speed
        double speed = 24 / 1.6764;
        
        //convert kilometer to mile
        double AverageSpeed = speed * mile;

        System.out.println(" The Average speed is " + AverageSpeed);
    }
    
}

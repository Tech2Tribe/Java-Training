/*this code calculate the average speed of a runner */
package IntroductionToJava$chapter1;

/**
 *
 * @author USER
 */
public class AverageSpeedInMiles {
    public static void main (String[] args){
        double mile = 1.6;
        double distance = 14;
        double time = 45.5 / 60;// 45 minutes, 30 secs; 30 secs was converted to mins by dividing by 60
       
        // solve for speed
        double speed = distance / time;
        
       
        
        // converting speed to mile
        double averageSpeed = speed / mile ;
        
        System.out.println(" The average speed is " + averageSpeed);
    }
}

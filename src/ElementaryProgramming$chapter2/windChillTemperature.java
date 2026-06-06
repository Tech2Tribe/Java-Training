/*This program prompts user to enter a temperatue between -58F or above 41F and a wind-chill temperature*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class windChillTemperature {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter the temperature in fahrenheit
        System.out.print(" Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();
        
        //prompt user to enter the wind speed, it must be greater than /equals to 2 in miles per hour
        System.out.print(" Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        
        // calculate the wind-chill temperature
        
        double windChill =( 35.74 +  (0.6215 * temperature )) - (35.75 * Math.pow( speed , 0.16)) + (0.4275 * temperature * (Math.pow(speed, 0.16)));
        
        System.out.println(" The wind chill index is " + windChill);
    }
    
}

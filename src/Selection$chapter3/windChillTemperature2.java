/*this revises the exercise 2.17, it prompts the user to enter a temperature and a wind speed
and displays the wind-chill temperature if the input is valid, otherwise displays an invalid*/
package Selection$chapter3;
import java.util.Scanner;
public class windChillTemperature2 {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter the temperature
        System.out.print(" Enter the temperature: ");
        double temperature = input.nextDouble();
        
        // prompt users to enter the wind speed
        System.out.print(" Enter the wind speed: ");
        double speed = input.nextDouble();
        
        //calculate the windchill
        double windChill =( 35.74 +  (0.6215 * temperature )) - (35.75 * Math.pow( speed , 0.16)) + (0.4275 * temperature * (Math.pow(speed, 0.16)));
        
        //using if to check if the temperature is below -58 and above 41 and if speed is below 2
        if ((temperature <= -54) || (temperature >= 41)) {
            System.out.println(" temperature is invalid");
        }if (speed <= 2){
            System.out.println(" Speed is invalid");
        }else
            System.out.println(" The wind chill temperature is " + (int)windChill);
        
        
    }
    
}

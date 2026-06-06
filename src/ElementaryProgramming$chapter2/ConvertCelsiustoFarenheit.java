/*This program helps to convert celsius to Fahrenheit whilst taking data from the user*/
package ElementaryProgramming$chapter2;
import java.util.Scanner;
public class ConvertCelsiustoFarenheit {
    public static void main (String[] args){
        // Create the scanner
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter celsius
        System.out.print(" Enter the degree of the celsius: ");
        double celsius = input.nextDouble();
        
       // convert the celsius to farenheit
       double farenheit = (9.0 / 5 ) * celsius + 32;
       
        System.out.println(" The conversion of the celsius " + celsius + " to farenheit is " + farenheit);
       
        
    }
    
    
}

/*This program prompts the user to enter the weight of thr package and display the shipping cost*/
package Selection$chapter3;
import java.util.Scanner;
public class costOfShipping {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the weight of the package
        System.out.print(" Enter the weight of the package:  ");
        int weight = input.nextInt();
        
        //using nested if-else statement 
        if ((0 < weight) && (weight <= 1)){
            System.out.println(" The shipping cost is 3.5");
        } else if ((1 < weight) && (weight <= 3)){
            System.out.println(" The shipping cost is 5.5");
        } else if ((3 < weight) && (weight <= 10)){
            System.out.println(" The shipping cost is 8.5 ");
        } else if((10 < weight) && (weight <= 20)){
            System.out.println(" The shipping cost is 10.5");
        } else if( weight >= 50)
            System.out.println(" The package cannot be shipped");   
    }
    
}

/*This program increase pay by 3% if score is greater than 90 otherwise increase pay by 1%  */
package Selection$chapter3;
import java.util.Scanner;
public class scoreIncreaseUsingIf {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        ///prompt users to enter a score
        System.out.print(" Enter the score: ");
        double score = input.nextInt();
        
        
        if (score >= 90){
            double pay  = score * 3 /100;
            double increase = score + pay;
            System.out.println(" pay is " + increase );
        } else{
            double pay = score * 1 / 100;
            double increase = score + pay;
            System.out.println(" pay is " + increase);
        }
            
            
           
    }
    
    
}

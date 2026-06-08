/*This program prompts the user to enter a three digit number and determines whether the user wins*/
package Selection$chapter3;
import java.util.Scanner;
public class lottery {
    public static void main (String[] args){
        //create random numbers
        int lottery1 = (int)(Math.random() * 10);
        int lottery2 = (int)(Math.random() * 10);
        int lottery3 = (int)(Math.random() * 10);
        
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to guess a three digit number
        System.out.print(" Guess a three digit number: ");
        int guess1 = input.nextInt();
        int guess2 = input.nextInt();
        int guess3 = input.nextInt();
        
        // using nested if-elses statement to check if guess == lottery and displaying the reward
        if (lottery1 == guess1 && lottery2 == guess2 && lottery3 == guess3){
            System.out.println(" You won the lottery, the reward is $10,000");
        } else if((lottery1 == guess1 || lottery1 == guess2 || lottery1 == guess3) &&
                 (lottery2 == guess1  || lottery2 == guess2 || lottery2 == guess3) &&
                 (lottery3 == guess1  || lottery3 == guess2 || lottery3 == guess3)){
            System.out.println(" You won the lottery, the reward is $3,000"); 
        }else if((lottery1 == guess1 || lottery1 == guess2  ||  lottery1 == guess3) ||
                (lottery2 == guess1  || lottery2 == guess2  || lottery2 == guess3) ||
                (lottery3 == guess1  || lottery3 == guess2  || lottery3 == guess3)){
            System.out.println(" You won the lottery, the reward is $1000");
        } else
            System.out.println(" You lost the lottery");
        
        // this line shows the actual lottery guess
        System.out.println(lottery1 +"" + lottery2 + "" + lottery3);
    
      
    }
    
}

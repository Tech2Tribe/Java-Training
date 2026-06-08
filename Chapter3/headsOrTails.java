/*This program lets the user guess whether the flip of a coin results in heads or tails. */
package Selection$chapter3;
import java.util.Scanner;
public class headsOrTails {
    public static void main (String[] args){
        //generate a random guess of 0 and 1
        int headsOrTails = (int)(Math.random() * 2);
        
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter a guess
        System.out.print(" Enter a guess for Heads(0) or Tails(1):  ");
        int guess = input.nextInt();
        
        //using if else to check if Guess correlates with headsOrTails then printing
        if (guess == headsOrTails)
            System.out.println(" Guess is correct");
        else
            System.out.println(" Guess is incorrect");
        
        System.out.println(headsOrTails);
    }
    
}

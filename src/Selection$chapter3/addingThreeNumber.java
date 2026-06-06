/*this program generates three single digit 
integers and prompt the users to enter the sum of these integers */
package Selection$chapter3;
import java.util.Scanner;
public class addingThreeNumber {
    public static void main (String[] args){
        int random1 = (int)(Math.random() * 10);
        int random2 = (int)(Math.random() * 10);
        int random3 = (int) (Math.random() * 10);
        
        int correctAnswer = random1 + random2 + random3;
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        // prompt users to enter the correct answer
        System.out.println(" What is the sum of " + random1 + " and " + random2 + " and " + random3 + "?");
        int answer = input.nextInt();
        
       // using if 
       if (answer == correctAnswer)
            System.out.println(" Your answer is correct ");
       else
            System.out.println(" The correct answer is " + correctAnswer);
        
        
        
    }
    
}

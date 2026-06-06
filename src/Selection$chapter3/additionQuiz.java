/*this program revises the subtractionQuiz.Java in listing 3.3. to randomly generate an addition question */
package Selection$chapter3;
import java.util.Scanner;
public class additionQuiz {
    public static void main (String[] args){
        // create random integers less than 100
        int integer1 = (int)(Math.random() * 99);
        int integer2 = (int) (Math.random() * 99);
        
        //use temp to rotate the value in int1 and int2, so the bigger number is placed in front
        //This is redundant to the code, buh..
        int temp = integer1;
        integer1 =integer2;
        integer2 = temp;
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter an answer
        System.out.print(" What is the sum of " + integer1 + " and " + integer2 + ": ");
        int sum = input.nextInt();
        
        //solve for answer
        int answer = integer1 + integer2;
        
        //using if to check if sum corresponds with answer
        if (sum == answer)
            System.out.println(" You are correct ");
        else 
            System.out.println(" The correct answer is " + (integer1 + integer2));
       
    }
    
}

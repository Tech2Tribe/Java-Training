/*This program plays rock, paper, Scissors, with Scisssors (0), rock(1) and Paper(2) */
package Selection$chapter3;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main (String[] args){
        //create random numbers from 0 - 2
        int random = (int)(Math.random() * 3);
        
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter either Scissors(0), rock(1) and paper(2)
        System.out.print(" Enter Scissors(0), rock(1) and paper(2): ");
        int guess = input.nextInt();
        
        //using switch to assign them to a number
        String choice = " ";
        switch (random){
            case 0: choice = "Scissors"; break;
            case 1: choice = " rock"; break;
            case 2: choice = " paper"; break;
        }
          String guessed = " ";
        switch (guess){
            case 0: guessed = "Scissors"; break;
            case 1: guessed = " rock"; break;
            case 2: guessed = " paper"; break;
        }
        
        if ((random == 0) && (guess == 1)){
            System.out.println(" The computer is " + choice + ". You are " + guessed + ". You won");
        } else if ((random == 0) && (guess == 2)){
             System.out.println(" The computer is " + choice + ". You are " + guessed + ". You lost");
        } else if ((random == 1) && (guess == 0)){
             System.out.println(" The computer is " + choice + ". You are " + guessed + ". You lost");
        } else if((random == 1) && (guess == 2)){
             System.out.println(" The computer is " + choice + ". You are " + guessed + ". You won");
        } else if((random == 2) && (guess ==  0)){
             System.out.println(" The computer is " + choice + ". You are " + guessed + ". You lost");
        } else if((random == 2) && (guess  == 1)){
             System.out.println(" The computer is " + choice + ". You are " + guessed + ". You won");
        }else if(random == guess){
             System.out.println(" The computer is " + choice + ". You are " + guessed + ", It is a draw");
        }else if (random >= 2){
             System.out.println(" This is not a choice");
              System.exit(1);
        }
      
    }
}

/* this program prompts users to enter three integers and display the integers in non-decreasing order*/
package Selection$chapter3;
import java.util.Scanner;
public class sortThreeIntegers {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter three integers
        System.out.println(" Enter three integers: ");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();
      
        
        //using multiway if else to display integers in non decreasing order
        if (integer1 <= integer2 && integer2 <= integer3){
                System.out.println( integer1 + " " + integer2 + " " + integer3);
            } else if (integer1 <= integer3 && integer3 <= integer2){
                System.out.println(integer1 + " " + integer3 + " " + integer2);
            } else if (integer2 <= integer1 && integer1 <= integer3 ) {
                System.out.println(integer2 + " " + integer1 + " " + integer3);
            } else if(integer2 <= integer3 && integer3 <= integer1){
                System.out.println(integer2 + " " + integer3 + " " + integer1);
            } else if (integer3 <= integer1 && integer1 <= integer2){
                System.out.println( integer3 + " " + integer1 + " " + integer2);
            }else
                System.out.println(integer3 + " " + integer2 + " " + integer1);
                
    }
    
}

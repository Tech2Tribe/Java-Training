/*this program helps to display the days of the week accordingly using switch statement */
package Selection$chapter3;
import java.util.Scanner;
public class gettingDayOfTheWeek$Switch {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter the day of the week
        System.out.print(" Enter the day of the week (start from 0): ");
        int dayOfTheWeek = input.nextInt();
        
        switch (dayOfTheWeek){
            case 0: System.out.println(" it is Sunday"); break;
            case 1: System.out.println(" it is Monday"); break;
            case 2: System.out.println(" it is Tuesday"); break;
            case 3: System.out.println(" it is Wednesday"); break;
            case 4: System.out.println(" it is Thursday"); break;
            case 5: System.out.println(" it is Friday"); break;
            case 6: System.out.println(" it is Saturday");break;
            default: System.out.println("There is no day of the week with number " + dayOfTheWeek);
            System.exit(1);
        }
    }
    
}

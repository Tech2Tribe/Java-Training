/*this code prompts user to enter three cities and displays them in ascending order*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class OrderCities {
    public static void main(String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter the first city
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        
        //prompt user to enter the second city
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        
        //prompt user to enter the third city
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();
        String temp;

// Sort firstCity and secondCity
if (firstCity.compareTo(secondCity) > 0) {
    temp = firstCity;
    firstCity = secondCity;
    secondCity = temp;
}

// Sort firstCity and thirdCity
if (firstCity.compareTo(thirdCity) > 0) {
    temp = firstCity;
    firstCity = thirdCity;
    thirdCity = temp;
}

// Sort secondCity and thirdCity
if (secondCity.compareTo(thirdCity) > 0) {
    temp = secondCity;
    secondCity = thirdCity;
    thirdCity = temp;
}

System.out.println("The three cities in ascending order are: " 
    + firstCity + " " + secondCity + " " + thirdCity);
        
    }
    
}

/*this program reads the users information and prints the payroll statement*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args){
        //create a Scanner
         Scanner input = new Scanner (System.in);
        
        //prompt users to fill the following information
        System.out.print("Fill the following information\n");
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter numbers of hours worked in a week: ");
        double workHours = input.nextDouble();
        
        System.out.print(" Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        
        System.out.print(" Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        
        System.out.print(" Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        
        double grossPay = workHours * hourlyPay;
        
        double federalWithholding = federalTax * grossPay;
        
        double stateWithholding = stateTax * grossPay;
        
        double totalDeduction = federalWithholding + stateWithholding ;
        
        double netPay = grossPay - totalDeduction;
        
        //print
        
        System.out.println(" \n          Employee's Data  ");
        System.out.println("----------------------------------");
        System.out.println("Employee's name: " + name);
        System.out.println("Hours worked: " +(double) workHours );
        System.out.println("Pay Rate: $" + hourlyPay);
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Deductions");
        System.out.println("   Federal Withholding (" + (federalTax * 100) + "%)" + ": $"+ federalWithholding );
        System.out.println("   State Withholding (" + (stateTax * 100) + "%)" + ": $" + stateWithholding);
        System.out.println("   Total Deduction: $" + totalDeduction);
        System.out.printf("Net pay:$%.2f \n" , netPay);
        
        
        
    }
    
}

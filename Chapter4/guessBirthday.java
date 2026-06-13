/*this code is to review Guessbirthday toprompt users to enter Y for yes and N for no*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class guessBirthday {
    public static void main (String[] args){
        String set1 = 
                "1  3   5   7\n" + 
                "9  11  13  15\n" +
                "17 19  21  23\n" + 
                "25 27  29  31";
        
        String set2 = 
                "2  3   6   7\n" + 
                "10 11  14  15\n" +
                "18 19  22  23\n" + 
                "26 27  30  31";
        
        String set3 = 
                "4   5   6    7\n" + 
                "12  13  14  15\n" +
                "20  21  22  23\n" + 
                "28  29  30  31";
        
        String set4 = 
                "8   9   10  11\n" + 
                "12  13  14  15\n" +
                "24  25  26  27\n" + 
                "28  29  30  31";
        
        String set5 = 
                "16  17   18   19\n" + 
                "20  21   22   23\n" +
                "24  25   26   27\n" + 
                "28  29   30   31";
        
        int day = 0;
        
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to answer questions
        //set 1
        System.out.print(" Is your birthday in Set1? \n ");
        System.out.print(set1);
        System.out.print(" \n Enter Y for yes and N for no: ");
        String answer = input.next().toUpperCase(); //change user input to capital  letters
      
        //get the character from the string
        char option = answer.charAt(0); 
       
         //guard against wrong input
        if (option != 'Y' && option != 'N'){
        System.out.print(" Your input is wrong, input is only in Y for yes and N for no\n");
        System.exit(1);
        }
       //add to day if option is Y
        if (option == 'Y'){
          day += 1;
        }
      
      //put a line across
        System.out.println("--------------------------------------");
      
        
        
        
      //set 2
        System.out.print("\n Is your birthday in Set2? \n ");
        System.out.print(set2);
        System.out.print(" \n Enter Y for yes and N for no: ");
        answer = input.next().toUpperCase(); //change user input to capital  letters
      
        //get the character from the string
        option = answer.charAt(0);
         //guard against wrong input
        if (option != 'Y' && option != 'N'){
        System.out.print(" Your input is wrong, input is only in Y for yes and N for no\n");
        System.exit(1);
      }
      
        //add to day if option is Y
        if (option == 'Y'){
          day += 2;
      }
    
      //put a line across
        System.out.println("--------------------------------------");
        
        
        
                
      //set 3
        System.out.print(" \n Is your birthday in Set3? \n ");
        System.out.print(set3);
        System.out.print(" \n Enter Y for yes and N for no: ");
        answer = input.next().toUpperCase(); //change user input to capital  letters
      
        //get the character from the string
        option = answer.charAt(0);
       
       //guard against wrong input
        if (option != 'Y' && option != 'N'){
        System.out.print(" Your input is wrong, input is only in Y for yes and N for no\n");
        System.exit(1);
        }
        
       //add to day if option is Y
        if (option == 'Y'){
          day += 4;
        }
        
         //put a line across
        System.out.println("--------------------------------------");
        
        
      //set 4
        System.out.print("\n Is your birthday in Set4? \n ");
        System.out.print(set4);
        System.out.print(" \n Enter Y for yes and N for no: ");
        answer = input.next().toUpperCase(); //change user input to capital  letters
      
        //get the character from the string
        option = answer.charAt(0);
        
       //guard against wrong input
         if (option != 'Y' && option != 'N'){
        System.out.print(" Your input is wrong, input is only in Y for yes and N for no\n");
        System.exit(1);
        }
         
       //add to day if option is Y
        if (option == 'Y'){
          day += 8;
       }
       
          //put a line across
        System.out.println("--------------------------------------");
        
        
      
      //set 5
        System.out.print("\n Is your birthday in Set5? \n ");
        System.out.print(set5);
        System.out.print(" \n Enter Y for yes and N for no: ");
        answer = input.next().toUpperCase(); //change user input to capital  letters
      
        //get the character from the string
        option = answer.charAt(0);
         //guard against wrong input
         if (option != 'Y' && option != 'N'){
        System.out.print(" Your input is wrong, input is only in Y for yes and N for no\n");
        System.exit(1); 
         }

        //guard against wrong input
         if (option != 'Y' && option != 'N'){
        System.out.print(" Your input is wrong, input is only in Y for yes and N for no\n");
        System.exit(1);
        }
         
       //add to day if option is Y
        if (option == 'Y'){
          day += 16;
        }
      
         //put a line across
        System.out.println("--------------------------------------");
        
      //display results
        System.out.printf("\n your birthday is %d! %n" , day );
        
        //close input
        input.close();
    }
    
}

/*This program generates a plate number that consists of three uppercase letters
followed by four digits*/
package MathematicalFunctionscharactersandStrings$chapter4;
public class VehiclePlateNumber {
    public static void main(String[] arg){
        // generate three uppercase letters
         char letter1 = (char) ('A' + Math.random() * 26);
         char letter2 = (char) ('A' + Math.random() * 26);
         char letter3 = (char) ('A' + Math.random() * 26);
         
         
         //generate four digit numbers
         int numbers = (int)(Math.random() * 9000) + 1000;
         
         System.out.print(" The random plate number is " + letter1 + letter2 + letter3 + numbers + "\n");
    }
    
}

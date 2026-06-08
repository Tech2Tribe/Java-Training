/*This program generates an integer between 1 and 12 and displays the english name in  month name*/
package Selection$chapter3;
public class randomMonth {
    public static void main (String[] args){
        // generate a random number between 1 and 12, i'll try generating using 
        // (Math.random() * (max - min)) + min
        int randomNumber = (int)(Math.random() * 11) + 1;
        
        switch (randomNumber){
            case 1: System.out.println(" The random number is 1, the month is January"); break;
            case 2: System.out.println(" The random number is 2, the month is Februrary"); break;
            case 3: System.out.println(" The random number is 3, the month is March"); break;
            case 4: System.out.println(" The random number is 4, the month is April"); break;
            case 5: System.out.println(" The random number is 5, the month is May"); break;
            case 6: System.out.println(" The random number is 6, the month is June"); break;
            case 7: System.out.println(" The random number is 7, the month is July"); break;
            case 8: System.out.println(" The random number is 8, the month is August"); break;
            case 9: System.out.println(" The random number is 9, the month is September"); break;
            case 10: System.out.println(" The random number is 10, the month is October"); break;
            case 11: System.out.println(" The random number is 11, the month is November"); break;
            case 12: System.out.println(" The random number is 12, the month is December"); break;
            
        }
        
            
    }
    
}

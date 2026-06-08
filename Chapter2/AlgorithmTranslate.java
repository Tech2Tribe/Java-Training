/* This code is for translating algorithm into java codes*/
package ElementaryProgramming$chapter2;

/**
 *
 * @author USER
 */
public class AlgorithmTranslate {
    public static void main (String[] args){
        //declare a double named miles with initial value 100
        double miles = 100; 
        
        //declare a double constant named KILOMETERS_PER_MILE with value 1.609
        final double KILOMETERS_PER_MILE = 1609;
        
        //declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.
        double kilometers = miles * KILOMETERS_PER_MILE;
        
        //Display kilometers to the console
        System.out.println(" The kilometer is " + kilometers);
    }
}

/*i'm writinng this code to focus mainly on how to solve sqrt problems and this would helpme draft the right method in writing factorization method as a code*/
package ElementaryProgramming$chapter2;

/**
 *
 * @author USER
 */
public class WritingArithmeticExpression3 {
    public static void main (String[] args){
        int a = 2, b = 3, c = 1;
        
        double answer = (- b + Math.sqrt( Math.pow(b, 2) - 4 * a *c)) / (2 * a) ;
        
        System.out.println(" The answer is " + answer);
    } 
    
}

/*This program uses the cramer's rule to solve for the value of x and y*/
package IntroductionToJava$chapter1;
public class cramerRule {
    public static void main(String[] args){
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = .55;
        double f = 5.9;
        
        // solve for x 
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        
        System.out.println(" The value of x is " + x + " and the value of y is " + y);
        
    }
    
}

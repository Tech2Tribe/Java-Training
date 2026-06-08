/*this programs solves for the area and perimeter of a rectangle with the following*/
package IntroductionToJava$chapter1;

/**
 *
 * @author USER
 */
public class AreaAndPerimeterOfaRectangle {
    public static void main (String[] args){
        double width = 4.5;
        double height = 7.9;
        // solving for area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.println(" The perimeter of the rectangle is " + perimeter);
        System.out.println(" The area of the rectangle is " + area);
    }
    
}

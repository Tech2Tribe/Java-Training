/* this code finds the area and the perimeter of a circle that has a radius of 5.5*/
package IntroductionToJava$chapter1;

/**
 *
 * @author USER
 */
public class AreaAndPerimeterOfACircle {
    public static void main (String[] args){
        double radius = 5.5;
        
        //solving for perimeter and and radius. ( i used Math.pi to get the accurate number java uses for Pi
        
        double perimeter =  2 * radius *  Math.PI;
        double area = radius * radius * Math.PI;
        
        System.out.println(" The perimeter of the circle is " +  perimeter);
        System.out.println(" The area of the circle is "+  area);
    }
    
}

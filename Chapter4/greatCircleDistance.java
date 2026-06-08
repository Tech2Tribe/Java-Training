/* this code is to help calculate the great circle distance which is the distance between two points on the surface of a sphere*/
package MathematicalFunctionscharactersandStrings$chapter4;
import java.util.Scanner;
public class greatCircleDistance {
    public static void main (String[] args){
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //prompt users to enter the longitude and latitude in degrees for point 1 and point 2
        System.out.print(" Enter point 1 (latitude and longitude) in degrees: ");
        String latitude1 = input.next();
        String longitude1 = input.next();
        
        System.out.print(" Enter point 2 (latitude and longitude) in degrees: ");
        String latitude2 = input.next();
        String longitude2 = input.next();
        
        final double radius = 6371.01;
        
       //convert latitude and longitude in degrees to radians
       double x1 = Math.toRadians(Double.parseDouble(latitude1.replace(",", "").trim()));
       double y1 = Math.toRadians(Double.parseDouble(longitude1.replace(",", "").trim()));
       double x2 = Math.toRadians(Double.parseDouble(latitude2.replace(",", "").trim()));
       double y2 = Math.toRadians(Double.parseDouble(longitude2.replace(",", "").trim()));
       
       /* i used Double.parseDouble to convert the string into a double value for calculations and .replace("," "") is to replace the comma with an empty string
       so the comma wont be read and .trim() to help remove the spaces.
       */
       
        
        //calculate the distance
        double distance = radius * Math.acos(((Math.sin(x1) * Math.sin(x2)) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 -y2)));
        
        //display results using printed format
        System.out.printf("""
                           The distance between the two points is %5.11fkm
                          """, distance);

       
    
}
}

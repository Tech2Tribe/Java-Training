/*This program calculates the area of an n-sided polygon of same length, and all angles have the same degree*/
package MathematicalFunctionscharactersandStrings$chapter4;

import java.util.Scanner;

public class areaOfaRegularPolygon {

    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //prompt users to enter the numbers of sides
        System.out.print(" Enter the number of sides: ");
        String numberOfSides = input.next();

        //prompt users to enter the side
        System.out.print(" Enter the side: ");
        String sides = input.next();

        //converting Strings to double
        int n = Integer.parseInt(numberOfSides);
        double s = Double.parseDouble(sides);

        //calculating the area of the polygon
        double area = (n * (Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / n))));

        System.out.printf(" The area of the polygon is %.10f %n ", area);
    }

}

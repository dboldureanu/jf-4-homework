package md.tekwill.jf4.homework;

import java.util.Scanner;

public class Exercise7 {

    /*
     * Write a Java program to print the area and perimeter of a circle. Go to the editor
     * Test Data:
     * Radius = 7.5
     * Expected Output
     * Perimeter is = 47.12388980384689
     * Area is = 176.71458676442586
     */

    public static void main(String[] args) {

        double area,perimeter,radius;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");

        radius = in.nextDouble();

        System.out.println("Perimeter of the circle is " +perCalc(radius) +"\n"+
                            "Area of the circle is "+areaCalc(radius));
    }

    public static double perCalc(double r){
        return 2*Math.PI*r;
    }

    public static double areaCalc(double r){
        return Math.PI*Math.pow(r,2);
    }

}

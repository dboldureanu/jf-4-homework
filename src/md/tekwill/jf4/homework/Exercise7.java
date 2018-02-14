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
        Scanner sc = new Scanner(System.in);
        double radius, perimeter, area;

        System.out.println("Please enter the radius of the circle: ");
        radius = sc.nextDouble();

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);

        System.out.println("Perimeter is = " + perimeter+ "\n" +
                "Area is = " + area);

    }
}

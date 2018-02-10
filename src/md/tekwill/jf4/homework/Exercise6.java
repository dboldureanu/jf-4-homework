package md.tekwill.jf4.homework;

import java.util.Scanner;

public class Exercise6 {

    /*
     * Write a Java program to compute the specified expressions and print the output. Go to the editor
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output
     * 2.138888888888889
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter variables for calculation of this expression ((x * y - z * q) / (r - n))\n" +
                "x,y,z,q,r,n:");

        double x  = sc.nextDouble();
        double y  = sc.nextDouble();
        double z  = sc.nextDouble();
        double q  = sc.nextDouble();
        double r  = sc.nextDouble();
        double n  = sc.nextDouble();

        double rez = ((x * y - z * q) / (r - n));
        System.out.println("The result of is equal to " + rez);
    }
}

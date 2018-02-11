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
        double x,y,z,a,b,c;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers to compute following expression ((x*y-z*a)/(b-c))\n");
        System.out.println("x: ");x = in.nextDouble();
        System.out.println("y: ");y = in.nextDouble();
        System.out.println("z: ");z = in.nextDouble();
        System.out.println("a: ");a = in.nextDouble();
        System.out.println("b: ");b = in.nextDouble();
        System.out.println("c: ");c = in.nextDouble();

        System.out.println("The result of the expression is "+ calcExpr(x,y,z,a,b,c));
    }

    public static double calcExpr(double x,double y, double z, double a, double b, double c){
       return (x*y-z*a)/(b-c);
    }
}


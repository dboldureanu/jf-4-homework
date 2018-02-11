package md.tekwill.jf4.homework;

import java.util.Scanner;

public class Exercise3 {

    /*
    * Write a Java program to divide two numbers and print on the screen. Go to the editor
    * Test Data :
    * 50/3
    * Expected Output :
    * 16
    */

    public static void main(String[] args) {
        int dividend,divisor;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the dividend");
        dividend = in.nextInt();

        System.out.println("Enter the divisor");
        divisor = in.nextInt();

        System.out.println("Division of two numbers is "+div(dividend,divisor));
    }

    public static int div(int a, int b){
        return a/b;
    }
}

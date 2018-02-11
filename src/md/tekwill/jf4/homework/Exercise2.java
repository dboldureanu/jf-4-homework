package md.tekwill.jf4.homework;

import java.util.Scanner;


public class Exercise2 {

    /*
    * Write a Java program to print the sum of two numbers. Go to the editor
    * Test Data:
    * 74 + 36
    * Expected Output :
    * 110
    */

    public static void main(String[] args) {

        int numOne,numTwo;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number of addition");
        numOne = in.nextInt();

        System.out.println("Enter second number of addition");
        numTwo = in.nextInt();

        System.out.println("Addition of two numbers is "+String.format("%.2f",sumNum(numOne,numTwo)));

    }

    public static int sumNum (int a, int b){
        return a+b;
    }
}

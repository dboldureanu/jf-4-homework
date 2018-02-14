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
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number A ");
        int numA = sc.nextInt();

        System.out.println("enter number B ");
        int numB = sc.nextInt();

        int div = numA / numB;
        System.out.println("The result of "+numA+"/"+numB +" is equal to " + div);
    }
}

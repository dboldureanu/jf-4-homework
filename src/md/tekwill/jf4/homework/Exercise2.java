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

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number A ");
        int numA = sc.nextInt();

        System.out.println("enter number B ");
        int numB = sc.nextInt();

        int sum = numA + numB;
        System.out.println("The sum is equal to " + sum);
    }
}

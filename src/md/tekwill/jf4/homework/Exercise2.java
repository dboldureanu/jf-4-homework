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
        Scanner input=new Scanner(System.in);
        int number1, number2;
        int sum;

        System.out.println("Introdu primul numar intreg: ");
        number1 = input.nextInt();
        System.out.println("Introdu al doilea numar intreg: ");
        number2 = input.nextInt();

        sum = number1+number2;

        System.out.println("Suma a doua numere este: " +sum);
    }
}

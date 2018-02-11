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

        Scanner input=new Scanner(System.in);
        int number1, number2;
        int intValue;

        System.out.println("Introdu primul numar intreg: ");
        number1 = input.nextInt();
        System.out.println("Introdu al doilea numar intreg: ");
        number2 = input.nextInt();

        intValue = number1/number2;

        System.out.println("Suma a doua numere este: " +intValue);

    }
}

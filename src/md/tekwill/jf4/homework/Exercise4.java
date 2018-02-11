package md.tekwill.jf4.homework;

import java.util.Scanner;

public class Exercise4 {

    /*
     * Write a Java program to print the result of the following operations. Go to the editor
     * Test Data:
     * a. -5 + 8 * 6
     * b. (55+9) % 9
     * c. 20 + -3*5 / 8
     * d. 5 + 15 / 3 * 2 - 8 % 3
     * Expected Output :
     * 43
     * 1
     * 19
     * 13
     */

    public static void main(String[] args) {

        int a1,a2,a3,b1,b2,b3,c1,c2,c3,c4,d1,d2,d3,d4,d5,d6;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers to compute following expression a1 + a2 * a3 \n");
        System.out.println("a1: ");a1 = in.nextInt();
        System.out.println("a2: ");a2 = in.nextInt();
        System.out.println("a3: ");a3 = in.nextInt();

        System.out.println("Enter numbers to compute following expression (b1 + b2) % b3 \n");
        System.out.println("b1: ");b1 = in.nextInt();
        System.out.println("b2: ");b2 = in.nextInt();
        System.out.println("b3: ");b3 = in.nextInt();

        System.out.println("Enter numbers to compute following expression c1 + c2 * c3 / c4 \n");
        System.out.println("c1: ");c1 = in.nextInt();
        System.out.println("c2: ");c2 = in.nextInt();
        System.out.println("c3: ");c3 = in.nextInt();
        System.out.println("c4: ");c4 = in.nextInt();

        System.out.println("Enter numbers to compute following expression d1 + d2 / d3 * d4 - d5 % d6 \n");
        System.out.println("d1: ");d1 = in.nextInt();
        System.out.println("d2: ");d2 = in.nextInt();
        System.out.println("d3: ");d3 = in.nextInt();
        System.out.println("d4: ");d4 = in.nextInt();
        System.out.println("d5: ");d5 = in.nextInt();
        System.out.println("d6: ");d6 = in.nextInt();

        System.out.println("a1 + a2 * a3 = " + calcA(a1,a2,a3)+"\n"+
                        "(b1 + b2) % b3 = " + calcB(b1,b2,b3)+"\n"+
                        "c1 + c2 * c3 / c4 = " + calcC(c1,c2,c3,c4)+"\n"+
                        "d1 + d2 / d3 * d4 - d5 % d6 = " + calcD(d1,d2,d3,d4,d5,d6));

    }

    public static int calcD(int d1, int d2, int d3, int d4, int d5, int d6) {
        return d1 + d2 / d3 * d4 - d5 % d6;
    }

    public static int calcC(int c1, int c2, int c3, int c4) {
        return c1 + c2 * c3 / c4;
    }

    public static int calcB(int b1, int b2, int b3) {
        return (b1 + b2) % b3;
    }

    public static int calcA(int a1, int a2, int a3) {
        return a1 + a2 * a3;
    }
}

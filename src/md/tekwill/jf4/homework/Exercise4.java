package md.tekwill.jf4.homework;

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
        // variables
        int A1 = -5, A2 = 6, A3 = 8;
        int B1 = 55, B2 = 9, B3 = 9;
        int C1 = 20, C2 = -3, C3 = 5, C4 = 8;
        int D1 = 5, D2 = 15, D3 = 3, D4 = 2, D5 = 8, D6 = 3;
        //operations
        int sumA = A1 + A2 * A3;
        int sumB = (B1 + B2) % B3;
        int sumC = C1 + (C2 * C3) / C4;
        int sumD = D1 + D2 / D3 * D4 - D5 % D6;

        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println(sumC);
        System.out.println(sumD);

    }
}

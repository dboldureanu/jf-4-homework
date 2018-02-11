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

        int number1, number2, number3, number4;

        number1 = -5 + 8 * 6;
        number2 = (55 + 9) % 9;
        number3 = 20 + -3*5 / 8;
        number4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Rezultatul operatiilor este:\n" +number1+"\n"+number2+"\n"+number3+"\n"+number4);

    }
}

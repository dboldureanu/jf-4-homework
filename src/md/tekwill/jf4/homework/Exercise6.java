package md.tekwill.jf4.homework;

public class Exercise6 {

    /*
     * Write a Java program to compute the specified expressions and print the output. Go to the editor
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output
     * 2.138888888888889
     */

    public static void main(String[] args) {

        double q = 25.5, w = 3.5, e = 3.5, r = 3.5, t = 40.5, y = 4.5;
        double sum = ((q * w - e * r )/( t - y));

        System.out.println(sum);
    }
}

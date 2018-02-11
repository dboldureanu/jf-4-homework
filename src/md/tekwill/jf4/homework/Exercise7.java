package md.tekwill.jf4.homework;

public class Exercise7 {

    /*
     * Write a Java program to print the area and perimeter of a circle. Go to the editor
     * Test Data:
     * Radius = 7.5
     * Expected Output
     * Perimeter is = 47.12388980384689
     * Area is = 176.71458676442586
     */

    public static void main(String[] args) {
        double R = 7.5;
        double P = R * 2 * Math. PI;
        double Ar = (R * R) * Math. PI ;

        System.out.println(P);
        System.out.println(Ar);
    }
}

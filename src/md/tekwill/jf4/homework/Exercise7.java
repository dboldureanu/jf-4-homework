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




        private static final double radius = 7.5;

        public static void main(String[] args) {

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);

        }
    }









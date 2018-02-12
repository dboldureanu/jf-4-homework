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
        if (args.length == 0)
        {
            System.out.println("Looks like you forgot to pass an argument");
            return;
        }

        try	
        {
            double r = Double.parseDouble(args[0]);
            double pi = Math.PI;
            double area = pi * Math.pow(r,2);
            System.out.println("Radius: " + r + System.lineSeparator() + "Area: " + area);
        }
        catch (Exception e)
        {
            System.out.println("Humans make so many mistakes... I'm expecting an argument and it should be a number");
        }

        System.out.println("");
    }
}

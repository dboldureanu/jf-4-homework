package md.tekwill.jf4.homework;

public class Exercise2 {

    /*
    * Write a Java program to print the sum of two numbers. Go to the editor
    * Test Data:
    * 74 + 36
    * Expected Output :
    * 110
    */

    public static void main(String[] args) {

        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a+b);
        }
        catch (Exception e)
        {
            System.out.println("Expected 2 numbers");
            System.exit(0);
        }

    }
}

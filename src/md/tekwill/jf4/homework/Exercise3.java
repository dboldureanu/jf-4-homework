package md.tekwill.jf4.homework;

public class Exercise3 {

    /*
    * Write a Java program to divide two numbers and print on the screen. Go to the editor
    * Test Data :
    * 50/3
    * Expected Output :
    * 16
    */

    public static void main(String[] args) {

        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (b == 0)
            {
                System.out.println("Cannot divide by 0");
                System.exit(0);
            }

            System.out.println(a/b);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Expecting 2 numbers");
        }
        catch (NumberFormatException e)
        {
            System.out.println("One or both of the inputs is not a number");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

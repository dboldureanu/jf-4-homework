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
        System.out.println("Hello! Please select the template for calculation\n" +
                "a. -5 + 8 * 6\n" +
                "b. (55+9) % 9\n" +
                "c. 20 + -3*5 / 8\n" +
                "d. 5 + 15 / 3 * 2 - 8 % 3\n" +
                "Enter the option:");

        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();

        int u, v, q, x, y, z;

        switch (option.toLowerCase()){

            case "a":
                System.out.println("Selected pattern: x + y * z\n" +
                        "Please enter x, y and z:");
                x = scan.nextInt();
                y = scan.nextInt();
                z = scan.nextInt();
                System.out.println("The result of  is equal to " + (x+y*z));
                break;

            case "b":
                System.out.println("Selected pattern: (x + y) % z\n" +
                        "Please enter x, y and z:");
                x = scan.nextInt();
                y = scan.nextInt();
                z = scan.nextInt();
                System.out.println("The result of  is equal to " + ((x+y)%z));
                break;

            case "c":
                System.out.println("Selected pattern: x + y * z / q\n" +
                        "Please enter x, y, z and q:");
                x = scan.nextInt();
                y = scan.nextInt();
                z = scan.nextInt();
                q = scan.nextInt();
                System.out.println("The result of  is equal to " + (x+y*z/q));
                break;

            case "d":
                System.out.println("Selected pattern: x +  y / z * q - v  % u\n" +
                        "Please enter x, y, z, q, v and u:");
                x = scan.nextInt();
                y = scan.nextInt();
                z = scan.nextInt();
                q = scan.nextInt();
                v = scan.nextInt();
                u = scan.nextInt();
                System.out.println("The result of  is equal to " + (x+y/z*q-v%u));
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

        }
    }


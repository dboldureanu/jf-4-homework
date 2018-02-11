package md.tekwill.jf4.homework;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

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
    public static void main(String[] args) throws ScriptException
    {
        if (args.length == 0)
        {
            System.out.println("Looks like you forgot to pass an argument");
            System.exit(0);
        }

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println(engine.eval(args[0]));
    }
}

package md.tekwill.jf4.homework;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Exercise6 {

    /*
     * Write a Java program to compute the specified expressions and print the output. Go to the editor
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output
     * 2.138888888888889
     */

    public static void main(String[] args)
    {
        try
        {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            System.out.println(engine.eval(args[0]));
        }
        catch (ScriptException e)
        {
            System.out.println("Some Script Exception idk");
        }
        catch (Exception e)
        {
            System.out.println("Something went terribly wrong D: Please pass a valid JS statement as an argument!");
        }
    }
}

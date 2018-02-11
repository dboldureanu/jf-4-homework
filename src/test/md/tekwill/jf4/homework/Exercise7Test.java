package md.tekwill.jf4.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise7Test {

    @Test
    public void perCalc() {
        Exercise7 Ex = new Exercise7();
        Assert.assertEquals(47.12388980384689,Ex.perCalc(7.5),0.0);
    }

    @Test
    public void areaCalc() {
        Exercise7 Ex = new Exercise7();
        Assert.assertEquals(176.71458676442586,Ex.areaCalc(7.5),0.0);
    }
}
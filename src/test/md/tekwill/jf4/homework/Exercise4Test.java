package md.tekwill.jf4.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise4Test {

    @Test
    public void calcD() {
        Exercise4 Ex = new Exercise4();
        Assert.assertEquals(13,Ex.calcD(5,15,3,2,8,3),0.0);
    }

    @Test
    public void calcC() {
        Exercise4 Ex = new Exercise4();
        Assert.assertEquals(19,Ex.calcC(20,-3,5,8),0.0);
    }

    @Test
    public void calcB() {
        Exercise4 Ex = new Exercise4();
        Assert.assertEquals(1,Ex.calcB(55,9,9),0.0);
    }

    @Test
    public void calcA() {
        Exercise4 Ex = new Exercise4();
        Assert.assertEquals(43,Ex.calcA(-5,8,6),0.0);
    }
}
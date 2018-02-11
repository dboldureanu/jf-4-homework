package md.tekwill.jf4.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise6Test {

    @Test
    public void calcExpr() {
        Exercise6 Ex = new Exercise6();
        Assert.assertEquals(2.138888888888889,Ex.calcExpr(25.5,3.5,3.5,3.5,40.5,4.5),0.0);
    }
}
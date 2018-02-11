package md.tekwill.jf4.homework;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Exercise3Test {

    @Test
    public void div() {
        Exercise3 Ex = new Exercise3();
        Assert.assertEquals(16,Ex.div(50,3),0.0);
    }
}
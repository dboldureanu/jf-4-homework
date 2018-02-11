package md.tekwill.jf4.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise2Test {

    @Test
    public void sum() {
        Exercise2 Ex = new Exercise2();
        Assert.assertEquals(110,Ex.sumNum(74,36));
    }
}
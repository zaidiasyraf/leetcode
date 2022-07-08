package easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void example1() {
        Assert.assertEquals(3,RomanToInteger.romanToInt("III"));
    }

    @Test
    public void example2() {
        Assert.assertEquals(58,RomanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void example3() {
        Assert.assertEquals(1994,RomanToInteger.romanToInt("MCMXCIV"));
    }

}

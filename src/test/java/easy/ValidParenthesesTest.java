package easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void example1() {
        Assert.assertTrue(ValidParantheses.isValid("()"));
    }

    @Test
    public void example2() {
        Assert.assertTrue(ValidParantheses.isValid("()[]{}"));
    }

    @Test
    public void example3() {
        Assert.assertFalse(ValidParantheses.isValid("(]"));
    }

    @Test
    public void fail1() {
        Assert.assertFalse(ValidParantheses.isValid("([)]"));
    }

    @Test
    public void fail2() {
        Assert.assertTrue(ValidParantheses.isValid("{[]}"));
    }
}

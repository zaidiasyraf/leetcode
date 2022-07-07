package easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void example1() {
        Assert.assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    public void example2() {
        Assert.assertFalse(PalindromeNumber.isPalindrome(-121));
    }


    @Test
    public void example3() {
        Assert.assertFalse(PalindromeNumber.isPalindrome(10));
    }


}

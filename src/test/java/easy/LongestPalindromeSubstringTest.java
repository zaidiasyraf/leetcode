package easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeSubstringTest {

    @Test
    public void example1() {
        Assert.assertEquals("aba", LongestPalindromeSubstring.longestPalindrome("babad"));
    }

    @Test
    public void example2() {
        Assert.assertEquals("bb", LongestPalindromeSubstring.longestPalindrome("cbbd"));
    }

    @Test
    public void example3() {
        Assert.assertEquals("ccc", LongestPalindromeSubstring.longestPalindrome("ccc"));
    }

    @Test
    public void example4() {
        Assert.assertEquals("bb", LongestPalindromeSubstring.longestPalindrome("bb"));
    }

}

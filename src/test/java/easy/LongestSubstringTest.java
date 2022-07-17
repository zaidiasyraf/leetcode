package easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {

    @Test
    public void example1() {
        Assert.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void example2() {
        Assert.assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void example3() {
        Assert.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void fail1() {
        Assert.assertEquals(2, LongestSubstring.lengthOfLongestSubstring("aab"));
    }

    @Test
    public void fail2() {
        Assert.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void fail3() {
        Assert.assertEquals(5, LongestSubstring.lengthOfLongestSubstring("anviaj"));
    }

    @Test
    public void fail4() {
        Assert.assertEquals(7, LongestSubstring.lengthOfLongestSubstring("busvutpwmu"));
    }

}

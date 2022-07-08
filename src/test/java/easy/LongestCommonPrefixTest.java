package easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void example1() {
        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void example2() {
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void fail1() {
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }

    @Test
    public void fail2() {
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    public void fail3() {
        Assert.assertEquals("c", LongestCommonPrefix.longestCommonPrefix(new String[]{"cir","car"}));
    }

    @Test
    public void fail4() {
        Assert.assertEquals("flower", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
    }

}

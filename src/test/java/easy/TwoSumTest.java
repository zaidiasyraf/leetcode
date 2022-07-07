package easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void example1() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void example2() {
        Assert.assertArrayEquals(new int[]{1,2}, TwoSum.twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    public void example3() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3,3}, 6));
    }

    @Test
    public void fail1() {
        Assert.assertArrayEquals(new int[]{0, 2}, TwoSum.twoSum(new int[]{3,2,3}, 6));
    }

}

package easy;

import org.junit.Assert;
import org.junit.Test;

public class MedianTwoArrayTest {

    @Test
    public void example1() {
        Assert.assertEquals(2.00000,MedianTwoArray.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0);
    }

    @Test
    public void example2() {
        Assert.assertEquals(2.50000,MedianTwoArray.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}), 0);
    }

}

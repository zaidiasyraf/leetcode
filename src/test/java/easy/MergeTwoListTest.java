package easy;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoListTest {

    @Test
    public void example1() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = MergeTwoList.mergeTwoLists(list1, list2);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(1, result.next.val);
        Assert.assertEquals(2, result.next.next.val);
        Assert.assertEquals(3, result.next.next.next.val);
        Assert.assertEquals(4, result.next.next.next.next.val);
        Assert.assertEquals(4, result.next.next.next.next.next.val);
    }

    @Test
    public void example2() {
        ListNode result = MergeTwoList.mergeTwoLists(null, null);
        Assert.assertNull(result);
    }

    @Test
    public void example3() {

        ListNode list2 = new ListNode(0);
        ListNode result = MergeTwoList.mergeTwoLists(null, list2);
        Assert.assertEquals(0, result.val);
        Assert.assertNull(result.next);
    }

}

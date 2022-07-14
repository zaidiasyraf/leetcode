package easy;

import java.math.BigInteger;

public class AddTwoNumber {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger ip1 = BigInteger.ZERO;
        BigInteger ip2 = BigInteger.ZERO;

        if (l1 != null) {
            StringBuilder i1 = new StringBuilder();
            i1.append(l1.val);
            ListNode p1 = l1;
            while (p1.next != null) {
                p1 = p1.next;
                i1.append(p1.val);
            }
            i1.reverse();
            ip1 = new BigInteger(i1.toString());
        }

        if (l2 != null) {
            StringBuilder i2 = new StringBuilder();
            i2.append(l2.val);
            ListNode p2 = l2;
            while (p2.next != null) {
                p2 = p2.next;
                i2.append(p2.val);
            }
            i2.reverse();
            ip2 = new BigInteger(i2.toString());
        }

        BigInteger ipTotal = ip1.add(ip2);
        if (ipTotal.compareTo(BigInteger.ONE) < 1) {
            return new ListNode(0);
        }
        StringBuilder totalInverse = new StringBuilder();
        totalInverse.append(ipTotal.toString());
        totalInverse.reverse();
        ListNode head = new ListNode();
        ListNode curr = null;
        char[] chars = totalInverse.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                head.val = Character.getNumericValue(chars[i]);
                curr = head;
            }else {
                curr.next = new ListNode(Character.getNumericValue(chars[i]));
                curr = curr.next;
            }

        }
        return head;
    }

}

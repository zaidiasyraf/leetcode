package easy;

public class AddTwoNumber {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode head = new ListNode();
        int total = l1.val + l2.val;
        head.val = total % 10;
        carry = total / 10;

        l1 = l1.next;
        l2 = l2.next;

        ListNode curr = head;
        while (l1 != null && l2 != null) {
            total = l1.val + l2.val + carry;
            curr.next = new ListNode(total % 10);
            carry = total / 10;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            total = l1.val + carry;
            curr.next = new ListNode(total % 10);
            carry = total / 10;
            curr = curr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            total = l2.val + carry;
            curr.next = new ListNode(total % 10);
            carry = total / 10;
            curr = curr.next;
            l2 = l2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return head;
    }
}

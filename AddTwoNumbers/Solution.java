class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int offset = 0;
        int res;
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            res = x + y + offset;
            current.next = new ListNode(res % 10);
            current = current.next;
            offset = res / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (offset > 0) {
            current.next = new ListNode(offset);
        }
        return dummy.next;
    }
}
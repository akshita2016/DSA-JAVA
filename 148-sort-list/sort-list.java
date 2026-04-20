class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode mid = findMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1), temp = dummy;

        while (a != null && b != null) {
            if (a.val < b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        temp.next = (a != null) ? a : b;
        return dummy.next;
    }
}
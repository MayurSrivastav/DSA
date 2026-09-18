class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int c = 0;

        ListNode temp = head;
        ListNode find = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }
        if (n == c) {
            return head.next;
        }

        int t = c - n - 1;

        for (int i = 0; i < t; i++) {
            find = find.next;
        }
        find.next = find.next.next;

        return head;
    }
}
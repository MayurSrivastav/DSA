class Solution {
    int i = 0;
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        i = c / k;
        return reverse(head, curr, prev, next, i, k);
    }

    public ListNode reverse(ListNode head, ListNode curr, ListNode prev, ListNode next,int i, int k) {

        if (i == 0) {
            return curr;
        }
        for (int j = 0; j < k; j++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverse(curr, curr, null, null, i - 1, k);
        return prev;
    }
}
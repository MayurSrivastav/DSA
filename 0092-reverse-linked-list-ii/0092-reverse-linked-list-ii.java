/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        int c = 0;

        ListNode prev = null;
        ListNode l = null;
        ListNode r = null;

        while (temp != null) {

            if (c == left - 1)
                prev = temp;

            if (c == left)
                l = temp;

            if (c == right)
                r = temp;

            temp = temp.next;
            c++;
        }

        ListNode afterRight = r.next;

        ListNode curr = l;
        ListNode next = null;
        ListNode pre = afterRight;

        while (curr != afterRight) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        prev.next = pre;

        return dummy.next;
    }
}
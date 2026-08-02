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

        int c = 1;
        ListNode temp = head;

        ListNode prev = null;
        ListNode l = null;
        ListNode r = null;

        while (temp != null) {

            if (c == left - 1)
                prev = temp;

            if (c == left)
                l = temp;

            if (c == right) {
                r = temp;
                break;
            }

            temp = temp.next;
            c++;
        }

        ListNode after = r.next;

        ListNode curr = l;
        ListNode next = null;
        ListNode pre = after;

        while (curr != after) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        if (prev != null)
            prev.next = pre;
        else
            head = pre;

        return head;
    }
}
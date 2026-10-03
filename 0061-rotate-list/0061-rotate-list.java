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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        ListNode curr = head;
        ListNode next = null;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        k=k%c;
        if(k == 0) {
            return head;
        }
        int n = c-k;
        for(int i=1;i<n;i++){
            curr = curr.next;
        }
        next = curr.next;
        curr.next = null;
        temp.next = head;
        return next;
    }
}
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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head; 
        if(head == null || head.next == null){
            return head;
        }
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode s = small;
        ListNode l = large;
        while(temp != null){
            if(temp.val<x){
                small.next=temp;
                small=small.next;
            }
            else{large.next=temp;
            large=large.next;}
            temp=temp.next;
        }
        small.next=l.next;
        large.next=null;
        return s.next;
    }
}
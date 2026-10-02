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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int num =0;
        ListNode head=null;
        ListNode tail = null;
        while(l1!=null && l2!=null){
            int L1 = l1.val;
            int L2 = l2.val;
            num = L1+L2+carry;
            carry = num/10;
            num = num%10;
            ListNode node = new ListNode(num);
            if(head==null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int L1 = l1.val;
            num = L1+carry;
            carry = num/10;
            num = num%10;
            ListNode node = new ListNode(num);
            if(head==null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            l1 = l1.next;
        }
        while(l2!=null){
            int L2 = l2.val;
            num = L2+carry;
            carry = num/10;
            num = num%10;
            ListNode node = new ListNode(num);
            if(head==null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            l2 = l2.next;
        }
        if(carry!=0){
            ListNode node = new ListNode(carry);
            if(head==null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }
}
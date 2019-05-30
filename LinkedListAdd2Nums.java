/**
 * Leetcode problem: #2
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * failed without solutions
 * 
 * 5/13/2019
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int x = (l1 == null) ? 0: l1.val;
            int y = (l2 == null) ? 0: l2.val;
            int sum = x + y + carry;
            if(sum < 10){
                l3.next = new ListNode(sum);
            }else{
                l3.next = new ListNode(sum%10);
            }
            carry = sum/10;
            l3 = l3.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(carry == 1){
            l3.next = new ListNode(1);
        }
        return head.next;
    }
    public class ListNode {
        int val;
     ListNode next;
      ListNode(int x) { val = x; }
     }
}



/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;


        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        if(head.val == val)     head = head.next;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);

        removeElements(head, 1);
        while(head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
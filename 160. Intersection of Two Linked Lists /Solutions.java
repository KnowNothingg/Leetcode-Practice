public class Solutions {
    
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return helper(headA, headB, headA, headB);
        
    }

    public static ListNode helper(ListNode headA, ListNode headB, ListNode currentA, ListNode currentB){
        if(currentA == null || currentB == null){
            return null;
        }else if(currentA == currentB){
            return currentA;
        }else if(currentA.next == null){
            return helper(headA, headB, headB, currentB.next);
        }else if(currentB.next == null){
            return helper(headA, headB, currentA.next, headA);
        }else{
            return helper(headA, headB, currentA.next, currentB.next);
        }
    }

    public class ListNode {
        int val;
        ListNode next;
    
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}


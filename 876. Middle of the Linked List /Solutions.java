import java.util.HashMap;

public class Solutions{
    public static void main(String[] args) {
        
    }

    public ListNode middleNode(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        int index = 0;
        while(head != null){
            map.put(index, head);
            index++;
            head = head.next;
        }

        return map.get(index/2);

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
      }
}
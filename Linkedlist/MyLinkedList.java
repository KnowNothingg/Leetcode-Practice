/*
    June 21 Friday
    LinkedList Tag
    Create LinkedList
*/

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


class MyLinkedList {

    private class Node{
        int val;
        Node next;

        private Node(int x){
            val = x;
            next = null;
        }
    }

    Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int count = 0;
        Node current = head;
        while(current != null){
            if(count == index){
                return current.val;
            }
            current = current.next;
            count++;
        }

        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        if(head == null){
            head = newHead;
        }else{
            newHead.next = head;
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node tail = new Node(val);
        Node current = head;
        if(head == null){
            head = tail;
        }else{
            while(current.next != null){
                current = current.next;
            }
            current.next = tail;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        int count = 0;
        Node current = head;
        if(index == 0){
            addAtHead(val);
        }else{
            while(current.next != null){
                if(count == index){
                    newNode.next = current.next;
                    current.next = newNode;
                }
                current = current.next;
                count++;
            }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int count = 0;
        Node current = head;
        if(head.next == null){
            head = null;
        }else {
            while(current.next != null){
                if(count == index - 1){
                    current.next = current.next.next;
                }
                current = current.next;
                count++;
            }
        }
        
    }

    public static void main(String[] args){
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        int param_1 = obj.get(0);
        System.out.println(param_1);
        obj.addAtTail(3);        
        obj.addAtIndex(1,5);
        obj.deleteAtIndex(2);
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));

    }
}




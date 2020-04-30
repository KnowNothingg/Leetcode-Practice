import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        if(minStack.empty()){
            minStack.push(x);
        }else if(x <= minStack.peek()){
                minStack.push(x);
        }
        
            stack.push(x);
    }
    
    public void pop() {
        try{
            if(stack.peek() == minStack.peek()){
                minStack.pop();
            }
            stack.pop();
        }catch(Exception e){
            System.out.println("Empty stack");
        }
       
    }
    
    public int top() {
        if(stack.empty())    return 0;
        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.empty())    return 0;
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());


    }
}





/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

     // public class Node{
    //     int val;
    //     int min;
    //     Node next;
    
    //     Node(int x){
    //         this.val = x;
    //         this.min = Integer.MIN_VALUE;
    //         this.next = null;
    //     }
    // }
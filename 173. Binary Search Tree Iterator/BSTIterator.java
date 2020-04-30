import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 * 
 * Use Stack to store all node from the left When calling next, pop the first
 * Node: current from the stack process its right child as new root.
 * 
 * 
 */
public class BSTIterator {
    
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode current = stack.pop();
        pushAll(current.right);
        return current.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }
        return true;
    }

    public void pushAll(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(final int x) { val = x; }
    }
    
}



/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
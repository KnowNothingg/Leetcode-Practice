import java.util.ArrayList;

/*
1022. Sum of Root To Leaf Binary Numbers

Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.

For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.

Return the sum of these numbers.

Input: [1,0,1,0,1,0,1]
Output: 22
Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
*/

class sumRootToLeaf{
    public static int ans = 0;
    public static int sumRootToLeaf(TreeNode root) {
        if(root == null)    return 0;
        RootToLeafHelper(root, "");
        return ans;
    }

    public static void RootToLeafHelper(TreeNode current, String s){
        s += Integer.toString(current.val);
        if(current.left == null && current.right == null){
            ans += Integer.parseInt(s, 2);
        }

        RootToLeafHelper(current.left, s);
        RootToLeafHelper(current.right, s);

    }

    public static class TreeNode {
       int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(sumRootToLeaf(root));
    }

}
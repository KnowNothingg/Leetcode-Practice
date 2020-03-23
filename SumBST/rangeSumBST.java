/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class rangeSumBST {
    public static int rangeSumBST(TreeNode root, int L, int R) {
        int sum = rangeSumBSThelper(root, L, R, sum);
        return sum;
    }
    
    public static int rangeSumBSThelper(TreeNode root, int L, int R, int sum){
        if(root == null)     return 0;
        if(root.val <= R && root.val >= L)  sum += root.val;
        rangeSumBSThelper(root.left, L, R, sum);
        rangeSumBSThelper(root.right, L, R, sum);
        return sum;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

    }
}
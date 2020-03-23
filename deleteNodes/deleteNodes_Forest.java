/*
Unsloved
1110. Delete Nodes And Return Forest

Given the root of a binary tree, each node in the tree has a distinct value.
After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
Return the roots of the trees in the remaining forest.  You may return the result in any order.

Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]

Contrants:
The number of nodes in the given tree is at most 1000.
Each node has a distinct value between 1 and 1000.
to_delete.length <= 1000
to_delete contains distinct values between 1 and 1000.


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

*/
import java.util.*; 


class deleteNodes_Forest{
    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> forest = new ArrayList<TreeNode>();
        delNodesHelper(root, to_delete, forest);
        return forest;
    }

    public static void delNodesHelper(TreeNode current, int[] to_delete, List<TreeNode> forest){
        if(current.left == null && current.right == null)   return;

        TreeNode left = current.left;
        TreeNode right = current.right;

        for(int i = 0; i < to_delete.length; i++){
            if(left.val == to_delete[i]){
                current.left = null;
                if(left.left != null){
                    forest.add(left.left);
                }
                if(left.right != null){
                    forest.add(left.right);
                }
            }else if(right.val == to_delete[i]){
                current.right = null;
                if(right.left != null){
                    forest.add(right.left);
                }
                if(right.right != null){
                    forest.add(right.right);
                }
            }
        }

        if(left != null)    delNodesHelper(left, to_delete, forest);
        if(right != null)   delNodesHelper(right, to_delete, forest);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int[] to_delete = {3, 5};

        List<TreeNode> answer = delNodes(root, to_delete);

        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i).val);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }
}
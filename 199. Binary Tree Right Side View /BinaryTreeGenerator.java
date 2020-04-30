
public class BinaryTreeGenerator {
    TreeNode root;

    public BinaryTreeGenerator(int[] nums) {
        if (nums.length == 0)
            root = null;
        else
            root = new TreeNode(nums[0]);
    }

    public TreeNode addRecursive(TreeNode current, int val){

        if(current == null){
            return new TreeNode(val);
        }

        if(val < current.val){
            current.left = addRecursive(current.left, val);
        }else if(val > current.val){
            current.right = addRecursive(current.right, val);
        }else{
            return current;
        }

        return current;

        // my thoughts, don't know if it works:
        // if(val < current.val && current.left == null){
        //     TreeNode v = new TreeNode(val);
        //     current.left = v;
        // }else if(val >= current.val && current.right == null){
        //     TreeNode v = new TreeNode(val);
        //     current.right = v;
        // }

        // if(val < current.val && current.left != null){
        //     addRecursive(current.left, val);
        // }else if(val >= current.val && current.right != null){
        //     addRecursive(current.right, val);
        // }
    }

    public class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int n) {
            this.val = n;
            this.left = null;
            this.right = null;
        }
    }
}
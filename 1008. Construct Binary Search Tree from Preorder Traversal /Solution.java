class Solution {


    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
       return Helper(preorder, Integer.MAX_VALUE);
    }

    public TreeNode Helper(int[] nums, int bond){
        if(i >= nums.length || nums[i] > bond)  return null;
        TreeNode root = new TreeNode(nums[i++]);

        root.left = Helper(nums, root.val);
        root.right = Helper(nums, bond);

        return root;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
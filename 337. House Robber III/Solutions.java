public class Solutions{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        System.out.println(rob(root));
    }

    public static int rob(TreeNode root) {
        return robHelper(root);
    }

    public static int robHelper(TreeNode current){
        if(current == null)     return 0;
        int total = current.val;

        if(current.left != null){
             total += robHelper(current.left.left);
             total += robHelper(current.left.right);
        }
        if(current.right != null){
            total += robHelper(current.right.left);
            total += robHelper(current.right.right);
        }

        int noTotal = robHelper(current.left) + robHelper(current.right);
        
        return Math.max(total, noTotal);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


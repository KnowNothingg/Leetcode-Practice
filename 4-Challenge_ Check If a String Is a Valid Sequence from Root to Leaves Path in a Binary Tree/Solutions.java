class Solutions {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Solutions is = new Solutions();

        // is.isValidSequence(root, arr);

    }

    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(root.val != arr[0])  return false;
        return isValidSequenceHelper(root, arr, 0);
    }

    public boolean isValidSequenceHelper(TreeNode curr, int[] arr, int index){

        if(curr.val != arr[index]){
            return false;
        }
        if(index == arr.length - 1){
            return (curr.left == null && curr.right == null);
        }


        // the importance here is the || operation. 
        return (curr.left != null && isValidSequenceHelper(curr.left, arr, index + 1)) || 
                (curr.right != null && isValidSequenceHelper(curr.right, arr, index + 1));

    }
}
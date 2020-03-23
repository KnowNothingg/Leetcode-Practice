
public class CountNode {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		System.out.println(countNodes(root)); 
	}
	
	public static int countNodes(TreeNode root) {
		if(root == null) return 0;
		if(root.left == null && root.right == null)	return 1;
		
		return 1 + countNodes(root.left) + countNodes(root.right);
    }

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}

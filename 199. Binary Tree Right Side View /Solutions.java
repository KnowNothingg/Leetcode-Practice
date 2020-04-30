import java.util.ArrayList;
import java.util.List;



public class Solutions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //   1
        //  2  3
        // 4
        BinaryTreeGenerator tree = new BinaryTreeGenerator(nums);

        System.out.println(rightSideView(tree.root));
    }

    public static List<Integer> rightSideView(BinaryTreeGenerator.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Helper(root, list, 0);
        return list;
    }

    public static void Helper(BinaryTreeGenerator.TreeNode current, List<Integer> arr, int currdepth) {
        if (current == null)
            return;
        if (currdepth == arr.size()) {
            arr.add(current.val);
        }

        Helper(current.right, arr, ++currdepth);
        Helper(current.left, arr, currdepth);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
      
    }

}
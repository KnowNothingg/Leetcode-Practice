
public class Solution {
	

//	Original List                   : 1 2 3 4 5 6 7
//	After reversing all numbers     : 7 6 5 4 3 2 1
//	After reversing first k numbers : 5 6 7 4 3 2 1
//	After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

	public static void main(String[] args) {
		int[] nums1= {1,2,3,4,5,6,7};
		rotate(nums1, 10);
		for(int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
			
		}
	}
	
	public static void rotate(int[] nums, int k) {
		if(nums.length == 1 || nums == null) {
			return;
		}
		if(k > nums.length) {
			k = k % nums.length;
		}	
		
		
		// After reversing all numbers: 
		rotate(nums, 0, nums.length - 1);
		// Reverse the first k value;
		rotate(nums, 0, k - 1);
		
		// reverse the last n - k value
		rotate(nums, k, nums.length - 1);

	}
	
	public static void rotate(int[] nums, int left, int right) {
		for(int i = left, j = right; i < j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}

}

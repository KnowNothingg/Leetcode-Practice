import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int[] nums2 = {3,2,3,1,2,4,5,5,6};
		int[] nums3 = {7, 6, 5, 4, 3, 2, 1};
		System.out.println(findKthLargest(nums, 2));
		System.out.println(findKthLargest(nums2, 4));
		System.out.println(findKthLargest(nums3, 5));
	}
	
	
    public static int findKthLargest(int[] nums, int k) {
        if(k == 1) {
        	return nums[findMax(nums, k)];
        }
        
        nums[findMax(nums, k)] = Integer.MIN_VALUE;
        
        return findKthLargest(nums, --k);
    }
    
    public static int findMax(int[] nums, int k) {
    	int max = Integer.MIN_VALUE;
    	int index = -1;
    	for(int i = 0; i < nums.length; i++) {
    		if(Math.max(nums[i], max) != max) {
    			max = nums[i];
    			index = i;
    		}
    	}
    	return index;
    }
    
    public static int Answer(int[] nums, int k) {
    	Arrays.sort(nums);
    	return nums[nums.length - k];
    }
    
}
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3, 3};
		int target = 6;
		for (int n : twoSumSolution2(nums, target)) {
			System.out.println(n);
		}
//        System.out.println(twoSumSolution2(nums, target));
	}

	// brute force
	public static int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					answer[0] = nums[i];
					answer[1] = nums[j];
					return answer;
				}
			}
		}
		return answer;
	}

	public static int[] twoSumSolution2(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
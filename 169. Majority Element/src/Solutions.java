import java.util.Arrays;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		
		int current = nums[0];
		int count = 0;
		for(int n : nums) {
			if(n == current) {
				count++;
			}else if(count > nums.length / 2){
				return current;
			}else {
				count = 1;
				current = n;
			}
		}
		return current;
    }

}

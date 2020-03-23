
public class BadAttempts{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        rotate(nums1, 3);
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == 0)  return;

        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        
        while(k > 0){
            Helper(nums, temp);
            k--;
        }
    }

    public static void Helper(int[] nums, int temp){
    	for(int i = 1; i < nums.length - 1; i++) {
    		nums[i] = temp;
    		temp = nums[i+1];
    	}
    }
}
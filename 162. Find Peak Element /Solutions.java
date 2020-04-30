public class Solutions {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length == 0 || nums.length == 1 || nums[0] > nums[1])    return 0;
        if(nums[nums.length - 1] > nums[nums.length - 2])   return nums.length -1;

        for(int i = 1; i < nums.length-1; i++){
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1])  return i;
        }

        return -1;

    }
}
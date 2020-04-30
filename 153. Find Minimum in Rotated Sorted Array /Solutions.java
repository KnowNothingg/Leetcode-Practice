public class Solutions {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        for(i = 0; i < nums.length/2; i++, j--){
            if(nums[i+1] < nums[i]){
                return nums[i+1];
            }else if(nums[j-1] > nums[j]){
                return nums[j];
            }
        }
        return nums[0];
    }
}
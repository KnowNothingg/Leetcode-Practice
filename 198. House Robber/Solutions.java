public class Solutions{
    
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(robSolutions(nums));
    }

    public static int rob(int[] nums) {
        return robHelper(nums, 0);
    }

    public static int robHelper(int[] nums, int i){
        if( i >= nums.length)   return 0;
        return Math.max(nums[i] + robHelper(nums, i+2), robHelper(nums, i+1));
    }

    public static int robSolutions(int[] nums){
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for(int i = 1; i < nums.length; i++){
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }

        return memo[nums.length];
    }
}
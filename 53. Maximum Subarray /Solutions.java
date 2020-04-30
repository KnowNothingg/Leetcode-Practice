public class Solutions {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Solutions2(nums));
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length == 1)    return nums[0];
        
        int max = nums[0];  // max So far
        int x = nums[0];    // maxEndingHere

        for(int i = 1; i < nums.length; i++){
            x = Math.max(x+nums[i], nums[i]);   // getting sub max
            max = Math.max(max, x); 
        }

        return max;
    }

    public static int Solutions2(int[] nums){
        int max = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum = sum<0 ? nums[i] : sum + nums[i];
            max = Math.max(sum, max);
        }

        return max;

        // int n = A.length;
        // int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        // dp[0] = A[0];
        // int max = dp[0];
        
        // for(int i = 1; i < n; i++){
        //     dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
        //     max = Math.max(max, dp[i]);
        // }
        
        // return max;
    }
}
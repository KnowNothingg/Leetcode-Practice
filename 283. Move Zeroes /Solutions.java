
class Solutions {
    public static void main(String[] args) {
        int[] nums = {0,1};
        moveZeroes(nums);
        for(int i : nums){
            System.out.println(i + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums.length == 1)    return;
        int nonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        while(nonZero < nums.length){
            nums[nonZero++] = 0;
        }
    }

    public static void Answer2(int[] nums){
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int cur = 0;
    
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
    }
}
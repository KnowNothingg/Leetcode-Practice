import java.util.Arrays;

class Solutions {
    public static void main(String[] args) {
        int[] nums = {1,0,3,4};
        int[] answer = answer2(nums);

        for(int i : answer){
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int all = 1;
        int contains0 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                all *= nums[i];
            }else{
                contains0++;
            }
        }

        int[] output = new int[nums.length];

        if(contains0 > 1){
            Arrays.fill(output, 0);
            return output;
        }

        for(int i = 0; i < nums.length; i++){
            if(contains0 == 1){
                if(nums[i] != 0){
                    output[i] = 0;
                }else{
                    output[i] = all;
                }
            }else{
                output[i] = all / nums[i];
            }
            
        }

        return output;
    }

    public static int[] answer2(int[] nums){
        int n = nums.length;
        int[] left =new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        int rightIndex = n - 2;
        for(int i = 1; i < n; i++){
            left[i] = left[i - 1] * nums[i - 1];
            right[rightIndex] = right[rightIndex + 1] * nums[rightIndex + 1];
            rightIndex--;
        }

        for(int i = 0; i < n; i++){
            left[i] = left[i] * right[i];
        }

        return left;
    }
}
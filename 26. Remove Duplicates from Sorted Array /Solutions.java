
public class Solutions {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)    return 0;
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i;
    }
}
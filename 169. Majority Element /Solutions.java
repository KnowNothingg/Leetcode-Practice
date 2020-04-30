import java.util.*;

public class Solutions{
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(mooreVoting(nums));
    }
    public static int majorityElement(int[] nums) {
        if(nums.length == 0)    return 0;
        if(nums.length == 1)    return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                
                map.put(nums[i], map.get(nums[i]) + 1);
                if(map.get(nums[i]) >= nums.length / 2){
                    return nums[i];
                }
            }else{
                map.put(nums[i], 1);
            }
        }

        return 0;
    }

    public static int mooreVoting(int[] nums){
        int count = 0;
        int current = nums[0];
        for(int n: nums){
            if(n == current){
                count++;
            }else{
                count--;
                if(count == 0){
                    current = n;
                    count++;
                }
            }
        }
        return current;
    }
}
import java.util.HashMap;

public class Solutions {

    public static void main(String[] args) {
        
    }

    // method without using the information of "sorted in ascending order";
    // 2ms
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i);
        }

        int[] answer = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int n = target;
            if(map.containsKey(n - numbers[i])){
                answer[0] = i;
                answer[1] = map.get(n - numbers[i]);
                break;
            }
        }

        return answer;
    }

    // even slower 250ms
    public int[] towSum2(int[] nums, int target){
        int j = nums.length - 1;
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            int n = target - nums[i];
            for(j = nums.length - 1; j >= i; j--){
                if(nums[j] == n){
                    answer[0] = i+1;
                    answer[1] = j+1;
                    break;
                }
            }
        }
        return answer;
    }


    // 0ms
    public static int[] twoSum3(int[] numbers, int target){
        int start = 0, end = numbers.length - 1;
        while(start < end){
            if(numbers[start] + numbers[end] == target) break;
            if(numbers[start] + numbers[end] < target)  start++;
            else end--;
        }
        
        return new int[]{++start, ++end};
    }
}
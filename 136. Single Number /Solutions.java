import java.util.Hashtable;

public class Solutions{
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> set = new Hashtable<Integer, Integer>();
        for(int i = 0;  i < nums.length; i++){
            if(!set.containsKey(nums[i])){
                set.put(nums[i], 1);
            }else{
                set.put(nums[i], set.get(nums[i]) + 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(set.get(nums[i]) == 1){
                return nums[i];
            }
        }

        return -1;
    }

    /*
    If we take XOR of zero and some bit, it will return that bit
    a ^ 0 = a
    If we take XOR of two same bits, it will return 0
    a ^ a = 0

    a ^ a ^ b = (a ^ a) ^ b = 0 ^ b = b

    So we can XOR all bits together to find the unique number.
    */
    public static int xor(int[] nums){
        int a = 0;
            for (int i : nums) {
                a ^= i;
            }
        return a;
    }
}
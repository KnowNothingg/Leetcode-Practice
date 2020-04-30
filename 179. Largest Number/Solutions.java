import java.util.Arrays;
import java.util.Comparator;

public class Solutions {
    public static void main(String[] args) {
        int[] nums = { 10, 2 };
        int[] nums2 = { 3, 30, 34, 5, 9 };
        System.out.println(largestNumber(nums2));
    }

    public static String largestNumber(int[] nums) {
        if(nums.length == 0)    return "";

        String[] s_nums = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            s_nums[i] = String.valueOf(nums[i]);        // Change int value to String value
         }

         // Compare two Strings with different order
         Comparator<String> comp = new Comparator<String>() {
             @Override
             public int compare(String s1, String s2) {
                String a = s1 + s2;
                String b = s2 + s1;
                return b.compareTo(a);
             }
         };

         Arrays.sort(s_nums, comp);

         if(s_nums[0].charAt(0) == '0') return "0";

         String answer = "";
         for(String s: s_nums){
             answer += s;
         }

         return answer;

    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solutions {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        int[] answer = FasterAnswer(nums1, nums2);
        for(int i : answer){
            System.out.print(i);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    answer.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE;
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int[] arr = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            arr[i] = answer.get(i);
        }

        return arr;
    }

    public static int[] FasterAnswer(int[] nums1, int[] nums2){
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                answer.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        int[] arr = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            arr[i] = answer.get(i);
        }
        return arr;
    }
}
import java.util.HashSet;

public class Solutions {
    public static void main(String[] args) {
        System.out.println(isHappy(18));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<>();
        while(true){
            if(nums.contains(n))    return false;
            int answer = 0;
            int current = n;
            while(current != 0){
                answer += (current%10) * (current%10);
                current /= 10;
            }
            if(answer == 1){
                return true;
            }else{
                nums.add(n);
                n = answer;
            }
        }
    }
}
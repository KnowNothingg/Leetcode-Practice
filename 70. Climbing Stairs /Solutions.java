import java.util.Arrays;
// Fibnacci number

class Solutions{
    public static void main(String[] args) {
        System.out.println(climbStarsMemo(4));
    }

    public static int climbStairs(int n) {
        if(n == 0)  return 1;
        if(n < 2)   return climbStairs(n - 1);
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStarsMemo(int n){
        int[] memo = new int[n + 1];
        
        Arrays.fill(memo, -1);

        return climbStarsMemo(n, memo);
    }

    public static int climbStarsMemo(int n, int[] memo){
        if(n == 1)  return 1;
        if(memo[n] != -1){
            return memo[n];
        }
        memo[1] = 1;
        memo[2] = 2;
        for(int i = 3; i <= n ; i++){
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }
}
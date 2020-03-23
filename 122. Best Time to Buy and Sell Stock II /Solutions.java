public class Solutions{
    public static void main(String[] args) {
        int[] nums1 = {7,1,5,3,6,4};
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = {7,6,4,3,1};
        System.out.println(maxProfit(nums3));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        for(int j = 1; j < prices.length; j++){
            if(prices[j] - prices[i] > 0 ){
                maxProfit += prices[j] - prices[i];
                i++;
            }else{
                i++;
            }
        }

        return maxProfit;
    }
}
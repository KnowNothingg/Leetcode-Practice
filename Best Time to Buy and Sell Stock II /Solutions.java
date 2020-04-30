class Solutions{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        for(int j = 1; j < prices.length; j++){
            if(prices[j] - prices[i] > 0 ){
                maxProfit += prices[j] - prices[i];
            }
            i++;
        }

        return maxProfit;
    }


}

class Solutions{
    /**
     * 
     * Get the max Sum of a subarray
     *         int maxProfit = 0;
        int maxRN = prices[0];
        for(int i = 1; i < prices.length; i++){
            maxRN = Math.max(prices[i - 1], maxRN + prices[i-1]);
            maxProfit = Math.max(maxRN, maxProfit);
        }
     * @param args
     */
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int maxRN = 0;
        for(int i = 1; i < prices.length; i++){
            maxRN += prices[i] - prices[i-1];
            maxRN = Math.max(0, maxRN);
            maxProfit = Math.max(maxRN, maxProfit);
        }

        return maxProfit;
    }
}
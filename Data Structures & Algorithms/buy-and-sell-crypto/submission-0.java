class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int val = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(val > prices[i]) {
                val = prices[i];
            }
            profit = Math.max(profit, Math.abs(val - prices[i]));
        }
        return profit;
    }
}

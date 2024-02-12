class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buyIdx = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[buyIdx]) {
                buyIdx = i;
            } else {
                result = Math.max(result, prices[i] - prices[buyIdx]);
            }
        }
        
        return result;
    }
}
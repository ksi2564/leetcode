class Solution {
    public int maxProfit(int[] prices) {
        int min = 100000;
        int result = 0;
        
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int temp = prices[i] - min;
            result = Math.max(result, temp);
        }
        
        return result;
    }
}
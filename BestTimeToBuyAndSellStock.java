class Solution {
    public int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Buy at the lowest price so far
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Sell at current price
            }
        }

        return maxProfit;
    }
}  
    

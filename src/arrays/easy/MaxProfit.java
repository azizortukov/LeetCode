package arrays.easy;

public class MaxProfit {

    /**
     121. Best Time to Buy and Sell Stock
     <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">LeetCode description</a>
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

}

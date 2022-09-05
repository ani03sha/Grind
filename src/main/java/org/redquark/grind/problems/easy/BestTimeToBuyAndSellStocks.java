package org.redquark.grind.problems.easy;

public class BestTimeToBuyAndSellStocks {

    /**
     * Time complexity - O(n ^ 2)
     * Space complexity - O(1)
     */
    public int maxProfitBruteForce(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Variable to store the maximum profit
        int maxProfit = 0;
        // length of the array
        int n = prices.length;
        // Loop through the array and check for every combination
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int maxProfitOptimal(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Variables to store the minimum price and
        // maximum profit calculated so far.
        int minimumPrice = prices[0];
        int maximumProfit = Integer.MIN_VALUE;
        // Loop through the array
        for (int price : prices) {
            minimumPrice = Math.min(minimumPrice, price);
            maximumProfit = Math.max(maximumProfit, price - minimumPrice);
        }
        return maximumProfit;
    }
}

package leetcode.买卖股票的最佳时机II;

public class Solution {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        int sum = 0;
        for (int i = 0; i < prices.length - 1 ; i++) {
            if (prices[i] < prices[i+1]) {
                sum += prices[i+1] - prices[i];
            }
        }
        return sum;
    }
}
